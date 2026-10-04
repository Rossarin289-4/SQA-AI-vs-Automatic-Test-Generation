```java
package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.*;
import java.util.HashSet;

public class JsonWriteContextTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCreateRootContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertNotNull(root);
        assertEquals(JsonStreamContext.TYPE_ROOT, root.getType());
        assertNull(root.getParent());
        assertEquals(-1, root.getIndex());
        assertNull(root.getCurrentName());
        assertNull(root.getCurrentValue());
    }

    @Test
    public void testCreateRootContextWithDupDetector() throws Exception {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null); // Null generator is fine for constructor
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        assertNotNull(root);
        assertEquals(JsonStreamContext.TYPE_ROOT, root.getType());
        assertNull(root.getParent());
        assertEquals(-1, root.getIndex());
        assertNull(root.getCurrentName());
        assertNull(root.getCurrentValue());
        assertNotNull(root.getDupDetector());
        assertEquals(dd, root.getDupDetector());
    }

    @Test
    public void testCreateChildArrayContextFromRoot() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayCtxt = root.createChildArrayContext();
        assertNotNull(arrayCtxt);
        assertEquals(JsonStreamContext.TYPE_ARRAY, arrayCtxt.getType());
        assertEquals(root, arrayCtxt.getParent());
        assertEquals(-1, arrayCtxt.getIndex());
        assertNull(arrayCtxt.getCurrentName());
        assertNull(arrayCtxt.getCurrentValue());
    }

    @Test
    public void testCreateChildObjectContextFromRoot() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        assertNotNull(objectCtxt);
        assertEquals(JsonStreamContext.TYPE_OBJECT, objectCtxt.getType());
        assertEquals(root, objectCtxt.getParent());
        assertEquals(-1, objectCtxt.getIndex());
        assertNull(objectCtxt.getCurrentName());
        assertNull(objectCtxt.getCurrentValue());
    }

    @Test
    public void testCreateChildContextReuse() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayCtxt1 = root.createChildArrayContext();
        JsonWriteContext arrayCtxt2 = root.createChildArrayContext(); // Reuse
        assertNotNull(arrayCtxt1);
        assertNotNull(arrayCtxt2);
        // Should be the same instance due to reuse
        assertSame(arrayCtxt1, arrayCtxt2);
        assertEquals(JsonStreamContext.TYPE_ARRAY, arrayCtxt2.getType());
        assertEquals(root, arrayCtxt2.getParent());
        assertEquals(-1, arrayCtxt2.getIndex()); // Reset state
    }

    @Test
    public void testWriteFieldNameBasic() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, root.writeFieldName("test"));
        assertEquals("test", root.getCurrentName());
        // _gotName is set to true by writeFieldName and reset by writeValue
        assertTrue(root._gotName);
        assertEquals(-1, root.getIndex()); // _index increments on writeValue
    }

    @Test
    public void testWriteFieldNameInObjectContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, objectCtxt.writeFieldName("first"));
        assertEquals("first", objectCtxt.getCurrentName());
        assertTrue(objectCtxt._gotName);
        assertEquals(-1, objectCtxt.getIndex()); // _index increments on writeValue
    }

    @Test
    public void testWriteFieldNameAfterComma() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        objectCtxt.writeFieldName("first");
        objectCtxt.writeValue(); // Consumes the name, increments index
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, objectCtxt.writeFieldName("second"));
        assertEquals("second", objectCtxt.getCurrentName());
        assertTrue(objectCtxt._gotName);
        assertEquals(0, objectCtxt.getIndex());
    }

    @Test
    public void testWriteFieldNameExpectNameStatus() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        // Write first field name, then call writeFieldName again without writeValue
        objectCtxt.writeFieldName("name1");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, objectCtxt.writeFieldName("name2"));
        assertEquals("name1", objectCtxt.getCurrentName()); // Current name is still the first one
        assertTrue(objectCtxt._gotName); // _gotName remains true until writeValue is called
        assertEquals(-1, objectCtxt.getIndex()); // Index not incremented yet
    }

    @Test
    public void testWriteValueInRootContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, root.writeValue());
        assertEquals(0, root.getIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());
        assertEquals(1, root.getIndex());
    }

    @Test
    public void testWriteValueInArrayContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayCtxt = root.createChildArrayContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, arrayCtxt.writeValue());
        assertEquals(0, arrayCtxt.getIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, arrayCtxt.writeValue());
        assertEquals(1, arrayCtxt.getIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, arrayCtxt.writeValue());
        assertEquals(2, arrayCtxt.getIndex());
    }

    @Test
    public void testWriteValueInObjectContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        objectCtxt.writeFieldName("key1"); // Sets _gotName = true
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, objectCtxt.writeValue()); // Consumes name
        assertEquals(0, objectCtxt.getIndex());
        assertFalse(objectCtxt._gotName); // _gotName is reset by writeValue
        assertEquals("key1", objectCtxt.getCurrentName()); // Name is still available until next field name

        objectCtxt.writeFieldName("key2");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, objectCtxt.writeValue());
        assertEquals(1, objectCtxt.getIndex());
        assertFalse(objectCtxt._gotName);
    }

    @Test
    public void testWriteValueExpectNameStatusInObject() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        // writeValue called before writeFieldName in an object context
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, objectCtxt.writeValue());
        assertEquals(-1, objectCtxt.getIndex());
    }

    @Test
    public void testToStringRoot() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertEquals("/", root.toString());
        root.writeValue(); // Index 0
        assertEquals("/", root.toString()); // toString doesn't show index directly
    }

    @Test
    public void testToStringArray() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayCtxt = root.createChildArrayContext();
        assertEquals("[", arrayCtxt.toString());
        arrayCtxt.writeValue(); // Index 0
        assertEquals("[0]", arrayCtxt.toString());
        arrayCtxt.writeValue(); // Index 1
        assertEquals("[1]", arrayCtxt.toString());
    }

    @Test
    public void testToStringObject() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        assertEquals("{", objectCtxt.toString());
        objectCtxt.writeFieldName("name1");
        // toString() uses _currentName if _gotName is true (before writeValue)
        assertEquals("{?}", objectCtxt.toString());
        objectCtxt.writeValue(); // Consumes name, index 0
        assertEquals("{0}", objectCtxt.toString());
        objectCtxt.writeFieldName("name2");
        // toString() uses _currentName if _gotName is true (before writeValue)
        assertEquals("{\"name2\"}", objectCtxt.toString());
        objectCtxt.writeValue(); // Consumes name, index 1
        assertEquals("{1}", objectCtxt.toString());
    }

    @Test
    public void testCurrentValue() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        Object testValue = new Object();
        assertNull(root.getCurrentValue());
        root.setCurrentValue(testValue);
        assertEquals(testValue, root.getCurrentValue());
    }

    @Test
    public void testDupDetectorChild() throws Exception {
        DupDetector rootDD = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(rootDD);
        JsonWriteContext childCtxt = root.createChildArrayContext();
        assertNotNull(childCtxt.getDupDetector());
        assertNotSame(rootDD, childCtxt.getDupDetector());
    }

    // Test for exception when duplicate field is detected
    @Test
    public void testWriteFieldName_duplicateDetected() throws Exception {
        DupDetector rootDD = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(rootDD);
        JsonWriteContext objectCtxt = root.createChildObjectContext();

        // Using a mock that simulates duplicate detection
        DupDetector mockDD = new MockDupDetector(true); // Simulate duplicate found
        objectCtxt = objectCtxt.withDupDetector(mockDD);

        objectCtxt.writeFieldName("field1"); // First call, no exception
        try {
            objectCtxt.writeFieldName("field1"); // Second call with same name, should throw
            fail("Expected JsonGenerationException for duplicate field");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Duplicate field"));
        }
    }

    // Test for no exception when no duplicate field is detected
    @Test
    public void testWriteFieldName_noDuplicateDetected() throws Exception {
        DupDetector rootDD = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(rootDD);
        JsonWriteContext objectCtxt = root.createChildObjectContext();

        DupDetector mockDD = new MockDupDetector(false); // Simulate no duplicate
        objectCtxt = objectCtxt.withDupDetector(mockDD);

        // Should not throw an exception
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, objectCtxt.writeFieldName("uniqueName"));
        assertEquals("uniqueName", objectCtxt.getCurrentName());
    }

    @Test
    public void testWriteValue_afterMultipleFieldNamesInObject() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();

        objectCtxt.writeFieldName("field1"); // _gotName = true, _currentName = "field1"
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, objectCtxt.writeFieldName("field2")); // _gotName = true, _currentName = "field2"

        // Now call writeValue() for the last set field name "field2"
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, objectCtxt.writeValue()); // Consumes "field2", _gotName = false, _index = 0
        assertEquals(0, objectCtxt.getIndex());
        assertFalse(objectCtxt._gotName);
        assertEquals("field2", objectCtxt.getCurrentName()); // The name is still accessible until the next field name call

        // Call writeValue() again. This is invalid as _gotName is false and no field name was written for the second value.
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, objectCtxt.writeValue()); // Expects a name for the next value
    }

    @Test
    public void testWriteFieldName_afterWriteValue_ObjectContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();

        objectCtxt.writeFieldName("field1");
        objectCtxt.writeValue(); // Consumes name, increments index
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, objectCtxt.writeFieldName("field2")); // Status OK_AFTER_COMMA
        assertEquals("field2", objectCtxt.getCurrentName());
        assertTrue(objectCtxt._gotName); // writeFieldName sets _gotName to true
        assertEquals(0, objectCtxt.getIndex());
    }

    @Test
    public void testWriteValue_maxIndexInArray() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayCtxt = root.createChildArrayContext();
        // Simulate writing many values to reach a large index
        int maxIterations = 1000; // Choose a reasonable number that won't hit integer limits but tests loop
        for (int i = 0; i < maxIterations; ++i) {
            arrayCtxt.writeValue();
        }
        assertEquals(maxIterations - 1, arrayCtxt.getIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, arrayCtxt.writeValue());
        assertEquals(maxIterations, arrayCtxt.getIndex());
    }

    @Test
    public void testParentAccess() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objectCtxt = root.createChildObjectContext();
        JsonWriteContext arrayCtxt = objectCtxt.createChildArrayContext();

        assertNull(root.getParent());
        assertEquals(root, objectCtxt.getParent());
        assertEquals(objectCtxt, arrayCtxt.getParent());
    }

    // Mock DupDetector to simulate isDup behavior for testing
    private static class MockDupDetector extends DupDetector {
        private final boolean _shouldBeDup;
        private String _checkedName;

        public MockDupDetector(boolean shouldBeDup) {
            // The constructor for DupDetector requires an Object for _source.
            // Since we are mocking and not using features that rely on _source,
            // we can pass null. The actual DupDetector methods like isDup don't
            // use _source directly for this specific mock's purpose.
            super(null);
            _shouldBeDup = shouldBeDup;
        }

        @Override
        public boolean isDup(String name) {
            _checkedName = name; // Store the name for verification if needed
            return _shouldBeDup;
        }

        @Override
        public void reset() {
            // No-op for this mock
        }

        @Override
        public DupDetector child() {
            // For simplicity, return a new mock, assuming it will have the same behavior.
            return new MockDupDetector(_shouldBeDup);
        }
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover the creation of root and child contexts, state changes for object and array contexts when writing field names and values, and the `toString()` representation. Specifically, `createRootContext`, `createChildArrayContext`, `createChildObjectContext`, `writeFieldName`, `writeValue`, `getCurrentName`, `getIndex`, `getParent`, `getCurrentValue`, `setCurrentValue`, `getDupDetector`, and `toString` methods are exercised.
2. TEST CASE DESIGN - Tests cover creation of root and child contexts with and without DupDetectors. Field name writing in object contexts and value writing in root, array, and object contexts are tested for their status codes and index/name updates. `toString` is tested for different context types. Current value setting and getting are also verified. DupDetector interaction is tested using a mock.
4. DEFECT DETECTION STRATEGY - The tests verify the state transitions and return values of `writeFieldName` and `writeValue` methods across different context types (root, object, array), ensuring correct handling of sequence, field names, and indices.
5. SUMMARY - 24 tests.
6. LIMITATIONS - The tests do not cover edge cases related to extremely large numbers of nested contexts or field names that might approach string length limits, as those are not explicitly suggested by the provided API or source code. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.