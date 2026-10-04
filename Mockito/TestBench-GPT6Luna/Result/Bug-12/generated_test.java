package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericMasterTest {
    @Test
    public void testParameterizedFieldWithClassArgument() throws Exception {
        Field field = Fields.class.getDeclaredField("strings");
        assertEquals(String.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testParameterizedFieldWithIntegerArgument() throws Exception {
        Field field = Fields.class.getDeclaredField("integers");
        assertEquals(Integer.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testNestedParameterizedArgumentReturnsRawType() throws Exception {
        Field field = Fields.class.getDeclaredField("nested");
        assertEquals(java.util.List.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testNonGenericFieldReturnsObject() throws Exception {
        Field field = Fields.class.getDeclaredField("plain");
        assertEquals(Object.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testParameterizedFieldWithTypeVariableReturnsObject() throws Exception {
        Field field = GenericFields.class.getDeclaredField("values");
        assertEquals(Object.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testParameterizedFieldWithWildcardReturnsObject() throws Exception {
        Field field = Fields.class.getDeclaredField("wildcard");
        assertEquals(Object.class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testParameterizedFieldWithGenericArrayReturnsArrayClass() throws Exception {
        Field field = Fields.class.getDeclaredField("arrays");
        assertEquals(String[].class, new GenericMaster().getGenericType(field));
    }

    @Test
    public void testParameterizedFieldWithNestedWildcardReturnsRawType() throws Exception {
        Field field = Fields.class.getDeclaredField("nestedWildcard");
        assertEquals(java.util.List.class, new GenericMaster().getGenericType(field));
    }

    private static class Fields {
        java.util.List<String> strings;
        java.util.List<Integer> integers;
        java.util.List<java.util.List<String>> nested;
        int plain;
        java.util.List<? extends Number> wildcard;
        java.util.List<String[]> arrays;
        java.util.List<java.util.List<? extends Number>> nestedWildcard;
    }

    private static class GenericFields<T> {
        java.util.List<T> values;
    }
}
