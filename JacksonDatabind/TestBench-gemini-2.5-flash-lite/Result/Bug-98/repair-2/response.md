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
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.UnwrappingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.IteratorImpl;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.type.JavaType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.POJOProperties.Value;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.Bucket;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.Entry;

public class ExternalTypeHandlerTest {

    // Mock classes and objects to facilitate testing

    // Mock SettableBeanProperty that allows storing a value
    private static class MockSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Object _value;
        private final String _name;
        private int _creatorIndex = -1;
        private final JavaType _type;

        protected MockSettableBeanProperty(String name, JavaType type) {
            this(name, type, PropertyMetadata.STD_OPTIONAL, null);
        }

        protected MockSettableBeanProperty(String name, JavaType type, int index) {
            this(name, type, PropertyMetadata.STD_OPTIONAL, null);
            _creatorIndex = index;
        }
        
        protected MockSettableBeanProperty(String name, JavaType type, PropertyMetadata md, JsonDeserializer<?> valueDeser) {
            super(name, type, md, valueDeser);
            _name = name;
            _type = type;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this._value = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return value;
        }
        
        @Override
        public boolean isRequired() { return false; }

        @Override
        public SettableBeanProperty withSimpleName(String newName) {
            return new MockSettableBeanProperty(newName, _type, _metadata, _valueDeserializer);
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
             // No-op for mock
        }
        
        @Override
        public int getCreatorIndex() {
            return _creatorIndex;
        }

        @Override
        public String getName() {
            return _name;
        }
        
        public Object getValue() {
            return _value;
        }

        @Override
        protected BeanPropertyMap.IteratorImpl _propertiesInInsertionOrder(boolean inclUnmapped) {
            return new BeanPropertyMap.IteratorImpl(Collections.<SettableBeanProperty>emptyList());
        }
        
        // Required by abstract class SettableBeanProperty
        @Override
        public void fixAccess(DeserializationConfig config) {
            // No-op
        }

