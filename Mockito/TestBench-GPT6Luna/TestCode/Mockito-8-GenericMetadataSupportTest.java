package org.mockito.internal.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.Checks;
import java.lang.reflect.*;
import java.util.*;

public class GenericMetadataSupportTest {
    private static class Sample<T> {
        public T value() { return null; }
        public List<String> strings() { return null; }
        public Number number() { return null; }
        public <X extends CharSequence> X bounded() { return null; }
    }

    private static class Holder<T> {
        T value;
    }

    @Test
    public void testInferFromClassRawType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertEquals(String.class, metadata.rawType());
    }

    @Test
    public void testInferFromParameterizedTypeRawType() throws Exception {
        Type type = Holder.class.getGenericSuperclass();
        assertEquals(Object.class, GenericMetadataSupport.inferFrom(type).rawType());
    }

    @Test
    public void testInferFromNullThrows() throws Exception {
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("expected exception");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testInferFromUnsupportedTypeThrows() throws Exception {
        Type type = Sample.class.getTypeParameters()[0];
        try {
            GenericMetadataSupport.inferFrom(type);
            fail("expected MockitoException");
        } catch (MockitoException expected) { }
    }

    @Test
    public void testNonGenericReturnType() throws Exception {
        Method method = Sample.class.getMethod("number");
        GenericMetadataSupport result = GenericMetadataSupport.inferFrom(Sample.class).resolveGenericReturnType(method);
        assertEquals(Number.class, result.rawType());
    }

    @Test
    public void testParameterizedReturnType() throws Exception {
        Method method = Sample.class.getMethod("strings");
        GenericMetadataSupport result = GenericMetadataSupport.inferFrom(Sample.class).resolveGenericReturnType(method);
        assertEquals(List.class, result.rawType());
    }

    @Test
    public void testTypeVariableReturnTypeUsesBound() throws Exception {
        Method method = Sample.class.getMethod("bounded");
        GenericMetadataSupport result = GenericMetadataSupport.inferFrom(Sample.class).resolveGenericReturnType(method);
        assertEquals(CharSequence.class, result.rawType());
    }

    @Test
    public void testOrdinaryTypeVariableResolvesBound() throws Exception {
        Method method = Sample.class.getMethod("value");
        GenericMetadataSupport result = GenericMetadataSupport.inferFrom(Sample.class).resolveGenericReturnType(method);
        assertEquals(Object.class, result.rawType());
    }

    @Test
    public void testDefaultExtraInterfacesAreEmpty() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertEquals(Collections.emptyList(), metadata.extraInterfaces());
    }

    @Test
    public void testDefaultRawExtraInterfacesAreEmpty() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertEquals(0, metadata.rawExtraInterfaces().length);
    }

    @Test
    public void testNoRawExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testNoTypeArgumentsOnClass() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertTrue(metadata.actualTypeArguments().isEmpty());
    }

    @Test
    public void testTypeVariableBoundedTypeFirstBound() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(Object.class, bounded.firstBound());
    }

    @Test
    public void testTypeVariableBoundedTypeNoInterfaceBounds() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(0, bounded.interfaceBounds().length);
    }

    @Test
    public void testTypeVariableBoundedTypeRetainsVariable() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(variable, bounded.typeVariable());
    }

    @Test
    public void testTypeVariableBoundedTypeEqualForSameVariable() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType first =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        GenericMetadataSupport.TypeVarBoundedType second =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(first, second);
    }

    @Test
    public void testTypeVariableBoundedTypeHashCode() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals(variable.hashCode(), bounded.hashCode());
    }

    @Test
    public void testTypeVariableBoundedTypeString() throws Exception {
        TypeVariable<?> variable = Sample.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded =
                new GenericMetadataSupport.TypeVarBoundedType(variable);
        assertEquals("{firstBound=class java.lang.Object, interfaceBounds=[]}", bounded.toString());
    }

    @Test
    public void testWildcardLowerBound() throws Exception {
        Type wildcard = ((ParameterizedType) Sample.class.getDeclaredMethod("strings")
                .getGenericReturnType()).getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded =
                new GenericMetadataSupport.WildCardBoundedType((WildcardType) wildcard);
        assertEquals(String.class, bounded.firstBound());
    }

    @Test
    public void testWildcardNoInterfaceBounds() throws Exception {
        Type wildcard = ((ParameterizedType) Sample.class.getDeclaredMethod("strings")
                .getGenericReturnType()).getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded =
                new GenericMetadataSupport.WildCardBoundedType((WildcardType) wildcard);
        assertEquals(0, bounded.interfaceBounds().length);
    }

    @Test
    public void testWildcardRetainsWildcard() throws Exception {
        Type wildcard = ((ParameterizedType) Sample.class.getDeclaredMethod("strings")
                .getGenericReturnType()).getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded =
                new GenericMetadataSupport.WildCardBoundedType((WildcardType) wildcard);
        assertEquals(wildcard, bounded.wildCard());
    }

    @Test
    public void testWildcardHashCode() throws Exception {
        Type wildcard = ((ParameterizedType) Sample.class.getDeclaredMethod("strings")
                .getGenericReturnType()).getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded =
                new GenericMetadataSupport.WildCardBoundedType((WildcardType) wildcard);
        assertEquals(wildcard.hashCode(), bounded.hashCode());
    }
}
