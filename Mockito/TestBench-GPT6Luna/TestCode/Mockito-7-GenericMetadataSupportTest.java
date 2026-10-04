package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.Checks;
import java.lang.reflect.*;
import java.util.*;

public class GenericMetadataSupportTest {
    static class Sample<T> {
        public List<String> strings() { return null; }
        public T value() { return null; }
        public Number number() { return null; }
        public List<? extends Number> bounded() { return null; }
        public <X extends Number> X genericValue() { return null; }
    }

    static class Pair<A, B> { }

    static class GenericBounds<T extends Number & Runnable> {
        public T value() { return null; }
    }

    @Test
    public void testInferFromPlainClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertEquals(String.class, metadata.rawType());
        assertTrue(metadata.actualTypeArguments().isEmpty());
    }

    @Test
    public void testInferFromParameterizedType() throws Exception {
        Type type = Sample.class.getMethod("strings").getGenericReturnType();
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(type);
        assertEquals(List.class, metadata.rawType());
        assertEquals(String.class, metadata.actualTypeArguments().get(List.class.getTypeParameters()[0]));
    }

    @Test
    public void testInferRejectsNull() throws Exception {
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testInferRejectsUnsupportedType() throws Exception {
        Type type = Sample.class.getTypeParameters()[0];
        try {
            GenericMetadataSupport.inferFrom(type);
            fail("expected MockitoException");
        } catch (MockitoException expected) { }
    }

    @Test
    public void testExtraInterfacesDefault() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertTrue(metadata.extraInterfaces().isEmpty());
        assertEquals(0, metadata.rawExtraInterfaces().length);
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testActualArgumentsForGenericClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(Sample.class);
        assertEquals(1, metadata.actualTypeArguments().size());
        assertNotNull(metadata.actualTypeArguments().values().iterator().next());
    }

    @Test
    public void testResolveClassReturn() throws Exception {
        Method method = Sample.class.getMethod("number");
        assertEquals(Number.class, GenericMetadataSupport.inferFrom(Sample.class)
                .resolveGenericReturnType(method).rawType());
    }

    @Test
    public void testResolveParameterizedReturn() throws Exception {
        Method method = Sample.class.getMethod("strings");
        assertEquals(List.class, GenericMetadataSupport.inferFrom(Sample.class)
                .resolveGenericReturnType(method).rawType());
    }

    @Test
    public void testResolveTypeVariableReturn() throws Exception {
        Method method = Sample.class.getMethod("value");
        assertEquals(Object.class, GenericMetadataSupport.inferFrom(Sample.class)
                .resolveGenericReturnType(method).rawType());
    }

    @Test
    public void testResolveMethodTypeVariable() throws Exception {
        Method method = Sample.class.getMethod("genericValue");
        assertEquals(Number.class, GenericMetadataSupport.inferFrom(Sample.class)
                .resolveGenericReturnType(method).rawType());
    }

    @Test
    public void testResolveWildcardParameterizedReturn() throws Exception {
        Method method = Sample.class.getMethod("bounded");
        assertEquals(List.class, GenericMetadataSupport.inferFrom(Sample.class)
                .resolveGenericReturnType(method).rawType());
    }

    @Test
    public void testParameterizedBoundedTypeFirstBound() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(Number.class, bound.firstBound());
    }

    @Test
    public void testParameterizedBoundedTypeInterfaceBounds() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertArrayEquals(new Type[] { Runnable.class }, bound.interfaceBounds());
    }

    @Test
    public void testTypeVariableBoundEqualityAndHashCode() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType first =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        GenericMetadataSupport.TypeVarBoundedType second =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testTypeVariableBoundExposesVariable() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(variable, bound.typeVariable());
    }

    @Test
    public void testTypeVariableBoundString() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertTrue(bound.toString().contains("firstBound=class java.lang.Number"));
    }

    @Test
    public void testWildcardBoundFirstBound() throws Exception {
        Type wildcard = Sample.class.getMethod("bounded").getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) wildcard)
                .getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bound =
                new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Number.class, bound.firstBound());
    }

    @Test
    public void testWildcardBoundHasNoInterfaces() throws Exception {
        Type wildcard = Sample.class.getMethod("bounded").getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) wildcard)
                .getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bound =
                new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(0, bound.interfaceBounds().length);
    }

    @Test
    public void testWildcardBoundExposesWildcard() throws Exception {
        Type wildcard = Sample.class.getMethod("bounded").getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) wildcard)
                .getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bound =
                new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(wildcardType, bound.wildCard());
    }

    @Test
    public void testWildcardBoundString() throws Exception {
        Type wildcard = Sample.class.getMethod("bounded").getGenericReturnType();
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) wildcard)
                .getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bound =
                new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals("{firstBound=class java.lang.Number, interfaceBounds=[]}", bound.toString());
    }

    @Test
    public void testUnboundedWildcardFirstBound() throws Exception {
        Type wildcard = Sample.class.getMethod("strings").getGenericReturnType();
        GenericMetadataSupport.WildCardBoundedType bound =
                new GenericMetadataSupport.WildCardBoundedType((WildcardType) wildcard);
        assertEquals(Object.class, bound.firstBound());
    }

    @Test
    public void testBoundedTypeEqualsNullIsFalse() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertFalse(bound.equals(null));
    }

    @Test
    public void testBoundedTypeEqualsDifferentTypeIsFalse() throws Exception {
        TypeVariable<?> variable = GenericBounds.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bound =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertFalse(bound.equals(new GenericMetadataSupport.WildCardBoundedType(
                (WildcardType) ((ParameterizedType) Sample.class.getMethod("bounded")
                        .getGenericReturnType()).getActualTypeArguments()[0])));
    }
}
