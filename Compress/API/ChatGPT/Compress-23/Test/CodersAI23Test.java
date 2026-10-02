package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CodersAI23Test {

    @Test(expected = IOException.class)
    public void testAddDecoderUnsupportedMethod() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[] { (byte) 0xFF, (byte) 0xFF };
        Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
    }

    @Test(expected = IOException.class)
    public void testAddEncoderUnsupportedMethod() throws IOException {
        Coders.addEncoder(null, null, null);
    }

    @Test(expected = IOException.class)
    public void testLZMADecoderInvalidDictionarySize() throws IOException {
        Coder coder = new Coder();
        coder.properties = new byte[] { 0, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, 0 };
        CoderBase lzmaDecoder = new Coders.LZMADecoder();
        lzmaDecoder.decode(new ByteArrayInputStream(new byte[10]), coder, null);
    }
}
