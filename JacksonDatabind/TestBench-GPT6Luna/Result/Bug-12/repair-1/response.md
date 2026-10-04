```java
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

public class MapDeserializerTest {
    @Test
    public void testSetIgnorableNull() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(null);
        assertTrue(d.isCachable());
    }

    @Test
    public void testSetIgnorableEmpty() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(new String[0]);
        assertTrue(d.isCachable());
    }

    @Test
    public void testSetIgnorableNonempty() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(new String[] {"skip"});
        assertFalse(d.isCachable());
    }

    @Test
    public void testContentType() throws Exception {
        MapDeserializer d = newDeserializer();
        assertEquals(String.class, d.getContentType().getRawClass());
    }

    @Test
    public void testContentDeserializer() throws Exception {
        JsonDeserializer<Object> valueDeserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext c) {
                return null;
            }
        };
        MapDeserializer d = newDeserializer(valueDeserializer);
        assertSame(valueDeserializer, d.getContentDeserializer());
    }

    @Test
    public void testDefaultDeserializerIsCacheable() throws Exception {
        assertTrue(newDeserializer().isCachable());
    }

    @Test
    public void testValueDeserializerPreventsCaching() throws Exception {
        assertFalse(newDeserializer(nonNullValueDeserializer()).isCachable());
    }

    @Test
    public void testMapClass() throws Exception {
        assertEquals(HashMap.class, newDeserializer().getMapClass());
    }

    @Test
    public void testValueType() throws Exception {
        MapDeserializer d = newDeserializer();
        assertSame(d.getContentType(), d.getValueType().getContentType());
    }

    @Test
    public void testDeserializeEmptyObject() throws Exception {
        Map<Object, Object> result = deserialize("{}");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeTwoProperties() throws Exception {
        Map<Object, Object> result = deserialize("{\"a\":\"x\",\"b\":\"y\"}");
        assertEquals(2, result.size());
        assertEquals("x", result.get("a"));
        assertEquals("y", result.get("b"));
    }

    @Test
    public void testDeserializeNullValue() throws Exception {
        Map<Object, Object> result = deserialize("{\"a\":null}");
        assertTrue(result.containsKey("a"));
        assertNull(result.get("a"));
    }

    @Test
    public void testDeserializeDuplicateKeyKeepsLastValue() throws Exception {
        Map<Object, Object> result = deserialize("{\"a\":\"x\",\"a\":\"y\"}");
        assertEquals(1, result.size());
        assertEquals("y", result.get("a"));
    }

    @Test
    public void testDeserializeStringScalarAsMap() throws Exception {
        JsonParser parser = parser("\"\"");
        assertEquals(Collections.emptyMap(), newDeserializer().deserialize(parser, context()));
    }

    @Test
    public void testDeserializeNonObjectThrows() throws Exception {
        JsonParser parser = parser("1");
        try {
            newDeserializer().deserialize(parser, context());
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testDeserializeIntoExistingMap() throws Exception {
        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("prior", "value");
        JsonParser parser = parser("{\"new\":\"entry\"}");
        Map<Object, Object> returned = newDeserializer().deserialize(parser, context(), result);
        assertSame(result, returned);
        assertEquals(2, result.size());
        assertEquals("value", result.get("prior"));
        assertEquals("entry", result.get("new"));
    }

    @Test
    public void testIgnoredPropertyIsSkipped() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(new String[] {"skip"});
        JsonParser parser = parser("{\"skip\":{\"nested\":1},\"keep\":\"yes\"}");
        Map<Object, Object> result = d.deserialize(parser, context());
        assertEquals(1, result.size());
        assertEquals("yes", result.get("keep"));
    }

    @Test
    public void testDeserializeWithTypeDelegates() throws Exception {
        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public TypeDeserializer forProperty(BeanProperty p) { return this; }
            @Override public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion() { return null; }
            @Override public String getPropertyName() { return null; }
            @Override public com.fasterxml.jackson.databind.jsontype.TypeIdResolver getTypeIdResolver() { return null; }
            @Override public Class<?> getDefaultImpl() { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext c) { return "object"; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext c) { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext c) { return null; }
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext c) { return null; }
        };
        assertEquals("object", newDeserializer().deserializeWithType(parser("{}"), context(), typeDeserializer));
    }

    @Test
    public void testSetIgnorableCanBeCleared() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(new String[] {"skip"});
        d.setIgnorableProperties(null);
        assertTrue(d.isCachable());
    }

    @Test
    public void testResolveWithoutCreatorOptions() throws Exception {
        MapDeserializer d = newDeserializer();
        d.resolve(context());
        assertEquals(HashMap.class, d.getMapClass());
    }

    @Test
    public void testCreateContextualReturnsDeserializer() throws Exception {
        MapDeserializer d = newDeserializer();
        JsonDeserializer<?> contextual = d.createContextual(context(), null);
        assertNotNull(contextual);
        assertEquals(HashMap.class, ((MapDeserializer) contextual).getMapClass());
    }

    @Test
    public void testCreateContextualKeepsConfiguredIgnorables() throws Exception {
        MapDeserializer d = newDeserializer();
        d.setIgnorableProperties(new String[] {"skip"});
        JsonDeserializer<?> contextual = d.createContextual(context(), null);
        assertFalse(((MapDeserializer) contextual).isCachable());
    }

    @Test
    public void testCreatorPathWithoutCreatorIsNotInvoked() throws Exception {
        MapDeserializer d = newDeserializer();
        JsonParser jp = parser("{}");
        try {
            d._deserializeUsingCreator(jp, context());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(JsonToken.START_OBJECT, jp.getCurrentToken());
        }
    }

    @Test
    public void testCreatorPathOnEmptyObjectFailsBeforeBuilding() throws Exception {
        MapDeserializer d = newDeserializer();
        JsonParser jp = parser("{ }");
        try {
            d._deserializeUsingCreator(jp, context());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(JsonToken.START_OBJECT, jp.getCurrentToken());
        }
    }

    @Test
    public void testCreatorPathOnPropertyInputFailsWithoutCreator() throws Exception {
        MapDeserializer d = newDeserializer();
        JsonParser jp = parser("{\"a\":1}");
        try {
            d._deserializeUsingCreator(jp, context());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(JsonToken.START_OBJECT, jp.getCurrentToken());
        }
    }

    private static MapDeserializer newDeserializer() {
        return newDeserializer(null);
    }

    private static MapDeserializer newDeserializer(JsonDeserializer<Object> valueDeserializer) {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        return new MapDeserializer(type, mapper.getDeserializationContext().findRootValueDeserializer(type) == null
                ? null : null, null, valueDeserializer, null);
    }

    private static JsonDeserializer<Object> nonNullValueDeserializer() {
        return new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext c) {
                return null;
            }
        };
    }

    private static Map<Object, Object> deserialize(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Map.class);
    }

    private static JsonParser parser(String json) throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(json);
        parser.nextToken();
        return parser;
    }

    private static DeserializationContext context() {
        return new ObjectMapper().getDeserializationContext();
    }
}
```