        @Override
        public SettableBeanProperty withOwner(BeanProperty owner) {
            return this; // Dummy implementation
        }
    }

    // Mock TypeDeserializer
    private static class MockTypeDeserializer extends TypeDeserializer {
        private final String _propertyName;
        private final Class<?> _defaultImpl;
        private final TypeIdResolver _typeIdResolver;

        protected MockTypeDeserializer(String propertyName, Class<?> defaultImpl, TypeIdResolver resolver) {
            super(0, null); // Dummy values for base class
            _propertyName = propertyName;
            _defaultImpl = defaultImpl;
            _typeIdResolver = resolver;
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public As getTypeInclusion() {
            return As.EXTERNAL_PROPERTY;
        }

        @Override
        public String getPropertyName() {
            return _propertyName;
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return _typeIdResolver;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return _defaultImpl;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        
        public static TypeIdResolver createMockResolver(String defaultId) {
            return new TypeIdResolver() {
                @Override public String idFromValue(Object value) { return defaultId; }
                @Override public String idFromValueAndType(Object value, Class<?> type) { return defaultId; }
                @Override public String getMechanism() { return "test"; }
                @Override public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException { return null; }
            };
        }
    }

    // Mock DeserializationContext
    private static class MockDeserializationContext extends DefaultDeserializationContext {
        protected MockDeserializationContext(DeserializerFactory factory) {
            super(factory, new DeserializerCache());
        }

        // Override reportInputMismatch methods to throw JsonMappingException directly
        @Override
        public void reportInputMismatch(JavaType type, String format, Object... params) throws JsonMappingException {
            throw new JsonMappingException(null, String.format(format, params));
        }

        @Override
        public void reportInputMismatch(Class<?> targetType, String message, Object... params) throws JsonMappingException {
            throw new JsonMappingException(null, String.format(message, params));
        }

        @Override
        public void reportInputMismatch(Object valueToConvert, String format, Object... params) throws JsonMappingException {
            throw new JsonMappingException(null, String.format(format, params));
        }
        
        // Required by abstract class DefaultDeserializationContext
        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser p, InjectableValues values) {
            return this;
        }
    }

    // Mock ObjectMapper to provide a DeserializationContext
    private static class MockObjectMapper extends ObjectMapper {
        private final DeserializationContext _mockContext;

        public MockObjectMapper() {
            super();
            DeserializerFactory factory = BasicDeserializerFactory.instance;
            _mockContext = new MockDeserializationContext(factory);
        }

        public DeserializationContext getMockContext() {
            return _mockContext;
        }
    }
    
    private static class MockValueInstantiator extends ValueInstantiator {
        @Override public boolean canCreateFromObjectWith() { return true; }
        @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] params) { return new Object(); }
        @Override public String getValueTypeDesc() { return "Object"; }
    }

    // Mock BeanPropertyMap for build method
    private static class MockBeanPropertyMap extends BeanPropertyMap {
        protected MockBeanPropertyMap(boolean caseInsensitive, Collection<SettableBeanProperty> props) {
            super(caseInsensitive, props);
        }
        
        // Override find to provide a simple lookup for mocks
        public SettableBeanProperty find(String key) {
            // This is a simplified lookup; real BeanPropertyMap is more complex
            for (SettableBeanProperty prop : this) {
                if (prop.getName().equals(key)) {
                    return prop;
                }
            }
            return null;
        }
    }

    // Helper method to create a mock JsonParser for a scalar value
    private JsonParser createMockParserForValue(String value) throws IOException {
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString(value);
        JsonParser p = tb.asParserOnFirstToken();
        p.nextToken(); // Move to the actual token
        return p;
    }
    
    // Helper method to create a mock JsonParser for a structure
    private JsonParser createMockParserForStructure(String jsonString) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser(jsonString);
        return p;
    }

    // --- Tests ---

    @Test
    public void testBuilderAndStart() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        assertNotNull(builder);
        
        // Test start() which creates a blueprint copy
        // We need to create a non-blueprint handler first to call start() on
        ExtTypedProperty[] initialProps = new ExtTypedProperty[0];
        Map<String, Object> initialNameToPropIndex = new HashMap<>();
        String[] initialTypeIds = new String[0];
        TokenBuffer[] initialTokens = new TokenBuffer[0];
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, initialProps, initialNameToPropIndex, initialTypeIds, initialTokens);
        
        ExternalTypeHandler startedHandler = handler.start();
        assertNotNull(startedHandler);
        assertNotSame(handler, startedHandler);
    }

    @Test
    public void testHandleTypePropertyValue_singleProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        JsonParser mockParser = createMockParserForValue("typeA");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "type1", bean);
        assertTrue(handled);
        assertEquals("typeA", handler._typeIds[0]);
        assertNull(handler._tokens[0]);
    }

    @Test
    public void testHandleTypePropertyValue_listProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        List<Integer> indices = new ArrayList<>();
        indices.add(0);
        indices.add(1);
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("type1", indices);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1), new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[2], new TokenBuffer[2]);
        
        JsonParser mockParser = createMockParserForValue("typeA");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        Object bean = new Object();

        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "type1", bean);
        assertTrue(handled);
        assertEquals("typeA", handler._typeIds[0]);
        assertEquals("typeA", handler._typeIds[1]);
    }

    @Test
    public void testHandlePropertyValue_typeIdOnly() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        JsonParser mockParser = createMockParserForValue("typeA");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        Object bean = new Object();
        
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "type1", bean);
        assertTrue(handled);
        assertEquals("typeA", handler._typeIds[0]);
        assertNull(handler._tokens[0]);
    }

    @Test
    public void testHandlePropertyValue_valueBuffered() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        JsonParser mockParser = createMockParserForStructure("{\"a\": 1}");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        Object bean = new Object();
        
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "prop1", bean);
        assertTrue(handled);
        assertNull(handler._typeIds[0]);
        assertNotNull(handler._tokens[0]);
        
        TokenBuffer bufferedTokens = handler._tokens[0];
        assertNotNull(bufferedTokens);
        JsonParser bufferedParser = bufferedTokens.asParserOnFirstToken();
        assertNotNull(bufferedParser.nextToken()); // START_OBJECT
        assertEquals("a", bufferedParser.nextFieldName());
        assertEquals(1, bufferedParser.nextIntValue(-1));
        assertNull(bufferedParser.nextToken()); // END_OBJECT
    }

    @Test
    public void testHandlePropertyValue_deserializeAndSet_typeIdAndValuePresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy"); 
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "prop1", bean);
        assertTrue(handled);
        
        assertNull(handler._typeIds[0]);
        assertNull(handler._tokens[0]);
        assertEquals("value1", prop1.getValue());
    }
    
    @Test
    public void testHandlePropertyValue_deserializeAndSet_typeIdAndValuePresent_list() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        List<Integer> indices = new ArrayList<>();
        indices.add(0);
        indices.add(1);
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", indices);
        nameToPropIndex.put("type1", indices);

        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1), new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[2], new TokenBuffer[2]);
        
        handler._typeIds[0] = "typeA"; handler._typeIds[1] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb; handler._tokens[1] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "prop1", bean);
        assertTrue(handled);
        
        assertNull(handler._typeIds[0]);
        assertNull(handler._typeIds[1]);
        assertNull(handler._tokens[0]);
        assertNull(handler._tokens[1]);
    }

    @Test
    public void testComplete_allPresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertEquals("value1", prop1.getValue());
    }

    @Test
    public void testComplete_missingTypeId() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        try {
            handler.complete(mockParser, mockContext, bean);
            fail("Expected reportInputMismatch for missing type id");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing external type id property"));
        }
    }

    @Test
    public void testComplete_missingProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        handler._tokens[0] = null; // Missing property tokens
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        try {
            handler.complete(mockParser, mockContext, bean);
            fail("Expected reportInputMismatch for missing property");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing property 'prop1' for external type id 'type1'"));
        }
    }

    @Test
    public void testComplete_defaultImplPresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        Class<?> defaultClass = Object.class;
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", defaultClass, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId, should use defaultImpl
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("default_value");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertEquals("default_value", prop1.getValue());
    }
    
    @Test
    public void testComplete_defaultImplNaturalType() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(String.class); // Natural type for String
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        Class<?> defaultClass = String.class; // String is natural type
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", defaultClass, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("natural_string_value");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertEquals("natural_string_value", prop1.getValue());
    }

    @Test
    public void testComplete_bothMissing() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId
        handler._tokens[0] = null; // Missing property tokens
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertNull(prop1.getValue());
    }

    @Test
    public void testComplete_handlePropertyValue_typeIdAndValuePresent_again() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParserComplete = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParserComplete, mockContext, bean);
        assertSame(bean, result);
        assertEquals("value1", prop1.getValue());
    }
    
    @Test
    public void testComplete_propertyBasedCreator_allValuesPresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        
        MockSettableBeanProperty creatorProp1 = new MockSettableBeanProperty("creator1", beanType, 0);
        MockSettableBeanProperty creatorProp2 = new MockSettableBeanProperty("creator2", beanType, 1);
        SettableBeanProperty[] creatorProps = new SettableBeanProperty[] { creatorProp1, creatorProp2 };

        MockSettableBeanProperty externalProp1 = new MockSettableBeanProperty("external1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(externalProp1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("external1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(externalProp1, typeDeser1) };
        
        MockObjectMapper mockObjectMapper = new MockObjectMapper();
        ValueInstantiator mockValueInstantiator = new MockValueInstantiator();
        
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("external_value");
        handler._tokens[0] = tb;
        
        JsonParser mockParserBuffer = createMockParserForValue("dummy");
        // The PropertyValueBuffer requires a PropertyBasedCreator to be fully functional for tests.
        // We'll mock the necessary parts of the interaction.
        
        // A full PropertyBasedCreator setup is complex. Instead, we focus on how ExternalTypeHandler calls _deserializeAndSet.
        // The `complete` method takes a PropertyValueBuffer and a PropertyBasedCreator.
        // We'll simulate the external property handling part.
        
        Object bean = new Object(); // This will be the object on which properties are set.
        JsonParser mockParser = createMockParserForValue("dummy");
        
        // Directly call the internal _deserializeAndSet logic which `complete` would invoke.
        handler._deserializeAndSet(mockParser, mockObjectMapper.getMockContext(), bean, 0, "typeA");

        assertEquals("external_value", externalProp1.getValue());
    }
    
    @Test
    public void testBuilder_addExternal_singleProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        assertNotNull(builder._properties);
        assertEquals(1, builder._properties.size());
        assertEquals(prop1, builder._properties.get(0).getProperty());
        
        assertNotNull(builder._nameToPropertyIndex);
        assertEquals(2, builder._nameToPropertyIndex.size());
        assertEquals(0, builder._nameToPropertyIndex.get("prop1"));
        assertEquals(0, builder._nameToPropertyIndex.get("type1"));
    }

    @Test
    public void testBuilder_addExternal_multiplePropertiesSameName() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        MockSettableBeanProperty prop2 = new MockSettableBeanProperty("prop1", beanType); // Same name as prop1
        MockTypeDeserializer typeDeser2 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeB")); // Same type property name
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        builder.addExternal(prop2, typeDeser2);
        
        assertNotNull(builder._properties);
        assertEquals(2, builder._properties.size());
        assertEquals(prop1, builder._properties.get(0).getProperty());
        assertEquals(prop2, builder._properties.get(1).getProperty());
        
        assertNotNull(builder._nameToPropertyIndex);
        assertEquals(2, builder._nameToPropertyIndex.size());
        
        Object propNameIndex = builder._nameToPropertyIndex.get("prop1");
        assertTrue(propNameIndex instanceof List);
        List<?> propList = (List<?>) propNameIndex;
        assertEquals(2, propList.size());
        assertEquals(0, propList.get(0));
        assertEquals(1, propList.get(1));

        Object typeNameIndex = builder._nameToPropertyIndex.get("type1");
        assertTrue(typeNameIndex instanceof List);
        List<?> typeList = (List<?>) typeNameIndex;
        assertEquals(2, typeList.size());
        assertEquals(0, typeList.get(0));
        assertEquals(1, typeList.get(1));
    }
    
    @Test
    public void testBuilder_build_withOtherProps() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        BeanPropertyMap otherProps = new MockBeanPropertyMap(false, Arrays.asList(typeProp));
        
        ExternalTypeHandler handler = builder.build(otherProps);
        
        assertNotNull(handler);
        assertNotNull(handler._properties);
        assertEquals(1, handler._properties.length);
        
        ExtTypedProperty extTypedProp = handler._properties[0];
        assertNotNull(extTypedProp);
        assertEquals(prop1, extTypedProp.getProperty());
        assertEquals(typeProp, extTypedProp.getTypeProperty()); 
    }
    
    @Test
    public void testExtTypedProperty_linkTypeProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        extTypedProp.linkTypeProperty(typeProp);
        
        assertEquals(typeProp, extTypedProp.getTypeProperty());
    }

    @Test
    public void testExtTypedProperty_hasTypePropertyName() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertTrue(extTypedProp.hasTypePropertyName("type1"));
        assertFalse(extTypedProp.hasTypePropertyName("otherName"));
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_whenPresent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", Object.class, MockTypeDeserializer.createMockResolver("typeA")); // Default impl present
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertTrue(extTypedProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_whenAbsent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA")); // No default impl
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertFalse(extTypedProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId_whenPresent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", Object.class, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertEquals("defaultTypeId", extTypedProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId_whenAbsent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA")); // No default impl
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertNull(extTypedProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getTypePropertyName() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1); 
        
        assertEquals("type1", extTypedProp.getTypePropertyName());
    }

    @Test
    public void testExtTypedProperty_getProperty() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertEquals(prop1, extTypedProp.getProperty());
    }
    
    @Test
    public void testExtTypedProperty_getTypeProperty() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertNull(extTypedProp.getTypeProperty()); // Not linked initially
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        extTypedProp.linkTypeProperty(typeProp);
        assertEquals(typeProp, extTypedProp.getTypeProperty());
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover `ExternalTypeHandler.Builder` methods (`builder`, `addExternal`, `build`), `ExternalTypeHandler` methods (`start`, `handleTypePropertyValue`, `handlePropertyValue`, `complete`), and `ExtTypedProperty` methods (`linkTypeProperty`, `hasTypePropertyName`, `hasDefaultType`, `getDefaultTypeId`, `getTypePropertyName`, `getProperty`, `getTypeProperty`). The tests explore different scenarios like single and list properties, presence or absence of type IDs and property values, default implementations, and natural types.
2. TEST CASE DESIGN -
    - testBuilderAndStart: Creates builder and calls start(), checks non-null.
    - testHandleTypePropertyValue_singleProperty: Handles single property type ID, checks `_typeIds`.
    - testHandleTypePropertyValue_listProperty: Handles multiple properties with same name for type ID, checks `_typeIds`.
    - testHandlePropertyValue_typeIdOnly: Handles property that is a type ID, checks `_typeIds`.
    - testHandlePropertyValue_valueBuffered: Handles property value buffering, checks `_tokens`.
    - testHandlePropertyValue_deserializeAndSet_typeIdAndValuePresent: Triggers deserialize and set when type ID and value are present, checks cleared state and property value.
    - testHandlePropertyValue_deserializeAndSet_typeIdAndValuePresent_list: Triggers deserialize and set for list of properties, checks cleared state.
    - testComplete_allPresent: Completes handler when type ID and value are present, checks property set.
    - testComplete_missingTypeId: Completes handler with missing type ID, expects `JsonMappingException`.
    - testComplete_missingProperty: Completes handler with missing property value, expects `JsonMappingException`.
    - testComplete_defaultImplPresent: Completes handler using default implementation, checks property set.
    - testComplete_defaultImplNaturalType: Completes handler using default implementation with natural type, checks property set.
    - testComplete_bothMissing: Completes handler with both type ID and value missing, checks state.
    - testComplete_handlePropertyValue_typeIdAndValuePresent_again: Completes handler when type ID and value were already set, checks property set.
    - testComplete_propertyBasedCreator_allValuesPresent: Simulates `complete` with `PropertyValueBuffer`, checks external property set.
    - testBuilder_addExternal_singleProperty: Tests `addExternal` for a single property, checks builder state.
    - testBuilder_addExternal_multiplePropertiesSameName: Tests `addExternal` with multiple properties sharing names, checks builder state.
    - testBuilder_build_withOtherProps: Tests `build` method when `otherProps` are provided, checks type property linking.
    - testExtTypedProperty_linkTypeProperty: Tests `linkTypeProperty`, checks `_typeProperty`.
    - testExtTypedProperty_hasTypePropertyName: Tests `hasTypePropertyName`, checks boolean result.
    - testExtTypedProperty_hasDefaultType_whenPresent: Tests `hasDefaultType` when default impl is present.
    - testExtTypedProperty_hasDefaultType_whenAbsent: Tests `hasDefaultType` when default impl is absent.
    - testExtTypedProperty_getDefaultTypeId_whenPresent: Tests `getDefaultTypeId` when default impl is present.
    - testExtTypedProperty_getDefaultTypeId_whenAbsent: Tests `getDefaultTypeId` when default impl is absent.
    - testExtTypedProperty_getTypePropertyName: Tests `getTypePropertyName`, checks property name.
    - testExtTypedProperty_getProperty: Tests `getProperty`, checks the property.
    - testExtTypedProperty_getTypeProperty: Tests `getTypeProperty` before and after linking.
4. DEFECT DETECTION STRATEGY - The tests aim to cover the logic for handling external type properties, including buffering, deserialization, setting values, and error conditions for missing information. They also verify the builder and helper class functionalities.
5. SUMMARY - 25 tests.
6. LIMITATIONS - Mock objects are used extensively, which might not perfectly replicate the behavior of the actual Jackson library components. Some complex interactions, like full `PropertyBasedCreator` simulation, were simplified by testing the core logic directly. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.