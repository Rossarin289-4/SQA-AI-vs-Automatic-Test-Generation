package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SystemUtilsLang29Test {

    @Test
    public void testToJavaVersionIntReturnsIntegerForThreePartVersion() {
        Object result = SystemUtils.toJavaVersionInt("2.4.7");

        assertEquals(Integer.valueOf(247), result);
    }

    @Test
    public void testToJavaVersionIntReturnsIntegerForTwoPartVersion() {
        Object result = SystemUtils.toJavaVersionInt("3.8");

        assertEquals(Integer.valueOf(380), result);
    }

    @Test
    public void testToJavaVersionIntIgnoresPatchSuffix() {
        Object result = SystemUtils.toJavaVersionInt("4.2.9_15");

        assertEquals(Integer.valueOf(429), result);
    }

    @Test
    public void testToJavaVersionIntReturnsIntegerForVendorPrefixedVersion() {
        Object result = SystemUtils.toJavaVersionInt("VendorVM-7.5.3");

        assertEquals(Integer.valueOf(753), result);
    }

    @Test
    public void testToJavaVersionIntReturnsIntegerForSingleComponentVersion() {
        Object result = SystemUtils.toJavaVersionInt("9");

        assertEquals(Integer.valueOf(900), result);
    }
}
