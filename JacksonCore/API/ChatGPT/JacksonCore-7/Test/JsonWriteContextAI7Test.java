package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonWriteContextAI7Test {

    @Test
    public void testRootContextAndValueStatus() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertEquals(JsonStreamContext.TYPE_ROOT, root.getType());
        assertNull(root.getParent());
        assertEquals("/", root.toString());

        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, root.writeValue());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, root.writeValue());
    }

    @Test
    public void testArrayContextCreationAndWrites() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arrayCtxt = root.createChildArrayContext();

        assertEquals(JsonStreamContext.TYPE_ARRAY, arrayCtxt.getType());
        assertEquals(root, arrayCtxt.getParent());
        assertEquals("[0]", arrayCtxt.toString());

        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, arrayCtxt.writeValue());
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, arrayCtxt.writeValue());
        assertEquals(1, arrayCtxt.getCurrentIndex());
    }

    @Test
    public void testObjectContextFieldAndValueFlow() throws Exception {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext objCtxt = root.createChildObjectContext();

        assertEquals(JsonStreamContext.TYPE_OBJECT, objCtxt.getType());
        assertEquals(JsonWriteContext.STATUS_EXPECT_NAME, objCtxt.writeValue());

        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, objCtxt.writeFieldName("testField"));
        assertEquals("testField", objCtxt.getCurrentName());

        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, objCtxt.writeValue());
        assertNull(objCtxt.getCurrentName());
    }
}
