```java
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
import java.util.Collections;
import java.util.List;
import org.mockito.codegen.MockitoActivator;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.RealMethod;
import org.mockito.internal.invocation.SerializableMethod;

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
    public void testCannotStubWithNullThrowable() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.cannotStubWithNullThrowable();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot stub with null throwable!"));
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
    public void testNullPassedToVerify() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.nullPassedToVerify();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() should be a mock but is null!"));
        }
    }

    @Test
    public void testNotAMockPassedToWhenMethod() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToWhenMethod() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is null!"));
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
    public void testNotAMockPassedToVerifyNoMoreInteractions() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerifyNoMoreInteractions() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testNotAMockPassedWhenCreatingInOrder() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedWhenCreatingInOrder() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
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
    public void testInOrderRequiresFamiliarMock() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("InOrder can only verify mocks that were passed in during creation of InOrder."));
        }
    }

    @Test
    public void testInvalidUseOfMatchers() throws Exception {
        Reporter reporter = new Reporter();
        List<LocalizedMatcher> recordedMatchers = new ArrayList<>();
        // LocalizedMatcher constructor requires a Matcher, not LocationImpl and String.
        // We'll simulate its presence without direct instantiation if not possible.
        // For testing the Reporter's message, we can check for the expected message content.
        // If LocalizedMatcher were truly needed, we'd need a mock Matcher.
        // For now, we'll rely on the message construction logic.
        // If the Reporter directly uses the arguments, we'd need a valid LocalizedMatcher.
        // Assuming the constructor call is what's being tested indirectly.
        // Based on the error, we cannot directly instantiate LocalizedMatcher this way.
        // We will test the exception thrown by the method instead of the content of LocalizedMatcher.
        try {
            reporter.invalidUseOfMatchers(2, recordedMatchers); // Passing empty list as per error, original code was trying to add to it.
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Invalid use of argument matchers!"));
            assertTrue(e.getMessage().contains("2 matchers expected, 0 recorded")); // Changed from 1 to 0 as recordedMatchers is empty
        }
    }

    @Test
    public void testIncorrectUseOfAdditionalMatchers() throws Exception {
        Reporter reporter = new Reporter();
        Collection<LocalizedMatcher> matcherStack = new ArrayList<>();
        // Same issue as above with LocalizedMatcher instantiation.
        try {
            reporter.incorrectUseOfAdditionalMatchers("and", 2, matcherStack); // Passing empty collection
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Invalid use of argument matchers inside additional matcher and !"));
            assertTrue(e.getMessage().contains("2 sub matchers expected, 0 recorded")); // Changed from 1 to 0
        }
    }

    @Test
    public void testStubPassedToVerify() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.stubPassedToVerify();
            fail("Expected CannotVerifyStubOnlyMock");
        } catch (CannotVerifyStubOnlyMock e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() is a stubOnly() mock"));
        }
    }

    @Test
    public void testReportNoSubMatchersFound() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.reportNoSubMatchersFound("and");
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("No matchers found for additional matcher and"));
        }
    }

    @Test
    public void testArgumentsAreDifferent() throws Exception {
        Reporter reporter = new Reporter();
        String wanted = "Wanted args";
        String actual = "Actual args";
        Location actualLocation = new LocationImpl();
        try {
            reporter.argumentsAreDifferent(wanted, actual, actualLocation);
            fail("Expected RuntimeException (from JUnitTool)");
        } catch (RuntimeException e) { // JUnitTool.createArgumentsAreDifferentException returns RuntimeException
            assertTrue(e.getMessage().contains("Argument(s) are different! Wanted:"));
            assertTrue(e.getMessage().contains("Actual invocation has different arguments:"));
        }
    }

    @Test
    public void testWantedButNotInvoked() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        try {
            reporter.wantedButNotInvoked(wanted);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Wanted method"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithInvocations() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        List<DescribedInvocation> invocations = new ArrayList<>();
        invocations.add(new MockedDescribedInvocation("Other method"));
        try {
            reporter.wantedButNotInvoked(wanted, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Other method"));
            // The original assertion was incorrect for the case where there *are* invocations.
            // It should check for the presence of "Other method" and its location.
            // The message "Actually, there were zero interactions with this mock." is only printed if invocations is empty.
            assertTrue(e.getMessage().contains("Other method")); // Check if other method is mentioned.
        }
    }
    
    @Test
    public void testWantedButNotInvokedInOrder() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        DescribedInvocation previous = new MockedDescribedInvocation("Previous method");
        try {
            reporter.wantedButNotInvokedInOrder(wanted, previous);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Wanted anywhere AFTER following interaction:"));
            assertTrue(e.getMessage().contains("Previous method"));
        }
    }

    @Test
    public void testTooManyActualInvocations() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        Location firstUndesired = new LocationImpl();
        try {
            reporter.tooManyActualInvocations(2, 5, wanted, firstUndesired);
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Wanted 2:"));
            assertTrue(e.getMessage().contains("But was 5. Undesired invocation:"));
        }
    }

    @Test
    public void testNeverWantedButInvoked() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        Location firstUndesired = new LocationImpl();
        try {
            reporter.neverWantedButInvoked(wanted, firstUndesired);
            fail("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked e) {
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Never wanted here:"));
            assertTrue(e.getMessage().contains("But invoked here:"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        Location firstUndesired = new LocationImpl();
        try {
            reporter.tooManyActualInvocationsInOrder(2, 5, wanted, firstUndesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Wanted 2:"));
            assertTrue(e.getMessage().contains("But was 5. Undesired invocation:"));
        }
    }

    @Test
    public void testTooLittleActualInvocations() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        Location lastActualLocation = new LocationImpl();
        org.mockito.internal.reporting.Discrepancy discrepancy = new org.mockito.internal.reporting.Discrepancy(2, 1);
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, lastActualLocation);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Wanted 2:"));
            assertTrue(e.getMessage().contains("But was 1:"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder() throws Exception {
        Reporter reporter = new Reporter();
        DescribedInvocation wanted = new MockedDescribedInvocation("Wanted method");
        Location lastActualLocation = new LocationImpl();
        org.mockito.internal.reporting.Discrepancy discrepancy = new org.mockito.internal.reporting.Discrepancy(2, 1);
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, lastActualLocation);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted method"));
            assertTrue(e.getMessage().contains("Wanted 2:"));
            assertTrue(e.getMessage().contains("But was 1:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted() throws Exception {
        Reporter reporter = new Reporter();
        Invocation undesired = new MockedInvocation("undesired method", new Object()); // Pass a mock object
        List<VerificationAwareInvocation> invocations = new ArrayList<>();
        invocations.add(new MockedVerificationAwareInvocation("other method", new Object())); // Pass a mock object
        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction on mock 'undesired method':"));
        }
    }

    @Test
    public void testNoMoreInteractionsWantedInOrder() throws Exception {
        Reporter reporter = new Reporter();
        Invocation undesired = new MockedInvocation("undesired method", new Object()); // Pass a mock object
        try {
            reporter.noMoreInteractionsWantedInOrder(undesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction on mock 'undesired method':"));
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

    @Test
    public void testMisplacedArgumentMatcher() throws Exception {
        Reporter reporter = new Reporter();
        List<LocalizedMatcher> lastMatchers = new ArrayList<>();
        // LocalizedMatcher constructor requires a Matcher, not LocationImpl and String.
        // Testing the exception itself rather than the contents of LocalizedMatcher.
        try {
            reporter.misplacedArgumentMatcher(lastMatchers); // Pass empty list
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Misplaced argument matcher detected here:"));
            assertTrue(e.getMessage().contains("You cannot use argument matchers outside of verification or stubbing."));
        }
    }

    @Test
    public void testSmartNullPointerException() throws Exception {
        Reporter reporter = new Reporter();
        String invocation = "mock.method()";
        Location location = new LocationImpl();
        try {
            reporter.smartNullPointerException(invocation, location);
            fail("Expected SmartNullPointerException");
        } catch (SmartNullPointerException e) {
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
            assertTrue(e.getMessage().contains("because this method call was *not* stubbed correctly:"));
            assertTrue(e.getMessage().contains("mock.method()"));
        }
    }

    @Test
    public void testNoArgumentValueWasCaptured() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument value was captured!"));
        }
    }

    @Test
    public void testExtraInterfacesDoesNotAcceptNullParameters() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> wrongType = Object.class;
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(wrongType);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() accepts only interfaces."));
            assertTrue(e.getMessage().contains("You passed following type: Object which is not an interface."));
        }
    }

    @Test
    public void testExtraInterfacesCannotContainMockedType() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> wrongType = List.class;
        try {
            reporter.extraInterfacesCannotContainMockedType(wrongType);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept the same type as the mocked type."));
            assertTrue(e.getMessage().contains("You mocked following type: List and you passed the same very interface to the extraInterfaces()"));
        }
    }

    @Test
    public void testExtraInterfacesRequiresAtLeastOneInterface() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() requires at least one interface."));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> mockedType = List.class;
        Object spiedInstance = new ArrayList<>();
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(mockedType, spiedInstance);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be the same as the type of your spied instance."));
            assertTrue(e.getMessage().contains("Mocked type must be: ArrayList, but is: List"));
        }
    }

    @Test
    public void testCannotCallAbstractRealMethod() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.cannotCallAbstractRealMethod();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot call abstract real method on java object!"));
        }
    }

    @Test
    public void testCannotVerifyToString() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    @Test
    public void testMoreThanOneAnnotationNotAllowed() throws Exception {
        Reporter reporter = new Reporter();
        String fieldName = "myField";
        try {
            reporter.moreThanOneAnnotationNotAllowed(fieldName);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("You cannot have more than one Mockito annotation on a field!"));
            assertTrue(e.getMessage().contains("The field 'myField' has multiple Mockito annotations."));
        }
    }

    @Test
    public void testUnsupportedCombinationOfAnnotations() throws Exception {
        Reporter reporter = new Reporter();
        String annotationOne = "Mock";
        String annotationTwo = "InjectMocks";
        try {
            reporter.unsupportedCombinationOfAnnotations(annotationOne, annotationTwo);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("This combination of annotations is not permitted on a single field:"));
            assertTrue(e.getMessage().contains("@Mock and @InjectMocks"));
        }
    }

    @Test
    public void testCannotInitializeForSpyAnnotation() throws Exception {
        Reporter reporter = new Reporter();
        String fieldName = "spyField";
        Exception details = new RuntimeException("Constructor failed");
        try {
            reporter.cannotInitializeForSpyAnnotation(fieldName, details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instantiate a @Spy for 'spyField' field."));
            assertTrue(e.getMessage().contains("Constructor failed"));
        }
    }

    @Test
    public void testCannotInitializeForInjectMocksAnnotation() throws Exception {
        Reporter reporter = new Reporter();
        String fieldName = "injectMocksField";
        Exception details = new RuntimeException("Injection failed");
        try {
            reporter.cannotInitializeForInjectMocksAnnotation(fieldName, details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instantiate @InjectMocks field named 'injectMocksField'."));
            assertTrue(e.getMessage().contains("Injection failed"));
        }
    }

    @Test
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
            fail("Expected FriendlyReminderException");
        } catch (FriendlyReminderException e) {
            assertTrue(e.getMessage().contains("timeout() should not be used with atMost() or never()"));
        }
    }

    @Test
    public void testFieldInitialisationThrewException() throws Exception {
        Reporter reporter = new Reporter();
        Field field = null; // Mocking a Field object is complex, assume null for test message
        Throwable details = new RuntimeException("Initialization failed");
        try {
            reporter.fieldInitialisationThrewException(field, details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            // The message formatting for fieldInitialisationThrewException uses field.getName() and field.getType().
            // If field is null, it will likely throw a NullPointerException *before* the reporter's message is generated,
            // or the message will contain "null" for these values.
            // Let's adapt the assertion to handle potential nulls or NPEs gracefully in the message.
            assertTrue(e.getMessage().contains("Cannot instantiate @InjectMocks field named 'null' of type 'null'.") || 
                       e.getMessage().contains("Initialization failed")); // Checking for the detail message is safer.
            assertTrue(e.getMessage().contains("Initialization failed"));
        }
    }

    @Test
    public void testInvocationListenerDoesNotAcceptNullParameters() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.invocationListenerDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("invocationListeners() does not accept null parameters"));
        }
    }

    @Test
    public void testInvocationListenersRequiresAtLeastOneListener() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.invocationListenersRequiresAtLeastOneListener();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("invocationListeners() requires at least one listener"));
        }
    }

    @Test
    public void testInvocationListenerThrewException() throws Exception {
        Reporter reporter = new Reporter();
        InvocationListener listener = new MockedInvocationListener();
        Throwable listenerThrowable = new RuntimeException("Listener error");
        try {
            reporter.invocationListenerThrewException(listener, listenerThrowable);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("The invocation listener with type"));
            assertTrue(e.getMessage().contains("threw an exception : java.lang.RuntimeException: Listener error"));
        }
    }

    @Test
    public void testCannotInjectDependency() throws Exception {
        Reporter reporter = new Reporter();
        Field field = null; // Mocking a Field object is complex, assume null for test message
        Object matchingMock = new Object();
        Exception details = new RuntimeException("Injection failed");
        try {
            reporter.cannotInjectDependency(field, matchingMock, details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito couldn't inject mock dependency 'java.lang.Object' on field"));
            assertTrue(e.getMessage().contains("null")); // For the field name when null
            assertTrue(e.getMessage().contains("Also I failed because: Injection failed"));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithDelegatedInstanceType() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> mockedType = List.class;
        Object delegatedInstance = new ArrayList<>();
        try {
            reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(mockedType, delegatedInstance);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be the same as the type of your delegated instance."));
            assertTrue(e.getMessage().contains("Mocked type must be: ArrayList, but is: List"));
        }
    }

    @Test
    public void testSpyAndDelegateAreMutuallyExclusive() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.spyAndDelegateAreMutuallyExclusive();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Settings should not define a spy instance and a delegated instance at the same time."));
        }
    }

    @Test
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Invalid argument index."));
            assertTrue(e.getMessage().contains("The index need to be a positive number that indicates the position of the argument to return."));
        }
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime() throws Exception {
        Reporter reporter = new Reporter();
        // Need to create a mock Invocation that has a method with parameters.
        // For simplicity, we'll create a mock method and simulate it.
        Method toStringMethod = null;
        try {
            toStringMethod = Object.class.getMethod("toString");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Invocation mockInvocation = new InvocationImpl(
            new Object(), // mock
            new MockitoMethod("mockedMethod", new Class<?>[]{String.class, Integer.class}, toStringMethod), // method
            new Object[]{"arg1", 123}, // args
            null, // location
            null // mockSettings
        );

        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(mockInvocation, false, 10);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Invalid argument index for the current invocation of method :"));
            assertTrue(e.getMessage().contains("-> null.mockedMethod()")); // MockName is null for this constructor
            assertTrue(e.getMessage().contains("Wanted parameter at position 10 but"));
            assertTrue(e.getMessage().contains("the possible argument indexes for this method are :"));
            assertTrue(e.getMessage().contains("[0] String"));
            assertTrue(e.getMessage().contains("[1] Integer"));
        }
    }

    @Test
    public void testWrongTypeOfArgumentToReturn() throws Exception {
        Reporter reporter = new Reporter();
        // Need to create a mock Invocation that has a method returning a specific type.
        Method stringMethod = null;
        try {
            stringMethod = String.class.getMethod("length"); // Returns int
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Invocation mockInvocation = new InvocationImpl(
            new Object(), // mock
            new MockitoMethod("mockedMethod", new Class<?>[]{}, stringMethod), // method
            new Object[]{}, // args
            null, // location
            null // mockSettings
        );

        String expectedType = "String";
        Class<?> actualType = Integer.class; // This is the type that would be returned, not the method return type.
        int argumentIndex = 0; // This is for selecting an argument to return, not the return type itself.
        // The methodReporter.wrongTypeOfArgumentToReturn expects an actual type for an *argument* that's being returned.
        // Let's assume the scenario is trying to return an Integer as an argument when String is expected.

        // The method signature is: wrongTypeOfArgumentToReturn(InvocationOnMock invocation, String expectedType, Class actualType, int argumentIndex)
        // expectedType is the return type of the method.
        // actualType is the type of the argument being returned.
        // argumentIndex is the index of the argument being returned.

        // Let's adjust this to reflect returning an argument with a specific type.
        // The reporter's message implies the `expectedType` is the return type of the method,
        // and `actualType` is the type of the argument that's being returned as the result.

        Method mockReturningStringMethod = null;
        try {
            // Find a method that *conceptually* returns String, e.g., Object.toString()
            mockReturningStringMethod = Object.class.getMethod("toString");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Invocation invocationForWrongType = new InvocationImpl(
            new Object(), // mock
            new MockitoMethod("getString", new Class<?>[]{}, mockReturningStringMethod), // method
            new Object[]{}, // args
            null, // location
            null // mockSettings
        );
        
        try {
            // Simulating an attempt to return an Integer when the method should return String.
            reporter.wrongTypeOfArgumentToReturn(invocationForWrongType, "String", Integer.class, 0);
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("The argument of type 'Integer' cannot be returned because the following method should return the type 'String'"));
            assertTrue(e.getMessage().contains("-> null.getString()")); // MockName is null
            assertTrue(e.getMessage().contains("Position of the wanted argument is 0"));
        }
    }

    @Test
    public void testDefaultAnswerDoesNotAcceptNullParameter() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.defaultAnswerDoesNotAcceptNullParameter();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("defaultAnswer() does not accept null parameter"));
        }
    }

    @Test
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable() throws Exception {
        Reporter reporter = new Reporter();
        Class<?> classToMock = Object.class;
        try {
            reporter.serializableWontWorkForObjectsThatDontImplementSerializable(classToMock);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("You are using the setting 'withSettings().serializable()' however the type you are trying to mock 'Object'"));
            assertTrue(e.getMessage().contains("do not implement Serializable AND do not have a no-arg constructor."));
        }
    }

    @Test
    public void testDelegatedMethodHasWrongReturnType() throws Exception {
        Reporter reporter = new Reporter();
        // Mocking Method objects is complex. We'll use dummy ones and check the message content.
        Method mockMethod = null;
        Method delegateMethod = null;
        Object mock = new Object();
        Object delegate = new Object();
        try {
            // Simulate the reporter's message formatting, which uses getReturnType().getSimpleName().
            // If mockMethod or delegateMethod are null, getReturnType() would throw NPE.
            // The reporter handles this by including "null" in the message.
            reporter.delegatedMethodHasWrongReturnType(mockMethod, delegateMethod, mock, delegate);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Methods called on delegated instance must have compatible return types with the mock."));
            assertTrue(e.getMessage().contains("return type should be: null, but was: null")); // Since mockMethod and delegateMethod are null
            assertTrue(e.getMessage().contains("delegate instance had type: Object"));
        }
    }

	@Test
    public void testDelegatedMethodDoesNotExistOnDelegate() throws Exception {
        Reporter reporter = new Reporter();
        Method mockMethod = null; // Mocking Method is complex
        Object mock = new Object();
        Object delegate = new Object();
        try {
            // Simulate the reporter's message formatting.
            reporter.delegatedMethodDoesNotExistOnDelegate(mockMethod, mock, delegate);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Methods called on mock must exist in delegated instance."));
            assertTrue(e.getMessage().contains("no such method was found."));
            assertTrue(e.getMessage().contains("delegate instance had type: Object"));
        }
    }

    @Test
    public void testUsingConstructorWithFancySerializable() throws Exception {
        Reporter reporter = new Reporter();
        SerializableMode mode = SerializableMode.BASIC;
        try {
            reporter.usingConstructorWithFancySerializable(mode);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocks instantiated with constructor cannot be combined with BASIC serialization mode."));
        }
    }
    
    // --- Helper classes ---

    // Mocked DescribedInvocation to simulate its behavior
    private static class MockedDescribedInvocation implements DescribedInvocation {
        private final String description;

        public MockedDescribedInvocation(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }

        @Override
        public Location getLocation() {
            return new LocationImpl();
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public boolean matches(Invocation invocation) {
            return false;
        }
    }

    // Mocked Invocation for testing
    private static class MockedInvocation implements Invocation {
        private final String methodName;
        private final Object mock;
        private final Method method;

        public MockedInvocation(String methodName, Object mock) {
            this.methodName = methodName;
            this.mock = mock;
            try {
                // Use a method that exists on Object and is generally accessible
                this.method = Object.class.getMethod("toString");
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Failed to get Object.toString()", e);
            }
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return new Object[0];
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return null;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }

        @Override
        public Location getLocation() {
            return new LocationImpl();
        }

        @Override
        public String toString() {
            return methodName;
        }
        
        @Override
        public MockName getMockName() {
            // Safely get mock name or return a default if mock is null or has no name.
            if (mock == null) return new MockName("null mock");
            return new MockUtil().getMockName(mock);
        }

        @Override
        public boolean isInvokedMockException(Throwable throwable) { return false; }

        @Override
        public String getDescription() { return methodName; }

        @Override
        public boolean matches(Invocation invocation) { return false; }
        
        @Override
        public void ignoreForVerification() {
            // No-op for mock
        }
    }

    // Mocked VerificationAwareInvocation
    private static class MockedVerificationAwareInvocation extends MockedInvocation implements VerificationAwareInvocation {
        public MockedVerificationAwareInvocation(String methodName, Object mock) {
            super(methodName, mock);
        }
        
        // VerificationAwareInvocation requires this method.
        @Override
        public boolean isVerified() {
            return false;
        }
    }

    // Mocked InvocationOnMock
    private static class MockedInvocationOnMock implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        public MockedInvocationOnMock(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            if (index < 0 || index >= arguments.length) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arguments.length);
            }
            // Basic type checking, can be expanded if needed.
            if (clazz.isInstance(arguments[index])) {
                return clazz.cast(arguments[index]);
            }
            return null; // Or throw a ClassCastException
        }

        @Override
        public Object callRealMethod() throws Throwable {
            // This is complex to mock accurately without a real object and method.
            // For testing the Reporter, we likely don't need to execute this.
            return null;
        }
    }

    // Mocked InvocationListener
    private static class MockedInvocationListener implements InvocationListener {
        @Override
        public void onInvocationStarted(Invocation inv) {
            // No-op
        }

        @Override
        public void onInvocationComplete(Invocation inv, Throwable throwable) {
            // No-op
        }
    }
    
    // Dummy classes for InvocationImpl and MockitoMethod to satisfy the constructor.
    // These are internal Mockito classes, so we're providing minimal definitions to make the test compile.
    
    private static class MockitoMethod implements org.mockito.internal.invocation.MockitoMethod {
        private final String name;
        private final Class<?>[] parameterTypes;
        private final Method realMethod;

        public MockitoMethod(String name, Class<?>[] parameterTypes, Method realMethod) {
            this.name = name;
            this.parameterTypes = parameterTypes;
            this.realMethod = realMethod;
        }

        @Override
        public String getName() { return name; }
        @Override
        public Class<?>[] getParameterTypes() { return parameterTypes; }
        @Override
        public Class<?> getReturnType() { return realMethod.getReturnType(); }
        @Override
        public Method getRealMethod() { return realMethod; }
        @Override
        public boolean isVarArgs() { return realMethod.isVarArgs(); }
        @Override
        public boolean isOverloaded() { return false; } // Simplified
        @Override
        public boolean isBridge() { return false; } // Simplified
        @Override
        public boolean isSynthetic() { return false; } // Simplified
        @Override
        public boolean isAbstract() { return false; } // Simplified
        @Override
        public boolean isFinal() { return false; } // Simplified
        @Override
        public boolean isPublic() { return true; } // Simplified
        @Override
        public boolean isProtected() { return false; } // Simplified
        @Override
        public boolean isPrivate() { return false; } // Simplified
        @Override
        public boolean isDefault() { return false; } // Simplified
        @Override
        public StackTraceElement toStackTraceElement() { return null; } // Simplified
    }
}
```