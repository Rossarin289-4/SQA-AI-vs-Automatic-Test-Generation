package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeObjectTypeAI39Test {

    @Test
    public void testMatchesObjectContext() {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        PrototypeObjectType obj = new PrototypeObjectType(registry, "TestClass", null);
        assertTrue(obj.matchesObjectContext());
    }

    @Test
    public void testCanBeCalled() {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        PrototypeObjectType obj = new PrototypeObjectType(registry, "TestClass", null);
        assertFalse(obj.canBeCalled());
    }

    @Test
    public void testGetConstructor() {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        PrototypeObjectType obj = new PrototypeObjectType(registry, "TestClass", null);
        assertNull(obj.getConstructor());
    }
}
