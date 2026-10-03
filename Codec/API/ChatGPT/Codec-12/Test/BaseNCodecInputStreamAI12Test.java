package org.apache.commons.codec.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class BaseNCodecInputStreamAI12Test {

    @Test
    public void testMarkSupported() {
        byte[] buf = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        BaseNCodec codec = new Base64();
        BaseNCodecInputStream in = new BaseNCodecInputStream(bais, codec, true);
        assertFalse(in.markSupported());
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullByteArray() throws IOException {
        byte[] buf = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        BaseNCodec codec = new Base64();
        BaseNCodecInputStream in = new BaseNCodecInputStream(bais, codec, true);
        in.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidOffset() throws IOException {
        byte[] buf = new byte[10];
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        BaseNCodec codec = new Base64();
        BaseNCodecInputStream in = new BaseNCodecInputStream(bais, codec, true);
        byte[] dest = new byte[5];
        in.read(dest, -1, 2);
    }

}
