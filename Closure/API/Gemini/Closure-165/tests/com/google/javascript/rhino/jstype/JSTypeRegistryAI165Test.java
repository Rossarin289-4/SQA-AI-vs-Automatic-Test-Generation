package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class JSTypeRegistryAI165Test {

    @Test
    public void testTemplateTypeNameOperations() {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        registry.setTemplateTypeName("T");
        registry.clearTemplateTypeName();
        assertTrue(true);
    }
}
