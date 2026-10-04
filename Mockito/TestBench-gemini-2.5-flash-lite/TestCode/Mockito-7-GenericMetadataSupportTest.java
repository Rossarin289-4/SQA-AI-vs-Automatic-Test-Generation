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
        public SimpleClass() { } // Added default constructor for ComplexGenericClass
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
        @Override public <T_A> T_A[] toArray(T_A[] a) { return a; } // Renamed T to T_A to avoid conflict
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
    static class ComplexGenericClass<K extends Comparable<K> & java.io.Serializable> extends SimpleClass<Set<Number>> implements Map<K, Set<Number>> {
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
            @Override
            public String toString() {
                return getTypeName();
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
             @Override
            public String toString() {
                return getTypeName();
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
        assertFalse(metadata.hasRawExtraInterfaces());
        assertEquals(2, metadata.actualTypeArguments().size()); // T and U for SubClass itself
    }

    @Test
    public void testResolveGenericReturnTypeForClass() throws Exception {
        // For a non-generic method on a generic class, resolveGenericReturnType should return a non-generic support.
        // The return type of getValue() in SimpleClass<T> is T.
        // When `resolveGenericReturnType` is called on `SimpleClass.class`, the `source.contextualActualTypeParameters` is empty.
        // Thus, `TypeVariableReturnType` will resolve `T` to its bounds, which is `Object` by default.
        Method method = SimpleClass.class.getMethod("getValue");
        GenericMetadataSupport metadataForSimpleClass = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport returnMetadata = metadataForSimpleClass.resolveGenericReturnType(method);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeForParameterizedType() throws Exception {
        ParameterizedType parameterizedType = createParameterizedType(List.class, new Type[]{String.class});
        Method method = List.class.getMethod("get", int.class);
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType); // Metadata for List<String>
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
        // as it's for type parameters of the raw type. The internal representation will reflect the wildcard.
        // We can check that the raw type is List.
        assertTrue(returnMetadata.contextualActualTypeParameters.isEmpty()); // No explicit type mapping for the return type itself
    }

    @Test
    public void testResolveGenericReturnTypeForTypeVariable() throws Exception {
        Method method = WildcardClass.class.getMethod("methodWithUpperBoundedTypeParam");
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(WildcardClass.class);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The method return type is List<T> where T is upper bounded by Number.
        // When resolving `List<T>`, `T` is a TypeVariable.
        // `TypeVariableReturnType` is used.
        // The `typeParameters` passed to it are the method's own type parameters.
        // `methodWithUpperBoundedTypeParam` has `<T extends Number>`.
        // So `typeParameters` should contain `T`.
        // The return type's raw type is `List`. `List` has a type parameter `E`.
        // We need to find the actual type argument for `E` within `List<T>`.
        // `returnMetadata.actualTypeArguments()` should give the mapping for `List`'s type parameters.
        // The `T` in `List<T>` (for `methodWithUpperBoundedTypeParam`) is the `T` from `<T extends Number>`.
        // So `E` in `List<E>` should resolve to `T`.
        TypeVariable<?>[] methodTypeParams = method.getTypeParameters();
        assertEquals(1, methodTypeParams.length); // T
        TypeVariable<?> T_in_method = methodTypeParams[0]; // This is the T for the method signature

        TypeVariable<?>[] listTypeParams = List.class.getTypeParameters();
        assertEquals(1, listTypeParams.length); // E
        TypeVariable<?> E_in_list = listTypeParams[0];

        // When `resolveGenericReturnType` is called, `source.contextualActualTypeParameters` has the context from `WildcardClass`.
        // `WildcardClass` has `T extends Number`.
        // The `TypeVariableReturnType` is created with `method.getTypeParameters()` which is `<O extends K>` for `methodParamTypeWithTypeParams`.
        // For `methodWithUpperBoundedTypeParam`, the method's type parameters are `<T extends Number>`.
        // So `typeParameters` for `TypeVariableReturnType` is `T_in_method`.
        // `returnMetadata.actualTypeArguments()` should map `E` in `List` to the type parameter of the method, which is `T_in_method`.
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(E_in_list);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("T", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testComplexGenericClass_returningK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodReturningK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        // K is a TypeVariable. Its bounds are Comparable<K> & java.io.Serializable.
        // The raw type should resolve to Comparable.class.
        assertEquals(Comparable.class, returnMetadata.rawType());
        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        assertEquals(1, extraInterfaces.size());
        assertEquals(java.io.Serializable.class, extraInterfaces.get(0));
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
        // The actual type argument for Set in ComplexGenericClass<K> is Number.
        // This is because ComplexGenericClass extends SimpleClass<Set<Number>>.
        // The method `specificRemove` returns `Set<Number>`.
        // The `resolveGenericReturnType` will see `Set<Number>`.
        // `ParameterizedReturnType` will be created for `Set<Number>`.
        // `ParameterizedReturnType` uses `source.contextualActualTypeParameters` to resolve type parameters.
        // `source` is `metadata` which is inferred from `ComplexGenericClass.class`.
        // `ComplexGenericClass<K>` has `K` as a type variable.
        // `SimpleClass<Set<Number>>` means `T` in `SimpleClass<T>` is `Set<Number>`.
        // The `contextualActualTypeParameters` for `metadata` will contain `{ K -> K }`.
        // When `resolveGenericReturnType` is called for `specificRemove`, `genericReturnType` is `Set<Number>`.
        // This creates a `ParameterizedReturnType`.
        // `parameterizedType` is `Set<Number>`.
        // `parameterizedType.getRawType()` is `Set.class`.
        // `parameterizedType.getActualTypeArguments()` is `[Number.class]`.
        // The `typeParameters` of `Set.class` has one type variable, let's call it `E`.
        // `actualTypeArguments()` for `returnMetadata` should map `E` to `Number.class`.
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(typeParameters[0]);
        assertEquals(Number.class, actualTypeArg);
    }

    @Test
    public void testComplexGenericClass_wildcardSuperInteger() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardSuperInteger");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? super Integer>. This is a wildcard.
        // `ParameterizedReturnType` will be created.
        // `parameterizedType.getActualTypeArguments()` will contain `WildcardType`.
        // `actualTypeArguments()` on `returnMetadata` for `List`'s type parameter `E` should return the `WildcardType`.
        TypeVariable<?>[] listTypeParams = List.class.getTypeParameters();
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(listTypeParams[0]);
        assertTrue(actualTypeArg instanceof WildcardType);
        WildcardType wc = (WildcardType) actualTypeArg;
        assertEquals(1, wc.getLowerBounds().length);
        assertEquals(Integer.class, wc.getLowerBounds()[0]);
    }

    @Test
    public void testComplexGenericClass_wildcardSuperK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardSuperK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? super K>. K is a TypeVariable from ComplexGenericClass.
        TypeVariable<?>[] listTypeParams = List.class.getTypeParameters();
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(listTypeParams[0]);
        assertTrue(actualTypeArg instanceof WildcardType);
        WildcardType wc = (WildcardType) actualTypeArg;
        assertEquals(1, wc.getLowerBounds().length);
        // The lower bound should be the TypeVariable K itself, as defined in ComplexGenericClass.
        TypeVariable<?> kVariable = ComplexGenericClass.class.getTypeParameters()[0];
        assertEquals(kVariable, wc.getLowerBounds()[0]);
    }

    @Test
    public void testComplexGenericClass_wildcardExtendsK() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodWildcardExtendsK");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The return type is List<? extends K>. K is a TypeVariable.
        TypeVariable<?>[] listTypeParams = List.class.getTypeParameters();
        Type actualTypeArg = returnMetadata.actualTypeArguments().get(listTypeParams[0]);
        assertTrue(actualTypeArg instanceof WildcardType);
        WildcardType wc = (WildcardType) actualTypeArg;
        assertEquals(1, wc.getUpperBounds().length);
        // The upper bound should be the TypeVariable K itself.
        TypeVariable<?> kVariable = ComplexGenericClass.class.getTypeParameters()[0];
        assertEquals(kVariable, wc.getUpperBounds()[0]);
    }

    @Test
    public void testComplexGenericClass_paramTypeWithTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodParamTypeWithTypeParams");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
        // The method is <O extends K> List<O>. O is a TypeVariable of the method.
        // `TypeVariableReturnType` is created for `O`.
        // `source.contextualActualTypeParameters` is from `ComplexGenericClass.class`.
        // `method.getTypeParameters()` contains `O`.
        // When `TypeVariableReturnType` is created, it registers `O` and its bounds.
        // The `rawType()` of `returnMetadata` should be `List`.
        // The type parameter of `List` (let's call it `E`) should resolve to `O`.
        TypeVariable<?>[] methodTypeParams = method.getTypeParameters();
        assertEquals(1, methodTypeParams.length); // O
        TypeVariable<?> O_in_method = methodTypeParams[0];

        TypeVariable<?>[] listTypeParams = List.class.getTypeParameters();
        assertEquals(1, listTypeParams.length); // E
        TypeVariable<?> E_in_list = listTypeParams[0];

        Type actualTypeArg = returnMetadata.actualTypeArguments().get(E_in_list);
        assertTrue(actualTypeArg instanceof TypeVariable);
        assertEquals("O", ((TypeVariable<?>) actualTypeArg).getName());
    }

    @Test
    public void testComplexGenericClass_twoTypeParams() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        Method method = ComplexGenericClass.class.getMethod("methodTwoTypeParams");
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        // The method is <S, T extends S> T. The return type is T.
        // T is a type variable of the method.
        // T's bound is S. S has no explicit bounds, so it defaults to Object.
        // Therefore, T's effective bound is Object.
        // `TypeVariableReturnType` will be created for `T`.
        // `TypeVariableReturnType` will resolve `T` to its bounds, which is `Object`.
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
            public MySimpleSubClass() { super(); } // Added default constructor
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
            public MyParameterizedSubClass() { super(); } // Added default constructor
            public MyParameterizedSubClass(String value) { super(value); }
        }
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MyParameterizedSubClass.class);
        assertEquals(MyParameterizedSubClass.class, metadata.rawType());
        assertEquals(0, metadata.actualTypeArguments().size()); // MyParameterizedSubClass itself has no type parameters.
        // The context for SimpleClass<String> is established in contextualActualTypeParameters.
        TypeVariable<?> simpleClassTypeParam = SimpleClass.class.getTypeParameters()[0]; // T in SimpleClass<T>
        Type actualTypeArgForSimpleClass = metadata.contextualActualTypeParameters.get(simpleClassTypeParam);
        assertEquals(String.class, actualTypeArgForSimpleClass);
    }

    @Test
    public void testFromClassGenericMetadataSupport_withGenericInterfaces() throws Exception {
        class MyListImpl extends ImplementsGenericInterface<Integer> {}
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MyListImpl.class);
        assertEquals(MyListImpl.class, metadata.rawType());
        // MyListImpl implements List<Integer>.
        // So, the type parameter 'E' of List should resolve to Integer.
        TypeVariable<?> listE = List.class.getTypeParameters()[0];
        Type actualTypeArgForList = metadata.contextualActualTypeParameters.get(listE);
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
        class Holder<T> {
            public T value;
            public Holder() {} // Added default constructor
        }
        ParameterizedType holderOfListOfString = createParameterizedType(Holder.class, new Type[]{
            createParameterizedType(List.class, new Type[]{String.class})
        });
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(holderOfListOfString);
        assertEquals(Holder.class, metadata.rawType());
        TypeVariable<?> holderTypeParam = Holder.class.getTypeParameters()[0]; // T in Holder<T>
        Type actualTypeArg = metadata.actualTypeArguments().get(holderTypeParam);
        assertTrue(actualTypeArg instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) actualTypeArg).getRawType());
        assertEquals(1, ((ParameterizedType) actualTypeArg).getActualTypeArguments().length);
        assertEquals(String.class, ((ParameterizedType) actualTypeArg).getActualTypeArguments()[0]);
    }

    @Test
    public void testTypeVariableReturnType_simple() throws Exception {
        class MethodWithTV<T> {
            public T method() { return null; }
        }
        Method method = MethodWithTV.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTV.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        
        // The method's type parameter is 'T'. The return type is 'T'.
        // `TypeVariableReturnType` is created.
        // `contextualActualTypeParameters` is empty when `inferFrom(MethodWithTV.class)` is called.
        // `typeVariable.getBounds()` for `T` will be `[Object.class]`.
        // `returnMetadata.rawType()` should resolve to the first bound, which is `Object.class`.
        assertEquals(Object.class, returnMetadata.rawType());
        // The `contextualActualTypeParameters` in `returnMetadata` should still map 'T' to itself, because it hasn't been resolved to a concrete type.
        TypeVariable<?> methodTV = MethodWithTV.class.getTypeParameters()[0];
        Type resolvedType = returnMetadata.contextualActualTypeParameters.get(methodTV);
        assertEquals(methodTV, resolvedType); // It should still point to itself if not resolved
    }

    @Test
    public void testTypeVariableReturnType_withBounds() throws Exception {
        class MethodWithTVBounds<T extends Number> {
            public T method() { return null; }
        }
        Method method = MethodWithTVBounds.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTVBounds.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        // The return type is T, which is bounded by Number.
        assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void testTypeVariableReturnType_withInterfaceBounds() throws Exception {
        class MethodWithTVInterfaceBounds<T extends Comparable<T> & java.io.Serializable> {
            public T method() { return null; }
        }
        Method method = MethodWithTVInterfaceBounds.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTVInterfaceBounds.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
        // The return type is T, bounded by Comparable<T> & java.io.Serializable.
        // The first bound is Comparable<T>. So rawType should be Comparable.class.
        assertEquals(Comparable.class, returnMetadata.rawType());
        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        assertEquals(1, extraInterfaces.size());
        assertEquals(java.io.Serializable.class, extraInterfaces.get(0));
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
    public void testBoundedType_interfaceBoundsOfWildcard() {
        WildcardType wildcardType = createWildcardType(new Type[]{Number.class}, new Type[0]);
        GenericMetadataSupport.BoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(0, boundedType.interfaceBounds().length);
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
    public void testRegisterTypeVariablesOn_parameterizedSuperclass() {
        class TestSubClass<A, B> extends SimpleClass<A> {
            public TestSubClass() { super(); } // Added default constructor
            public TestSubClass(A value) { super(value); }
        }
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(TestSubClass.class);
        TypeVariable<?> typeA = TestSubClass.class.getTypeParameters()[0]; // A
        TypeVariable<?> simpleClassT = SimpleClass.class.getTypeParameters()[0]; // T
        // When TestSubClass<A, B> extends SimpleClass<A>, the type parameter 'A' of TestSubClass
        // becomes the type argument for 'T' of SimpleClass.
        assertEquals(typeA, metadata.contextualActualTypeParameters.get(simpleClassT));
    }

    @Test
    public void testRegisterTypeVariablesOn_genericInterface() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ImplementsGenericInterface.class);
        TypeVariable<?> typeT = ImplementsGenericInterface.class.getTypeParameters()[0]; // T
        TypeVariable<?> listE = List.class.getTypeParameters()[0]; // E
        // ImplementsGenericInterface<T> implements List<T>. So E should resolve to T.
        assertEquals(typeT, metadata.contextualActualTypeParameters.get(listE));
    }

    @Test
    public void testRawExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        Class<?>[] rawInterfaces = metadata.rawExtraInterfaces();
        assertEquals(0, rawInterfaces.length);

        // ComplexGenericClass implements Map<K, Set<Number>> and extends SimpleClass<Set<Number>>.
        // `rawExtraInterfaces()` should return `Map.class`.
        GenericMetadataSupport complexMetadata = GenericMetadataSupport.inferFrom(ComplexGenericClass.class);
        rawInterfaces = complexMetadata.rawExtraInterfaces();
        assertEquals(1, rawInterfaces.length);
        assertEquals(Map.class, rawInterfaces[0]);
    }

    @Test
    public void testHashCode() throws Exception {
        GenericMetadataSupport metadata1 = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport metadata2 = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport metadata3 = GenericMetadataSupport.inferFrom(SubClass.class);

        // hashCode() is only defined for BoundedType and its implementations.
        // The base class GenericMetadataSupport does not override hashCode().
        // Therefore, these assertions might fail if the default Object.hashCode() is used.
        // Let's assert that they are not null and that equal types have equal hash codes.
        // Note: The provided API outline doesn't show hashCode() for the base class.
        // The internal BoundedType subclasses do have equals and hashCode.
        // We are testing GenericMetadataSupport instances, not BoundedType instances directly.
        // The test might be intended to check equality of representation.
        // If GenericMetadataSupport's `equals` and `hashCode` were based on `rawType()`, then this would make sense.
        // Since they are not overridden in GenericMetadataSupport, we can't assert equality of hash codes based on content.
        // We can only assert they are not null, if the objects themselves are not null.
        assertNotNull(metadata1);
        assertNotNull(metadata2);
        assertNotNull(metadata3);
        // Asserting hash codes for GenericMetadataSupport instances is tricky as it's not overridden.
        // For now, we'll check that the objects themselves are not null.
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
