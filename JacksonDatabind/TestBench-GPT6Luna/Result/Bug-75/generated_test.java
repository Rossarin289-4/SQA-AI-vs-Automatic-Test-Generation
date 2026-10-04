package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;

public class EnumSerializerTest {
    private enum Sample {
        FIRST, SECOND
    }

    @Test
    public void testConstructUsesEnumNames() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, null);
        assertEquals("FIRST", serializer.getEnumValues().serializedValueFor(Sample.FIRST).getValue());
        assertEquals("SECOND", serializer.getEnumValues().serializedValueFor(Sample.SECOND).getValue());
    }

    @Test
    public void testConstructWithStringShape() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.STRING);
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, format);
        assertEquals("\"FIRST\"", mapper.writeValueAsString(Sample.FIRST));
    }

    @Test
    public void testConstructWithNumericShapeSerializesOrdinal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.NUMBER);
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, format);
        assertEquals(Boolean.TRUE, Boolean.valueOf(serializer != null));
        assertEquals("1", mapper.writer().with(SerializationFeature.WRITE_ENUMS_USING_INDEX)
                .writeValueAsString(Sample.SECOND));
    }

    @Test
    public void testGetEnumValuesHasBothConstants() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, null);
        assertEquals(2, serializer.getEnumValues().values().size());
    }

    @Test
    public void testEnumValuesPreserveDeclarationOrder() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, null);
        Iterator<SerializableString> values = serializer.getEnumValues().values().iterator();
        assertEquals("FIRST", values.next().getValue());
        assertEquals("SECOND", values.next().getValue());
        assertFalse(values.hasNext());
    }

    @Test
    public void testSerializeDefaultUsesEnumName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("\"FIRST\"", mapper.writeValueAsString(Sample.FIRST));
    }

    @Test
    public void testSerializeSecondConstantUsesItsName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("\"SECOND\"", mapper.writeValueAsString(Sample.SECOND));
    }

    @Test
    public void testSerializeUsingIndexUsesFirstOrdinalZero() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer().with(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        assertEquals("0", writer.writeValueAsString(Sample.FIRST));
    }

    @Test
    public void testSerializeUsingIndexUsesLastOrdinal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer().with(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        assertEquals("1", writer.writeValueAsString(Sample.SECOND));
    }

    @Test
    public void testSchemaWithoutIndexIsString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.STRING));
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), Sample.class);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testSchemaWithoutEnumTypeHintHasNoEnumList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.STRING));
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), null);
        assertEquals(false, schema.has("enum"));
    }

    @Test
    public void testSchemaWithEnumTypeHintListsNames() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.STRING));
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), Sample.class);
        assertEquals(2, schema.get("enum").size());
        assertEquals("FIRST", schema.get("enum").get(0).asText());
        assertEquals("SECOND", schema.get("enum").get(1).asText());
    }

    @Test
    public void testSchemaWithIndexShapeIsInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.NUMBER));
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), Sample.class);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testContextualWithNullPropertyReturnsSameSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null, null);
        assertSame(serializer, serializer.createContextual(mapper.getSerializerProvider(), null));
    }

    @Test
    public void testAcceptVisitorWithStringShape() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.STRING));
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(Sample.class));
        assertNull(visitor.getProvider());
    }

    @Test
    public void testAcceptVisitorWithIndexShape() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        EnumSerializer serializer = EnumSerializer.construct(
                Sample.class, mapper.getSerializationConfig(), null,
                JsonFormat.Value.forShape(Shape.NUMBER));
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(Sample.class));
        assertNull(visitor.getProvider());
    }

    @Test
    public void testUnsupportedObjectShapeThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            EnumSerializer.construct(Sample.class, mapper.getSerializationConfig(), null,
                    JsonFormat.Value.forShape(Shape.OBJECT));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }
}
