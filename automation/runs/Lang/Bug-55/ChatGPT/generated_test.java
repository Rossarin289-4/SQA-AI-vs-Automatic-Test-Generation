package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StopWatchLang55Test {

    @Test
    public void testStopAfterSuspendKeepsSuspendedTime() throws Exception {
        StopWatch watch = new StopWatch();

        watch.start();
        Thread.sleep(60);
        watch.suspend();

        long timeAfterSuspend = watch.getTime();

        Thread.sleep(120);
        watch.stop();

        long timeAfterStop = watch.getTime();

        assertEquals(timeAfterSuspend, timeAfterStop);
    }

    @Test
    public void testLongerSuspensionIsExcludedWhenStopping() throws Exception {
        StopWatch watch = new StopWatch();

        watch.start();
        Thread.sleep(80);
        watch.suspend();

        long suspendedTime = watch.getTime();

        Thread.sleep(200);
        watch.stop();

        assertEquals(suspendedTime, watch.getTime());
    }

    @Test
    public void testStopAfterResumeAndSecondSuspendKeepsFinalSuspendedTime()
            throws Exception {
        StopWatch watch = new StopWatch();

        watch.start();
        Thread.sleep(60);
        watch.suspend();

        Thread.sleep(100);
        watch.resume();

        Thread.sleep(70);
        watch.suspend();

        long timeAfterFinalSuspend = watch.getTime();

        Thread.sleep(150);
        watch.stop();

        assertEquals(timeAfterFinalSuspend, watch.getTime());
    }

    @Test
    public void testNormalRunningStopStillRecordsElapsedTime()
            throws Exception {
        StopWatch watch = new StopWatch();

        watch.start();
        Thread.sleep(100);
        watch.stop();

        assertTrue(watch.getTime() >= 50);
    }

    @Test
    public void testStopBeforeStartIsRejected() {
        StopWatch watch = new StopWatch();

        try {
            watch.stop();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testStopAfterAlreadyStoppedIsRejected()
            throws Exception {
        StopWatch watch = new StopWatch();

        watch.start();
        Thread.sleep(50);
        watch.stop();

        try {
            watch.stop();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }
}
