package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Base32AI16Test {

    @Test
    public void testEncodeAndDecodeBasic() {
        Base32 base32 = new Base32();
        byte[] input = "hello".getBytes();
        byte[] encoded = base32.encode(input);
        byte[] decoded = base32.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testIsInAlphabet() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) '1'));
        assertFalse(base32.isInAlphabet((byte) '-'));
    }

    @Test
    public void testEncodeWithPadding() {
        Base32 base32 = new Base32();
        byte[] input = "a".getBytes();
        byte[] encoded = base32.encode(input);
        byte[] decoded = base32.decode(encoded);
        assertArrayEquals(input, decoded);
    }
}
