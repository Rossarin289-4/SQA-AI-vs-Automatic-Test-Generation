```java
package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class TypeInfoFactoryTest {
    static class Fields<T> {
        T value;
        T[] array;
        java.util.List<T> list;
        java.util.List<String> strings;
        java.util.List<? extends Number> numbers;
        int primitive;
        String text;
    }

    static class Child extends Fields<String> { }

    static class Parent<A, B> {
        A first;
        B second;
    }

    static class Pair extends Parent<String, Integer> { }

    private Field field(String name) throws Exception {
        return Fields.class.getDeclaredField(name);
    }

    @Test
    public void testArrayTypeInfo() throws Exception {
        TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(String[].class);
        assertEquals(String[].class, info.getActualType());
        assertEquals(String.class, info.getComponentRawType());
        assertEquals(String.class, info.getSecondLevelType());
    }

    @Test
    public void testMultidimensionalArrayTypeInfo() throws Exception {
        TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(int[][].class);
        assertEquals(int[][].class, info.getActualType());
        assertEquals(int[].class, info.getComponentRawType());
        assertEquals(int.class, info.getSecondLevelType());
    }

    @Test
    public void testRejectsNonArrayType() throws Exception {
        try {
            TypeInfoFactory.getTypeInfoForArray(String.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testPlainClassField() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("text"), Fields.class);
        assertEquals(String.class, info.getActualType());
    }

    @Test
    public void testPrimitiveField() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("primitive"), Fields.class);
        assertEquals(int.class, info.getActualType());
        assertEquals(int.class, info.getRawClass());
    }

    @Test
    public void testParameterizedFieldSubstitutesTypeVariable() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("list"),
                Fields.class.getDeclaredField("list").getGenericType());
        assertNotNull(info.getActualType());
    }

    @Test
    public void testParameterizedFieldWithConcreteArgument() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("strings"), Fields.class);
        ParameterizedType type = (ParameterizedType) info.getActualType();
        assertEquals(java.util.List.class, type.getRawType());
        assertEquals(String.class, type.getActualTypeArguments()[0]);
    }

    @Test
    public void testWildcardFieldUsesUpperBound() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("numbers"), Fields.class);
        ParameterizedType type = (ParameterizedType) info.getActualType();
        assertEquals(Number.class, type.getActualTypeArguments()[0]);
    }

    @Test
    public void testGenericArraySubstitutionToClassArray() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("array"), Fields.class);
        assertTrue(info.getActualType() instanceof GenericArrayType);
    }

    @Test
    public void testGenericArrayUnresolvedPreservesGenericArray() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("array"), Fields.class);
        assertTrue(info.getActualType() instanceof GenericArrayType);
        assertEquals(Fields.class.getTypeParameters()[0],
                ((GenericArrayType) info.getActualType()).getGenericComponentType());
    }

    @Test
    public void testFieldVariableResolvedThroughSubclassHierarchy() throws Exception {
        Field inherited = Fields.class.getDeclaredField("value");
        try {
            TypeInfo info = TypeInfoFactory.getTypeInfoForField(inherited, Child.class);
            assertEquals(String.class, info.getActualType());
        } catch (UnsupportedOperationException expected) {
            fail("subclass type variable should resolve");
        }
    }

    @Test
    public void testMultipleSuperclassTypeVariablesResolved() throws Exception {
        TypeInfo first = TypeInfoFactory.getTypeInfoForField(
                Parent.class.getDeclaredField("first"), Pair.class);
        TypeInfo second = TypeInfoFactory.getTypeInfoForField(
                Parent.class.getDeclaredField("second"), Pair.class);
        assertEquals(String.class, first.getActualType());
        assertEquals(Integer.class, second.getActualType());
    }

    @Test
    public void testUnresolvedTypeVariableThrows() throws Exception {
        try {
            TypeInfoFactory.getTypeInfoForField(field("value"), Fields.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testParameterizedTypeWhenDefiningTypeIsRawClass() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("strings"), Fields.class);
        assertEquals(java.util.List.class, ((ParameterizedType) info.getActualType()).getRawType());
    }

    @Test
    public void testGenericArrayComponentAfterParameterizedResolution() throws Exception {
        TypeInfo info = TypeInfoFactory.getTypeInfoForField(field("array"), Fields.class);
        assertTrue(info.getActualType() instanceof GenericArrayType);
    }
}
```