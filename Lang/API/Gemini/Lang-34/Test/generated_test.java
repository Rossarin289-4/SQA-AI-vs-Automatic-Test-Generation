package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

/**
 * Independent test suite designed to detect the defect in Lang-34
 * concerning ToStringStyle.getRegistry() returning an empty map instead of null.
 */
public class Lang34DefectTest {

    @Test
    public void testGetRegistryReturnsNullWhenUninitialized() {
        // Clear ThreadLocal state to ensure no registry is present
        // (By default in a fresh test thread, REGISTRY.get() is null)
        Map<Object, Object> registry = ToStringStyle.getRegistry();
        
        // In the fixed version, getRegistry() returns REGISTRY.get(), which is null when uninitialized.
        // In the buggy version, it returns Collections.emptyMap() (not null).
        assertNull("Registry should be null when no reflection toString is active", registry);
    }

    @Test
    public void testIsRegisteredWithUninitializedRegistry() {
        Object sample = new Object();
        // Verify that isRegistered handles a null registry correctly without error
        boolean registered = ToStringStyle.isRegistered(sample);
        assertFalse("Object should not be registered when no registry exists", registered);
    }
}
