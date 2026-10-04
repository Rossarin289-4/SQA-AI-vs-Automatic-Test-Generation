package org.mockito.internal.creation;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.invocation.MockitoMethod;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DelegatingMethodTest {
    @Test
    public void testJavaMethodIsTheWrappedMethod() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        DelegatingMethod delegating = new DelegatingMethod(method);
        assertSame(method, delegating.getJavaMethod());
    }

    @Test
    public void testName() throws Exception {
        Method method = String.class.getMethod("substring", int.class, int.class);
        assertEquals("substring", new DelegatingMethod(method).getName());
    }

    @Test
    public void testReturnType() throws Exception {
        Method method = String.class.getMethod("substring", int.class);
        assertEquals(String.class, new DelegatingMethod(method).getReturnType());
    }

    @Test
    public void testVoidReturnType() throws Exception {
        Method method = StringBuilder.class.getMethod("setLength", int.class);
        assertEquals(void.class, new DelegatingMethod(method).getReturnType());
    }

    @Test
    public void testParameterTypes() throws Exception {
        Method method = String.class.getMethod("substring", int.class, int.class);
        assertArrayEquals(new Class<?>[] {int.class, int.class},
                new DelegatingMethod(method).getParameterTypes());
    }

    @Test
    public void testNoParameterTypes() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        assertArrayEquals(new Class<?>[0],
                new DelegatingMethod(method).getParameterTypes());
    }

    @Test
    public void testExceptionTypes() throws Exception {
        Method method = Class.class.getMethod("getMethod", String.class, Class[].class);
        assertArrayEquals(new Class<?>[] {NoSuchMethodException.class, SecurityException.class},
                new DelegatingMethod(method).getExceptionTypes());
    }

    @Test
    public void testNoExceptionTypes() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        assertArrayEquals(new Class<?>[0],
                new DelegatingMethod(method).getExceptionTypes());
    }

    @Test
    public void testVarArgsMethod() throws Exception {
        Method method = String.class.getMethod("format", String.class, Object[].class);
        assertTrue(new DelegatingMethod(method).isVarArgs());
    }

    @Test
    public void testNonVarArgsMethod() throws Exception {
        Method method = String.class.getMethod("substring", int.class);
        assertFalse(new DelegatingMethod(method).isVarArgs());
    }

    @Test
    public void testAbstractMethod() throws Exception {
        Method method = java.util.AbstractList.class.getMethod("get", int.class);
        assertTrue((method.getModifiers() & Modifier.ABSTRACT) != 0);
        assertTrue(new DelegatingMethod(method).isAbstract());
    }

    @Test
    public void testConcreteMethod() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        assertFalse((method.getModifiers() & Modifier.ABSTRACT) != 0);
        assertFalse(new DelegatingMethod(method).isAbstract());
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        DelegatingMethod delegating = new DelegatingMethod(String.class.getMethod("isEmpty"));
        assertTrue(delegating.equals(delegating));
    }

    @Test
    public void testEqualsEquivalentDelegatingMethod() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        assertTrue(new DelegatingMethod(method).equals(new DelegatingMethod(method)));
    }

    @Test
    public void testEqualsWrappedMethod() throws Exception {
        Method method = String.class.getMethod("isEmpty");
        assertTrue(new DelegatingMethod(method).equals(method));
    }

    @Test
    public void testDoesNotEqualDifferentMethod() throws Exception {
        DelegatingMethod delegating = new DelegatingMethod(String.class.getMethod("isEmpty"));
        assertFalse(delegating.equals(String.class.getMethod("length")));
    }

    @Test
    public void testDoesNotEqualNull() throws Exception {
        DelegatingMethod delegating = new DelegatingMethod(String.class.getMethod("isEmpty"));
        assertFalse(delegating.equals(null));
    }

    @Test
    public void testHashCodeMatchesWrappedMethod() throws Exception {
        Method method = String.class.getMethod("substring", int.class);
        assertEquals(method.hashCode(), new DelegatingMethod(method).hashCode());
    }

    @Test
    public void testImplementsMockitoMethod() throws Exception {
        MockitoMethod delegating = new DelegatingMethod(String.class.getMethod("isEmpty"));
        assertEquals("isEmpty", delegating.getName());
    }
}
