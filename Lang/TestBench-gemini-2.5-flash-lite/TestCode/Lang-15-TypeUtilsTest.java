package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ClassUtils;
import java.io.Serializable;

public class TypeUtilsTest {

    @Test
    public void testIsAssignable_nullTypeAndNullToType() throws Exception {
        assertTrue(TypeUtils.isAssignable(null, (Type) null));
    }

    @Test
    public void testIsAssignable_nullTypeAndNonNullToType() throws Exception {
        assertTrue(TypeUtils.isAssignable(null, Object.class));
    }

    @Test
    public void testIsAssignable_nullTypeAndPrimitiveToType() throws Exception {
        assertFalse(TypeUtils.isAssignable(null, int.class));
    }

    @Test
    public void testIsAssignable_nonNullTypeAndNullToType() throws Exception {
        assertFalse(TypeUtils.isAssignable(Object.class, (Type) null));
    }

    @Test
    public void testIsAssignable_classToClass() throws Exception {
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertTrue(TypeUtils.isAssignable(Object.class, Object.class));
        assertFalse(TypeUtils.isAssignable(Object.class, String.class));
        assertTrue(TypeUtils.isAssignable(Integer.class, Number.class));
        assertTrue(TypeUtils.isAssignable(int.class, int.class));
        assertTrue(TypeUtils.isAssignable(int.class, Integer.class)); // Autoboxing
        assertTrue(TypeUtils.isAssignable(Integer.class, int.class)); // Autounboxing
    }

