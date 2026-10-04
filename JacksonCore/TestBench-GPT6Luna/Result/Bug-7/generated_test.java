package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.*;

public class JsonWriteContextTest {
    @Test
    public void testRootCreationAndInitialState() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertEquals("/", root.toString());
        assertEquals(0, root.getCurrentIndex());
        assertNull(root.getCurrentName());
    }

    @Test
    public void testRootValues() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, root.writeValue());
        assertEquals(0, root.getCurrentIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());
        assertEquals(1, root.getCurrentIndex());
    }

    @Test
    public void testRootContinuesAfterFirstValue() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        root.writeValue();
        root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());
        assertEquals(2, root.getCurrentIndex());
    }

    @Test
    public void testChildArrayHasParentAndInitialDescription() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext array = root.createChildArrayContext();
        assertSame(root, array.getParent());
        assertEquals("[0]", array.toString());
        assertEquals(0, array.getCurrentIndex());
    }

    @Test
    public void testArrayFirstAndSecondValues() throws Exception {
        JsonWriteContext array = JsonWriteContext.createRootContext().createChildArrayContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, array.writeValue());
        assertEquals(0, array.getCurrentIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, array.writeValue());
        assertEquals(1, array.getCurrentIndex());
    }

    @Test
    public void testArrayDescriptionUsesCurrentIndex() throws Exception {
        JsonWriteContext array = JsonWriteContext.createRootContext().createChildArrayContext();
        array.writeValue();
        array.writeValue();
        assertEquals("[2]", array.toString());
    }

    @Test
    public void testChildObjectInitialDescription() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext object = root.createChildObjectContext();
        assertSame(root, object.getParent());
        assertEquals("{?}", object.toString());
        assertEquals(0, object.getCurrentIndex());
    }

    @Test
    public void testObjectRequiresNameBeforeValue() throws Exception {
        JsonWriteContext object = JsonWriteContext.createRootContext().createChildObjectContext();
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, object.writeValue());
        assertEquals(0, object.getCurrentIndex());
    }

    @Test
    public void testFirstFieldNameAndValue() throws Exception {
        JsonWriteContext object = JsonWriteContext.createRootContext().createChildObjectContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, object.writeFieldName("a"));
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, object.writeValue());
        assertEquals(1, object.getCurrentIndex());
    }

    @Test
    public void testSecondFieldNameUsesCommaStatus() throws Exception {
        JsonWriteContext object = JsonWriteContext.createRootContext().createChildObjectContext();
        object.writeFieldName("a");
        object.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, object.writeFieldName("b"));
        assertEquals("{\"b\"}", object.toString());
    }

    @Test
    public void testRepeatedNameCallBeforeValueExpectsValue() throws Exception {
        JsonWriteContext object = JsonWriteContext.createRootContext().createChildObjectContext();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, object.writeFieldName("a"));
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, object.writeFieldName("b"));
        assertEquals("a", object.getCurrentName());
        assertEquals(0, object.getCurrentIndex());
    }

    @Test
    public void testCurrentValueRoundTrip() throws Exception {
        JsonWriteContext context = JsonWriteContext.createRootContext();
        Object value = new Object();
        context.setCurrentValue(value);
        assertSame(value, context.getCurrentValue());
        context.setCurrentValue(null);
        assertNull(context.getCurrentValue());
    }

    @Test
    public void testChildArrayIsReusedAndReset() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext first = root.createChildArrayContext();
        first.writeValue();
        JsonWriteContext second = root.createChildArrayContext();
        assertSame(first, second);
        assertEquals(0, second.getCurrentIndex());
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, second.writeValue());
    }

    @Test
    public void testChildObjectIsReusedAndReset() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext first = root.createChildObjectContext();
        first.writeFieldName("a");
        first.writeValue();
        JsonWriteContext second = root.createChildObjectContext();
        assertSame(first, second);
        assertEquals(0, second.getCurrentIndex());
        assertNull(second.getCurrentName());
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, second.writeValue());
    }

    @Test
    public void testChildContextTypesCanBeReused() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext child = root.createChildArrayContext();
        child.writeValue();
        JsonWriteContext reused = root.createChildObjectContext();
        assertSame(child, reused);
        assertEquals("{?}", reused.toString());
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, reused.writeValue());
    }

    @Test
    public void testWithDupDetectorReturnsSameContext() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertSame(root, root.withDupDetector(null));
        assertNull(root.getDupDetector());
    }

    @Test
    public void testObjectDescriptionAfterName() throws Exception {
        JsonWriteContext object = JsonWriteContext.createRootContext().createChildObjectContext();
        object.writeFieldName("key");
        assertEquals("{\"key\"}", object.toString());
    }
}
