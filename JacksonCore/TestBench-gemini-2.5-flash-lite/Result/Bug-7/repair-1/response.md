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
        assertEquals("field2", objectCtxt.getCurrentName()); // The name is still accessible until the next fieldName call

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
            super(null); // _source is not used in the logic being tested
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
1. SOURCE CODE ANALYSIS - The tests cover the creation of root and child contexts, state transitions in array and object contexts during `writeFieldName` and `writeValue` calls, and the `toString` and `setCurrentValue` methods. They also test the `DupDetector` integration by mocking its behavior.
2. TEST CASE DESIGN -
- `testCreateRootContext`: Verifies root context creation and initial state.
- `testCreateRootContextWithDupDetector`: Verifies root context creation with a DupDetector.
- `testCreateChildArrayContextFromRoot`: Verifies creation of an array child context.
- `testCreateChildObjectContextFromRoot`: Verifies creation of an object child context.
- `testCreateChildContextReuse`: Verifies that child contexts are reused.
- `testWriteFieldNameBasic`: Tests `writeFieldName` in root context.
- `testWriteFieldNameInObjectContext`: Tests `writeFieldName` in an object context.
- `testWriteFieldNameAfterComma`: Tests `writeFieldName` after a previous field-value pair.
- `testWriteFieldNameExpectNameStatus`: Tests the `STATUS_EXPECT_VALUE` return from `writeFieldName` when a name is already pending.
- `testWriteValueInRootContext`: Tests `writeValue` in root context.
- `testWriteValueInArrayContext`: Tests `writeValue` in array context.
- `testWriteValueInObjectContext`: Tests `writeValue` in object context after a field name.
- `testWriteValueExpectNameStatusInObject`: Tests the `STATUS_EXPECT_NAME` return from `writeValue` when no field name was provided in an object context.
- `testToStringRoot`: Tests `toString` for the root context.
- `testToStringArray`: Tests `toString` for an array context.
- `testToStringObject`: Tests `toString` for an object context.
- `testCurrentValue`: Tests `getCurrentValue` and `setCurrentValue`.
- `testDupDetectorChild`: Tests `DupDetector.child()` behavior.
- `testWriteFieldName_duplicateDetected`: Tests exception handling for duplicate field names.
- `testWriteFieldName_noDuplicateDetected`: Tests normal behavior when no duplicate is detected.
- `testWriteValue_afterMultipleFieldNamesInObject`: Tests `writeValue` after multiple `writeFieldName` calls without `writeValue` in between.
- `testWriteFieldName_afterWriteValue_ObjectContext`: Tests `writeFieldName` after `writeValue` in an object context.
- `testWriteValue_maxIndexInArray`: Tests `writeValue` for a large number of elements in an array.
- `testParentAccess`: Tests the `getParent()` method.
4. DEFECT DETECTION STRATEGY - The tests verify state transitions and return values of `writeFieldName` and `writeValue` in different context types (root, object, array), focusing on edge cases like duplicate field names and sequence of calls.
5. SUMMARY - 24 tests.
6. LIMITATIONS - The `DupDetector` class's internal state and methods like `isDup` are mocked; therefore, tests involving duplicate detection rely on the mock's behavior rather than the actual implementation. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.