    @Test
    public void testIsAssignable_parameterizedTypeToClass() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        assertTrue(TypeUtils.isAssignable(listString, List.class));
        assertTrue(TypeUtils.isAssignable(listString, Collection.class));
        assertTrue(TypeUtils.isAssignable(listString, Object.class));
        assertFalse(TypeUtils.isAssignable(listString, String.class));
    }

    @Test
    public void testIsAssignable_genericArrayTypeToClass() throws Exception {
        GenericArrayType stringArray = new MockGenericArrayType(String.class);
        assertTrue(TypeUtils.isAssignable(stringArray, Object.class));
        assertTrue(TypeUtils.isAssignable(stringArray, Object[].class));
        assertTrue(TypeUtils.isAssignable(stringArray, Serializable[].class));
        // A GenericArrayType is not directly assignable to a Class[] of its component type.
        // It is assignable to Object[] and array types that are supertypes of its component type's array type.
        assertFalse(TypeUtils.isAssignable(stringArray, String[].class));
        assertFalse(TypeUtils.isAssignable(stringArray, String.class));
    }

    @Test
    public void testIsAssignable_wildcardTypeToClass() throws Exception {
        // A wildcard type with an upper bound is assignable to Object.
        // It is not directly assignable to a specific class unless that class is a supertype of the bound.
        WildcardType wildcardExtendsString = new MockWildcardType(new Type[]{String.class}, null);
        assertTrue(TypeUtils.isAssignable(wildcardExtendsString, Object.class));
        assertFalse(TypeUtils.isAssignable(wildcardExtendsString, String.class));
        assertFalse(TypeUtils.isAssignable(wildcardExtendsString, List.class));

        // A wildcard with no explicit upper bound is implicitly bound by Object.
        WildcardType wildcardUnknown = new MockWildcardType(null, null);
        assertTrue(TypeUtils.isAssignable(wildcardUnknown, Object.class));
        assertFalse(TypeUtils.isAssignable(wildcardUnknown, String.class));
    }

    @Test
    public void testIsAssignable_classToParameterizedType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        // A raw class is not directly assignable to a parameterized type unless it's a raw type assignment.
        // The `isAssignable` method checks for implicit casts following Java generics rules.
        // Assigning a raw `List` to a `List<String>` is not a direct assignment in generics.
        assertFalse(TypeUtils.isAssignable(List.class, listString));
        assertFalse(TypeUtils.isAssignable(String.class, listString));
    }

    @Test
    public void testIsAssignable_parameterizedTypeToParameterizedType() throws Exception {
        ParameterizedType listString1 = new MockParameterizedType(List.class, null, String.class);
        ParameterizedType listString2 = new MockParameterizedType(List.class, null, String.class);
        ParameterizedType listObject = new MockParameterizedType(List.class, null, Object.class);
        ParameterizedType stringList = new MockParameterizedType(String.class, null); // This is not a List<String>

        assertTrue(TypeUtils.isAssignable(listString1, listString2));
        assertFalse(TypeUtils.isAssignable(listString1, listObject)); // List<String> is not assignable to List<Object>
        assertFalse(TypeUtils.isAssignable(listObject, listString1)); // List<Object> is not assignable to List<String>
        assertFalse(TypeUtils.isAssignable(listString1, stringList)); // List<String> is not assignable to String
    }

    @Test
    public void testIsAssignable_genericArrayTypeToGenericArrayType() throws Exception {
        GenericArrayType stringArray1 = new MockGenericArrayType(String.class);
        GenericArrayType stringArray2 = new MockGenericArrayType(String.class);
        GenericArrayType objectArray = new MockGenericArrayType(Object.class);

        assertTrue(TypeUtils.isAssignable(stringArray1, stringArray2));
        // A GenericArrayType of String[] is not assignable to a GenericArrayType of Object[] because the component types are not assignable in that direction for arrays.
        assertFalse(TypeUtils.isAssignable(stringArray1, objectArray));
        // Similarly, Object[] is not assignable to String[].
        assertFalse(TypeUtils.isAssignable(objectArray, stringArray1));
    }

    @Test
    public void testIsAssignable_wildcardTypeToWildcardType() throws Exception {
        WildcardType wcExtendsString = new MockWildcardType(new Type[]{String.class}, null);
        WildcardType wcExtendsObject = new MockWildcardType(new Type[]{Object.class}, null);
        WildcardType wcSuperString = new MockWildcardType(null, new Type[]{String.class});
        WildcardType wcSuperObject = new MockWildcardType(null, new Type[]{Object.class});

        assertTrue(TypeUtils.isAssignable(wcExtendsString, wcExtendsString));
        // <? extends String> is assignable to <? extends Object>
        assertTrue(TypeUtils.isAssignable(wcExtendsString, wcExtendsObject));
        // <? extends Object> is NOT assignable to <? extends String>
        assertFalse(TypeUtils.isAssignable(wcExtendsObject, wcExtendsString));

        // <? super String> is assignable to <? super Object>
        assertTrue(TypeUtils.isAssignable(wcSuperString, wcSuperObject));
        // <? super Object> is NOT assignable to <? super String>
        assertFalse(TypeUtils.isAssignable(wcSuperObject, wcSuperString));

        // <? extends String> is NOT assignable to <? super String>
        assertFalse(TypeUtils.isAssignable(wcExtendsString, wcSuperString));
        // <? super String> is NOT assignable to <? extends String>
        assertFalse(TypeUtils.isAssignable(wcSuperString, wcExtendsString));
    }

    @Test
    public void testIsInstance_nullValue() throws Exception {
        assertTrue(TypeUtils.isInstance(null, Object.class));
        assertFalse(TypeUtils.isInstance(null, int.class)); // null is not an instance of a primitive type
    }

    @Test
    public void testIsInstance_nonNullValue() throws Exception {
        assertTrue(TypeUtils.isInstance(new String("abc"), String.class));
        assertTrue(TypeUtils.isInstance(new String("abc"), Object.class));
        assertFalse(TypeUtils.isInstance(new String("abc"), Integer.class));
    }

    @Test
    public void testIsInstance_parameterizedType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        // The `isInstance` method checks if the value is an instance of the raw type of the `type` parameter.
        // It does not perform generic type checking.
        assertTrue(TypeUtils.isInstance(Arrays.asList("a", "b"), listString)); // The value is a List, and List.class is the raw type.
        assertTrue(TypeUtils.isInstance(Arrays.asList(1, 2), listString)); // The value is a List, and List.class is the raw type.
    }

    @Test
    public void testNormalizeUpperBounds_singleBound() throws Exception {
        Type[] bounds = new Type[]{String.class};
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(1, normalized.length);
        assertEquals(String.class, normalized[0]);
    }

    @Test
    public void testNormalizeUpperBounds_redundantBound() throws Exception {
        // String is a subtype of Object, so Object is redundant.
        Type[] bounds = new Type[]{String.class, Object.class};
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(1, normalized.length);
        assertEquals(String.class, normalized[0]);
    }

    @Test
    public void testNormalizeUpperBounds_noRedundantBound() throws Exception {
        // String and Number are not in a subtype relationship where one is redundant.
        Type[] bounds = new Type[]{String.class, Number.class};
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(2, normalized.length);
        // Use contains for sets of types where order might not be guaranteed.
        assertTrue(Arrays.asList(normalized).contains(String.class));
        assertTrue(Arrays.asList(normalized).contains(Number.class));
    }

    @Test
    public void testGetImplicitUpperBounds_noUpperBounds() throws Exception {
        // A WildcardType with no explicit upper bounds implicitly has Object as its upper bound.
        WildcardType wildcard = new MockWildcardType(null, null);
        Type[] bounds = TypeUtils.getImplicitUpperBounds(wildcard);
        assertEquals(1, bounds.length);
        assertEquals(Object.class, bounds[0]);
    }

    @Test
    public void testGetImplicitUpperBounds_withUpperBounds() throws Exception {
        WildcardType wildcard = new MockWildcardType(new Type[]{String.class}, null);
        Type[] bounds = TypeUtils.getImplicitUpperBounds(wildcard);
        assertEquals(1, bounds.length);
        assertEquals(String.class, bounds[0]);
    }

    @Test
    public void testGetImplicitLowerBounds_noLowerBounds() throws Exception {
        WildcardType wildcard = new MockWildcardType(null, null);
        // A WildcardType with no explicit lower bounds returns an empty array.
        Type[] bounds = TypeUtils.getImplicitLowerBounds(wildcard);
        assertEquals(0, bounds.length);
    }

    @Test
    public void testGetImplicitLowerBounds_withLowerBounds() throws Exception {
        WildcardType wildcard = new MockWildcardType(null, new Type[]{String.class});
        Type[] bounds = TypeUtils.getImplicitLowerBounds(wildcard);
        assertEquals(1, bounds.length);
        assertEquals(String.class, bounds[0]);
    }

    @Test
    public void testGetRawType_parameterizedType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        assertEquals(List.class, TypeUtils.getRawType(listString, null));
    }

    @Test
    public void testGetRawType_genericArrayType() throws Exception {
        GenericArrayType stringArray = new MockGenericArrayType(String.class);
        // The raw type of a GenericArrayType is the corresponding Class[] type.
        assertEquals(String[].class, TypeUtils.getRawType(stringArray, null));
    }

    @Test
    public void testIsArrayType_classArray() throws Exception {
        assertTrue(TypeUtils.isArrayType(String[].class));
        assertFalse(TypeUtils.isArrayType(String.class));
    }

    @Test
    public void testIsArrayType_genericArrayType() throws Exception {
        assertTrue(TypeUtils.isArrayType(new MockGenericArrayType(String.class)));
        assertFalse(TypeUtils.isArrayType(new MockParameterizedType(List.class, null, String.class)));
    }

    @Test
    public void testGetArrayComponentType_classArray() throws Exception {
        assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
    }

    @Test
    public void testGetArrayComponentType_genericArrayType() throws Exception {
        assertEquals(String.class, TypeUtils.getArrayComponentType(new MockGenericArrayType(String.class)));
    }

    @Test
    public void testGetArrayComponentType_nonArray() throws Exception {
        assertNull(TypeUtils.getArrayComponentType(String.class));
    }

    // Mock implementations for testing purposes

    private static class MockParameterizedType implements ParameterizedType {
        private final Class<?> rawType;
        private final Type ownerType;
        private final Type[] actualTypeArguments;

        MockParameterizedType(Class<?> rawType, Type ownerType, Type... actualTypeArguments) {
            this.rawType = rawType;
            this.ownerType = ownerType;
            this.actualTypeArguments = actualTypeArguments;
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
            MockParameterizedType that = (MockParameterizedType) o;
            return rawType.equals(that.rawType) &&
                   java.util.Objects.equals(ownerType, that.ownerType) &&
                   Arrays.equals(actualTypeArguments, that.actualTypeArguments);
        }

        @Override
        public int hashCode() {
            int result = rawType.hashCode();
            result = 31 * result + java.util.Objects.hashCode(ownerType);
            result = 31 * result + Arrays.hashCode(actualTypeArguments);
            return result;
        }

        @Override
        public String toString() {
            return rawType.getName() + (ownerType != null ? " in " + ownerType : "") +
                   (actualTypeArguments.length > 0 ? "<" + Arrays.toString(actualTypeArguments) + ">" : "");
        }
    }

    private static class MockWildcardType implements WildcardType {
        private final Type[] upperBounds;
        private final Type[] lowerBounds;

        MockWildcardType(Type[] upperBounds, Type[] lowerBounds) {
            // If no upper bounds are provided, it defaults to Object.
            this.upperBounds = (upperBounds == null || upperBounds.length == 0) ? new Type[]{Object.class} : upperBounds;
            this.lowerBounds = (lowerBounds == null) ? new Type[0] : lowerBounds;
        }

        @Override
        public Type[] getUpperBounds() {
            return upperBounds;
        }

        @Override
        public Type[] getLowerBounds() {
            return lowerBounds;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockWildcardType that = (MockWildcardType) o;
            return Arrays.equals(upperBounds, that.upperBounds) &&
                   Arrays.equals(lowerBounds, that.lowerBounds);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(upperBounds);
            result = 31 * result + Arrays.hashCode(lowerBounds);
            return result;
        }

        @Override
        public String toString() {
            if (lowerBounds.length > 0) {
                return "? super " + Arrays.toString(lowerBounds);
            }
            // If upper bounds are just Object.class, represent as '?'.
            if (upperBounds.length == 1 && upperBounds[0].equals(Object.class)) {
                return "?";
            }
            return "? extends " + Arrays.toString(upperBounds);
        }
    }

    private static class MockGenericArrayType implements GenericArrayType {
        private final Type componentType;

        MockGenericArrayType(Type componentType) {
            this.componentType = componentType;
        }

        @Override
        public Type getGenericComponentType() {
            return componentType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockGenericArrayType that = (MockGenericArrayType) o;
            return componentType.equals(that.componentType);
        }

        @Override
        public int hashCode() {
            return componentType.hashCode();
        }

        @Override
        public String toString() {
            return componentType.toString() + "[]";
        }
    }

    // Dummy classes for testing generic types
    private static class Collection<E> {}
    private static class List<E> extends Collection<E> {}
    private static class Map<K, V> {}
    private static class Serializable implements java.io.Serializable {}
}
