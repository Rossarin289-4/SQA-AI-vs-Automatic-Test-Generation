package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class NumericEntityUnescaperLang28Test {

    @Test
    public void testDecimalSupplementaryCodePointProducesSurrogatePair() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#128512;", 0, out);

        assertEquals(new String(Character.toChars(128512)), out.toString());
        assertEquals(9, consumed);
    }

    @Test
    public void testHexSupplementaryCodePointProducesSurrogatePair() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#x1F680;", 0, out);

        assertEquals(new String(Character.toChars(0x1F680)), out.toString());
        assertEquals(9, consumed);
    }

    @Test
    public void testDifferentHexSupplementaryCodePointProducesSurrogatePair() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#x1D11E;", 0, out);

        assertEquals(new String(Character.toChars(0x1D11E)), out.toString());
        assertEquals(9, consumed);
    }

    @Test
    public void testDecimalSupplementaryCodePointWithDifferentValue() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#128169;", 0, out);

        assertEquals(new String(Character.toChars(128169)), out.toString());
        assertEquals(9, consumed);
    }

    @Test
    public void testMaximumBmpCodePointRemainsSingleCharacter() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#65535;", 0, out);

        assertEquals(new String(Character.toChars(65535)), out.toString());
        assertEquals(8, consumed);
    }

    @Test
    public void testFirstSupplementaryCodePointProducesTwoCharacters() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#65536;", 0, out);

        assertEquals(new String(Character.toChars(65536)), out.toString());
        assertEquals(8, consumed);
    }

    @Test
    public void testOrdinaryBmpHexEntityRemainsUnchanged() throws Exception {
        Writer out = new StringWriter();

        int consumed = new NumericEntityUnescaper().translate(
                "&#x20AC;", 0, out);

        assertEquals(new String(Character.toChars(0x20AC)), out.toString());
        assertEquals(8, consumed);
    }
}
