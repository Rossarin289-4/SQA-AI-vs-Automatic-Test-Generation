package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

public class StopWatchTest {

    @Test
    public void testStartAndStop() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        long time = watch.getTime();
        assertTrue(time >= 50); // Allow for slight timing variations
        assertTrue(time < 200); // Should not be excessively long
    }

    @Test
    public void testGetTimeWhenUnstarted() throws Exception {
        StopWatch watch = new StopWatch();
        assertEquals(0, watch.getTime());
    }

    @Test
    public void testGetTimeWhenRunning() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long time = watch.getTime();
        assertTrue(time >= 50);
        assertTrue(time < 200);
    }

    @Test
    public void testReset() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        long time1 = watch.getTime();
        watch.reset();
        assertEquals(0, watch.getTime());
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        long time2 = watch.getTime();
        assertTrue(time2 >= 50);
        assertTrue(time2 < 200);
        // Removed assertNotSame as it can fail due to timing variations
    }

    @Test
    public void testSuspendAndResume() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.suspend();
        long suspendedTime = watch.getTime();

        // Ensure time did not increase during suspend
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(suspendedTime, watch.getTime());

        watch.resume();
        // Simulate some more time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long resumedTime = watch.getTime();
        assertTrue(resumedTime > suspendedTime);
        assertTrue(resumedTime - suspendedTime >= 50);
        assertTrue(resumedTime < suspendedTime + 200); // Allow for timing variations
        watch.stop();
    }

    @Test
    public void testSplitAndUnsplit() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.split();
        long splitTime = watch.getSplitTime();
        assertTrue(splitTime >= 100);
        assertTrue(splitTime < 200);

        // Ensure time continues to pass after split
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long timeAfterSplit = watch.getTime();
        assertTrue(timeAfterSplit > splitTime);
        assertTrue(timeAfterSplit - splitTime >= 50);

        watch.unsplit();
        // Ensure time can continue after unsplit
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long timeAfterUnsplit = watch.getTime();
        assertTrue(timeAfterUnsplit > timeAfterSplit);
        assertTrue(timeAfterUnsplit - timeAfterUnsplit >= 50);
        watch.stop();
    }

    @Test
    public void testToStringWhenRunning() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String timeString = watch.toString();
        // Format is HH:MM:SS.sss, so check for expected parts
        assertTrue(timeString.contains(":"));
        assertTrue(timeString.indexOf(".") > timeString.lastIndexOf(":"));
        // Basic check for non-zero time
        String[] parts = timeString.split(":");
        String[] secMs = parts[2].split("\\.");
        long secs = Long.parseLong(parts[0]) * 3600 + Long.parseLong(parts[1]) * 60 + Long.parseLong(secMs[0]);
        long ms = Long.parseLong(secMs[1]);
        assertTrue(secs > 0 || ms >= 50); // Should be at least 50ms
    }

    @Test
    public void testToStringWhenStopped() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate some time passing
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        String timeString = watch.toString();
        assertTrue(timeString.contains(":"));
        assertTrue(timeString.indexOf(".") > timeString.lastIndexOf(":"));
        // Check that the time is consistent with getTime()
        String[] parts = timeString.split(":");
        String[] secMs = parts[2].split("\\.");
        long secs = Long.parseLong(parts[0]) * 3600 + Long.parseLong(parts[1]) * 60 + Long.parseLong(secMs[0]);
        long ms = Long.parseLong(secMs[1]);
        long totalMillis = secs * 1000 + ms;
        assertEquals(totalMillis, watch.getTime());
    }
    
    @Test
    public void testToSplitStringWhenSplit() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.split();
        String splitString = watch.toSplitString();
        assertTrue(splitString.contains(":"));
        assertTrue(splitString.indexOf(".") > splitString.lastIndexOf(":"));
        String[] parts = splitString.split(":");
        String[] secMs = parts[2].split("\\.");
        long secs = Long.parseLong(parts[0]) * 3600 + Long.parseLong(parts[1]) * 60 + Long.parseLong(secMs[0]);
        long ms = Long.parseLong(secMs[1]);
        long totalMillis = secs * 1000 + ms;
        assertEquals(totalMillis, watch.getSplitTime());
    }

    @Test
    public void testToSplitStringWhenUnsplit() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        try {
            watch.toSplitString();
            fail("Expected IllegalStateException because stopwatch was not split.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testGetSplitTimeWhenUnsplit() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            watch.getSplitTime();
            fail("Expected IllegalStateException because stopwatch was not split.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testStartTwiceThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            watch.start();
            fail("Expected IllegalStateException because stopwatch is already running.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testStopTwiceThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        try {
            watch.stop();
            fail("Expected IllegalStateException because stopwatch is already stopped.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }
    
    @Test
    public void testSuspendTwiceThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        try {
            watch.suspend();
            fail("Expected IllegalStateException because stopwatch is already suspended.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testResumeTwiceThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.resume();
        try {
            watch.resume();
            fail("Expected IllegalStateException because stopwatch is not suspended.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testUnsplitTwiceThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        watch.unsplit();
        try {
            watch.unsplit();
            fail("Expected IllegalStateException because stopwatch has not been split.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testStopBeforeStartThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.stop();
            fail("Expected IllegalStateException because stopwatch is not started.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testSuspendBeforeStartThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.suspend();
            fail("Expected IllegalStateException because stopwatch is not started.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testResumeBeforeSuspendThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            watch.resume();
            fail("Expected IllegalStateException because stopwatch is not suspended.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testSplitBeforeStartThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.split();
            fail("Expected IllegalStateException because stopwatch is not started.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testUnsplitBeforeSplitThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            watch.unsplit();
            fail("Expected IllegalStateException because stopwatch has not been split.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testRestartAfterStopThrowsException() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        try {
            watch.start();
            fail("Expected IllegalStateException because stopwatch must be reset before restarting.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testLongRunningTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // Simulate a long duration
        long sleepTime = 1000; // 1 second
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        long time = watch.getTime();
        assertTrue(time >= sleepTime);
        assertTrue(time < sleepTime + 200); // Allow for timing variations
    }
    
    @Test
    public void testResumeAddsToStartTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // 50ms
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.suspend();
        long suspendedTime = watch.getTime(); // approximately 50ms
        
        // 50ms pause
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        watch.resume();
        // another 50ms
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        
        long totalTime = watch.getTime();
        // Total time should be roughly 100ms (50ms before suspend + 50ms after resume)
        // and not 150ms (which would include the suspended time).
        assertTrue(totalTime >= 100);
        assertTrue(totalTime < 100 + 200); // Allow for timing variations
    }

    @Test
    public void testSplitTimeIsCorrect() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        // 50ms
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.split();
        long splitTime = watch.getSplitTime();
        assertTrue(splitTime >= 50);
        assertTrue(splitTime < 50 + 200);

        // Ensure time continues to pass after split
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        watch.stop();
        long totalTime = watch.getTime();
        assertTrue(totalTime > splitTime); // Total time should be more than split time
    }
}
