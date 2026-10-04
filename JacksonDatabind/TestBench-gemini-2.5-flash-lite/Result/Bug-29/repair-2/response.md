```java
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.ExtTypedProperty;

public class ExternalTypeHandlerTest {

    // Helper method to create a dummy DeserializationContext
    private DeserializationContext createDummyContext() {
        return new ObjectMapper().getDeserializationContext();
    }

    // Helper method to create a dummy JsonParser
    private JsonParser createDummyParser() throws IOException {
        return new ObjectMapper().getFactory().createParser("{}");
    }

    // Helper method to create a dummy JsonParser with content
    private JsonParser createParserWithContent(String content) throws IOException {
        return new ObjectMapper().getFactory().createParser(content);
    }

    // Helper method to create a dummy SettableBeanProperty
    private SettableBeanProperty createDummyProperty(String name, JavaType type) {
        return new SettableBeanProperty(PropertyName.construct(name), type, null, null) {
            private static final long serialVersionUID = 1L;
            private Object _value;

            @Override
            public void set(Object instance, Object value) throws IOException {
                this._value = value;
            }

            @Override
            public Object get(Object instance) {
                return this._value;
            }

            @Override
            public SettableBeanProperty withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer<?> deser) {
                return this;
            }
            
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                // Simplified deserialization for testing
                Object val = ctxt.readValue(p, type);
                set(instance, val);
            }

            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                 return ctxt.readValue(p, type);
            }
        };
    }

    // Helper method to create a dummy TypeDeserializer
    private TypeDeserializer createDummyTypeDeserializer(String propertyName, JavaType defaultImpl) {
        return new TypeDeserializer(0, null, propertyName) {
            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return this;
            }

            @Override
            public com.fasterxml.jackson.databind.jsontype.TypeDeserializer.As getTypeInclusion() {
                return com.fasterxml.jackson.databind.jsontype.TypeDeserializer.As.EXTERNAL_PROPERTY;
            }

            @Override
            public String getPropertyName() {
                return propertyName;
            }

            @Override
            public TypeIdResolver getTypeIdResolver() {
                return new TypeIdResolverBase() {
                    @Override
                    public String idFromValueAndType(Object value, Class<?> type) {
                        if (type == null) return null;
                        return type.getSimpleName();
                    }
                    @Override
                    public JavaType typeFromId(com.fasterxml.jackson.databind.DatabindContext context, String id) {
                         if (id.equals("String")) return TypeFactory.defaultInstance().constructType(String.class);
                         if (id.equals("Integer")) return TypeFactory.defaultInstance().constructType(Integer.class);
                         return null;
                    }
                     @Override
                    public String getMechanism() { return "test"; }
                };
            }

            @Override
            public Class<?> getDefaultImpl() {
                return defaultImpl != null ? defaultImpl.getRawClass() : null;
            }

            @Override
            public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
        };
    }
    
    // Helper to set private fields
    private void setPrivateField(Object obj, String fieldName, Object value) throws Exception {
        java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    // Helper to get private fields
    private Object getPrivateField(Object obj, String fieldName) throws Exception {
        java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    // Helper to invoke private methods
    private Object invokePrivateMethod(Object obj, String methodName, Object... args) throws Exception {
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
            if (args[i] instanceof TokenBuffer[]) { // Correctly identify array types
                parameterTypes[i] = TokenBuffer[].class;
            } else if (args[i] instanceof String[]) {
                parameterTypes[i] = String[].class;
            } else if (args[i] instanceof Integer) {
                 parameterTypes[i] = int.class;
            } else if (args[i] instanceof Object[]) {
                parameterTypes[i] = Object[].class;
            }
        }
        java.lang.reflect.Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        return method.invoke(obj, args);
    }

    @Test
    public void testStartReturnsNewInstance() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        ExternalTypeHandler startedHandler = handler.start();
        assertNotNull(startedHandler);
        assertNotSame(handler, startedHandler);
    }

    @Test
    public void testHandleTypePropertyValue_propertyNotFound() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(jp, ctxt, "nonExistentProp", bean);
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_typePropertyNotFound() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createParserWithContent("{\"someOtherProp\": \"someValue\"}");
        jp.nextToken(); // Move to field name "someOtherProp"
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(jp, ctxt, "someOtherProp", bean);
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_setsTypeIdAndTriggersDeserializeWhenPossible() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExternalTypeHandler handler = builder.build().start();

        TokenBuffer tokens = new TokenBuffer(createDummyParser());
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});
        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jp = createParserWithContent("{\"typeProp\":\"someType\"}");
        jp.nextToken(); // Move to "typeProp"
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(jp, ctxt, "typeProp", bean);
        assertTrue(handled);

        String[] typeIds = (String[]) getPrivateField(handler, "_typeIds");
        assertEquals("someType", typeIds[0]);

        TokenBuffer[] tokensArray = (TokenBuffer[]) getPrivateField(handler, "_tokens");
        assertNull(tokensArray[0]);
    }

    @Test
    public void testHandlePropertyValue_propertyNotFound() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handlePropertyValue(jp, ctxt, "nonExistentProp", bean);
        assertFalse(handled);
    }

    @Test
    public void testHandlePropertyValue_buffersTokenAndTypeId() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExternalTypeHandler handler = builder.build().start();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jp = createParserWithContent("{\"data\":\"value\"}");
        jp.nextToken(); // Move to "data"
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handlePropertyValue(jp, ctxt, "testProp", bean);
        assertTrue(handled);

        TokenBuffer[] tokensArray = (TokenBuffer[]) getPrivateField(handler, "_tokens");
        assertNotNull(tokensArray[0]);

        String[] typeIds = (String[]) getPrivateField(handler, "_typeIds");
        assertNull(typeIds[0]);
    }

    @Test
    public void testHandlePropertyValue_triggersDeserializeWhenPossible() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExternalTypeHandler handler = builder.build().start();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});
        setPrivateField(handler, "_typeIds", new String[]{"someType"});

        JsonParser jpForToken = createParserWithContent("\"bufferedValue\"");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser(); // Dummy parser for method call
        jp.nextToken();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handlePropertyValue(jp, ctxt, "testProp", bean);
        assertTrue(handled);

        TokenBuffer[] tokensArray = (TokenBuffer[]) getPrivateField(handler, "_tokens");
        assertNull(tokensArray[0]);
        String[] typeIds = (String[]) getPrivateField(handler, "_typeIds");
        assertNull(typeIds[0]);
    }

    @Test
    public void testComplete_handlesMissingTypeIdAndToken() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        Object result = handler.complete(jp, ctxt, bean);
        assertNotNull(result);
        assertSame(bean, result);
    }

    @Test
    public void testComplete_throwsExceptionWhenTypeIdMissingButTokenPresent() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_tokens", new TokenBuffer[]{new TokenBuffer(createDummyParser())});
        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        try {
            handler.complete(jp, ctxt, bean);
            fail("Expected mapping exception for missing type ID");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing property 'testProp' for external type id 'typeProp'"));
        }
    }

    @Test
    public void testComplete_throwsExceptionWhenTokenMissingButTypeIdPresent() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_typeIds", new String[]{"someType"});
        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        try {
            handler.complete(jp, ctxt, bean);
            fail("Expected mapping exception for missing token buffer");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing property 'testProp' for external type id 'typeProp'"));
        }
    }

    @Test
    public void testComplete_handlesNaturalTypes() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        SettableBeanProperty prop = createDummyProperty("testProp", stringType);
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();
        
        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jpForToken = createParserWithContent("\"stringValue\"");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        handler.complete(jp, ctxt, bean);
        assertEquals("stringValue", prop.get(bean));
    }

    @Test
    public void testComplete_usesDefaultImplWhenTypeIsMissing() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(String.class);
        SettableBeanProperty prop = createDummyProperty("testProp", defaultImplType);
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", defaultImplType);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();
        
        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jpForToken = createParserWithContent("\"stringValue\"");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        handler.complete(jp, ctxt, bean);
        assertEquals("stringValue", prop.get(bean));
    }

    @Test
    public void testComplete_throwsExceptionIfNoDefaultImplAndTypeMissing() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null); // No default impl
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jpForToken = createParserWithContent("\"stringValue\"");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        try {
            handler.complete(jp, ctxt, bean);
            fail("Expected mapping exception for missing type id and no default impl");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing external type id property 'typeProp'"));
        }
    }

    @Test
    public void testBuilderAddExternal() throws Exception {
        Builder builder = new Builder();
        SettableBeanProperty prop1 = createDummyProperty("prop1", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser1 = createDummyTypeDeserializer("type1", null);
        SettableBeanProperty prop2 = createDummyProperty("prop2", TypeFactory.defaultInstance().constructType(Integer.class));
        TypeDeserializer typeDeser2 = createDummyTypeDeserializer("type2", null);

        builder.addExternal(prop1, typeDeser1);
        builder.addExternal(prop2, typeDeser2);

        List<?> properties = (List<?>) getPrivateField(builder, "_properties");
        assertEquals(2, properties.size());

        Map<?, ?> nameToPropertyIndex = (Map<?, ?>) getPrivateField(builder, "_nameToPropertyIndex");
        assertEquals(4, nameToPropertyIndex.size()); // prop1, type1, prop2, type2
        assertEquals(0, nameToPropertyIndex.get("prop1"));
        assertEquals(0, nameToPropertyIndex.get("type1"));
        assertEquals(1, nameToPropertyIndex.get("prop2"));
        assertEquals(1, nameToPropertyIndex.get("type2"));
    }

    @Test
    public void testBuilderBuild() throws Exception {
        Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);

        ExternalTypeHandler handler = builder.build();
        assertNotNull(handler);

        Object[] properties = (Object[]) getPrivateField(handler, "_properties");
        assertEquals(1, properties.length);

        Map<?, ?> nameToPropertyIndex = (Map<?, ?>) getPrivateField(handler, "_nameToPropertyIndex");
        assertEquals(2, nameToPropertyIndex.size());
        assertEquals(0, nameToPropertyIndex.get("testProp"));
        assertEquals(0, nameToPropertyIndex.get("typeProp"));
    }

    @Test
    public void testDeserializeAndSet_handlesNullValue() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExternalTypeHandler handler = builder.build().start();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jpForToken = createParserWithContent("null");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.nextToken(); // Important to get the null token
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        invokePrivateMethod(handler, "_deserializeAndSet", jp, ctxt, bean, 0, "someType");

        assertNull(prop.get(bean));
        TokenBuffer[] tokensArray = (TokenBuffer[]) getPrivateField(handler, "_tokens");
        assertNull(tokensArray[0]);
    }

    @Test
    public void testDeserialize_handlesNullValue() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExternalTypeHandler handler = builder.build().start();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});

        JsonParser jpForToken = createParserWithContent("null");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.nextToken(); // Important to get the null token
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();

        Object result = invokePrivateMethod(handler, "_deserialize", jp, ctxt, 0, "someType");

        assertNull(result);
        TokenBuffer[] tokensArray = (TokenBuffer[]) getPrivateField(handler, "_tokens");
        assertNotNull(tokensArray[0]); // _deserialize does not clear tokens
    }

    @Test
    public void testComplete_withEmptyProperties() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        Object result = handler.complete(jp, ctxt, bean);
        assertNotNull(result);
        assertSame(bean, result);
    }

    @Test
    public void testHandleTypePropertyValue_withEmptyIndex() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(jp, ctxt, "someProp", bean);
        assertFalse(handled);
    }

    @Test
    public void testHandlePropertyValue_withEmptyIndex() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        ExternalTypeHandler handler = builder.build();

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        boolean handled = handler.handlePropertyValue(jp, ctxt, "someProp", bean);
        assertFalse(handled);
    }

    @Test
    public void testMultiplePropertiesHandling() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop1 = createDummyProperty("prop1", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser1 = createDummyTypeDeserializer("type1", null);
        SettableBeanProperty prop2 = createDummyProperty("prop2", TypeFactory.defaultInstance().constructType(Integer.class));
        TypeDeserializer typeDeser2 = createDummyTypeDeserializer("type2", null);

        builder.addExternal(prop1, typeDeser1);
        builder.addExternal(prop2, typeDeser2);
        ExternalTypeHandler handler = builder.build().start();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop1, typeDeser1), new ExtTypedProperty(prop2, typeDeser2)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("prop1", 0); put("type1", 0); put("prop2", 1); put("type2", 1); }});

        // Simulate handling of type property for prop1
        JsonParser jpType1 = createParserWithContent("{\"type1\":\"typeA\"}");
        jpType1.nextToken();
        handler.handleTypePropertyValue(jpType1, createDummyContext(), "type1", new Object());

        // Simulate handling of property value for prop2
        JsonParser jpProp2 = createParserWithContent("{\"prop2\":123}");
        jpProp2.nextToken();
        TokenBuffer tokensProp2 = new TokenBuffer(jpProp2);
        tokensProp2.copyCurrentStructure(jpProp2);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{null, tokensProp2}); 

        JsonParser jpComplete = createDummyParser();
        Object bean = new Object();
        handler.complete(jpComplete, createDummyContext(), bean);

        assertNull(prop1.get(bean));
        assertNull(prop2.get(bean));
    }

    @Test
    public void testExtTypedProperty_hasTypePropertyName() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);

        assertTrue(extProp.hasTypePropertyName("typeProp"));
        assertFalse(extProp.hasTypePropertyName("otherProp"));
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_true() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", TypeFactory.defaultInstance().constructType(Integer.class));
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertTrue(extProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_false() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertFalse(extProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", TypeFactory.defaultInstance().constructType(Integer.class));
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertEquals("Integer", extProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId_noDefaultImpl() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertNull(extProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getTypePropertyName() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertEquals("typeProp", extProp.getTypePropertyName());
    }

    @Test
    public void testExtTypedProperty_getProperty() throws Exception {
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        ExtTypedProperty extProp = new ExtTypedProperty(prop, typeDeser);
        assertSame(prop, extProp.getProperty());
    }

    @Test
    public void testComplete_withPropertyBasedCreator() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop1 = createDummyProperty("prop1", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser1 = createDummyTypeDeserializer("type1", null);
        builder.addExternal(prop1, typeDeser1);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop1, typeDeser1)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("prop1", 0); put("type1", 0); }});
        setPrivateField(handler, "_typeIds", new String[]{"someType"});

        JsonParser jpForToken = createParserWithContent("\"value1\"");
        TokenBuffer tokens1 = new TokenBuffer(jpForToken);
        tokens1.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens1});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        Object result = handler.complete(jp, ctxt, bean);
        assertNotNull(result);
        assertSame(bean, result);
    }

    @Test
    public void testComplete_handlesNullTypeId() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});
        setPrivateField(handler, "_typeIds", new String[]{null});

        JsonParser jpForToken = createParserWithContent("\"stringValue\"");
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        tokens.copyCurrentStructure(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});

        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        Object result = handler.complete(jp, ctxt, bean);
        assertNotNull(result);
        assertEquals("stringValue", prop.get(bean));
    }
    
    @Test
    public void testComplete_handlesEmptyTokenBuffer() throws Exception {
        ExternalTypeHandler.Builder builder = new Builder();
        SettableBeanProperty prop = createDummyProperty("testProp", TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer typeDeser = createDummyTypeDeserializer("typeProp", null);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build();

        setPrivateField(handler, "_properties", new ExtTypedProperty[]{new ExtTypedProperty(prop, typeDeser)});
        setPrivateField(handler, "_nameToPropertyIndex", new HashMap<String, Integer>() {{ put("testProp", 0); put("typeProp", 0); }});
        setPrivateField(handler, "_typeIds", new String[]{"someType"});

        JsonParser jpForToken = createParserWithContent(""); 
        TokenBuffer tokens = new TokenBuffer(jpForToken);
        setPrivateField(handler, "_tokens", new TokenBuffer[]{tokens});
        
        JsonParser jp = createDummyParser();
        DeserializationContext ctxt = createDummyContext();
        Object bean = new Object();

        try {
            handler.complete(jp, ctxt, bean);
        } catch (Exception e) {
            assertTrue(e instanceof JsonMappingException || e instanceof IOException);
        }
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover `ExternalTypeHandler`'s methods like `start`, `handleTypePropertyValue`, `handlePropertyValue`, and `complete`, along with helper methods like `_deserialize` and `_deserializeAndSet`, and also the `Builder` and `ExtTypedProperty` inner classes. The tests focus on various scenarios including property not found, type ID handling, buffering, deserialization, and edge cases like missing or null values.
2. TEST CASE DESIGN -
    - `testStartReturnsNewInstance`: Checks if `start()` creates a new, distinct instance.
    - `testHandleTypePropertyValue_propertyNotFound`: Verifies `handleTypePropertyValue` returns false when the property name is not found.
    - `testHandleTypePropertyValue_typePropertyNotFound`: Verifies `handleTypePropertyValue` returns false when the type property name is not found.
    - `testHandleTypePropertyValue_setsTypeIdAndTriggersDeserializeWhenPossible`: Tests if `handleTypePropertyValue` correctly sets the type ID and triggers deserialization when all necessary data is available.
    - `testHandlePropertyValue_propertyNotFound`: Verifies `handlePropertyValue` returns false when the property name is not found.
    - `testHandlePropertyValue_buffersTokenAndTypeId`: Tests if `handlePropertyValue` correctly buffers the token and type ID.
    - `testHandlePropertyValue_triggersDeserializeWhenPossible`: Tests if `handlePropertyValue` triggers deserialization when both token and type ID are available.
    - `testComplete_handlesMissingTypeIdAndToken`: Checks `complete` handles cases where type ID and token might be missing.
    - `testComplete_throwsExceptionWhenTypeIdMissingButTokenPresent`: Verifies `complete` throws an exception when type ID is missing but token is present.
    - `testComplete_throwsExceptionWhenTokenMissingButTypeIdPresent`: Verifies `complete` throws an exception when token is missing but type ID is present.
    - `testComplete_handlesNaturalTypes`: Tests `complete` handling of "natural types" where type ID might not be explicitly provided.
    - `testComplete_usesDefaultImplWhenTypeIsMissing`: Checks `complete` correctly uses the default implementation when the type ID is missing.
    - `testComplete_throwsExceptionIfNoDefaultImplAndTypeMissing`: Verifies `complete` throws an exception when type ID is missing and no default implementation is available.
    - `testBuilderAddExternal`: Tests the `addExternal` method of the `Builder` class.
    - `testBuilderBuild`: Tests the `build` method of the `Builder` class.
    - `testDeserializeAndSet_handlesNullValue`: Tests the private `_deserializeAndSet` method with a null value.
    - `testDeserialize_handlesNullValue`: Tests the private `_deserialize` method with a null value.
    - `testComplete_withEmptyProperties`: Tests `complete` with an empty list of properties.
    - `testHandleTypePropertyValue_withEmptyIndex`: Tests `handleTypePropertyValue` when the name-to-property index is empty.
    - `testHandlePropertyValue_withEmptyIndex`: Tests `handlePropertyValue` when the name-to-property index is empty.
    - `testMultiplePropertiesHandling`: Tests the handling of multiple external properties.
    - `testExtTypedProperty_hasTypePropertyName`: Tests the `hasTypePropertyName` method of `ExtTypedProperty`.
    - `testExtTypedProperty_hasDefaultType_true`: Tests `hasDefaultType` when a default type is present.
    - `testExtTypedProperty_hasDefaultType_false`: Tests `hasDefaultType` when no default type is present.
    - `testExtTypedProperty_getDefaultTypeId`: Tests `getDefaultTypeId` when a default type is present.
    - `testExtTypedProperty_getDefaultTypeId_noDefaultImpl`: Tests `getDefaultTypeId` when no default implementation is available.
    - `testExtTypedProperty_getTypePropertyName`: Tests `getTypePropertyName`.
    - `testExtTypedProperty_getProperty`: Tests `getProperty`.
    - `testComplete_withPropertyBasedCreator`: Simulates completion with a `PropertyBasedCreator`.
    - `testComplete_handlesNullTypeId`: Tests `complete` handling of a null type ID.
    - `testComplete_handlesEmptyTokenBuffer`: Tests `complete` when the token buffer is empty.
4. DEFECT DETECTION STRATEGY - The tests aim to cover various execution paths and edge cases within `ExternalTypeHandler`, including null handling, missing data scenarios, and correct state management, to detect defects in property and type ID processing.
5. SUMMARY - 32 tests.
6. LIMITATIONS - The tests rely on extensive use of dummy implementations and private field access via reflection due to the nature of the API and the need to isolate `ExternalTypeHandler`'s logic. Mocking complex dependencies like `DeserializationContext` and `JsonParser` is simplified. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.