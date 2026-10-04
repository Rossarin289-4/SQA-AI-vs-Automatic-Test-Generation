package org.mockito.internal.verification;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;
import java.util.Collections;
import java.util.List;
import java.lang.reflect.Method; // Added for potential use if needed, but not directly used due to restrictions

// Dummy interfaces and classes to satisfy the compiler for testing purposes
// These are necessary because the provided API outline only contains declarations, not implementations.
// We need to provide minimal implementations to instantiate and use them.

// Mock Invocation interface
interface Invocation {
    boolean isVerified();
    void markVerified();
    boolean isMethod();
    String toString();
    boolean hasNoMoreInteractions();
    String getName();
    boolean isSubInvocation(Object... args); // Corrected method name to avoid compilation error
    Object getMock();
    Object callRealMethod() throws Throwable;
    String getMethodName();
    Object[] getArguments();
    int getSequenceNumber();
    boolean isFromVarArguments();
    boolean equals(Object o);
    int hashCode();
}

// Mock InvocationMatcher interface
interface InvocationMatcher {
    void verify(VerificationData data);
    boolean matches(Invocation invocation);
    InvocationMatcher clone();
    String toString();
    List<Object> getCurrentArguments();
    boolean hasSimilarMethod(Invocation invocation);
    void appendStub(StringBuilder builder);
    InvocationMatcher withVerifiedResult(Object result);
}

// Mock VerificationData interface
interface VerificationData {
    List<Invocation> getAllInvocations();
    InvocationMatcher getWanted();
}

public class VerificationOverTimeImplTest {

    // Dummy implementations for interfaces and abstract classes for testing purposes
    private static class MockVerificationData implements VerificationData {
        private final List<Invocation> invocations;
        private final InvocationMatcher wanted;

        public MockVerificationData(List<Invocation> invocations, InvocationMatcher wanted) {
            this.invocations = invocations;
            this.wanted = wanted;
        }

        @Override
        public List<Invocation> getAllInvocations() {
            return invocations;
        }

        @Override
        public InvocationMatcher getWanted() {
            return wanted;
        }
    }

    private static class MockInvocationMatcher implements InvocationMatcher {
        private final Invocation invocation;

        public MockInvocationMatcher(Invocation invocation) {
            this.invocation = invocation;
        }

        @Override
        public void verify(VerificationData data) {
            // Default implementation that always passes unless overridden
        }

        @Override
        public boolean matches(Invocation invocation) {
            return this.invocation == invocation;
        }

        @Override
        public InvocationMatcher clone() {
            return this;
        }

        @Override
        public String toString() {
            return "MockInvocationMatcher";
        }

        @Override
        public List<Object> getCurrentArguments() {
            return Collections.emptyList();
        }

        @Override
        public boolean hasSimilarMethod(Invocation invocation) {
            return false;
        }

        @Override
        public void appendStub(StringBuilder builder) {
        }

        @Override
        public InvocationMatcher withVerifiedResult(Object result) {
            return this;
        }
    }

    private static class MockInvocation implements Invocation {
        @Override
        public boolean isVerified() {
            return false;
        }

        @Override
        public void markVerified() {
        }

        @Override
        public boolean isMethod() {
            return false;
        }

        @Override
        public String toString() {
            return "MockInvocation";
        }

        @Override
        public boolean hasNoMoreInteractions() {
            return false;
        }

        @Override
        public String getName() {
            return "mockMethod";
        }

        @Override
        public boolean isSubInvocation(Object... args) { // Corrected method name
            return false;
        }

        @Override
        public Object getMock() {
            return null;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }

        @Override
        public String getMethodName() {
            return "mockMethod";
        }

        @Override
        public Object[] getArguments() {
            return new Object[0];
        }

        @Override
        public int getSequenceNumber() {
            return 0;
        }

        @Override
        public boolean isFromVarArguments() {
            return false;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    // Mock VerificationMode that can be controlled to succeed or fail
    private static class ControlledVerificationMode implements VerificationMode {
        private boolean shouldSucceed;
        private AssertionError lastAssertionError;
        private int callCount = 0;
        private final int successCallIndex;
        private final AssertionError errorToThrow;

        public ControlledVerificationMode(boolean shouldSucceed, int successCallIndex, AssertionError errorToThrow) {
            this.shouldSucceed = shouldSucceed;
            this.successCallIndex = successCallIndex;
            this.errorToThrow = errorToThrow;
        }

        @Override
        public void verify(VerificationData data) {
            callCount++;
            if (callCount == successCallIndex) {
                shouldSucceed = true;
            }
            if (!shouldSucceed) {
                lastAssertionError = (errorToThrow != null) ? errorToThrow : new MockitoAssertionError("Controlled failure");
                throw lastAssertionError;
            }
            // If shouldSucceed is true, do nothing (pass)
        }

        public int getCallCount() {
            return callCount;
        }

        public AssertionError getLastAssertionError() {
            return lastAssertionError;
        }
    }

    @Test
    public void testConstructorWithTimer() throws Exception {
        Timer timer = new Timer(1000);
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true, timer);

        assertNotNull(verification);
        assertEquals(100, verification.getPollingPeriod());
        assertEquals(1000, verification.getDuration());
        assertEquals(delegate, verification.getDelegate());
    }

