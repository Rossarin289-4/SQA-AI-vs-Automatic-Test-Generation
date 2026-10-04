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
    public void testNewFormatUsesRequestedDelimiter() throws Exception {
        assertEquals(';', CSVFormat.newFormat(';').getDelimiter());
    }

    @Test
    public void testNewFormatRejectsLineFeedDelimiter() throws Exception {
        try { CSVFormat.newFormat('\n'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNewFormatRejectsCarriageReturnDelimiter() throws Exception {
        try { CSVFormat.newFormat('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualsAndHashCodeForEqualFormats() throws Exception {
        CSVFormat left = CSVFormat.DEFAULT.withDelimiter(';').withHeader("a", "b");
        CSVFormat right = CSVFormat.DEFAULT.withDelimiter(';').withHeader("a", "b");
        assertEquals(left, right);
        assertEquals(left.hashCode(), right.hashCode());
    }

    @Test
    public void testEqualsRejectsDifferentDelimiterAndNull() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        assertFalse(format.equals(format.withDelimiter(';')));
        assertFalse(format.equals(null));
    }

    @Test
    public void testFormatValuesWithDefaultFormat() throws Exception {
        assertEquals("a,b", CSVFormat.DEFAULT.format("a", "b"));
    }

    @Test
    public void testFormatQuotesValueContainingDelimiter() throws Exception {
        assertEquals("\"a,b\"", CSVFormat.DEFAULT.format("a,b"));
    }

    @Test
    public void testFormatUsesConfiguredNullString() throws Exception {
        assertEquals("N/A", CSVFormat.DEFAULT.withNullString("N/A").format((Object) null));
    }

    @Test
    public void testGettersAndEnabledFlagsForConfiguredFormat() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withEscape('\\')
                .withNullString("NA").withQuoteChar('\'');
        assertEquals(Character.valueOf('#'), format.getCommentStart());
        assertEquals(Character.valueOf('\\'), format.getEscape());
        assertEquals("NA", format.getNullString());
        assertEquals(Character.valueOf('\''), format.getQuoteChar());
        assertTrue(format.isCommentingEnabled());
        assertTrue(format.isEscaping());
        assertTrue(format.isNullHandling());
        assertTrue(format.isQuoting());
    }

    @Test
    public void testDefaultAndConfiguredFlags() throws Exception {
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
        CSVFormat configured = CSVFormat.DEFAULT.withIgnoreEmptyLines(false)
                .withIgnoreSurroundingSpaces(true).withSkipHeaderRecord(true);
        assertFalse(configured.getIgnoreEmptyLines());
        assertTrue(configured.getIgnoreSurroundingSpaces());
        assertTrue(configured.getSkipHeaderRecord());
    }

    @Test
    public void testHeaderIsCopiedOnInputAndOutput() throws Exception {
        String[] input = {"one", "two"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(input);
        input[0] = "changed";
        String[] output = format.getHeader();
        assertEquals("one", output[0]);
        output[1] = "changed";
        assertEquals("two", format.getHeader()[1]);
    }

    @Test
    public void testNullHeaderRemainsNull() throws Exception {
        assertNull(CSVFormat.DEFAULT.withHeader((String[]) null).getHeader());
    }

    @Test
    public void testDuplicateHeaderIsRejected() throws Exception {
        try { CSVFormat.DEFAULT.withHeader("x", "x"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToStringIncludesEnabledSettings() throws Exception {
        String text = CSVFormat.DEFAULT.withDelimiter(';').withEscape('\\')
                .withCommentStart('#').withNullString("NA").withHeader("a")
                .withSkipHeaderRecord(true).toString();
        assertTrue(text.contains("Delimiter=<;>"));
        assertTrue(text.contains("Escape=<\\>"));
        assertTrue(text.contains("CommentStart=<#>"));
        assertTrue(text.contains("NullString=<NA>"));
        assertTrue(text.contains("SkipHeaderRecord:true"));
        assertTrue(text.contains("Header:[a]"));
    }

    @Test
    public void testToStringOmitsDisabledOptionalCharacters() throws Exception {
        String text = CSVFormat.newFormat(';').toString();
        assertEquals("Delimiter=<;> SkipHeaderRecord:false", text);
    }

    @Test
    public void testWithMethodsDoNotChangeOriginalFormat() throws Exception {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat changed = original.withDelimiter('|').withRecordSeparator("\n");
        assertEquals(',', original.getDelimiter());
        assertEquals("\r\n", original.getRecordSeparator());
        assertEquals('|', changed.getDelimiter());
        assertEquals("\n", changed.getRecordSeparator());
    }

    @Test
    public void testWithHeaderRejectsDuplicateAtLastPosition() throws Exception {
        try { CSVFormat.DEFAULT.withHeader("a", "b", "a"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithQuoteCharRejectsLineBreak() throws Exception {
        try { CSVFormat.DEFAULT.withQuoteChar('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithCommentStartRejectsLineBreak() throws Exception {
        try { CSVFormat.DEFAULT.withCommentStart('\n'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithEscapeRejectsLineBreak() throws Exception {
        try { CSVFormat.DEFAULT.withEscape('\r'); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithRecordSeparatorCharacterAndString() throws Exception {
        assertEquals(";", CSVFormat.DEFAULT.withRecordSeparator(';').getRecordSeparator());
        assertEquals("END", CSVFormat.DEFAULT.withRecordSeparator("END").getRecordSeparator());
    }

    @Test
    public void testParseConstructsParserForEmptyInput() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.parse(new java.io.StringReader(""));
        try {
            assertTrue(parser.getRecords().isEmpty());
        } finally {
            parser.close();
        }
    }
}
