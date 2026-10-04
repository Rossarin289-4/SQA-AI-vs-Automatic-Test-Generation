package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ClassUtils;

public class TypeUtilsTest {
    @Test
    public void testIsAssignableClassAndNullCases() throws Exception {
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertFalse(TypeUtils.isAssignable(Object.class, String.class));
        assertTrue(TypeUtils.isAssignable(null, String.class));
        assertFalse(TypeUtils.isAssignable(null, int.class));
        assertFalse(TypeUtils.isAssignable(String.class, null));
    }

    @Test
    public void testIsAssignableParameterizedArguments() throws Exception {
        Type listString = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        Type listInteger = TypeUtilsTest.class.getDeclaredField("listInteger").getGenericType();
        assertTrue(TypeUtils.isAssignable(listString, listString));
        assertFalse(TypeUtils.isAssignable(listString, listInteger));
        assertTrue(TypeUtils.isAssignable(ArrayListString.class, List.class));
    }

    @Test
    public void testIsAssignableWildcardTarget() throws Exception {
        Type listString = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        Type listExtendsObject = TypeUtilsTest.class.getDeclaredField("listExtendsObject").getGenericType();
        assertTrue(TypeUtils.isAssignable(listString, listExtendsObject));
    }

    @Test
    public void testGetTypeArgumentsParameterizedType() throws Exception {
        ParameterizedType type = (ParameterizedType) TypeUtilsTest.class
                .getDeclaredField("listString").getGenericType();
        Map<TypeVariable<?>, Type> args = TypeUtils.getTypeArguments(type);
        assertEquals(String.class, args.get(List.class.getTypeParameters()[0]));
        assertEquals(1, args.size());
    }

    @Test
    public void testGetTypeArgumentsHierarchyAndIncompatibility() throws Exception {
        Type args = TypeUtils.getTypeArguments(ArrayListString.class, List.class)
                .get(List.class.getTypeParameters()[0]);
        assertEquals(String.class, args);
        assertNull(TypeUtils.getTypeArguments(String.class, List.class));
        assertEquals(0, TypeUtils.getTypeArguments(String.class, Object.class).size());
    }

    @Test
    public void testDetermineTypeArgumentsDirectAndInherited() throws Exception {
        ParameterizedType listOfNumber = (ParameterizedType) TypeUtilsTest.class
                .getDeclaredField("listNumber").getGenericType();
        Map<TypeVariable<?>, Type> direct = TypeUtils.determineTypeArguments(List.class, listOfNumber);
        assertEquals(Number.class, direct.get(List.class.getTypeParameters()[0]));
        assertNull(TypeUtils.determineTypeArguments(String.class, listOfNumber));
    }

    @Test
    public void testIsInstanceNullAndClassTypes() throws Exception {
        assertTrue(TypeUtils.isInstance(null, String.class));
        assertFalse(TypeUtils.isInstance(null, int.class));
        assertFalse(TypeUtils.isInstance("x", null));
        assertTrue(TypeUtils.isInstance("x", CharSequence.class));
        assertFalse(TypeUtils.isInstance("x", Integer.class));
    }

    @Test
    public void testIsInstanceParameterizedTypes() throws Exception {
        Type listString = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        assertFalse(TypeUtils.isInstance(Arrays.asList("x"), listString));
        assertFalse(TypeUtils.isInstance(Arrays.asList(1), listString));
    }

    @Test
    public void testNormalizeUpperBounds() throws Exception {
        Type[] bounds = TypeUtils.normalizeUpperBounds(new Type[] { Object.class, Number.class });
        assertEquals(1, bounds.length);
        assertEquals(Number.class, bounds[0]);
    }

    @Test
    public void testNormalizeUpperBoundsSingleAndUnrelated() throws Exception {
        Type[] single = { String.class };
        assertSame(single, TypeUtils.normalizeUpperBounds(single));
        Type[] unrelated = TypeUtils.normalizeUpperBounds(new Type[] { String.class, Integer.class });
        assertEquals(2, unrelated.length);
        assertTrue(Arrays.asList(unrelated).contains(String.class));
        assertTrue(Arrays.asList(unrelated).contains(Integer.class));
    }

    @Test
    public void testGetImplicitBounds() throws Exception {
        TypeVariable<?> variable = SampleBound.class.getTypeParameters()[0];
        Type[] bounds = TypeUtils.getImplicitBounds(variable);
        assertEquals(1, bounds.length);
        assertEquals(Number.class, bounds[0]);
    }

    @Test
    public void testGetImplicitUpperAndLowerBounds() throws Exception {
        assertEquals(1, TypeUtils.getImplicitUpperBounds(
                (WildcardType) TypeUtilsTest.class.getDeclaredField("wildcard").getGenericType()).length);
        assertEquals(Object.class, TypeUtils.getImplicitUpperBounds(
                (WildcardType) TypeUtilsTest.class.getDeclaredField("wildcard").getGenericType())[0]);
        assertEquals(1, TypeUtils.getImplicitLowerBounds(
                (WildcardType) TypeUtilsTest.class.getDeclaredField("wildcard").getGenericType()).length);
        assertNull(TypeUtils.getImplicitLowerBounds(
                (WildcardType) TypeUtilsTest.class.getDeclaredField("wildcard").getGenericType())[0]);
    }

    @Test
    public void testTypesSatisfyVariablesBoundEdges() throws Exception {
        TypeVariable<?> numberVar = SampleBound.class.getTypeParameters()[0];
        Map<TypeVariable<?>, Type> valid = new HashMap<TypeVariable<?>, Type>();
        valid.put(numberVar, Integer.class);
        assertTrue(TypeUtils.typesSatisfyVariables(valid));
        valid.put(numberVar, String.class);
        assertFalse(TypeUtils.typesSatisfyVariables(valid));
    }

    @Test
    public void testGetRawTypeClassParameterizedAndUnresolved() throws Exception {
        Type listString = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        assertEquals(String[].class, TypeUtils.getRawType(String[].class, null));
        assertEquals(List.class, TypeUtils.getRawType(listString, null));
        assertNull(TypeUtils.getRawType(SampleBound.class.getTypeParameters()[0], null));
    }

    @Test
    public void testGetRawTypeTypeVariableInContext() throws Exception {
        TypeVariable<?> variable = GenericList.class.getTypeParameters()[0];
        Type context = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        assertNull(TypeUtils.getRawType(variable, context));
    }

    @Test
    public void testIsArrayTypeEdges() throws Exception {
        assertTrue(TypeUtils.isArrayType(String[].class));
        assertFalse(TypeUtils.isArrayType(String.class));
        assertFalse(TypeUtils.isArrayType(null));
    }

    @Test
    public void testArrayComponentTypeClassArrays() throws Exception {
        assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
        assertEquals(int[].class, TypeUtils.getArrayComponentType(int[][].class));
        assertNull(TypeUtils.getArrayComponentType(String.class));
    }

    @Test
    public void testParameterizedTypeAssignabilityViaRawClass() throws Exception {
        Type listString = TypeUtilsTest.class.getDeclaredField("listString").getGenericType();
        assertTrue(TypeUtils.isAssignable(listString, List.class));
        assertTrue(TypeUtils.isAssignable(null, listString));
    }

    private static List<String> listString;
    private static List<Integer> listInteger;
    private static List<? extends Object> listExtendsObject;
    private static List<Number> listNumber;
    private static List<?> wildcard;

    private static class SampleBound<T extends Number> { }
    private static class GenericList<T> extends java.util.ArrayList<T> { }
    private static class ArrayListString extends java.util.ArrayList<String> { }
}
