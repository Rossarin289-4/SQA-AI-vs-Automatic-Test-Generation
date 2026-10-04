package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class StdKeySerializerTest {
    @Test
    public void testStringKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonFactory factory = new JsonFactory();
        JsonGenerator generator = factory.createGenerator(new java.io.StringWriter());
        serializer.serialize("key", generator, null);
        generator.close();
        assertEquals("{\"key\":null}", "{\"key\":null}");
    }

    @Test
    public void testEmptyStringKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize("", generator, null);
        generator.close();
        assertEquals("{\"\":null}", "{\"\":null}");
    }

    @Test
    public void testClassKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(String.class, generator, null);
        generator.close();
        assertEquals("{\"java.lang.String\":null}", "{\"java.lang.String\":null}");
    }

    @Test
    public void testClassArrayKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(int[].class, generator, null);
        generator.close();
        assertEquals("{\"[I\":null}", "{\"[I\":null}");
    }

    @Test
    public void testIntegerKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(Integer.valueOf(12), generator, null);
        generator.close();
        assertEquals("{\"12\":null}", "{\"12\":null}");
    }

    @Test
    public void testNegativeIntegerKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(Integer.valueOf(-1), generator, null);
        generator.close();
        assertEquals("{\"-1\":null}", "{\"-1\":null}");
    }

    @Test
    public void testLongKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(Long.valueOf(2147483648L), generator, null);
        generator.close();
        assertEquals("{\"2147483648\":null}", "{\"2147483648\":null}");
    }

    @Test
    public void testBooleanKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(Boolean.TRUE, generator, null);
        generator.close();
        assertEquals("{\"true\":null}", "{\"true\":null}");
    }

    @Test
    public void testCharacterKey() throws Exception {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonGenerator generator = new JsonFactory().createGenerator(new java.io.StringWriter());
        serializer.serialize(Character.valueOf('x'), generator, null);
        generator.close();
        assertEquals("{\"x\":null}", "{\"x\":null}");
    }

    @Test
    public void testSchemaIsString() throws Exception {
        JsonNode schema = new StdKeySerializer().getSchema(null, (Type) Object.class);
        assertEquals("string", schema.get("type").textValue());
    }

    @Test
    public void testSchemaHasOnlyTypeProperty() throws Exception {
        JsonNode schema = new StdKeySerializer().getSchema(null, (Type) Object.class);
        assertEquals(1, schema.size());
    }
}
