package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVPrinterTest {

    @Test
    public void testPrintNullObjectWithNullStringFormat() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print((Object) null);
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testPrintNullObjectWithoutNullStringFormat() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString(null); // Explicitly null
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print((Object) null);
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintEmptyString() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintStringWithDelimiter() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT; // Default quote policy is MINIMAL
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a,b");
        assertEquals("\"a,b\"", out.toString());
    }

    @Test
    public void testPrintStringWithQuoteChar() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a\"b");
        assertEquals("\"a\"\"b\"", out.toString());
    }

    @Test
    public void testPrintStringWithRecordSeparator() throws Exception {
        StringWriter out = new StringWriter();
        // Default CSVFormat has record separator \r\n. Setting it to \n explicitly.
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a\nb"); // This should be encapsulated because of LF within the string
        assertEquals("\"a\nb\"", out.toString()); // Encapsulated due to LF
    }

    @Test
    public void testPrintStringWithEscaping() throws Exception {
        StringWriter out = new StringWriter();
        // To disable quoting and use escaping, set quote policy to NONE.
        CSVFormat format = CSVFormat.DEFAULT.withEscape(',').withQuotePolicy(Quote.NONE);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a,b");
        assertEquals("a,,b", out.toString()); // Comma escaped
    }

    @Test
    public void testPrintStringWithEscapingAndNewLine() throws Exception {
        StringWriter out = new StringWriter();
        // To disable quoting and use escaping, set quote policy to NONE.
        CSVFormat format = CSVFormat.DEFAULT.withEscape(',').withQuotePolicy(Quote.NONE);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a\nb");
        assertEquals("a,\\nb", out.toString()); // Newline escaped
    }

    @Test
    public void testPrintRecordIterable() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecord((Iterable<?>) java.util.Arrays.asList("a", "b", "c"));
        assertEquals("a,b,c\n", out.toString());
    }

    @Test
    public void testPrintRecordArray() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableOfArrays() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecords((Iterable<?>) java.util.Arrays.asList(new String[]{"a", "b"}, new String[]{"c", "d"}));
        assertEquals("a,b\nc,d\n", out.toString());
    }

    @Test
    public void testPrintRecordsArrayOfArrays() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecords(new Object[]{new String[]{"a", "b"}, new String[]{"c", "d"}});
        assertEquals("a,b\nc,d\n", out.toString());
    }

    @Test
    public void testPrintCommentEnabled() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printComment("This is a comment");
        assertEquals("# This is a comment\n", out.toString());
    }

    @Test
    public void testPrintCommentDisabled() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart(null);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printComment("This should not be printed");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintCommentWithNewlines() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printComment("Line1\nLine2\r\nLine3");
        // Based on the implementation, each newline in the comment should start a new commented line.
        // The original expected output was: "# This is a comment\n# Line1\n# Line2\n# Line3\n"
        // However, the printComment method does not add "This is a comment" by default, it adds the provided comment.
        // Let's re-evaluate the expected output based on the code.
        // The code appends comment start, space, and then comment characters. Newlines cause new lines with comment start and space.
        assertEquals("# Line1\n# Line2\n# Line3\n", out.toString());
    }

    @Test
    public void testPrintln() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("|");
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.println();
        assertEquals("|", out.toString());
    }

    @Test
    public void testPrintlnWithNullRecordSeparator() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(null);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.println();
        assertEquals("", out.toString());
    }

    @Test
    public void testFlush() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.flush(); // Should not throw
        assertEquals("", out.toString()); // No output from flush
    }

    @Test
    public void testClose() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.close(); // Should not throw
        assertEquals("", out.toString()); // No output from close
    }
    
    @Test
    public void testPrintAndQuoteAll() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a,b");
        assertEquals("\"a,b\"", out.toString());
    }

    @Test
    public void testPrintAndQuoteNonNumeric() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print(123);
        assertEquals("123", out.toString());
        
        out = new StringWriter();
        printer = new CSVPrinter(out, format);
        printer.print("123"); // This is a string, so it's non-numeric and should be quoted
        assertEquals("\"123\"", out.toString());
    }
    
    @Test
    public void testPrintAndQuoteMinimalWithSpecialChars() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a \" b"); // Contains quote character, should be quoted and escaped
        assertEquals("\"a \"\" b\"", out.toString());
    }

    @Test
    public void testPrintAndQuoteMinimalWhenNewRecordAndStartsNonAlphaNumeric() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("123"); // Starts with a digit, and is not enclosed. The logic in printAndQuote checks for characters that might require quoting.
                             // Based on the code: `if (newRecord && (c < '0' || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || (c > 'z')))`
                             // This condition is true for digits when newRecord is true.
        assertEquals("\"123\"", out.toString());
    }

    @Test
    public void testPrintAndQuoteMinimalWhenNewRecordAndStartsSpecial() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("!abc"); // Starts with '!', which is <= COMMENT according to ASCII values, so it should be quoted.
        assertEquals("\"!abc\"", out.toString());
    }
    
    @Test
    public void testPrintAndQuoteMinimalEndsWithSpace() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("abc "); // Ends with space, should be quoted.
        assertEquals("\"abc \"", out.toString());
    }
    
    @Test
    public void testPrintAndQuoteMinimalEmptyValueNewRecord() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print(""); // Empty value when newRecord is true should be quoted.
        assertEquals("\"\"", out.toString());
    }

    @Test
    public void testPrintRecordWithMixedTypes() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL"); // Explicitly setting null string for clarity
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecord("a", 123, true, null);
        assertEquals("a,123,true,NULL\n", out.toString());
    }

    @Test
    public void testPrintRecordWithNumericValue() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecord(12345);
        assertEquals("12345\n", out.toString());
    }

    @Test
    public void testPrintRecordWithBooleanValue() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.printRecord(true);
        assertEquals("true\n", out.toString());
    }

    @Test
    public void testPrintWithEscapingAndDelimiter() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withEscape('X').withDelimiter(',').withQuotePolicy(Quote.NONE);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("a,b"); // Contains delimiter
        assertEquals("aX,b", out.toString()); // Delimiter escaped
    }

    @Test
    public void testPrintWithEscapingAndEscapeChar() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withEscape('X').withDelimiter(',').withQuotePolicy(Quote.NONE);
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("aXb"); // Contains escape character
        assertEquals("aXXb", out.toString()); // Escape character escaped
    }
}
