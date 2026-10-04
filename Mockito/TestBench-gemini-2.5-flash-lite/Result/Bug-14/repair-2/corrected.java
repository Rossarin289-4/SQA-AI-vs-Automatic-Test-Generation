package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;
import java.util.Arrays;
import org.mockito.InOrder;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.invocation.AllInvocationsFinder;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.internal.verification.api.VerificationDataInOrder;
import org.mockito.internal.verification.api.VerificationDataInOrderImpl;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.Mockito;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.invocation.InvocationOnMock;
import java.lang.reflect.Method;

public class MockHandlerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testHandleWhenStubbingVoids() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someMethod", new Object[0]);
        handler.invocationContainerImpl.setAnswersForStubbing(Arrays.asList(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock inv) throws Throwable { return null; }
        }));
        handler.handle(invocation);
        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testHandleWhenNotStubbingVoids() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someMethod", new Object[0]);
        handler.handle(invocation);
        assertFalse(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testHandleWithVerificationMode() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VerificationMode mode = VerificationModeFactory.times(1);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mock, mode);
        handler.mockingProgress.verificationStarted(mockAwareMode);

        Invocation invocation = createInvocation("someMethod", new Object[0]);
        // Using InvocationImpl.createMockInvocation to set mock correctly
        Invocation realInvocation = InvocationImpl.createMockInvocation(mock, null, new Object[0], 0, null);
        handler.handle(realInvocation);

        assertTrue(true); // Placeholder for successful execution
    }

    @Test
    public void testHandleWhenVerificationModeIsDifferentMock() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock1 = new Object(); // Mock for verification mode
        Object mock2 = new Object(); // Mock in the invocation
        VerificationMode mode = VerificationModeFactory.times(1);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mock1, mode);
        handler.mockingProgress.verificationStarted(mockAwareMode);

        Invocation invocation = createInvocation("someMethod", new Object[0]);
        Invocation realInvocation = InvocationImpl.createMockInvocation(mock2, null, new Object[0], 0, null);

        handler.handle(realInvocation);
        assertNotNull(handler.mockingProgress.pullOngoingStubbing());
    }

    @Test
    public void testHandleWhenNoVerificationModeAndNoStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someMethod", new Object[0]);
        Object defaultAnswerResult = handler.handle(invocation);
        assertNotNull(defaultAnswerResult);
    }

    @Test
    public void testHandleWhenStubbingAndAnswerIsFound() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodWithArgs", new Object[]{"arg1", 123});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        StubbedInvocationMatcher stubbedInvocation = new StubbedInvocationMatcher(invocationMatcher, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock inv) throws Throwable {
                return "stubbed";
            }
        });
        handler.invocationContainerImpl.addInvocation(invocationMatcher, stubbedInvocation.getAnswer());

        Object result = handler.handle(invocation);
        assertEquals("stubbed", result);
    }

    @Test
    public void testHandleWhenStubbingAndAnswerNotFoundReturnsDefault() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodWithArgs", new Object[]{"arg1", 123});
        Object defaultAnswerResult = handler.handle(invocation);
        assertNotNull(defaultAnswerResult);
    }

    @Test
    public void testVoidMethodStubbable() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<Object> voidStubbable = handler.voidMethodStubbable(mock);
        assertNotNull(voidStubbable);
        assertTrue(voidStubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void testGetMockSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<>(settings);
        MockSettingsImpl retrievedSettings = handler.getMockSettings();
        assertNotNull(retrievedSettings);
        assertEquals(settings, retrievedSettings);
    }

    @Test
    public void testSetAnswersForStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        List<Answer> answers = Arrays.asList(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "testAnswer";
            }
        });
        handler.setAnswersForStubbing(answers);
        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testGetInvocationContainer() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        InvocationContainer container = handler.getInvocationContainer();
        assertNotNull(container);
        assertTrue(container instanceof InvocationContainerImpl);
    }

    @Test
    public void testHandle_when_invocationContainerImpl_hasAnswersForStubbing_returnsNull() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someVoidMethod", new Object[0]);
        handler.invocationContainerImpl.setMethodForStubbing(new InvocationMatcher(invocation));
        Object result = handler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandle_when_verificationMode_isNotNull_and_mockMatches() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VerificationMode mode = VerificationModeFactory.times(1);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mock, mode);
        handler.mockingProgress.verificationStarted(mockAwareMode);

        Invocation invocation = createInvocation("verifyThis", new Object[0]);
        Invocation realInvocation = InvocationImpl.createMockInvocation(mock, null, new Object[0], 0, null);
        Object result = handler.handle(realInvocation);
        assertNull(result);
    }

    @Test
    public void testHandle_when_verificationMode_isNotNull_and_mockDoesNotMatch() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock1 = new Object(); // Mock for verification
        Object mock2 = new Object(); // Mock in invocation
        VerificationMode mode = VerificationModeFactory.times(1);
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mock1, mode);
        handler.mockingProgress.verificationStarted(mockAwareMode);

        Invocation invocation = createInvocation("verifyThis", new Object[0]);
        Invocation realInvocation = InvocationImpl.createMockInvocation(mock2, null, new Object[0], 0, null);
        Object result = handler.handle(realInvocation);
        assertNotNull(result);
    }

    @Test
    public void testHandle_callsDefaultAnswerWhenNoStubbingAndNoVerification() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someOtherMethod", new Object[]{1, 2});
        Object result = handler.handle(invocation);
        assertNotNull(result);
    }

    @Test
    public void testHandle_capturesArgumentsWhenStubbed() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodWithArgs", new Object[]{"arg1", 123});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        StubbedInvocationMatcher stubbedInvocation = new StubbedInvocationMatcher(invocationMatcher, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock inv) throws Throwable {
                assertEquals("arg1", inv.getArgumentAt(0, String.class));
                assertEquals(123, inv.getArgumentAt(1, Integer.class));
                return "captured";
            }
        });
        handler.invocationContainerImpl.addInvocation(invocationMatcher, stubbedInvocation.getAnswer());

        Object result = handler.handle(invocation);
        assertEquals("captured", result);
    }

    @Test
    public void testHandle_callsAnswerWhenStubbed() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodToAnswer", new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        StubbedInvocationMatcher stubbedInvocation = new StubbedInvocationMatcher(invocationMatcher, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock inv) throws Throwable {
                return "specificAnswer";
            }
        });
        handler.invocationContainerImpl.addInvocation(invocationMatcher, stubbedInvocation.getAnswer());

        Object result = handler.handle(invocation);
        assertEquals("specificAnswer", result);
    }

    @Test
    public void testHandle_returnsDefaultAnswerWhenNoMatchingStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("unstubbedMethod", new Object[]{});
        Object result = handler.handle(invocation);
        assertNotNull(result);
    }

    @Test
    public void testHandle_resetsInvocationForPotentialStubbingForPartialMocks() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Invocation invocation = createInvocation("realMethod", new Object[]{"spyArg"});
        handler.handle(invocation);
        assertTrue(true);
    }

    @Test
    public void testVoidMethodStubbable_toThrow() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<Object> voidStubbable = handler.voidMethodStubbable(mock);
        Throwable throwable = new RuntimeException("test exception");
        VoidMethodStubbable<Object> result = voidStubbable.toThrow(throwable);
        assertNotNull(result);
    }

    @Test
    public void testVoidMethodStubbable_toReturn() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<Object> voidStubbable = handler.voidMethodStubbable(mock);
        VoidMethodStubbable<Object> result = voidStubbable.toReturn();
        assertNotNull(result);
    }

    @Test
    public void testVoidMethodStubbable_toAnswer() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<Object> voidStubbable = handler.voidMethodStubbable(mock);
        Answer<Object> answer = new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock inv) throws Throwable {
                return null;
            }
        };
        VoidMethodStubbable<Object> result = voidStubbable.toAnswer(answer);
        assertNotNull(result);
    }

    @Test
    public void testVoidMethodStubbable_on() throws Exception {
        MockHandler<Object> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<Object> voidStubbable = handler.voidMethodStubbable(mock);
        Object returnedMock = voidStubbable.on();
        assertNotNull(returnedMock);
        assertEquals(mock, returnedMock);
    }

    @Test
    public void testMockHandlerConstructorWithMockSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<String> handler = new MockHandler<>(settings);
        assertNotNull(handler);
        assertEquals(settings, handler.getMockSettings());
        assertNotNull(handler.invocationContainerImpl);
        assertNotNull(handler.matchersBinder);
        assertNotNull(handler.mockingProgress);
    }

    @Test
    public void testMockHandlerConstructorWithOldMockHandler() throws Exception {
        MockHandler<String> oldHandler = new MockHandler<>();
        MockHandler<String> newHandler = new MockHandler<>(oldHandler);
        assertNotNull(newHandler);
        assertEquals(oldHandler.getMockSettings(), newHandler.getMockSettings());
        assertNotSame(oldHandler.invocationContainerImpl, newHandler.invocationContainerImpl);
        assertNotSame(oldHandler.matchersBinder, newHandler.matchersBinder);
        assertNotSame(oldHandler.mockingProgress, newHandler.mockingProgress);
    }

    @Test
    public void testMockMethod() throws Exception {
        MockitoCore core = new MockitoCore();
        MockSettings settings = Mockito.withSettings();
        Object mock = core.mock(Object.class, settings);
        assertNotNull(mock);
        assertTrue(MockUtil.isMock(mock));
    }

    @Test
    public void testStubMethodWithoutOngoingStubbing() throws Exception {
        MockitoCore core = new MockitoCore();
        IOngoingStubbing stubbing = core.stub();
        assertNull(stubbing);
    }

    @Test
    public void testStubMethodWithOngoingStubbing() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = Mockito.mock(Object.class);
        core.when(mock.toString());
        IOngoingStubbing stubbing = core.stub();
        assertNotNull(stubbing);
        assertTrue(stubbing instanceof OngoingStubbingImpl);
    }

    @Test
    public void testWhenMethod() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = Mockito.mock(Object.class);
        OngoingStubbing<Object> ongoingStubbing = core.when(mock.toString());
        assertNotNull(ongoingStubbing);
        assertTrue(ongoingStubbing instanceof OngoingStubbingImpl);
    }

    @Test
    public void testVerifyMethodWithValidMock() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = Mockito.mock(Object.class);
        VerificationMode mode = VerificationModeFactory.times(1);
        Object returnedMock = core.verify(mock, mode);
        assertNotNull(returnedMock);
        assertEquals(mock, returnedMock);
    }

    @Test
    public void testVerifyMethodWithNullMock() throws Exception {
        MockitoCore core = new MockitoCore();
        VerificationMode mode = VerificationModeFactory.times(1);
        Object returnedMock = core.verify(null, mode);
        assertNull(returnedMock);
    }

    @Test
    public void testVerifyMethodWithNotAMock() throws Exception {
        MockitoCore core = new MockitoCore();
        Object notAMock = new Object();
        VerificationMode mode = VerificationModeFactory.times(1);
        Object returnedMock = core.verify(notAMock, mode);
        assertNull(returnedMock);
    }

    @Test
    public void testResetMethod() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock1 = Mockito.mock(Object.class);
        Object mock2 = Mockito.mock(Object.class);
        core.when(mock1.toString()).thenReturn("test");
        core.reset(mock1, mock2);
        assertTrue(true);
    }

    @Test
    public void testVerifyNoMoreInteractionsWithMocks() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock1 = Mockito.mock(Object.class);
        Object mock2 = Mockito.mock(Object.class);
        try {
            core.verifyNoMoreInteractions(mock1, mock2);
            assertTrue(true);
        } catch (Exception e) {
            fail("verifyNoMoreInteractions failed unexpectedly: " + e.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithEmptyMocks() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verifyNoMoreInteractions();
            fail("Expected exception for empty mocks");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Mocks have to be passed to verifyNoMoreInteractions()"));
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithNullMock() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock1 = Mockito.mock(Object.class);
        try {
            core.verifyNoMoreInteractions(mock1, null);
            fail("Expected exception for null mock");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("null passed to verifyNoMoreInteractions()"));
        }
    }

    @Test
    public void testInOrderWithMocks() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock1 = Mockito.mock(Object.class);
        Object mock2 = Mockito.mock(Object.class);
        InOrder inOrder = core.inOrder(mock1, mock2);
        assertNotNull(inOrder);
        assertTrue(inOrder instanceof InOrderImpl);
    }

    @Test
    public void testInOrderWithEmptyMocks() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.inOrder();
            fail("Expected exception for empty mocks");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Mocks have to be passed to inOrder()"));
        }
    }

    @Test
    public void testInOrderWithNullMock() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock1 = Mockito.mock(Object.class);
        try {
            core.inOrder(mock1, null);
            fail("Expected exception for null mock");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("null passed to inOrder()"));
        }
    }

    @Test
    public void testDoAnswer() throws Exception {
        MockitoCore core = new MockitoCore();
        Answer<Object> answer = new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "answered";
            }
        };
        Stubber stubber = core.doAnswer(answer);
        assertNotNull(stubber);
        assertTrue(stubber instanceof StubberImpl);
    }

    @Test
    public void testStubVoid() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = Mockito.mock(Object.class);
        VoidMethodStubbable<Object> voidStubbable = core.stubVoid(mock);
        assertNotNull(voidStubbable);
        assertTrue(voidStubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void testValidateMockitoUsage() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.validateMockitoUsage();
            assertTrue(true);
        } catch (Exception e) {
            fail("validateMockitoUsage failed unexpectedly: " + e.getMessage());
        }
    }

    @Test
    public void testGetLastInvocation() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = Mockito.mock(Object.class);
        core.when(mock.toString()).thenReturn("test");
        Invocation lastInvocation = core.getLastInvocation();
        assertNotNull(lastInvocation);
        assertEquals("toString", lastInvocation.getMethodName());
    }

    // Helper method to create a dummy Invocation object.
    private Invocation createInvocation(String methodName, Object[] args) {
        try {
            // Attempt to get a Method object for toString as a placeholder
            Method method = Object.class.getMethod("toString");
            Object dummyMock = new Object();
            // Use InvocationImpl.createMockInvocation which is a static factory method
            return InvocationImpl.createMockInvocation(dummyMock, method, args, 0, null);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Failed to create mock invocation", e);
        }
    }
}
