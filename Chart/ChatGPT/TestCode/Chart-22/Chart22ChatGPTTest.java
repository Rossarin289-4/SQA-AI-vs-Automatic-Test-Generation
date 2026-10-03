package org.jfree.data.junit;

import junit.framework.TestCase;
import org.jfree.data.KeyedObjects2D;

public class Chart22ChatGPTTest extends TestCase {
    public void testMissingCellInKnownColumnReturnsNull() {
        KeyedObjects2D d = new KeyedObjects2D();
        d.addObject("x", "R1", "C1");
        d.addObject("y", "R2", "C2");
        assertNull(d.getObject("R1", "C2"));
    }
}
