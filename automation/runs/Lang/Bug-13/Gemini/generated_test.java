package org.apache.commons.lang3;

import org.junit.Test;
import java.io.Serializable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SerializationUtilsCustomTest {

    @Test
    public void testClonePrimitiveClasses() {
        Class<?> clonedInt = SerializationUtils.clone(int.class);
        assertEquals(int.class, clonedInt);

        Class<?> clonedBoolean = SerializationUtils.clone(boolean.class);
        assertEquals(boolean.class, clonedBoolean);
    }

    @Test
    public void testCloneMultiplePrimitiveTypes() {
        Class<?>[] primitives = {
            byte.class,
            short.class,
            int.class,
            long.class,
            float.class,
            double.class,
            boolean.class,
            char.class,
            void.class
        };

        for (Class<?> prim : primitives) {
            Class<?> cloned = SerializationUtils.clone(prim);
            assertEquals(prim, cloned);
        }
    }

    @Test
    public void testDeserializePrimitiveClassData() {
        byte[] serializedIntClass = SerializationUtils.serialize(int.class);
        Object deserialized = SerializationUtils.deserialize(serializedIntClass);
        assertNotNull(deserialized);
        assertTrue(deserialized instanceof Class<?>);
        assertEquals(int.class, deserialized);
    }

    @Test
    public void testCloneStandardObjectRegression() {
        String original = "SerializationUtils Regression Test String";
        String cloned = SerializationUtils.clone(original);
        assertEquals(original, cloned);
    }
}
