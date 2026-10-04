package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import com.fasterxml.jackson.databind.*;

public class JdkDeserializersTest {
    @Test
    public void testUuidNameFindsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(UUID.class, UUID.class.getName()));
    }

    @Test
    public void testAtomicBooleanNameFindsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName()));
    }

    @Test
    public void testStackTraceElementNameFindsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName()));
    }

    @Test
    public void testByteBufferNameFindsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName()));
    }

    @Test
    public void testVoidNameFindsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(Void.class, Void.class.getName()));
    }

    @Test
    public void testUnlistedClassNameReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(Object.class, Object.class.getName()));
    }

    @Test
    public void testNullClassNameReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(UUID.class, null));
    }

    @Test
    public void testMismatchedNameAndTypeReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(Object.class, UUID.class.getName()));
    }

    @Test
    public void testNullRawTypeForListedNameReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(null, UUID.class.getName()));
    }

    @Test
    public void testPrimitiveBooleanNameReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(boolean.class, boolean.class.getName()));
    }

    @Test
    public void testPrimitiveIntNameReturnsNull() throws Exception {
        assertNull(JdkDeserializers.find(int.class, int.class.getName()));
    }

    @Test
    public void testWrongListedNameForByteBufferReturnsDeserializer() throws Exception {
        assertNotNull(JdkDeserializers.find(ByteBuffer.class, UUID.class.getName()));
    }
}
