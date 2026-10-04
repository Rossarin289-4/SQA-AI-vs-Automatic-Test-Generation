package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

public class HashCodeBuilderTest {
    @Test
    public void testDefaultBuilderInitialValue() throws Exception {
        assertEquals(17, new HashCodeBuilder().toHashCode());
    }

    @Test
    public void testCustomBuilderInitialValue() throws Exception {
        assertEquals(5, new HashCodeBuilder(5, 3).toHashCode());
    }

    @Test
    public void testAppendTrue() throws Exception {
        assertEquals(15, new HashCodeBuilder(5, 3).append(true).toHashCode());
    }

    @Test
    public void testAppendFalse() throws Exception {
        assertEquals(16, new HashCodeBuilder(5, 3).append(false).toHashCode());
    }

    @Test
    public void testAppendSuper() throws Exception {
        assertEquals(19, new HashCodeBuilder(5, 3).appendSuper(4).toHashCode());
    }

    @Test
    public void testAppendSuperZero() throws Exception {
        assertEquals(15, new HashCodeBuilder(5, 3).appendSuper(0).toHashCode());
    }

    @Test
    public void testHashCodeMatchesToHashCode() throws Exception {
        HashCodeBuilder builder = new HashCodeBuilder(5, 3).appendSuper(4);
        assertEquals(builder.toHashCode(), builder.hashCode());
    }

    @Test
    public void testBooleanThenSuper() throws Exception {
        assertEquals(46, new HashCodeBuilder(5, 3).append(true).appendSuper(1).toHashCode());
    }

    @Test
    public void testZeroInitialValueRejected() throws Exception {
        try {
            new HashCodeBuilder(0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEvenInitialValueRejected() throws Exception {
        try {
            new HashCodeBuilder(4, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testZeroMultiplierRejected() throws Exception {
        try {
            new HashCodeBuilder(5, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEvenMultiplierRejected() throws Exception {
        try {
            new HashCodeBuilder(5, 4);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testReflectionHashCodeUsesSuppliedSeeds() throws Exception {
        assertEquals(1252, HashCodeBuilder.reflectionHashCode(5, 3, Boolean.FALSE));
    }

    @Test
    public void testReflectionHashCodeNullRejected() throws Exception {
        try {
            HashCodeBuilder.reflectionHashCode(5, 3, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
