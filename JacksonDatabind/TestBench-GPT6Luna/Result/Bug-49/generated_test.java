package com.fasterxml.jackson.databind.ser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;

public class WritableObjectIdTest {
    @Test
    public void testGenerateIdStoresGeneratedValue() throws Exception {
        WritableObjectId value = new WritableObjectId(null);
        value.id = "saved";
        assertEquals("saved", value.generateId(new Object()));
    }

    @Test
    public void testGenerateIdReturnsSameExistingReference() throws Exception {
        WritableObjectId value = new WritableObjectId(null);
        Object id = new Object();
        value.id = id;
        assertSame(id, value.generateId(null));
    }

    @Test
    public void testWriteAsIdReturnsFalseWithoutId() throws Exception {
        WritableObjectId value = new WritableObjectId(null);
        assertFalse(value.writeAsId(null, null, null));
    }
}
