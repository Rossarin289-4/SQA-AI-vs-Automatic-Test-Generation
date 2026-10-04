package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.core.io.SerializedString;
import java.math.BigDecimal;

// Mock Enum outside the test class
enum TestEnum {
    VALUE_A, VALUE_B
}

// Mock Enum outside the test class
enum AnotherTestEnum {
    ONLY_ONE
}

public class StdKeySerializersTest {

    // Mock SerializerProvider and JsonGenerator to avoid complex setup
    private static class MockSerializerProvider extends SerializerProvider {
        private static final long serialVersionUID = 1L;

        MockSerializerProvider() {
            super(null, null);
        }

        @Override
        public void defaultSerializeDateKey(Date date, JsonGenerator gen) throws IOException {
            gen.writeFieldName(String.valueOf(date.getTime()));
        }

        @Override
        public void defaultSerializeDateKey(long timestamp, JsonGenerator gen) throws IOException {
            gen.writeFieldName(String.valueOf(timestamp));
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            return false; // Default to false for simplicity, except where logic depends on it
        }

        @Override
        public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty property) throws JsonMappingException {
            // This is a simplified mock to allow testing Dynamic serializer
            if (type.getRawClass() == String.class) {
                return StdKeySerializers.DEFAULT_STRING_SERIALIZER;
            }
            if (Number.class.isAssignableFrom(type.getRawClass()) || type.getRawClass().isPrimitive()) {
                return StdKeySerializers.DEFAULT_KEY_SERIALIZER;
            }
            return null; // Indicate not found
        }
    }

    private static class MockJsonGenerator extends JsonGeneratorDelegate {
        public String currentFieldName;

        MockJsonGenerator() {
            super(null); // Delegate is null as we only override specific methods
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            this.currentFieldName = name;
        }

        @Override
        public void writeObject(Object value) throws IOException {
            // For simplicity, only handle String values in this mock
            if (value instanceof String) {
                writeFieldName((String) value);
            } else {
                throw new UnsupportedOperationException("Not implemented for " + value.getClass().getName());
            }
        }

        // Implement other necessary methods with no-ops or exceptions
        @Override public void writeString(String text) throws IOException { /* no-op */ }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeRawString(String text) throws IOException { /* no-op */ }
        @Override public void writeRawString(char[] text, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeUTF8String(byte[] data, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeRaw(String text) throws IOException { /* no-op */ }
        @Override public void writeRaw(char c) throws IOException { /* no-op */ }
        @Override public void writeRaw(char[] c, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeRaw(byte[] data, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeBinary(byte[] data, int offset, int len) throws IOException { /* no-op */ }
        @Override public void writeNumber(short v) throws IOException { /* no-op */ }
        @Override public void writeNumber(int v) throws IOException { /* no-op */ }
        @Override public void writeNumber(long v) throws IOException { /* no-op */ }
        @Override public void writeNumber(float v) throws IOException { /* no-op */ }
        @Override public void writeNumber(double v) throws IOException { /* no-op */ }
        @Override public void writeNumber(BigDecimal v) throws IOException { /* no-op */ }
        @Override public void writeNumber(String encodedValue) throws IOException { /* no-op */ }
        @Override public void writeBoolean(boolean v) throws IOException { /* no-op */ }
        @Override public void writeNull() throws IOException { /* no-op */ }
        @Override public void writeStartObject() throws IOException { /* no-op */ }
        @Override public void writeEndObject() throws IOException { /* no-op */ }
        @Override public void writeStartArray() throws IOException { /* no-op */ }
        @Override public void writeEndArray() throws IOException { /* no-op */ }
        @Override public void writeStartConstructor(String name) throws IOException { /* no-op */ }
        @Override public void writeEndConstructor() throws IOException { /* no-op */ }
        @Override public void writeOmitEmptySpace() throws IOException { /* no-op */ }
        @Override public void writeObjectFieldStart(String fieldName) throws IOException { /* no-op */ }
        @Override public void writeArrayFieldStart(String fieldName) throws IOException { /* no-op */ }
        @Override public void writeObjectRef(Object ob) throws IOException { /* no-op */ }
        @Override public void writeTypeId(Object id) throws IOException { /* no-op */ }
        @Override public void writeRawTypeId(String rawId) throws IOException { /* no-op */ }
        @Override public void writeRawTypeId(JsonRawValue rawValue) throws IOException { /* no-op */ }
        @Override public void copyCurrentEvent(JsonParser p) throws IOException { /* no-op */ }
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public JsonGenerator reconfigure(Feature f, boolean state) { return this; }
        @Override public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { return this; }
        @Override public PrettyPrinter getPrettyPrinter() { return null; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void flush() throws IOException { /* no-op */ }
        @Override public void close() throws IOException { /* no-op */ }
        @Override public boolean isClosed() { return false; }
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void writeValue(java.io.File f, Object value) throws IOException { /* no-op */ }
        @Override public void writeValue(java.io.OutputStream out, Object value) throws IOException { /* no-op */ }
        @Override public void writeValue(java.io.Writer w, Object value) throws IOException { /* no-op */ }
        @Override public void writeValue(JsonDestination jdest, Object value) throws IOException { /* no-op */ }
        @Override public TreeNode getDeduplicatingValue(Object stream) { return null; }
        @Override public boolean streamWriteValue(Object value, java.io.OutputStream stream) throws IOException { return false; }
        @Override public int getOutputBuffered() { return 0; }
    }


    @Test
    public void testGetStdKeySerializerForObject() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Object.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializerForString() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = String.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.StringKeySerializer);
    }

    @Test
    public void testGetStdKeySerializerForNumber() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Integer.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializerForPrimitiveNumber() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = int.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializerForClass() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Class.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.Default);
        // Check internal type
        assertEquals(StdKeySerializers.Default.TYPE_CLASS, ((StdKeySerializers.Default) serializer)._typeId);
    }

    @Test
    public void testGetStdKeySerializerForDate() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Date.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.Default);
        // Check internal type
        assertEquals(StdKeySerializers.Default.TYPE_DATE, ((StdKeySerializers.Default) serializer)._typeId);
    }

    @Test
    public void testGetStdKeySerializerForCalendar() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Calendar.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.Default);
        // Check internal type
        assertEquals(StdKeySerializers.Default.TYPE_CALENDAR, ((StdKeySerializers.Default) serializer)._typeId);
    }

    @Test
    public void testGetStdKeySerializerForUUID() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = UUID.class;
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.Default);
        // Check internal type
        assertEquals(StdKeySerializers.Default.TYPE_TO_STRING, ((StdKeySerializers.Default) serializer)._typeId);
    }

    @Test
    public void testGetStdKeySerializerForUnknownTypeUseDefault() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Long.class; // A Number type, but not directly handled by specific cases
        boolean useDefault = true;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer); // Fallback to default
    }

    @Test
    public void testGetStdKeySerializerForUnknownTypeNoDefault() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Long.class; // A Number type, but not directly handled by specific cases
        boolean useDefault = false;
        JsonSerializer<Object> serializer = StdKeySerializers.getStdKeySerializer(config, rawKeyType, useDefault);
        assertNull(serializer); // No default serializer requested
    }

    @Test
    public void testGetFallbackKeySerializerForEnum() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = TestEnum.class;
        JsonSerializer<Object> serializer = StdKeySerializers.getFallbackKeySerializer(config, rawKeyType);
        assertTrue(serializer instanceof StdKeySerializers.EnumKeySerializer);
    }

    @Test
    public void testGetFallbackKeySerializerForEnumClass() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = Enum.class; // The base Enum class
        JsonSerializer<Object> serializer = StdKeySerializers.getFallbackKeySerializer(config, rawKeyType);
        assertTrue(serializer instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetFallbackKeySerializerForNull() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = null;
        JsonSerializer<Object> serializer = StdKeySerializers.getFallbackKeySerializer(config, rawKeyType);
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer); // Fallback to default
    }

    @Test
    public void testGetFallbackKeySerializerForOtherType() throws Exception {
        SerializationConfig config = null; // Not used by the method logic
        Class<?> rawKeyType = String.class; // Not an Enum or Enum.class
        JsonSerializer<Object> serializer = StdKeySerializers.getFallbackKeySerializer(config, rawKeyType);
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer); // Fallback to default
    }

    @Test
    public void testDefaultGetDefault() throws Exception {
        JsonSerializer<Object> serializer = StdKeySerializers.getDefault();
        assertTrue(serializer instanceof StdKeySerializers.StdKeySerializer);
    }

    // Tests for StdKeySerializers.Default class
    @Test
    public void testDefaultSerializeDate() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        Date date = new Date(1678886400000L); // Some arbitrary date
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_DATE, Date.class);
        serializer.serialize(date, g, p);
        assertEquals(String.valueOf(date.getTime()), g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeCalendar() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1678886400000L); // Match the date
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CALENDAR, Calendar.class);
        serializer.serialize(calendar, g, p);
        assertEquals(String.valueOf(calendar.getTimeInMillis()), g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeClass() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        Class<?> clazz = String.class;
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CLASS, Class.class);
        serializer.serialize(clazz, g, p);
        assertEquals(clazz.getName(), g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeEnumUsingToString() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider() {
            @Override public boolean isEnabled(SerializationFeature feature) {
                return feature == SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
            }
        };
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_ENUM, TestEnum.class);
        serializer.serialize(TestEnum.VALUE_A, g, p);
        assertEquals(TestEnum.VALUE_A.toString(), g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeEnumUsingName() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider() {
            @Override public boolean isEnabled(SerializationFeature feature) {
                return false; // WRITE_ENUMS_USING_TO_STRING is disabled
            }
        };
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_ENUM, TestEnum.class);
        serializer.serialize(TestEnum.VALUE_B, g, p);
        assertEquals(TestEnum.VALUE_B.name(), g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeToString() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        Object obj = new Object() {
            @Override public String toString() { return "custom_string_representation"; }
        };
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_TO_STRING, Object.class);
        serializer.serialize(obj, g, p);
        assertEquals("custom_string_representation", g.currentFieldName);
    }

    @Test
    public void testDefaultSerializeDefaultCase() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        Object obj = new Object() {
            @Override public String toString() { return "default_case_representation"; }
        };
        // Using a typeId not explicitly handled, should fall through to default
        StdKeySerializers.Default serializer = new StdKeySerializers.Default(99, Object.class);
        serializer.serialize(obj, g, p);
        assertEquals("default_case_representation", g.currentFieldName);
    }

    // Tests for StdKeySerializers.Dynamic class

    // Mock PropertySerializerMap.SerializerAndMapResult
    private static class MockSerializerAndMapResult extends PropertySerializerMap.SerializerAndMapResult {
        MockSerializerAndMapResult(JsonSerializer<Object> serializer, PropertySerializerMap map) {
            super(serializer, map);
        }
    }

    // Mock PropertySerializerMap.emptyForProperties() to return a mockable map
    private static class MockPropertySerializerMap extends PropertySerializerMap {
        protected MockPropertySerializerMap(boolean resetWhenFull) {
            super(resetWhenFull);
        }

        @Override
        public JsonSerializer<Object> serializerFor(Class<?> type) {
            return null; // Always fail initial lookup for testing _findAndAddDynamic
        }

        @Override
        public PropertySerializerMap newWith(Class<?> type, JsonSerializer<Object> serializer) {
            return this; // Not changing the map in this mock
        }

        // Mock method to simulate finding and adding a serializer
        public SerializerAndMapResult findAndAddKeySerializer(Class<?> type, SerializerProvider provider, BeanProperty property) throws JsonMappingException {
            // For this test, we'll return a simple StdKeySerializer based on type.
            // This mimics the real findAndAddKeySerializer behavior more closely.
            JsonSerializer<Object> foundSerializer = provider.findKeySerializer(TypeFactory.defaultInstance().constructType(type), property);
            if (foundSerializer == null) {
                foundSerializer = StdKeySerializers.DEFAULT_KEY_SERIALIZER; // Fallback
            }
            return new MockSerializerAndMapResult(foundSerializer, this);
        }

        public static PropertySerializerMap emptyForProperties() {
            return new MockPropertySerializerMap(true);
        }
    }

    @Test
    public void testDynamicSerializeString() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        SerializerProvider providerForDynamic = new MockSerializerProvider() {
             @Override
            public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.getRawClass() == String.class) {
                    return StdKeySerializers.DEFAULT_STRING_SERIALIZER;
                }
                return super.findKeySerializer(type, property);
            }
        };

        StdKeySerializers.Dynamic dynamic = new StdKeySerializers.Dynamic();
        dynamic._dynamicSerializers = PropertySerializerMap.emptyForProperties(); // Start with an empty map

        String testString = "key";
        dynamic.serialize(testString, g, providerForDynamic);
        assertEquals(testString, g.currentFieldName);
    }

    @Test
    public void testDynamicSerializeNonString() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();

        // SerializerProvider that can find a serializer for Integer
        SerializerProvider providerForDynamic = new MockSerializerProvider() {
            @Override
            public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.getRawClass() == Integer.class) {
                    return StdKeySerializers.DEFAULT_KEY_SERIALIZER; // Use the default number serializer
                }
                return super.findKeySerializer(type, property);
            }
        };

        StdKeySerializers.Dynamic dynamic = new StdKeySerializers.Dynamic();
        dynamic._dynamicSerializers = PropertySerializerMap.emptyForProperties();

        Integer testInt = 123;
        dynamic.serialize(testInt, g, providerForDynamic);
        // The StdKeySerializer will write the field name using toString() implicitly.
        assertEquals(String.valueOf(testInt), g.currentFieldName);
    }


    // Tests for StdKeySerializers.StringKeySerializer class
    @Test
    public void testStringKeySerializerSerialize() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider();
        String key = "myKey";
        StdKeySerializers.StringKeySerializer serializer = new StdKeySerializers.StringKeySerializer();
        serializer.serialize(key, g, p);
        assertEquals(key, g.currentFieldName);
    }

    // Tests for StdKeySerializers.EnumKeySerializer class

    // Mock EnumValues
    private static class MockEnumValues extends EnumValues {
        private final Class<?> _enumClass;
        private final java.util.Map<Enum<?>, String> _map;

        MockEnumValues(Class<?> enumClass, java.util.Map<Enum<?>, String> map) {
            super(enumClass, map); // Call super constructor
            _enumClass = enumClass;
            _map = map;
        }

        // Mock implementation for serializedValueFor
        @Override
        public SerializableString serializedValueFor(Enum<?> key) {
            String value = _map.get(key);
            if (value == null) {
                value = key.name(); // Default to name if not found
            }
            return new SerializedString(value); // Use Jackson's SerializedString
        }

        public static EnumValues constructFromName(MapperConfig<?> config, Class<Enum<?>> enumClass) {
            java.util.Map<Enum<?>, String> map = new java.util.HashMap<>();
            for (Enum<?> e : enumClass.getEnumConstants()) {
                map.put(e, e.name());
            }
            // Call the super constructor with the correct arguments if needed, or ensure base class is mockable/usable.
            // Since EnumValues has a protected constructor that takes config and enumClass, and a static method,
            // we need to ensure our MockEnumValues can be instantiated.
            // The easiest way is to provide dummy config/class to super.
            return new MockEnumValues(enumClass, map); // Re-using this constructor for simplicity
        }
    }

    @Test
    public void testEnumKeySerializerSerializeUsingToString() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider() {
            @Override public boolean isEnabled(SerializationFeature feature) {
                return feature == SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
            }
        };
        EnumValues enumValues = MockEnumValues.constructFromName(null, TestEnum.class);
        StdKeySerializers.EnumKeySerializer serializer = StdKeySerializers.EnumKeySerializer.construct(TestEnum.class, enumValues);
        serializer.serialize(TestEnum.VALUE_A, g, p);
        assertEquals(TestEnum.VALUE_A.toString(), g.currentFieldName);
    }

    @Test
    public void testEnumKeySerializerSerializeUsingNameViaEnumValues() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider() {
            @Override public boolean isEnabled(SerializationFeature feature) {
                return false; // WRITE_ENUMS_USING_TO_STRING disabled
            }
        };
        // Mock EnumValues that maps to something other than just the name
        java.util.Map<Enum<?>, String> customMap = new java.util.HashMap<>();
        customMap.put(TestEnum.VALUE_B, "custom_B");
        EnumValues enumValues = new MockEnumValues(TestEnum.class, customMap);

        StdKeySerializers.EnumKeySerializer serializer = StdKeySerializers.EnumKeySerializer.construct(TestEnum.class, enumValues);
        serializer.serialize(TestEnum.VALUE_B, g, p);
        assertEquals("custom_B", g.currentFieldName);
    }

    @Test
    public void testEnumKeySerializerSerializeUsingNameIfValueNotFound() throws Exception {
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider p = new MockSerializerProvider() {
            @Override public boolean isEnabled(SerializationFeature feature) {
                return false; // WRITE_ENUMS_USING_TO_STRING disabled
            }
        };
        // EnumValues that doesn't contain the enum constant
        // Use a different enum type to ensure it's not in the map.
        EnumValues enumValues = MockEnumValues.constructFromName(null, TestEnum.class); // This map contains TestEnum.VALUE_A and TestEnum.VALUE_B

        StdKeySerializers.EnumKeySerializer serializer = StdKeySerializers.EnumKeySerializer.construct(AnotherTestEnum.class, enumValues);
        serializer.serialize(AnotherTestEnum.ONLY_ONE, g, p);

        // The serialize method in EnumKeySerializer first checks WRITE_ENUMS_USING_TO_STRING.
        // If false, it uses _values.serializedValueFor(en).
        // Our MockEnumValues.serializedValueFor returns key.name() if not found in its internal map.
        // Since AnotherTestEnum is not in the map created for TestEnum, it should fall back to name().
        assertEquals(AnotherTestEnum.ONLY_ONE.name(), g.currentFieldName);
    }
}
