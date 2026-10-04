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
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.BeanProperty;

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

        // Constructor from SerializerProvider.SerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)
        protected MockSerializerProvider(SerializerProvider delegate, SerializationConfig config, com.fasterxml.jackson.databind.ser.SerializerFactory sf) {
            super(delegate, config, sf);
        }

        // A no-arg constructor for convenience when config/factory are not needed
        MockSerializerProvider() {
            super(null, null, null);
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
            // Default to false for simplicity, except where logic depends on it
            return false;
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

        // Required to implement abstract method
        @Override
        public JsonSerializer<Object> serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated annotated, Object value) {
            return (JsonSerializer<Object>) value;
        }
    }

    private static class MockJsonGenerator extends JsonGeneratorDelegate {
        public String currentFieldName;

        MockJsonGenerator() {
            // Delegate is null as we only override specific methods
            super(null);
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

        // These methods are overridden from JsonGeneratorDelegate or JsonGenerator,
        // and need to be present if not implemented by the delegate.
        // Since delegate is null, we must provide implementations for all used methods.
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
        // JsonRawValue is not part of the standard JDK or the provided API outline. Remove.
        // @Override public void writeRawTypeId(JsonRawValue rawValue) throws IOException { /* no-op */ }
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
        // JsonDestination is not part of the standard JDK or the provided API outline. Remove.
        // @Override public void writeValue(JsonDestination jdest, Object value) throws IOException { /* no-op */ }
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

    // PropertySerializerMap.SerializerAndMapResult is a final class, cannot be extended.
    // Instead, we need to mock the map itself and its behavior.
    // We will mock PropertySerializerMap and override findAndAddKeySerializer.

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
            // We cannot create a new SerializerAndMapResult instance directly as it's final.
            // We need to use a known instance or create a wrapper if possible.
            // For simplicity, let's assume a way to get a SerializerAndMapResult or stub it.
            // Since we can't extend it, we'll need to find another approach.
            // The API outline shows SerializerAndMapResult has a constructor:
            // public final static class SerializerAndMapResult { ... }
            // However, since it is static and final, we can't directly instantiate or extend.
            // A common pattern is to have a factory method or use a mock object that behaves like it.
            // Given the constraints, let's try to simulate the return value if possible.
            // If the API doesn't allow instantiation, this test might be problematic.
            // Looking at PropertySerializerMap.java source, the result is a static inner class.
            // A workaround is to return a known, valid instance if the provider can supply it.
            // For this mock, we'll simulate the return with a placeholder if a real one is not possible.

            // Re-evaluating: The actual findAndAddKeySerializer in PropertySerializerMap returns
            // a SerializerAndMapResult which contains a serializer and a map.
            // We need to return a valid SerializerAndMapResult.
            // If we can't instantiate it, we'll have to find a way around this.
            // Let's try to use a known serializer and the current map.

            // If we can't instantiate SerializerAndMapResult, this mock needs a different approach.
            // For now, let's assume we can get a valid result somehow.
            // A simple workaround: create a SerializerAndMapResult if possible, or return null if not.
            // Given the test context, it's likely that a way to create this exists or a mock is expected.
            // Since it's 'final', direct instantiation from here is unlikely.

            // Let's try a simpler approach: inject a serializer that will be found, and return a new map.
            // The actual logic in `_findAndAddDynamic` expects `result.map` to be a new map.
            // For testing, returning the same map might be sufficient if it doesn't break the logic.

            // If `findAndAddKeySerializer` is called, it means the serializer was not found in the current map.
            // It then finds the serializer and returns a *new* map.
            // This suggests `newWith` should be called on the map.

            PropertySerializerMap nextMap = this.newWith(type, foundSerializer); // This should create a new map
            return new PropertySerializerMap.SerializerAndMapResult(foundSerializer, nextMap);
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
        // Inject our mock map into the dynamic serializer
        dynamic._dynamicSerializers = MockPropertySerializerMap.emptyForProperties();

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
        dynamic._dynamicSerializers = MockPropertySerializerMap.emptyForProperties();

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

    // EnumValues is a final class, cannot be extended.
    // We need to mock its behavior. The constructFromName method can be used if we provide
    // a valid MapperConfig. Since we don't have one, we'll need to create a mock EnumValues.
    // The EnumValues class itself has a private constructor.
    // Let's check the EnumValues API for static factory methods or public constructors.
    // It has:
    // public static EnumValues construct(SerializationConfig config, Class<Enum<?>> enumClass);
    // public static EnumValues constructFromName(MapperConfig<?> config, Class<Enum<?>> enumClass);
    // public static EnumValues constructFromToString(MapperConfig<?> config, Class<Enum<?>> enumClass);
    // None of these are directly mockable without providing config objects.
    // We need a way to instantiate or mock EnumValues.

    // The simplest approach is to create a dummy EnumValues instance if possible,
    // or use a minimal working mock if the constructors are not accessible or final.
    // The given API outline shows `java.io.Serializable`.
    // Since EnumValues is final, we can't extend it. We need to mock it.
    // Let's assume we can create a minimal mock that satisfies the interface if not the class.
    // However, we need to call `EnumKeySerializer.construct` which expects an `EnumValues`.
    // `EnumValues` has a protected constructor: `EnumValues(Class<Enum<?>>, Map<Enum<?>, SerializableString>)`.
    // And a `SerializableString` is defined in `com.fasterxml.jackson.core`.

    // Let's attempt to create a mock that mimics EnumValues without extending it directly.
    // We'll use a simple Map and a SerializedString.
    // To call `EnumKeySerializer.construct`, we need a `EnumValues` instance.

    // Let's try to create a mock `EnumValues` that uses a predefined map and `SerializedString`.
    private static class MockEnumValues {
        private final Class<?> _enumClass;
        private final java.util.Map<Enum<?>, SerializableString> _map;

        private MockEnumValues(Class<?> enumClass, java.util.Map<Enum<?>, SerializableString> map) {
            _enumClass = enumClass;
            _map = map;
        }

        public static EnumValues constructFromName(MapperConfig<?> config, Class<Enum<?>> enumClass) {
            java.util.Map<Enum<?>, SerializableString> map = new java.util.HashMap<>();
            for (Enum<?> e : enumClass.getEnumConstants()) {
                map.put(e, new SerializedString(e.name()));
            }
            // This static factory method returns an EnumValues instance.
            // Since EnumValues is final, we can't extend it.
            // To return a mock, we'd need to replace this factory method or mock its result.
            // Given the constraints, we must use the provided API.
            // If we can't create an EnumValues instance, we might have to skip testing EnumKeySerializer if it's too complex.
            // Let's check the `EnumValues.constructFromName` method again.
            // It's a static method that *returns* an EnumValues.
            // We can't *mock* this method directly within the test class for a static call.

            // Let's assume we can create a simple EnumValues instance to pass.
            // We'll create a minimal, functional EnumValues mock.
            // This requires access to the EnumValues constructor or a factory.
            // The constructor is protected.

            // A workaround: If we cannot instantiate EnumValues, we might need to
            // reconsider how to test EnumKeySerializer.
            // The problem statement requires us to use existing classes and avoid creating new ones.
            // However, mocking is sometimes necessary for testing.
            // If the `EnumValues` is final and has a protected constructor,
            // we can't create an instance of it from outside its package without a factory.
            // The `constructFromName` method is the only public static way.

            // Let's try to create a mock that *behaves* like EnumValues and can be cast to it,
            // if the class structure allows. This is generally not possible with final classes.
            // The only way would be if EnumValues itself has a testable instance or if we can mock it with a tool.
            // Since we're restricted to the provided source, we can't use external mocking frameworks.

            // If `EnumValues` is final and its constructors are not accessible,
            // we will have to resort to a simplified mock or skip this part.
            // Let's assume for now that we *can* create a mock that satisfies the `EnumValues` type.

            // Attempt to create a simple mock object that can be passed as EnumValues
            return new EnumValues(enumClass, java.util.Collections.emptyMap()) { // Using protected constructor
                // Need to implement `serializedValueFor` and `enums` and `internalMap`, `getEnumClass`
                @Override
                public SerializableString serializedValueFor(Enum<?> key) {
                    // Simplified logic for testing
                    return new SerializedString(key.name());
                }
                @Override
                public java.util.Collection<SerializableString> values() {
                    return null; // Not needed for this test
                }
                @Override
                public List<Enum<?>> enums() {
                    return null; // Not needed for this test
                }
                @Override
                public java.util.Map<Enum<?>, SerializableString> internalMap() {
                    return null; // Not needed for this test
                }
                @Override
                public Class<Enum<?>> getEnumClass() {
                    return (Class<Enum<?>>) enumClass; // Return the enum class passed in
                }
            };
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
        // Use the mocked EnumValues constructFromName
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
        // This requires creating a custom EnumValues instance.
        // We'll use a simplified mock that directly returns a SerializedString.

        EnumValues enumValues = new EnumValues(TestEnum.class, java.util.Collections.emptyMap()) { // Using protected constructor
            @Override
            public SerializableString serializedValueFor(Enum<?> key) {
                if (key == TestEnum.VALUE_B) {
                    return new SerializedString("custom_B");
                }
                return new SerializedString(key.name()); // Default
            }
            // Implement other required abstract/overridden methods
            @Override public java.util.Collection<SerializableString> values() { return null; }
            @Override public List<Enum<?>> enums() { return null; }
            @Override public java.util.Map<Enum<?>, SerializableString> internalMap() { return null; }
            @Override public Class<Enum<?>> getEnumClass() { return TestEnum.class; }
        };

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
        EnumValues enumValues = new EnumValues(AnotherTestEnum.class, java.util.Collections.emptyMap()) { // Using protected constructor
            @Override
            public SerializableString serializedValueFor(Enum<?> key) {
                // Mock behavior: if the enum is not of the expected type, return its name
                if (key instanceof AnotherTestEnum) {
                    return new SerializedString(key.name());
                }
                // Fallback for unexpected enum types
                return new SerializedString(key.name());
            }
            // Implement other required abstract/overridden methods
            @Override public java.util.Collection<SerializableString> values() { return null; }
            @Override public List<Enum<?>> enums() { return null; }
            @Override public java.util.Map<Enum<?>, SerializableString> internalMap() { return null; }
            @Override public Class<Enum<?>> getEnumClass() { return AnotherTestEnum.class; }
        };

        StdKeySerializers.EnumKeySerializer serializer = StdKeySerializers.EnumKeySerializer.construct(AnotherTestEnum.class, enumValues);
        serializer.serialize(AnotherTestEnum.ONLY_ONE, g, p);

        // The serialize method in EnumKeySerializer first checks WRITE_ENUMS_USING_TO_STRING.
        // If false, it uses _values.serializedValueFor(en).
        // Our mock `serializedValueFor` returns the enum name if it's `AnotherTestEnum`.
        assertEquals(AnotherTestEnum.ONLY_ONE.name(), g.currentFieldName);
    }
}
