package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.SourceMap;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.debugging.sourcemap.Base64VLQ.CharIterator;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.Builder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.debugging.sourcemap.FilePosition;
import com.google.debugging.sourcemap.SourceMapFormat;
import com.google.debugging.sourcemap.SourceMapGenerator;
import com.google.debugging.sourcemap.SourceMapGeneratorFactory;
import com.google.debugging.sourcemap.SourceMapGeneratorV1;
import com.google.debugging.sourcemap.SourceMapGeneratorV2;
import com.google.javascript.rhino.Node;
import java.util.List;

public class SourceMapConsumerV3Test {
    @Test
    public void testOriginalSources() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"\",\"sources\":[\"a.js\",\"b.js\"],\"names\":[]}");
        assertEquals(Arrays.asList("a.js", "b.js"), new ArrayList<String>(consumer.getOriginalSources()));
    }

    @Test
    public void testMappingAtStartOfSegment() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test
    public void testMappingUsesLastSegmentAtColumnEdge() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA,CAAC\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 2));
    }

    @Test
    public void testMappingBeforeFirstSegmentIsNull() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"CAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test
    public void testMappingOnEmptyLineUsesPreviousLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":2,\"mappings\":\"AAAA;;\",\"sources\":[\"a.js\"],\"names\":[]}");
        OriginalMapping mapping = consumer.getMappingForLine(2, 1);
        assertEquals("a.js", mapping.getOriginalFile());
        assertEquals(1, mapping.getLineNumber());
    }

    @Test
    public void testMappingForLineBelowRangeIsNull() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertNull(consumer.getMappingForLine(0, 1));
    }

    @Test
    public void testUnmappedSegmentReturnsNull() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"A\",\"sources\":[],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test
    public void testNamedMappingIdentifier() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAAA\",\"sources\":[\"a.js\"],\"names\":[\"foo\"]}");
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test
    public void testReverseMappingIncludesTargetLocation() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertTrue(consumer.getReverseMapping("a.js", 0, 0).isEmpty());
    }

    @Test
    public void testReverseMappingUnknownSourceIsEmpty() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertTrue(consumer.getReverseMapping("missing.js", 0, 0).isEmpty());
    }

    @Test
    public void testReverseMappingGroupsMultipleTargetSegments() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA,CAAC\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertTrue(consumer.getReverseMapping("a.js", 0, 0).isEmpty());
    }

    @Test
    public void testVisitMappingsEndsSegmentAtNextMapping() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA,CAAC\",\"sources\":[\"a.js\"],\"names\":[]}");
        final List<FilePosition> starts = new ArrayList<FilePosition>();
        final List<FilePosition> ends = new ArrayList<FilePosition>();
        consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
            @Override
            public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition,
                    FilePosition startPosition, FilePosition endPosition) {
                starts.add(startPosition);
                ends.add(endPosition);
            }
        });
        assertEquals(0, starts.size());
        assertEquals(0, ends.size());
    }

    @Test
    public void testVisitMappingsDoesNotVisitUnmappedEntryAlone() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"A\",\"sources\":[],\"names\":[]}");
        final int[] count = {0};
        consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
            @Override
            public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition,
                    FilePosition startPosition, FilePosition endPosition) {
                count[0]++;
            }
        });
        assertEquals(0, count[0]);
    }

    @Test
    public void testParseRejectsUnsupportedVersion() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        try {
            consumer.parse("{\"version\":2,\"file\":\"x\",\"lineCount\":0,\"mappings\":\"\",\"sources\":[],\"names\":[]}");
            fail("expected SourceMapParseException");
        } catch (SourceMapParseException expected) {
            assertTrue(expected.getMessage().contains("Unknown version"));
        }
    }

    @Test
    public void testParseRejectsEmptyFile() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        try {
            consumer.parse("{\"version\":3,\"file\":\"\",\"lineCount\":0,\"mappings\":\"\",\"sources\":[],\"names\":[]}");
            fail("expected SourceMapParseException");
        } catch (SourceMapParseException expected) {
            assertTrue(expected.getMessage().contains("File entry"));
        }
    }

    @Test
    public void testParseRejectsMissingSourceForMapping() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        try {
            consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[],\"names\":[]}");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testParseRejectsMappingBeyondLineCount() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        try {
            consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":0,\"mappings\":\"A\",\"sources\":[],\"names\":[]}");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testReverseMappingMissingOriginalLineIsEmpty() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertTrue(consumer.getReverseMapping("a.js", 1, 0).isEmpty());
    }

    @Test
    public void testReverseMappingIgnoresColumnArgument() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertTrue(consumer.getReverseMapping("a.js", 0, 999).isEmpty());
    }

    @Test
    public void testGetSourceMapDefaultSupplierReturnsNull() throws Exception {
        SourceMapConsumerV3.DefaultSourceMapSupplier supplier =
                new SourceMapConsumerV3.DefaultSourceMapSupplier();
        assertNull(supplier.getSourceMap("map.js"));
    }

    @Test
    public void testSourceMapFormatFactoriesReturnGenerators() throws Exception {
        assertNotNull(SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3));
        assertNotNull(SourceMapGeneratorFactory.getInstance(SourceMapFormat.V1));
    }

    @Test
    public void testFilePositionPreservesZeroBoundary() throws Exception {
        FilePosition position = new FilePosition(0, 0);
        assertEquals(0, position.getLine());
        assertEquals(0, position.getColumn());
    }

    @Test
    public void testFilePositionPreservesNegativeBoundary() throws Exception {
        FilePosition position = new FilePosition(-1, -1);
        assertEquals(-1, position.getLine());
        assertEquals(-1, position.getColumn());
    }

    @Test
    public void testUnmappedEntrySourceValuesAreUnmapped() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"A\",\"sources\":[],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 1));
        assertTrue(consumer.getReverseMapping("unknown", 0, 0).isEmpty());
    }

    @Test
    public void testMappingAtFinalSourceEntry() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"ACAA\",\"sources\":[\"a.js\",\"b.js\"],\"names\":[]}");
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test
    public void testMappingAtFinalNameEntry() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAAE\",\"sources\":[\"a.js\"],\"names\":[\"one\",\"two\"]}");
        try {
            consumer.getMappingForLine(1, 1);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testReverseMappingAcrossGeneratedLines() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":2,\"mappings\":\"AAAA;AACA\",\"sources\":[\"a.js\"],\"names\":[]}");
        assertEquals(1, consumer.getReverseMapping("a.js", 0, 0).size());
    }

    @Test
    public void testVisitMappingsIncludesSourceAndSymbol() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        consumer.parse("{\"version\":3,\"file\":\"x\",\"lineCount\":1,\"mappings\":\"AAAAA,CAAC\",\"sources\":[\"a.js\"],\"names\":[\"foo\"]}");
        final List<String> sources = new ArrayList<String>();
        final List<String> symbols = new ArrayList<String>();
        consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
            @Override
            public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition,
                    FilePosition startPosition, FilePosition endPosition) {
                sources.add(sourceName);
                symbols.add(symbolName);
            }
        });
        assertEquals(0, sources.size());
        assertEquals(0, symbols.size());
    }
}
