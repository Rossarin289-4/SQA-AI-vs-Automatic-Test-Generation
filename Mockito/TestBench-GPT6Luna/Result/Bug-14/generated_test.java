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

public class MockHandlerTest {
    @Test
    public void testGetMockSettingsReturnsConfiguredSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testInvocationContainerIsAvailable() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testInvocationContainerIsStable() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        assertSame(handler.getInvocationContainer(), handler.getInvocationContainer());
    }

    @Test
    public void testSetEmptyAnswersForStubbing() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        handler.setAnswersForStubbing(Arrays.<Answer>asList());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testResetStubbingAnswersWithEmptyList() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        handler.setAnswersForStubbing(Arrays.<Answer>asList());
        handler.setAnswersForStubbing(Arrays.<Answer>asList());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testNoAnswerListHasZeroEntries() throws Exception {
        List<Answer> answers = Arrays.<Answer>asList();
        assertEquals(0, answers.size());
    }

    @Test
    public void testSettingsReferenceRemainsSameAfterContainerAccess() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        handler.getInvocationContainer();
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testHandlerUsesSuppliedSettingsObject() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertEquals(settings, handler.getMockSettings());
    }

    @Test
    public void testEmptyAnswerListHasNoFirstElement() throws Exception {
        List<Answer> answers = Arrays.<Answer>asList();
        assertEquals(0, answers.size());
    }

    @Test
    public void testEmptyListLengthBoundary() throws Exception {
        List<Answer> answers = Arrays.<Answer>asList();
        assertTrue(answers.isEmpty());
    }

    @Test
    public void testTwoEmptyListsHaveSameSize() throws Exception {
        List<Answer> first = Arrays.<Answer>asList();
        List<Answer> second = Arrays.<Answer>asList();
        assertEquals(first.size(), second.size());
    }

    @Test
    public void testHandlerContainerIsNotNullAfterEmptyStubbingSetup() throws Exception {
        MockHandler<Object> handler = new MockHandler<Object>(new MockSettingsImpl());
        handler.setAnswersForStubbing(Arrays.<Answer>asList());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testMockCreatesMockAndVerifiesNoInteractionsInitially() throws Exception {
        MockitoCore core = new MockitoCore();
        Object mock = core.mock(Object.class, new MockSettingsImpl());
        assertNotNull(mock);
        core.verifyNoMoreInteractions(mock);
    }

    @Test
    public void testVerifyRejectsNullMock() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verify(null, null);
            fail("expected exception");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInOrderRejectsEmptyMockList() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.inOrder();
            fail("expected exception");
        } catch (RuntimeException exception) {
            assertNotNull(exception);
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsRejectsEmptyMockList() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verifyNoMoreInteractions();
            fail("expected exception");
        } catch (RuntimeException exception) {
            assertNotNull(exception);
        }
    }

    @Test
    public void testResetAcceptsEmptyMockArray() throws Exception {
        MockitoCore core = new MockitoCore();
        core.validateMockitoUsage();
        core.reset();
        assertTrue(true);
    }

    @Test
    public void testValidateMockitoUsageAcceptsCleanProgress() throws Exception {
        MockitoCore core = new MockitoCore();
        core.validateMockitoUsage();
        assertTrue(true);
    }

    @Test
    public void testDoAnswerReturnsStubber() throws Exception {
        MockitoCore core = new MockitoCore();
        Stubber stubber = core.doAnswer(null);
        assertNotNull(stubber);
    }

    @Test
    public void testVerifyNoMoreInteractionsRejectsPlainObject() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verifyNoMoreInteractions(new Object());
            fail("expected exception");
        } catch (NotAMockException expected) {
            assertNotNull(expected);
        }
    }
}
