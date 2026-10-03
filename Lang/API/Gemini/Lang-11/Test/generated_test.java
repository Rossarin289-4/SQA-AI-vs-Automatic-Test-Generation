package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomStringUtilsTestCustom {

    @Test(expected = IllegalArgumentException.class)
    public void testRandomRangeEndLessThanStart() {
        RandomStringUtils.random(5, 10, 5, false, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomRangeEndEqualsStart() {
        RandomStringUtils.random(5, 5, 5, false, false);
    }

    @Test
    public void testRandomValidRange() {
        String result = RandomStringUtils.random(5, 65, 90, true, false);
        assertNotNull(result);
        assertEquals(5, result.length());
    }
}
