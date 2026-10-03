package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Independent test suite for Defects4J Lang-55.
 * Tests StopWatch behavior when stopping a suspended stopwatch.
 */
public class StopWatchTest_Lang55 {

    @Test
    public void testStopAfterSuspendPreservesSuspensionTime() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        
        // Let some time pass while running
        Thread.sleep(50);
        
        watch.suspend();
        long timeAtSuspend = watch.getTime();
        
        // Let more time pass while suspended (this extra time should NOT be counted)
        Thread.sleep(100);
        
        // Stop the watch after it has been suspended
        watch.stop();
        
        long finalTime = watch.getTime();
        
        // In the fixed version, stop() does not overwrite stopTime if already suspended,
        // so finalTime should match the time when it was suspended.
        // In the buggy version, stop() overwrites stopTime with current time, making finalTime much larger.
        assertTrue("Stop time after suspend should not exceed suspension duration plus small delta",
                finalTime >= timeAtSuspend && finalTime < timeAtSuspend + 80);
    }

    @Test
    public void testSuspendResumeAndStopSequence() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(30);
        
        watch.suspend();
        Thread.sleep(50);
        
        watch.resume();
        Thread.sleep(30);
        
        watch.stop();
        long totalTime = watch.getTime();
        
        // Total active time should be approximately 30ms + 30ms = 60ms, excluding the 50ms suspension.
        // The buggy version corrupts stopTime when stop() is called if state is suspended (though here it ended running).
        // This test ensures normal resume->stop paths work correctly alongside suspension logic.
        assertTrue("Total active time should reflect running periods only", totalTime >= 50 && totalTime < 150);
    }
}
