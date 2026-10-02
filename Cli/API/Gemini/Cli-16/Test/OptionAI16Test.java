package org.apache.commons.cli2;

import org.junit.Test;

public class OptionAI16Test {

    @Test
    public void testInterfaceExists() {
        Class<?> clazz = Option.class;
        org.junit.Assert.assertNotNull(clazz);
        org.junit.Assert.assertTrue(clazz.isInterface());
    }

    @Test
    public void testMethodsAreDeclared() throws Exception {
        org.junit.Assert.assertNotNull(Option.class.getMethod("getPreferredName"));
        org.junit.Assert.assertNotNull(Option.class.getMethod("getDescription"));
        org.junit.Assert.assertNotNull(Option.class.getMethod("getId"));
        org.junit.Assert.assertNotNull(Option.class.getMethod("isRequired"));
    }
}
