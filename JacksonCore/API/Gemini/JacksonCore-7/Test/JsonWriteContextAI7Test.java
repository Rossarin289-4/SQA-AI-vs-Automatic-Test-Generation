package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

public class JsonWriteContextAI7Test {

    @Test
    public void testRootContextCreationAndBasics() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        Assert.assertNotNull(root);
        Assert.assertTrue(root.inRoot());
        Assert.assertFalse(root.inArray());
        Assert.assertFalse(root.inObject());
        Assert.assertNull(root.getParent());
        Assert.assertNull(root.getCurrentName());
        Assert.assertNull(root.getDupDetector());
    }

    @Test
    public void testRootContextWriteValueStatus() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        
        // First value in root
        int status1 = root.writeValue();
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        Assert.assertEquals(0, root.getCurrentIndex());

        // Second value in root (requires space)
        int status2 = root.writeValue();
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status2);
        Assert.assertEquals(1, root.getCurrentIndex());
    }

    @Test
    public void testArrayContextWriteValues() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arrayContext = root.createChildArrayContext();

        Assert.assertNotNull(arrayContext);
        Assert.assertTrue(arrayContext.inArray());
        Assert.assertFalse(arrayContext.inObject());
        Assert.assertSame(root, arrayContext.getParent());

        // First array value
        int status1 = arrayContext.writeValue();
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        Assert.assertEquals(0, arrayContext.getCurrentIndex());

        // Subsequent array value (after comma)
        int status2 = arrayContext.writeValue();
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status2);
        Assert.assertEquals(1, arrayContext.getCurrentIndex());
    }

    @Test
    public void testObjectContextFieldAndValueWorkflow() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext objContext = root.createChildObjectContext();

        Assert.assertNotNull(objContext);
        Assert.assertTrue(objContext.inObject());
        Assert.assertFalse(objContext.inArray());
        Assert.assertSame(root, objContext.getParent());

        // Writing value before field name should expect name
        Assert.assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, objContext.writeValue());

        // Write field name
        int nameStatus = objContext.writeFieldName("testKey");
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, nameStatus);
        Assert.assertEquals("testKey", objContext.getCurrentName());

        // Trying to write another field name without value should expect value
        int duplicateNameStatus = objContext.writeFieldName("anotherKey");
        Assert.assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, duplicateNameStatus);

        // Write value for the first field name
        int valStatus = objContext.writeValue();
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, valStatus);
        Assert.assertEquals(0, objContext.getCurrentIndex());
        Assert.assertEquals("testKey", objContext.getCurrentName());
    }

    @Test
    public void testObjectContextMultipleFields() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext objContext = root.createChildObjectContext();

        // First field & value
        objContext.writeFieldName("key1");
        objContext.writeValue();

        // Second field (should be OK after comma/entry)
        int secondNameStatus = objContext.writeFieldName("key2");
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, secondNameStatus);
        Assert.assertEquals("key2", objContext.getCurrentName());

        objContext.writeValue();
        Assert.assertEquals(1, objContext.getCurrentIndex());
    }

    @Test
    public void testChildContextReuse() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext child1 = root.createChildArrayContext();
        Assert.assertNotNull(child1);
        
        JsonWriteContext child2 = root.createChildArrayContext();
        Assert.assertNotNull(child2);
    }

    @Test
    public void testCurrentValueGetAndSet() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        Assert.assertNull(root.getCurrentValue());

        Object testVal = "customValueObject";
        root.setCurrentValue(testVal);
        Assert.assertSame(testVal, root.getCurrentValue());
    }

    @Test
    public void testToStringFormatting() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        Assert.assertEquals("/", root.toString());

        JsonWriteContext arrayContext = root.createChildArrayContext();
        Assert.assertTrue(arrayContext.toString().startsWith("["));

        JsonWriteContext objContext = root.createChildObjectContext();
        Assert.assertEquals("{?}", objContext.toString());

        objContext.writeFieldName("hello");
        Assert.assertEquals("{\"hello\"}", objContext.toString());
    }
}
