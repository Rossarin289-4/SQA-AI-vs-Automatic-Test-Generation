package org.jfree.data.junit;

import junit.framework.TestCase;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;

public class Chart18ChatGPTTest extends TestCase {
    public void testRemovingLastValueRebuildsIndex() {
        DefaultKeyedValues v = new DefaultKeyedValues();
        v.addValue("A", 1.0); v.addValue("B", 2.0);
        v.removeValue(1);
        assertEquals(-1, v.getIndex("B"));
    }
    public void testUnknownKeyRemovalThrows() {
        DefaultKeyedValues v = new DefaultKeyedValues();
        try { v.removeValue("missing"); fail("Expected UnknownKeyException"); }
        catch (UnknownKeyException expected) { }
    }
}
