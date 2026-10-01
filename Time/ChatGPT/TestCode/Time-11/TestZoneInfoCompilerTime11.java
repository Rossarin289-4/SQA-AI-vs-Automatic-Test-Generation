package org.joda.time.tz;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestZoneInfoCompilerTime11 {
    @Test
    public void testVerboseDefaultsToFalse() {
        assertFalse(ZoneInfoCompiler.cVerbose.get());
    }
}