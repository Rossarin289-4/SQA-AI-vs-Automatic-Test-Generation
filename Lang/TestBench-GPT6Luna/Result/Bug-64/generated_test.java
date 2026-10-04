package org.apache.commons.lang.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.ClassUtils;

public class ValuedEnumTest {
    @Test
    public void testSameObjectComparesEqual() throws Exception {
        assertEquals(0, Example.ONE.compareTo(Example.ONE));
    }

    @Test
    public void testCompareValuesAscending() throws Exception {
        assertEquals(-3, Example.ONE.compareTo(Example.FOUR));
    }

    @Test
    public void testCompareValuesDescending() throws Exception {
        assertEquals(3, Example.FOUR.compareTo(Example.ONE));
    }

    @Test
    public void testCompareEqualValues() throws Exception {
        assertEquals(0, Example.ONE.compareTo(Example.ONE_COPY));
    }

    @Test
    public void testCompareWithDifferentEnumType() throws Exception {
        try {
            Example.ONE.compareTo(Other.ONE);
            fail("expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testCompareWithNull() throws Exception {
        try {
            Example.ONE.compareTo(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testGetPositiveValue() throws Exception {
        assertEquals(1, Example.ONE.getValue());
    }

    @Test
    public void testGetZeroValue() throws Exception {
        assertEquals(0, Example.ZERO.getValue());
    }

    @Test
    public void testGetNegativeValue() throws Exception {
        assertEquals(-1, Example.NEGATIVE_ONE.getValue());
    }

    @Test
    public void testGetMaximumIntegerValue() throws Exception {
        assertEquals(Integer.MAX_VALUE, Example.MAX.getValue());
    }

    @Test
    public void testGetMinimumIntegerValue() throws Exception {
        assertEquals(Integer.MIN_VALUE, Example.MIN.getValue());
    }

    @Test
    public void testToStringForPositiveValue() throws Exception {
        assertEquals("ValuedEnumTest.Example[one=1]", Example.ONE.toString());
    }

    @Test
    public void testToStringForZeroValue() throws Exception {
        assertEquals("ValuedEnumTest.Example[zero=0]", Example.ZERO.toString());
    }

    @Test
    public void testToStringForNegativeValue() throws Exception {
        assertEquals("ValuedEnumTest.Example[negative=-1]", Example.NEGATIVE_ONE.toString());
    }

    @Test
    public void testToStringForMaximumValue() throws Exception {
        assertEquals("ValuedEnumTest.Example[max=2147483647]", Example.MAX.toString());
    }

    @Test
    public void testToStringForMinimumValue() throws Exception {
        assertEquals("ValuedEnumTest.Example[min=-2147483648]", Example.MIN.toString());
    }

    @Test
    public void testToStringIsCached() throws Exception {
        String first = Example.ONE.toString();
        String second = Example.ONE.toString();
        assertSame(first, second);
    }

    public static final class Example extends ValuedEnum {
        public static final Example ONE = new Example("one", 1);
        public static final Example FOUR = new Example("four", 4);
        public static final Example ONE_COPY = new Example("oneCopy", 1);
        public static final Example ZERO = new Example("zero", 0);
        public static final Example NEGATIVE_ONE = new Example("negative", -1);
        public static final Example MAX = new Example("max", Integer.MAX_VALUE);
        public static final Example MIN = new Example("min", Integer.MIN_VALUE);

        private Example(String name, int value) {
            super(name, value);
        }
    }

    public static final class Other extends ValuedEnum {
        public static final Other ONE = new Other("one", 1);

        private Other(String name, int value) {
            super(name, value);
        }
    }
}
