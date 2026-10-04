package org.mockito.internal.creation.instance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;

public class ConstructorInstantiatorTest {
    public static class NoArg {
        public NoArg() {}
    }

    public static class StringArg {
        final String value;
        public StringArg(String value) { this.value = value; }
    }

    public static class ObjectArg {
        final Object value;
        public ObjectArg(Object value) { this.value = value; }
    }

    public static class TwoArgs {
        public TwoArgs(String first, Integer second) {}
    }

    public static class PrivateNoArg {
        private PrivateNoArg() {}
    }

    public static class ThrowingConstructor {
        public ThrowingConstructor() { throw new IllegalStateException(); }
    }

    @Test
    public void testNullOuterUsesNoArgConstructor() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        assertNotNull(instantiator.newInstance(NoArg.class));
    }

    @Test
    public void testNullOuterCreatesSeparateInstances() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        NoArg first = instantiator.newInstance(NoArg.class);
        NoArg second = instantiator.newInstance(NoArg.class);
        assertNotSame(first, second);
    }

    @Test
    public void testOuterInstanceMatchesConstructorParameter() throws Exception {
        String outer = "value";
        StringArg result = new ConstructorInstantiator(outer).newInstance(StringArg.class);
        assertSame(outer, result.value);
    }

    @Test
    public void testOuterInstanceMatchesSupertypeParameter() throws Exception {
        String outer = "value";
        ObjectArg result = new ConstructorInstantiator(outer).newInstance(ObjectArg.class);
        assertSame(outer, result.value);
    }

    @Test
    public void testDoesNotMatchConstructorWithDifferentParameterType() throws Exception {
        try {
            new ConstructorInstantiator("value").newInstance(Object.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNull(expected.getCause());
        }
    }

    @Test
    public void testDoesNotMatchConstructorWithDifferentArity() throws Exception {
        try {
            new ConstructorInstantiator("value").newInstance(TwoArgs.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNull(expected.getCause());
        }
    }

    @Test
    public void testNullOuterFailsWhenNoNoArgConstructorExists() throws Exception {
        try {
            new ConstructorInstantiator(null).newInstance(StringArg.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNotNull(expected.getCause());
        }
    }

    @Test
    public void testPrivateNoArgConstructorIsNotAccessible() throws Exception {
        try {
            new ConstructorInstantiator(null).newInstance(PrivateNoArg.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNotNull(expected.getCause());
        }
    }

    @Test
    public void testConstructorFailureIsWrapped() throws Exception {
        try {
            new ConstructorInstantiator(null).newInstance(ThrowingConstructor.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNotNull(expected.getCause());
        }
    }

    @Test
    public void testNullOuterUsesPublicNoArgConstructor() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        assertEquals(NoArg.class, instantiator.newInstance(NoArg.class).getClass());
    }

    @Test
    public void testOuterInstanceDoesNotUseNoArgFallback() throws Exception {
        try {
            new ConstructorInstantiator(new Object()).newInstance(NoArg.class);
            fail("expected InstantationException");
        } catch (InstantationException expected) {
            assertNull(expected.getCause());
        }
    }

    @Test
    public void testObjectParameterAcceptsDistinctStringInstances() throws Exception {
        String outer = new String("x");
        ObjectArg result = new ConstructorInstantiator(outer).newInstance(ObjectArg.class);
        assertSame(outer, result.value);
    }
}
