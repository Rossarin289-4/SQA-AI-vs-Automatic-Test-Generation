package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVPrinterTest {

    // Helper method to create a basic CSV printer
    private CSVPrinter createPrinter(Appendable out, CSVFormat format) throws IOException {
        // The constructor might throw IOException if header is present.
        // For most tests, we'll use a format without a header or one that is simple.
        CSVFormat testFormat = format;
        if (format.getHeader() != null) {
            testFormat = format.withHeader((String[]) null); // Remove header for simpler construction
        }
        // Ensure the format is valid before creating the printer
        testFormat.validate();
        return new CSVPrinter(out, testFormat);
    }

    @Test
    public void testPrintNullValue() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(null);
            assertEquals("NULL", sb.toString());
        }
    }

    @Test
    public void testPrintEmptyStringForNull() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withNullString(null); // Null string means empty string
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(null);
            assertEquals("", sb.toString());
        }
    }

    @Test
    public void testPrintObjectToString() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT;
        Object testObject = new Object() {
            @Override
            public String toString() {
                return "custom_string";
            }
        };
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(testObject);
            assertEquals("custom_string", sb.toString());
        }
    }

    @Test
    public void testPrintStringWithDelimiter() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a,b");
            // With default settings (Quote.MINIMAL), delimiter requires quoting
            assertEquals("\"a,b\"", sb.toString());
        }
    }

    @Test
    public void testPrintStringWithQuoteChar() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('"');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\"b");
            // Escaping quote character by doubling it within quotes
            assertEquals("\"a\"\"b\"", sb.toString());
        }
    }

    @Test
    public void testPrintStringWithNewline() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('"');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\nb");
            // Newline within a quoted string should be preserved
            assertEquals("\"a\nb\"", sb.toString());
        }
    }
    
    @Test
    public void testPrintStringWithCarriageReturn() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('"');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\rb");
            // Carriage return within a quoted string should be preserved
            assertEquals("\"a\rb\"", sb.toString());
        }
    }

    @Test
    public void testPrintStringWithEscapeChar() throws Exception {
        StringBuilder sb = new StringBuilder();
        // With escape character, special characters are escaped, not quoted by default in printAndEscape
        // The print method calls printAndQuote, which then calls printAndEscape if it's not quoting.
        // Let's test a format that only uses escaping.
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\\b");
            // The escape character itself needs to be escaped.
            assertEquals("a\\\\b", sb.toString());
        }
    }
    
    @Test
    public void testPrintStringWithEscapeCharAndDelimiter() throws Exception {
        StringBuilder sb = new StringBuilder();
        // Test with escaping and delimiter.
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a,b");
            // Delimiter needs to be escaped.
            assertEquals("a\\,b", sb.toString());
        }
    }

    @Test
    public void testPrintCommentWithNewline() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord("a", "b"); // Prints "a,b\n"
            printer.printComment("first line\nsecond line");
            // Newlines in comments should result in new comment lines.
            assertEquals("a,b\n# first line\n# second line\n", sb.toString());
        }
    }
    
    @Test
    public void testPrintCommentWithCarriageReturn() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord("a", "b"); // Prints "a,b\n"
            printer.printComment("first line\rsecond line");
            // Carriage returns in comments should also result in new comment lines.
            assertEquals("a,b\n# first line\n# second line\n", sb.toString());
        }
    }

    @Test
    public void testPrintCommentWithCRLF() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord("a", "b"); // Prints "a,b\n"
            printer.printComment("first line\r\nsecond line");
            // CRLF in comments should result in new comment lines.
            assertEquals("a,b\n# first line\n# second line\n", sb.toString());
        }
    }

    @Test
    public void testPrintCommentWhenDisabled() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart(null).withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord("a", "b"); // Prints "a,b\n"
            printer.printComment("this should not appear");
            // If commenting is disabled, the method should do nothing.
            assertEquals("a,b\n", sb.toString());
        }
    }

    @Test
    public void testPrintln() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.println();
            assertEquals("\n", sb.toString());
        }
    }
    
    @Test
    public void testPrintlnWithCustomSeparator() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.println();
            assertEquals("\r\n", sb.toString());
        }
    }
    
    @Test
    public void testPrintlnWithNullSeparator() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(null);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.println();
            // If record separator is null, println should append nothing.
            assertEquals("", sb.toString());
        }
    }

    @Test
    public void testPrintRecordIterable() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Iterable<String> record = java.util.Arrays.asList("a", "b", "c");
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord(record);
            // Default record separator is newline.
            assertEquals("a,b,c\n", sb.toString());
        }
    }

    @Test
    public void testPrintRecordArray() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Object[] record = {"a", "b", "c"};
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord(record);
            assertEquals("a,b,c\n", sb.toString());
        }
    }
    
    @Test
    public void testPrintRecordArrayWithNulls() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withNullString("NULL");
        Object[] record = {"a", null, "c"};
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord(record);
            assertEquals("a,NULL,c\n", sb.toString());
        }
    }

    @Test
    public void testPrintRecordsIterableOfArrays() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Iterable<Object[]> records = java.util.Arrays.asList(
            new Object[]{"a", "b"},
            new Object[]{"c", "d"}
        );
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecords(records);
            // Each record is printed with a newline.
            assertEquals("a,b\nc,d\n", sb.toString());
        }
    }

    @Test
    public void testPrintRecordsIterableOfIterables() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Iterable<Iterable<String>> records = java.util.Arrays.asList(
            java.util.Arrays.asList("a", "b"),
            java.util.Arrays.asList("c", "d")
        );
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecords(records);
            assertEquals("a,b\nc,d\n", sb.toString());
        }
    }

    @Test
    public void testPrintRecordsArrayOfArrays() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Object[][] records = {
            {"a", "b"},
            {"c", "d"}
        };
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecords(records);
            assertEquals("a,b\nc,d\n", sb.toString());
        }
    }

    @Test
    public void testPrintRecordsArrayOfIterables() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Object[] records = {
            java.util.Arrays.asList("a", "b"),
            java.util.Arrays.asList("c", "d")
        };
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecords(records);
            assertEquals("a,b\nc,d\n", sb.toString());
        }
    }

    @Test
    public void testGetOut() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = createPrinter(sb, format)) {
            assertSame(sb, printer.getOut());
        }
    }

    @Test
    public void testCloseWhenAppendableIsNotCloseable() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = createPrinter(sb, format)) {
            // StringBuilder is not Closeable, so close() should do nothing.
            printer.close();
            // No exception should be thrown, and StringBuilder should remain unchanged.
            assertEquals("", sb.toString()); // Assuming nothing was printed before close
        }
    }

    @Test
    public void testFlushWhenAppendableIsNotFlushable() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = createPrinter(sb, format)) {
            // StringBuilder is not Flushable, so flush() should do nothing.
            printer.flush();
            // No exception should be thrown, and StringBuilder should remain unchanged.
            assertEquals("", sb.toString()); // Assuming nothing was printed before flush
        }
    }
    
    @Test
    public void testPrintEmptyRecord() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord(); // Print an empty record
            // An empty record should still produce a record separator.
            assertEquals("\n", sb.toString());
        }
    }
    
    @Test
    public void testPrintEmptyRecordIterable() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        Iterable<Object> record = java.util.Collections.emptyList();
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.printRecord(record);
            assertEquals("\n", sb.toString());
        }
    }

    @Test
    public void testPrintMinimalQuoteWithLeadingSpace() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.MINIMAL);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(" value"); // Leading space should trigger quoting in MINIMAL policy
            assertEquals("\" value\"", sb.toString());
        }
    }

    @Test
    public void testPrintMinimalQuoteWithTrailingSpace() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.MINIMAL);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("value "); // Trailing space should trigger quoting in MINIMAL policy
            assertEquals("\"value \"", sb.toString());
        }
    }
    
    @Test
    public void testPrintMinimalQuoteWithLeadingAndTrailingSpace() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.MINIMAL);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(" value "); // Leading and trailing spaces
            assertEquals("\" value \"", sb.toString());
        }
    }
    
    @Test
    public void testPrintMinimalQuoteWithTab() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.MINIMAL);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("value\t"); // Tab character, which is <= SP, should trigger quoting
            assertEquals("\"value\t\"", sb.toString());
        }
    }

    @Test
    public void testPrintAllQuotePolicy() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.ALL);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a");
            assertEquals("\"a\"", sb.toString());
            printer.print("b,c");
            assertEquals("\"a\",\"b,c\"", sb.toString());
        }
    }

    @Test
    public void testPrintNonNumericQuotePolicy() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuotePolicy(Quote.NON_NUMERIC);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(123);
            assertEquals("123", sb.toString()); // Number, not quoted
            printer.print("abc");
            assertEquals("123,\"abc\"", sb.toString()); // String, quoted
            printer.print(123.45);
            assertEquals("123,\"abc\",123.45", sb.toString()); // Double, not quoted
        }
    }
    
    @Test
    public void testPrintNonNumericQuotePolicyWithNonNumericQuoteChar() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('|').withQuotePolicy(Quote.NON_NUMERIC);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print(123);
            assertEquals("123", sb.toString()); // Number, not quoted
            printer.print("abc");
            assertEquals("123,|abc|", sb.toString()); // String, quoted with custom quote char
            printer.print(123.45);
            assertEquals("123,|abc|,123.45", sb.toString()); // Double, not quoted
        }
    }

    @Test
    public void testPrintEscapingEnabledNoSpecialChars() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("abc");
            assertEquals("abc", sb.toString());
        }
    }
    
    @Test
    public void testPrintEscapingEnabledWithAllSpecialChars() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\nb\\c,d");
            // LF, escape char, and delimiter are escaped.
            assertEquals("a\\nb\\\\c\\,d", sb.toString());
        }
    }
    
    @Test
    public void testPrintEscapingEnabledWithCRLF() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\r\nb");
            // CRLF should be escaped as \r and \n.
            assertEquals("a\\r\\nb", sb.toString());
        }
    }

    @Test
    public void testPrintEscapingEnabledWithOnlyCR() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\rb");
            // CR should be escaped as \r.
            assertEquals("a\\rb", sb.toString());
        }
    }

    @Test
    public void testPrintEscapingEnabledWithOnlyLF() throws Exception {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        try (CSVPrinter printer = createPrinter(sb, format)) {
            printer.print("a\nb");
            // LF should be escaped as \n.
            assertEquals("a\\nb", sb.toString());
        }
    }
}
