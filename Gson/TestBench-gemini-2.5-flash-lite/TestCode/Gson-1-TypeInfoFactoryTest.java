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

    @Test
    public void testGetTypeInfoForArrayWithPrimitiveArray() throws Exception {
        Type type = int[].class;
        TypeInfoArray arrayInfo = TypeInfoFactory.getTypeInfoForArray(type);
        assertNotNull(arrayInfo);
        assertEquals(int.class, arrayInfo.getComponentRawType());
        assertEquals(int.class, arrayInfo.getSecondLevelType());
    }

    @Test
    public void testGetTypeInfoForArrayWithObjectArray() throws Exception {
        Type type = Object[].class;
        TypeInfoArray arrayInfo = TypeInfoFactory.getTypeInfoForArray(type);
        assertNotNull(arrayInfo);
        assertEquals(Object.class, arrayInfo.getComponentRawType());
        assertEquals(Object.class, arrayInfo.getSecondLevelType());
    }

    @Test
    public void testGetTypeInfoForArrayWithMultiDimensionalArray() throws Exception {
        Type type = int[][].class;
        TypeInfoArray arrayInfo = TypeInfoFactory.getTypeInfoForArray(type);
        assertNotNull(arrayInfo);
        assertEquals(int[].class, arrayInfo.getComponentRawType()); // This is the component type of the outer array.
        assertEquals(int.class, arrayInfo.getSecondLevelType()); // This is the component type of the inner array.
    }

    @Test
    public void testGetTypeInfoForArrayWithGenericArray() throws Exception {
        Type type = new GenericArrayTypeImpl(String.class);
        TypeInfoArray arrayInfo = TypeInfoFactory.getTypeInfoForArray(type);
        assertNotNull(arrayInfo);
        assertEquals(String.class, arrayInfo.getComponentRawType());
        assertEquals(String.class, arrayInfo.getSecondLevelType());
    }

    @Test
    public void testGetTypeInfoForFieldWithClassType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("intField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TypeDefiningClass.class);
        assertNotNull(typeInfo);
        assertEquals(int.class, typeInfo.getActualType());
        assertEquals(Integer.class, typeInfo.getWrappedClass());
        assertFalse(typeInfo.isCollectionOrArray());
    }

    @Test
    public void testGetTypeInfoForFieldWithParameterizedType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("stringListField");
        Type typeDefiningType = new ParameterizedTypeImpl(TypeDefiningClass.class, new Type[]{String.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertEquals(String.class, typeInfo.getActualType());
        assertEquals(String.class, typeInfo.getWrappedClass());
        assertTrue(typeInfo.isCollectionOrArray()); // List is a collection.
    }

    @Test
    public void testGetTypeInfoForFieldWithGenericArrayType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("genericArrayField");
        Type typeDefiningType = new ParameterizedTypeImpl(TypeDefiningClass.class, new Type[]{String.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertTrue(typeInfo.getActualType() instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) typeInfo.getActualType()).getGenericComponentType());
        assertEquals(Object[].class, typeInfo.getWrappedClass()); // Array of Object.
        assertTrue(typeInfo.isCollectionOrArray());
    }

    @Test
    public void testGetTypeInfoForFieldWithArrayType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("objectArrayField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TypeDefiningClass.class);
        assertNotNull(typeInfo);
        assertEquals(Object[].class, typeInfo.getActualType());
        assertEquals(Object[].class, typeInfo.getWrappedClass());
        assertTrue(typeInfo.isCollectionOrArray());
    }

    @Test
    public void testGetTypeInfoForFieldWithWildcardType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("wildcardField");
        Type typeDefiningType = new ParameterizedTypeImpl(TypeDefiningClass.class, new Type[]{String.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertEquals(String.class, typeInfo.getActualType()); // Wildcard is bounded by String.
        assertEquals(String.class, typeInfo.getWrappedClass());
    }

    @Test
    public void testGetTypeInfoForFieldWithTypeVariableInParameterizedType() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("typeVariableField");
        // This simulates `new TypeDefiningClass<Integer>()`
        Type typeDefiningType = new ParameterizedTypeImpl(TypeDefiningClass.class, new Type[]{Integer.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertEquals(Integer.class, typeInfo.getActualType());
        assertEquals(Integer.class, typeInfo.getWrappedClass());
    }

    @Test
    public void testGetTypeInfoForFieldWithTypeVariableInSuperclass() throws Exception {
        SubTypedDefiningClass sub = new SubTypedDefiningClass();
        Field field = sub.getClass().getDeclaredField("typeVariableFieldFromSuper");
        // This simulates `new SubTypedDefiningClass<String>()`
        Type typeDefiningType = new ParameterizedTypeImpl(SubTypedDefiningClass.class, new Type[]{String.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertEquals(String.class, typeInfo.getActualType());
        assertEquals(String.class, typeInfo.getWrappedClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithPrimitiveDoubleArray() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("doubleArrayField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TypeDefiningClass.class);
        assertNotNull(typeInfo);
        assertEquals(double[].class, typeInfo.getActualType());
        assertEquals(double[].class, typeInfo.getWrappedClass());
        assertTrue(typeInfo.isCollectionOrArray());
    }

    @Test
    public void testGetTypeInfoForFieldWithPrimitiveBooleanArray() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("booleanArrayField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TypeDefiningClass.class);
        assertNotNull(typeInfo);
        assertEquals(boolean[].class, typeInfo.getActualType());
        assertEquals(boolean[].class, typeInfo.getWrappedClass());
        assertTrue(typeInfo.isCollectionOrArray());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithParameterizedGenericArray() throws Exception {
        TypeDefiningClass foo = new TypeDefiningClass();
        Field field = foo.getClass().getDeclaredField("listArrayField");
        Type typeDefiningType = new ParameterizedTypeImpl(TypeDefiningClass.class, new Type[]{String.class}, null);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, typeDefiningType);
        assertNotNull(typeInfo);
        assertTrue(typeInfo.getActualType() instanceof GenericArrayType);
        Type componentType = ((GenericArrayType) typeInfo.getActualType()).getGenericComponentType();
        assertTrue(componentType instanceof ParameterizedType);
        assertEquals(String.class, ((ParameterizedType) componentType).getActualTypeArguments()[0]);
        assertEquals(Object[].class, typeInfo.getWrappedClass());
        assertTrue(typeInfo.isCollectionOrArray());
    }

    // Inner classes to represent types for testing
    private static class TypeDefiningClass<T> {
        int intField;
        java.util.List<String> stringListField;
        T[] genericArrayField;
        Object[] objectArrayField;
        Object wildcardField; // Represents ? extends String or similar for testing
        T typeVariableField;
        double[] doubleArrayField;
        boolean[] booleanArrayField;
        java.util.List<String>[] listArrayField;
    }

    private static class SuperTypeDefiningClass<K> {
        K typeVariableFieldFromSuper;
    }

    private static class SubTypedDefiningClass<T> extends SuperTypeDefiningClass<T> {
        T typeVariableFieldFromSuper; // This field is specific to SubTypedDefiningClass
    }

    // Helper class to represent ParameterizedType for tests
    private static class ParameterizedTypeImpl implements ParameterizedType {
        private final Type rawType;
        private final Type[] actualTypeArguments;
        private final Type ownerType;

        public ParameterizedTypeImpl(Type rawType, Type[] actualTypeArguments, Type ownerType) {
            this.rawType = rawType;
            this.actualTypeArguments = actualTypeArguments;
            this.ownerType = ownerType;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return actualTypeArguments;
        }

        @Override
        public Type getRawType() {
            return rawType;
        }

        @Override
        public Type getOwnerType() {
            return ownerType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParameterizedTypeImpl that = (ParameterizedTypeImpl) o;
            return java.util.Objects.equals(rawType, that.rawType) &&
                   java.util.Arrays.equals(actualTypeArguments, that.actualTypeArguments) &&
                   java.util.Objects.equals(ownerType, that.ownerType);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(rawType, java.util.Arrays.hashCode(actualTypeArguments), ownerType);
        }
    }
    
    // Helper class to represent GenericArrayType for tests
    private static class GenericArrayTypeImpl implements GenericArrayType {
        private final Type genericComponentType;

        public GenericArrayTypeImpl(Type genericComponentType) {
            this.genericComponentType = genericComponentType;
        }

        @Override
        public Type getGenericComponentType() {
            return genericComponentType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GenericArrayTypeImpl that = (GenericArrayTypeImpl) o;
            return java.util.Objects.equals(genericComponentType, that.genericComponentType);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(genericComponentType);
        }
    }
}
