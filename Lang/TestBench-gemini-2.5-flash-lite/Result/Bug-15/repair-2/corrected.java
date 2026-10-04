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
    public void testIsAssignable_typeVariableToClass() throws Exception {
        TypeVariable<?> typeVar = new MockTypeVariable("T", new Type[]{Object.class});
        assertTrue(TypeUtils.isAssignable(typeVar, Object.class));
        assertTrue(TypeUtils.isAssignable(typeVar, Serializable.class));
        assertFalse(TypeUtils.isAssignable(typeVar, String.class));
    }

    @Test
    public void testIsAssignable_genericArrayTypeToClass() throws Exception {
        GenericArrayType stringArray = new MockGenericArrayType(String.class);
        assertTrue(TypeUtils.isAssignable(stringArray, Object.class));
        assertTrue(TypeUtils.isAssignable(stringArray, Object[].class));
        assertTrue(TypeUtils.isAssignable(stringArray, Serializable[].class));
        assertFalse(TypeUtils.isAssignable(stringArray, String[].class));
        assertFalse(TypeUtils.isAssignable(stringArray, String.class));
    }

    @Test
    public void testIsAssignable_wildcardTypeToClass() throws Exception {
        WildcardType wildcardExtendsString = new MockWildcardType(new Type[]{String.class}, null);
        assertTrue(TypeUtils.isAssignable(wildcardExtendsString, Object.class));
        assertFalse(TypeUtils.isAssignable(wildcardExtendsString, String.class));
        assertFalse(TypeUtils.isAssignable(wildcardExtendsString, List.class));
    }

    @Test
    public void testIsAssignable_classToParameterizedType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        assertFalse(TypeUtils.isAssignable(String.class, listString));
        assertFalse(TypeUtils.isAssignable(List.class, listString));
    }

    @Test
    public void testIsAssignable_parameterizedTypeToParameterizedType() throws Exception {
        ParameterizedType listString1 = new MockParameterizedType(List.class, null, String.class);
        ParameterizedType listString2 = new MockParameterizedType(List.class, null, String.class);
        ParameterizedType listObject = new MockParameterizedType(List.class, null, Object.class);
        ParameterizedType stringList = new MockParameterizedType(String.class, null);

        assertTrue(TypeUtils.isAssignable(listString1, listString2));
        assertFalse(TypeUtils.isAssignable(listString1, listObject));
        assertFalse(TypeUtils.isAssignable(listObject, listString1));
        assertFalse(TypeUtils.isAssignable(listString1, stringList));
    }

    @Test
    public void testIsAssignable_typeVariableToTypeVariable() throws Exception {
        TypeVariable<?> varT = new MockTypeVariable("T", new Type[]{Object.class});
        TypeVariable<?> varS = new MockTypeVariable("S", new Type[]{Object.class});
        assertTrue(TypeUtils.isAssignable(varT, varT));
        assertTrue(TypeUtils.isAssignable(varT, varS));
        assertTrue(TypeUtils.isAssignable(varS, varT));
    }

    @Test
    public void testIsAssignable_genericArrayTypeToGenericArrayType() throws Exception {
        GenericArrayType stringArray1 = new MockGenericArrayType(String.class);
        GenericArrayType stringArray2 = new MockGenericArrayType(String.class);
        GenericArrayType objectArray = new MockGenericArrayType(Object.class);

        assertTrue(TypeUtils.isAssignable(stringArray1, stringArray2));
        assertFalse(TypeUtils.isAssignable(stringArray1, objectArray));
        assertFalse(TypeUtils.isAssignable(objectArray, stringArray1));
    }

    @Test
    public void testIsAssignable_wildcardTypeToWildcardType() throws Exception {
        WildcardType wcExtendsString = new MockWildcardType(new Type[]{String.class}, null);
        WildcardType wcExtendsObject = new MockWildcardType(new Type[]{Object.class}, null);
        WildcardType wcSuperString = new MockWildcardType(null, new Type[]{String.class});
        WildcardType wcSuperObject = new MockWildcardType(null, new Type[]{Object.class});

        assertTrue(TypeUtils.isAssignable(wcExtendsString, wcExtendsString));
        assertTrue(TypeUtils.isAssignable(wcExtendsString, wcExtendsObject));
        assertFalse(TypeUtils.isAssignable(wcExtendsObject, wcExtendsString));
        assertTrue(TypeUtils.isAssignable(wcSuperString, wcSuperObject));
        assertFalse(TypeUtils.isAssignable(wcSuperObject, wcSuperString));
        assertFalse(TypeUtils.isAssignable(wcExtendsString, wcSuperString));
        assertFalse(TypeUtils.isAssignable(wcSuperString, wcExtendsString));
    }

    @Test
    public void testGetTypeArguments_parameterizedType() throws Exception {
        ParameterizedType mapStringObject = new MockParameterizedType(Map.class, null, String.class, Object.class);
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(mapStringObject);
        assertEquals(2, typeArgs.size());
        assertEquals(String.class, typeArgs.get(new MockTypeVariable("K", new Type[]{Object.class})));
        assertEquals(Object.class, typeArgs.get(new MockTypeVariable("V", new Type[]{Object.class})));
    }

    @Test
    public void testGetTypeArguments_nestedParameterizedType() throws Exception {
        ParameterizedType outerListString = new MockParameterizedType(List.class, null, String.class);
        ParameterizedType nestedListString = new MockParameterizedType(List.class, outerListString, String.class);

        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(nestedListString);
        assertEquals(1, typeArgs.size());
        assertEquals(String.class, typeArgs.get(new MockTypeVariable("E", new Type[]{Object.class})));
    }

    @Test
    public void testGetTypeArguments_typeAndClassAssignable() throws Exception {
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(String.class, CharSequence.class);
        assertTrue(typeArgs.isEmpty());
    }

    @Test
    public void testGetTypeArguments_parameterizedTypeAndClassAssignable() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(listString, Collection.class);
        assertTrue(typeArgs.isEmpty());
    }

    @Test
    public void testGetTypeArguments_classWithGenerics() throws Exception {
        TypeVariable<?> typeVarT = new MockTypeVariable("T", new Type[]{Object.class});
        Map<TypeVariable<?>, Type> assignments = new HashMap<>();
        assignments.put(typeVarT, String.class);

        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments(String.class, String.class);
        assertTrue(typeArgs.isEmpty());
    }


    @Test
    public void testDetermineTypeArguments_exactMatch() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.determineTypeArguments(List.class, listString);
        assertEquals(1, typeArgs.size());
        assertEquals(String.class, typeArgs.get(new MockTypeVariable("E", new Type[]{Object.class})));
    }

    @Test
    public void testDetermineTypeArguments_superType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.determineTypeArguments(ArrayList.class, listString);

        assertEquals(1, typeArgs.size());
        assertEquals(String.class, typeArgs.get(new MockTypeVariable("E", new Type[]{Object.class})));
    }

    @Test
    public void testIsInstance_nullValue() throws Exception {
        assertTrue(TypeUtils.isInstance(null, Object.class));
        assertFalse(TypeUtils.isInstance(null, int.class));
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
        assertTrue(TypeUtils.isInstance(Arrays.asList("a", "b"), listString));
        assertFalse(TypeUtils.isInstance(Arrays.asList(1, 2), listString));
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
        Type[] bounds = new Type[]{String.class, Object.class};
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(1, normalized.length);
        assertEquals(String.class, normalized[0]);
    }

    @Test
    public void testNormalizeUpperBounds_noRedundantBound() throws Exception {
        Type[] bounds = new Type[]{String.class, Number.class};
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(2, normalized.length);
        assertTrue(Arrays.asList(normalized).contains(String.class));
        assertTrue(Arrays.asList(normalized).contains(Number.class));
    }

    @Test
    public void testGetImplicitBounds_noBounds() throws Exception {
        TypeVariable<?> typeVar = new MockTypeVariable("T", new Type[0]);
        Type[] bounds = TypeUtils.getImplicitBounds(typeVar);
        assertEquals(1, bounds.length);
        assertEquals(Object.class, bounds[0]);
    }

    @Test
    public void testGetImplicitBounds_withBounds() throws Exception {
        TypeVariable<?> typeVar = new MockTypeVariable("T", new Type[]{String.class, Number.class});
        Type[] bounds = TypeUtils.getImplicitBounds(typeVar);
        assertEquals(2, bounds.length);
        assertTrue(Arrays.asList(bounds).contains(String.class));
        assertTrue(Arrays.asList(bounds).contains(Number.class));
    }

    @Test
    public void testGetImplicitUpperBounds_noUpperBounds() throws Exception {
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
        Type[] bounds = TypeUtils.getImplicitLowerBounds(wildcard);
        assertEquals(1, bounds.length);
        assertNull(bounds[0]);
    }

    @Test
    public void testGetImplicitLowerBounds_withLowerBounds() throws Exception {
        WildcardType wildcard = new MockWildcardType(null, new Type[]{String.class});
        Type[] bounds = TypeUtils.getImplicitLowerBounds(wildcard);
        assertEquals(1, bounds.length);
        assertEquals(String.class, bounds[0]);
    }

    @Test
    public void testTypesSatisfyVariables_satisfiable() throws Exception {
        TypeVariable<?> varT = new MockTypeVariable("T", new Type[]{CharSequence.class});
        Map<TypeVariable<?>, Type> assignments = new HashMap<>();
        assignments.put(varT, String.class);
        assertTrue(TypeUtils.typesSatisfyVariables(assignments));
    }

    @Test
    public void testTypesSatisfyVariables_notSatisfiable() throws Exception {
        TypeVariable<?> varT = new MockTypeVariable("T", new Type[]{CharSequence.class});
        Map<TypeVariable<?>, Type> assignments = new HashMap<>();
        assignments.put(varT, Integer.class);
        assertFalse(TypeUtils.typesSatisfyVariables(assignments));
    }

    @Test
    public void testGetRawType_parameterizedType() throws Exception {
        ParameterizedType listString = new MockParameterizedType(List.class, null, String.class);
        assertEquals(List.class, TypeUtils.getRawType(listString, null));
    }

    @Test
    public void testGetRawType_typeVariable() throws Exception {
        TypeVariable<?> typeVar = new MockTypeVariable("T", new Type[]{String.class});
        assertEquals(String.class, TypeUtils.getRawType(typeVar, String.class));
    }

    @Test
    public void testGetRawType_genericArrayType() throws Exception {
        GenericArrayType stringArray = new MockGenericArrayType(String.class);
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
    private static class MockTypeVariable<T> implements TypeVariable<Class<T>> {
        private final String name;
        private final Type[] bounds;

        MockTypeVariable(String name, Type[] bounds) {
            this.name = name;
            this.bounds = bounds;
        }

        @Override
        public Type[] getBounds() {
            return bounds;
        }

        @Override
        public Class<T> getGenericDeclaration() {
            return null;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockTypeVariable<?> that = (MockTypeVariable<?>) o;
            return name.equals(that.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public String toString() {
            return name;
        }
    }

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
            this.upperBounds = upperBounds != null ? upperBounds : new Type[]{Object.class};
            this.lowerBounds = lowerBounds != null ? lowerBounds : new Type[0];
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
            if (upperBounds.length == 0 || (upperBounds.length == 1 && upperBounds[0].equals(Object.class))) {
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
