package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;

public class _Gson_TypesAI18Test {

    @Test
    public void testCanonicalizeClass() {
        Type canonical = $Gson$Types.canonicalize(String.class);
        Assert.assertEquals(String.class, canonical);
    }

    @Test
    public void testCanonicalizeArrayClass() {
        Type canonical = $Gson$Types.canonicalize(String[].class);
        Assert.assertTrue(canonical instanceof GenericArrayType);
        Assert.assertEquals(String.class, ((GenericArrayType) canonical).getGenericComponentType());
    }

    @Test
    public void testGetRawTypeClass() {
        Class<?> rawType = $Gson$Types.getRawType(String.class);
        Assert.assertEquals(String.class, rawType);
    }

    @Test
    public void testGetRawTypeGenericArray() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        Class<?> rawType = $Gson$Types.getRawType(arrayType);
        Assert.assertEquals(String[].class, rawType);
    }

    @Test
    public void testEqualsTypes() {
        Type t1 = String.class;
        Type t2 = String.class;
        Type t3 = Integer.class;

        Assert.assertTrue($Gson$Types.equals(t1, t2));
        Assert.assertFalse($Gson$Types.equals(t1, t3));
        Assert.assertTrue($Gson$Types.equals(null, null));
        Assert.assertFalse($Gson$Types.equals(t1, null));
    }

    @Test
    public void testSubtypeOf() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
        Assert.assertEquals(1, wildcard.getUpperBounds().length);
        Assert.assertEquals(Number.class, wildcard.getUpperBounds()[0]);
        Assert.assertEquals(0, wildcard.getLowerBounds().length);
        Assert.assertEquals("? extends java.lang.Number", wildcard.toString());
    }

    @Test
    public void testSupertypeOf() {
        WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
        Assert.assertEquals(1, wildcard.getUpperBounds().length);
        Assert.assertEquals(Object.class, wildcard.getUpperBounds()[0]);
        Assert.assertEquals(1, wildcard.getLowerBounds().length);
        Assert.assertEquals(String.class, wildcard.getLowerBounds()[0]);
        Assert.assertEquals("? super java.lang.String", wildcard.toString());
    }

    @Test
    public void testTypeToString() {
        String str = $Gson$Types.typeToString(String.class);
        Assert.assertEquals("java.lang.String", str);

        GenericArrayType arrayType = $Gson$Types.arrayOf(Integer.class);
        Assert.assertEquals("java.lang.Integer[]", $Gson$Types.typeToString(arrayType));
    }

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Assert.assertEquals(List.class, pt.getRawType());
        Assert.assertNull(pt.getOwnerType());
        Assert.assertEquals(1, pt.getActualTypeArguments().length);
        Assert.assertEquals(String.class, pt.getActualTypeArguments()[0]);
        Assert.assertEquals("java.util.List<java.lang.String>", pt.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParameterizedTypePrimitiveArgumentThrows() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
    }

    @Test
    public void testResolveSimpleClass() {
        Type resolved = $Gson$Types.resolve(String.class, String.class, String.class);
        Assert.assertEquals(String.class, resolved);
    }

    @Test
    public void testHashCodeOrZero() {
        Assert.assertEquals(0, $Gson$Types.hashCodeOrZero(null));
        Assert.assertEquals("test".hashCode(), $Gson$Types.hashCodeOrZero("test"));
    }
}
