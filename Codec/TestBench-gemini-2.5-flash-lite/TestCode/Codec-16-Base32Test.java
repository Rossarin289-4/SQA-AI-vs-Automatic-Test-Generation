package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;

public class Base32Test {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testBase32EncodingEmpty() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[0]);
        assertEquals("", new String(encoded));
    }

    @Test
    public void testBase32EncodingWithNull() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(null);
        assertNotNull(encoded);
        assertEquals(0, encoded.length);
    }

    @Test
    public void testBase32EncodingBasic() throws Exception {
        Base32 base32 = new Base32();
        String original = "hello world";
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("25fg62zrdg63f15j", new String(encoded));
    }

    @Test
    public void testBase32EncodingMultipleBlocks() throws Exception {
        Base32 base32 = new Base32();
        String original = "Hello World, this is a test of the Base32 encoding.";
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0", new String(encoded));
    }

    @Test
    public void testBase32DecodingEmpty() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode(new byte[0]);
        assertEquals(0, decoded.length);
    }

    @Test
    public void testBase32DecodingWithNull() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode((byte[]) null);
        assertNotNull(decoded);
        assertEquals(0, decoded.length);
    }

    @Test
    public void testBase32DecodingBasic() throws Exception {
        Base32 base32 = new Base32();
        String encoded = "25fg62zrdg63f15j";
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("hello world", new String(decoded));
    }

    @Test
    public void testBase32DecodingMultipleBlocks() throws Exception {
        Base32 base32 = new Base32();
        String encoded = "JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0";
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("Hello World, this is a test of the Base32 encoding.", new String(decoded));
    }

    @Test
    public void testBase32DecodingInvalidChars() throws Exception {
        Base32 base32 = new Base32();
        String encoded = "JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0====="; // Padding is ignored
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("Hello World, this is a test of the Base32 encoding.", new String(decoded));
    }

    @Test
    public void testBase32HexEncodingEmpty() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] encoded = base32.encode(new byte[0]);
        assertEquals("", new String(encoded));
    }

    @Test
    public void testBase32HexDecodingEmpty() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] decoded = base32.decode(new byte[0]);
        assertEquals(0, decoded.length);
    }

    @Test
    public void testBase32HexEncodingBasic() throws Exception {
        Base32 base32 = new Base32(true); // Use Base32 Hex alphabet
        String original = "hello world";
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("33W26UR7GO3M04KF", new String(encoded));
    }

    @Test
    public void testBase32HexDecodingBasic() throws Exception {
        Base32 base32 = new Base32(true); // Use Base32 Hex alphabet
        String encoded = "33W26UR7GO3M04KF";
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("hello world", new String(decoded));
    }

    @Test
    public void testBase32EncodingWithLineLength() throws Exception {
        Base32 base32 = new Base32(76); // CRLF line separator
        String original = "Hello World, this is a test of the Base32 encoding.";
        byte[] encoded = base32.encode(original.getBytes());
        String expected = "JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0\r\n";
        assertEquals(expected, new String(encoded));
    }

    @Test
    public void testBase32EncodingWithLineLengthAndSeparator() throws Exception {
        Base32 base32 = new Base32(32, new byte[]{'|'}); // Custom separator
        String original = "Hello World, this is a test of the Base32 encoding.";
        byte[] encoded = base32.encode(original.getBytes());
        String expected = "JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0|".replace("|", new String(new byte[]{'|'}));
        assertEquals(expected, new String(encoded));
    }

    @Test
    public void testBase32DecodingWithLineLengthAndSeparator() throws Exception {
        Base32 base32 = new Base32(32, new byte[]{'|'}); // Custom separator
        String encoded = "JBSWY3DPEBLW63TNI5KSA2DVNU5HK3TNI5KSA2DVNR5HJJJ0|".replace("|", new String(new byte[]{'|'}));
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("Hello World, this is a test of the Base32 encoding.", new String(decoded));
    }

    @Test
    public void testBase32EncodingWithCustomPad() throws Exception {
        Base32 base32 = new Base32(0, null, false, (byte) '.');
        String original = "foobar"; // 6 bytes -> 48 bits -> 48/5 = 9.6 -> 10 chars, 2 padding
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("MZXW6===".replace("=", "."), new String(encoded));
    }

    @Test
    public void testBase32DecodingWithCustomPad() throws Exception {
        Base32 base32 = new Base32(0, null, false, (byte) '.');
        String encoded = "MZXW6===".replace("=", ".");
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("foobar", new String(decoded));
    }

    @Test
    public void testBase32EncodingHexWithLineLength() throws Exception {
        Base32 base32 = new Base32(76, null, true); // Use Base32 Hex alphabet
        String original = "Hello World, this is a test of the Base32 Hex encoding.";
        byte[] encoded = base32.encode(original.getBytes());
        String expected = "33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF33W26UR7GO3M04KF\r\n";
        assertEquals(expected, new String(encoded));
    }

    @Test
    public void testBase32HexDecodingWithPadding() throws Exception {
        Base32 base32 = new Base32(true);
        String encoded = "33W26UR7GO3M04KF===="; // Padding is ignored
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("hello world", new String(decoded));
    }

    @Test
    public void testBase32EncodingSingleByte() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01}); // 00000001 -> 00000 001xx -> A, pad
        assertEquals("AA====", new String(encoded));
    }

    @Test
    public void testBase32DecodingSingleByte() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("AA====".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01}, decoded);
    }

    @Test
    public void testBase32EncodingTwoBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01, (byte) 0x02}); // 00000001 00000010 -> 00000 00100 00001 0.... -> A, B, C, pad
        assertEquals("A2C===", new String(encoded));
    }

    @Test
    public void testBase32DecodingTwoBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("A2C===".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x02}, decoded);
    }

    @Test
    public void testBase32EncodingThreeBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03}); // 00000001 00000010 00000011 -> 00000 00100 00001 00000 011.... -> A, B, C, D, pad
        assertEquals("A2CD==", new String(encoded));
    }

    @Test
    public void testBase32DecodingThreeBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("A2CD==".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03}, decoded);
    }

    @Test
    public void testBase32EncodingFourBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04}); // 00000001 00000010 00000011 00000100 -> 00000 00100 00001 00000 01100 00100 -> A, B, C, D, E, pad
        assertEquals("A2CDE=", new String(encoded));
    }

    @Test
    public void testBase32DecodingFourBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("A2CDE=".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04}, decoded);
    }

    @Test
    public void testBase32EncodingFiveBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05}); // 00000001 00000010 00000011 00000100 00000101 -> 00000 00100 00001 00000 01100 00100 00000 101 -> A, B, C, D, E, F, G, pad
        assertEquals("A2CDEFG", new String(encoded));
    }

    @Test
    public void testBase32DecodingFiveBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("A2CDEFG".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05}, decoded);
    }

    @Test
    public void testBase32EncodingHexSingleByte() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01}); // 00000001 -> 00000 001xx -> 0, 1, pad
        assertEquals("01====", new String(encoded));
    }

    @Test
    public void testBase32DecodingHexSingleByte() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] decoded = base32.decode("01====".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01}, decoded);
    }

    @Test
    public void testBase32EncodingHexFiveBytes() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] encoded = base32.encode(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05});
        assertEquals("0102030405", new String(encoded));
    }

    @Test
    public void testBase32DecodingHexFiveBytes() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] decoded = base32.decode("0102030405".getBytes());
        assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05}, decoded);
    }

    @Test
    public void testBase32EncodingConsecutiveBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] bytes = new byte[10];
        for(int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)i;
        }
        byte[] encoded = base32.encode(bytes);
        assertEquals("A0A1A2A3A4A5A6A7A8A9", new String(encoded));
    }

    @Test
    public void testBase32DecodingConsecutiveBytes() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("A0A1A2A3A4A5A6A7A8A9".getBytes());
        byte[] bytes = new byte[10];
        for(int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)i;
        }
        assertArrayEquals(bytes, decoded);
    }

    @Test
    public void testBase32EncodingHexConsecutiveBytes() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] bytes = new byte[10];
        for(int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)i;
        }
        byte[] encoded = base32.encode(bytes);
        assertEquals("00010203040506070809", new String(encoded));
    }

    @Test
    public void testBase32DecodingHexConsecutiveBytes() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] decoded = base32.decode("00010203040506070809".getBytes());
        byte[] bytes = new byte[10];
        for(int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)i;
        }
        assertArrayEquals(bytes, decoded);
    }

    @Test
    public void testBase32EncodingMaximalByteValue() throws Exception {
        Base32 base32 = new Base32();
        byte[] encoded = base32.encode(new byte[]{(byte) 0xff});
        assertEquals("//8=", new String(encoded));
    }

    @Test
    public void testBase32DecodingMaximalByteValue() throws Exception {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("//8=".getBytes());
        assertArrayEquals(new byte[]{(byte) 0xff}, decoded);
    }

    @Test
    public void testBase32EncodingHexMaximalByteValue() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] encoded = base32.encode(new byte[]{(byte) 0xff});
        assertEquals("FF==", new String(encoded));
    }

    @Test
    public void testBase32DecodingHexMaximalByteValue() throws Exception {
        Base32 base32 = new Base32(true);
        byte[] decoded = base32.decode("FF==".getBytes());
        assertArrayEquals(new byte[]{(byte) 0xff}, decoded);
    }

    @Test
    public void testBase32EncodingVeryLongString() throws Exception {
        Base32 base32 = new Base32();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("This is a long string for testing purposes.");
        }
        String original = sb.toString();
        byte[] encoded = base32.encode(original.getBytes());
        String encodedString = new String(encoded);
        Base32 base32Decoder = new Base32(); // Use default for decoding
        byte[] decoded = base32Decoder.decode(encodedString.getBytes());
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testBase32DecodingVeryLongString() throws Exception {
        Base32 base32 = new Base32();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("This is a long string for testing purposes.");
        }
        String original = sb.toString();
        byte[] encoded = base32.encode(original.getBytes());
        Base32 base32Decoder = new Base32();
        byte[] decoded = base32Decoder.decode(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testBase32HexEncodingVeryLongString() throws Exception {
        Base32 base32 = new Base32(true);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("This is a long string for testing purposes.");
        }
        String original = sb.toString();
        byte[] encoded = base32.encode(original.getBytes());
        String encodedString = new String(encoded);
        Base32 base32Decoder = new Base32(true);
        byte[] decoded = base32Decoder.decode(encodedString.getBytes());
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testBase32DecodingHexVeryLongString() throws Exception {
        Base32 base32 = new Base32(true);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("This is a long string for testing purposes.");
        }
        String original = sb.toString();
        byte[] encoded = base32.encode(original.getBytes());
        Base32 base32Decoder = new Base32(true);
        byte[] decoded = base32Decoder.decode(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testBase32EncodingWithLineLengthAndSeparatorThatNeedsPadding() throws Exception {
        Base32 base32 = new Base32(10, new byte[]{'-'});
        String original = "test"; // 4 bytes -> 32 bits -> 6.4 chars -> 7 chars, 3 padding
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("GEZDGNSA-", new String(encoded));
    }

    @Test
    public void testBase32DecodingWithLineLengthAndSeparatorThatNeedsPadding() throws Exception {
        Base32 base32 = new Base32(10, new byte[]{'-'});
        String encoded = "GEZDGNSA-";
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("test", new String(decoded));
    }

    @Test
    public void testBase32EncodingWithLineLengthZero() throws Exception {
        Base32 base32 = new Base32(0, null); // No chunking
        String original = "Hello World";
        byte[] encoded = base32.encode(original.getBytes());
        assertEquals("25fg62zrdg63f15j", new String(encoded));
    }

    @Test
    public void testBase32DecodingWithLineLengthZero() throws Exception {
        Base32 base32 = new Base32(0, null); // No chunking
        String encoded = "25fg62zrdg63f15j";
        byte[] decoded = base32.decode(encoded.getBytes());
        assertEquals("Hello World", new String(decoded));
    }

    @Test
    public void testBase32EncodingForConstructorValidation() throws Exception {
        // Test constructor logic that is not directly encoding/decoding
        // Line lengths that aren't multiples of 8 will still essentially end up being multiples of 8
        Base32 base32 = new Base32(77, null); // lineLength > 0, lineSeparator null -> Exception
        try {
            base32.encode("test".getBytes()); // Should not reach here
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBase32EncodingWithLineSeparatorContainingBase32Chars() throws Exception {
        // Test constructor logic that is not directly encoding/decoding
        // Line separator contains Base32 characters -> Exception
        Base32 base32 = new Base32(76, new byte[]{'A'});
        try {
            base32.encode("test".getBytes()); // Should not reach here
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBase32EncodingWithPadContainingBase32Chars() throws Exception {
        // Test constructor logic for pad validation
        Base32 base32 = new Base32(false, (byte)'A'); // Pad character 'A' is in Base32 alphabet
        try {
            base32.encode("test".getBytes()); // Should not reach here
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBase32EncodingWithPadContainingWhitespace() throws Exception {
        // Test constructor logic for pad validation
        Base32 base32 = new Base32(false, (byte)' '); // Pad character space is whitespace
        try {
            base32.encode("test".getBytes()); // Should not reach here
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}
