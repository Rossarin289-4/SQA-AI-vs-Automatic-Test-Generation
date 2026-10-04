package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.Reporter;
import java.lang.reflect.Field;

public class TimerTest {

    // Helper method to get private field value using reflection
    private Object getPrivateField(Object obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    // Helper method to set private field value using reflection
    private void setPrivateField(Object obj, String fieldName, Object value) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    // Test a Timer with a positive duration.
    @Test
    public void testPositiveDurationTimerIsCounting() throws Exception {
        Timer timer = new Timer(1000); // 1 second
        timer.start();
        // After starting, it should be counting.
        assertTrue(timer.isCounting());
    }

    // Test a Timer with zero duration.
    @Test
    public void testZeroDurationTimerIsCounting() throws Exception {
        Timer timer = new Timer(0); // 0 seconds
        timer.start();
        // isCounting checks System.currentTimeMillis() - startTime <= durationMillis.
        // If duration is 0, it will be true if System.currentTimeMillis() == startTime.
        // This is likely to be true immediately after start().
        assertTrue(timer.isCounting());
    }

    // Test that a Timer with negative duration throws an exception during construction.
    @Test
    public void testNegativeDurationTimerThrowsException() throws Exception {
        try {
            new Timer(-100);
            fail("expected Reporter.cannotCreateTimerWithNegativeDurationTime");
        } catch (Exception e) {
            // The Reporter throws an exception, which is not specified as a specific type in API outline.
            // Catching generic Exception is acceptable here.
        }
    }

    // Test that isCounting() is false after the duration has passed.
    @Test
    public void testIsCountingIsFalseAfterDuration() throws Exception {
        Timer timer = new Timer(50); // 50 milliseconds
        timer.start();
        // Wait for a duration slightly longer than the timer's duration.
        // This test relies on actual time passing, which is not ideal but necessary given the lack of mocking.
        // Using a very small duration and waiting a bit more.
        Thread.sleep(60); // Slightly more than 50ms
        assertFalse(timer.isCounting());
    }

    // Test start() method updates startTime.
    @Test
    public void testStartUpdatesStartTime() throws Exception {
        Timer timer = new Timer(1000);
        long initialStartTime = (long) getPrivateField(timer, "startTime");
        timer.start();
        long newStartTime = (long) getPrivateField(timer, "startTime");
        // startTime should have been updated to a value close to current time.
        // Since start() calls System.currentTimeMillis(), the new start time should be greater than -1.
        assertTrue(newStartTime > initialStartTime); // This asserts it has changed from -1 to a positive value.
        assertTrue(newStartTime > 0); // This asserts it's a valid timestamp.
    }

    // Test isCounting() with a very small duration.
    @Test
    public void testSmallDurationTimerIsCounting() throws Exception {
        Timer timer = new Timer(1); // 1 millisecond
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test isCounting() with a duration that is exactly met.
    @Test
    public void testDurationExactlyMet() throws Exception {
        // This tests the boundary condition where System.currentTimeMillis() - startTime == durationMillis.
        // For duration 0, it should be true immediately.
        Timer timer = new Timer(0);
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test Timer with maximum possible long value for duration.
    @Test
    public void testMaxDurationTimer() throws Exception {
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();
        // It should be counting as Long.MAX_VALUE is a valid positive duration.
        assertTrue(timer.isCounting());
    }

    // Test that start() can be called multiple times.
    @Test
    public void testStartMultipleTimes() throws Exception {
        Timer timer = new Timer(100);
        timer.start();
        long firstStartTime = (long) getPrivateField(timer, "startTime");
        // Small delay to ensure System.currentTimeMillis() advances, needed for assertion.
        Thread.sleep(10); 
        timer.start();
        long secondStartTime = (long) getPrivateField(timer, "startTime");
        assertTrue(secondStartTime > firstStartTime); // startTime should be reset to a later time
        assertTrue(timer.isCounting()); // Should still be counting if duration hasn't passed
    }

    // Test isCounting() after a long time has passed.
    @Test
    public void testIsCountingAfterLongTime() throws Exception {
        Timer timer = new Timer(10); // Very short duration
        timer.start();
        // Wait for a significantly longer period.
        Thread.sleep(100); // Much longer than 10ms
        assertFalse(timer.isCounting());
    }

    // Test isCounting() with a duration of 1 and start called.
    @Test
    public void testIsCountingWithDurationOne() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test that isCounting() returns false if start was called but duration is 0 and time has passed.
    @Test
    public void testZeroDurationTimerAfterSomeTime() throws Exception {
        Timer timer = new Timer(0);
        timer.start();
        Thread.sleep(1); // wait for 1 ms
        assertFalse(timer.isCounting());
    }

    // Test the constructor with a minimal positive duration.
    @Test
    public void testMinimalPositiveDuration() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test that the timer stops counting when exactly the duration has passed.
    // This is tricky to test precisely due to system clock granularity, but we can check behavior
    // right at the start of the duration.
    @Test
    public void testTimerAtExactDurationBoundary() throws Exception {
        Timer timer = new Timer(10); // 10 ms duration
        timer.start();
        // We can't guarantee System.currentTimeMillis() will be exactly 'durationMillis' after start,
        // but we can assert it's still counting immediately after start.
        assertTrue(timer.isCounting());
    }
    
    // Test that the timer stops counting slightly after the duration.
    @Test
    public void testTimerSlightlyAfterDuration() throws Exception {
        Timer timer = new Timer(20); // 20 ms duration
        timer.start();
        // Wait a bit more than the duration
        Thread.sleep(25); 
        assertFalse(timer.isCounting());
    }

    // Test isCounting() with a duration that is close to zero but positive.
    @Test
    public void testNearZeroPositiveDuration() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test that start() can be called with a very small duration and it still counts.
    @Test
    public void testStartWithVerySmallDuration() throws Exception {
        Timer timer = new Timer(1);
        timer.start();
        assertTrue(timer.isCounting());
    }

    // Test that isCounting() is false if start() has not been called and duration is positive.
    @Test
    public void testIsCountingBeforeStart() throws Exception {
        Timer timer = new Timer(1000);
        // The assertion in isCounting() handles the case where startTime is -1.
        // This test specifically checks if that assertion is triggered correctly.
        try {
            timer.isCounting();
            fail("expected AssertionError");
        } catch (AssertionError e) {
            // The assertion error is expected because startTime is -1.
            assertTrue(e.getMessage().contains("startTime = -1"));
        }
    }
}
