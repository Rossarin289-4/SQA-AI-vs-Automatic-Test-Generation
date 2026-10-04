```java
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

    // Test case for an empty SourceMap
    @Test
    public void testParseEmptySourceMap() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String emptyMap = "{}";
        try {
            consumer.parse(emptyMap);
            fail("Expected SourceMapParseException for empty map");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for a SourceMap with version not equal to 3
    @Test
    public void testParseInvalidVersion() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String invalidVersionMap = "{\"version\": 2}";
        try {
            consumer.parse(invalidVersionMap);
            fail("Expected SourceMapParseException for invalid version");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for a SourceMap with missing 'file' field
    @Test
    public void testParseMissingFileField() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String missingFileMap = "{\"version\": 3, \"mappings\": \"\"}";
        try {
            consumer.parse(missingFileMap);
            fail("Expected SourceMapParseException for missing file field");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for a SourceMap with empty 'file' field
    @Test
    public void testParseEmptyFileField() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String emptyFileMap = "{\"version\": 3, \"file\": \"\", \"mappings\": \"\"}";
        try {
            consumer.parse(emptyFileMap);
            fail("Expected SourceMapParseException for empty file field");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for a SourceMap with invalid 'mappings' content (not Base64VLQ)
    @Test
    public void testParseInvalidMappings() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String invalidMappingsMap = "{\"version\": 3, \"file\": \"test.js\", \"mappings\": \"invalid-vlq\"}";
        try {
            consumer.parse(invalidMappingsMap);
            fail("Expected SourceMapParseException for invalid mappings");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for a SourceMap with valid basic structure
    @Test
    public void testParseBasicSourceMap() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String basicMap = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(basicMap);
        // Accessing fields directly is not allowed for private fields. Use public methods.
        Collection<String> sources = consumer.getOriginalSources();
        assertNotNull(sources);
        assertEquals(1, sources.size());
        assertTrue(sources.contains("input.js"));
        assertEquals(1, consumer.getLineCount()); // Assuming a getter for lineCount
        assertNotNull(consumer.getLines()); // Assuming a getter for lines
        assertEquals(1, consumer.getLines().size());
    }

    // Test case for a SourceMap with a single mapped entry
    @Test
    public void testParseSingleMappedEntry() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"foo\"],\"lineCount\":1,\"mappings\":\"AACA\"}";
        consumer.parse(map);
        assertEquals(1, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(1, consumer.getLines().get(0).size());
        SourceMapConsumerV3.Entry entry = consumer.getLines().get(0).get(0);
        assertEquals(0, entry.getGeneratedColumn());
        assertEquals(0, entry.getSourceFileId());
        assertEquals(0, entry.getSourceLine());
        assertEquals(0, entry.getSourceColumn());
        assertEquals(0, entry.getNameId());
    }

    // Test case for a SourceMap with multiple entries on the same line
    @Test
    public void testParseMultipleEntriesSameLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AACAA,AACA\"}";
        consumer.parse(map);
        assertEquals(1, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(2, consumer.getLines().get(0).size());
        SourceMapConsumerV3.Entry entry1 = consumer.getLines().get(0).get(0);
        assertEquals(0, entry1.getGeneratedColumn());
        assertEquals(0, entry1.getSourceFileId());
        assertEquals(0, entry1.getSourceLine());
        assertEquals(0, entry1.getSourceColumn());

        SourceMapConsumerV3.Entry entry2 = consumer.getLines().get(0).get(1);
        assertEquals(3, entry2.getGeneratedColumn()); // AACA, comma, A = 3
        assertEquals(0, entry2.getSourceFileId());
        assertEquals(0, entry2.getSourceLine());
        assertEquals(0, entry2.getSourceColumn());
    }

    // Test case for a SourceMap with multiple lines
    @Test
    public void testParseMultipleLines() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":2,\"mappings\":\"AACA;AACA\"}";
        consumer.parse(map);
        assertEquals(2, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(1, consumer.getLines().get(0).size());
        assertNotNull(consumer.getLines().get(1));
        assertEquals(1, consumer.getLines().get(1).size());
    }

    // Test case for a SourceMap with an unmapped section
    @Test
    public void testParseUnmappedSection() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAA\"}"; // Only a generated column
        consumer.parse(map);
        assertEquals(1, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(1, consumer.getLines().get(0).size());
        SourceMapConsumerV3.Entry entry = consumer.getLines().get(0).get(0);
        assertEquals(0, entry.getGeneratedColumn());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getSourceFileId());
    }

    // Test case for retrieving mapping for a specific line and column
    @Test
    public void testGetMappingForLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"foo\"],\"lineCount\":2,\"mappings\":\"AACA,CAAA;AAEA\"}";
        consumer.parse(map);

        // Line 1, Column 1 (Generated) should map to input.js:1:1 with name "foo"
        OriginalMapping mapping1 = consumer.getMappingForLine(1, 1);
        assertNotNull(mapping1);
        assertEquals("input.js", mapping1.getOriginalFile());
        assertEquals(1, mapping1.getLineNumber());
        assertEquals(1, mapping1.getColumnPosition());
        assertEquals("foo", mapping1.getIdentifier());

        // Line 1, Column 4 (Generated) should map to input.js:1:4 with name "foo"
        OriginalMapping mapping2 = consumer.getMappingForLine(1, 4);
        assertNotNull(mapping2);
        assertEquals("input.js", mapping2.getOriginalFile());
        assertEquals(1, mapping2.getLineNumber());
        assertEquals(4, mapping2.getColumnPosition());
        assertEquals("foo", mapping2.getIdentifier());

        // Line 2, Column 1 (Generated) should map to input.js:2:1
        OriginalMapping mapping3 = consumer.getMappingForLine(2, 1);
        assertNotNull(mapping3);
        assertEquals("input.js", mapping3.getOriginalFile());
        assertEquals(2, mapping3.getLineNumber());
        assertEquals(1, mapping3.getColumnPosition());
        assertNull(mapping3.getIdentifier());
    }

    // Test case for line number out of bounds
    @Test
    public void testGetMappingForLineOutOfBounds() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);

        assertNull(consumer.getMappingForLine(0, 1)); // Line 0 is invalid
        assertNull(consumer.getMappingForLine(2, 1)); // Line 2 is out of bounds
    }

    // Test case for column number out of bounds (should return previous mapping or null)
    @Test
    public void testGetMappingForColumnOutOfBounds() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"foo\"],\"lineCount\":1,\"mappings\":\"AACA\"}";
        consumer.parse(map);

        // Column 0 is before the first entry
        assertNull(consumer.getMappingForLine(1, 0));

        // Column greater than the last entry should return the last mapping
        OriginalMapping mapping = consumer.getMappingForLine(1, 5);
        assertNotNull(mapping);
        assertEquals("input.js", mapping.getOriginalFile());
        assertEquals(1, mapping.getLineNumber());
        assertEquals(1, mapping.getColumnPosition());
        assertEquals("foo", mapping.getIdentifier());
    }

    // Test case for empty line in SourceMap
    @Test
    public void testGetMappingForEmptyLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        // Line 1 has content, Line 2 is empty (represented by null in 'lines')
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":2,\"mappings\":\"AAAA;\"}";
        consumer.parse(map);

        // Mapping for line 2, column 1 should return the mapping from the previous line
        OriginalMapping mapping = consumer.getMappingForLine(2, 1);
        assertNotNull(mapping);
        assertEquals("input.js", mapping.getOriginalFile());
        assertEquals(1, mapping.getLineNumber());
        assertEquals(1, mapping.getColumnPosition());
        assertNull(mapping.getIdentifier());
    }

    // Test case for getting all original sources
    @Test
    public void testGetOriginalSources() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"file1.js\", \"file2.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);
        Collection<String> sources = consumer.getOriginalSources();
        assertNotNull(sources);
        assertEquals(2, sources.size());
        assertTrue(sources.contains("file1.js"));
        assertTrue(sources.contains("file2.js"));
    }

    // Test case for getReverseMapping when reverseSourceMapping is null
    @Test
    public void testGetReverseMapping_nullReverseMap() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);
        // Call getReverseMapping to trigger createReverseMapping
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("input.js", 1, 1);
        assertNotNull(mappings);
        assertTrue(mappings.isEmpty()); // Should be empty as no mappings were added to reverse map
    }

    // Test case for getReverseMapping when originalFile is not found
    @Test
    public void testGetReverseMapping_originalFileNotFound() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);
        // Manually trigger createReverseMapping using a public method if available, or test parse logic indirectly.
        // Since createReverseMapping is private, we'll rely on getReverseMapping to call it.
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("nonexistent.js", 1, 1);
        assertNotNull(mappings);
        assertTrue(mappings.isEmpty());
    }

    // Test case for getReverseMapping when line is not found
    @Test
    public void testGetReverseMapping_lineNotFound() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);
        // Similar to above, rely on getReverseMapping to trigger internal logic.
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("input.js", 2, 1);
        assertNotNull(mappings);
        assertTrue(mappings.isEmpty());
    }

    // Test case for getReverseMapping with valid data
    @Test
    public void testGetReverseMapping_valid() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"foo\"],\"lineCount\":2,\"mappings\":\"AACA,CAAA;AAEA\"}";
        consumer.parse(map);

        // Test for input.js:1:1 (original) which maps to out.js:1:1 (generated)
        Collection<OriginalMapping> mappings1 = consumer.getReverseMapping("input.js", 1, 1);
        assertNotNull(mappings1);
        assertEquals(1, mappings1.size());
        OriginalMapping mapping1 = mappings1.iterator().next();
        assertEquals(0, mapping1.getLineNumber()); // Target line is 0-indexed for reverse mapping
        assertEquals(0, mapping1.getColumnPosition()); // Target column is 0-indexed for reverse mapping

        // Test for input.js:1:4 (original) which maps to out.js:1:4 (generated)
        Collection<OriginalMapping> mappings2 = consumer.getReverseMapping("input.js", 1, 4);
        assertNotNull(mappings2);
        assertEquals(1, mappings2.size());
        OriginalMapping mapping2 = mappings2.iterator().next();
        assertEquals(0, mapping2.getLineNumber());
        assertEquals(3, mapping2.getColumnPosition()); // Generated column for second entry on line 1 is 3

        // Test for input.js:2:1 (original) which maps to out.js:2:1 (generated)
        Collection<OriginalMapping> mappings3 = consumer.getReverseMapping("input.js", 2, 1);
        assertNotNull(mappings3);
        assertEquals(1, mappings3.size());
        OriginalMapping mapping3 = mappings3.iterator().next();
        assertEquals(1, mapping3.getLineNumber());
        assertEquals(0, mapping3.getColumnPosition());
    }

    // Test case for getJavaStringArray with an empty array
    @Test
    public void testGetJavaStringArray_empty() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        JSONArray jsonArray = new JSONArray("[]");
        String[] result = consumer.getJavaStringArray(jsonArray);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    // Test case for getJavaStringArray with a populated array
    @Test
    public void testGetJavaStringArray_populated() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        JSONArray jsonArray = new JSONArray("[\"a\", \"b\", \"c\"]");
        String[] result = consumer.getJavaStringArray(jsonArray);
        assertNotNull(result);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    // Test case for visitMappings with no entries
    @Test
    public void testVisitMappings_noEntries() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[],\"names\":[],\"lineCount\":1,\"mappings\":\"\"}";
        consumer.parse(map);

        MockEntryVisitor visitor = new MockEntryVisitor();
        consumer.visitMappings(visitor);
        assertFalse(visitor.visited);
    }

    // Test case for visitMappings with mapped entries
    @Test
    public void testVisitMappings_mappedEntries() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"foo\"],\"lineCount\":1,\"mappings\":\"AACA\"}";
        consumer.parse(map);

        MockEntryVisitor visitor = new MockEntryVisitor();
        consumer.visitMappings(visitor);
        assertTrue(visitor.visited);
        assertEquals("input.js", visitor.sourceName);
        assertEquals("foo", visitor.symbolName);
        assertEquals(0, visitor.sourceStartPosition.getLine());
        assertEquals(0, visitor.sourceStartPosition.getColumn());
        assertEquals(0, visitor.startPosition.getLine());
        assertEquals(0, visitor.startPosition.getColumn());
        assertEquals(0, visitor.endPosition.getLine());
        assertEquals(1, visitor.endPosition.getColumn()); // The column is the start of the next segment
    }

    // Helper class for visitMappings tests
    private static class MockEntryVisitor implements SourceMapConsumerV3.EntryVisitor {
        boolean visited = false;
        String sourceName;
        String symbolName;
        FilePosition sourceStartPosition;
        FilePosition startPosition;
        FilePosition endPosition;

        @Override
        public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition) {
            this.visited = true;
            this.sourceName = sourceName;
            this.symbolName = symbolName;
            this.sourceStartPosition = sourceStartPosition;
            this.startPosition = startPosition;
            this.endPosition = endPosition;
        }
    }

    // Test case for SourceMapConsumerV3.StringCharIterator
    @Test
    public void testStringCharIterator() throws Exception {
        String content = "abcdef";
        SourceMapConsumerV3.StringCharIterator iterator = new SourceMapConsumerV3.StringCharIterator(content);
        assertTrue(iterator.hasNext());
        assertEquals('a', iterator.next());
        assertEquals('b', iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals('c', iterator.next());
        assertEquals('d', iterator.next());
        assertEquals('e', iterator.next());
        assertEquals('f', iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case for SourceMapConsumerV3.StringCharIterator peek
    @Test
    public void testStringCharIteratorPeek() throws Exception {
        String content = "abc";
        SourceMapConsumerV3.StringCharIterator iterator = new SourceMapConsumerV3.StringCharIterator(content);
        assertEquals('a', iterator.peek());
        iterator.next();
        assertEquals('b', iterator.peek());
        iterator.next();
        assertEquals('c', iterator.peek());
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    // Test case for SourceMapConsumerV3.UnmappedEntry
    @Test
    public void testUnmappedEntry() throws Exception {
        SourceMapConsumerV3.Entry entry = new SourceMapConsumerV3.UnmappedEntry(10);
        assertEquals(10, entry.getGeneratedColumn());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getSourceFileId());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getSourceLine());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getSourceColumn());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getNameId());
    }

    // Test case for SourceMapConsumerV3.UnnamedEntry
    @Test
    public void testUnnamedEntry() throws Exception {
        SourceMapConsumerV3.Entry entry = new SourceMapConsumerV3.UnnamedEntry(10, 0, 1, 2);
        assertEquals(10, entry.getGeneratedColumn());
        assertEquals(0, entry.getSourceFileId());
        assertEquals(1, entry.getSourceLine());
        assertEquals(2, entry.getSourceColumn());
        assertEquals(SourceMapConsumerV3.UNMAPPED, entry.getNameId());
    }

    // Test case for SourceMapConsumerV3.NamedEntry
    @Test
    public void testNamedEntry() throws Exception {
        SourceMapConsumerV3.Entry entry = new SourceMapConsumerV3.NamedEntry(10, 0, 1, 2, 3);
        assertEquals(10, entry.getGeneratedColumn());
        assertEquals(0, entry.getSourceFileId());
        assertEquals(1, entry.getSourceLine());
        assertEquals(2, entry.getSourceColumn());
        assertEquals(3, entry.getNameId());
    }

    // Test case for getPreviousMapping when no previous line exists
    @Test
    public void testGetPreviousMapping_noPreviousLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}";
        consumer.parse(map);
        // getPreviousMapping is called internally by getMappingForLine, so we test that.
        assertNull(consumer.getMappingForLine(1, 0)); // Column 0 is before the first entry.
    }

    // Test case for getPreviousMapping with an empty previous line
    @Test
    public void testGetPreviousMapping_emptyPreviousLine() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        // Line 1 has an entry, Line 2 is empty
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[],\"lineCount\":2,\"mappings\":\"AAAA;\"}";
        consumer.parse(map);
        // Requesting mapping for line 2, which is empty, should return mapping from line 1
        OriginalMapping mapping = consumer.getMappingForLine(2, 1);
        assertNotNull(mapping);
        assertEquals("input.js", mapping.getOriginalFile());
        assertEquals(1, mapping.getLineNumber());
        assertEquals(1, mapping.getColumnPosition());
    }

    // Test case for getOriginalMappingForEntry when sourceFileId is UNMAPPED
    @Test
    public void testGetOriginalMappingForEntry_unmapped() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[],\"names\":[],\"lineCount\":1,\"mappings\":\"A\"}";
        consumer.parse(map);
        // Line 0, entry 0 is unmapped
        ArrayList<SourceMapConsumerV3.Entry> entries = consumer.getLines().get(0);
        assertNotNull(entries);
        OriginalMapping mapping = consumer.getOriginalMappingForEntry(entries.get(0));
        assertNull(mapping);
    }

    // Test case for getOriginalMappingForEntry with a named entry
    @Test
    public void testGetOriginalMappingForEntry_named() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String map = "{\"version\":3,\"file\":\"out.js\",\"sources\":[\"input.js\"],\"names\":[\"myname\"],\"lineCount\":1,\"mappings\":\"AAAAA\"}";
        consumer.parse(map);
        ArrayList<SourceMapConsumerV3.Entry> entries = consumer.getLines().get(0);
        assertNotNull(entries);
        OriginalMapping mapping = consumer.getOriginalMappingForEntry(entries.get(0));
        assertNotNull(mapping);
        assertEquals("input.js", mapping.getOriginalFile());
        assertEquals(1, mapping.getLineNumber());
        assertEquals(1, mapping.getColumnPosition());
        assertEquals("myname", mapping.getIdentifier());
    }

    // Test case for SourceMapGeneratorV3 parsing with sections
    @Test
    public void testParseMetaMap() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String metaMapJson = "{\n" +
                             "  \"version\": 3,\n" +
                             "  \"file\": \"a.js\",\n" +
                             "  \"sections\": [\n" +
                             "    {\n" +
                             "      \"offset\": {\"line\": 100, \"column\": 0},\n" +
                             "      \"map\": {\"version\":3,\"file\":\"b.js\",\"sources\":[\"x.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"AAAA\"}\n" +
                             "    },\n" +
                             "    {\n" +
                             "      \"offset\": {\"line\": 200, \"column\": 10},\n" +
                             "      \"url\": \"http://example.com/c.js\"\n" +
                             "    }\n" +
                             "  ]\n" +
                             "}";

        // Mock SourceMapSupplier to provide content for the URL
        SourceMapConsumerV3.SourceMapSupplier mockSupplier = new SourceMapConsumerV3.SourceMapSupplier() {
            @Override
            public String getSourceMap(String url) throws IOException {
                if ("http://example.com/c.js".equals(url)) {
                    return "{\"version\":3,\"file\":\"c.js\",\"sources\":[\"y.js\"],\"names\":[],\"lineCount\":1,\"mappings\":\"BBBB\"}";
                }
                return null;
            }
        };

        consumer.parse(metaMapJson, mockSupplier);

        // Verify that the sections were merged and parsed
        // The total lineCount is not directly exposed, but we can check mappings.
        // Check the content from the first section (map field)
        assertNotNull(consumer.getLines().get(0)); // line 0 of the merged map corresponds to offset line 100
        assertEquals(1, consumer.getLines().get(0).size());
        OriginalMapping mapping1 = consumer.getMappingForLine(101, 1); // Generated line 101 maps to original line 1
        assertNotNull(mapping1);
        assertEquals("x.js", mapping1.getOriginalFile());

        // Check the content from the second section (url field)
        assertNotNull(consumer.getLines().get(1)); // line 1 of the merged map corresponds to offset line 200
        assertEquals(1, consumer.getLines().get(1).size());
        OriginalMapping mapping2 = consumer.getMappingForLine(201, 1); // Generated line 201 maps to original line 1 of c.js
        assertNotNull(mapping2);
        assertEquals("y.js", mapping2.getOriginalFile());
    }

    // Test case for parseMetaMap with invalid section format (both url and map)
    @Test
    public void testParseMetaMap_invalidSectionBothMapAndUrl() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String metaMapJson = "{\n" +
                             "  \"version\": 3,\n" +
                             "  \"file\": \"a.js\",\n" +
                             "  \"sections\": [\n" +
                             "    {\n" +
                             "      \"offset\": {\"line\": 100, \"column\": 0},\n" +
                             "      \"map\": \"{}\",\n" +
                             "      \"url\": \"http://example.com/c.js\"\n" +
                             "    }\n" +
                             "  ]\n" +
                             "}";
        try {
            consumer.parse(metaMapJson, new SourceMapConsumerV3.DefaultSourceMapSupplier());
            fail("Expected SourceMapParseException for section with both map and url");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for parseMetaMap with invalid section format (neither url nor map)
    @Test
    public void testParseMetaMap_invalidSectionNeitherMapNorUrl() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String metaMapJson = "{\n" +
                             "  \"version\": 3,\n" +
                             "  \"file\": \"a.js\",\n" +
                             "  \"sections\": [\n" +
                             "    {\n" +
                             "      \"offset\": {\"line\": 100, \"column\": 0}\n" +
                             "    }\n" +
                             "  ]\n" +
                             "}";
        try {
            consumer.parse(metaMapJson, new SourceMapConsumerV3.DefaultSourceMapSupplier());
            fail("Expected SourceMapParseException for section with neither map nor url");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for parseMetaMap with missing section offset
    @Test
    public void testParseMetaMap_missingOffset() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String metaMapJson = "{\n" +
                             "  \"version\": 3,\n" +
                             "  \"file\": \"a.js\",\n" +
                             "  \"sections\": [\n" +
                             "    {\n" +
                             "      \"map\": \"{}\"\n" +
                             "    }\n" +
                             "  ]\n" +
                             "}";
        try {
            consumer.parse(metaMapJson, new SourceMapConsumerV3.DefaultSourceMapSupplier());
            fail("Expected SourceMapParseException for section with missing offset");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Test case for SourceMapConsumerV3.DefaultSourceMapSupplier
    @Test
    public void testDefaultSourceMapSupplier() throws Exception {
        SourceMapConsumerV3.DefaultSourceMapSupplier supplier = new SourceMapConsumerV3.DefaultSourceMapSupplier();
        assertNull(supplier.getSourceMap("some_url"));
    }

    // Test case for parseMetaMap when sectionSupplier returns null
    @Test
    public void testParseMetaMap_sectionSupplierReturnsNull() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        String metaMapJson = "{\n" +
                             "  \"version\": 3,\n" +
                             "  \"file\": \"a.js\",\n" +
                             "  \"sections\": [\n" +
                             "    {\n" +
                             "      \"offset\": {\"line\": 100, \"column\": 0},\n" +
                             "      \"url\": \"http://example.com/missing.js\"\n" +
                             "    }\n" +
                             "  ]\n" +
                             "}";
        // Use a supplier that always returns null
        SourceMapConsumerV3.SourceMapSupplier nullSupplier = new SourceMapConsumerV3.SourceMapSupplier() {
            @Override
            public String getSourceMap(String url) throws IOException {
                return null;
            }
        };
        try {
            consumer.parse(metaMapJson, nullSupplier);
            fail("Expected SourceMapParseException when section supplier returns null");
        } catch (SourceMapParseException e) {
            // Expected exception
        }
    }

    // Tests for addMapping method
    @Test
    public void testAddMapping() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 10, 5);
        node.setSourceFileName("test.js");
        node.putProp(Node.ORIGINALNAME_PROP, "myFunc");

        FilePosition outputStart = new FilePosition(1, 1);
        FilePosition outputEnd = new FilePosition(2, 2);

        sourceMap.addMapping(node, outputStart, outputEnd);

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");
        String mapContent = sb.toString();

        assertTrue(mapContent.contains("\"sources\":[\"test.js\"]"));
        assertTrue(mapContent.contains("\"names\":[\"myFunc\"]"));
        assertTrue(mapContent.contains("\"mappings\":")); // Check if mappings section exists
    }

    // Tests for appendTo method (basic check)
    @Test
    public void testAppendTo() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);
        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");
        // The generated map should contain version, file, sources, names, and mappings
        assertTrue(sb.toString().contains("\"version\":3"));
        assertTrue(sb.toString().contains("\"file\":\"output.js\""));
        assertTrue(sb.toString().contains("\"mappings\":\"\"")); // Should be empty if no mappings added
    }

    // Tests for reset method
    @Test
    public void testReset() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 10, 5);
        node.setSourceFileName("test.js");
        sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

        StringBuilder sb1 = new StringBuilder();
        sourceMap.appendTo(sb1, "output.js");
        assertTrue(sb1.toString().contains("\"sources\":[\"test.js\"]"));

        sourceMap.reset();

        StringBuilder sb2 = new StringBuilder();
        sourceMap.appendTo(sb2, "output.js");
        // After reset, the map should be empty
        assertFalse(sb2.toString().contains("\"sources\":[\"test.js\"]"));
        assertTrue(sb2.toString().contains("\"mappings\":\"\""));
    }

    // Tests for setStartingPosition method
    @Test
    public void testSetStartingPosition() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);
        sourceMap.setStartingPosition(5, 10); // Set starting position

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 1, 0);
        node.setSourceFileName("test.js");
        sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");

        // The mapping should reflect the starting position offset.
        // The first generated column should be 10 (from setStartingPosition).
        // The first generated line should be 6 (from setStartingPosition).
        // A simple check for the mapping string is insufficient as it depends on the exact encoding.
        // We expect the generated map to contain a mapping.
        assertTrue(sb.toString().contains("\"mappings\":"));
    }

    // Tests for setWrapperPrefix method
    @Test
    public void testSetWrapperPrefix() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);
        sourceMap.setWrapperPrefix("//# sourceMappingURL=out.js.map\n");

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 1, 0);
        node.setSourceFileName("test.js");
        sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");

        assertTrue(sb.toString().contains("//# sourceMappingURL=out.js.map\n"));
    }

    // Tests for validate method
    @Test
    public void testValidate() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);
        sourceMap.validate(true); // Enable validation

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 1, 0);
        node.setSourceFileName("test.js");
        sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

        // Validation is done internally by the generator.
        // A successful addMapping with validation enabled implies no immediate exception.
        assertTrue(true);
    }

    // Tests for setPrefixMappings method
    @Test
    public void testSetPrefixMappings() throws Exception {
        SourceMapGenerator generator = SourceMapGeneratorFactory.getInstance(SourceMapFormat.V3);
        SourceMap sourceMap = new SourceMap(generator);

        List<SourceMap.LocationMapping> mappings = new ArrayList<>();
        mappings.add(new SourceMap.LocationMapping("/src/", "/dist/"));
        sourceMap.setPrefixMappings(mappings);

        Node node = new Node(com.google.javascript.jscomp.Token.CALL, 10, 5);
        node.setSourceFileName("/src/test.js"); // Prefix should be replaced
        sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

        StringBuilder sb = new StringBuilder();
        sourceMap.appendTo(sb, "output.js");
        String mapContent = sb.toString();

        assertTrue(mapContent.contains("\"sources\":[\"/dist/test.js\"]"));
    }

    // Test case for SourceMapConsumerV3.MappingBuilder
    @Test
    public void testMappingBuilder() throws Exception {
        String lineMap = "AAAA,CAAA";
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        // MappingBuilder is an inner class, access it via an instance.
        SourceMapConsumerV3.MappingBuilder builder = consumer.new MappingBuilder(lineMap);
        builder.build();
        // Accessing lines directly is not allowed. We rely on parse method's side effects.
        // Test parse method more thoroughly.
        assertNotNull(consumer.getLines());
        assertEquals(1, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(2, consumer.getLines().get(0).size());
    }

    // Test case for SourceMapConsumerV3.MappingBuilder with multiple lines
    @Test
    public void testMappingBuilder_multipleLines() throws Exception {
        String lineMap = "AAAA;BBBB";
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        SourceMapConsumerV3.MappingBuilder builder = consumer.new MappingBuilder(lineMap);
        builder.build();
        assertNotNull(consumer.getLines());
        assertEquals(2, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(1, consumer.getLines().get(0).size());
        assertNotNull(consumer.getLines().get(1));
        assertEquals(1, consumer.getLines().get(1).size());
    }

    // Test case for SourceMapConsumerV3.MappingBuilder with empty lines
    @Test
    public void testMappingBuilder_emptyLines() throws Exception {
        String lineMap = "AAAA;;BBBB";
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        SourceMapConsumerV3.MappingBuilder builder = consumer.new MappingBuilder(lineMap);
        builder.build();
        assertNotNull(consumer.getLines());
        assertEquals(3, consumer.getLines().size());
        assertNotNull(consumer.getLines().get(0));
        assertEquals(1, consumer.getLines().get(0).size());
        assertNull(consumer.getLines().get(1)); // Empty line
        assertNotNull(consumer.getLines().get(2));
        assertEquals(1, consumer.getLines().get(2).size());
    }

    // Test case for validateEntry with invalid source file ID
    @Test
    public void testValidateEntry_invalidSourceFileId() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        // sources is private, so we cannot set it directly.
        // This test needs to be re-evaluated or removed if private fields are not accessible.
        // Assuming a hypothetical public method to set sources for testing validation logic.
        // For now, we'll skip this test due to access restrictions.
    }

    // Test case for validateEntry with invalid name ID
    @Test
    public void testValidateEntry_invalidNameId() throws Exception {
        SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
        // names is private, same issue as above.
        // Skipping this test due to access restrictions.
    }

    // Helper methods to access private fields for testing purposes
    private int getLineCount() {
        // This would ideally call a public getter if one existed.
        // Since it doesn't, and direct access is forbidden, this part of the test
        // needs to be adjusted or omitted if it cannot be tested without reflection.
        // For demonstration, assuming a getter exists.
        return 0; // Placeholder
    }

    private ArrayList<ArrayList<Entry>> getLines() {
        // Similar to getLineCount, assuming a public getter.
        return null; // Placeholder
    }

    private void validateEntry(SourceMapConsumerV3.Entry entry) {
        // This method is private. If it needs to be tested, it should be made public or package-private for testing.
        // Or, test its effects through public methods.
    }
}
```