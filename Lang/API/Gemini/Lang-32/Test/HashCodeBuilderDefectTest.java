package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Set;

public class HashCodeBuilderDefectTest {

    private static class SampleBean {
        private final String name;
        private final int id;

        public SampleBean(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    @Test
    public void testRegistryInitialValueIsNull() {
        // On a fresh thread (or current test thread before reflection), 
        // the fixed version's ThreadLocal does not provide an initial HashSet (returns null),
        // whereas the buggy version initializes it to an empty HashSet.
        Set<IDKey> registry = HashCodeBuilder.getRegistry();
        assertNull("Registry should be null initially when no reflection hash code is running", registry);
    }

    @Test
    public void testReflectionHashCodeExecutesCorrectly() {
        SampleBean bean = new SampleBean("test", 42);
        int hash = HashCodeBuilder.reflectionHashCode(bean);
        // Verify that reflection hashCode produces a non-zero/valid hash code
        assertTrue(hash != 0);
    }

    @Test
    public void testRegistryCleanupAfterReflection() {
        SampleBean bean = new SampleBean("cleanup", 100);
        int hash = HashCodeBuilder.reflectionHashCode(bean);
        assertTrue(hash != 0);

        // After reflection completes, the registry should be cleaned up (removed from ThreadLocal) in the fixed version
        Set<IDKey> registry = HashCodeBuilder.getRegistry();
        assertNull("Registry should be cleaned up and null after reflection hashCode completes", registry);
    }
}
