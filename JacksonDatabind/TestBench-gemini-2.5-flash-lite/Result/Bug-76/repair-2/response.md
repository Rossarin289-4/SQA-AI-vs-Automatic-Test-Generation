```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.SimpleType; // Added import
import com.fasterxml.jackson.databind.cfg.DeserializationConfig; // Added import
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap; // Added import
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.IteratorImpl; // Added import
import com.fasterxml.jackson.databind.util.ArrayIterator; // Added import

// Mockito imports replaced with basic mocks where possible, or removed if not essential.
// Mockito.when, Mockito.verify etc are not used.

public class BuilderBasedDeserializerTest {

    // Mock implementation for DeserializationContext
    private static class MockDeserializationContext extends DeserializationContext {
        protected MockDeserializationContext() {
            super(null, null, null); // Pass nulls for config, type, injector
        }

        @Override
        public void handleUnknownProperty(JsonParser p, Object beanOrClass, String propertyName) throws IOException {
            // Default implementation, does nothing for tests
        }

        @Override
        public void handleUnknownToken(Class<?> tokenClass, JsonParser p) throws IOException {
            // Default implementation
        }

        @Override
        public Object handleWeirdKey(Map<Object, Object> map, String key, JsonParser p, DeserializationContext ctxt) throws IOException {
            return null; // Default
        }

        @Override
        public Object handleWeirdStringValue(Class<?> targetClass, String value, JsonParser p, DeserializationContext ctxt) throws IOException {
            return null; // Default
        }

        @Override
        public Object handleWeirdNumberValue(Class<?> targetClass, Number value, JsonParser p, DeserializationContext ctxt) throws IOException {
            return null; // Default
        }

        @Override
        public Object handleDefaultCreation(DeserializationContext ctxt, Class<?> forValueType) throws IOException {
            return null; // Default
        }

        @Override
        public Object readValue(JsonParser p, JavaType type) throws IOException {
            return null; // Default
        }

        @Override
        public JsonDeserializer<Object> deserializerFor(Class<?> aClass) throws JsonMappingException {
            return null; // Default
        }

        @Override
        public Class<?> getActiveView() {
            return null; // Default
        }

        @Override
        public BeanDescription getActiveDescriptor() {
            return null; // Default
        }

        @Override
        public DeserializationConfig getConfig() {
            return null; // Default
        }

        @Override
        public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc) {
            return null; // Default
        }

        @Override
        public void injectValues(DeserializationContext ctxt, Object bean) throws IOException {
            // Default
        }

        @Override
        public void reportInputMismatch(BeanProperty prop, String msg, Object... params) throws JsonMappingException {
            // Default
        }
        @Override
        public void reportInputMismatch(JavaType targetType, String msg, Object... params) throws JsonMappingException {
            // Default
        }

        @Override
        public void reportPropertyScan(Class<?> beanType, BeanPropertyMap props) throws JsonMappingException {
            // Default
        }

        @Override
        public void reportBadMerge(BeanProperty prop, Object bean, String msg, Object... params) throws JsonMappingException {
            // Default
        }
    }

    // Mock implementation for JsonParser
    private static class MockJsonParser extends JsonParser {
        private JsonToken _currentToken;
        private String _currentName;
        private String _text;
        private int _intValue;
        private double _doubleValue;
        private boolean _booleanValue;
        private Object _embeddedObject;
        private Iterator<Map.Entry<String, Object>> _objectIterator;
        private Map.Entry<String, Object> _currentEntry;
        private Iterator<Object> _arrayIterator;
        private Object _currentArrayValue;

        public void setCurrentToken(JsonToken token) { _currentToken = token; }
        public void setCurrentName(String name) { _currentName = name; }
        public void setText(String text) { _text = text; }
        public void setIntValue(int value) { _intValue = value; }
        public void setDoubleValue(double value) { _doubleValue = value; }
        public void setBooleanValue(boolean value) { _booleanValue = value; }
        public void setEmbeddedObject(Object obj) { _embeddedObject = obj; }

        public void setFields(Map<String, Object> fields) {
            List<Map.Entry<String, Object>> entries = new ArrayList<>();
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                entries.add(new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()));
            }
            _objectIterator = entries.iterator();
            _currentEntry = null;
        }

        public void setArrayValues(List<Object> values) {
            _arrayIterator = values.iterator();
            _currentArrayValue = null;
        }

        @Override public JsonToken nextToken() throws IOException {
            if (_currentToken == JsonToken.START_OBJECT) {
                _currentToken = JsonToken.FIELD_NAME;
                if (_objectIterator != null && _objectIterator.hasNext()) {
                    _currentEntry = _objectIterator.next();
                    _currentName = _currentEntry.getKey();
                    _currentToken = JsonToken.VALUE_STRING; // Default to string for simplicity
                    if (_currentEntry.getValue() instanceof String) _text = (String) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Integer) _intValue = (Integer) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Double) _doubleValue = (Double) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Boolean) _booleanValue = (Boolean) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Map) {
                        _currentToken = JsonToken.START_OBJECT; // Recursive object
                    } else if (_currentEntry.getValue() instanceof List) {
                        _currentToken = JsonToken.START_ARRAY; // Recursive array
                    } else {
                        _embeddedObject = _currentEntry.getValue();
                    }
                } else {
                    _currentToken = JsonToken.END_OBJECT;
                }
            } else if (_currentToken == JsonToken.FIELD_NAME) {
                _currentToken = JsonToken.VALUE_STRING; // Default to string for simplicity
                if (_objectIterator != null && _objectIterator.hasNext()) {
                    _currentEntry = _objectIterator.next();
                    _currentName = _currentEntry.getKey();
                    if (_currentEntry.getValue() instanceof String) _text = (String) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Integer) _intValue = (Integer) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Double) _doubleValue = (Double) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Boolean) _booleanValue = (Boolean) _currentEntry.getValue();
                    if (_currentEntry.getValue() instanceof Map) {
                        _currentToken = JsonToken.START_OBJECT;
                    } else if (_currentEntry.getValue() instanceof List) {
                        _currentToken = JsonToken.START_ARRAY;
                    } else {
                        _embeddedObject = _currentEntry.getValue();
                    }
                } else {
                    _currentToken = JsonToken.END_OBJECT;
                }
            } else if (_currentToken == JsonToken.START_ARRAY) {
                _currentToken = JsonToken.VALUE_STRING; // Default to string for simplicity
                if (_arrayIterator != null && _arrayIterator.hasNext()) {
                    _currentArrayValue = _arrayIterator.next();
                    if (_currentArrayValue instanceof String) _text = (String) _currentArrayValue;
                    if (_currentArrayValue instanceof Integer) _intValue = (Integer) _currentArrayValue;
                    if (_currentArrayValue instanceof Double) _doubleValue = (Double) _currentArrayValue;
                    if (_currentArrayValue instanceof Boolean) _booleanValue = (Boolean) _currentArrayValue;
                    if (_currentArrayValue instanceof Map) {
                        _currentToken = JsonToken.START_OBJECT;
                    } else if (_currentArrayValue instanceof List) {
                        _currentToken = JsonToken.START_ARRAY;
                    } else {
                        _embeddedObject = _currentArrayValue;
                    }
                } else {
                    _currentToken = JsonToken.END_ARRAY;
                }
            } else if (_currentToken == JsonToken.END_OBJECT || _currentToken == JsonToken.END_ARRAY) {
                // stay there until reset
            } else if (_currentToken == JsonToken.VALUE_STRING && _currentEntry != null && _currentEntry.getValue() instanceof Map) {
                // recursively call nextToken for nested object
                MockJsonParser nestedParser = new MockJsonParser();
                nestedParser.setFields((Map<String, Object>) _currentEntry.getValue());
                nestedParser.setCurrentToken(JsonToken.START_OBJECT);
                nestedParser.nextToken();
                Object result = nestedParser.deserialize(this, null); // pass current parser and null context
                _embeddedObject = result;
                _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;
            } else if (_currentToken == JsonToken.VALUE_STRING && _currentEntry != null && _currentEntry.getValue() instanceof List) {
                // recursively call nextToken for nested array
                MockJsonParser nestedParser = new MockJsonParser();
                nestedParser.setArrayValues((List<Object>) _currentEntry.getValue());
                nestedParser.setCurrentToken(JsonToken.START_ARRAY);
                nestedParser.nextToken();
                Object result = nestedParser.deserialize(this, null); // pass current parser and null context
                _embeddedObject = result;
                _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;
            }
            else {
                // Advance to next state or handle transitions
                if (_currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    if (_currentEntry != null && _currentEntry.getValue() instanceof Map) {
                        _currentToken = JsonToken.FIELD_NAME; // Prepare for next field
                    } else if (_currentEntry != null && _currentEntry.getValue() instanceof List) {
                        _currentToken = JsonToken.VALUE_STRING; // Prepare for next array element
                    }
                } else if (_currentToken == JsonToken.START_OBJECT) {
                     if (_objectIterator != null && _objectIterator.hasNext()) {
                        _currentEntry = _objectIterator.next();
                        _currentName = _currentEntry.getKey();
                        _currentToken = JsonToken.VALUE_STRING;
                        if (_currentEntry.getValue() instanceof String) _text = (String) _currentEntry.getValue();
                        if (_currentEntry.getValue() instanceof Integer) _intValue = (Integer) _currentEntry.getValue();
                        if (_currentEntry.getValue() instanceof Double) _doubleValue = (Double) _currentEntry.getValue();
                        if (_currentEntry.getValue() instanceof Boolean) _booleanValue = (Boolean) _currentEntry.getValue();
                        if (_currentEntry.getValue() instanceof Map) {
                            _currentToken = JsonToken.START_OBJECT;
                        } else if (_currentEntry.getValue() instanceof List) {
                            _currentToken = JsonToken.START_ARRAY;
                        } else {
                            _embeddedObject = _currentEntry.getValue();
                        }
                    } else {
                        _currentToken = JsonToken.END_OBJECT;
                    }
                } else if (_currentToken == JsonToken.START_ARRAY) {
                    if (_arrayIterator != null && _arrayIterator.hasNext()) {
                        _currentArrayValue = _arrayIterator.next();
                        if (_currentArrayValue instanceof String) _text = (String) _currentArrayValue;
                        if (_currentArrayValue instanceof Integer) _intValue = (Integer) _currentArrayValue;
                        if (_currentArrayValue instanceof Double) _doubleValue = (Double) _currentArrayValue;
                        if (_currentArrayValue instanceof Boolean) _booleanValue = (Boolean) _currentArrayValue;
                        if (_currentArrayValue instanceof Map) {
                            _currentToken = JsonToken.START_OBJECT;
                        } else if (_currentArrayValue instanceof List) {
                            _currentToken = JsonToken.START_ARRAY;
                        } else {
                            _embeddedObject = _currentArrayValue;
                        }
                    } else {
                        _currentToken = JsonToken.END_ARRAY;
                    }
                } else {
                     // default progression
                    if (_currentToken == JsonToken.VALUE_NUMBER_INT) _currentToken = JsonToken.FIELD_NAME; // Example transition
                    else if (_currentToken == JsonToken.END_OBJECT) { /* no change */ }
                    else if (_currentToken == JsonToken.END_ARRAY) { /* no change */ }
                    else if (_currentToken == JsonToken.VALUE_STRING) {
                         if (_currentEntry != null && _currentEntry.getValue() instanceof Map) {
                            _currentToken = JsonToken.START_OBJECT;
                        } else if (_currentEntry != null && _currentEntry.getValue() instanceof List) {
                            _currentToken = JsonToken.START_ARRAY;
                        } else {
                            _embeddedObject = _currentEntry.getValue();
                            _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                        }
                    } else {
                         _currentToken = JsonToken.FIELD_NAME; // Default fallback
                    }
                }
            }
            return _currentToken;
        }

        @Override public JsonToken getCurrentToken() { return _currentToken; }
        @Override public String getCurrentName() throws IOException { return _currentName; }
        @Override public String getText() throws IOException { return _text; }
        @Override public int getIntValue() throws IOException { return _intValue; }
        @Override public double getDoubleValue() throws IOException { return _doubleValue; }
        @Override public boolean getBooleanValue() throws IOException { return _booleanValue; }
        @Override public Object getEmbeddedObject() throws IOException { return _embeddedObject; }
        @Override public void close() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public JsonParser skipChildren() throws IOException { return this; }
        @Override public void consumeValue(Object value) {}
        @Override public boolean canParseAsync() { return false;}
        @Override public boolean hasTextCharacters() { return false;}
        @Override public char[] getTextCharacters() throws IOException { return getText().toCharArray();}
        @Override public int getTextLength() throws IOException { return getText().length();}
        @Override public int getTextOffset() throws IOException { return 0;}
        @Override public int getNumberType() throws IOException { return 0;}
        @Override public Number getNumberValue() throws IOException { return null;}
        @Override public <T> T readValueAs(Class<T> valueType) throws IOException { return null;}
        @Override public <T> T readValueAs(TypeReference<T> valueTypeRef) throws IOException { return null;}
        @Override public <T> T readValueAsTree() throws IOException { return null;}
        @Override public JsonNode readTree(JsonParser p) throws IOException { return null;}
        @Override public TreeNode asTree(JsonParser p) throws IOException { return null;}

        // Mocking methods that are called in the tests
        public Object handleUnexpectedToken(Class<?> tokenClass, JsonParser p) throws IOException {
            return null; // For tests, we return null
        }
        public Object handleUnknownProperty(JsonParser p, DeserializationContext ctxt, Object bean, String propName) throws IOException {
            return null; // For tests
        }
        public void handleIgnoredProperty(JsonParser p, DeserializationContext ctxt, Object bean, String propName) throws IOException {
            // no-op
        }
        public void handleUnknownVanilla(JsonParser p, DeserializationContext ctxt, Object bean, String propName) throws IOException {
            // no-op
        }
    }

    // Mock implementation for BeanDescription
    private static class MockBeanDescription extends BeanDescription {
        protected MockBeanDescription(DeserializationConfig config, JavaType type, AnnotatedClass classInfo, List<Bean>) {
            super(config, type, classInfo, Collections.emptyList()); // Pass empty list for properties
        }

        public MockBeanDescription() {
            super(null, SimpleType.constructUnsafe(Object.class), null, Collections.emptyList()); // Pass nulls for config, type, classInfo
        }
    }

    // Mock implementation for BeanPropertyMap
    private static class MockBeanPropertyMap extends BeanPropertyMap {
        private Map<String, SettableBeanProperty> _properties = new LinkedHashMap<>();

        // Constructor used in tests
        public MockBeanPropertyMap() {
            super(null, Collections.emptyList(), null); // Pass nulls for config, properties, ignored
        }

        public void addProperty(SettableBeanProperty prop) {
            if (prop != null) {
                _properties.put(prop.getName(), prop);
            }
        }

        @Override
        public SettableBeanProperty find(String name) {
            return _properties.get(name);
        }

        @Override
        public Iterator<SettableBeanProperty> iterator() {
            return _properties.values().iterator();
        }

        @Override
        public int size() {
            return _properties.size();
        }

        @Override
        public void replace(SettableBeanProperty newProp) {
            if (newProp != null) {
                _properties.put(newProp.getName(), newProp);
            }
        }

        public static BeanPropertyMap construct(Collection<SettableBeanProperty> props, boolean forCtor) {
            MockBeanPropertyMap map = new MockBeanPropertyMap();
            if (props != null) {
                for (SettableBeanProperty prop : props) {
                    map.addProperty(prop);
                }
            }
            return map;
        }
    }


    // Mock implementation for SettableBeanProperty
    private static abstract class MockSettableBeanProperty extends SettableBeanProperty {
        protected MockSettableBeanProperty(PropertyMetadata md, JavaType type) {
            super(md, type);
        }
        protected MockSettableBeanProperty(String name, JavaType type, PropertyMetadata md, AnnotatedMember member) {
            super(name, type, md, member);
        }
        protected MockSettableBeanProperty(SettableBeanProperty src) { super(src); }

        @Override public void fixAccess(DeserializationConfig config) {}
        @Override public abstract Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException;
        @Override public void set(Object instance, Object value) throws IOException {
            deserializeSetAndReturn(null, null, instance); // Not used in tests, but required
        }
        @Override public Object setAndReturn(Object instance, Object value) throws IOException {
             set(instance, value);
             return instance;
        }
        @Override public String getName() { return "mockProp"; } // Default name
        @Override public JavaType getType() { return SimpleType.constructUnsafe(Object.class); } // Default type
        @Override public void depositSchemaProperty(ObjectBuilder builder, JsonNode schemaNode) {}
        @Override public boolean visibleInView(Class<?> activeView) { return true; } // Default to visible
        @Override protected BeanProperty findInclusion() { return null; }
        @Override public int getCreatorIndex() { return -1; }
        @Override public boolean isVisibleInView(Class<?> activeView) { return true; } // Added to satisfy interface
    }

    // Mock implementation for ValueInstantiator
    private static class MockValueInstantiator extends ValueInstantiator {
        protected final JavaType _valueType;

        public MockValueInstantiator(JavaType valueType) {
            _valueType = valueType;
        }

        public MockValueInstantiator() {
            this(SimpleType.constructUnsafe(Object.class));
        }

        @Override
        public ValueInstantiator copy() {
            return this;
        }

        @Override
        public JavaType getValueTypeDesc() {
            return _valueType;
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
            return new Object(); // Default to a new Object
        }

        @Override
        public boolean canCreateFromString() {
            return true;
        }

        @Override
        public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
            return "MockString:" + value;
        }

        @Override
        public boolean canCreateFromInt() {
            return true;
        }

        @Override
        public Object createFromInt(DeserializationContext ctxt, int value) throws IOException {
            return Integer.valueOf(value);
        }

        @Override
        public boolean canCreateFromLong() {
            return true;
        }

        @Override
        public Object createFromLong(DeserializationContext ctxt, long value) throws IOException {
            return Long.valueOf(value);
        }

        @Override
        public boolean canCreateFromDouble() {
            return true;
        }

        @Override
        public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException {
            return Double.valueOf(value);
        }

        @Override
        public boolean canCreateFromBoolean() {
            return true;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException {
            return Boolean.valueOf(value);
        }

        @Override
        public boolean canCreateFromNull() {
            return true;
        }

        @Override
        public Object createFromNull(DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public boolean canCreateUsingDelegate() {
            return true;
        }

        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
            return delegate;
        }

        @Override
        public boolean canCreateFromObjectWith() {
            return true;
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] properties) throws IOException {
            return new Object();
        }

        @Override
        public SettableBeanProperty findCreatorProperty(PropertyName name) {
            return null; // Default
        }

        @Override
        public boolean canInstantiate() {
            return true;
        }
    }

    // Helper to create a TokenBuffer
    private TokenBuffer createTokenBuffer(DeserializationContext ctxt) throws IOException {
        return new TokenBuffer(null, false);
    }

    // Helper to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription() {
        return new MockBeanDescription();
    }

    // Helper to create a dummy BeanPropertyMap
    private BeanPropertyMap createDummyBeanPropertyMap() {
        return new MockBeanPropertyMap();
    }

    // Helper to create a dummy DeserializationConfig
    private DeserializationConfig createDummyDeserializationConfig() {
        return new DeserializationConfig(null, null, null); // Pass nulls
    }

    @Test
    public void testDeserializeStartObjectThenEndObject() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        // Simulate the parser progression: START_OBJECT -> END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        // The result depends on the ValueInstantiator. Since it's a default mock, it returns a new Object.
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeValueString() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("testString");

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
                return "Deserialized:" + value;
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertEquals("Deserialized:testString", result);
    }

    @Test
    public void testDeserializeValueNumberInt() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        mockParser.setIntValue(123);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromInt(DeserializationContext ctxt, int value) throws IOException {
                return Integer.valueOf(value * 2);
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertEquals(Integer.valueOf(246), result);
    }

    @Test
    public void testDeserializeValueNumberFloat() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        mockParser.setDoubleValue(123.45);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException {
                return Double.valueOf(value + 0.5);
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertEquals(Double.valueOf(123.95), result);
    }

    @Test
    public void testDeserializeValueTrue() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_TRUE);
        mockParser.setBooleanValue(true);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException {
                return Boolean.valueOf(!value);
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testDeserializeValueFalse() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_FALSE);
        mockParser.setBooleanValue(false);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException {
                return Boolean.valueOf(!value);
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testDeserializeStartArray() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_ARRAY);
        // Simulate array content: [1, 2]
        List<Object> values = Arrays.asList(1, 2);
        mockParser.setArrayValues(values);
        mockParser.nextToken(); // consumes START_ARRAY, sets first element

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createFromObject(DeserializationContext ctxt) throws IOException { // createFromObject is not used here, need createFromInt etc.
                return new ArrayList<>();
            }
            @Override
            public Object createFromInt(DeserializationContext ctxt, int value) throws IOException {
                 // This mock is not ideal for simulating array deserialization from scratch.
                 // The actual logic in deserializeFromArray handles this.
                 // For this test, we just need a successful call.
                return new ArrayList<>(Arrays.asList(value));
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        // The result should be an ArrayList based on the mock ValueInstantiator
        assertTrue(result instanceof List);
        assertEquals(2, ((List<?>) result).size()); // Based on the mock values [1, 2]
    }

    @Test
    public void testDeserializeFieldNameThenEndObject() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("fieldName");
        // Simulate parser progression: FIELD_NAME -> END_OBJECT
        mockParser.nextToken(); // advances to END_OBJECT

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertTrue(result instanceof Object); // Default creation
    }

    @Test
    public void testFinishBuildWithNullBuildMethod() throws Exception {
        Object builderInstance = new Object(); // A dummy builder instance

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null); // Explicitly null build method

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object finishBuildResult = deserializer.finishBuild(mockCtxt, builderInstance);
        assertSame(builderInstance, finishBuildResult);
    }

    @Test
    public void testFinishBuildWithExceptionInInvoke() throws Exception {
        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object builderInstance = new Object();
        Exception buildException = new RuntimeException("Build method failed");

        // Mocking the build method to throw an exception
        AnnotatedMethod mockBuildMethod = new AnnotatedMethod(null, null, null, null) {
            @Override
            public Object callOnWith(Object pojo, Object... args) throws Exception {
                throw buildException;
            }
        };

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(mockBuildMethod, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        try {
            deserializer.finishBuild(mockCtxt, builderInstance);
            fail("Expected an exception to be thrown");
        } catch (IOException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Build method failed", e.getCause().getMessage());
        }
    }


    @Test
    public void testDeserializeWithNullToken() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(null);

        MockDeserializationContext mockCtxt = new MockDeserializationContext() {
            @Override
            public Object handleUnexpectedToken(Class<?> tokenClass, JsonParser p) throws IOException {
                return null; // Override to return null
            }
        };

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeWithUnknownToken() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT); // Not handled in switch statement

        MockDeserializationContext mockCtxt = new MockDeserializationContext() {
            @Override
            public Object handleUnexpectedToken(Class<?> tokenClass, JsonParser p) throws IOException {
                return null; // Override to return null
            }
        };

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNull(result);
    }

    // Helper to create a mock SettableBeanProperty
    private SettableBeanProperty createMockSettableBeanProperty(String name, JavaType type) {
        return new MockSettableBeanProperty(name, type, PropertyMetadata.STD_REQUIRED_OPTIONAL, null) {
            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                // Default to returning the instance without modification for simplicity
                return instance;
            }
        };
    }

    @Test
    public void testDeserializeFromObjectWithDelegate() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        Object delegateValue = new Object();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
                return delegate; // Return the delegate value directly as the builder
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        // Mock the delegate deserializer
        JsonDeserializer<Object> delegateDeserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return delegateValue;
            }
        };
        deserializer._delegateDeserializer = delegateDeserializer;

        Object finalResult = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(delegateValue, finalResult);
    }

    @Test
    public void testDeserializeFromObjectWithPropertyBasedCreator() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("prop");
        mockParser.nextToken(); // Advance to VALUE_STRING
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("value");
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        // Mock PropertyBasedCreator and ValueInstantiator
        PropertyBasedCreator creator = new PropertyBasedCreator(null, null, new SettableBeanProperty[0]) {
            @Override
            public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws IOException {
                return new Object(); // Mock created object
            }
            @Override
            public SettableBeanProperty findCreatorProperty(String name) { return null;}
        };
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return new Object(); // Mock object creation
            }
            @Override
            public boolean canCreateUsingDefault() { return true;}
            @Override
            public PropertyBasedCreator propertyBasedCreator() { return creator;}
        });

        MockBeanPropertyMap props = new MockBeanPropertyMap();
        props.addProperty(createMockSettableBeanProperty("prop", SimpleType.constructUnsafe(String.class)));
        BeanPropertyMap beanProperties = props;

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, beanProperties, backRefs, ignorableProps, false, false);
        deserializer._propertyBasedCreator = creator;
        deserializer._nonStandardCreation = true; // Force property-based creator path

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertTrue(result instanceof Object);
    }


    @Test
    public void testDeserializeFromObjectWithView() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("someProp");
        mockParser.nextToken(); // Advance to VALUE_STRING
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("someValue");
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext() {
            @Override
            public Class<?> getActiveView() {
                return Object.class; // Simulate an active view
            }
        };

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        SettableBeanProperty prop = createMockSettableBeanProperty("someProp", SimpleType.constructUnsafe(String.class));
        // Mock visibility for the property
        SettableBeanProperty visibleProp = new MockSettableBeanProperty(prop.getMetadata(), prop.getType()) {
            @Override public boolean visibleInView(Class<?> activeView) { return true; }
            @Override public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return instance; }
        };

        MockBeanPropertyMap props = new MockBeanPropertyMap();
        props.addProperty(visibleProp);
        BeanPropertyMap beanProperties = props;

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, beanProperties, backRefs, ignorableProps, false, false);
        deserializer._needViewProcesing = true; // Enable view processing
        deserializer._beanProperties = beanProperties; // Set the properties

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertTrue(result instanceof Object); // Default object creation
    }

    @Test
    public void testDeserializeFromObjectVanillaProcessing() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        deserializer._vanillaProcessing = true; // Enable vanilla processing

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertTrue(result instanceof Object); // Default object creation
    }

    @Test
    public void testDeserializeFromObjectWithUnwrappedPropertyHandler() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("unwrappedProp");
        mockParser.nextToken(); // Advance to VALUE_STRING
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("unwrappedValue");
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object beanInstance = new Object();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        // Mocking UnwrappedPropertyHandler
        UnwrappedPropertyHandler unwrappedHandler = new UnwrappedPropertyHandler(null) { // Pass null for unwrappedProps
            @Override
            public void processUnwrapped(JsonParser p, DeserializationContext ctxt, Object bean, TokenBuffer buffer) throws IOException {
                // No-op for test
            }
        };

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _unwrappedPropertyHandler = unwrappedHandler;
                _beanProperties = properties; // Need this for find
                _valueInstantiator = new MockValueInstantiator() {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
                _needViewProcesing = false; // Disable views for this test
            }
            @Override
            protected Object deserializeWithUnwrapped(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                return super.deserializeWithUnwrapped(p, ctxt, bean);
            }
        };

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeFromObjectWithExternalTypeIdHandler() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("externalProp");
        mockParser.nextToken(); // Advance to VALUE_STRING
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("externalValue");
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object beanInstance = new Object();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        // Mocking ExternalTypeHandler
        ExternalTypeHandler externalTypeIdHandler = new ExternalTypeHandler(null) { // Pass null for handler
            @Override
            public ExternalTypeHandler start() { return this; }
            @Override
            public Object complete(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                return bean; // Return the bean as is for the test
            }
        };

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _externalTypeIdHandler = externalTypeIdHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator() {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
            }
        };

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME);
        mockParser.setCurrentName("prop1");
        mockParser.nextToken(); // Advance to VALUE_STRING
        mockParser.setCurrentToken(JsonToken.VALUE_STRING);
        mockParser.setText("value1");
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        // Mock PropertyBasedCreator and UnwrappedPropertyHandler
        PropertyBasedCreator creator = new PropertyBasedCreator(null, null, new SettableBeanProperty[0]) {
            @Override
            public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws IOException {
                return new Object(); // Mock created object
            }
            @Override
            public SettableBeanProperty findCreatorProperty(String name) { return null;}
        };
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return new Object(); // Mock object creation
            }
            @Override
            public boolean canCreateUsingDefault() { return true;}
            @Override
            public PropertyBasedCreator propertyBasedCreator() { return creator;}
        });

        UnwrappedPropertyHandler unwrappedHandler = new UnwrappedPropertyHandler(null) {
            @Override
            public void processUnwrapped(JsonParser p, DeserializationContext ctxt, Object bean, TokenBuffer buffer) throws IOException {
                // No-op
            }
        };

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _propertyBasedCreator = creator;
                _unwrappedPropertyHandler = unwrappedHandler;
                _beanProperties = properties;
            }
            @Override
            protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser p, DeserializationContext ctxt) throws IOException {
                return super.deserializeUsingPropertyBasedWithUnwrapped(p, ctxt);
            }
        };

        Object result = deserializer.deserializeUsingPropertyBasedWithUnwrapped(mockParser, mockCtxt);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME); // Simulate a field name
        mockParser.setCurrentName("someField");

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        try {
            deserializer.deserializeUsingPropertyBasedWithExternalTypeId(mockParser, mockCtxt);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Deserialization with Builder, External type id, @JsonCreator not yet implemented", e.getMessage());
        }
    }

    @Test
    public void testWithObjectIdReader() throws Exception {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        ObjectIdReader objectIdReader = null; // Test with null

        BeanDeserializerBase newDeserializer = originalDeserializer.withObjectIdReader(objectIdReader);
        assertSame(originalDeserializer, newDeserializer); // Should return the same instance if ObjectIdReader is null

        // Test with non-null ObjectIdReader
        ObjectIdReader nonNullOir = mock(ObjectIdReader.class); // Using mock for this case
        newDeserializer = originalDeserializer.withObjectIdReader(nonNullOir);
        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(nonNullOir, ((BuilderBasedDeserializer)newDeserializer)._objectIdReader);
    }

    @Test
    public void testWithIgnorableProperties() throws Exception {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        Set<String> newIgnorableProps = new HashSet<>(Arrays.asList("prop1", "prop2"));

        BeanDeserializerBase newDeserializer = originalDeserializer.withIgnorableProperties(newIgnorableProps);

        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(newIgnorableProps, ((BuilderBasedDeserializer)newDeserializer)._ignorableProps);
    }

    @Test
    public void testWithBeanProperties() throws Exception {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap originalProperties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, originalProperties, backRefs, ignorableProps, false, false);
        BeanPropertyMap newProperties = createDummyBeanPropertyMap(); // Another empty map

        BeanDeserializerBase newDeserializer = originalDeserializer.withBeanProperties(newProperties);

        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(newProperties, ((BuilderBasedDeserializer)newDeserializer)._beanProperties);
    }

    @Test
    public void testAsArrayDeserializer() throws Exception {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        // Need to simulate _beanProperties having properties
        MockBeanPropertyMap mockProps = new MockBeanPropertyMap();
        mockProps.addProperty(createMockSettableBeanProperty("prop1", SimpleType.constructUnsafe(String.class)));
        originalDeserializer._beanProperties = mockProps;
        originalDeserializer._buildMethod = mock(AnnotatedMethod.class); // _buildMethod is used in BeanAsArrayBuilderDeserializer constructor

        Deserializer<?> arrayDeserializer = originalDeserializer.asArrayDeserializer();

        assertTrue(arrayDeserializer instanceof BeanAsArrayBuilderDeserializer);
    }

    @Test
    public void testDeserializeWithUnwrappedDirectly() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object beanInstance = new Object();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        UnwrappedPropertyHandler unwrappedHandler = new UnwrappedPropertyHandler(null) {
            @Override
            public void processUnwrapped(JsonParser p, DeserializationContext ctxt, Object bean, TokenBuffer buffer) throws IOException {
                // No-op
            }
        };

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _unwrappedPropertyHandler = unwrappedHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator() {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
                _needViewProcesing = false;
            }
        };

        Object result = deserializer.deserializeWithUnwrapped(mockParser, mockCtxt);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeWithExternalTypeIdDirectly() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext();
        Object beanInstance = new Object();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);

        ExternalTypeHandler externalTypeIdHandler = new ExternalTypeHandler(null) {
            @Override
            public ExternalTypeHandler start() { return this; }
            @Override
            public Object complete(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                return bean;
            }
        };

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _externalTypeIdHandler = externalTypeIdHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator() {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
            }
        };

        Object result = deserializer.deserializeWithExternalTypeId(mockParser, mockCtxt);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeWithViewDirectly() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.START_OBJECT);
        mockParser.nextToken(); // Advance to END_OBJECT
        mockParser.setCurrentToken(JsonToken.END_OBJECT);

        MockDeserializationContext mockCtxt = new MockDeserializationContext() {
            @Override
            public Class<?> getActiveView() {
                return Object.class; // Simulate an active view
            }
        };

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _needViewProcesing = true; // Enable view processing
                _beanProperties = properties;
            }
        };

        Object beanInstance = new Object();
        Object result = deserializer.deserializeWithView(mockParser, mockCtxt, beanInstance, Object.class);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeObjectUsingNonDefault() throws Exception {
        MockJsonParser mockParser = new MockJsonParser();
        mockParser.setCurrentToken(JsonToken.FIELD_NAME); // Simulate a field name
        mockParser.setCurrentName("someField");

        MockDeserializationContext mockCtxt = new MockDeserializationContext();

        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        PropertyBasedCreator creator = new PropertyBasedCreator(null, null, new SettableBeanProperty[0]) {
            @Override
            public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws IOException {
                return new Object(); // Mock created object
            }
            @Override
            public SettableBeanProperty findCreatorProperty(String name) { return null;}
        };
        builder.setValueInstantiator(new MockValueInstantiator() {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return new Object(); // Mock object creation
            }
            @Override
            public boolean canCreateUsingDefault() { return true;}
            @Override
            public PropertyBasedCreator propertyBasedCreator() { return creator;}
        });
        MockBeanPropertyMap props = new MockBeanPropertyMap();
        props.addProperty(createMockSettableBeanProperty("field", SimpleType.constructUnsafe(String.class)));
        BeanPropertyMap beanProperties = props;

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, beanProperties, backRefs, ignorableProps, false, false) {
            @Override
            public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
                _nonStandardCreation = true; // Force non-standard creation path
                _unwrappedPropertyHandler = null;
                _externalTypeIdHandler = null;
                _needViewProcesing = false;
                _propertyBasedCreator = creator;
                return super.deserializeFromObject(p, ctxt);
            }
        };
        deserializer._propertyBasedCreator = creator;

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testDeserializer_constructor_initialArgCheck() {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);
        builder._objectIdReader = mock(ObjectIdReader.class); // Set a non-null ObjectIdReader

        try {
            new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
            fail("Expected IllegalArgumentException for non-null ObjectIdReader");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not use Object Id with Builder-based deserialization"));
        }
    }

    @Test
    public void testDeserializer_constructor_objectIdReaderNull() {
        BeanDescription beanDesc = createDummyBeanDescription();
        BeanPropertyMap properties = createDummyBeanPropertyMap();
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, createDummyDeserializationConfig());
        builder.setValueInstantiator(new MockValueInstantiator());
        builder.setPOJOBuilder(null, null);

        try {
            BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
            assertNotNull(deserializer);
        } catch (IllegalArgumentException e) {
            fail("Did not expect IllegalArgumentException when ObjectIdReader is null: " + e.getMessage());
        }
    }
}
```