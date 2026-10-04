package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.*;
import org.mockito.exceptions.verification.*;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.MockitoLimitations;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.exceptions.util.ScenarioPrinter;
import org.mockito.internal.junit.JUnitTool;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.StringJoiner;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.mock.MockName;
import org.mockito.mock.SerializableMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReporterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCheckedExceptionInvalid() throws Exception {
        Reporter reporter = new Reporter();
        Throwable dummyException = new Exception("Dummy");
        try {
            reporter.checkedExceptionInvalid(dummyException);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(e.getMessage().contains("Invalid: java.lang.Exception: Dummy"));
        }
    }

    @Test
    public void testUnfinishedStubbing() throws Exception {
        Reporter reporter = new Reporter();
        Location location = new LocationImpl();
        try {
            reporter.unfinishedStubbing(location);
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing detected here:"));
            assertTrue(e.getMessage().contains("location"));
        }
    }

    @Test
    public void testIncorrectUseOfApi() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.incorrectUseOfApi();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Incorrect use of API detected here:"));
            assertTrue(e.getMessage().contains("You probably stored a reference to OngoingStubbing returned by when()"));
        }
    }

    @Test
    public void testMissingMethodInvocation() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.missingMethodInvocation();
            fail("Expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException e) {
            assertTrue(e.getMessage().contains("when() requires an argument which has to be 'a method call on a mock'."));
        }
    }

    @Test
    public void testUnfinishedVerificationException() throws Exception {
        Reporter reporter = new Reporter();
        Location location = new LocationImpl();
        try {
            reporter.unfinishedVerificationException(location);
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertTrue(e.getMessage().contains("Missing method call for verify(mock) here:"));
            assertTrue(e.getMessage().contains("location"));
        }
    }

    @Test
    public void testNotAMockPassedToVerify() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> type = Object.class;
        try {
            reporter.notAMockPassedToVerify(type);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() is of type Object and is not a mock!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedWhenCreatingInOrder() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testCannotMockFinalClass() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> clazz = String.class;
        try {
            reporter.cannotMockFinalClass(clazz);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot mock/spy java.lang.String"));
            assertTrue(e.getMessage().contains("- final classes"));
        }
    }

    @Test
    public void testCannotStubVoidMethodWithAReturnValue() throws Exception {
        Reporter reporter = new Reporter();
        String methodName = "voidMethod";
        try {
            reporter.cannotStubVoidMethodWithAReturnValue(methodName);
            fail("Expected CannotStubVoidMethodWithReturnValue");
        } catch (CannotStubVoidMethodWithReturnValue e) {
            assertTrue(e.getMessage().contains("'voidMethod' is a *void method* and it *cannot* be stubbed with a *return value*!"));
        }
    }

    @Test
    public void testOnlyVoidMethodsCanBeSetToDoNothing() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Only void methods can doNothing()!"));
        }
    }

    @Test
    public void testWrongTypeOfReturnValue() throws Exception {
        Reporter reporter = new Reporter();
        String expectedType = "String";
        String actualType = "Integer";
        String methodName = "getString";
        try {
            reporter.wrongTypeOfReturnValue(expectedType, actualType, methodName);
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("Integer cannot be returned by getString()"));
            assertTrue(e.getMessage().contains("getString() should return String"));
        }
    }

    @Test
    public void testWantedAtMostX() throws Exception {
        Reporter reporter = new Reporter();
        int maxNumberOfInvocations = 5;
        int foundSize = 10;
        try {
            reporter.wantedAtMostX(maxNumberOfInvocations, foundSize);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most 5 but was 10"));
        }
    }
}
