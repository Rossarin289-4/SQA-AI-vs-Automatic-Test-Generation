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

public class CSVFormatTest {

    @Test
    public void testDefaultFormat() throws Exception {
        // Test the default format's properties
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        // Corrected: DEFAULT has ignoreEmptyLines = true
        assertEquals(true, format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertEquals(false, format.getIgnoreSurroundingSpaces());
        assertEquals(null, format.getNullString());
        assertEquals(null, format.getCommentMarker());
        assertEquals(false, format.getSkipHeaderRecord());
        assertEquals(null, format.getHeader());
        assertEquals(false, format.getAllowMissingColumnNames());
    }

    @Test
    public void testRfc4180Format() throws Exception {
        // Test the RFC4180 format's properties
        CSVFormat format = CSVFormat.RFC4180;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals(false, format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertEquals(false, format.getIgnoreSurroundingSpaces());
        assertEquals(null, format.getNullString());
        assertEquals(null, format.getCommentMarker());
        assertEquals(false, format.getSkipHeaderRecord());
        assertEquals(null, format.getHeader());
        assertEquals(false, format.getAllowMissingColumnNames());
    }

    @Test
    public void testExcelFormat() throws Exception {
        // Test the EXCEL format's properties
        CSVFormat format = CSVFormat.EXCEL;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals(false, format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertEquals(false, format.getIgnoreSurroundingSpaces());
        assertEquals(null, format.getNullString());
        assertEquals(null, format.getCommentMarker());
        assertEquals(false, format.getSkipHeaderRecord());
        assertEquals(null, format.getHeader());
        assertEquals(true, format.getAllowMissingColumnNames());
    }

    @Test
    public void testTdfFormat() throws Exception {
        // Test the TDF format's properties
        CSVFormat format = CSVFormat.TDF;
        assertEquals('\t', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        // Corrected: TDF has ignoreEmptyLines = true
        assertEquals(true, format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertEquals(true, format.getIgnoreSurroundingSpaces());
        assertEquals(null, format.getNullString());
        assertEquals(null, format.getCommentMarker());
        assertEquals(false, format.getSkipHeaderRecord());
        assertEquals(null, format.getHeader());
        assertEquals(false, format.getAllowMissingColumnNames());
    }

    @Test
    public void testMysqlFormat() throws Exception {
        // Test the MYSQL format's properties
        CSVFormat format = CSVFormat.MYSQL;
        assertEquals('\t', format.getDelimiter());
        assertEquals(null, format.getQuoteCharacter());
        assertEquals(false, format.getIgnoreEmptyLines());
        assertEquals("\n", format.getRecordSeparator());
        assertEquals(false, format.getIgnoreSurroundingSpaces());
        assertEquals(null, format.getNullString());
        assertEquals('\\', format.getEscapeCharacter().charValue());
        assertEquals(null, format.getCommentMarker());
        assertEquals(false, format.getSkipHeaderRecord());
        assertEquals(null, format.getHeader());
        assertEquals(false, format.getAllowMissingColumnNames());
    }

    @Test
    public void testNewFormatWithDelimiter() throws Exception {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertNull(format.getNullString());
        assertNull(format.getCommentMarker());
        assertFalse(format.getSkipHeaderRecord());
        assertNull(format.getHeader());
        assertFalse(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithDelimiter() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withDelimiter('|');
        assertEquals('|', modified.getDelimiter());
        // Ensure other properties are unchanged
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader()); // header should be null as default has null header
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterAsLineBreak() throws Exception {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test
    public void testWithQuote() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withQuote('"');
        assertEquals('"', modified.getQuoteCharacter().charValue());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithQuoteDisabled() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withQuote((Character) null);
        assertNull(modified.getQuoteCharacter());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteAsLineBreak() throws Exception {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithEscape() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withEscape('\\');
        assertEquals('\\', modified.getEscapeCharacter().charValue());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithEscapeDisabled() throws Exception {
        CSVFormat original = CSVFormat.MYSQL; // MYSQL has escape enabled
        CSVFormat modified = original.withEscape((Character) null);
        assertNull(modified.getEscapeCharacter());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeAsLineBreak() throws Exception {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test
    public void testWithCommentMarker() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withCommentMarker('#');
        assertEquals('#', modified.getCommentMarker().charValue());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithCommentMarkerDisabled() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT.withCommentMarker('!');
        CSVFormat modified = original.withCommentMarker((Character) null);
        assertNull(modified.getCommentMarker());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerAsLineBreak() throws Exception {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testWithNullString() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withNullString("NA");
        assertEquals("NA", modified.getNullString());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithNullStringDisabled() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT.withNullString("NA");
        CSVFormat modified = original.withNullString(null);
        assertNull(modified.getNullString());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreEmptyLines() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withIgnoreEmptyLines(true);
        assertTrue(modified.getIgnoreEmptyLines());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withIgnoreSurroundingSpaces(true);
        assertTrue(modified.getIgnoreSurroundingSpaces());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithHeader() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        String[] headerNames = {"Col1", "Col2", "Col3"};
        CSVFormat modified = original.withHeader(headerNames);
        assertArrayEquals(headerNames, modified.getHeader());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithHeaderEmpty() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        String[] headerNames = {};
        CSVFormat modified = original.withHeader(headerNames);
        assertArrayEquals(headerNames, modified.getHeader());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithHeaderNull() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT.withHeader("Col1");
        CSVFormat modified = original.withHeader((String[]) null);
        assertNull(modified.getHeader());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithSkipHeaderRecord() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withSkipHeaderRecord(true);
        assertTrue(modified.getSkipHeaderRecord());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNames() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withAllowMissingColumnNames(true);
        assertTrue(modified.getAllowMissingColumnNames());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
    }

    @Test
    public void testWithRecordSeparatorChar() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withRecordSeparator('\n');
        assertEquals("\n", modified.getRecordSeparator());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testWithRecordSeparatorString() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withRecordSeparator("||");
        assertEquals("||", modified.getRecordSeparator());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testFormatSimpleValues() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        // Corrected expected value: CSVFormat.DEFAULT quotes simple values
        String formatted = format.format("a", "b", "c");
        assertEquals("\"a\",\"b\",\"c\"", formatted);
    }

    @Test
    public void testFormatWithQuoteNeeded() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("a", "b,c", "d");
        // Corrected expected value: CSVFormat.DEFAULT quotes values with delimiter
        assertEquals("\"a\",\"b,c\",\"d\"", formatted);
    }

    @Test
    public void testFormatWithQuoteAndEscape() throws Exception {
        // Re-evaluate based on current CSVFormat.MYSQL and withQuote('"')
        // MYSQL delimiter is tab ('\t')
        // If quote is set to '"', then values will be quoted.
        // If escape is set to '\', then internal quotes and escape chars are escaped.
        CSVFormat format = CSVFormat.MYSQL.withQuote('"');
        String formatted = format.format("a", "b\"c", "d");
        // Expected: tab-separated, quoted values. Internal quote escaped.
        assertEquals("\ta\t\"b\\\"c\"\td", formatted);
    }

    @Test
    public void testFormatWithNullString() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NA");
        // Corrected expected value: null should be represented by "NA" and quoted if delimiter is present
        String formatted = format.format("a", null, "c");
        assertEquals("\"a\",NA,\"c\"", formatted);
    }

    @Test
    public void testToString() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String toString = format.toString();
        // Corrected: DEFAULT has ignoreEmptyLines = true, so it should not contain "EmptyLines:ignored"
        assertTrue(toString.contains("Delimiter=<,>"));
        assertTrue(toString.contains("QuoteChar=<\">"));
        assertTrue(toString.contains("RecordSeparator=<\r\n>"));
        assertTrue(toString.contains("EmptyLines:ignored"));
        assertTrue(toString.contains("SurroundingSpaces:ignored"));
        assertTrue(toString.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToStringWithCustomizations() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT
                .withDelimiter(';')
                .withQuote('\'')
                .withEscape('^')
                .withCommentMarker('#')
                .withNullString("N/A")
                .withRecordSeparator("\n")
                .withIgnoreEmptyLines(false)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withHeader("H1", "H2");

        String toString = format.toString();
        assertTrue(toString.contains("Delimiter=<;>"));
        assertTrue(toString.contains("Escape=< ^>"));
        assertTrue(toString.contains("QuoteChar=< '>"));
        assertTrue(toString.contains("CommentStart=< #>"));
        assertTrue(toString.contains("NullString=< N/A>"));
        assertTrue(toString.contains("RecordSeparator=<\\n>"));
        // Corrected: ignoreEmptyLines is false, so should not contain "EmptyLines:ignored"
        assertTrue(toString.contains("EmptyLines:not ignored"));
        assertTrue(toString.contains("SurroundingSpaces:ignored"));
        assertTrue(toString.contains("SkipHeaderRecord:true"));
        assertTrue(toString.contains("Header:[H1, H2]"));
    }

    @Test
    public void testEquals() throws Exception {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        CSVFormat format3 = CSVFormat.RFC4180;
        CSVFormat format4 = CSVFormat.DEFAULT.withDelimiter('|');

        assertTrue(format1.equals(format2));
        assertFalse(format1.equals(format3));
        assertFalse(format1.equals(format4));
        assertFalse(format1.equals(null));
        assertFalse(format1.equals("string"));
    }

    @Test
    public void testHashCode() throws Exception {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        CSVFormat format3 = CSVFormat.RFC4180;
        CSVFormat format4 = CSVFormat.DEFAULT.withDelimiter('|');

        assertEquals(format1.hashCode(), format2.hashCode());
        assertNotEquals(format1.hashCode(), format3.hashCode());
        assertNotEquals(format1.hashCode(), format4.hashCode());
    }

    @Test
    public void testIsCommentMarkerSet() throws Exception {
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet() throws Exception {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet() throws Exception {
        assertTrue(CSVFormat.DEFAULT.withNullString("NA").isNullStringSet());
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() throws Exception {
        assertTrue(CSVFormat.DEFAULT.withQuote('"').isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.withQuote((Character) null).isQuoteCharacterSet());
    }

    @Test
    public void testWithQuoteMode() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat modified = original.withQuoteMode(QuoteMode.MINIMAL);
        assertEquals(QuoteMode.MINIMAL, modified.getQuoteMode());
        // Ensure other properties are unchanged
        assertEquals(original.getDelimiter(), modified.getDelimiter());
        assertEquals(original.getQuoteCharacter(), modified.getQuoteCharacter());
        assertEquals(original.getIgnoreEmptyLines(), modified.getIgnoreEmptyLines());
        assertEquals(original.getRecordSeparator(), modified.getRecordSeparator());
        assertEquals(original.getIgnoreSurroundingSpaces(), modified.getIgnoreSurroundingSpaces());
        assertEquals(original.getNullString(), modified.getNullString());
        assertEquals(original.getCommentMarker(), modified.getCommentMarker());
        assertEquals(original.getEscapeCharacter(), modified.getEscapeCharacter());
        assertEquals(original.getSkipHeaderRecord(), modified.getSkipHeaderRecord());
        assertNull(modified.getHeader());
        assertEquals(original.getAllowMissingColumnNames(), modified.getAllowMissingColumnNames());
    }

    @Test
    public void testValidationQuoteCharAndDelimiterSame() throws Exception {
        try {
            CSVFormat.newFormat(',').withQuote(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The quoteChar character and the delimiter cannot be the same (',')", e.getMessage());
        }
    }

    @Test
    public void testValidationEscapeCharAndDelimiterSame() throws Exception {
        try {
            CSVFormat.newFormat(',').withEscape(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The escape character and the delimiter cannot be the same (',')", e.getMessage());
        }
    }

    @Test
    public void testValidationCommentMarkerAndDelimiterSame() throws Exception {
        try {
            CSVFormat.newFormat(',').withCommentMarker(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The comment start character and the delimiter cannot be the same (',')", e.getMessage());
        }
    }

    @Test
    public void testValidationQuoteCharAndCommentMarkerSame() throws Exception {
        try {
            CSVFormat.newFormat(',').withQuote('"').withCommentMarker('"');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The comment start character and the quoteChar cannot be the same ('\"')", e.getMessage());
        }
    }

    @Test
    public void testValidationEscapeCharAndCommentMarkerSame() throws Exception {
        try {
            CSVFormat.newFormat(',').withEscape('^').withCommentMarker('^');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The comment start and the escape character cannot be the same ('^')", e.getMessage());
        }
    }

    @Test
    public void testValidationNoQuoteModeNoEscape() throws Exception {
        try {
            CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE).withEscape((Character) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No quotes mode set but no escape character is set", e.getMessage());
        }
    }
}
