package org.apache.commons.lang3;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SerializationUtilsLang13Test {

    /**
     * Defect test:
     * A primitive Class object should survive serialization and
     * deserialization.
     */
    @Test
    public void testDeserializeLongPrimitiveClass() {
        byte[] data = SerializationUtils.serialize(long.class);

        Object result = SerializationUtils.deserialize(data);

        assertSame(long.class, result);
    }

    /**
     * Defect test:
     * A different primitive Class should also be resolved correctly.
     */
    @Test
    public void testDeserializeBooleanPrimitiveClass() {
        byte[] data = SerializationUtils.serialize(boolean.class);

        Object result = SerializationUtils.deserialize(data);

        assertSame(boolean.class, result);
    }

    /**
     * Defect test:
     * void.class is another primitive-type Class name that must be
     * resolved by the primitive type fallback.
     */
    @Test
    public void testDeserializeVoidPrimitiveClass() {
        byte[] data = SerializationUtils.serialize(void.class);

        Object result = SerializationUtils.deserialize(data);

        assertSame(void.class, result);
    }

    /**
     * Regression test:
     * Primitive array classes use JVM array descriptors such as [J
     * and should continue to deserialize normally.
     */
    @Test
    public void testDeserializePrimitiveArrayClass() {
        byte[] data = SerializationUtils.serialize(long[].class);

        Object result = SerializationUtils.deserialize(data);

        assertSame(long[].class, result);
    }

    /**
     * Regression test:
     * An ordinary reference Class should continue to deserialize
     * normally and should not depend on the primitive fallback.
     */
    @Test
    public void testDeserializeReferenceClass() {
        byte[] data = SerializationUtils.serialize(Integer.class);

        Object result = SerializationUtils.deserialize(data);

        assertSame(Integer.class, result);
    }
}
