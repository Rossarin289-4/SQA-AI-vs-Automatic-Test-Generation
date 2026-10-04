package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CSVFormatTest {
    @Test
    public void testNewFormatAndDelimiterEdges() throws Exception {
        assertEquals(';', CSVFormat.newFormat(';').getDelimiter());
        try {
            CSVFormat.newFormat('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.newFormat('\r');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testValueOfPredefinedNames() throws Exception {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
    }

    @Test
    public void testEqualityAndHashCodeTrackFields() throws Exception {
        CSVFormat first = CSVFormat.DEFAULT.withDelimiter(';').withHeader("a", "b");
        CSVFormat equivalent = CSVFormat.DEFAULT.withDelimiter(';').withHeader("a", "b");
        CSVFormat changed = CSVFormat.DEFAULT.withDelimiter('|').withHeader("a", "b");
        assertEquals(first, equivalent);
        assertEquals(first.hashCode(), equivalent.hashCode());
        assertFalse(first.equals(changed));
        assertFalse(first.equals(null));
    }

    @Test
    public void testFormatQuotesDelimiterAndDoublesQuote() throws Exception {
        assertEquals("\"a,b\",\"say \"\"hi\"\"\"", CSVFormat.DEFAULT.format("a,b", "say \"hi\""));
    }

    @Test
    public void testFormatNullStringAndTrim() throws Exception {
        assertEquals("N/A,x", CSVFormat.DEFAULT.withNullString("N/A").format(null, "x"));
        assertEquals("x", CSVFormat.DEFAULT.withTrim().format("  x  "));
    }

    @Test
    public void testFormatQuotesEmptyFirstValue() throws Exception {
        assertEquals("\"\",x", CSVFormat.DEFAULT.format("", "x"));
    }

    @Test
    public void testDefaultConfigurationGetters() throws Exception {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals('"', CSVFormat.DEFAULT.getQuoteCharacter().charValue());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testWithMethodsCopyAndSetOptions() throws Exception {
        CSVFormat configured = CSVFormat.DEFAULT.withAllowMissingColumnNames()
                .withCommentMarker('#').withEscape('\\').withIgnoreHeaderCase()
                .withSkipHeaderRecord().withTrailingDelimiter().withTrim().withAutoFlush(true);
        assertTrue(configured.getAllowMissingColumnNames());
        assertEquals(Character.valueOf('#'), configured.getCommentMarker());
        assertEquals(Character.valueOf('\\'), configured.getEscapeCharacter());
        assertTrue(configured.getIgnoreHeaderCase());
        assertTrue(configured.getSkipHeaderRecord());
        assertTrue(configured.getTrailingDelimiter());
        assertTrue(configured.getTrim());
        assertTrue(configured.getAutoFlush());
        assertFalse(CSVFormat.DEFAULT.getAutoFlush());
    }

    @Test
    public void testHeaderAndHeaderCommentsAreDefensivelyCopied() throws Exception {
        String[] names = new String[] {"left", "right"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(names).withHeaderComments("generated", 7);
        names[0] = "changed";
        assertArrayEquals(new String[] {"left", "right"}, format.getHeader());
        String[] retrieved = format.getHeader();
        retrieved[1] = "changed";
        assertArrayEquals(new String[] {"left", "right"}, format.getHeader());
        assertArrayEquals(new String[] {"generated", "7"}, format.getHeaderComments());
    }

    @Test
    public void testHeaderDuplicateValidation() throws Exception {
        try {
            CSVFormat.DEFAULT.withHeader("same", "same");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertArrayEquals(new String[] {"same", "other"}, CSVFormat.DEFAULT.withHeader("same", "other").getHeader());
    }

    @Test
    public void testWithFirstRecordAsHeader() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertArrayEquals(new String[0], format.getHeader());
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testQuoteAndEscapeSettersRejectLineBreaks() throws Exception {
        try {
            CSVFormat.DEFAULT.withQuote('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.DEFAULT.withEscape('\r');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.DEFAULT.withCommentMarker('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithTrailingDelimiterAndRecordSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.DEFAULT.withTrailingDelimiter().withRecordSeparator("|").printRecord(out, "a", "b");
        assertEquals("a,b,|", out.toString());
        StringBuilder line = new StringBuilder();
        CSVFormat.DEFAULT.withTrailingDelimiter().println(line);
        assertEquals(",\r\n", line.toString());
    }

    @Test
    public void testPrintRecordEscapesSpecialCharacters() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.newFormat(',').withEscape('\\').printRecord(out, "a,b", "x\ny");
        assertEquals("a\\,b,x\\ny", out.toString());
    }

    @Test
    public void testPrintUsesConfiguredQuoteMode() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).printRecord(out, "a", "b");
        assertEquals("\"a\",\"b\"\r\n", out.toString());
    }

    @Test
    public void testToStringIncludesConfiguredOptions() throws Exception {
        String text = CSVFormat.DEFAULT.withCommentMarker('#').withHeader("name").toString();
        assertTrue(text.contains("CommentStart=<#>"));
        assertTrue(text.contains("Header:[name]"));
        assertTrue(text.contains("Delimiter=<,>"));
    }

    @Test
    public void testFormatNoValuesIsEmpty() throws Exception {
        assertEquals("", CSVFormat.DEFAULT.format());
    }

    @Test
    public void testPredefinedFormatGetter() throws Exception {
        assertSame(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertSame(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
    }

    @Test
    public void testIgnoreSurroundingSpacesConfigurations() throws Exception {
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().getIgnoreSurroundingSpaces());
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().withIgnoreSurroundingSpaces(false)
                .getIgnoreSurroundingSpaces());
    }

    @Test
    public void testNullStringAndSetFlag() throws Exception {
        CSVFormat configured = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", configured.getNullString());
        assertTrue(configured.isNullStringSet());
        assertNull(CSVFormat.DEFAULT.getNullString());
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testQuoteModeGetter() throws Exception {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
        assertEquals(QuoteMode.ALL, CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).getQuoteMode());
    }

    @Test
    public void testCommentEscapeAndQuoteSetFlags() throws Exception {
        CSVFormat configured = CSVFormat.newFormat(';').withCommentMarker('#').withEscape('\\').withQuote('"');
        assertTrue(configured.isCommentMarkerSet());
        assertTrue(configured.isEscapeCharacterSet());
        assertTrue(configured.isQuoteCharacterSet());
        assertFalse(CSVFormat.newFormat(';').isCommentMarkerSet());
        assertFalse(CSVFormat.newFormat(';').isEscapeCharacterSet());
        assertFalse(CSVFormat.newFormat(';').isQuoteCharacterSet());
    }

    @Test
    public void testParseReaderWithConfiguredFormat() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withHeader("name", "value").parse(new java.io.StringReader("a,b"));
        try {
            assertEquals(1, parser.getRecords().size());
        } finally {
            parser.close();
        }
    }

    @Test
    public void testPrintAppendableReturnsPrinterWritingToSameAppendable() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        try {
            printer.printRecord("a", "b");
        } finally {
            printer.close();
        }
        assertEquals("a,b\r\n", out.toString());
    }

    @Test
    public void testIgnoreEmptyLinesNoArgumentEnablesAndBooleanCanDisable() throws Exception {
        assertTrue(CSVFormat.DEFAULT.withIgnoreEmptyLines().getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines().withIgnoreEmptyLines(false).getIgnoreEmptyLines());
    }

    @Test
    public void testIgnoreEmptyLinesChangesParsingOfBlankRecords() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withIgnoreEmptyLines(false).parse(new java.io.StringReader("\na\n"));
        try {
            assertEquals(2, parser.getRecords().size());
        } finally {
            parser.close();
        }
    }

    @Test
    public void testPrinterFactoryCanWriteRecord() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        try {
            printer.printRecord("x");
        } finally {
            printer.close();
        }
        assertEquals("x\r\n", out.toString());
    }
}
