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
    public void testNewFormatDefaultFields() throws Exception {
        CSVFormat f = CSVFormat.newFormat(';');
        assertEquals(';', f.getDelimiter());
        assertNull(f.getQuoteCharacter());
        assertNull(f.getRecordSeparator());
    }

    @Test
    public void testNewFormatRejectsLineFeed() throws Exception {
        try { CSVFormat.newFormat('\n'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNewFormatRejectsCarriageReturn() throws Exception {
        try { CSVFormat.newFormat('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testImmutableWithMethodsAndGetters() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withCommentMarker('#').withEscape('\\')
                .withHeader("a", "b").withAllowMissingColumnNames(true)
                .withIgnoreEmptyLines(false).withIgnoreSurroundingSpaces(true)
                .withNullString("N/A").withQuote('\'').withRecordSeparator("|")
                .withSkipHeaderRecord(true);
        assertEquals('#', f.getCommentMarker().charValue());
        assertEquals('\\', f.getEscapeCharacter().charValue());
        assertArrayEquals(new String[] {"a", "b"}, f.getHeader());
        assertTrue(f.getAllowMissingColumnNames());
        assertFalse(f.getIgnoreEmptyLines());
        assertTrue(f.getIgnoreSurroundingSpaces());
        assertEquals("N/A", f.getNullString());
        assertEquals('\'', f.getQuoteCharacter().charValue());
        assertEquals("|", f.getRecordSeparator());
        assertTrue(f.getSkipHeaderRecord());
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
    }

    @Test
    public void testHeaderIsCopiedOnInputAndOutput() throws Exception {
        String[] names = {"first", "second"};
        CSVFormat f = CSVFormat.newFormat(',').withHeader(names);
        names[0] = "changed";
        String[] result = f.getHeader();
        assertEquals("first", result[0]);
        result[1] = "changed";
        assertArrayEquals(new String[] {"first", "second"}, f.getHeader());
    }

    @Test
    public void testHeaderDuplicateRejected() throws Exception {
        try { CSVFormat.newFormat(',').withHeader("x", "x"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEmptyHeaderDistinguishedFromDisabled() throws Exception {
        assertNull(CSVFormat.newFormat(',').getHeader());
        assertArrayEquals(new String[0], CSVFormat.newFormat(',').withHeader().getHeader());
    }

    @Test
    public void testFeatureFlagsWithNullAndConfiguredValues() throws Exception {
        CSVFormat f = CSVFormat.newFormat(',').withCommentMarker('#').withEscape('\\')
                .withNullString("nil").withQuote('"');
        assertTrue(f.isCommentMarkerSet());
        assertTrue(f.isEscapeCharacterSet());
        assertTrue(f.isNullStringSet());
        assertTrue(f.isQuoteCharacterSet());
        CSVFormat empty = CSVFormat.newFormat(',');
        assertFalse(empty.isCommentMarkerSet());
        assertFalse(empty.isEscapeCharacterSet());
        assertFalse(empty.isNullStringSet());
        assertFalse(empty.isQuoteCharacterSet());
    }

    @Test
    public void testNullableOptionsCanBeDisabled() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withCommentMarker('#').withEscape('\\')
                .withNullString("nil").withQuote('"');
        f = f.withCommentMarker((Character) null).withEscape((Character) null)
                .withNullString(null).withQuote((Character) null);
        assertNull(f.getCommentMarker());
        assertNull(f.getEscapeCharacter());
        assertNull(f.getNullString());
        assertNull(f.getQuoteCharacter());
        assertFalse(f.isCommentMarkerSet());
        assertFalse(f.isEscapeCharacterSet());
        assertFalse(f.isNullStringSet());
        assertFalse(f.isQuoteCharacterSet());
    }

    @Test
    public void testRejectsLineBreakForCommentEscapeQuoteAndDelimiter() throws Exception {
        try { CSVFormat.DEFAULT.withCommentMarker('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.DEFAULT.withEscape('\n'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.DEFAULT.withQuote('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.DEFAULT.withDelimiter('\n'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRejectsConflictingDelimiterAndSpecialCharacters() throws Exception {
        try { CSVFormat.newFormat(',').withQuote(','); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.newFormat(',').withEscape(','); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.newFormat(',').withCommentMarker(','); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRejectsEqualQuoteCommentAndEscapeComment() throws Exception {
        try { CSVFormat.newFormat(',').withQuote('"').withCommentMarker('"'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testQuoteModeNoneRequiresEscape() throws Exception {
        try { CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(QuoteMode.NONE, CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE).getQuoteMode());
    }

    @Test
    public void testEqualsAndHashCodeForEqualFormats() throws Exception {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("a").withNullString("nil");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("a").withNullString("nil");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, CSVFormat.DEFAULT);
    }

    @Test
    public void testEqualsRejectsNullAndOtherType() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT;
        assertFalse(f.equals(null));
        assertFalse(f.equals("format"));
        assertTrue(f.equals(f));
    }

    @Test
    public void testToStringIncludesConfiguredOptions() throws Exception {
        CSVFormat f = CSVFormat.newFormat(';').withEscape('\\').withQuote('"')
                .withCommentMarker('#').withNullString("nil")
                .withRecordSeparator("\n").withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true).withSkipHeaderRecord(true)
                .withHeader("a", "b");
        String s = f.toString();
        assertTrue(s.contains("Delimiter=<;>"));
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<nil>"));
        assertTrue(s.contains("Header:[a, b]"));
        assertTrue(s.endsWith("SkipHeaderRecord:true Header:[a, b]"));
    }

    @Test
    public void testToStringOmitsUnsetOptions() throws Exception {
        String s = CSVFormat.newFormat(',').toString();
        assertEquals("Delimiter=<,> SkipHeaderRecord:false", s);
    }

    @Test
    public void testFormatUsesDelimiterAndQuoting() throws Exception {
        assertEquals("a;b", CSVFormat.DEFAULT.withDelimiter(';').format("a", "b"));
        assertEquals("\"a,b\",c", CSVFormat.DEFAULT.format("a,b", "c"));
    }

    @Test
    public void testFormatNullConversion() throws Exception {
        assertEquals("N/A,x", CSVFormat.DEFAULT.withNullString("N/A").format(null, "x"));
    }

    @Test
    public void testParseReaderWithConfiguredDelimiter() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withDelimiter(';');
        CSVParser parser = f.parse(new java.io.StringReader("a;b\n"));
        assertEquals(1, parser.getRecords().size());
    }

    @Test
    public void testPrintCreatesPrinterForAppendable() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecord("a", "b");
        assertEquals("a,b\r\n", out.toString());
    }

    @Test
    public void testRecordSeparatorAndFlagsDefaults() throws Exception {
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());
    }
}
