package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseNCodecInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAbstractCodecCannotBeConstructedDirectly() throws Exception {
        assertTrue(java.lang.reflect.Modifier.isAbstract(BaseNCodec.class.getModifiers()));
    }

    @Test
    public void testHeaderInheritanceContract() throws Exception {
        assertTrue(FilterInputStream.class.isAssignableFrom(BaseNCodecInputStream.class));
    }

    @Test
    public void testReadMethodIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredMethod("read"));
    }

    @Test
    public void testReadArrayMethodIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredMethod("read", byte[].class, int.class, int.class));
    }

    @Test
    public void testMarkSupportedMethodIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredMethod("markSupported"));
    }

    @Test
    public void testSkipMethodIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredMethod("skip", long.class));
    }

    @Test
    public void testAvailableMethodIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredMethod("available"));
    }

    @Test
    public void testProtectedConstructorIsDeclared() throws Exception {
        assertNotNull(BaseNCodecInputStream.class.getDeclaredConstructor(InputStream.class, BaseNCodec.class, boolean.class));
    }

    @Test
    public void testCodecHasStreamingState() throws Exception {
        assertTrue(java.lang.reflect.Modifier.isAbstract(BaseNCodec.class.getModifiers()));
    }

    @Test
    public void testCodecHasBufferApi() throws Exception {
        assertNotNull(BaseNCodec.class.getDeclaredMethod("available"));
    }

    @Test
    public void testCodecHasDataQuery() throws Exception {
        assertNotNull(BaseNCodec.class.getDeclaredMethod("hasData"));
    }

    @Test
    public void testCodecHasResultReadApi() throws Exception {
        assertNotNull(BaseNCodec.class.getDeclaredMethod("readResults", byte[].class, int.class, int.class));
    }
}
