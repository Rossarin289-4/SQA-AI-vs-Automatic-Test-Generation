package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.Reporter;

public class TimerTest {
    @Test
    public void zeroDurationCountsImmediatelyAfterStart() throws Exception {
        Timer timer = new Timer(0);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void oneMillisecondDurationCountsImmediatelyAfterStart() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void longDurationCountsImmediatelyAfterStart() throws Exception {
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void startingAgainResetsTheCountdown() throws Exception {
        Timer timer = new Timer(0);
        timer.start();
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void negativeDurationIsRejected() throws Exception {
        try {
            new Timer(-1);
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void smallestLongNegativeDurationIsRejected() throws Exception {
        try {
            new Timer(Long.MIN_VALUE);
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void maximumLongDurationIsAccepted() throws Exception {
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void minimumNonnegativeDurationIsAccepted() throws Exception {
        Timer timer = new Timer(0);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void zeroDurationCanBeRestarted() throws Exception {
        Timer timer = new Timer(0);
        timer.start();
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void oneMillisecondDurationCanBeRestarted() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void largeDurationCountsImmediatelyAfterStart() throws Exception {
        Timer timer = new Timer(1000000);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void durationOfTwoCountsImmediatelyAfterStart() throws Exception {
        Timer timer = new Timer(2);
        timer.start();
        assertTrue(timer.isCounting());
    }
}
