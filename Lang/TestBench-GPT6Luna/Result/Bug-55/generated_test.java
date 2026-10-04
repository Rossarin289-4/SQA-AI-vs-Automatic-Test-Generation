package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

public class StopWatchTest {
    @Test
    public void testNewWatchHasZeroTime() throws Exception {
        StopWatch watch = new StopWatch();
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testNewWatchStringIsZeroDuration() throws Exception {
        StopWatch watch = new StopWatch();
        assertEquals("0:00:00.000", watch.toString());
    }

    @Test
    public void testStartThenStopHasNonnegativeTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testStopBeforeStartThrows() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.stop();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testStartTwiceThrows() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            watch.start();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        watch.stop();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testRestartAfterStopRequiresReset() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        try {
            watch.start();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testResetClearsStoppedWatch() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.reset();
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testResetAllowsRestart() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.reset();
        watch.start();
        watch.stop();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testSplitTimeIsAvailableAfterSplit() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        assertTrue(watch.getSplitTime() >= 0L);
    }

    @Test
    public void testSplitStringMatchesFormattedSplitTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        assertEquals(DurationFormatUtils.formatDurationHMS(watch.getSplitTime()),
                watch.toSplitString());
    }

    @Test
    public void testSplitOutsideRunningThrows() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.split();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testUnsplitClearsSplitAvailability() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        watch.unsplit();
        try {
            watch.getSplitTime();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        watch.stop();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testUnsplitWithoutSplitThrows() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.unsplit();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testSuspendTimeIsAvailable() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testStopWhileSuspendedKeepsSuspendedTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        long suspendedTime = watch.getTime();
        watch.stop();
        assertEquals(suspendedTime, watch.getTime());
    }

    @Test
    public void testResumeAfterSuspendCanStop() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.resume();
        watch.stop();
        assertTrue(watch.getTime() >= 0L);
    }

    @Test
    public void testResumeWithoutSuspendThrows() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.resume();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testSuspendWhenNotRunningThrows() throws Exception {
        StopWatch watch = new StopWatch();
        try {
            watch.suspend();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testStoppedStringFormatsTime() throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        assertEquals(DurationFormatUtils.formatDurationHMS(watch.getTime()), watch.toString());
    }
}
