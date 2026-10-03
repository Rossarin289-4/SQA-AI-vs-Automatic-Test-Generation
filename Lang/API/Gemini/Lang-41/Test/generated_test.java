package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Independent test suite for Lang-41 defect.
 */
public class ClassUtilsDefectTest {

    @Test
    public void testGetShortClassName_jvmObjectArray() {
        // JVM descriptor for an array of java.lang.String
        String className = "[Ljava.lang.String;";
        String shortName = ClassUtils.getShortClassName(className);
        assertEquals("String[]", shortName);
    }

    @Test
    public void testGetShortClassName_jvmPrimitiveArray() {
        // JVM descriptor for an array of int ([I)
        String className = "[I";
        String shortName = ClassUtils.getShortClassName(className);
        assertEquals("int[]", shortName);
    }

    @Test
    public void testGetShortClassName_multiDimensionalPrimitiveArray() {
        // JVM descriptor for a 2D double array ([[D)
        String className = "[[D";
        String shortName = ClassUtils.getShortClassName(className);
        assertEquals("double[][]", shortName);
    }

    @Test
    public void testGetPackageName_jvmObjectArray() {
        // JVM descriptor for an array of java.math.BigInteger
        String className = "[Ljava.math.BigInteger;";
        String packageName = ClassUtils.getPackageName(className);
        assertEquals("java.math", packageName);
    }
}
