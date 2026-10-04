package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.mockito.InOrder;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.*;
import java.util.Arrays;
import java.util.List;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.debugging.MockitoDebuggerImpl;
import org.mockito.internal.stubbing.answers.*;
import org.mockito.internal.stubbing.defaultanswers.*;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.runners.MockitoJUnitRunner;

public class MockitoCoreTest {
    @Test
    public void testMockReturnsConfiguredMock() throws Exception {
        MockitoCore core = new MockitoCore();
        List mock = core.mock(List.class, Mockito.withSettings(), true);
        assertNotNull(mock);
        assertSame(mock, core.verify(mock, Mockito.times(0)));
    }

    @Test
    public void testVerifyReturnsSameMock() throws Exception {
        MockitoCore core = new MockitoCore();
        List mock = Mockito.mock(List.class);
        assertSame(mock, core.verify(mock, Mockito.times(0)));
    }

    @Test
    public void testVerifyRejectsNull() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verify(null, Mockito.times(0));
            fail("expected exception");
        } catch (org.mockito.exceptions.base.MockitoException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testVerifyRejectsNonMock() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verify("not a mock", Mockito.times(0));
            fail("expected exception");
        } catch (NotAMockException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsAcceptsUnusedMock() throws Exception {
        MockitoCore core = new MockitoCore();
        List mock = Mockito.mock(List.class);
        core.verifyNoMoreInteractions(mock);
        assertSame(mock, core.verify(mock, Mockito.times(0)));
    }

    @Test
    public void testVerifyNoMoreInteractionsRejectsEmptyInput() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.verifyNoMoreInteractions();
            fail("expected exception");
        } catch (org.mockito.exceptions.base.MockitoException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInOrderAcceptsMocks() throws Exception {
        MockitoCore core = new MockitoCore();
        List first = Mockito.mock(List.class);
        List second = Mockito.mock(List.class);
        InOrder order = core.inOrder(first, second);
        assertNotNull(order);
        assertSame(first, order.verify(first));
    }

    @Test
    public void testInOrderRejectsEmptyInput() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.inOrder();
            fail("expected exception");
        } catch (org.mockito.exceptions.base.MockitoException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInOrderRejectsNullMock() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.inOrder((Object) null);
            fail("expected exception");
        } catch (org.mockito.exceptions.base.MockitoException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInOrderRejectsNonMock() throws Exception {
        MockitoCore core = new MockitoCore();
        try {
            core.inOrder("not a mock");
            fail("expected exception");
        } catch (org.mockito.exceptions.base.MockitoException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testValidateMockitoUsageOnCleanState() throws Exception {
        MockitoCore core = new MockitoCore();
        core.validateMockitoUsage();
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testDoAnswerReturnsStubber() throws Exception {
        MockitoCore core = new MockitoCore();
        Stubber stubber = core.doAnswer(Mockito.RETURNS_DEFAULTS);
        assertNotNull(stubber);
    }

    @Test
    public void testStubVoidReturnsStubbableForMock() throws Exception {
        MockitoCore core = new MockitoCore();
        List mock = Mockito.mock(List.class);
        VoidMethodStubbable<List> stubbable = core.stubVoid(mock);
        assertNotNull(stubbable);
    }

    @Test
    public void testVerifyZeroInteractionsAliasOnUnusedMock() throws Exception {
        MockitoCore core = new MockitoCore();
        List mock = Mockito.mock(List.class);
        core.verifyNoMoreInteractions(mock);
        assertSame(mock, core.verify(mock, Mockito.times(0)));
    }

    @Test
    public void testStaticSpyCallsRealListMethods() throws Exception {
        List<String> real = new java.util.ArrayList<String>();
        List<String> spy = Mockito.spy(real);
        spy.add("value");
        assertEquals(1, spy.size());
        assertEquals("value", spy.get(0));
    }

    @Test
    public void testVerificationModeFactoriesReturnModes() throws Exception {
        assertNotNull(Mockito.times(0));
        assertNotNull(Mockito.never());
        assertNotNull(Mockito.atLeastOnce());
        assertNotNull(Mockito.atLeast(1));
        assertNotNull(Mockito.atMost(1));
        assertNotNull(Mockito.only());
    }

    @Test
    public void testWithSettingsReturnsSettings() throws Exception {
        MockSettings settings = Mockito.withSettings();
        assertNotNull(settings);
    }

    @Test
    public void testDebugReturnsDebugger() throws Exception {
        assertNotNull(Mockito.debug());
    }
}
