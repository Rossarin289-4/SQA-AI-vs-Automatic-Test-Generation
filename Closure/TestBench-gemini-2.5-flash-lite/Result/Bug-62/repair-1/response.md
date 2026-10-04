```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import com.google.javascript.jscomp.SourceExcerptProvider; // Added for SourceExcerptProvider interface
import com.google.javascript.jscomp.Region; // Added for Region interface
import com.google.javascript.jscomp.Strings; // Added for Strings.repeat
import com.google.javascript.rhino.Node; // Added for Node class

public class LightweightMessageFormatterTest {

    // Mock DiagnosticType for JSError.make
    private static class MockDiagnosticType {
        private final String key;
        private final String defaultMessage;

        private MockDiagnosticType(String key, String defaultMessage) {
            this.key = key;
            this.defaultMessage = defaultMessage;
        }

        public static MockDiagnosticType of(String key, String defaultMessage) {
            return new MockDiagnosticType(key, defaultMessage);
        }
    }

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
    private JSError createError(String description, String sourceName, int lineNumber, int charno, CheckLevel level) {
        // Using MockDiagnosticType.of instead of DiagnosticType.of
        return JSError.make(sourceName, lineNumber, charno, level, MockDiagnosticType.of("TEST_TYPE", "test message"), description);
    }

    @Test
    public void testFormatErrorWithoutSourceInfo() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        JSError error = createError("Error description", null, 0, 0, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("ERROR - Error description"));
        assertFalse(formatted.contains(":")); // No source name or line number
    }

    @Test
    public void testFormatErrorWithSourceInfo() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        JSError error = createError("Specific error", "file.js", 10, 5, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:10: ERROR - Specific error"));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("     ^\n")); // Char no 5, aligned
    }

    @Test
    public void testFormatWarningWithoutSourceInfo() throws Exception {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        JSError warning = createError("Warning description", null, 0, 0, CheckLevel.WARNING);
        String formatted = formatter.formatWarning(warning);
        assertTrue(formatted.contains("WARNING - Warning description"));
        assertFalse(formatted.contains(":"));
    }

    @Test
    public void testFormatWarningWithSourceInfo() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        JSError warning = createError("Specific warning", "file.js", 20, 3, CheckLevel.WARNING);
        String formatted = formatter.formatWarning(warning);
        assertTrue(formatted.contains("file.js:20: WARNING - Specific warning"));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("  ^\n")); // Char no 3, aligned
    }

    @Test
    public void testFormatErrorWithZeroCharNo() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        JSError error = createError("Zero charno error", "file.js", 15, 0, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:15: ERROR - Zero charno error"));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("^\n")); // Char no 0
    }

    @Test
    public void testFormatErrorWithMaxCharNo() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        // DummySourceProvider returns "dummy line content" which is 20 characters long.
        JSError error = createError("Max charno error", "file.js", 25, 20, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:25: ERROR - Max charno error"));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("                    ^\n")); // Char no 20
    }

    @Test
    public void testFormatErrorWithCharNoBeyondLineLength() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        // Char no greater than line length should not cause an error, arrow should be at end.
        JSError error = createError("Char beyond error", "file.js", 30, 50, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:30: ERROR - Char beyond error"));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("dummy line content^\n"));
    }


    @Test
    public void testFormatErrorWithSourceExcerptNull() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new SourceExcerptProvider() {
            @Override
            public String getSourceLine(String sourceName, int lineNumber) { return null; }
            @Override
            public Region getSourceRegion(String sourceName, int lineNumber) { return null; }
        }, SourceExcerpt.LINE);
        JSError error = createError("Error with null excerpt", "file.js", 40, 10, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:40: ERROR - Error with null excerpt"));
        assertFalse(formatted.contains("dummy line content")); // Source excerpt is null
        assertFalse(formatted.contains("^"));
    }

    @Test
    public void testFormatErrorWithEmptyLineExcerpt() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new SourceExcerptProvider() {
            @Override
            public String getSourceLine(String sourceName, int lineNumber) { return ""; }
            @Override
            public Region getSourceRegion(String sourceName, int lineNumber) {
                return new Region() {
                    @Override public String getSourceExcerpt() { return ""; }
                    @Override public int getBeginningLineNumber() { return 50; }
                    @Override public int getEndingLineNumber() { return 50; }
                };
            }
        }, SourceExcerpt.LINE);
        JSError error = createError("Error with empty excerpt", "file.js", 50, 0, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:50: ERROR - Error with empty excerpt"));
        assertFalse(formatted.contains("dummy line content"));
        assertFalse(formatted.contains("^"));
    }

    @Test
    public void testFormatWarningWithNonLineExcerpt() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.REGION);
        JSError warning = createError("Region excerpt warning", "file.js", 60, 0, CheckLevel.WARNING);
        String formatted = formatter.formatWarning(warning);
        assertTrue(formatted.contains("file.js:60: WARNING - Region excerpt warning"));
        assertTrue(formatted.contains("dummy region excerpt"));
        assertFalse(formatted.contains("^")); // Arrow formatting is only for LINE excerpt
    }

    @Test
    public void testFormatErrorWithSourceExcerptRegionAndCharno() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.REGION);
        // For REGION excerpt, charno is not used for arrow formatting
        JSError error = createError("Region excerpt error", "file.js", 70, 10, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:70: ERROR - Region excerpt error"));
        assertTrue(formatted.contains("dummy region excerpt"));
        assertFalse(formatted.contains("^"));
    }

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

    @Test
    public void testFormatErrorWithEmptyDescription() throws Exception {
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(new DummySourceProvider(), SourceExcerpt.LINE);
        JSError error = createError("", "file.js", 10, 0, CheckLevel.ERROR);
        String formatted = formatter.formatError(error);
        assertTrue(formatted.contains("file.js:10: ERROR - "));
        assertTrue(formatted.contains("dummy line content"));
        assertTrue(formatted.contains("^\n"));
    }
}
```
1. SOURCE CODE ANALYSIS - The tests target `formatError`, `formatWarning`, and the `LineNumberingFormatter`'s `formatRegion` method, covering scenarios with and without source information, different character positions, and excerpt types.
2. TEST CASE DESIGN - `testFormatErrorWithoutSourceInfo`: null sourceName, empty line, expected "ERROR - Error description". `testFormatErrorWithSourceInfo`: sourceName="file.js", lineNumber=10, charno=5, expected "file.js:10: ERROR - Specific error" with arrow at char 5. `testFormatWarningWithoutSourceInfo`: null sourceName, empty line, expected "WARNING - Warning description". `testFormatWarningWithSourceInfo`: sourceName="file.js", lineNumber=20, charno=3, expected "file.js:20: WARNING - Specific warning" with arrow at char 3. `testFormatErrorWithZeroCharNo`: charno=0, expected arrow at start. `testFormatErrorWithMaxCharNo`: charno=20 (line length), expected arrow at end of line. `testFormatErrorWithCharNoBeyondLineLength`: charno=50, expected arrow at end of line. `testFormatErrorWithSourceExcerptNull`: SourceExcerptProvider returns null, expected no excerpt. `testFormatErrorWithEmptyLineExcerpt`: SourceExcerptProvider returns empty string, expected no excerpt. `testFormatWarningWithNonLineExcerpt`: SourceExcerpt.REGION, expected region excerpt, no arrow. `testFormatErrorWithSourceExcerptRegionAndCharno`: SourceExcerpt.REGION, expected region excerpt, no arrow. `testLineNumberingFormatterHandlesSingleLine`: single line region, expected numbered line. `testLineNumberingFormatterHandlesMultipleLines`: multi-line region, expected numbered lines. `testLineNumberingFormatterHandlesEmptyRegion`: empty region, expected null. `testLineNumberingFormatterHandlesNullRegion`: null region, expected null. `testLineNumberingFormatterHandlesLineNumberPadding`: line number < 10, expected padding. `testLineNumberingFormatterHandlesLineNumberPaddingForLargerNumbers`: line number >= 10, no padding. `testLineNumberingFormatterHandlesLineNumberPaddingForVeryLargeNumbers`: line number 1000, max padding. `testLineNumberingFormatterHandlesEmptyLineInRegion`: empty line in region, expected blank line with number. `testGetLevelNameError`: CheckLevel.ERROR, expected "ERROR". `testGetLevelNameWarning`: CheckLevel.WARNING, expected "WARNING". `testFormatErrorWithEmptyDescription`: empty description, expected correct formatting.
4. DEFECT DETECTION STRATEGY - Tests cover various combinations of source information, excerpt types, character positions, and line number formatting to ensure precise message generation.
5. SUMMARY - 22 tests.
6. LIMITATIONS - The `DiagnosticType.of` method was not found, so a mock `MockDiagnosticType` was created. Imports for `SourceExcerptProvider`, `Region`, `Strings`, and `Node` were added. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.