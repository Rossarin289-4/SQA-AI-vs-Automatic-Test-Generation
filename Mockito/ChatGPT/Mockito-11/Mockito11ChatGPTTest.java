package org.mockito.benchmark;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.DelegatingMethod;

public class Mockito11ChatGPTTest {

    private Method someMethod;
    private Method otherMethod;
    private DelegatingMethod delegatingMethod;

    @Before
    public void setUp() throws Exception {
        someMethod = Something.class.getMethod("someMethod", Object.class);
        otherMethod = Something.class.getMethod("otherMethod", Object.class);
        delegatingMethod = new DelegatingMethod(someMethod);
    }

    @Test
    public void equalsShouldReturnTrueForEqualDelegatingMethod() {
        DelegatingMethod equal = new DelegatingMethod(someMethod);
        assertTrue(delegatingMethod.equals(equal));
    }

    @Test
    public void equalsShouldReturnTrueForSelf() {
        assertTrue(delegatingMethod.equals(delegatingMethod));
    }

    @Test
    public void equalsShouldReturnFalseForDifferentDelegatingMethod() {
        DelegatingMethod notEqual = new DelegatingMethod(otherMethod);
        assertFalse(delegatingMethod.equals(notEqual));
    }

    @Test
    public void equalsShouldReturnTrueForUnderlyingMethod() {
        assertTrue(delegatingMethod.equals(someMethod));
    }

    @Test
    public void equalsShouldReturnFalseForDifferentMethod() {
        assertFalse(delegatingMethod.equals(otherMethod));
    }

    private interface Something {
        Object someMethod(Object param);
        Object otherMethod(Object param);
    }
}
