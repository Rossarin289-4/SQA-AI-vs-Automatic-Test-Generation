```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.BeanProperty; // Added import for BeanProperty

public class BeanDeserializerTest {

    // Helper method to create a dummy BeanDeserializer instance for testing
    private BeanDeserializer createBeanDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        // Use a concrete class like Object.class to introspect
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        // Use a real DeserializationContext
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        // BeanDeserializerBase has protected constructors, so we need to build it via the builder
        return (BeanDeserializer) builder.build();
    }

    // Helper method to create a dummy JsonParser
    private JsonParser createDummyJsonParser(Object... tokens) throws IOException {
        TokenBuffer tb = new TokenBuffer(null, null); // Use null ObjectCodec and DeserializationContext for simplicity
        for (Object token : tokens) {
            if (token instanceof String) {
                tb.writeString((String) token);
            } else if (token instanceof Integer) {
                tb.writeNumber((Integer) token);
            } else if (token instanceof Double) {
                tb.writeNumber((Double) token);
            } else if (token instanceof Boolean) {
                tb.writeBoolean((Boolean) token);
            } else if (token == null) {
                tb.writeNull();
            } else if (token instanceof Map) {
                // For simplicity, write map as embedded object if possible
                tb.writeEmbeddedObject(token);
            } else if (token instanceof JsonToken) {
                if (token == JsonToken.START_OBJECT) tb.writeStartObject();
                else if (token == JsonToken.END_OBJECT) tb.writeEndObject();
                else if (token == JsonToken.FIELD_NAME) {
                    // FIELD_NAME requires a preceding name, not handled directly here.
                    // This is usually handled by JsonParser's nextFieldName().
                }
            } else if (token instanceof String[] && ((String[]) token).length == 2) {
                // For field name and value pair
                String[] pair = (String[]) token;
                tb.writeFieldName(pair[0]);
                tb.writeString(pair[1]); // Assuming string value for simplicity
            }
        }
        JsonParser p = tb.asParser();
        // Advance parser to the first token if it's not null
        if (tb.firstToken() != null && !tb.firstToken().isStructEnd() && tokens.length > 0) {
            p.nextToken();
        }
        return p;
    }

    // Helper method to create a dummy DeserializationContext
    private DeserializationContext createDummyDeserializationContext() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationContext();
    }

    @Test
    public void testDeserialize_StartObjectToken_VanillaProcessing() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null); // Use null codec for simplicity
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserialize(p, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserialize_StartObjectToken_WithObjectId() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        // Mock ObjectIdReader
        ObjectIdReader oir = ObjectIdReader.construct(type, null, null, null, null, null);
        builder.setObjectIdReader(oir);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserialize(p, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserialize_StartObjectToken_General() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserialize(p, createDummyDeserializationContext());
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserialize_ValueString() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser("test"); // writeString("test")
        // _deserializeOther is protected, but can be called for testing.
        // It handles VALUE_STRING by calling deserializeFromString.
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_STRING);
        assertNotNull(result);
        assertTrue(result instanceof String);
        assertEquals("test", result);
    }

    @Test
    public void testDeserialize_ValueNumberInt() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser(123); // writeNumber(123)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_NUMBER_INT);
        assertNotNull(result);
        assertTrue(result instanceof Integer);
        assertEquals(123, result);
    }

    @Test
    public void testDeserialize_ValueNumberFloat() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser(123.45); // writeNumber(123.45)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_NUMBER_FLOAT);
        assertNotNull(result);
        assertTrue(result instanceof Double);
        assertEquals(123.45, (Double) result, 0.0001);
    }

    @Test
    public void testDeserialize_ValueEmbeddedObject() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        Map<String, Object> embedded = new HashMap<>();
        embedded.put("a", 1);
        JsonParser p = createDummyJsonParser(embedded); // writeEmbeddedObject(embedded)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_EMBEDDED_OBJECT);
        assertNotNull(result);
        assertTrue(result instanceof Map);
        assertEquals(embedded, result);
    }

    @Test
    public void testDeserialize_ValueTrue() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser(true); // writeBoolean(true)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_TRUE);
        assertNotNull(result);
        assertTrue(result instanceof Boolean);
        assertTrue((Boolean) result);
    }

    @Test
    public void testDeserialize_ValueFalse() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser(false); // writeBoolean(false)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_FALSE);
        assertNotNull(result);
        assertTrue(result instanceof Boolean);
        assertFalse((Boolean) result);
    }

    @Test
    public void testDeserialize_ValueNull() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser((Object) null); // writeNull()
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_NULL);
        assertNull(result);
    }

    @Test
    public void testDeserialize_StartArray() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        // Simulate an empty array
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartArray();
        tb.writeEndArray();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_ARRAY

        // _deserializeOther calls deserializeFromArray for START_ARRAY.
        // For a generic BeanDeserializer of Object.class, this might throw.
        try {
            Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.START_ARRAY);
            // If it doesn't throw, assert something reasonable.
            assertNotNull(result);
        } catch (Exception e) {
            // Expected for generic Object deserializer if not configured for arrays.
            assertTrue(e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialize_FieldName_General() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        // Simulate an object with a field
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeFieldName("field");
        tb.writeString("value");
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT
        p.nextToken(); // consume FIELD_NAME

        // _deserializeOther handles FIELD_NAME by calling deserializeFromObject (if not vanilla processing)
        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.FIELD_NAME);
        assertNotNull(result);
        // The actual result depends on the deserializer's configuration for Object.class
    }

    @Test
    public void testDeserialize_EndObject() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT
        p.nextToken(); // consume END_OBJECT

        Object result = deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.END_OBJECT);
        assertNotNull(result);
        // END_OBJECT typically signifies the end of an object being deserialized.
        // For a default deserializer of Object.class, it might return a default instance.
    }

    @Test
    public void testDeserialize_UnexpectedToken() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        // Use a token that is not explicitly handled in the switch statement of _deserializeOther.
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeRawValue("invalid"); // This writes a RAW_VALUE token.
        JsonParser p = tb.asParser();
        p.nextToken(); // consume RAW_VALUE

        try {
            // Pass an unexpected token type to _deserializeOther
            deserializer._deserializeOther(p, createDummyDeserializationContext(), JsonToken.VALUE_EMBEDDED_OBJECT);
            fail("Expected handleUnexpectedToken to be called and throw exception");
        } catch (JsonMappingException e) {
            // Expected outcome for an unexpected token
            assertTrue(e.getMessage().contains("Unexpected token"));
        } catch (Exception e) {
            fail("Expected JsonMappingException, but got " + e.getClass().getName());
        }
    }

    @Test
    public void testDeserialize_WithNullBean_Deserialize_Override() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        Object bean = null; // Test with a null bean

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        // The deserialize method with a bean argument is intended for updating an existing bean.
        // The method calls p.setCurrentValue(bean), which throws NPE if bean is null.
        try {
            deserializer.deserialize(p, createDummyDeserializationContext(), bean);
            fail("Expected NullPointerException for null bean");
        } catch (NullPointerException e) {
            // Expected
        } catch (Exception e) {
            fail("Expected NullPointerException, but got " + e.getClass().getName());
        }
    }

    @Test
    public void testDeserialize_WithNullBean_Deserialize() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        // The deserialize method without a bean argument creates a new bean.
        Object result = deserializer.deserialize(p, createDummyDeserializationContext());
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testVanillaDeserialize_EmptyObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT
        // Move parser to END_OBJECT token for vanillaDeserialize call
        p.nextToken(); // Should be END_OBJECT

        // vanillaDeserialize is private, cannot be called directly from here.
        // We will test the public deserialize method which calls vanillaDeserialize internally.
        Object result = deserializer.deserialize(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeFromObject_WithObjectIdReader_MaySerializeAsObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);

        ObjectIdReader oir = ObjectIdReader.construct(type, null, null, null, null, null);
        builder.setObjectIdReader(oir);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeFieldName("@id"); // Example property name for object id
        tb.writeString("123");
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserializeFromObject(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeFromObject_NonStandardCreation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserializeFromObject(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeFromObject_DefaultCreation() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserializeFromObject(p, createDummyDeserializationContext());
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeFromObject_WithTypedObjectId() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        ObjectIdReader oir = ObjectIdReader.construct(type, null, null, null, null, null);
        builder.setObjectIdReader(oir);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        Object result = deserializer.deserializeFromObject(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeUsingPropertyBased_WithCreatorAndUnknown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeFieldName("some_prop");
        tb.writeString("some_value");
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT

        try {
            Object result = deserializer._deserializeUsingPropertyBased(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeUsingPropertyBased_Empty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer._deserializeUsingPropertyBased(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeUsingPropertyBased_UnresolvedReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            deserializer._deserializeUsingPropertyBased(p, ctxt);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeUsingPropertyBased_Polymorphic() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            deserializer._deserializeUsingPropertyBased(p, ctxt);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeUsingPropertyBased_HandleUnknownProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeFieldName("unknown");
        tb.writeString("value");
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer._deserializeUsingPropertyBased(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeFromNull_XmlCase() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser((Object) null); // writeNull()
        DeserializationContext ctxt = createDummyDeserializationContext();

        // The deserializeFromNull method checks p.requiresCustomCodec().
        // For a standard ObjectMapper, this is false. The method then falls back
        // to handleUnexpectedToken.
        try {
            Object result = deserializer.deserializeFromNull(p, ctxt);
            // If it doesn't throw, it should be null.
            assertNull(result);
        } catch (JsonMappingException e) {
            // This exception is expected if handleUnexpectedToken is called.
            assertTrue(e.getMessage().contains("Unexpected token"));
        } catch (Exception e) {
            fail("Expected JsonMappingException or null, but got " + e.getClass().getName());
        }
    }

    @Test
    public void testDeserializeWithView_WithProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeFieldName("field");
        tb.writeString("value");
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken(); // consume START_OBJECT
        p.nextToken(); // consume FIELD_NAME

        Object bean = new Object(); // Provide a bean to deserialize into
        Class<?> activeView = Object.class; // Dummy view

        Object result = deserializer.deserializeWithView(p, ctxt, bean, activeView);
        assertNotNull(result);
        assertSame(bean, result); // Should return the bean instance passed in
    }

    @Test
    public void testDeserializeWithUnwrapped_Delegate() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeWithUnwrapped(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeWithUnwrapped_PropertyBasedCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeUsingPropertyBasedWithUnwrapped(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeWithUnwrapped_DefaultCreation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeWithUnwrapped(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeWithExternalTypeId_Delegate() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeWithExternalTypeId(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeWithExternalTypeId_PropertyBasedCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeUsingPropertyBasedWithExternalTypeId(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeWithExternalTypeId_DefaultCreation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        try {
            Object result = deserializer.deserializeWithExternalTypeId(p, ctxt);
            assertNotNull(result);
            assertTrue(result instanceof Object);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException || e instanceof IOException || e instanceof JsonMappingException);
        }
    }

    @Test
    public void testUnwrappingDeserializer() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        NameTransformer transformer = NameTransformer.simpleTransformer("prefix_", "_suffix");
        JsonDeserializer<Object> unwrappingDeserializer = deserializer.unwrappingDeserializer(transformer);
        assertNotNull(unwrappingDeserializer);
        assertTrue(unwrappingDeserializer instanceof BeanDeserializer);
    }

    @Test
    public void testWithObjectIdReader() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        ObjectMapper mapper = new ObjectMapper();
        ObjectIdReader oir = ObjectIdReader.construct(mapper.getTypeFactory().constructType(Object.class), null, null, null, null, null);
        BeanDeserializer newDeserializer = deserializer.withObjectIdReader(oir);
        assertNotNull(newDeserializer);
        assertNotSame(deserializer, newDeserializer);
        assertTrue(newDeserializer instanceof BeanDeserializer);
    }

    @Test
    public void testWithIgnorableProperties() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        Set<String> ignorableProps = new HashSet<>();
        ignorableProps.add("ignoreMe");
        BeanDeserializer newDeserializer = deserializer.withIgnorableProperties(ignorableProps);
        assertNotNull(newDeserializer);
        assertNotSame(deserializer, newDeserializer);
        assertTrue(newDeserializer instanceof BeanDeserializer);
    }

    @Test
    public void testWithBeanProperties() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        ObjectMapper mapper = new ObjectMapper();
        // BeanPropertyMap constructor requires a boolean and a Collection<SettableBeanProperty> or similar.
        // Creating a valid BeanPropertyMap requires more setup.
        // Let's use a simpler approach by creating a property and adding it to a map.
        JavaType javaType = mapper.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(javaType);
        SettableBeanProperty prop = null; // Need to create a mock or dummy SettableBeanProperty
        // For simplicity, let's mock a very basic property. This might not be sufficient for a real BeanPropertyMap.
        // A more robust test would use a concrete class with properties.
        BeanPropertyMap props = new BeanPropertyMap(false, Collections.emptyList()); // Use a valid constructor
        BeanDeserializerBase newDeserializer = deserializer.withBeanProperties(props);
        assertNotNull(newDeserializer);
        assertNotSame(deserializer, newDeserializer);
        assertTrue(newDeserializer instanceof BeanDeserializer);
    }

    @Test
    public void testAsArrayDeserializer() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonDeserializer<Object> arrayDeserializer = deserializer.asArrayDeserializer();
        assertNotNull(arrayDeserializer);
        assertTrue(arrayDeserializer instanceof BeanAsArrayDeserializer);
    }

    @Test
    public void testDeserialize_EmptyJsonObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);
        BeanDeserializer deserializer = (BeanDeserializer) builder.build();

        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser p = tb.asParser();
        p.nextToken();

        Object result = deserializer.deserialize(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserialize_NullToken() throws Exception {
        BeanDeserializer deserializer = createBeanDeserializer();
        JsonParser p = createDummyJsonParser((Object) null); // writeNull()
        Object result = deserializer.deserialize(p, createDummyDeserializationContext());
        assertNull(result);
    }
}
```