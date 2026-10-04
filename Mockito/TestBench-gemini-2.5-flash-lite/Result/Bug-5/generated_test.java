package org.mockito.internal.verification;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;
import org.mockito.internal.invocation.InvocationMatcher; // Added import
import org.mockito.internal.stubbing.InvocationContainerImpl; // Added import
import java.util.Collections;
import java.util.List;
import java.util.ArrayList; // Added import

// Mock classes to satisfy the compiler
class MockInvocation implements Invocation {
}

class MockInvocationMatcher implements InvocationMatcher {


}

class MockVerificationData implements VerificationData {
    private final InvocationMatcher wanted;


}

class ControlledVerificationMode implements VerificationMode {
    private boolean succeedOnNextCall = false;
    private AssertionError lastError;
    private int callCount = 0;
    private final int successCallIndex;
    private final AssertionError errorToThrow;

    public ControlledVerificationMode(boolean initiallySucceed, int successCallIndex, AssertionError errorToThrow) {
        this.succeedOnNextCall = initiallySucceed;
        this.successCallIndex = successCallIndex;
        this.errorToThrow = errorToThrow;
    }

    @Override
    public void verify(VerificationData data) {
        callCount++;
        if (callCount == successCallIndex) {
            succeedOnNextCall = true;
        }
        if (!succeedOnNextCall) {
            lastError = (errorToThrow != null) ? errorToThrow : new MockitoAssertionError("Controlled failure");
            throw lastError;
        }
    }

    public int getCallCount() { return callCount; }
    public AssertionError getLastError() { return lastError; }
}

public class VerificationOverTimeImplTest {

    @Test
    public void testConstructorWithTimer() throws Exception {
        Timer timer = new Timer(1000);
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true, timer);
        assertNotNull(verification);
        assertEquals(100L, verification.getPollingPeriod());
        assertEquals(1000L, verification.getDuration());
        assertSame(delegate, verification.getDelegate());
    }

    @Test
    public void testConstructorWithoutTimer() throws Exception {
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(100, 1000, delegate, true);
        assertNotNull(verification);
        assertEquals(100L, verification.getPollingPeriod());
        assertEquals(1000L, verification.getDuration());
        assertSame(delegate, verification.getDelegate());
    }







    @Test
    public void testGettersReturnCorrectValues() throws Exception {
        VerificationMode delegate = new ControlledVerificationMode(true, 1, null);
        VerificationOverTimeImpl verification = new VerificationOverTimeImpl(123, 4567, delegate, true);
        assertEquals(123L, verification.getPollingPeriod());
        assertEquals(4567L, verification.getDuration());
        assertSame(delegate, verification.getDelegate());
    }











}



