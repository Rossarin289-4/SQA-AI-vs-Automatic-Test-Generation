```java
package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ReturnsSmartNullsTest {
    @Test
    public void testNullReturnForPrimitiveMethod() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = String.class.getMethod("length");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals(Integer.valueOf(0), new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testEmptyStringReturn() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = String.class.getMethod("toString");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals("", new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testEmptyArrayReturn() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = String[].class.getMethod("clone");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals(0, ((Object[]) new ReturnsSmartNulls().answer(invocation)).length);
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testSmartNullForMockableReturnType() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("size");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertNotNull(new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testNullForFinalReturnType() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = String.class.getMethod("substring", int.class);
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertNull(new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testNullReturnWhenMethodReturnsVoid() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = StringBuilder.class.getMethod("setLength", int.class);
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertNull(new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testSmartNullToStringUsesInvocationNameAndArguments() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("get", int.class);
        Mockito.when(invocation.getMethod()).thenReturn(method);
        Mockito.when(invocation.getArguments()).thenReturn(new Object[] { Integer.valueOf(2) });
        try {
            Object smartNull = new ReturnsSmartNulls().answer(invocation);
            assertEquals("SmartNull returned by unstubbed get(2) method on mock", smartNull.toString());
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testSmartNullToStringWithNoArguments() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("clear");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        Mockito.when(invocation.getArguments()).thenReturn(new Object[0]);
        try {
            Object smartNull = new ReturnsSmartNulls().answer(invocation);
            assertEquals("SmartNull returned by unstubbed clear() method on mock", smartNull.toString());
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testArrayReturnForPrimitiveArray() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = String.class.getMethod("getBytes");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals(0, ((byte[]) new ReturnsSmartNulls().answer(invocation)).length);
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testNumericWrapperDefault() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("indexOf", Object.class);
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals(Integer.valueOf(0), new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testBooleanPrimitiveDefault() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("isEmpty");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        try {
            assertEquals(Boolean.FALSE, new ReturnsSmartNulls().answer(invocation));
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }

    @Test
    public void testSmartNullObjectMethodToStringDoesNotRequireOrdinaryValue() throws Exception {
        InvocationOnMock invocation = Mockito.mock(InvocationOnMock.class);
        Method method = java.util.List.class.getMethod("iterator");
        Mockito.when(invocation.getMethod()).thenReturn(method);
        Mockito.when(invocation.getArguments()).thenReturn(new Object[0]);
        try {
            Object smartNull = new ReturnsSmartNulls().answer(invocation);
            assertEquals("SmartNull returned by unstubbed iterator() method on mock", smartNull.toString());
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
}
```