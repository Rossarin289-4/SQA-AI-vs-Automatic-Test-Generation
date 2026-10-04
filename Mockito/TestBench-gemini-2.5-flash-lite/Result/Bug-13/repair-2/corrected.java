package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.LinkedList;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

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
import org.mockito.invocation.InvocationOnMock;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.stubbing.OngoingStubbing;
import org.mockito.internal.util.collections.ListUtil; // Added import for ListUtil

public class MockHandlerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testHandleInvocationWhenStubbingVoid() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        MockingProgress mockingProgress = new ThreadSafeMockingProgress();
        handler.mockingProgress = mockingProgress; // Direct access for test setup

        // Simulate stubbing a void method
        handler.invocationContainerImpl.setAnswersForStubbing(new LinkedList<>());
        Invocation dummyInvocation = createInvocation("voidMethod");
        
        InvocationMatcher invocationMatcher = new MatchersBinder().bindMatchers(mockingProgress.getArgumentMatcherStorage(), dummyInvocation);
        mockingProgress.getArgumentMatcherStorage().add(invocationMatcher); // Add to storage to be bound
        handler.invocationContainerImpl.setMethodForStubbing(invocationMatcher);

        handler.handle(dummyInvocation);

        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testHandleInvocationWhenVerificationModeIsNotNullAndSameMock() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        MockingProgress mockingProgress = new ThreadSafeMockingProgress();
        handler.mockingProgress = mockingProgress;

        Object mock = new Object();
        VerificationMode verificationMode = new MockAwareVerificationMode(mock, null); // null mode to avoid null pointer in verify
        mockingProgress.verificationStarted(verificationMode);

        Invocation invocation = createInvocation("someMethod", mock);
        
        handler.mockingProgress.pullVerificationMode(); 

        try {
            handler.handle(invocation);
        } catch (Exception e) {
            fail("Should not throw exception when verification mode matches the mock.");
        }
    }

    @Test
    public void testHandleInvocationWhenVerificationModeIsNotNullAndDifferentMock() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        MockingProgress mockingProgress = new ThreadSafeMockingProgress();
        handler.mockingProgress = mockingProgress;

        Object differentMock = new Object();
        VerificationMode verificationMode = new MockAwareVerificationMode(differentMock, null);
        mockingProgress.verificationStarted(verificationMode);

        Object currentMock = new Object();
        Invocation invocation = createInvocation("someMethod", currentMock);
        
        handler.mockingProgress.pullVerificationMode(); 

        handler.handle(invocation);
    }

    @Test
    public void testHandleInvocationWithStubbedAnswer() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodWithAnswer");
        
        // Set up a stubbed answer
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        handler.invocationContainerImpl.setMethodForStubbing(invocationMatcher); // Set method for stubbing first
        handler.invocationContainerImpl.setAnswersForStubbing(List.of(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                return "stubbed";
            }
        }));
        
        Object result = handler.handle(invocation);
        assertEquals("stubbed", result);
    }

    @Test
    public void testHandleInvocationWithDefaultAnswer() throws Exception {
        MockHandler<Integer> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodReturningInt");
        
        // The default answer for Integer should return 0
        Object result = handler.handle(invocation);
        assertEquals(0, result);
    }
    
    @Test
    public void testVoidMethodStubbable() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<String> stubbable = handler.voidMethodStubbable(mock);
        assertNotNull(stubbable);
    }

    @Test
    public void testGetMockSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<String> handler = new MockHandler<>(settings);
        MockSettingsImpl returnedSettings = handler.getMockSettings();
        assertNotNull(returnedSettings);
        assertSame(settings, returnedSettings);
    }

    @Test
    public void testSetAnswersForStubbing() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        List<Answer> answers = new LinkedList<>();
        answers.add(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                return "test";
            }
        });
        handler.setAnswersForStubbing(answers);
        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testGetInvocationContainer() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        InvocationContainer container = handler.getInvocationContainer();
        assertNotNull(container);
        assertTrue(container instanceof InvocationContainerImpl);
    }

    @Test
    public void testHandleInvocationWithAnswerReturningNull() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodReturningNull");
        
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        handler.invocationContainerImpl.setMethodForStubbing(invocationMatcher); // Set method for stubbing first
        handler.invocationContainerImpl.setAnswersForStubbing(List.of(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                return null;
            }
        }));
        
        Object result = handler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleInvocationWithAnswerThrowingException() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodThrowingException");
        
        Exception expectedException = new RuntimeException("test exception");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        handler.invocationContainerImpl.setMethodForStubbing(invocationMatcher); // Set method for stubbing first
        handler.invocationContainerImpl.setAnswersForStubbing(List.of(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                throw expectedException;
            }
        }));
        
        try {
            handler.handle(invocation);
            fail("Should have thrown an exception.");
        } catch (Exception e) {
            assertSame(expectedException, e);
        }
    }

    @Test
    public void testHandleInvocationWhenNoAnswerIsSet() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodWithoutAnswer");
        
        // No answers set, should fall through to default answer
        Object result = handler.handle(invocation);
        assertNull(result); // Default answer for String is null
    }

    @Test
    public void testMockHandlerConstructorWithMockSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<String> handler = new MockHandler<>(settings);
        assertNotNull(handler.invocationContainerImpl);
        assertNotNull(handler.matchersBinder);
        assertNotNull(handler.mockingProgress);
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testMockHandlerConstructorWithOldMockHandler() throws Exception {
        MockHandlerInterface<String> oldHandler = new MockHandler<>(new MockSettingsImpl());
        MockHandler<String> newHandler = new MockHandler<>(oldHandler);
        assertNotNull(newHandler.invocationContainerImpl);
        assertNotNull(newHandler.matchersBinder);
        assertNotNull(newHandler.mockingProgress);
        assertNotSame(oldHandler.getMockSettings(), newHandler.getMockSettings()); // Should be a new instance
    }

    @Test
    public void testVoidMethodStubbableToThrow() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<String> stubbable = handler.voidMethodStubbable(mock);
        
        Exception toThrow = new IllegalArgumentException("test");
        stubbable.toThrow(toThrow);
    }

    @Test
    public void testVoidMethodStubbableToReturn() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<String> stubbable = handler.voidMethodStubbable(mock);
        
        stubbable.toReturn(); // Should not throw an exception
    }

    @Test
    public void testVoidMethodStubbableToAnswer() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Object mock = new Object();
        VoidMethodStubbable<String> stubbable = handler.voidMethodStubbable(mock);
        
        Answer<Void> answer = new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                return null;
            }
        };
        stubbable.toAnswer(answer); // Should not throw an exception
    }
    
    @Test
    public void testOngoingStubbingThenAnswer() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodForStubbing");
        handler.invocationContainerImpl.setInvocationForPotentialStubbing(new InvocationMatcher(invocation));
        
        OngoingStubbingImpl<String> ongoingStubbing = new OngoingStubbingImpl<>(handler.invocationContainerImpl);
        handler.mockingProgress.reportOngoingStubbing(ongoingStubbing);

        Answer<String> answer = new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                return "thenAnswered";
            }
        };
        ongoingStubbing.thenAnswer(answer);

        handler.handle(invocation);

        InvocationContainer container = handler.getInvocationContainer();
        StubbedInvocationMatcher stubbed = null;
        for (StubbedInvocationMatcher s : container.getStubbedInvocations()) {
            if (s.matches(invocation)) {
                stubbed = s;
                break;
            }
        }
        assertNotNull("Stubbed invocation not found", stubbed);
        assertEquals("thenAnswered", stubbed.answer(invocation));
    }

    @Test
    public void testOngoingStubbingToAnswer() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("methodForStubbingToAnswer");
        handler.invocationContainerImpl.setInvocationForPotentialStubbing(new InvocationMatcher(invocation));
        
        OngoingStubbingImpl<String> ongoingStubbing = new OngoingStubbingImpl<>(handler.invocationContainerImpl);
        handler.mockingProgress.reportOngoingStubbing(ongoingStubbing);

        Answer<String> answer = new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable {
                return "toAnswered";
            }
        };
        ongoingStubbing.toAnswer(answer);

        handler.handle(invocation);

        InvocationContainer container = handler.getInvocationContainer();
        StubbedInvocationMatcher stubbed = null;
        for (StubbedInvocationMatcher s : container.getStubbedInvocations()) {
            if (s.matches(invocation)) {
                stubbed = s;
                break;
            }
        }
        assertNotNull("Stubbed invocation not found", stubbed);
        assertEquals("toAnswered", stubbed.answer(invocation));
    }
    
    @Test
    public void testInvocationContainerGetInvocations() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someMethod");
        handler.invocationContainerImpl.setInvocationForPotentialStubbing(new InvocationMatcher(invocation));
        
        List<Invocation> invocations = handler.getInvocationContainer().getInvocations();
        assertNotNull(invocations);
        assertEquals(1, invocations.size());
        assertSame(invocation, invocations.get(0));
    }

    @Test
    public void testInvocationContainerGetStubbedInvocations() throws Exception {
        MockHandler<String> handler = new MockHandler<>();
        Invocation invocation = createInvocation("someMethod");
        
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        handler.invocationContainerImpl.setMethodForStubbing(invocationMatcher);
        handler.invocationContainerImpl.setAnswersForStubbing(List.of(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock inv) throws Throwable { return "stubbed"; }
        }));

        List<StubbedInvocationMatcher> stubbedInvocations = handler.getInvocationContainer().getStubbedInvocations();
        assertNotNull(stubbedInvocations);
        assertEquals(1, stubbedInvocations.size());
        assertNotNull(stubbedInvocations.get(0));
    }

    @Test
    public void testMockAwareVerificationModeGetMock() throws Exception {
        Object mock = new Object();
        VerificationMode delegateMode = null;
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mock, delegateMode);
        
        assertSame(mock, mockAwareMode.getMock());
    }

    @Test
    public void testVerificationDataImplGetAllInvocations() throws Exception {
        InvocationContainer container = new InvocationContainerImpl(new ThreadSafeMockingProgress());
        Invocation invocation = createInvocation("testMethod");
        // Need to add invocation to container to be retrieved by VerificationDataImpl
        handler.invocationContainerImpl.setInvocationForPotentialStubbing(new InvocationMatcher(invocation));
        
        InvocationMatcher wanted = new InvocationMatcher(createInvocation("wantedMethod"));
        VerificationDataImpl data = new VerificationDataImpl(container, wanted);
        
        List<Invocation> invocations = data.getAllInvocations();
        assertNotNull(invocations);
        assertEquals(1, invocations.size());
        assertSame(invocation, invocations.get(0));
    }

    @Test
    public void testVerificationDataImplGetWanted() throws Exception {
        InvocationContainer container = new InvocationContainerImpl(new ThreadSafeMockingProgress());
        InvocationMatcher wanted = new InvocationMatcher(createInvocation("wantedMethod"));
        VerificationDataImpl data = new VerificationDataImpl(container, wanted);
        
        assertSame(wanted, data.getWanted());
    }

    // Helper method to create a mock Invocation object for testing
    private Invocation createInvocation(String methodName) {
        return createInvocation(methodName, new Object()); // Use a default mock object
    }

    private Invocation createInvocation(String methodName, Object mock) {
        MockitoMethod mockitoMethod = new MockitoMethod() {
            @Override
            public String getName() {
                return methodName;
            }
            @Override
            public Class<?>[] getParameterTypes() { return new Class<?>[]{}; }
            @Override
            public Class<?> getReturnType() { return Object.class; }
            @Override
            public Class<?> getDeclaringClass() { return Object.class; }
            @Override
            public boolean isVarArgs() { return false; }
            @Override
            public Annotation[][] getParameterAnnotations() { return new Annotation[0][0]; }
            @Override
            public Annotation[] getDeclaredAnnotations() { return new Annotation[0]; }
            @Override
            public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { return false; }
            @Override
            public Object invoke(Object obj, Object... args) throws Throwable { return null; }
            @Override
            public boolean isBridge() { return false; }
            @Override
            public boolean isSynthetic() { return false; }
            @Override
            public int getModifiers() { return 0; }
            @Override
            public String getSignature() { return methodName; }
            @Override
            public Method getJavaMethod() { return null;}
        };

        return new Invocation(mock, mockitoMethod, new Object[]{}, 0, null) {};
    }
}
