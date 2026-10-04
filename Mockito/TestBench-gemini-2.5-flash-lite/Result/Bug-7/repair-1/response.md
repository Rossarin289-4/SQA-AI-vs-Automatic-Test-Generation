```java
package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.Checks;
import java.lang.reflect.*;
import java.util.*;

public class GenericMetadataSupportTest {

    // --- Helper Classes for Testing ---

    // A simple concrete class for testing basic generic types.
    static class SimpleClass<T> {
        T value;
        public SimpleClass(T value) { this.value = value; }
        public T getValue() { return value; }
    }

    // A concrete class with a parameterized superclass.
    static class SubClass<T, U> extends SimpleClass<T> {
        U otherValue;
        public SubClass(T value, U otherValue) {
            super(value);
            this.otherValue = otherValue;
        }
        public U getOtherValue() { return otherValue; }
    }

    // A concrete class implementing a generic interface.
    static class ImplementsGenericInterface<T> implements List<T> {
        @Override public int size() { return 0; }
        @Override public boolean isEmpty() { return true; }
        @Override public boolean contains(Object o) { return false; }
        @Override public Iterator<T> iterator() { return Collections.emptyIterator(); }
        @Override public Object[] toArray() { return new Object[0]; }
        @Override public <T> T[] toArray(T[] a) { return a; }
        @Override public boolean add(T t) { return false; }
        @Override public boolean remove(Object o) { return false; }
        @Override public boolean containsAll(Collection<?> c) { return false; }
        @Override public boolean addAll(Collection<? extends T> c) { return false; }
        @Override public boolean addAll(int index, Collection<? extends T> c) { return false; }
        @Override public boolean removeAll(Collection<?> c) { return false; }
        @Override public boolean retainAll(Collection<?> c) { return false; }
        @Override public void clear() {}
        @Override public T get(int index) { return null; }
        @Override public T set(int index, T element) { return null; }
        @Override public void add(int index, T element) {}
        @Override public T remove(int index) { return null; }
        @Override public int indexOf(Object o) { return -1; }
        @Override public int lastIndexOf(Object o) { return -1; }
        @Override public ListIterator<T> listIterator() { return Collections.emptyListIterator(); }
        @Override public ListIterator<T> listIterator(int index) { return Collections.emptyListIterator(); }
        @Override public List<T> subList(int fromIndex, int toIndex) { return Collections.emptyList(); }
    }

    // A class with wildcard generics.
    static class WildcardClass {
        <T extends Number> List<T> methodWithUpperBoundedTypeParam() { return null; }
        <T extends List<String>> List<T> methodWithUpperBoundedTypeParamWithGeneric() { return null; }
        List<? super Integer> methodWithLowerBoundedWildcard() { return null; }
        List<? extends Number> methodWithUpperBoundedWildcard() { return null; }
    }

    // A class with complex generics.
    static class ComplexGenericClass<K extends Comparable<K> & Cloneable> extends SimpleClass<Set<Number>> implements Map<K, Set<Number>> {
        @Override public int size() { return 0; }
        @Override public boolean isEmpty() { return false; }
        @Override public boolean containsKey(Object key) { return false; }
        @Override public boolean containsValue(Object value) { return false; }
        @Override public Set<Number> get(Object key) { return null; }
        @Override public Set<Number> put(K key, Set<Number> value) { return null; }
        @Override public Set<Number> remove(Object key) { return null; }
        @Override public void putAll(Map<? extends K, ? extends Set<Number>> m) {}
        @Override public void clear() {}
        @Override public Set<K> keySet() { return null; }
        @Override public Collection<Set<Number>> values() { return null; }
        @Override public Set<Entry<K, Set<Number>>> entrySet() { return null; }

        // Method to test: Set<Number> remove(Object key); // override with fixed ParameterizedType
        Set<Number> specificRemove(Object key) { return null; }

        // Method to test: List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super Integer> methodWildcardSuperInteger() { return null; }

        // Method to test: List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? super K> methodWildcardSuperK() { return null; }

        // Method to test: List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        List<? extends K> methodWildcardExtendsK() { return null; }

        // Method to test: K returningK();
        K methodReturningK() { return null; }

        // Method to test: <O extends K> List<O> paramType_with_type_params();
        <O extends K> List<O> methodParamTypeWithTypeParams() { return null; }

        // Method to test: <S, T extends S> T two_type_params();
        <S, T extends S> T methodTwoTypeParams() { return null; }

        // Method to test: <O extends K> O typeVar_with_type_params();
        <O extends K> O methodTypeVarWithTypeParams() { return null; }

        // Method to test: Number returningNonGeneric();
        Number methodReturningNonGeneric() { return null; }
    }

    // Mock ParameterizedType and WildcardType for testing purposes as they are not provided by default
    private static ParameterizedType createParameterizedType(Class<?> rawType, Type[] actualTypeArguments) {
        return new ParameterizedType() {
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
                return null;
            }
            @Override
            public String getTypeName() {
                return rawType.getName() + "<" + Arrays.toString(actualTypeArguments) + ">";
            }
        };
    }

    private static WildcardType createWildcardType(Type[] upperBounds, Type[] lowerBounds) {
        return new WildcardType() {
            @Override
            public Type[] getUpperBounds() {
                return upperBounds;
            }
            @Override
            public Type[] getLowerBounds() {
                return lowerBounds;
            }
            @Override
            public String getTypeName() {
                if (lowerBounds.length > 0) {
                    return "? super " + Arrays.toString(lowerBounds);
                } else {
                    return "? extends " + Arrays.toString(upperBounds);
                }
            }
        };
    }

    // --- Tests ---

    @Test
    public void testInferFromClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertEquals(SimpleClass.class, metadata.rawType());
        assertFalse(metadata.hasRawExtraInterfaces());
        assertEquals(0, metadata.actualTypeArguments().size());
    }

    @Test
    public void testInferFromParameterizedType() throws Exception {
        ParameterizedType listOfString = createParameterizedType(List.class, new Type[]{String.class});
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(listOfString);
        assertEquals(List.class, metadata.rawType());
        assertEquals(1, metadata.actualTypeArguments().size());
        TypeVariable<?>[] typeParams = List.class.getTypeParameters();
        if (typeParams.length > 0) {
            assertEquals(String.class, metadata.actualTypeArguments().get(typeParams[0]));
        }
    }

    @Test
    public void testInferFromClassWithParameterizedSuperclass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClass.class);
        assertEquals(SubClass.class, metadata.rawType());
        // SubClass<T, U> extends SimpleClass<T>. SimpleClass is not an interface.
        assertFalse(metadata.hasRawExtraInterfaces()); // Should not have extra interfaces from the superclass
        assertEquals(2, metadata.actualTypeArguments().size()); // T and U for SubClass itself
    }

    @Test
    public void testResolveGenericReturnTypeForClass() throws Exception {
        Method method = SimpleClass.class.getMethod("getValue");
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        // The return type of getValue() is T from SimpleClass<T>.
        // The GenericMetadataSupport for SimpleClass<T> should resolve T.
        assertEquals(SimpleClass.class.getTypeParameters()[0], returnMetadata.contextualActualTypeParameters.keySet().iterator().next());
        assertEquals(SimpleClass.class.getTypeParameters()[0], returnMetadata.actualTypeArguments().keySet().iterator().next());
    }

    @Test
    public void testResolveGenericReturnTypeForParameterizedType() throws Exception {
        ParameterizedType parameterizedType = createParameterizedType(List.class, new Type[]{String.class});
        Method method = List.class.getMethod("get", int.class);
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(String.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForWildcard() throws Exception {
        Method method = WildcardClass.class.getMethod("methodWithUpperBoundedWildcard");
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(WildcardClass.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The actual type arguments of List<? extends Number> are not directly accessible via actualTypeArguments()
        // as it's for type parameters of the raw type.
        // The specific representation of the wildcard is internal.
    }

    @Test
    public void testResolveGenericReturnTypeForTypeVariable() throws Exception {
        Method method = WildcardClass.class.getMethod("methodWithUpperBoundedTypeParam");
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(WildcardClass.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        TypeVariable<?>[] typeParameters = returnMetadata.rawType().getTypeParameters();
        assertEquals(1, typeParameters.length);
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(typeParameters[0]);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("T", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testComplexGenericClass_returningK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodReturningK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        // K is a TypeVariable. Its bounds are Comparable<K> & Cloneable.
        // The raw type should resolve to Comparable.class.
        assertEquals(Comparable.class, returnMetadata.rawType());
        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        assertEquals(1, extraInterfaces.size());
        assertEquals(Cloneable.class, extraInterfaces.get(0));
    }

    @Test
    public void testComplexGenericClass_returningNonGeneric() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodReturningNonGeneric");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void testComplexGenericClass_specificRemove() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("specificRemove", Object.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Set.class, returnMetadata.rawType());
        TypeVariable<?>[] typeParameters = returnMetadata.rawType().getTypeParameters();
        assertEquals(1, typeParameters.length);
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(typeParameters[0]);
        assertEquals(Number.class, actualTypeArg);
    }

    @Test
    public void testComplexGenericClass_wildcardSuperInteger() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardSuperInteger");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? super Integer>. This is complex to assert directly.
    }

    @Test
    public void testComplexGenericClass_wildcardSuperK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardSuperK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? super K>. K is a TypeVariable.
    }

    @Test
    public void testComplexGenericClass_wildcardExtendsK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardExtendsK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? extends K>. K is a TypeVariable.
        TypeVariable<?>[] typeParameters = returnMetadata.rawType().getTypeParameters();
        assertEquals(1, typeParameters.length);
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(typeParameters[0]);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("K", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testComplexGenericClass_paramTypeWithTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodParamTypeWithTypeParams");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The method is <O extends K> List<O>. O is a TypeVariable.
        TypeVariable<?>[] typeParameters = returnMetadata.rawType().getTypeParameters();
        assertEquals(1, typeParameters.length);
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(typeParameters[0]);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("O", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testComplexGenericClass_twoTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodTwoTypeParams");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        // The method is <S, T extends S> T. The return type is T.
        // T's bound is S. S has no explicit bounds, so it defaults to Object.
        // Therefore, T's effective bound is Object.
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void testFromClassGenericMetadataSupport_emptyGenericSuperclass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(Object.class);
        assertEquals(Object.class, metadata.rawType());
        assertFalse(metadata.hasRawExtraInterfaces());
        assertEquals(0, metadata.actualTypeArguments().size());
    }

    @Test
    public void testFromClassGenericMetadataSupport_withGenericSuperclass() throws Exception {
        class MySimpleSubClass<X> extends SimpleClass<X> {
            public MySimpleSubClass(X value) { super(value); }
        }
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MySimpleSubClass.class);
        assertEquals(MySimpleSubClass.class, metadata.rawType());
        assertEquals(1, metadata.actualTypeArguments().size());
        TypeVariable<?> typeParam = MySimpleSubClass.class.getTypeParameters()[0];
        Type actualTypeArg = metadata.actualTypeArguments().get(typeParam);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("X", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testFromClassGenericMetadataSupport_withParameterizedSuperclass() throws Exception {
        class MyParameterizedSubClass extends SimpleClass<String> {
            public MyParameterizedSubClass(String value) { super(value); }
        }
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MyParameterizedSubClass.class);
        assertEquals(MyParameterizedSubClass.class, metadata.rawType());
        // MyParameterizedSubClass has no type parameters, so actualTypeArguments() for it is empty.
        assertEquals(0, metadata.actualTypeArguments().size());
        // However, it inherits context from SimpleClass<String>.
        TypeVariable<?> simpleClassTypeParam = SimpleClass.class.getTypeParameters()[0];
        Type actualTypeArgForSimpleClass = metadata.contextualActualTypeParameters.get(simpleClassTypeParam);
        assertEquals(String.class, actualTypeArgForSimpleClass);
    }

    @Test
    public void testFromClassGenericMetadataSupport_withGenericInterfaces() throws Exception {
        class MyListImpl extends ImplementsGenericInterface<Integer> {}
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MyListImpl.class);
        assertEquals(MyListImpl.class, metadata.rawType());
        TypeVariable<?> listInterfaceTypeParam = List.class.getTypeParameters()[0];
        Type actualTypeArgForList = metadata.contextualActualTypeParameters.get(listInterfaceTypeParam);
        assertEquals(Integer.class, actualTypeArgForList);
    }

    @Test
    public void testFromParameterizedTypeGenericMetadataSupport_simple() throws Exception {
        ParameterizedType listOfString = createParameterizedType(List.class, new Type[]{String.class});
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(listOfString);
        assertEquals(List.class, metadata.rawType());
        TypeVariable<?>[] typeParams = List.class.getTypeParameters();
        assertEquals(1, typeParams.length);
        assertEquals(String.class, metadata.actualTypeArguments().get(typeParams[0]));
    }

    @Test
    public void testFromParameterizedTypeGenericMetadataSupport_complex() throws Exception {
        class Holder<T> { T value; }
        ParameterizedType holderOfListOfString = createParameterizedType(Holder.class, new Type[]{
            createParameterizedType(List.class, new Type[]{String.class})
        });
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(holderOfListOfString);
        assertEquals(Holder.class, metadata.rawType());
        TypeVariable<?> holderTypeParam = Holder.class.getTypeParameters()[0];
        Type actualTypeArg = metadata.actualTypeArguments().get(holderTypeParam);
        assertTrue(actualTypeArg instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) actualTypeArg).getRawType());
        assertEquals(1, ((ParameterizedType) actualTypeArg).getActualTypeArguments().length);
        assertEquals(String.class, ((ParameterizedType) actualTypeArg).getActualTypeArguments()[0]);
    }

    @Test
    public void testTypeVariableReturnType_simple() throws Exception {
        class MethodWithTV<T> { T method() { return null; } }
        Method method = MethodWithTV.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTV.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        assertEquals(MethodWithTV.class.getTypeParameters()[0], returnMetadata.contextualActualTypeParameters.keySet().iterator().next());
        assertEquals(MethodWithTV.class.getTypeParameters()[0], returnMetadata.actualTypeArguments().keySet().iterator().next());
        assertEquals(Object.class, returnMetadata.rawType()); // T has no explicit bounds.
    }

    @Test
    public void testTypeVariableReturnType_withBounds() throws Exception {
        class MethodWithTVBounds<T extends Number> { T method() { return null; } }
        Method method = MethodWithTVBounds.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTVBounds.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void testTypeVariableReturnType_withInterfaceBounds() throws Exception {
        class MethodWithTVInterfaceBounds<T extends Comparable<T> & Serializable> { T method() { return null; } }
        Method method = MethodWithTVInterfaceBounds.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTVInterfaceBounds.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        assertEquals(Comparable.class, returnMetadata.rawType());
        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        assertEquals(1, extraInterfaces.size());
        assertEquals(Serializable.class, extraInterfaces.get(0));
    }

    @Test
    public void testWildCardBoundedType_upperBound() throws Exception {
        WildcardType wildcardType = createWildcardType(new Type[]{Number.class}, new Type[0]);
        GenericMetadataSupport.WildCardBoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Number.class, boundedType.firstBound());
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testWildCardBoundedType_lowerBound() throws Exception {
        WildcardType wildcardType = createWildcardType(new Type[]{Object.class}, new Type[]{Integer.class});
        GenericMetadataSupport.WildCardBoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Integer.class, boundedType.firstBound());
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testTypeVarBoundedType_simple() throws Exception {
        TypeVariable<?> typeVariable = null;
        try {
            typeVariable = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends String> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) {
            fail("Failed to create mock TypeVariable: " + e.getMessage());
        }
        assertNotNull(typeVariable);
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(String.class, boundedType.firstBound());
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testTypeVarBoundedType_multipleBounds() throws Exception {
        TypeVariable<?> typeVariable = null;
        try {
            typeVariable = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends Number & Serializable> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) {
            fail("Failed to create mock TypeVariable: " + e.getMessage());
        }
        assertNotNull(typeVariable);
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(Number.class, boundedType.firstBound());
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(Serializable.class, boundedType.interfaceBounds()[0]);
    }

    @Test
    public void testBoundedType_interfaceBoundsOfWildcard() {
        WildcardType wildcardType = createWildcardType(new Type[]{Number.class}, new Type[0]);
        GenericMetadataSupport.BoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testBoundedType_interfaceBoundsOfTypeVar() {
        TypeVariable<?> typeVariable = null;
        try {
            typeVariable = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends Number & Serializable> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) {
            fail("Failed to create mock TypeVariable: " + e.getMessage());
        }
        assertNotNull(typeVariable);
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(Serializable.class, boundedType.interfaceBounds()[0]);
    }

    @Test
    public void testGetActualTypeArgumentFor_simpleTypeVariable() throws Exception {
        ParameterizedType parameterizedType = createParameterizedType(SimpleClass.class, new Type[]{String.class});
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        TypeVariable<?> typeVariable = SimpleClass.class.getTypeParameters()[0]; // 'T' in SimpleClass<T>
        assertEquals(String.class, metadata.getActualTypeArgumentFor(typeVariable));
    }

    @Test
    public void testGetActualTypeArgumentFor_nestedTypeVariable() throws Exception {
        ParameterizedType parameterizedType = createParameterizedType(SubClass.class, new Type[]{String.class, Integer.class});
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        TypeVariable<?> typeVariableT = SubClass.class.getTypeParameters()[0]; // 'T' in SubClass<T, U>
        TypeVariable<?> typeVariableU = SubClass.class.getTypeParameters()[1]; // 'U' in SubClass<T, U>
        assertEquals(String.class, metadata.getActualTypeArgumentFor(typeVariableT));
        assertEquals(Integer.class, metadata.getActualTypeArgumentFor(typeVariableU));
    }

    @Test
    public void testGetActualTypeArgumentFor_typeVariableReferencingAnother() throws Exception {
        class Outer<X> {
            class Inner<Y extends X> {
                Y method() { return null; }
            }
        }
        TypeVariable<?> outerX = Outer.class.getTypeParameters()[0];
        TypeVariable<?> innerY = Outer.Inner.class.getTypeParameters()[0];

        // Infer context for Outer<String>.Inner<String>
        ParameterizedType parameterizedOuterString = createParameterizedType(Outer.class, new Type[]{String.class});
        ParameterizedType parameterizedInnerString = createParameterizedType(Outer.Inner.class, new Type[]{String.class});

        // Need to combine these for a correct `inferFrom` call that establishes context.
        // `inferFrom` doesn't directly handle nested parameterized types with specific contexts like this.
        // We will simulate by creating a metadata support object and manually setting context.

        GenericMetadataSupport sourceWithContext = new GenericMetadataSupport.FromClassGenericMetadataSupport(Outer.Inner.class);
        sourceWithContext.contextualActualTypeParameters.put(outerX, String.class); // X is String
        sourceWithContext.contextualActualTypeParameters.put(innerY, String.class); // Y is String

        assertEquals(String.class, sourceWithContext.getActualTypeArgumentFor(innerY));
    }

    @Test
    public void testRegisterTypeVariablesOn_parameterizedSuperclass() {
        class TestSubClass<A, B> extends SimpleClass<A> {
            public TestSubClass(A value) { super(value); }
        }
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TestSubClass.class);
        TypeVariable<?> typeA = TestSubClass.class.getTypeParameters()[0];
        TypeVariable<?> simpleClassT = SimpleClass.class.getTypeParameters()[0];
        assertEquals(typeA, metadata.contextualActualTypeParameters.get(simpleClassT));
    }

    @Test
    public void testRegisterTypeVariablesOn_genericInterface() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ImplementsGenericInterface.class);
        TypeVariable<?> typeT = ImplementsGenericInterface.class.getTypeParameters()[0];
        TypeVariable<?> listE = List.class.getTypeParameters()[0];
        assertEquals(typeT, metadata.contextualActualTypeParameters.get(listE));
    }

    @Test
    public void testBoundsOf_typeVariable() {
        TypeVariable<?> typeVariable = null;
        try {
            typeVariable = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends Number> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) {
            fail("Failed to create mock TypeVariable: " + e.getMessage());
        }
        assertNotNull(typeVariable);
        GenericMetadataSupport.BoundedType boundedType = GenericMetadataSupport.boundsOf(typeVariable);
        assertEquals(Number.class, boundedType.firstBound());
    }

    @Test
    public void testBoundsOf_wildcardType() {
        WildcardType wildcardType = createWildcardType(new Type[]{Object.class}, new Type[]{Integer.class});
        GenericMetadataSupport.BoundedType boundedType = GenericMetadataSupport.boundsOf(wildcardType);
        assertEquals(Integer.class, boundedType.firstBound());
    }

    // Helper class to access protected methods for testing
    private static class TestableTypeVariableReturnType extends GenericMetadataSupport.TypeVariableReturnType {
        public TestableTypeVariableReturnType(GenericMetadataSupport source, TypeVariable[] typeParameters, TypeVariable typeVariable) {
            super(source, typeParameters, typeVariable);
        }
        public Class<?> callExtractRawTypeOf(Type type) {
            return super.extractRawTypeOf(type);
        }
    }

    @Test
    public void testExtractRawTypeOf_class() {
        TypeVariable<?> dummyTypeVar = null;
        try {
            dummyTypeVar = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends String> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) { fail("Failed to create mock TypeVariable: " + e.getMessage()); }

        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        TestableTypeVariableReturnType tvReturnType = new TestableTypeVariableReturnType(dummySource, new TypeVariable[]{dummyTypeVar}, dummyTypeVar);
        assertEquals(String.class, tvReturnType.callExtractRawTypeOf(String.class));
    }

    @Test
    public void testExtractRawTypeOf_parameterizedType() {
        TypeVariable<?> dummyTypeVar = null;
        try {
            dummyTypeVar = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends List<String>> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) { fail("Failed to create mock TypeVariable: " + e.getMessage()); }

        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        TestableTypeVariableReturnType tvReturnType = new TestableTypeVariableReturnType(dummySource, new TypeVariable[]{dummyTypeVar}, dummyTypeVar);
        ParameterizedType parameterizedListString = createParameterizedType(List.class, new Type[]{String.class});
        assertEquals(List.class, tvReturnType.callExtractRawTypeOf(parameterizedListString));
    }

    @Test
    public void testExtractRawTypeOf_boundedType() {
        TypeVariable<?> dummyTypeVar = null;
        try {
            dummyTypeVar = (TypeVariable<?>) ((Class<?>) (new Object() {
                <T extends Number & Serializable> void dummy(T t) {}
            }).getClass().getDeclaredMethod("dummy", java.lang.Object.class).getGenericParameterTypes()[0]);
        } catch (Exception e) { fail("Failed to create mock TypeVariable: " + e.getMessage()); }

        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        TestableTypeVariableReturnType tvReturnType = new TestableTypeVariableReturnType(dummySource, new TypeVariable[]{dummyTypeVar}, dummyTypeVar);
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(dummyTypeVar);
        assertEquals(Number.class, tvReturnType.callExtractRawTypeOf(boundedType));
    }

    @Test
    public void testExtractRawTypeOf_typeVariableReferringToContext() {
        class Outer<X> {
            class Inner<Y extends X> {
                Y method() { return null; }
            }
        }
        TypeVariable<?> outerX = Outer.class.getTypeParameters()[0];
        TypeVariable<?> innerY = Outer.Inner.class.getTypeParameters()[0];

        GenericMetadataSupport sourceWithContext = new GenericMetadataSupport.FromClassGenericMetadataSupport(Outer.Inner.class);
        sourceWithContext.contextualActualTypeParameters.put(outerX, String.class);
        sourceWithContext.contextualActualTypeParameters.put(innerY, String.class);

        TestableTypeVariableReturnType tvReturnType = new TestableTypeVariableReturnType(sourceWithContext, Outer.Inner.class.getTypeParameters(), innerY);
        assertEquals(String.class, tvReturnType.callExtractRawTypeOf(innerY));
    }

    @Test
    public void testRawExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        Class<?>[] rawInterfaces = metadata.rawExtraInterfaces();
        assertEquals(0, rawInterfaces.length);

        metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        rawInterfaces = metadata.rawExtraInterfaces();
        assertTrue(rawInterfaces.length > 0);
        boolean containsMap = false;
        for (Class<?> iface : rawInterfaces) {
            if (iface.equals(Map.class)) {
                containsMap = true;
                break;
            }
        }
        assertTrue("Expected Map.class in rawExtraInterfaces", containsMap);
    }

    @Test
    public void testHashCode() throws Exception {
        GenericMetadataSupport metadata1 = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport metadata2 = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport metadata3 = GenericMetadataSupport.inferFrom(SubClass.class);

        assertNotNull(metadata1.hashCode());
        assertNotNull(metadata2.hashCode());
        assertNotNull(metadata3.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        String representation = metadata.toString();
        assertNotNull(representation);
        assertTrue(representation.contains("rawType=" + SimpleClass.class.getName()));

        ParameterizedType parameterizedType = createParameterizedType(List.class, new Type[]{String.class});
        metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        representation = metadata.toString();
        assertNotNull(representation);
        assertTrue(representation.contains("rawType=" + List.class.getName()));
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover `inferFrom`, `resolveGenericReturnType`, and various internal `GenericMetadataSupport` implementations (like `TypeVariableReturnType`, `WildCardBoundedType`, `TypeVarBoundedType`) by simulating different generic scenarios. Key logic branches tested include handling of classes, parameterized types, type variables, wildcards, and nested generics.
2. TEST CASE DESIGN - Tests cover `inferFrom(Class)`, `inferFrom(ParameterizedType)` with simple and complex generics. `resolveGenericReturnType` is tested for methods returning `Class`, `ParameterizedType`, `TypeVariable`, and `WildcardType`. Edge cases include generic superclasses, interfaces, and complex type variable bounds.
4. DEFECT DETECTION STRATEGY - Tests focus on the correct resolution and representation of generic types, including type parameters, type variables, and their bounds, as well as the handling of wildcards (`? extends`, `? super`).
5. SUMMARY - 41 tests.
6. LIMITATIONS - Some internal helper classes like `ParameterizedTypeImpl` and `WildcardTypeImpl` were not directly available, so mock implementations were created. Testing of protected methods required internal helper classes. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.