package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;

public class LightweightMessageFormatterTest {
    @Test
    public void testFormatLineReturnsTheSameLine() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        assertEquals("abc", formatter.formatLine("abc", 7));
    }

    @Test
    public void testFormatLineReturnsNull() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        assertEquals(null, formatter.formatLine(null, 1));
    }

    @Test
    public void testFormatLineWithEmptyLine() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        assertEquals("", formatter.formatLine("", 0));
    }

    @Test
    public void testFormatRegionNull() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        assertEquals(null, formatter.formatRegion(null));
    }

    @Test
    public void testFormatRegionEmptySource() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            public String getSourceExcerpt() { return ""; }
            public int getBeginningLineNumber() { return 1; }
            public int getEndingLineNumber() { return 1; }
        };
        assertEquals(null, formatter.formatRegion(region));
    }

    @Test
    public void testFormatRegionSingleLine() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            public String getSourceExcerpt() { return "x"; }
            public int getBeginningLineNumber() { return 3; }
            public int getEndingLineNumber() { return 3; }
        };
        assertEquals("  3| x", formatter.formatRegion(region));
    }

    @Test
    public void testFormatRegionTwoLinesAndPadding() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            public String getSourceExcerpt() { return "a\nb"; }
            public int getBeginningLineNumber() { return 9; }
            public int getEndingLineNumber() { return 10; }
        };
        assertEquals("   9| a\n  10| b", formatter.formatRegion(region));
    }

    @Test
    public void testFormatRegionTrailingNewline() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            public String getSourceExcerpt() { return "a\n"; }
            public int getBeginningLineNumber() { return 1; }
            public int getEndingLineNumber() { return 1; }
        };
        assertEquals("  1| a", formatter.formatRegion(region));
    }

    @Test
    public void testFormatRegionLineNumberWidthBoundary() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter =
                new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            public String getSourceExcerpt() { return "a\nb"; }
            public int getBeginningLineNumber() { return 9; }
            public int getEndingLineNumber() { return 10; }
        };
        assertEquals("   9| a\n  10| b", formatter.formatRegion(region));
    }

    @Test
    public void testFormatErrorWithoutSourceName() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make(type);
        assertEquals("ERROR - message\n", formatter.formatError(error));
    }

    @Test
    public void testFormatWarningWithoutSourceName() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError warning = JSError.make(type);
        assertEquals("WARNING - message\n", formatter.formatWarning(warning));
    }

    @Test
    public void testFormatErrorIncludesSourceLocation() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 2, 0, type);
        assertEquals("a.js:2: ERROR - message\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorDoesNotIncludeNonpositiveLineNumber() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 0, 0, type);
        assertEquals("a.js: ERROR - message\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorUsesSourceLineAndCaret() throws Exception {
        SourceExcerptProvider source = new SourceExcerptProvider() {
            public String getSourceLine(String name, int line) { return "abc"; }
            public Region getSourceRegion(String name, int line) { return null; }
        };
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(source);
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 1, 1, type);
        assertEquals("a.js:1: ERROR - message\nabc\n ^\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorCaretAtEndOfLine() throws Exception {
        SourceExcerptProvider source = new SourceExcerptProvider() {
            public String getSourceLine(String name, int line) { return "ab"; }
            public Region getSourceRegion(String name, int line) { return null; }
        };
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(source);
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 1, 2, type);
        assertEquals("a.js:1: ERROR - message\nab\n  ^\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorOmitsCaretForCharnoPastLine() throws Exception {
        SourceExcerptProvider source = new SourceExcerptProvider() {
            public String getSourceLine(String name, int line) { return "ab"; }
            public Region getSourceRegion(String name, int line) { return null; }
        };
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(source);
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 1, 3, type);
        assertEquals("a.js:1: ERROR - message\nab\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorPreservesWhitespaceInCaretPadding() throws Exception {
        SourceExcerptProvider source = new SourceExcerptProvider() {
            public String getSourceLine(String name, int line) { return " a"; }
            public Region getSourceRegion(String name, int line) { return null; }
        };
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(source);
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 1, 2, type);
        assertEquals("a.js:1: ERROR - message\n a\n  ^\n", formatter.formatError(error));
    }

    @Test
    public void testFormatErrorNegativeCharnoOmitsCaret() throws Exception {
        SourceExcerptProvider source = new SourceExcerptProvider() {
            public String getSourceLine(String name, int line) { return "a"; }
            public Region getSourceRegion(String name, int line) { return null; }
        };
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(source);
        DiagnosticType type = DiagnosticType.warning("T", "message");
        JSError error = JSError.make("a.js", 1, -1, type);
        assertEquals("a.js:1: ERROR - message\na\n", formatter.formatError(error));
    }
}
