package org.jfree.data.xy.junit;

import junit.framework.TestCase;
import org.jfree.data.xy.XYSeries;

public class Chart5ChatGPTTest extends TestCase {
    public void testAddOrUpdateAddsDuplicateWhenDuplicatesAllowed() {
        XYSeries s = new XYSeries("S", true, true);
        s.add(1.0, 10.0);
        assertNull(s.addOrUpdate(1.0, 20.0));
        assertEquals(2, s.getItemCount());
    }
}
