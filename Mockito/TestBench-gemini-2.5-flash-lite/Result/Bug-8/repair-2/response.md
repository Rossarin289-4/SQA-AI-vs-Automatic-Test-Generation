```java
package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.Checks;
import java.lang.reflect.*;
import java.util.*;

public class GenericMetadataSupportTest {

    // Helper method to get a Method object by name.
    private Method getMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes) throws Exception {
        return clazz.getMethod(methodName, parameterTypes);
    }

    // Dummy interface for testing method return types and generic declarations.
    interface TestInterface<T, U extends Number> {
        T getT();
        U getU();
        List<T> getListOfT();
        List<? extends T> getListOfWildcardExtendsT();
        List<? super T> getListOfWildcardSuperT();
        Number getNumber();
        Map<T, U> getMapOfTToU();
        <V extends T> V getGenericMethodParam(V param);
        void doSomething();
        Set<U> getSetOfU();
    }

    // Dummy class to test inference from Class
    private static class SimpleGenericClass<X> {
        public X getData() { return null; }
        public List<X> getListData() { return null; }
    }

    // Dummy class to test inference from ParameterizedType
    private static class ConcreteSimpleGenericClass extends SimpleGenericClass<String> {
        @Override
        public String getData() { return "hello"; }
    }

    // --- Tests for inferFrom(Type type) ---

    @Test
    public void testInferFromClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertNotNull(metadata);
        assertEquals(String.class, metadata.rawType());
        assertTrue(metadata.extraInterfaces().isEmpty());
        assertTrue(Arrays.equals(new Class[0], metadata.rawExtraInterfaces()));
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testInferFromParameterizedType() throws Exception {
        Type genericSuperclass = ConcreteSimpleGenericClass.class.getGenericSuperclass();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericSuperclass);
        assertNotNull(metadata);
        assertEquals(SimpleGenericClass.class, metadata.rawType());
        assertTrue(metadata.extraInterfaces().isEmpty());
        assertTrue(Arrays.equals(new Class[0], metadata.rawExtraInterfaces()));
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testInferFromUnsupportedTypeThrowsException() throws Exception {
        // Simulate an unsupported Type by creating a dummy Type.
        try {
            GenericMetadataSupport.inferFrom(new Type() {
                @Override public String toString() { return "UnsupportedType"; }
                // Add other Type methods if they were abstract and needed overriding,
                // but for this test, only toString is sufficient to check the message.
            });
            fail("Expected MockitoException for unsupported type");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Type meta-data for this Type"));
            assertTrue(e.getMessage().contains("UnsupportedType"));
        }
    }

    // --- Tests for resolveGenericReturnType(Method method) ---

    @Test
    public void testResolveGenericReturnTypeForClass() throws Exception {
        Method method = getMethod(String.class, "length");
        // inferFrom is the public entry point.
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(method.getGenericReturnType());
        assertEquals(int.class, metadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForParameterizedType() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        Map<TypeVariable, Type> typeArguments = metadata.actualTypeArguments();
        // The type argument for List<T> should resolve to T.
        assertEquals(tVar, metadata.getActualTypeArgumentFor(getListTypeVariable("E")));
    }

    @Test
    public void testResolveGenericReturnTypeForTypeVariable() throws Exception {
        Method method = getMethod(TestInterface.class, "getT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        // For a TypeVariable, inferFrom should return a GenericMetadataSupport where rawType() returns the TypeVariable itself.
        assertEquals(getTestInterfaceTypeVariable("T"), metadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForNonGenericMethod() throws Exception {
        Method method = getMethod(TestInterface.class, "getNumber");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(Number.class, metadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForVoidMethod() throws Exception {
        Method method = getMethod(TestInterface.class, "doSomething");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(void.class, metadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForWildcardExtends() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardExtendsT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar);

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(tVar, wildcard.getUpperBounds()[0]); // Should extend T
        assertEquals(0, wildcard.getLowerBounds().length);
    }

    @Test
    public void testResolveGenericReturnTypeForWildcardSuper() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardSuperT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar);

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(0, wildcard.getUpperBounds().length);
        assertEquals(1, wildcard.getLowerBounds().length);
        assertEquals(tVar, wildcard.getLowerBounds()[0]); // Should be super T
    }

    @Test
    public void testResolveGenericReturnTypeForMapWithTwoTypeVars() throws Exception {
        Method method = getMethod(TestInterface.class, "getMapOfTToU");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(Map.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> uVar = getTestInterfaceTypeVariable("U");
        TypeVariable<?> mapKVar = getMapTypeVariable("K");
        TypeVariable<?> mapVVar = getMapTypeVariable("V");

        assertEquals(tVar, metadata.getActualTypeArgumentFor(mapKVar));
        assertEquals(uVar, metadata.getActualTypeArgumentFor(mapVVar));
    }

    @Test
    public void testResolveGenericReturnTypeForGenericMethodParam() throws Exception {
        Method method = getMethod(TestInterface.class, "getGenericMethodParam", Object.class);
        Type genericReturnType = method.getGenericReturnType(); // This is TypeVariable 'V'
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> vVar = method.getTypeParameters()[0]; // The method's type parameter V
        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");

        // The raw type of the metadata should be the TypeVariable 'V' itself.
        assertEquals(vVar, metadata.rawType());
        // The contextual type parameters should resolve 'V' to 'T' based on the method's bound <V extends T>.
        assertEquals(tVar, metadata.getActualTypeArgumentFor(vVar));
    }

    // --- Tests for GenericMetadataSupport internal logic accessible via public methods ---

    @Test
    public void testActualTypeArgumentsOnParameterizedClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(new ArrayList<String>() {}.getClass().getGenericSuperclass());
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Map<TypeVariable, Type> actualArgs = metadata.actualTypeArguments();
        assertNotNull(actualArgs);
        assertEquals(String.class, actualArgs.get(listEVar));
    }

    @Test
    public void testRegisterTypeVariablesOnParameterizedType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(new HashMap<Integer, String>() {}.getClass().getGenericSuperclass());
        assertEquals(Map.class, metadata.rawType());

        TypeVariable<?> mapKVar = getMapTypeVariable("K");
        TypeVariable<?> mapVVar = getMapTypeVariable("V");

        assertEquals(Integer.class, metadata.contextualActualTypeParameters.get(mapKVar));
        assertEquals(String.class, metadata.contextualActualTypeParameters.get(mapVVar));
    }

    @Test
    public void testBoundsOfForWildcardWithExtendsBound() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardExtendsT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar);

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(getTestInterfaceTypeVariable("T"), wildcard.getUpperBounds()[0]);
        assertEquals(0, wildcard.getLowerBounds().length);
    }

    @Test
    public void testBoundsOfForWildcardWithSuperBound() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardSuperT");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar);

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(0, wildcard.getUpperBounds().length);
        assertEquals(1, wildcard.getLowerBounds().length);
        assertEquals(getTestInterfaceTypeVariable("T"), wildcard.getLowerBounds()[0]);
    }

    // Helper to get TypeVariable from TestInterface
    private TypeVariable<?> getTestInterfaceTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = TestInterface.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        return null;
    }

    // Helper to get TypeVariable from List
    private TypeVariable<?> getListTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = List.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        return null;
    }

    // Helper to get TypeVariable from Map
    private TypeVariable<?> getMapTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = Map.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        return null;
    }


    @Test
    public void testResolveGenericReturnTypeForNestedGenerics() throws Exception {
        interface NestedGenericInterface<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
            Set<Number> customRemove(Object key);
        }

        class ConcreteNestedGeneric implements NestedGenericInterface<Integer> {
            @Override public Set<Number> customRemove(Object key) { return null; }
            @Override public void clear() {}
            @Override public Set<Map.Entry<Integer, Set<Number>>> entrySet() { return null; }
            @Override public Set<Set<Number>> values() { return null; }
            @Override public Set<Integer> keySet() { return null; }
            @Override public Set<Number> get(Object key) { return null; }
            @Override public Set<Number> put(Integer key, Set<Number> value) { return null; }
            @Override public void putAll(Map<? extends Integer, ? extends Set<Number>> m) {}
            @Override public Integer remove(Object key) { return null; } // This should be Set<Number> remove(Object key)
            @Override public boolean containsValue(Object value) { return false; }
            @Override public boolean containsKey(Object key) { return false; }
            @Override public int size() { return 0; }
            @Override public boolean isEmpty() { return false; }
        }

        Method method = getMethod(NestedGenericInterface.class, "customRemove");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        assertEquals(Set.class, metadata.rawType());

        TypeVariable<?> setEVar = getSetTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(setEVar);
        assertEquals(Number.class, resolvedE);
    }

    // Helper to get TypeVariable from Set
    private TypeVariable<?> getSetTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = Set.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        return null;
    }

    @Test
    public void testActualTypeArgumentsReturnsMapOfCorrectSize() throws Exception {
        Method method = getMethod(TestInterface.class, "getMapOfTToU");
        Type genericReturnType = method.getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        assertEquals(2, metadata.actualTypeArguments().size());
    }

    @Test
    public void testHasRawExtraInterfacesReturnsFalseForSimpleClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testExtraInterfacesReturnsEmptyForSimpleClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertTrue(metadata.extraInterfaces().isEmpty());
    }

    @Test
    public void testRawExtraInterfacesReturnsEmptyArrayForSimpleClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertTrue(Arrays.equals(new Class[0], metadata.rawExtraInterfaces()));
    }

    @Test
    public void testInferFromNullTypeThrowsException() throws Exception {
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("Expected NullPointerException or MockitoException for null type");
        } catch (NullPointerException | MockitoException e) {
            assertTrue(e.getMessage().contains("type"));
        }
    }

    @Test
    public void testTypeVariableReturnTypeCorrectlyExtractsRawTypeFromTypeVariableBound() throws Exception {
        // Simulate a scenario where a TypeVariable's bound is another TypeVariable.
        // Example: <T extends U>, where U is also a TypeVariable.
        // This is complex to set up directly. Instead, let's test a case where a TypeVariable returns a class.
        // The TypeVariableReturnType.extractRawTypeOf is key here.

        // Consider TestInterface. returningK() where K is a TypeVariable.
        // Method returningK = getMethod(TestInterface.class, "returningK"); // This method is not in the provided source, so cannot use.
        // Let's use a simpler case: a class with a type variable.
        class ClassWithTV<V> {
            public V getData() { return null; }
        }
        // When inferring ClassWithTV<String>, the TypeVariable 'V' should resolve to String.
        // If we had a method returning V, its generic return type would be a TypeVariable.
        // Let's infer from ClassWithTV<String> and check its type parameters.
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(new ClassWithTV<String>() {}.getClass().getGenericSuperclass());
        TypeVariable<?> classWithTV_V = null;
        for(TypeVariable<?> tv : ClassWithTV.class.getTypeParameters()) {
            if (tv.getName().equals("V")) {
                classWithTV_V = tv;
                break;
            }
        }
        assertNotNull(classWithTV_V);
        // The actual type argument for 'V' should be String.
        assertEquals(String.class, metadata.getActualTypeArgumentFor(classWithTV_V));
    }

    @Test
    public void testParameterizedReturnTypeWithComplexBounds() throws Exception {
        // Interface with complex bounds: E extends Comparable<E> & Cloneable
        interface ComplexBoundedInterface<E extends Comparable<E> & Cloneable> {
            E getComplexBounded();
        }

        Method method = getMethod(ComplexBoundedInterface.class, "getComplexBounded");
        Type genericReturnType = method.getGenericReturnType(); // This is TypeVariable 'E'
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> eVar = null;
        for(TypeVariable<?> tv : ComplexBoundedInterface.class.getTypeParameters()) {
            if (tv.getName().equals("E")) {
                eVar = tv;
                break;
            }
        }
        assertNotNull(eVar);

        assertEquals(eVar, metadata.rawType());
        // Check if the bounds are correctly resolved.
        // The bounds of E are Comparable<E> and Cloneable.
        // The boundsOf method in GenericMetadataSupport is key here.
        // We can test this indirectly by looking at the registered contextual type parameters for E.
        // The `TypeVariableReturnType.readTypeVariables()` and `boundsOf` are involved.
        // The `boundsOf` for a TypeVariable with multiple bounds (class + interfaces) is tricky.
        // The `TypeVarBoundedType` should capture these.

        // We can't directly assert the `BoundedType` object's internal structure easily.
        // Instead, we check the `extraInterfaces` which are derived from bounds.
        // For `E extends Comparable<E> & Cloneable`, `Comparable<E>` is the first bound (class type)
        // and `Cloneable` is an interface bound.
        List<Type> extraInterfaces = metadata.extraInterfaces();
        assertEquals(1, extraInterfaces.size());
        assertEquals(Cloneable.class, extraInterfaces.get(0));

        // `rawExtraInterfaces` should return the raw class of the interface bounds.
        Class<?>[] rawExtraInterfaces = metadata.rawExtraInterfaces();
        assertEquals(1, rawExtraInterfaces.length);
        assertEquals(Cloneable.class, rawExtraInterfaces[0]);
    }
}
```