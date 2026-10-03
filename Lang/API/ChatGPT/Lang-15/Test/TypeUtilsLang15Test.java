package org.apache.commons.lang3.reflect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;

public class TypeUtilsLang15Test {

    interface BaseType<T> {
    }

    static class MiddleType<U> implements BaseType<U> {
    }

    static class ConcreteType<V> extends MiddleType<V> {
    }

    static class FixedType extends MiddleType<String> {
    }

    @Test
    public void testAssignableThroughTwoGenericLevels() {
        ParameterizedType from =
                TypeUtils.parameterize(ConcreteType.class, String.class);
        ParameterizedType to =
                TypeUtils.parameterize(BaseType.class, String.class);

        assertTrue(TypeUtils.isAssignable(from, to));
    }

    @Test
    public void testAssignableThroughTwoGenericLevelsWithInteger() {
        ParameterizedType from =
                TypeUtils.parameterize(ConcreteType.class, Integer.class);
        ParameterizedType to =
                TypeUtils.parameterize(BaseType.class, Integer.class);

        assertTrue(TypeUtils.isAssignable(from, to));
    }

    @Test
    public void testNonAssignableWhenResolvedArgumentsDiffer() {
        ParameterizedType from =
                TypeUtils.parameterize(ConcreteType.class, String.class);
        ParameterizedType to =
                TypeUtils.parameterize(BaseType.class, Integer.class);

        assertFalse(TypeUtils.isAssignable(from, to));
    }

    @Test
    public void testFixedGenericSuperclassAssignableToMatchingInterface() {
        Type from = TypeUtils.parameterize(FixedType.class);
        ParameterizedType to =
                TypeUtils.parameterize(BaseType.class, String.class);

        assertTrue(TypeUtils.isAssignable(from, to));
    }

    @Test
    public void testFixedGenericSuperclassNotAssignableToDifferentArgument() {
        Type from = TypeUtils.parameterize(FixedType.class);
        ParameterizedType to =
                TypeUtils.parameterize(BaseType.class, Integer.class);

        assertFalse(TypeUtils.isAssignable(from, to));
    }

    @Test
    public void testRawGenericClassRemainsAssignableToRawTarget() {
        assertTrue(TypeUtils.isAssignable(ConcreteType.class, BaseType.class));
    }
}