    @Test
    public void testConstructorWithoutTimer() throws Exception {
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true);

        assertNotNull(verification);
        assertEquals(100, verification.getPollingPeriod());
        assertEquals(1000, verification.getDuration());
        assertEquals(delegate, verification.getDelegate());
    }

    @Test
    public void testVerifyReturnsImmediatelyWhenDelegateSucceedsAndReturnOnSuccessIsTrue() throws Exception {
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        verification.verify(data);

        assertEquals(1, ((ControlledVerificationMode) delegate).getCallCount());
    }

    @Test
    public void testVerifyWaitsUntilDurationWhenDelegateSucceedsAndReturnOnSuccessIsFalse() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(true, 3, null); // Succeeds on 3rd call
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        verification.verify(data);
        long endTime = System.currentTimeMillis();

        assertTrue(endTime - startTime >= 200); // Should wait for at least 2 polling periods
        assertEquals(3, delegate.getCallCount());
    }

    @Test
    public void testVerifyThrowsExceptionWhenDelegateNeverSucceedsAndReturnOnSuccessIsTrue() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 100, null); // Never succeeds
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 500, delegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected
            assertTrue(e.getMessage().contains("Controlled failure"));
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 500); // Should wait for duration
        // Calculate expected call count more robustly for edge cases of duration/pollingPeriod
        int expectedCalls = (int) Math.ceil((double) 500 / 100) + 1;
        assertEquals(expectedCalls, delegate.getCallCount());
    }

    @Test
    public void testVerifyThrowsExceptionWhenDelegateNeverSucceedsAndReturnOnSuccessIsFalse() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 100, null); // Never succeeds
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 500, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected
            assertTrue(e.getMessage().contains("Controlled failure"));
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 500); // Should wait for duration
        int expectedCalls = (int) Math.ceil((double) 500 / 100) + 1;
        assertEquals(expectedCalls, delegate.getCallCount());
    }

    @Test
    public void testVerifyThrowsDelegateExceptionWhenNotRecoverableAndReturnOnSuccessIsTrue() throws Exception {
        AssertionError specificError = new MockitoAssertionError("Specific failure");
        // Mocking AtMost to simulate non-recoverable delegate
        VerificationMode nonRecoverableDelegate = new AtMost(0) {
            @Override
            public void verify(VerificationData vd) {
                throw specificError;
            }
        };
        VerificationOverTimeImpl verificationNonRecoverable = new VerificationOverTimeImpl(100, 500, nonRecoverableDelegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verificationNonRecoverable.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (AssertionError e) {
            assertSame(specificError, e);
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 100); // Should throw immediately
    }

    @Test
    public void testVerifyThrowsDelegateExceptionWhenNotRecoverableAndReturnOnSuccessIsFalse() throws Exception {
        AssertionError specificError = new MockitoAssertionError("Specific failure");
        // Mocking AtMost to simulate non-recoverable delegate
        VerificationMode nonRecoverableDelegate = new AtMost(0) {
            @Override
            public void verify(VerificationData vd) {
                throw specificError;
            }
        };
        VerificationOverTimeImpl verificationNonRecoverable = new VerificationOverTimeImpl(100, 500, nonRecoverableDelegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verificationNonRecoverable.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (AssertionError e) {
            assertSame(specificError, e);
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 100); // Should throw immediately
    }

    @Test
    public void testGettersReturnCorrectValues() throws Exception {
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(123, 4567, delegate, true);

        assertEquals(123L, verification.getPollingPeriod());
        assertEquals(4567L, verification.getDuration());
        assertSame(delegate, verification.getDelegate());
    }

    @Test
    public void testPollingPeriodZero() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 2, null); // Succeeds on 2nd call
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(0, 1000, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        verification.verify(data);
        long endTime = System.currentTimeMillis();

        // With 0 polling period, it should check as fast as possible.
        // The loop will run until timer expires.
        assertTrue(endTime - startTime >= 0);
        assertTrue(endTime - startTime < 50); // Should be very quick, but not instantaneous due to thread scheduling
        // If pollingPeriod is 0, it will poll as many times as possible within duration.
        // A more precise assertion would involve checking if it polled significantly.
        assertTrue(delegate.getCallCount() > 10); // Expect multiple calls if polling is very fast
    }

    @Test
    public void testDurationZero() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(true, 1, null); // Succeeds immediately
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 0, delegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        verification.verify(data);
        long endTime = System.currentTimeMillis();

        // Timer with duration 0 will immediately be counting as false if start() is called first.
        // The while loop condition `timer.isCounting()` will be false.
        // The behavior here depends on Timer implementation, assuming start() sets some internal state.
        // If duration is 0, isCounting() should be false right away.
        // The verify method's loop `while(timer.isCounting())` will not execute.
        // It should immediately check delegate once.
        assertEquals(1, delegate.getCallCount());
        assertTrue(endTime - startTime < 10); // Should be very quick
    }

    @Test
    public void testDelegateFailsThenSucceedsWithReturnOnSuccessTrue() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 3, null); // Fails twice, succeeds on 3rd
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        verification.verify(data); // Should return early on 3rd call
        long endTime = System.currentTimeMillis();

        assertEquals(3, delegate.getCallCount());
        assertTrue(endTime - startTime >= 200); // Should wait for 2 polling periods
        assertTrue(endTime - startTime < 1000);  // Should not wait for full duration
    }

    @Test
    public void testDelegateFailsThenSucceedsWithReturnOnSuccessFalse() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 3, null); // Fails twice, succeeds on 3rd
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        verification.verify(data); // Should wait for full duration even after delegate succeeds
        long endTime = System.currentTimeMillis();

        assertEquals(3, delegate.getCallCount());
        assertTrue(endTime - startTime >= 1000); // Should wait for full duration
    }

    @Test
    public void testVeryShortDurationWithReturnOnSuccessTrue() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, null); // Needs many calls to succeed
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(50, 100, delegate, true); // Short duration
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 100); // Should wait for duration
    }

    @Test
    public void testVeryShortDurationWithReturnOnSuccessFalse() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, null); // Needs many calls to succeed
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(50, 100, delegate, false); // Short duration
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 100); // Should wait for duration
    }

    @Test
    public void testLongPollingPeriod() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(500, 1000, delegate, false); // Long polling period
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 1000); // Should wait for duration
        // Calculate expected calls: durationMillis / pollingPeriodMillis, plus one for the initial check.
        int expectedCalls = (1000 / 500) + 1;
        assertEquals(expectedCalls, delegate.getCallCount());
    }

    @Test
    public void testWithNoMoreInteractionsDelegate() throws Exception {
        // NoMoreInteractions is also not recoverable
        VerificationMode nonRecoverableDelegate = new NoMoreInteractions() {
            @Override
            public void verify(VerificationData vd) {
                throw new MockitoAssertionError("No more interactions failed");
            }
        };
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 500, nonRecoverableDelegate, true);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("No more interactions failed"));
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 100); // Should throw immediately
    }

    @Test
    public void testInterruptedExceptionDuringSleep() throws Exception {
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, null); // Never succeeds
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(1000, 5000, delegate, false) {
            // Override sleep to throw InterruptedException
            @Override
            protected void sleep(long sleep) {
                Thread.currentThread().interrupt();
            }
        };
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // Expected, as the timer will eventually expire and throw
            assertTrue(e.getMessage().contains("Controlled failure"));
        }
        long endTime = System.currentTimeMillis();
        // Even though sleep is interrupted, the timer will continue to count.
        // The loop will eventually terminate when timer.isCounting() returns false.
        assertTrue(endTime - startTime >= 5000); // Should still wait for duration
    }

    @Test
    public void testDelegateAssertionErrorCaught() throws Exception {
        AssertionError delegateError = new AssertionError("Delegate specific error");
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, delegateError);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            assertSame(delegateError, e);
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 1000); // Should wait for duration
        int expectedCalls = (int) Math.ceil((double) 1000 / 100) + 1;
        assertEquals(expectedCalls, delegate.getCallCount());
    }

    @Test
    public void testDelegateMockitoAssertionErrorCaught() throws Exception {
        MockitoAssertionError delegateError = new MockitoAssertionError("Delegate specific Mockito error");
        ControlledVerificationMode delegate = new ControlledVerificationMode(false, 10, delegateError);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, false);
        VerificationData data = new MockVerificationData(Collections.emptyList(), new MockInvocationMatcher(new MockInvocation()));

        long startTime = System.currentTimeMillis();
        try {
            verification.verify(data);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertSame(delegateError, e);
        }
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime >= 1000); // Should wait for duration
        int expectedCalls = (int) Math.ceil((double) 1000 / 100) + 1;
        assertEquals(expectedCalls, delegate.getCallCount());
    }
}
