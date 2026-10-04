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
        // Infer from a concrete class that extends a parameterized class
        Type genericSuperclass = ConcreteSimpleGenericClass.class.getGenericSuperclass();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericSuperclass);
        assertNotNull(metadata);
        assertEquals(SimpleGenericClass.class, metadata.rawType()); // Raw type should be SimpleGenericClass
        assertTrue(metadata.extraInterfaces().isEmpty());
        assertTrue(Arrays.equals(new Class[0], metadata.rawExtraInterfaces()));
        assertFalse(metadata.hasRawExtraInterfaces());

        // Check the actual type arguments resolved
        TypeVariable<?> xVar = getSimpleGenericClassTypeVariable("X");
        Map<TypeVariable, Type> actualArgs = metadata.actualTypeArguments();
        assertNotNull(actualArgs);
        assertEquals(String.class, actualArgs.get(xVar)); // X should be resolved to String
    }

    @Test
    public void testInferFromUnsupportedTypeThrowsException() throws Exception {
        // Simulate an unsupported Type by creating a dummy Type.
        try {
            GenericMetadataSupport.inferFrom(new Type() {
                @Override public String toString() { return "UnsupportedType"; }
                @Override public String getTypeName() { return "UnsupportedType"; } // Required for Java 11+
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
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(method.getGenericReturnType());
        assertEquals(int.class, metadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForParameterizedType() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfT");
        Type genericReturnType = method.getGenericReturnType(); // This is ParameterizedType: List<T>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        // The type argument for List<T> should be T.
        // To get the actual type argument for 'E' in List<E>, we need the context of TestInterface.
        // The actualTypeArguments() method resolves type variables based on the enclosing class/method.
        // For List<T>, the actual type argument for List's type parameter 'E' is T.
        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.actualTypeArguments().get(listEVar);

        // The source code's contextualActualTypeParameters map is used.
        // When resolveGenericReturnType is called on List<T>, it creates ParameterizedReturnType.
        // This then registers type parameters of TestInterface and then type variables of List<T>.
        // The actualTypeArguments for List<T> should resolve 'E' to 'T'.
        // We need to ensure that metadata.contextualActualTypeParameters correctly maps 'T' (from TestInterface) to itself.
        // And then resolve 'E' in List<E> to 'T'.

        // Let's get the TypeVariable 'T' from TestInterface to compare.
        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        // The current metadata is for List<T>. We need to resolve List's type parameter 'E'.
        // The `getActualTypeArgumentFor` method on `ParameterizedReturnType` will look up in the context.
        // The `contextualActualTypeParameters` in `ParameterizedReturnType` is initialized from the source `GenericMetadataSupport`.
        // The `source` here is `GenericMetadataSupport.inferFrom(TestInterface.class)` effectively.
        // So `contextualActualTypeParameters` should contain T -> T.
        // And `registerTypeVariablesOn(parameterizedType)` for List<T> will register E -> T.
        assertEquals(tVar, metadata.getActualTypeArgumentFor(listEVar));
    }

    @Test
    public void testResolveGenericReturnTypeForTypeVariable() throws Exception {
        Method method = getMethod(TestInterface.class, "getT");
        Type genericReturnType = method.getGenericReturnType(); // This is TypeVariable 'T'
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
        Type genericReturnType = method.getGenericReturnType(); // This is ParameterizedType: List<? extends T>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> listEVar = getListTypeVariable("E");

        // Resolve the type argument for List's 'E'
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
        Type genericReturnType = method.getGenericReturnType(); // This is ParameterizedType: List<? super T>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> listEVar = getListTypeVariable("E");

        // Resolve the type argument for List's 'E'
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
        Type genericReturnType = method.getGenericReturnType(); // This is ParameterizedType: Map<T, U>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);
        assertEquals(Map.class, metadata.rawType());

        TypeVariable<?> tVar = getTestInterfaceTypeVariable("T");
        TypeVariable<?> uVar = getTestInterfaceTypeVariable("U");
        TypeVariable<?> mapKVar = getMapTypeVariable("K");
        TypeVariable<?> mapVVar = getMapTypeVariable("V");

        // The actual type arguments for Map<K, V> where K is T and V is U
        assertEquals(tVar, metadata.getActualTypeArgumentFor(mapKVar));
        assertEquals(uVar, metadata.getActualTypeArgumentFor(mapVVar));
    }

    @Test
    public void testResolveGenericReturnTypeForGenericMethodParam() throws Exception {
        Method method = getMethod(TestInterface.class, "getGenericMethodParam", Object.class);
        Type genericReturnType = method.getGenericReturnType(); // This is TypeVariable 'V' declared on the method
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> vMethodTypeVar = method.getTypeParameters()[0]; // The method's type parameter V
        TypeVariable<?> tInterfaceTypeVar = getTestInterfaceTypeVariable("T"); // The class's type parameter T

        // The raw type of the metadata should be the method's TypeVariable 'V' itself.
        assertEquals(vMethodTypeVar, metadata.rawType());
        // The contextual type parameters should resolve 'V' to 'T' based on the method's bound <V extends T>.
        // The `ParameterizedReturnType` (or `TypeVariableReturnType` if the return type itself is a TypeVariable)
        // will be created with the `source`'s `contextualActualTypeParameters`.
        // The `source` here is created by `inferFrom(TestInterface.class)`, which populates `contextualActualTypeParameters` with `T -> T` and `U -> U`.
        // Then, when `resolveGenericReturnType` is called on `getGenericMethodParam`, it will create a `TypeVariableReturnType` for `V`.
        // Inside `TypeVariableReturnType`, `readTypeVariables` is called.
        // It iterates through `typeVariable.getBounds()`, which for `V extends T` is `T`.
        // It registers `T` (which is already in `contextualActualTypeParameters`) and also `getActualTypeArgumentFor(V)`.
        // `getActualTypeArgumentFor(V)` will look up `V` in `contextualActualTypeParameters` (not found initially) and then recursively calls itself on the bound of `V` which is `T`.
        // `getActualTypeArgumentFor(T)` will find `T` in `contextualActualTypeParameters` and return `T`.
        // So, `V` is effectively resolved to `T`.
        assertEquals(tInterfaceTypeVar, metadata.getActualTypeArgumentFor(vMethodTypeVar));
    }

    // --- Tests for GenericMetadataSupport internal logic accessible via public methods ---

    @Test
    public void testActualTypeArgumentsOnParameterizedClass() throws Exception {
        // Infer from the generic superclass of an anonymous ArrayList<String>
        // The generic superclass is List<String>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(new ArrayList<String>() {}.getClass().getGenericSuperclass());
        assertEquals(List.class, metadata.rawType());

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Map<TypeVariable, Type> actualArgs = metadata.actualTypeArguments();
        assertNotNull(actualArgs);
        // The type argument for List's 'E' should be String.
        assertEquals(String.class, actualArgs.get(listEVar));
    }

    @Test
    public void testRegisterTypeVariablesOnParameterizedType() throws Exception {
        // Infer from the generic superclass of an anonymous HashMap<Integer, String>
        // The generic superclass is Map<Integer, String>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(new HashMap<Integer, String>() {}.getClass().getGenericSuperclass());
        assertEquals(Map.class, metadata.rawType());

        TypeVariable<?> mapKVar = getMapTypeVariable("K");
        TypeVariable<?> mapVVar = getMapTypeVariable("V");

        // The contextualActualTypeParameters map should be populated with the type arguments.
        // This test checks if the internal map is correctly populated.
        assertEquals(Integer.class, metadata.contextualActualTypeParameters.get(mapKVar));
        assertEquals(String.class, metadata.contextualActualTypeParameters.get(mapVVar));
    }

    @Test
    public void testBoundsOfForWildcardWithExtendsBound() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardExtendsT");
        Type genericReturnType = method.getGenericReturnType(); // List<? extends T>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar); // Should resolve to ? extends T

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(getTestInterfaceTypeVariable("T"), wildcard.getUpperBounds()[0]); // Upper bound is T
        assertEquals(0, wildcard.getLowerBounds().length); // No lower bound
    }

    @Test
    public void testBoundsOfForWildcardWithSuperBound() throws Exception {
        Method method = getMethod(TestInterface.class, "getListOfWildcardSuperT");
        Type genericReturnType = method.getGenericReturnType(); // List<? super T>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> listEVar = getListTypeVariable("E");
        Type resolvedE = metadata.getActualTypeArgumentFor(listEVar); // Should resolve to ? super T

        assertTrue(resolvedE instanceof WildcardType);
        WildcardType wildcard = (WildcardType) resolvedE;
        assertEquals(0, wildcard.getUpperBounds().length); // No upper bound
        assertEquals(1, wildcard.getLowerBounds().length);
        assertEquals(getTestInterfaceTypeVariable("T"), wildcard.getLowerBounds()[0]); // Lower bound is T
    }

    // Helper to get TypeVariable from TestInterface
    private TypeVariable<?> getTestInterfaceTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = TestInterface.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        throw new AssertionError("Type variable '" + name + "' not found in TestInterface");
    }

    // Helper to get TypeVariable from List
    private TypeVariable<?> getListTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = List.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        throw new AssertionError("Type variable '" + name + "' not found in List");
    }

    // Helper to get TypeVariable from Map
    private TypeVariable<?> getMapTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = Map.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        throw new AssertionError("Type variable '" + name + "' not found in Map");
    }

    // Helper to get TypeVariable from Set
    private TypeVariable<?> getSetTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = Set.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        throw new AssertionError("Type variable '" + name + "' not found in Set");
    }

    // Helper to get TypeVariable from SimpleGenericClass
    private TypeVariable<?> getSimpleGenericClassTypeVariable(String name) {
        TypeVariable<?>[] typeVariables = SimpleGenericClass.class.getTypeParameters();
        for (TypeVariable<?> tv : typeVariables) {
            if (tv.getName().equals(name)) {
                return tv;
            }
        }
        throw new AssertionError("Type variable '" + name + "' not found in SimpleGenericClass");
    }

    @Test
    public void testActualTypeArgumentsReturnsMapOfCorrectSize() throws Exception {
        Method method = getMethod(TestInterface.class, "getMapOfTToU");
        Type genericReturnType = method.getGenericReturnType(); // Map<T, U>
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        // The actualTypeArguments() for Map<T, U> should resolve 'K' to 'T' and 'V' to 'U'.
        // The number of entries should correspond to the number of type parameters of the raw type (Map).
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
            // The `Checks.checkNotNull` will throw NullPointerException, but the error message might vary.
            // Let's check for the presence of "type" in the message as it's part of the `Checks.checkNotNull` call.
            assertTrue(e.getMessage().contains("type"));
        }
    }

    @Test
    public void testTypeVariableReturnTypeCorrectlyExtractsRawTypeFromTypeVariableBound() throws Exception {
        // Test the `extractRawTypeOf` method within `TypeVariableReturnType`.
        // We need a scenario where a TypeVariable's bound is a Class.
        // Let's use the `TestInterface.getU()` method which returns `U`, where `U extends Number`.
        // The `getU` method's return type is `U` (a TypeVariable).
        Method method = getMethod(TestInterface.class, "getU");
        Type genericReturnType = method.getGenericReturnType(); // This is TypeVariable 'U'
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(genericReturnType);

        TypeVariable<?> uVar = getTestInterfaceTypeVariable("U");
        // The raw type of `U` itself should be resolved. `U` is bound by `Number`.
        // `extractRawTypeOf` on `U` should delegate to `extractRawTypeOf` on its bounds.
        // The first bound of `U` is `Number`. So `extractRawTypeOf(U)` should return `Number.class`.
        assertEquals(Number.class, metadata.rawType());

        // Also test the `actualTypeArguments()` for `U`. It should resolve `U` to `Number`.
        assertEquals(Number.class, metadata.getActualTypeArgumentFor(uVar));
    }
}
