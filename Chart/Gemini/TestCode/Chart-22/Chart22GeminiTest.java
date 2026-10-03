package org.jfree.data.junit;

import junit.framework.TestCase;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;

public class Chart22GeminiTest extends TestCase {

    public Chart22GeminiTest(String name) {
        super(name);
    }

    public void testGetObjectRowMissingColumn() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.addObject("Val1", "R1", "C1");
        data.addObject("Val2", "R2", "C2");

        try {
            // "C2" is a valid column key in the table, but row "R1" does not contain "C2"
            Object result = data.getObject("R1", "C2");
            assertNull(result);
        } catch (UnknownKeyException e) {
            fail("getObject(\"R1\", \"C2\") threw UnknownKeyException: " + e.getMessage());
        }
    }
}
