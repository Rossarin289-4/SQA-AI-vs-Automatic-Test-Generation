package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.charset.Charset;

public class SourceFileTest {
    @Test
    public void testNameAndStringRepresentation() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "x");
        assertEquals("unit.js", source.getName());
        assertEquals("unit.js", source.toString());
    }

    @Test
    public void testCodeFactoryAndReader() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "abc");
        assertEquals("abc", source.getCode());
        Reader reader = source.getCodeReader();
        assertEquals('a', reader.read());
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testOriginalPathDefaultsToName() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "x");
        assertEquals("unit.js", source.getOriginalPath());
    }

    @Test
    public void testOriginalPathCanBeSet() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "x");
        source.setOriginalPath("origin.js");
        assertEquals("origin.js", source.getOriginalPath());
    }

    @Test
    public void testOriginalPathCanBeResetToName() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "x");
        source.setOriginalPath("origin.js");
        source.setOriginalPath(null);
        assertEquals("unit.js", source.getOriginalPath());
    }

    @Test
    public void testExternDefaultsToFalse() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "x");
        assertFalse(source.isExtern());
    }

    @Test
    public void testGetLineOffsetForLines() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "ab\ncde\nf");
        assertEquals(0, source.getLineOffset(1));
        assertEquals(3, source.getLineOffset(2));
        assertEquals(7, source.getLineOffset(3));
    }

    @Test
    public void testGetLineOffsetRejectsZero() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "a");
        try {
            source.getLineOffset(0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetLineOffsetRejectsFirstPastEnd() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "a\nb");
        try {
            source.getLineOffset(3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetLineForFirstMiddleAndLastLines() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "one\ntwo\nthree");
        assertEquals("one", source.getLine(1));
        assertEquals("two", source.getLine(2));
        assertEquals("three", source.getLine(3));
    }

    @Test
    public void testGetLineForTrailingNewline() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "one\n");
        assertEquals("one", source.getLine(1));
        assertNull(source.getLine(2));
    }

    @Test
    public void testGetLineForMissingLine() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "one\ntwo");
        assertNull(source.getLine(3));
    }

    @Test
    public void testGetLineLookupCanMoveBackwards() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "one\ntwo\nthree");
        assertEquals("three", source.getLine(3));
        assertEquals("one", source.getLine(1));
    }

    @Test
    public void testRegionCenteredAndTruncatedAtEnd() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "a\nb\nc\nd\ne\nf\ng");
        Region region = source.getRegion(4);
        assertEquals(2, region.getBeginningLineNumber());
        assertEquals(8, region.getEndingLineNumber());
        assertEquals("b\nc\nd\ne\nf\ng", region.getSourceExcerpt());
    }

    @Test
    public void testRegionAtBeginning() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "a\nb\nc\nd\ne\nf");
        Region region = source.getRegion(1);
        assertEquals(1, region.getBeginningLineNumber());
        assertEquals(7, region.getEndingLineNumber());
        assertEquals("a\nb\nc\nd\ne\nf", region.getSourceExcerpt());
    }

    @Test
    public void testRegionDoesNotExistPastAvailableLines() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "a\nb");
        assertNull(source.getRegion(3));
    }

    @Test
    public void testReaderFactory() throws Exception {
        SourceFile source = SourceFile.fromReader("unit.js", new StringReader("read"));
        assertEquals("read", source.getCode());
    }

    @Test
    public void testInputStreamFactoryReadsUtf8() throws Exception {
        byte[] bytes = "café".getBytes(Charsets.UTF_8);
        SourceFile source = SourceFile.fromInputStream("unit.js",
                new java.io.ByteArrayInputStream(bytes));
        assertEquals("café", source.getCode());
    }

    @Test
    public void testGeneratorProvidesCode() throws Exception {
        SourceFile source = SourceFile.fromGenerator("unit.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                return "generated";
            }
        });
        assertEquals("generated", source.getCode());
    }

    @Test
    public void testGeneratorCodeIsCachedAndClearRegenerates() throws Exception {
        final int[] calls = {0};
        SourceFile source = SourceFile.fromGenerator("unit.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                calls[0]++;
                return "v" + calls[0];
            }
        });
        assertEquals("v1", source.getCode());
        assertEquals("v1", source.getCode());
        assertEquals(1, calls[0]);
        source.clearCachedSource();
        assertEquals("v2", source.getCode());
        assertEquals(2, calls[0]);
    }

    @Test
    public void testClearCachedSourcePreservesPreloadedCode() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "stable");
        source.clearCachedSource();
        assertEquals("stable", source.getCode());
    }

    @Test
    public void testFromCodeWithExplicitOriginalPath() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "origin.js", "x");
        assertEquals("unit.js", source.getName());
        assertEquals("origin.js", source.getOriginalPath());
        assertEquals("x", source.getCode());
    }

    @Test
    public void testConstructionRejectsEmptyName() throws Exception {
        try {
            SourceFile.fromCode("", "x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetCodeReaderAtEnd() throws Exception {
        SourceFile source = SourceFile.fromCode("unit.js", "");
        Reader reader = source.getCodeReader();
        assertEquals(-1, reader.read());
    }
}
