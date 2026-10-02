package org.apache.commons.codec.net;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class QuotedPrintableCodecAI11Test {

    @Test
    public void testNullHandling() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((String) null));
        assertNull(codec.decode((String) null));
        assertNull(codec.encode((byte[]) null));
        assertNull(codec.decode((byte[]) null));
        assertNull(codec.encode((Object) null));
        assertNull(codec.decode((Object) null));
    }

    @Test
    public void testDefaultConstructorAndCharset() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectType() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode(Integer.valueOf(123));
    }
}
