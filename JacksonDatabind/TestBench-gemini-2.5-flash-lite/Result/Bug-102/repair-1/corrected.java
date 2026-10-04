package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import java.math.BigDecimal; // Added import
import java.math.BigInteger; // Added import
import java.io.Flushable; // Added import for JsonGenerator

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version; // Added import

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember; // Added import
import com.fasterxml.jackson.databind.util.BeanUtil; // Added import
import com.fasterxml.jackson.databind.util.ClassUtil; // Added import
import com.fasterxml.jackson.databind.PropertyMetadata; // Added import
import com.fasterxml.jackson.databind.PropertyName; // Added import


public class DateTimeSerializerBaseTest {

    // Dummy implementation for abstract methods and dependencies for DateSerializer
    private static class TestDateSerializer extends DateTimeSerializerBase<Date> {
        protected TestDateSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            if (_asTimestamp(provider)) {
                gen.writeNumber(_timestamp(value));
            } else {
                _serializeAsString(value, provider);
            }
        }
        
        // Helper method to call _serializeAsString without passing provider directly to it
        private void _serializeAsString(Date value, SerializerProvider provider) throws IOException {
             if (_customFormat == null) {
                provider.defaultSerializeDateValue(value, null); // Pass null for JsonGenerator if not used directly
                return;
            }

            DateFormat f = _reusedCustomFormat.getAndSet(null);
            if (f == null) {
                f = (DateFormat) _customFormat.clone();
            }
            // We need a JsonGenerator to write the string, but since serialize is the public entry point
            // and it handles the generator, we'll assume it's available or mock it if needed.
            // For this test, we'll assume the generator is available and passed down.
            // However, the signature of _serializeAsString in the superclass has a JsonGenerator.
            // Let's adjust the call to use a generator.
            // The original call in the superclass is:
            // _serializeAsString(value, g, serializers)
            // So, we should be passing the generator 'gen' and provider 'serializers'
            // Let's correct the serialize method:
            // serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
            // ...
            // _serializeAsString(value, gen, serializers); // this is the call in the super class
            // So, let's adjust this helper method to match the superclass signature
            // But since this is a dummy, we will adapt it for the test context.
            // For the purpose of testing _serializeAsString which is protected, we can call it.
            // Let's re-implement serialize to call the protected method correctly.
        }
    }
    
    // Re-implement serialize to correctly call the protected _serializeAsString
    private static class TestDateSerializerCorrected extends DateTimeSerializerBase<Date> {
        protected TestDateSerializerCorrected(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateSerializerCorrected(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (_asTimestamp(serializers)) {
                gen.writeNumber(_timestamp(value));
            } else {
                // Call the protected method correctly
                _serializeAsString(value, gen, serializers);
            }
        }
    }


    // Mock JsonGenerator
    private static class MockJsonGenerator extends JsonGenerator {
        public String writtenString = null;
        public long writtenNumber = 0;
        public boolean numberWritten = false;
        public boolean stringWritten = false;

        @Override
        public void writeString(String value) throws IOException {
            this.writtenString = value;
            this.stringWritten = true;
        }

        @Override
        public void writeNumber(long value) throws IOException {
            this.writtenNumber = value;
            this.numberWritten = true;
        }
        
        // --- Implementations for abstract methods from JsonGenerator ---
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeFloat(float value) throws IOException {}
        @Override public void writeDouble(double value) throws IOException {}
        @Override public void writeBinary(byte[] data) throws IOException {}
        @Override public void writeObjectId(Object id) throws IOException {}
        @Override public void writeObjectRef(Object id) throws IOException {}
        @Override public void writeTypeId(Object id) throws IOException {}
        @Override public void writeRaw(String json) throws IOException {}
        @Override public void writeRaw(char[] buffer, int offset, int length) throws IOException {}
        @Override public void writeRaw(Object raw) throws IOException { throw new UnsupportedOperationException("Not implemented for mock"); }
        @Override public void writeRawUTF8String(byte[] bytes, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] bytes, int offset, int length) throws IOException {}
        @Override public void writeStringField(String fieldName, String value) throws IOException {}
        @Override public void writeBooleanField(String fieldName, boolean value) throws IOException {}
        @Override public void writeNullField(String fieldName) throws IOException {}
        @Override public void writeIntField(String fieldName, int value) throws IOException {}
        @Override public void writeNumberField(String fieldName, int value) throws IOException {}
        @Override public void writeNumberField(String fieldName, long value) throws IOException {}
        @Override public void writeNumberField(String fieldName, double value) throws IOException {}
        @Override public void writeNumberField(String fieldName, float value) throws IOException {}
        @Override public void writeNumberField(String fieldName, BigDecimal value) throws IOException {}
        @Override public void writeNumberField(String fieldName, BigInteger value) throws IOException {}
        @Override public void writeNumberField(String fieldName, short value) throws IOException {}
        @Override public void writeNumberField(String fieldName, byte value) throws IOException {}
        @Override public void writeObject(Object value) throws IOException {}
        @Override public void writeTree(JsonNode value) throws IOException {}
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public JsonGenerator set(Feature f, boolean state) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void close() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public void flush() throws IOException { } // Added for Flushable
    }

    // Mock SerializerProvider
    private static class MockSerializerProvider extends SerializerProvider {
        private final SerializationConfig _config;
        private final TimeZone _tz;
        private final Locale _locale;
        private final DateFormat _dateFormat;

        protected MockSerializerProvider(SerializerProvider src) {
            super(src);
            _config = null; // Initialize to null, specific tests will provide mocks
            _tz = null;
            _locale = null;
            _dateFormat = null;
        }

        // Constructor for specific use cases
        public MockSerializerProvider(SerializationConfig config, TimeZone tz, Locale locale, DateFormat dateFormat) {
            super(null); // Basic constructor for SerializerProvider
            _config = config;
            _tz = tz;
            _locale = locale;
            _dateFormat = dateFormat;
        }

        @Override
        public SerializationConfig getConfig() {
            return _config;
        }

        @Override
        public TimeZone getTimeZone() {
            return _tz != null ? _tz : TimeZone.getDefault();
        }

        @Override
        public Locale getLocale() {
            return _locale != null ? _locale : Locale.getDefault();
        }

        @Override
        public DateFormat getDateFormat() {
            return _dateFormat;
        }
        
        @Override
        public void defaultSerializeDateValue(Date date, JsonGenerator gen) throws IOException {
             gen.writeNumber(date.getTime());
        }

        @Override
        public JsonNode getNodeFactory() {
             return null; // Not needed for this test
        }
        
        @Override
        public void reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            throw new JsonMappingException(null, msg);
        }
        
        @Override
        public void reportMappingException(JsonMappingException e) throws JsonMappingException {
            throw e;
        }

        // Override other methods as needed by tests
        @Override
        public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
            // Default implementation that returns null, tests will override if needed
            return null;
        }

        @Override
        public Class<?> getActiveView() {
            return null; // Not needed
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return null; // Not needed
        }

        @Override
        public TypeIdResolver getTypeIdResolver(JavaType valueType) {
            return null; // Not needed
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            // Default to false, tests can override if needed
            return false;
        }

        @Override
        public JsonSerializer<Object> findConvertingSerializer(JavaType type, BeanProperty property) {
            return null; // Not needed
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) throws JsonMappingException {
            return null; // Not needed
        }
    }

    // Mock BeanProperty
    private static class MockBeanProperty implements BeanProperty {
        private final String _name;
        private final Type _type;

        public MockBeanProperty(String name, Type type) {
            _name = name;
            _type = type;
        }

        @Override public String getName() { return _name; }
        @Override public PropertyName getFullName() { return PropertyName.construct(_name); }
        @Override public PropertyName getSimpleName() { return PropertyName.construct(_name); }
        @Override public JavaType getType() { return null; } // Not needed
        @Override public JavaType getJavaType() { return null; } // Not needed
        @Override public Type getGenericPropertyType() { return _type; }
        @Override public boolean isRequired() { return false; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; } // Not needed
        @Override public AnnotatedMember getMember() { return null; } // Not needed
        @Override public JavaType getReadType() { return null; } // Not needed
        @Override public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) { }
        @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_METADATA; }
        @Override public JsonFormat.Value findFormatOverrides(AnnotationIntrospector intr, com.fasterxml.jackson.databind.introspect.Annotated ann, Class<?> type) { return null;} // Not needed
        @Override public void assignType(JavaType type) { }
        @Override public String toString() { return String.format("[MockBeanProperty: %s]", _name); }
    }

    // Mock SerializationConfig
    private static class MockSerializationConfig extends SerializationConfig {
        private final TimeZone _tz;
        private final Locale _locale;
        private final DateFormat _dateFormat;
        private final boolean _writeDatesAsTimestamps;

        public MockSerializationConfig(TimeZone tz, Locale locale, DateFormat dateFormat, boolean writeDatesAsTimestamps) {
            // Pass nulls for the base class constructor as it's complex and not needed for this mock
            super(null, null, null); 
            _tz = tz;
            _locale = locale;
            _dateFormat = dateFormat;
            _writeDatesAsTimestamps = writeDatesAsTimestamps;
        }

        @Override
        public TimeZone getTimeZone() {
            return _tz;
        }

        @Override
        public Locale getLocale() {
            return _locale;
        }

        @Override
        public DateFormat getDateFormat() {
            return _dateFormat;
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) {
                return _writeDatesAsTimestamps;
            }
            return super.isEnabled(feature); // Delegate to base class or return default
        }
        
        // Override other methods if necessary for tests
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return null; // Not needed for these tests
        }
    }

    @Test
    public void testSerializeAsTimestampDefault() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SerializationConfig config = new MockSerializationConfig(tz, Locale.US, df, true);
        SerializerProvider provider = new MockSerializerProvider(config, tz, Locale.US, df);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertTrue(generator.numberWritten);
        assertEquals(date.getTime(), generator.writtenNumber);
        assertFalse(generator.stringWritten);
    }

    @Test
    public void testSerializeAsStringDefault() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SerializationConfig config = new MockSerializationConfig(tz, Locale.US, df, false);
        SerializerProvider provider = new MockSerializerProvider(config, tz, Locale.US, df);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertFalse(generator.numberWritten); // Should not write number if it's not a timestamp
        assertTrue(generator.stringWritten);
        // When _customFormat is null and not writing as timestamp, it uses defaultSerializeDateValue
        // which in this mock writes a number. The actual behavior might be string formatting.
        // Let's simulate the _serializeAsString behavior that uses defaultSerializeDateValue
        // The superclass _serializeAsString calls provider.defaultSerializeDateValue
        // So, let's test that behavior here.
        assertEquals(date.getTime(), generator.writtenNumber); // MockProvider's defaultSerializeDateValue writes number
    }

    @Test
    public void testSerializeWithCustomFormatAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SerializationConfig config = new MockSerializationConfig(tz, Locale.US, null, false);
        SerializerProvider provider = new MockSerializerProvider(config, tz, Locale.US, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf);
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertTrue(generator.stringWritten);
        assertFalse(generator.numberWritten);
        assertEquals(customDf.format(date), generator.writtenString);
    }

    @Test
    public void testSerializeWithCustomFormatAsTimestamp() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SerializationConfig config = new MockSerializationConfig(tz, Locale.US, null, false);
        SerializerProvider provider = new MockSerializerProvider(config, tz, Locale.US, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.TRUE, customDf);
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertTrue(generator.numberWritten);
        assertFalse(generator.stringWritten);
        assertEquals(date.getTime(), generator.writtenNumber);
    }

    @Test
    public void testCreateContextualWithNumericShape() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to override findFormatOverrides
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER);
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.TRUE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
    }

    @Test
    public void testCreateContextualWithPattern() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forPattern("MM/dd/yyyy");
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertEquals("MM/dd/yyyy", ((SimpleDateFormat)((TestDateSerializerCorrected) contextualSerializer)._customFormat).toPattern());
    }
    
    @Test
    public void testCreateContextualWithLocaleAndTimeZone() throws Exception {
        DateFormat df0 = new StdDateFormat(); 
        TimeZone tz0 = TimeZone.getTimeZone("GMT");
        Locale loc0 = Locale.US;
        SerializationConfig config = new MockSerializationConfig(tz0, loc0, df0, false);
        
        SerializerProvider mockProvider = new MockSerializerProvider(config, tz0, loc0, df0) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.builder()
                        .setLocale(Locale.CANADA)
                        .setTimeZone(TimeZone.getTimeZone("PST"))
                        .build();
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertTrue(((TestDateSerializerCorrected) contextualSerializer)._customFormat instanceof StdDateFormat);
        assertEquals(Locale.CANADA, ((StdDateFormat)((TestDateSerializerCorrected) contextualSerializer)._customFormat).getLocale());
        assertEquals(TimeZone.getTimeZone("PST"), ((StdDateFormat)((TestDateSerializerCorrected) contextualSerializer)._customFormat).getTimeZone());
    }
    
    @Test
    public void testCreateContextualWithNonStdDateFormat() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd"); // A non-StdDateFormat
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        SerializationConfig config = new MockSerializationConfig(tz, loc, customDf, false);
        
        SerializerProvider mockProvider = new MockSerializerProvider(config, tz, loc, customDf) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.builder()
                        .setLocale(Locale.CANADA)
                        .setTimeZone(TimeZone.getTimeZone("PST"))
                        .build();
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        // Expecting reportBadDefinition because customDf is not SimpleDateFormat
        try {
            serializer.createContextual(mockProvider, property);
            fail("Expected JsonMappingException for non-SimpleDateFormat");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Configured `DateFormat`"));
            assertTrue(e.getMessage().contains("not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`"));
        }
    }

    @Test
    public void testIsEmptyWithTimestampZero() throws Exception {
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.TRUE, null);
        Date date = new Date(0L); // Epoch time
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor
        assertFalse(serializer.isEmpty(provider, date));
    }
    
    @Test
    public void testIsEmptyWithoutTimestamp() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf);
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor
        assertFalse(serializer.isEmpty(provider, date));
    }

    @Test
    public void testGetSchemaAsTimestamp() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, true);
        SerializerProvider provider = new MockSerializerProvider(config, null, null, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);

        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("format").asText().contains("timestamp"));
    }

    @Test
    public void testGetSchemaAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf);
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor

        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
        assertTrue(schema.get("format").asText().contains("date-time"));
    }

    @Test
    public void testAcceptJsonFormatVisitorAsTimestamp() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, true);
        SerializerProvider provider = new MockSerializerProvider(config, null, null, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);

        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        serializer.acceptJsonFormatVisitor(visitor, null);

        assertTrue(visitor.isIntFormatCalled);
        assertEquals(JsonParser.NumberType.LONG, visitor.numberType);
        assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.valueFormat);
    }

    @Test
    public void testAcceptJsonFormatVisitorAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf);
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor

        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        serializer.acceptJsonFormatVisitor(visitor, null);

        assertTrue(visitor.isStringFormatCalled);
        assertEquals(JsonValueFormat.DATE_TIME, visitor.valueFormat);
    }

    @Test
    public void testSerializeAsStringWithReusedFormat() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf);
        // Manually set a cloned format in the AtomicReference to simulate reuse
        DateFormat clonedDf = (DateFormat) customDf.clone();
        serializer._reusedCustomFormat.set(clonedDf);

        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        SerializationConfig config = new MockSerializationConfig(TimeZone.getTimeZone("UTC"), Locale.US, customDf, false);
        SerializerProvider provider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, customDf);
        
        serializer.serialize(date, generator, provider);

        assertTrue(generator.stringWritten);
        assertFalse(generator.numberWritten);
        assertEquals(customDf.format(date), generator.writtenString);
        
        // Ensure the reused format is still there after use
        assertNotNull(serializer._reusedCustomFormat.get());
        assertSame(clonedDf, serializer._reusedCustomFormat.get()); // Should be the same instance that was put back by compareAndSet
    }

    @Test
    public void testSerializeAsStringWithClonedFormat() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, customDf); // _reusedCustomFormat is null initially

        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        SerializationConfig config = new MockSerializationConfig(TimeZone.getTimeZone("UTC"), Locale.US, customDf, false);
        SerializerProvider provider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, customDf);

        serializer.serialize(date, generator, provider);

        assertTrue(generator.stringWritten);
        assertFalse(generator.numberWritten);
        assertEquals(customDf.format(date), generator.writtenString);
        
        // Ensure a new cloned format is created and stored in _reusedCustomFormat
        assertNotNull(serializer._reusedCustomFormat.get());
        assertNotSame(customDf, serializer._reusedCustomFormat.get()); // Should be a clone
        assertEquals(customDf.toPattern(), ((SimpleDateFormat)serializer._reusedCustomFormat.get()).toPattern());
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_true() throws Exception {
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.TRUE, null);
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor
        assertTrue(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_false() throws Exception {
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(Boolean.FALSE, null);
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor
        assertFalse(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_feature_enabled() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, true); // WRITE_DATES_AS_TIMESTAMPS enabled
        SerializerProvider provider = new MockSerializerProvider(config, null, null, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null); // _useTimestamp is null
        assertTrue(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_feature_disabled() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false); // WRITE_DATES_AS_TIMESTAMPS disabled
        SerializerProvider provider = new MockSerializerProvider(config, null, null, null);
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null); // _useTimestamp is null
        assertFalse(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_customFormat_present() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd");
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, customDf); // _useTimestamp is null, _customFormat is present
        SerializerProvider provider = new MockSerializerProvider(null); // Use basic constructor
        assertFalse(serializer._asTimestamp(provider));
    }

    @Test
    public void testCreateContextualWithEmptyFormatOverrides() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to return empty format
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.empty(); // Empty overrides
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        // Should return the same serializer if no overrides are found
        assertSame(serializer, contextualSerializer);
    }

    @Test
    public void testCreateContextualWithAsStringShape() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to return format with STRING shape
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertTrue(((TestDateSerializerCorrected) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    @Test
    public void testCreateContextualWithFormatAsDate() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to return format with DATE shape
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.DATE);
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertTrue(((TestDateSerializerCorrected) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    @Test
    public void testCreateContextualWithFormatAsDateTime() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to return format with DATE_TIME shape
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.DATE_TIME);
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertTrue(((TestDateSerializerCorrected) contextualSerializer)._customFormat instanceof StdDateFormat);
    }
    
    @Test
    public void testCreateContextualWithFormatAsObject() throws Exception {
        SerializationConfig config = new MockSerializationConfig(null, null, null, false);
        // Mock SerializerProvider to return format with OBJECT shape
        SerializerProvider mockProvider = new MockSerializerProvider(config, TimeZone.getTimeZone("UTC"), Locale.US, new StdDateFormat()) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT);
            }
        };
        TestDateSerializerCorrected serializer = new TestDateSerializerCorrected(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProvider, property);
        assertTrue(contextualSerializer instanceof TestDateSerializerCorrected);
        assertEquals(Boolean.FALSE, ((TestDateSerializerCorrected) contextualSerializer)._useTimestamp);
        assertNotNull(((TestDateSerializerCorrected) contextualSerializer)._customFormat);
        assertTrue(((TestDateSerializerCorrected) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    // Mock JsonFormatVisitorWrapper and its methods
    private static class MockJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        private final SerializerProvider _provider;
        public boolean isIntFormatCalled = false;
        public boolean isStringFormatCalled = false;
        public JsonParser.NumberType numberType;
        public JsonValueFormat valueFormat;

        public MockJsonFormatVisitorWrapper(SerializerProvider provider) {
            _provider = provider;
        }

        @Override
        public SerializerProvider getProvider() {
            return _provider;
        }

        // --- Implementations for methods from JsonFormatVisitorWrapper ---
        @Override public void expectAnyFormat(JavaType type) {}
        @Override public void expectBooleanFormat(JavaType type) {}
        @Override public void expectIntegerFormat(JavaType type) {
            isIntFormatCalled = true; // Default call
        }

        @Override
        public void expectIntegerFormat(JavaType type, JsonParser.NumberType numberType, JsonValueFormat valueFormat) {
            isIntFormatCalled = true;
            this.numberType = numberType;
            this.valueFormat = valueFormat;
        }
        
        @Override public void expectNumberFormat(JavaType type) {}

        @Override
        public void expectNumberFormat(JavaType type, JsonParser.NumberType numberType, JsonValueFormat valueFormat) {
            // For number type, it can be long or other number types.
            // JsonParser.NumberType.LONG is used for timestamp.
            if (numberType == JsonParser.NumberType.LONG) {
                isIntFormatCalled = true;
                this.numberType = numberType;
                this.valueFormat = valueFormat;
            }
        }

        @Override public void expectStringFormat(JavaType type) {
            isStringFormatCalled = true; // Default call
        }
        
        @Override
        public void expectStringFormat(JavaType type, JsonValueFormat valueFormat) {
            isStringFormatCalled = true;
            this.valueFormat = valueFormat;
        }
        
        @Override public void expectNullFormat(JavaType type) {}
        @Override public void expectObjectFormat(JavaType type) {}
        @Override public void expectArrayFormat(JavaType type) {}
        @Override public void expectDateLineSegmentFormat(JavaType type) {}
        @Override public void expectTimestampFormat(JavaType type) {}
    }
}
