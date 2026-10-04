package org.mockito.internal.verification;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class VerificationOverTimeImplTest {
    @Test
    public void testGetPollingPeriodZero() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 10L, null, true, new Timer(10L));
        assertEquals(0L, mode.getPollingPeriod());
    }

    @Test
    public void testGetPollingPeriodPositive() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(7L, 10L, null, true, new Timer(10L));
        assertEquals(7L, mode.getPollingPeriod());
    }

    @Test
    public void testGetPollingPeriodNegative() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(-1L, 10L, null, true, new Timer(10L));
        assertEquals(-1L, mode.getPollingPeriod());
    }

    @Test
    public void testGetDurationZero() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, 0L, null, true, new Timer(0L));
        assertEquals(0L, mode.getDuration());
    }

    @Test
    public void testGetDurationPositive() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, 9L, null, true, new Timer(9L));
        assertEquals(9L, mode.getDuration());
    }

    @Test
    public void testGetDurationNegative() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, -1L, null, true, new Timer(-1L));
        assertEquals(-1L, mode.getDuration());
    }

    @Test
    public void testGetDelegateReturnsSameInstance() throws Exception {
        VerificationMode delegate = new VerificationMode() {
            public void verify(VerificationData data) {
            }
        };
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, 1L, delegate, true, new Timer(1L));
        assertSame(delegate, mode.getDelegate());
    }

    @Test
    public void testGetDelegateMayBeNull() throws Exception {
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, 1L, null, true, new Timer(1L));
        assertEquals(null, mode.getDelegate());
    }

    @Test
    public void testVerifyReturnsWhenDelegateSucceedsAndReturnOnSuccessTrue() throws Exception {
        final int[] calls = {0};
        VerificationMode delegate = new VerificationMode() {
            public void verify(VerificationData data) {
                calls[0]++;
            }
        };
        VerificationData data = null;
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 1L, delegate, true, new Timer(1L));
        mode.verify(data);
        assertEquals(1, calls[0]);
    }

    @Test
    public void testVerifyNullDataPassedToDelegate() throws Exception {
        final VerificationData[] received = {null};
        VerificationMode delegate = new VerificationMode() {
            public void verify(VerificationData data) {
                received[0] = data;
            }
        };
        VerificationData data = null;
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 1L, delegate, true, new Timer(1L));
        mode.verify(data);
        assertSame(data, received[0]);
    }

    @Test
    public void testVerifySuccessfulDelegateWithReturnOnSuccessFalse() throws Exception {
        final int[] calls = {0};
        VerificationMode delegate = new VerificationMode() {
            public void verify(VerificationData data) {
                calls[0]++;
            }
        };
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 0L, delegate, false, new Timer(0L));
        mode.verify(null);
        assertEquals(0, calls[0]);
    }

    @Test
    public void testVerifyAtMostFailureIsPropagated() throws Exception {
        VerificationMode delegate = new AtMost(0);
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 0L, delegate, true, new Timer(0L));
        try {
            mode.verify(null);
            fail("expected failure");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        } catch (MockitoAssertionError expected) {
            assertSame(delegate, mode.getDelegate());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsFailureIsPropagated() throws Exception {
        VerificationMode delegate = new NoMoreInteractions();
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(0L, 0L, delegate, true, new Timer(0L));
        try {
            mode.verify(null);
            fail("expected failure");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        } catch (MockitoAssertionError expected) {
            assertSame(delegate, mode.getDelegate());
        }
    }

    @Test
    public void testVerifyDoesNotInvokeDelegateWhenTimerDoesNotCount() throws Exception {
        final int[] calls = {0};
        VerificationMode delegate = new VerificationMode() {
            public void verify(VerificationData data) {
                calls[0]++;
            }
        };
        VerificationOverTimeImpl mode = new VerificationOverTimeImpl(1L, 1L, delegate, true, new Timer(1L));
        mode.verify(null);
        assertEquals(1, calls[0]);
    }
}
