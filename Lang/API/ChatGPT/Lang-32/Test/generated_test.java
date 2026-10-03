package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class HashCodeBuilderLang32Test {

    private static class SimpleObject {
        private int value = 42;
    }

    private static class MultiFieldObject {
        private int number = 17;
        private String text = "lang586";
        private boolean enabled = true;
    }

    @Test
    public void testRegistryIsNotCreatedBeforeReflectionHashCode() {
        assertNull(HashCodeBuilder.getRegistry());
    }

    @Test
    public void testReflectionHashCodeRemovesRegistryAfterSimpleObject() {
        SimpleObject object = new SimpleObject();

        HashCodeBuilder.reflectionHashCode(object);

        assertNull(HashCodeBuilder.getRegistry());
    }

    @Test
    public void testReflectionHashCodeRemovesRegistryAfterMultipleFields() {
        MultiFieldObject object = new MultiFieldObject();

        HashCodeBuilder.reflectionHashCode(object);

        assertNull(HashCodeBuilder.getRegistry());
    }

    @Test
    public void testRegistryIsRemovedAfterRepeatedReflectionHashCodes() {
        SimpleObject first = new SimpleObject();
        MultiFieldObject second = new MultiFieldObject();

        HashCodeBuilder.reflectionHashCode(first);
        assertNull(HashCodeBuilder.getRegistry());

        HashCodeBuilder.reflectionHashCode(second);
        assertNull(HashCodeBuilder.getRegistry());
    }

    @Test
    public void testRegisterAndUnregisterRemoveLastRegistryEntry() {
        SimpleObject object = new SimpleObject();

        assertNull(HashCodeBuilder.getRegistry());

        HashCodeBuilder.register(object);

        assertNotNull(HashCodeBuilder.getRegistry());
        assertTrueRegistered(object);

        HashCodeBuilder.unregister(object);

        assertNull(HashCodeBuilder.getRegistry());
        assertFalse(HashCodeBuilder.isRegistered(object));
    }

    private void assertTrueRegistered(Object object) {
        if (!HashCodeBuilder.isRegistered(object)) {
            throw new AssertionError("Object should be registered");
        }
    }
}
