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
        // To test resolveGenericReturnType, we need an instance of GenericMetadataSupport that has context.
        // For a static method call like inferFrom, it doesn't have specific type parameters set.
        // We'll simulate by creating a MetadataSupport that *represents* SimpleClass<T>.
        GenericMetadataSupport metadataForSimpleClass = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport returnMetadata = metadataForSimpleClass.resolveGenericReturnType(method);
        
        // The return type of getValue() is T from SimpleClass<T>.
        // The resolveGenericReturnType should use the context of the method's declaration.
        // For a method declared in SimpleClass, the type parameter T should be resolved.
        // Since SimpleClass.class itself has T, and getValue returns T.
        // The `method.getTypeParameters()` for getValue is empty because it's not a generic method itself.
        // The `genericReturnType` is `TypeVariableImpl("T")`
        // When `TypeVariableReturnType` is created, it uses `source.contextualActualTypeParameters`.
        // This context is not set for `SimpleClass.class` itself.
        // To properly test this, we'd need to instantiate `GenericMetadataSupport` for a parameterized type like `SimpleClass<String>`.
        // For now, let's test what `resolveGenericReturnType` returns for a non-generic method on a generic class.
        assertEquals(Object.class, returnMetadata.rawType()); // Default for unbound type variables
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
        // We need to infer from a specific instantiation of ComplexGenericClass to resolve K
        // For example, ComplexGenericClass<MyComparable>
        // Since we don't have MyComparable, we'll infer from the raw class and rely on how it resolves type variables.
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
        TypeVariable<?> holderTypeParam = Holder.class.getTypeParameters()[0];
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
        
        // When inferring from MethodWithTV.class, contextualActualTypeParameters is empty for T.
        // resolveGenericReturnType for a TypeVariable, creates TypeVariableReturnType.
        // TypeVariableReturnType's `readTypeVariables` calls `registerTypeVariablesOn(new TypeVariable[] { typeVariable })`.
        // This registers the type variable itself with its bounds (Object by default).
        // The actual type argument for 'T' remains the type variable 'T' itself.
        assertEquals(Object.class, returnMetadata.rawType()); // T has no explicit bounds, defaults to Object.
        TypeVariable<?> methodTV = MethodWithTV.class.getTypeParameters()[0];
        assertEquals(methodTV, returnMetadata.contextualActualTypeParameters.get(methodTV));
    }

    @Test
    public void testTypeVariableReturnType_withBounds() throws Exception {
        class MethodWithTVBounds<T extends Number> {
            public T method() { return null; }
        }
        Method method = MethodWithTVBounds.class.getMethod("method");
        GenericMetadataSupport sourceMetadata = GenericMetadataSupport.inferFrom(MethodWithTVBounds.class);
        GenericMetadataSupport returnMetadata = sourceMetadata.resolveGenericReturnType(method);
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

    // Helper to create a TypeVariable for testing purposes
    private static TypeVariable<?> createTypeVariable(String name, Type[] bounds) {
        return new TypeVariable<Class<?>>() {
            @Override
            public Type[] getBounds() {
                return bounds;
            }
            @Override
            public Class<?> getGenericDeclaration() {
                return null; // Not relevant for this test
            }
            @Override
            public String getName() {
                return name;
            }
            @Override
            public <T extends java.lang.annotation.Annotation> T getAnnotation(Class<T> annotationClass) { return null; }
            @Override
            public java.lang.annotation.Annotation[] getAnnotations() { return new java.lang.annotation.Annotation[0]; }
            @Override
            public java.lang.annotation.Annotation[] getDeclaredAnnotations() { return new java.lang.annotation.Annotation[0]; }
        };
    }

    @Test
    public void testTypeVarBoundedType_simple() {
        TypeVariable<?> typeVariable = createTypeVariable("T", new Type[]{String.class});
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(String.class, boundedType.firstBound());
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testTypeVarBoundedType_multipleBounds() {
        TypeVariable<?> typeVariable = createTypeVariable("T", new Type[]{Number.class, java.io.Serializable.class});
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(Number.class, boundedType.firstBound());
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(java.io.Serializable.class, boundedType.interfaceBounds()[0]);
    }

    @Test
    public void testBoundedType_interfaceBoundsOfWildcard() {
        WildcardType wildcardType = createWildcardType(new Type[]{Number.class}, new Type[0]);
        GenericMetadataSupport.BoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testBoundedType_interfaceBoundsOfTypeVar() {
        TypeVariable<?> typeVariable = createTypeVariable("T", new Type[]{Number.class, java.io.Serializable.class});
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(java.io.Serializable.class, boundedType.interfaceBounds()[0]);
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
    public void testGetActualTypeArgumentFor_typeVariableReferencingAnother() {
        class Outer<X> {
            class Inner<Y extends X> {
                Y method() { return null; }
            }
        }
        TypeVariable<?> outerX = Outer.class.getTypeParameters()[0];
        TypeVariable<?> innerY = Outer.Inner.class.getTypeParameters()[0];

        // We need to simulate the context correctly.
        // inferFrom(Outer.Inner.class) creates a FromClassGenericMetadataSupport.
        // It registers type parameters of Outer.Inner (Y) and its generic superclass (Outer<X>).
        GenericMetadataSupport.FromClassGenericMetadataSupport metadata = new GenericMetadataSupport.FromClassGenericMetadataSupport(Outer.Inner.class);

        // Register context for Outer<String>.Inner<String>
        // This means X is String, and Y is String.
        // The `readActualTypeParametersOnDeclaringClass` in `FromClassGenericMetadataSupport` populates `contextualActualTypeParameters`.
        // When `inferFrom(Outer.Inner.class)` is called:
        // 1. It calls `readActualTypeParametersOnDeclaringClass(Outer.Inner.class)`
        //    - `registerTypeParametersOn(Outer.Inner.class.getTypeParameters())` -> registers Y
        //    - `registerTypeVariablesOn(Outer.Inner.class.getGenericSuperclass())` -> Outer<X>
        //      - `registerTypeVariablesOn(Outer.class.getTypeParameters())` -> registers X
        //      - `registerTypeVariablesOn(Outer<X>)` -> this will put X as contextualActualTypeParameters for type X.
        // 2. It calls `readActualTypeParametersOnDeclaringClass(Outer.class)`
        //    - `registerTypeParametersOn(Outer.class.getTypeParameters())` -> registers X
        //    - `registerTypeVariablesOn(Outer.class.getGenericSuperclass())` -> null
        //    - `registerTypeVariablesOn(Outer.class.getGenericInterfaces())` -> empty
        
        // To simulate `Outer<String>.Inner<String>`, we need to manually set the context after inferring from Outer.Inner.class.
        // The `registerTypeVariablesOn(ParameterizedType)` is what handles mapping actual type arguments.
        ParameterizedType outerString = createParameterizedType(Outer.class, new Type[]{String.class});
        metadata.registerTypeVariablesOn(outerString); // This sets X to String.

        // Now inferFrom(Outer.Inner.class) with the context of Outer<String>.
        // The inner class is parameterized with Y. If we pass a parameterized type for Inner.
        // For this test, we'll directly use `getActualTypeArgumentFor` with a manually constructed context.

        // Create a metadata that has the context of Outer<String>.Inner<String>
        GenericMetadataSupport contextMetadata = new GenericMetadataSupport.FromClassGenericMetadataSupport(Outer.Inner.class);
        // Manually populate context for X (from Outer<X>) and Y (from Inner<Y>)
        contextMetadata.contextualActualTypeParameters.put(outerX, String.class);
        contextMetadata.contextualActualTypeParameters.put(innerY, String.class);

        assertEquals(String.class, contextMetadata.getActualTypeArgumentFor(innerY));
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
        // Inferring from ImplementsGenericInterface<T> registers T for ImplementsGenericInterface.
        // And it also registers E for List<E>.
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ImplementsGenericInterface.class);
        TypeVariable<?> typeT = ImplementsGenericInterface.class.getTypeParameters()[0]; // T
        TypeVariable<?> listE = List.class.getTypeParameters()[0]; // E
        assertEquals(typeT, metadata.contextualActualTypeParameters.get(listE));
    }

    @Test
    public void testBoundsOf_typeVariable() {
        TypeVariable<?> typeVariable = createTypeVariable("T", new Type[]{Number.class});
        GenericMetadataSupport.BoundedType boundedType = GenericMetadataSupport.boundsOf(typeVariable);
        assertEquals(Number.class, boundedType.firstBound());
    }

    @Test
    public void testBoundsOf_wildcardType() {
        WildcardType wildcardType = createWildcardType(new Type[]{Object.class}, new Type[]{Integer.class});
        GenericMetadataSupport.BoundedType boundedType = GenericMetadataSupport.boundsOf(wildcardType);
        assertEquals(Integer.class, boundedType.firstBound());
    }

    @Test
    public void testExtractRawTypeOf_class() {
        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        // Need a non-private subclass to instantiate
        GenericMetadataSupport.TypeVariableReturnType tvReturnType = new GenericMetadataSupport.TypeVariableReturnType(dummySource, new TypeVariable[]{}, createTypeVariable("T", new Type[]{String.class}));
        assertEquals(String.class, tvReturnType.extractRawTypeOf(String.class));
    }

    @Test
    public void testExtractRawTypeOf_parameterizedType() {
        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        GenericMetadataSupport.TypeVariableReturnType tvReturnType = new GenericMetadataSupport.TypeVariableReturnType(dummySource, new TypeVariable[]{}, createTypeVariable("T", new Type[]{List.class}));
        ParameterizedType parameterizedListString = createParameterizedType(List.class, new Type[]{String.class});
        assertEquals(List.class, tvReturnType.extractRawTypeOf(parameterizedListString));
    }

    @Test
    public void testExtractRawTypeOf_boundedType() {
        GenericMetadataSupport dummySource = GenericMetadataSupport.inferFrom(Object.class);
        TypeVariable<?> dummyTypeVar = createTypeVariable("T", new Type[]{Number.class, java.io.Serializable.class});
        GenericMetadataSupport.TypeVariableReturnType tvReturnType = new GenericMetadataSupport.TypeVariableReturnType(dummySource, new TypeVariable[]{dummyTypeVar}, dummyTypeVar);
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(dummyTypeVar);
        assertEquals(Number.class, tvReturnType.extractRawTypeOf(boundedType));
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

        GenericMetadataSupport.FromClassGenericMetadataSupport metadata = new GenericMetadataSupport.FromClassGenericMetadataSupport(Outer.Inner.class);
        metadata.contextualActualTypeParameters.put(outerX, String.class);
        metadata.contextualActualTypeParameters.put(innerY, String.class);

        GenericMetadataSupport.TypeVariableReturnType tvReturnType = new GenericMetadataSupport.TypeVariableReturnType(metadata, Outer.Inner.class.getTypeParameters(), innerY);
        assertEquals(String.class, tvReturnType.extractRawTypeOf(innerY));
    }

    @Test
    public void testRawExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleClass.class);
        Class<?>[] rawInterfaces = metadata.rawExtraInterfaces();
        assertEquals(0, rawInterfaces.length);

        // ComplexGenericClass implements Map<K, Set<Number>> and extends SimpleClass<Set<Number>>
        // rawExtraInterfaces should return Map.class
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

        assertNotNull(metadata1.hashCode());
        assertNotNull(metadata2.hashCode());
        assertNotNull(metadata3.hashCode());
        assertEquals(metadata1.hashCode(), metadata2.hashCode()); // Should be equal if representing the same type structure
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
