package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.Strings;
import com.google.javascript.rhino.Node;

public class LightweightMessageFormatterTest {

    // Helper to create a dummy SourceExcerptProvider
    private static class DummySourceProvider implements SourceExcerptProvider {
        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return "dummy line content";
        }

        @Override
        public Region getSourceRegion(String sourceName, int lineNumber) {
            return new Region() {
                @Override
                public String getSourceExcerpt() {
                    return "dummy region excerpt";
                }

                @Override
                public int getBeginningLineNumber() {
                    return lineNumber;
                }

                @Override
                public int getEndingLineNumber() {
                    return lineNumber;
                }
            };
        }
    }

    // Helper to create a dummy JSError
    // JSError.make requires a DiagnosticType, which is not available here.
    // We'll use a simplified approach by directly constructing JSError.
    // Note: This is a simplification due to lack of DiagnosticType in the provided API outline.

    // Inner class to simulate DiagnosticType, as it's required by JSError.make and not provided.
    // This is a necessary invention to make JSError.make usable.
    private static class MockDiagnosticType {
        final String key;
        final String defaultMessage;

        MockDiagnosticType(String key, String defaultMessage) {
            this.key = key;
            this.defaultMessage = defaultMessage;
        }

        // Static factory method to mimic a common pattern.
        public static MockDiagnosticType of(String key, String defaultMessage) {
            return new MockDiagnosticType(key, defaultMessage);
        }
    }

    // Re-attempting JSError creation with the invented MockDiagnosticType,
    // and trying to match a JSError.make signature.
    // JSError.make(String sourceName, int lineno, int charno, CheckLevel level, DiagnosticType type, String... arguments);













    @Test
    public void testLineNumberingFormatterHandlesSingleLine() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "int a = 5;"; }
            @Override public int getBeginningLineNumber() { return 100; }
            @Override public int getEndingLineNumber() { return 100; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals("  100| int a = 5;\n", formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesMultipleLines() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "if (true) {\n  return 1;\n}"; }
            @Override public int getBeginningLineNumber() { return 101; }
            @Override public int getEndingLineNumber() { return 103; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals("  101| if (true) {\n  102|   return 1;\n  103| }\n", formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesEmptyRegion() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return ""; }
            @Override public int getBeginningLineNumber() { return 110; }
            @Override public int getEndingLineNumber() { return 110; }
        };
        String formatted = formatter.formatRegion(region);
        assertNull(formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesNullRegion() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        String formatted = formatter.formatRegion(null);
        assertNull(formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesLineNumberPadding() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "line"; }
            @Override public int getBeginningLineNumber() { return 9; } // Needs padding
            @Override public int getEndingLineNumber() { return 9; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals("   9| line\n", formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesLineNumberPaddingForLargerNumbers() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "line"; }
            @Override public int getBeginningLineNumber() { return 10; } // No padding needed
            @Override public int getEndingLineNumber() { return 10; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals("  10| line\n", formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesLineNumberPaddingForVeryLargeNumbers() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "line"; }
            @Override public int getBeginningLineNumber() { return 1000; } // Max length
            @Override public int getEndingLineNumber() { return 1000; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals("1000| line\n", formatted);
    }

    @Test
    public void testLineNumberingFormatterHandlesEmptyLineInRegion() throws Exception {
        LightweightMessageFormatter.LineNumberingFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override public String getSourceExcerpt() { return "line1\n\nline3"; }
            @Override public int getBeginningLineNumber() { return 200; }
            @Override public int getEndingLineNumber() { return 202; }
        };
        String formatted = formatter.formatRegion(region);
        assertEquals(" 200| line1\n 201| \n 202| line3\n", formatted);
    }

    @Test
    public void testGetLevelNameError() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider());
        assertEquals("ERROR", formatter.getLevelName(CheckLevel.ERROR));
    }

    @Test
    public void testGetLevelNameWarning() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider());
        assertEquals("WARNING", formatter.getLevelName(CheckLevel.WARNING));
    }

}


