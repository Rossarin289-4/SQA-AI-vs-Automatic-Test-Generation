package org.jfree.data.junit;

import junit.framework.TestCase;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;

public class Chart18GeminiTest extends TestCase {

    public Chart18GeminiTest(String name) {
        super(name);
    }

    public void testRemoveValueUnknownKey() {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("Key1", new Double(1.0));

        try {
            values.removeValue("UnknownKey");
            fail("removeValue(UnknownKey) should throw UnknownKeyException");
        } catch (UnknownKeyException e) {
            // Expected behavior in fixed version
        }
    }
}
