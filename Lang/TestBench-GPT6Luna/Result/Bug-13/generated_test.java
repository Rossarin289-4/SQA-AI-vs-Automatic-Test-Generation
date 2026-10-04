package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SerializationUtilsTest {
    @Test
    public void testCloneNull() throws Exception {
        assertNull(SerializationUtils.clone(null));
    }

    @Test
    public void testCloneString() throws Exception {
        String original = "hello";
        String copy = SerializationUtils.clone(original);
        assertEquals(original, copy);
        assertNotSame(original, copy);
    }

    @Test
    public void testCloneInteger() throws Exception {
        Integer original = Integer.valueOf(37);
        assertEquals(original, SerializationUtils.clone(original));
    }

    @Test
    public void testCloneByteArray() throws Exception {
        byte[] original = new byte[] { 0, 1, -1 };
        byte[] copy = SerializationUtils.clone(original);
        assertArrayEquals(original, copy);
        assertNotSame(original, copy);
    }

    @Test
    public void testSerializeAndDeserializeString() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        SerializationUtils.serialize("value", output);
        Object result = SerializationUtils.deserialize(
                new ByteArrayInputStream(output.toByteArray()));
        assertEquals("value", result);
    }

    @Test
    public void testSerializeAndDeserializeNull() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        SerializationUtils.serialize(null, output);
        assertNull(SerializationUtils.deserialize(
                new ByteArrayInputStream(output.toByteArray())));
    }

    @Test
    public void testSerializeAndDeserializeInteger() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        SerializationUtils.serialize(Integer.valueOf(-12), output);
        assertEquals(Integer.valueOf(-12), SerializationUtils.deserialize(
                new ByteArrayInputStream(output.toByteArray())));
    }

    @Test
    public void testSerializeClosesOutputStream() throws Exception {
        final boolean[] closed = new boolean[] { false };
        OutputStream output = new ByteArrayOutputStream() {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        SerializationUtils.serialize("x", output);
        assertTrue(closed[0]);
    }

    @Test
    public void testSerializeNullOutputStreamThrows() throws Exception {
        try {
            SerializationUtils.serialize("x", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1, 1);
    }

    @Test
    public void testDeserializeNullInputStreamThrows() throws Exception {
        try {
            SerializationUtils.deserialize((InputStream) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1, 1);
    }

    @Test
    public void testDeserializeEmptyStreamThrowsSerializationException() throws Exception {
        try {
            SerializationUtils.deserialize(new ByteArrayInputStream(new byte[0]));
            fail("expected SerializationException");
        } catch (SerializationException expected) {
            assertTrue(expected.getCause() instanceof IOException);
        }
    }

    @Test
    public void testDeserializeClosesInputStream() throws Exception {
        final boolean[] closed = new boolean[] { false };
        InputStream input = new ByteArrayInputStream(SerializationUtils.serialize("x")) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        assertEquals("x", SerializationUtils.deserialize(input));
        assertTrue(closed[0]);
    }
}
