```java
package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls;
import java.util.List;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.ArgumentsAreDifferent;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.exceptions.verification.junit.JUnitTool;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.exceptions.util.ScenarioPrinter;
import org.mockito.internal.invocation.Invocation;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

// Dummy implementations for interfaces used in tests that are not provided in the API outline
// This is a workaround because the original code expected these to be available or part of the test setup.
class PrintableInvocationImpl implements PrintableInvocation {
    private final String representation;
    private final Location location;

    public PrintableInvocationImpl(String representation, Location location) {
        this.representation = representation;
        this.location = location;
    }

    @Override
    public String toString() {
        return representation;
    }

    @Override
    public Location getLocation() {
        return location;
    }
}

class VerificationAwareInvocationImpl implements VerificationAwareInvocation {
    private final Location location;

    public VerificationAwareInvocationImpl(Location location) {
        this.location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public boolean isVerified() {
        return false; // Dummy implementation
    }
}

class Discrepancy {
    private final int wantedCount;
    private final int actualCount;

    public Discrepancy(int wantedCount, int actualCount) {
        this.wantedCount = wantedCount;
        this.actualCount = actualCount;
    }

    public String getPluralizedWantedCount() {
        return wantedCount + (wantedCount == 1 ? " time" : " times");
    }

    public String getPluralizedActualCount() {
        return actualCount + (actualCount == 1 ? " time" : " times");
    }
}

public class ReporterTest {

    private Reporter reporter = new Reporter();
    private Location location = new Location();
    private final String TEST_STRING = "test string";
    private final String ANOTHER_STRING = "another string";
    private final String FORMATTED_STRING = "formatted string";
    private final String EXPECTED_TYPE = "java.lang.String";
    private final String ACTUAL_TYPE = "java.lang.Integer";
    private final String METHOD_NAME = "someMethod";
    private final int WANTED_COUNT = 1;
    private final int ACTUAL_COUNT = 2;
    private final int EXPECTED_MATCHERS = 2;
    private final int RECORDED_MATCHERS = 3;
    private final int MAX_INVOCATIONS = 5;
    private final int FOUND_SIZE = 10;

    @Test
    public void testCheckedExceptionInvalid() {
        Throwable throwable = new Exception("Test Exception");
        try {
            reporter.checkedExceptionInvalid(throwable);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(e.getMessage().contains("Invalid: " + throwable.toString()));
        }
    }

    @Test
    public void testCannotStubWithNullThrowable() {
        try {
            reporter.cannotStubWithNullThrowable();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot stub with null throwable!"));
        }
    }

    @Test
    public void testUnfinishedStubbing() {
        try {
            reporter.unfinishedStubbing(location);
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing detected here:"));
            assertTrue(e.getMessage().contains("E.g. thenReturn() may be missing."));
        }
    }

    @Test
    public void testMissingMethodInvocation() {
        try {
            reporter.missingMethodInvocation();
            fail("Expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException e) {
            assertTrue(e.getMessage().contains("when() requires an argument which has to be 'a method call on a mock'."));
        }
    }

    @Test
    public void testUnfinishedVerificationException() {
        try {
            reporter.unfinishedVerificationException(location);
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertTrue(e.getMessage().contains("Missing method call for verify(mock) here:"));
        }
    }

    @Test
    public void testNotAMockPassedToVerify() {
        try {
            reporter.notAMockPassedToVerify(String.class);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() is of type String and is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerify() {
        try {
            reporter.nullPassedToVerify();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() should be a mock but is null!"));
        }
    }

    @Test
    public void testNotAMockPassedToWhenMethod() {
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToWhenMethod() {
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is null!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerifyNoMoreInteractions() {
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testNotAMockPassedWhenCreatingInOrder() {
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedWhenCreatingInOrder() {
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testInOrderRequiresFamiliarMock() {
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("InOrder can only verify mocks that were passed in during creation of InOrder."));
        }
    }

    @Test
    public void testInvalidUseOfMatchers() {
        try {
            reporter.invalidUseOfMatchers(EXPECTED_MATCHERS, RECORDED_MATCHERS);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Invalid use of argument matchers!"));
            assertTrue(e.getMessage().contains(EXPECTED_MATCHERS + " matchers expected, " + RECORDED_MATCHERS + " recorded."));
        }
    }

    @Test
    public void testArgumentsAreDifferent() {
        try {
            reporter.argumentsAreDifferent(TEST_STRING, ANOTHER_STRING, location);
            fail("Expected ArgumentsAreDifferent");
        } catch (ArgumentsAreDifferent e) {
            assertTrue(e.getMessage().contains("Argument(s) are different!"));
            assertTrue(e.getMessage().contains("Wanted:" + TEST_STRING));
            assertTrue(e.getMessage().contains("Actual invocation has different arguments:" + ANOTHER_STRING));
        }
    }

    @Test
    public void testWantedButNotInvoked() {
        PrintableInvocation printableInvocation = new PrintableInvocationImpl(FORMATTED_STRING, location);
        try {
            reporter.wantedButNotInvoked(printableInvocation);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains(FORMATTED_STRING));
        }
    }

    @Test
    public void testWantedButNotInvokedWithInvocations() {
        PrintableInvocation printableInvocation = new PrintableInvocationImpl(FORMATTED_STRING, location);
        List<PrintableInvocation> invocations = Arrays.asList(printableInvocation);
        try {
            reporter.wantedButNotInvoked(printableInvocation, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains(FORMATTED_STRING));
            assertTrue(e.getMessage().contains("However, there were other interactions with this mock:"));
            assertTrue(e.getMessage().contains(location.toString()));
        }
    }

    @Test
    public void testWantedButNotInvokedInOrder() {
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        PrintableInvocation previous = new PrintableInvocationImpl("PreviousInvocation", location);
        try {
            reporter.wantedButNotInvokedInOrder(wanted, previous);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure"));
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Wanted anywhere AFTER following interaction:"));
        }
    }

    @Test
    public void testTooManyActualInvocations() {
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        Location firstUndesired = new Location();
        try {
            reporter.tooManyActualInvocations(WANTED_COUNT, ACTUAL_COUNT, wanted, firstUndesired);
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 2. Undesired invocation:"));
        }
    }

    @Test
    public void testNeverWantedButInvoked() {
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        Location firstUndesired = new Location();
        try {
            reporter.neverWantedButInvoked(wanted, firstUndesired);
            fail("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("Never wanted here:"));
            assertTrue(e.getMessage().contains("But invoked here:"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder() {
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        Location firstUndesired = new Location();
        try {
            reporter.tooManyActualInvocationsInOrder(WANTED_COUNT, ACTUAL_COUNT, wanted, firstUndesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 2. Undesired invocation:"));
        }
    }

    @Test
    public void testTooLittleActualInvocations() {
        Discrepancy discrepancy = new Discrepancy(WANTED_COUNT, ACTUAL_COUNT);
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        Location lastActualLocation = new Location();
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, lastActualLocation);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 2 times:"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder() {
        Discrepancy discrepancy = new Discrepancy(WANTED_COUNT, ACTUAL_COUNT);
        PrintableInvocation wanted = new PrintableInvocationImpl("WantedInvocation", location);
        Location lastActualLocation = new Location();
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, lastActualLocation);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 2 times:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted() {
        // Invocation constructor has changed, use mock instead
        Invocation undesired = Mockito.mock(Invocation.class);
        List<VerificationAwareInvocation> invocations = Arrays.asList(new VerificationAwareInvocationImpl(location));
        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWantedInOrder() {
        // Invocation constructor has changed, use mock instead
        Invocation undesired = Mockito.mock(Invocation.class);
        try {
            reporter.noMoreInteractionsWantedInOrder(undesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testCannotMockFinalClass() {
        try {
            reporter.cannotMockFinalClass(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot mock/spy " + String.class.toString()));
            assertTrue(e.getMessage().contains("- final classes"));
        }
    }

    @Test
    public void testCannotStubVoidMethodWithAReturnValue() {
        try {
            reporter.cannotStubVoidMethodWithAReturnValue(METHOD_NAME);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("'" + METHOD_NAME + "' is a *void method* and it *cannot* be stubbed with a *return value*!"));
        }
    }

    @Test
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Only void methods can doNothing()!"));
        }
    }

    @Test
    public void testWrongTypeOfReturnValue() {
        try {
            reporter.wrongTypeOfReturnValue(EXPECTED_TYPE, ACTUAL_TYPE, METHOD_NAME);
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains(ACTUAL_TYPE + " cannot be returned by " + METHOD_NAME + "()"));
            assertTrue(e.getMessage().contains(METHOD_NAME + "() should return " + EXPECTED_TYPE));
        }
    }

    @Test
    public void testWantedAtMostX() {
        try {
            reporter.wantedAtMostX(MAX_INVOCATIONS, FOUND_SIZE);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most 5 times but was 10"));
        }
    }

    @Test
    public void testMisplacedArgumentMatcher() {
        try {
            reporter.misplacedArgumentMatcher(location);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Misplaced argument matcher detected here:"));
        }
    }

    @Test
    public void testSmartNullPointerException() {
        Object obj = new Object();
        try {
            reporter.smartNullPointerException(obj, location);
            fail("Expected SmartNullPointerException");
        } catch (SmartNullPointerException e) {
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
            assertTrue(e.getMessage().contains("Because this method was *not* stubbed correctly:"));
        }
    }

    @Test
    public void testNoArgumentValueWasCaptured() {
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument value was captured!"));
            assertTrue(e.getMessage().contains("You might have forgotten to use argument.capture() in verify()..."));
        }
    }

    @Test
    public void testExtraInterfacesDoesNotAcceptNullParameters() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces() {
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() accepts only interfaces."));
            assertTrue(e.getMessage().contains("You passed following type: String which is not an interface."));
        }
    }

    @Test
    public void testExtraInterfacesCannotContainMockedType() {
        try {
            reporter.extraInterfacesCannotContainMockedType(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept the same type as the mocked type."));
            assertTrue(e.getMessage().contains("You mocked following type: String"));
        }
    }

    @Test
    public void testExtraInterfacesRequiresAtLeastOneInterface() {
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() requires at least one interface."));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, "a string");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be the same as the type of your spied instance."));
            assertTrue(e.getMessage().contains("Mocked type must be: String, but is: List"));
        }
    }

    @Test
    public void testCannotCallRealMethodOnInterface() {
        try {
            reporter.cannotCallRealMethodOnInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot call real method on java interface. Interface does not have any implementation!"));
        }
    }

    @Test
    public void testCannotVerifyToString() {
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    @Test
    public void testMoreThanOneAnnotationNotAllowed() {
        try {
            reporter.moreThanOneAnnotationNotAllowed("fieldName");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("You cannot have more than one Mockito annotation on a field!"));
            assertTrue(e.getMessage().contains("The field 'fieldName' has multiple Mockito annotations."));
        }
    }

    @Test
    public void testUnsupportedCombinationOfAnnotations() {
        try {
            reporter.unsupportedCombinationOfAnnotations("AnnotationOne", "AnnotationTwo");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("This combination of annotations is not permitted on a single field:"));
            assertTrue(e.getMessage().contains("@AnnotationOne and @AnnotationTwo"));
        }
    }

    @Test
    public void testCannotInitializeForSpyAnnotation() {
        Exception details = new RuntimeException("Initialization failed");
        try {
            reporter.cannotInitializeForSpyAnnotation("fieldName", details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate a @Spy for 'fieldName' field."));
            assertTrue(e.getMessage().contains("However, I failed because: Initialization failed"));
        }
    }

    @Test
    public void testCannotInitializeForInjectMocksAnnotation() {
        Exception details = new RuntimeException("Initialization failed");
        try {
            reporter.cannotInitializeForInjectMocksAnnotation("fieldName", details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate @InjectMocks field named 'fieldName'."));
            assertTrue(e.getMessage().contains("However, I failed because: Initialization failed"));
        }
    }
}
```