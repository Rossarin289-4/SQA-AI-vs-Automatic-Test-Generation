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

public class MockHandlerTest {
    @Test
    public void testSettingsReturnedByIdentity() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testContainerReturnedByIdentity() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertSame(handler.getInvocationContainer(), handler.getInvocationContainer());
    }

    @Test
    public void testVoidMethodStubbableCreated() throws Exception {
        Object mock = new Object();
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mock);
        assertSame(mock, stubbable.on());
    }

    @Test
    public void testSetEmptyAnswersForStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        handler.setAnswersForStubbing(java.util.Collections.<Answer>emptyList());
        assertTrue(handler.getInvocationContainer().getInvocations().isEmpty());
    }

    @Test
    public void testSetSingleAnswerForStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        Answer answer = new Answer() {
            public Object answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        java.util.List<Answer> answers = java.util.Collections.singletonList(answer);
        handler.setAnswersForStubbing(answers);
        assertTrue(handler.getInvocationContainer().getInvocations().isEmpty());
    }

    @Test
    public void testInitialInvocationContainerIsEmpty() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertEquals(0, handler.getInvocationContainer().getInvocations().size());
    }

    @Test
    public void testInitialStubbedInvocationListIsEmpty() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertEquals(0, handler.getInvocationContainer().getStubbedInvocations().size());
    }

    @Test
    public void testVoidStubbableOnReturnsSameMock() throws Exception {
        Object mock = new Object();
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertSame(mock, handler.voidMethodStubbable(mock).on());
    }

    @Test
    public void testSettingsStableAcrossCalls() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertSame(handler.getMockSettings(), handler.getMockSettings());
    }

    @Test
    public void testContainerInvocationListStableWhenEmpty() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        InvocationContainer container = handler.getInvocationContainer();
        assertEquals(0, container.getInvocations().size());
        assertEquals(0, container.getInvocations().size());
    }

    @Test
    public void testContainerStubbedListStableWhenEmpty() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        InvocationContainer container = handler.getInvocationContainer();
        assertEquals(0, container.getStubbedInvocations().size());
        assertEquals(0, container.getStubbedInvocations().size());
    }

    @Test
    public void testEmptyAnswerListDoesNotAddStubs() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        handler.setAnswersForStubbing(java.util.Collections.<Answer>emptyList());
        assertEquals(0, handler.getInvocationContainer().getStubbedInvocations().size());
    }
}
