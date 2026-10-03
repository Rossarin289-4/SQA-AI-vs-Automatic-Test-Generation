package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64AI9Test {

    @Test
    public void testEncodeDecodeBytes() {
        Base64 base64 = new Base64();
        byte[] original = "Hello, World!".getBytes();
        byte[] encoded = base64.encode(original);
        assertNotNull(encoded);

        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] original = "Test".getBytes();
        Object encodedObj = base64.encode((Object) original);
        assertNotNull(encodedObj);
        assertArrayEquals(base64.encode(original), (byte[]) encodedObj);
    }

    @Test
    public void testIntegerCodec() {
        BigInteger bigInt = BigInteger.valueOf(123456789L);
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertNotNull(encoded);

        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);
    }
}
