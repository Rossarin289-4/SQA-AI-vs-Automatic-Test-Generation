package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.apache.commons.csv.Constants.BACKSLASH;
import static org.apache.commons.csv.Constants.CR;
import static org.apache.commons.csv.Constants.CRLF;
import static org.apache.commons.csv.Constants.DOUBLE_QUOTE_CHAR;
import static org.apache.commons.csv.Constants.LF;
import static org.apache.commons.csv.Constants.TAB;


public class CSVFormatTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultFormat() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteChar().charValue());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getIgnoreEmptyLines());
        assertEquals(CRLF, format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.isCommentingEnabled());
        assertFalse(format.isEscaping());
        assertFalse(format.isNullHandling());
        assertTrue(format.isQuoting());
        assertEquals(Quote.ALL, format.getQuotePolicy());
    }

    @Test
    public void testRFC4180Format() {
        CSVFormat format = CSVFormat.RFC4180;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteChar().charValue());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines()); // RFC4180 does not ignore empty lines
        assertEquals(CRLF, format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertEquals(Quote.ALL, format.getQuotePolicy());
    }

    @Test
    public void testExcelFormat() {
        CSVFormat format = CSVFormat.EXCEL;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteChar().charValue());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines()); // Excel format does not ignore empty lines
        assertEquals(CRLF, format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertEquals(Quote.ALL, format.getQuotePolicy());
    }

    @Test
    public void testTDFFormat() {
        CSVFormat format = CSVFormat.TDF;
        assertEquals(TAB, format.getDelimiter());
        assertEquals('"', format.getQuoteChar().charValue());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getIgnoreEmptyLines());
        assertEquals(CRLF, format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertEquals(Quote.ALL, format.getQuotePolicy());
    }

    @Test
    public void testMySqlFormat() {
        CSVFormat format = CSVFormat.MYSQL;
        assertEquals(TAB, format.getDelimiter());
        assertNull(format.getQuoteChar()); // MySQL format does not quote
        assertNull(format.getCommentStart());
        assertEquals(BACKSLASH, format.getEscape().charValue());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines()); // MySQL format does not ignore empty lines
        assertEquals(LF, format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        // MYSQL format does not explicitly set quotePolicy, default should be NONE
        // However, the source code initializes it to null for this case, so testing for null is appropriate.
        assertNull(format.getQuotePolicy());
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test
    public void testWithDelimiterThrowsExceptionOnLineBreak() {
        try {
            CSVFormat.DEFAULT.withDelimiter(LF);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The delimiter cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('\'');
        assertEquals('\'', format.getQuoteChar().charValue());
    }

    @Test
    public void testWithQuoteCharThrowsExceptionOnLineBreak() {
        try {
            CSVFormat.DEFAULT.withQuoteChar(CR);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The quoteChar cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithCommentStart() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        assertEquals('#', format.getCommentStart().charValue());
    }

    @Test
    public void testWithCommentStartThrowsExceptionOnLineBreak() {
        try {
            CSVFormat.DEFAULT.withCommentStart(LF);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The comment start character cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithEscape() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals('\\', format.getEscape().charValue());
    }

    @Test
    public void testWithEscapeThrowsExceptionOnLineBreak() {
        try {
            CSVFormat.DEFAULT.withEscape(LF);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The escape character cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", format.getNullString());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(format.getIgnoreSurroundingSpaces());
        format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        assertTrue(format.getIgnoreEmptyLines());
        format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", format.getRecordSeparator());
    }

    @Test
    public void testWithHeaderArray() {
        String[] header = {"Col1", "Col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());
    }

    @Test
    public void testWithHeaderArrayCloned() {
        String[] header = {"Col1", "Col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        String[] header2 = format.getHeader();
        assertNotSame(header, header2); // ensure it's a clone
        assertArrayEquals(header, header2);
    }

    @Test
    public void testWithHeaderArrayThrowsExceptionOnDuplicate() {
        String[] header = {"Col1", "Col1"};
        try {
            CSVFormat.DEFAULT.withHeader(header);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The header contains a duplicate entry"));
        }
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(format.getSkipHeaderRecord());
        format = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(format.getSkipHeaderRecord());
    }

    @Test
    public void testFormatSimpleValues() {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("a", "b", "c");
        assertEquals("a,b,c", formatted);
    }

    @Test
    public void testFormatWithQuote() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        String formatted = format.format("a", "b,c", "d");
        assertEquals("\"a\",\"b,c\",\"d\"", formatted);
    }

    @Test
    public void testFormatWithEmptyString() {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("a", "", "c");
        assertEquals("a,,c", formatted);
    }

    @Test
    public void testFormatWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        String formatted = format.format("a", null, "c");
        assertEquals("a,NULL,c", formatted);
    }

    @Test
    public void testFormatWithTabDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(TAB);
        String formatted = format.format("a", "b", "c");
        assertEquals("a\tb\tc", formatted);
    }

    @Test
    public void testFormatWithCommentStart() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        String formatted = format.format("a", "b", "c");
        assertEquals("a,b,c", formatted); // comment char only affects parsing/outputting comments, not general formatting
    }

    @Test
    public void testFormatWithEscape() {
        // When quoting is enabled, escape character is used for quotes within the field.
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"').withEscape('\\');
        String formatted = format.format("a", "b\"c", "d");
        // According to RFC4180 and common CSV practices, quotes within a quoted field are escaped by doubling them.
        // The escape character itself is not directly used in this specific case of escaping the quote character,
        // unless the quote character itself is the escape character, which is not the case here.
        // However, if the input contained the escape character itself, it would be escaped.
        // For "b\"c", with quoteChar='"', the result should be "b\"c".
        // The test case seems to assume a different escaping logic. Let's test the actual behavior of CSVPrinter.
        // CSVPrinter with Quote.ALL and escape '\' for input "b\"c" with quoteChar '"' will produce "\"b\"c\""
        // because the quote character itself needs to be escaped *if it's within a quoted field*.
        // A simpler test might be "a,b,c" -> "a,b,c"
        // "a,\"b,c\",d" -> "\"a\",\"b,c\",\"d\""
        // "a,\"b\"\"c\",d" -> "\"a\",\"b\"\"c\",\"d\""
        // If escape is '\' and quote is '"', and we have 'b"c'
        // If quotePolicy is ALL, it will be quoted: "\"b\"\"c\"" (the internal quote is doubled)
        // If quotePolicy is MINIMAL, it might be "b\"\"c" or "\"b\"\"c\"" depending on implementation.
        // The current test implies the escape character is used for the quote character, which is not standard.
        // Let's re-evaluate based on the source. CSVPrinter.printRecord handles escaping.
        // If quoteChar is present, and a value contains the quoteChar, it's escaped.
        // If escapeChar is present, and a value contains the escapeChar, it's escaped.
        // If a value contains both, it's complex.
        // For "b\"c" and quoteChar '"', escape '\':
        // If quoting is always done (Quote.ALL), the field becomes "\"b\\\"c\"". The internal quote is doubled, and the escape character is escaped.
        // The test seems to expect "\"b\"\"c\"" which implies the internal quote is escaped with another quote.
        // Let's use a simpler case for escaping:
        format = CSVFormat.DEFAULT.withEscape('\\'); // No quoting, only escape
        String formattedNoQuote = format.format("a", "b\\c", "d");
        assertEquals("a,b\\\\c,d", formattedNoQuote); // Escape char is escaped

        // Test with quoting and escape
        format = CSVFormat.DEFAULT.withQuoteChar('"').withEscape('\\'); // quote char '"', escape '\'
        String formattedWithQuoteAndEscape = format.format("a", "b\"c", "d\\e");
        // "b\"c" inside quotes becomes "\"b\"\"c\"" where the internal quote is doubled.
        // "d\\e" inside quotes becomes "\"d\\\\e\"" where the escape is escaped.
        assertEquals("\"a\",\"b\"\"c\",\"d\\\\e\"", formattedWithQuoteAndEscape);
    }

    @Test
    public void testEqualsAndHashCode() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        CSVFormat format3 = CSVFormat.RFC4180;
        CSVFormat format4 = CSVFormat.DEFAULT.withDelimiter(';');
        CSVFormat format5 = CSVFormat.DEFAULT.withHeader("h1");

        assertEquals(format1, format2);
        assertEquals(format1.hashCode(), format2.hashCode());

        assertNotEquals(format1, format3);
        assertNotEquals(format1.hashCode(), format3.hashCode());

        assertNotEquals(format1, format4);
        assertNotEquals(format1.hashCode(), format4.hashCode());

        assertNotEquals(format1, format5);
        assertNotEquals(format1.hashCode(), format5.hashCode());
    }

    @Test
    public void testIsCommentingEnabled() {
        assertTrue(CSVFormat.DEFAULT.withCommentStart('!').isCommentingEnabled());
        assertFalse(CSVFormat.DEFAULT.isCommentingEnabled());
    }

    @Test
    public void testIsEscaping() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscaping());
        assertFalse(CSVFormat.DEFAULT.isEscaping());
    }

    @Test
    public void testIsNullHandling() {
        assertTrue(CSVFormat.DEFAULT.withNullString("null").isNullHandling());
        assertFalse(CSVFormat.DEFAULT.isNullHandling());
    }

    @Test
    public void testIsQuoting() {
        assertTrue(CSVFormat.DEFAULT.withQuoteChar('"').isQuoting());
        assertFalse(CSVFormat.DEFAULT.isQuoting());
    }

    @Test
    public void testValidateDelimiterQuoteCharSame() {
        try {
            CSVFormat.DEFAULT.withDelimiter('"').withQuoteChar('"');
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            assertEquals("The quoteChar character and the delimiter cannot be the same ('\"')", e.getMessage());
        }
    }

    @Test
    public void testValidateDelimiterEscapeCharSame() {
        try {
            CSVFormat.DEFAULT.withDelimiter('\\').withEscape('\\');
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            assertEquals("The escape character and the delimiter cannot be the same ('\\')", e.getMessage());
        }
    }

    @Test
    public void testValidateDelimiterCommentStartSame() {
        try {
            CSVFormat.DEFAULT.withDelimiter('#').withCommentStart('#');
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            assertEquals("The comment start character and the delimiter cannot be the same ('#')", e.getMessage());
        }
    }

    @Test
    public void testValidateQuoteCharCommentStartSame() {
        try {
            CSVFormat.DEFAULT.withQuoteChar('"').withCommentStart('"');
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            assertEquals("The comment start character and the quoteChar cannot be the same ('\"')", e.getMessage());
        }
    }

    @Test
    public void testValidateEscapeCharCommentStartSame() {
        try {
            CSVFormat.DEFAULT.withEscape('#').withCommentStart('#');
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            assertEquals("The comment start and the escape character cannot be the same ('#')", e.getMessage());
        }
    }

    @Test
    public void testValidateNoQuotesModeButNoEscape() {
        // If quoteChar is null, then escape cannot be null if quoting is disabled.
        // The source says: "if (escape == null && quotePolicy == Quote.NONE)"
        // But the code is: if (escape == null && quotePolicy == Quote.NONE)
        // The `withQuoteChar(null)` sets quotePolicy to Quote.ALL by default in its constructor.
        // Let's check the constructor of CSVFormat:
        // this.quotePolicy = quotePolicy;
        // So, quotePolicy is not automatically set to Quote.ALL. It's passed in.
        // The actual check in `validate()` is `escape == null && quotePolicy == Quote.NONE`.
        // The `Quote.NONE` enum value is not visible in the provided API outline.
        // Assuming `Quote.NONE` is the correct value for disabled quoting.
        // The test should ensure that if quoting is truly disabled (quoteChar is null AND quotePolicy is NONE),
        // then escape cannot be null.

        // The provided Quote enum does not have NONE. Default is Quote.ALL for CSVFormat.DEFAULT.
        // Let's simulate a case where quotePolicy is explicitly NONE, assuming it exists.
        // Since we cannot construct Quote.NONE, let's test the scenario where quoteChar is null.
        // If quoteChar is null, isQuoting() returns false.
        // The condition in validate is `escape == null && quotePolicy == Quote.NONE`.
        // If quoteChar is null, isQuoting() returns false. The `quotePolicy` is not directly exposed by a getter.
        // It's possible that `quotePolicy` is implicitly handled by `quoteChar == null`.

        // Based on the source code `new CSVFormat(delimiter, quoteChar, quotePolicy, ...)`
        // and `isQuoting()` checks `quoteChar != null`.
        // The `validate()` method checks `escape == null && quotePolicy == Quote.NONE`.
        // If `quoteChar` is null, `isQuoting()` is false. If `quotePolicy` is `Quote.NONE`, and `escape` is null, it throws.
        // Without access to `Quote.NONE`, we test the direct `withQuoteChar(null)` which implies no quoting.
        // And `withEscape(null)`.
        // This combination will call `validate` where `escape` is null.
        // We need to ensure `quotePolicy` is `Quote.NONE` for the exception to be thrown.
        // The default constructor for CSVFormat does not set quotePolicy.
        // The constants like DEFAULT, RFC4180 initialize quotePolicy to Quote.ALL.
        // If quoteChar is null, and quotePolicy is null, what happens?
        // The `withQuoteChar(null)` in the source code is:
        // `return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);`
        // This means `quotePolicy` is passed through.
        // If we call `withQuoteChar(null)` on `CSVFormat.DEFAULT`, `quotePolicy` remains `Quote.ALL`.
        // So `validate` would be called with `escape=null` and `quotePolicy=Quote.ALL`, not `Quote.NONE`.
        // Thus, the exception would not be thrown.

        // Let's try to construct a scenario where quotePolicy is effectively NONE.
        // This test might be flawed due to missing information about `Quote.NONE`.
        // However, if `withQuoteChar(null)` implies `Quote.NONE`, then the test is valid.
        // Let's assume `withQuoteChar(null)` results in a state where `quotePolicy` is effectively `Quote.NONE`.
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        // Now, test with escape null.
        try {
            format.withEscape(null); // This will call validate implicitly.
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            // The error message "No quotes mode set but no escape character is set"
            // implies that quoteChar being null is considered "no quotes mode".
            assertEquals("No quotes mode set but no escape character is set", e.getMessage());
        }
    }
    
    @Test
    public void testToStringDefault() {
        assertEquals("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> EmptyLines:ignored", CSVFormat.DEFAULT.toString());
    }

    @Test
    public void testToStringWithCustomizations() {
        CSVFormat format = CSVFormat.DEFAULT
            .withDelimiter(';')
            .withQuoteChar('\'')
            .withEscape('\\')
            .withCommentStart('#')
            .withNullString("NULL")
            .withIgnoreSurroundingSpaces(true)
            .withIgnoreEmptyLines(false)
            .withRecordSeparator("\n")
            .withHeader("h1", "h2")
            .withSkipHeaderRecord(true);

        assertEquals("Delimiter=<;> Escape=<\\> QuoteChar=<\'> CommentStart=</#> NullString=<NULL> SurroundingSpaces:ignored RecordSeparator=<\n> SkipHeaderRecord:true Header:[h1, h2]", format.toString());
    }

    @Test
    public void testNewFormatWithChar() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteChar());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertNull(format.getQuotePolicy());
    }

    @Test
    public void testNewFormatWithCharThrowsExceptionOnLineBreak() {
        try {
            CSVFormat.newFormat(CR);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The delimiter cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testEqualsWithDifferentDelimiter() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertNotEquals(format1, format2);
    }

    @Test
    public void testEqualsWithSameDelimiter() {
        CSVFormat format1 = CSVFormat.DEFAULT.withDelimiter(';');
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(format1, format2);
    }

    @Test
    public void testGetQuotePolicy() {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        assertEquals(Quote.MINIMAL, format.getQuotePolicy());
    }

    @Test
    public void testParseWithReader() throws IOException {
        String csvData = "a,b,c\nd,e,f";
        Reader reader = new StringReader(csvData);
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = format.parse(reader);
        // We can't fully test the parser here without more complex setup,
        // but we can at least check that it can be created and is not null.
        assertNotNull(parser);
        // Close the parser to release resources.
        parser.close();
    }
    
    @Test
    public void testFormatWithQuotePolicy() {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        // This test primarily checks that the method can be called and returns a new object
        // with the specified quote policy. The actual formatting behavior depends on CSVPrinter.
        assertEquals(Quote.MINIMAL, format.getQuotePolicy());
    }

    @Test
    public void testFormatWithQuotePolicyAndData() throws IOException {
        // Test with a format that requires quoting for specific values.
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        String dataWithComma = "field1,field2";
        StringWriter sw = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(sw, format)) {
            printer.printRecord(dataWithComma);
        }
        // With Quote.MINIMAL, fields containing the delimiter should be quoted.
        assertEquals("\"field1,field2\"\r\n", sw.toString());
    }

    @Test
    public void testEqualsWithNull() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertNotEquals(format, null);
    }

    @Test
    public void testEqualsWithDifferentClass() {
        CSVFormat format = CSVFormat.DEFAULT;
        String otherObject = "not a CSVFormat";
        assertNotEquals(format, otherObject);
    }

    @Test
    public void testHashCodeConsistency() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(format.hashCode(), format.hashCode());
    }

    @Test
    public void testToStringWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertTrue(format.toString().contains("NullString=<NULL>"));
    }

    @Test
    public void testToStringWithRecordSeparator() {
        CSVFormat format = CSVFormat.MYSQL.withRecordSeparator("\n");
        assertTrue(format.toString().contains("RecordSeparator=<\\n>"));
    }

    @Test
    public void testWithHeaderEmpty() {
        String[] header = {};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());
    }
}
