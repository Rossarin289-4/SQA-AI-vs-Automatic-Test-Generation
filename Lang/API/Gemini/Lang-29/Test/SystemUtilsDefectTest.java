package org.apache.commons.lang3;

import org.junit.Test;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SystemUtilsDefectTest {

    @Test
    public void testToJavaVersionIntReturnType() throws Exception {
        Method method = SystemUtils.class.getDeclaredMethod("toJavaVersionInt", String.class);
        assertNotNull("Method toJavaVersionInt should exist", method);
        // The bug was that toJavaVersionInt returned float instead of int
        assertEquals("toJavaVersionInt return type must be int", int.class, method.getReturnType());
    }

    @Test
    public void testToJavaVersionIntStandardVersions() {
        assertEquals(170, SystemUtils.toJavaVersionInt("1.7.0"));
        assertEquals(180, SystemUtils.toJavaVersionInt("1.8.0_201"));
        assertEquals(160, SystemUtils.toJavaVersionInt("1.6.0"));
    }

    @Test
    public void testToJavaVersionIntSingleDigit() {
        assertEquals(900, SystemUtils.toJavaVersionInt("9"));
        assertEquals(110, SystemUtils.toJavaVersionInt("11.0.1"));
    }

    @Test
    public void testToJavaVersionIntNull() {
        assertEquals(0, SystemUtils.toJavaVersionInt(null));
    }
}
