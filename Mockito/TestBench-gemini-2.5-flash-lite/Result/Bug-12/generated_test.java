package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.reflect.TypeVariable;

public class GenericMasterTest {

    private GenericMaster genericMaster = new GenericMaster();

    // Helper method to get a field by name
    private Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        return clazz.getDeclaredField(fieldName);
    }

    // Helper method to get a generic field
    private Field getGenericField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true); // Allow access to generic type information
        return field;
    }

    // Test case for a field with a simple generic type (e.g., List<String>)
    @Test
    public void testSimpleGenericType() throws Exception {
        Field field = getGenericField(SimpleGenericHolder.class, "simpleList");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(String.class, genericType);
    }

    // Test case for a field with a complex generic type (e.g., Map<String, Integer>)
    @Test
    public void testComplexGenericType() throws Exception {
        Field field = getGenericField(ComplexGenericHolder.class, "complexMap");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The method returns the raw type of the first type argument if it's a ParameterizedType
        assertEquals(String.class, genericType); 
    }
    
    // Test case for a field with nested generic types (e.g., List<List<String>>)
    @Test
    public void testNestedGenericType() throws Exception {
        Field field = getGenericField(NestedGenericHolder.class, "nestedList");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The method returns the raw type of the first type argument of the nested generic
        assertEquals(List.class, genericType);
    }

    // Test case for a field that is not generic (e.g., String)
    @Test
    public void testNonGenericField() throws Exception {
        Field field = getField(NonGenericHolder.class, "plainString");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with a generic type that is a raw type (e.g., List)
    @Test
    public void testRawGenericType() throws Exception {
        Field field = getGenericField(RawGenericHolder.class, "rawList");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Object.class, genericType);
    }
    
    // Test case for a field with a generic type that is a wildcard (e.g., List<?>)
    @Test
    public void testWildcardGenericType() throws Exception {
        Field field = getGenericField(WildcardGenericHolder.class, "wildcardList");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The actual type argument for a wildcard is not a Class, so it should return Object.class
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with a generic type that is a bounded wildcard (e.g., List<? extends Number>)
    @Test
    public void testBoundedWildcardGenericType() throws Exception {
        Field field = getGenericField(BoundedWildcardHolder.class, "boundedWildcardList");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The actual type argument for a bounded wildcard is not a Class, so it should return Object.class
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with a generic type that is a type variable
    @Test
    public void testTypeVariableGenericType() throws Exception {
        Field field = getGenericField(TypeVariableHolder.class, "typeVariableList");
        Class<?> genericType = genericMaster.getGenericType(field);
        // Type variables are not Class instances, so it should return Object.class
        assertEquals(Object.class, genericType);
    }
    
    // Test case for a field with a generic type that is a nested parameterized type
    @Test
    public void testNestedParameterizedType() throws Exception {
        Field field = getGenericField(NestedParameterizedHolder.class, "nestedParameterizedMap");
        Class<?> genericType = genericMaster.getGenericType(field);
        // In case of nested generics, it returns the raw type of the first type argument of the nested generic
        assertEquals(String.class, genericType); 
    }
    
    // Test case for a field where generic type is null
    @Test
    public void testNullGenericType() throws Exception {
        // This scenario is hard to achieve with reflection on declared fields,
        // as getGenericType() usually returns a Type object.
        // However, if it were null, the method should return Object.class.
        // We simulate this by creating a dummy field that might not have generic info.
        // For a standard Java Field, getGenericType() will not be null.
        // Let's test a field that *should* resolve to Object.class based on logic.
        Field field = getField(SimpleGenericHolder.class, "plainInt");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with generic type that is Object itself
    @Test
    public void testObjectGenericType() throws Exception {
        Field field = getGenericField(ObjectGenericHolder.class, "objectList");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with generic type of primitive wrapper
    @Test
    public void testPrimitiveWrapperGenericType() throws Exception {
        Field field = getGenericField(PrimitiveWrapperHolder.class, "integerList");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Integer.class, genericType);
    }

    // Test case for a field with a very specific generic type
    @Test
    public void testSpecificGenericType() throws Exception {
        Field field = getGenericField(SpecificGenericHolder.class, "specificMap");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(String.class, genericType);
    }
    
    // Test for generic type being a Class<?> itself
    @Test
    public void testClassAsGenericType() throws Exception {
        Field field = getGenericField(ClassAsGenericHolder.class, "classHolder");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The actual type argument is Class<String>, which is a ParameterizedType.
        // The method returns the raw type of this ParameterizedType, which is Class.class.
        assertEquals(Class.class, genericType);
    }

    // Test for generic type being a ParameterizedType that is not a Class
    @Test
    public void testNonClassParameterizedType() throws Exception {
        Field field = getGenericField(NonClassParameterizedTypeHolder.class, "nonClassType");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The actual type argument is Map<Integer, String>, which is a ParameterizedType.
        // The method returns the raw type of this ParameterizedType, which is Map.class.
        assertEquals(Map.class, genericType);
    }

    // Test for a field that is generic but has no type arguments
    // This is similar to a raw type, but explicitly defined as generic
    @Test
    public void testGenericWithNoTypeArguments() throws Exception {
        Field field = getGenericField(GenericNoArgsHolder.class, "genericNoArgsList");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(Object.class, genericType);
    }
    
    // Test for a field with a generic type that is a complex nested structure
    @Test
    public void testComplexNestedGenerics() throws Exception {
        Field field = getGenericField(ComplexNestedGenericsHolder.class, "complexNested");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The method doesn't go deep, so it should return the raw type of the first nested generic argument
        assertEquals(Map.class, genericType);
    }

    // Test for a field with a generic type where the argument is a class with a generic type
    @Test
    public void testGenericArgumentIsGenericClass() throws Exception {
        Field field = getGenericField(GenericArgumentIsGenericClassHolder.class, "genericList");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The argument is SimpleGenericHolder, which is a Class.
        assertEquals(SimpleGenericHolder.class, genericType);
    }

    // Test for a field with a generic type that is an array of generic type
    // Note: This is a bit of a conceptual edge case for getGenericType, which expects Class
    @Test
    public void testArrayOfGenericType() throws Exception {
        Field field = getGenericField(ArrayOfGenericTypeHolder.class, "arrayOfStrings");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The generic type is List<String>[]. The actual type argument is List<String>, which is a ParameterizedType.
        // The method returns the raw type of this ParameterizedType, which is List.class.
        assertEquals(List.class, genericType);
    }

    // Test case for a field with a generic type that is an array of primitives
    @Test
    public void testArrayOfPrimitives() throws Exception {
        Field field = getGenericField(ArrayOfPrimitivesHolder.class, "arrayOfInts");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The generic type is List<int[]>. The actual type argument is int[].
        // int[].class is a Class object representing the primitive array type.
        assertEquals(int[].class, genericType);
    }
    
    // Test case for a field with a generic type that is a generic array
    @Test
    public void testGenericArrayType() throws Exception {
        Field field = getGenericField(GenericArrayTypeHolder.class, "genericArray");
        Class<?> genericType = genericMaster.getGenericType(field);
        // The generic type is List<String>[]. This is a GenericArrayType.
        // The logic `if (actual instanceof Class)` will fail.
        // The logic `else if (actual instanceof ParameterizedType)` will also fail.
        // Thus, it should return Object.class.
        assertEquals(Object.class, genericType);
    }

    // Test case for a field with generic type where the argument is a class name that doesn't exist (hypothetical)
    // Reflection would throw ClassNotFoundException if this were actually constructed and inspected.
    // Here, we focus on the logic path of getGenericType. If actualTypeArguments()[0] is a Class, it's returned.
    // We simulate a Class<?> being returned.
    @Test
    public void testGenericArgumentIsClass() throws Exception {
        Field field = getGenericField(GenericArgumentIsClassHolder.class, "genericClassField");
        Class<?> genericType = genericMaster.getGenericType(field);
        assertEquals(String.class, genericType);
    }

    // Dummy classes to hold fields for testing
    private static class SimpleGenericHolder {
        List<String> simpleList;
        int plainInt;
    }

    private static class ComplexGenericHolder {
        Map<String, Integer> complexMap;
    }

    private static class NestedGenericHolder {
        List<List<String>> nestedList;
    }

    private static class NonGenericHolder {
        String plainString;
    }

    private static class RawGenericHolder {
        List rawList;
    }

    private static class WildcardGenericHolder {
        List<?> wildcardList;
    }

    private static class BoundedWildcardHolder {
        List<? extends Number> boundedWildcardList;
    }

    private static class TypeVariableHolder<T> {
        List<T> typeVariableList;
    }
    
    private static class NestedParameterizedHolder {
        Map<String, List<String>> nestedParameterizedMap;
    }

    private static class ObjectGenericHolder {
        List<Object> objectList;
    }

    private static class PrimitiveWrapperHolder {
        List<Integer> integerList;
    }

    private static class SpecificGenericHolder {
        Map<String, String> specificMap;
    }
    
    private static class ClassAsGenericHolder {
        Class<String> classHolder;
    }

    private static class NonClassParameterizedTypeHolder {
        Map<String, Map<Integer, String>> nonClassType;
    }

    private static class GenericNoArgsHolder {
        List<?> genericNoArgsList;
    }
    
    private static class ComplexNestedGenericsHolder {
        List<Map<String, List<String>>> complexNested;
    }

    private static class GenericArgumentIsGenericClassHolder {
        List<SimpleGenericHolder> genericList;
    }

    private static class ArrayOfGenericTypeHolder {
        List<String>[] arrayOfStrings;
    }

    private static class ArrayOfPrimitivesHolder {
        List<int[]> arrayOfInts;
    }
    
    private static class GenericArrayTypeHolder {
        List<String>[] genericArray; 
    }

    private static class GenericArgumentIsClassHolder {
        List<String> genericClassField;
    }
}
