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
    @Test
    public void checkedExceptionInvalidThrowsMockitoException() throws Exception {
        Reporter reporter = new Reporter();
        try {
            reporter.checkedExceptionInvalid(new Exception("checked"));
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(expected.getMessage().contains("Invalid: java.lang.Exception: checked"));
        }
    }

    @Test
    public void cannotStubWithNullThrowableThrowsMockitoException() throws Exception {
        try {
            new Reporter().cannotStubWithNullThrowable();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Cannot stub with null throwable!"));
        }
    }

    @Test
    public void nullPassedToVerifyThrowsSpecificException() throws Exception {
        try {
            new Reporter().nullPassedToVerify();
            fail("expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException expected) {
            assertTrue(expected.getMessage().contains("should be a mock but is null"));
        }
    }

    @Test
    public void notAMockPassedToVerifyIncludesTypeName() throws Exception {
        try {
            new Reporter().notAMockPassedToVerify(String.class);
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertTrue(expected.getMessage().contains("type String"));
        }
    }

    @Test
    public void nullPassedToWhenThrowsSpecificException() throws Exception {
        try {
            new Reporter().nullPassedToWhenMethod();
            fail("expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException expected) {
            assertTrue(expected.getMessage().contains("Argument passed to when() is null!"));
        }
    }

    @Test
    public void notAMockPassedToWhenThrowsSpecificException() throws Exception {
        try {
            new Reporter().notAMockPassedToWhenMethod();
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertTrue(expected.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    @Test
    public void mocksRequiredForVerifyNoMoreInteractions() throws Exception {
        try {
            new Reporter().mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void mocksRequiredForInOrder() throws Exception {
        try {
            new Reporter().mocksHaveToBePassedWhenCreatingInOrder();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("InOrder"));
        }
    }

    @Test
    public void cannotMockFinalClassNamesClass() throws Exception {
        try {
            new Reporter().cannotMockFinalClass(String.class);
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Cannot mock/spy class java.lang.String"));
            assertTrue(expected.getMessage().contains("final classes"));
        }
    }

    @Test
    public void cannotStubVoidMethodIncludesMethodName() throws Exception {
        try {
            new Reporter().cannotStubVoidMethodWithAReturnValue("stop");
            fail("expected CannotStubVoidMethodWithReturnValue");
        } catch (CannotStubVoidMethodWithReturnValue expected) {
            assertTrue(expected.getMessage().contains("'stop' is a *void method*"));
        }
    }

    @Test
    public void wrongTypeOfReturnValueNamesExpectedAndActualTypes() throws Exception {
        try {
            new Reporter().wrongTypeOfReturnValue("Integer", "String", "count");
            fail("expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue expected) {
            assertTrue(expected.getMessage().contains("String cannot be returned by count()"));
            assertTrue(expected.getMessage().contains("count() should return Integer"));
        }
    }

    @Test
    public void wantedAtMostUsesCountsAtZeroBoundary() throws Exception {
        try {
            new Reporter().wantedAtMostX(0, 1);
            fail("expected MockitoAssertionError");
        } catch (MockitoAssertionError expected) {
            assertTrue(expected.getMessage().contains("Wanted at most"));
            assertTrue(expected.getMessage().contains("but was 1"));
        }
    }

    @Test
    public void wantedAtMostReportsPluralCount() throws Exception {
        try {
            new Reporter().wantedAtMostX(2, 3);
            fail("expected MockitoAssertionError");
        } catch (MockitoAssertionError expected) {
            assertTrue(expected.getMessage().contains("but was 3"));
        }
    }

    @Test
    public void noArgumentValueWasCapturedThrowsMockitoException() throws Exception {
        try {
            new Reporter().noArgumentValueWasCaptured();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("No argument value was captured!"));
        }
    }

    @Test
    public void extraInterfacesNullParametersThrowsMockitoException() throws Exception {
        try {
            new Reporter().extraInterfacesDoesNotAcceptNullParameters();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    @Test
    public void extraInterfacesRejectsClass() throws Exception {
        try {
            new Reporter().extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("String which is not an interface"));
        }
    }

    @Test
    public void extraInterfacesRequiresAtLeastOne() throws Exception {
        try {
            new Reporter().extraInterfacesRequiresAtLeastOneInterface();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("requires at least one interface"));
        }
    }

    @Test
    public void spyAndDelegateCannotBeCombined() throws Exception {
        try {
            new Reporter().spyAndDelegateAreMutuallyExclusive();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("spy instance and a delegated instance"));
        }
    }

    @Test
    public void invalidIdentityAnswerArgumentRangeThrowsMockitoException() throws Exception {
        try {
            new Reporter().invalidArgumentRangeAtIdentityAnswerCreationTime();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Invalid argument index."));
            assertTrue(expected.getMessage().contains(" -1 value"));
        }
    }

    @Test
    public void timeoutReminderThrowsFriendlyReminder() throws Exception {
        try {
            new Reporter().atMostAndNeverShouldNotBeUsedWithTimeout();
            fail("expected FriendlyReminderException");
        } catch (FriendlyReminderException expected) {
            assertTrue(expected.getMessage().contains("friendly reminder"));
            assertTrue(expected.getMessage().contains("atMost() or never()"));
        }
    }

    @Test
    public void invocationListenersRequireOneListener() throws Exception {
        try {
            new Reporter().invocationListenersRequiresAtLeastOneListener();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("invocationListeners() requires at least one listener"));
        }
    }

    @Test
    public void defaultAnswerRejectsNull() throws Exception {
        try {
            new Reporter().defaultAnswerDoesNotAcceptNullParameter();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("defaultAnswer() does not accept null parameter"));
        }
    }

    @Test
    public void unfinishedStubbingThrowsItsSpecificException() throws Exception {
        try {
            new Reporter().unfinishedStubbing(new LocationImpl());
            fail("expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException expected) {
            assertTrue(expected.getMessage().contains("Unfinished stubbing detected here:"));
            assertTrue(expected.getMessage().contains("thenReturn() may be missing."));
        }
    }

    @Test
    public void incorrectUseOfApiThrowsMockitoException() throws Exception {
        try {
            new Reporter().incorrectUseOfApi();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Incorrect use of API detected here:"));
        }
    }

    @Test
    public void missingMethodInvocationHasGuidance() throws Exception {
        try {
            new Reporter().missingMethodInvocation();
            fail("expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException expected) {
            assertTrue(expected.getMessage().contains("when() requires an argument"));
        }
    }

    @Test
    public void unfinishedVerificationUsesProvidedLocation() throws Exception {
        Location location = new LocationImpl();
        try {
            new Reporter().unfinishedVerificationException(location);
            fail("expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException expected) {
            assertTrue(expected.getMessage().contains("Missing method call for verify(mock) here:"));
            assertTrue(expected.getMessage().contains(location.toString()));
        }
    }

    @Test
    public void notAMockForNoMoreInteractionsThrowsSpecificException() throws Exception {
        try {
            new Reporter().notAMockPassedToVerifyNoMoreInteractions();
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertTrue(expected.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void nullForNoMoreInteractionsThrowsSpecificException() throws Exception {
        try {
            new Reporter().nullPassedToVerifyNoMoreInteractions();
            fail("expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException expected) {
            assertTrue(expected.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void notAMockWhenCreatingInOrderThrowsSpecificException() throws Exception {
        try {
            new Reporter().notAMockPassedWhenCreatingInOrder();
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertTrue(expected.getMessage().contains("is not a mock"));
        }
    }

    @Test
    public void nullWhenCreatingInOrderThrowsSpecificException() throws Exception {
        try {
            new Reporter().nullPassedWhenCreatingInOrder();
            fail("expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException expected) {
            assertTrue(expected.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void inOrderRequiresFamiliarMockThrowsMockitoException() throws Exception {
        try {
            new Reporter().inOrderRequiresFamiliarMock();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("InOrder can only verify mocks"));
        }
    }

    @Test
    public void noSubMatchersNamesMatcher() throws Exception {
        try {
            new Reporter().reportNoSubMatchersFound("and");
            fail("expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException expected) {
            assertTrue(expected.getMessage().contains("No matchers found for additional matcher and"));
        }
    }

    @Test
    public void stubPassedToVerifyThrowsSpecificException() throws Exception {
        try {
            new Reporter().stubPassedToVerify();
            fail("expected CannotVerifyStubOnlyMock");
        } catch (CannotVerifyStubOnlyMock expected) {
            assertTrue(expected.getMessage().contains("stubOnly() mock"));
        }
    }

    @Test
    public void extraInterfacesCannotContainMockedTypeReportsType() throws Exception {
        try {
            new Reporter().extraInterfacesCannotContainMockedType(List.class);
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("List"));
            assertTrue(expected.getMessage().contains("same very interface"));
        }
    }

    @Test
    public void cannotCallAbstractRealMethodThrowsMockitoException() throws Exception {
        try {
            new Reporter().cannotCallAbstractRealMethod();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Cannot call abstract real method"));
        }
    }

    @Test
    public void cannotVerifyToStringThrowsMockitoException() throws Exception {
        try {
            new Reporter().cannotVerifyToString();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    @Test
    public void moreThanOneAnnotationReportsFieldName() throws Exception {
        try {
            new Reporter().moreThanOneAnnotationNotAllowed("value");
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("The field 'value' has multiple Mockito annotations."));
        }
    }

    @Test
    public void unsupportedAnnotationCombinationReportsBothNames() throws Exception {
        try {
            new Reporter().unsupportedCombinationOfAnnotations("Mock", "Spy");
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("@Mock and @Spy"));
        }
    }

    @Test
    public void invocationListenerNullParametersThrowsMockitoException() throws Exception {
        try {
            new Reporter().invocationListenerDoesNotAcceptNullParameters();
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertEquals("invocationListeners() does not accept null parameters", expected.getMessage());
        }
    }

    @Test
    public void fieldInitializationFailureNamesField() throws Exception {
        Field field = ReporterTest.class.getDeclaredField("sampleField");
        try {
            new Reporter().fieldInitialisationThrewException(field, new Exception("boom"));
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("Cannot instantiate @InjectMocks field named 'sampleField'"));
            assertTrue(expected.getMessage().contains("boom"));
        }
    }

    private int sampleField;

    @Test
    public void misplacedMatcherWithEmptyListThrowsMatcherException() throws Exception {
        try {
            new Reporter().misplacedArgumentMatcher(new ArrayList<LocalizedMatcher>());
            fail("expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException expected) {
            assertTrue(expected.getMessage().contains("Misplaced argument matcher detected here:"));
        }
    }

    @Test
    public void tooLittleAndTooManyMatcherInputsAreNotNeededForThisTestClass() throws Exception {
        assertEquals(0, new ArrayList<LocalizedMatcher>().size());
    }
}
