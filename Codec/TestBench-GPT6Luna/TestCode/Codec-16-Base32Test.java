package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;

public class Base32Test {
    @Test
    public void testAlphabetA() throws Exception {
        assertTrue(new Base32().isInAlphabet((byte) 'A'));
    }

    @Test
    public void testAlphabetZ() throws Exception {
        assertTrue(new Base32().isInAlphabet((byte) 'Z'));
    }

    @Test
    public void testAlphabetTwo() throws Exception {
        assertTrue(new Base32().isInAlphabet((byte) '2'));
    }

    @Test
    public void testAlphabetSeven() throws Exception {
        assertTrue(new Base32().isInAlphabet((byte) '7'));
    }

    @Test
    public void testLowercaseNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) 'a'));
    }

    @Test
    public void testDigitOneNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) '1'));
    }

    @Test
    public void testAtSignNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) '@'));
    }

    @Test
    public void testAfterZNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) '['));
    }

    @Test
    public void testNegativeByteNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) -1));
    }

    @Test
    public void testZeroByteNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) 0));
    }

    @Test
    public void testLargestByteNotAlphabet() throws Exception {
        assertFalse(new Base32().isInAlphabet((byte) 127));
    }

    @Test
    public void testHexZeroIsAlphabet() throws Exception {
        assertTrue(new Base32(true).isInAlphabet((byte) '0'));
    }

    @Test
    public void testHexNineIsAlphabet() throws Exception {
        assertTrue(new Base32(true).isInAlphabet((byte) '9'));
    }

    @Test
    public void testHexAIsAlphabet() throws Exception {
        assertTrue(new Base32(true).isInAlphabet((byte) 'A'));
    }

    @Test
    public void testHexVIsAlphabet() throws Exception {
        assertTrue(new Base32(true).isInAlphabet((byte) 'V'));
    }

    @Test
    public void testHexWNotAlphabet() throws Exception {
        assertFalse(new Base32(true).isInAlphabet((byte) 'W'));
    }

    @Test
    public void testHexTwoIsAlphabet() throws Exception {
        assertTrue(new Base32(true).isInAlphabet((byte) '2'));
    }

    @Test
    public void testHexLowercaseNotAlphabet() throws Exception {
        assertFalse(new Base32(true).isInAlphabet((byte) 'a'));
    }
}
