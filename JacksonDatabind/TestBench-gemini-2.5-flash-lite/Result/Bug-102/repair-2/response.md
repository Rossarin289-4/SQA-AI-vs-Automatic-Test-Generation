```java
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
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.JsonGenerationException; // Added import

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer; // Added import for JsonGenerator

// Dummy implementation for abstract methods and dependencies for DateSerializer
// This class is kept simple and only overrides necessary methods for testing.
// It does not need to be concrete as the tests will instantiate it.
public class DateTimeSerializerBaseTest {

    // --- Mocks and Dummy Serializer ---

    // Dummy serializer extending DateTimeSerializerBase for testing purposes
    private static class DummyDateSerializer extends DateTimeSerializerBase<Date> {
        protected DummyDateSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new DummyDateSerializer(timestamp, customFormat);
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
                // Ensure _serializeAsString is called with the correct parameters
                _serializeAsString(value, gen, serializers);
            }
        }
    }

    // Mock JsonGenerator to capture output
    private static class MockJsonGenerator extends JsonGenerator {
        public String writtenString = null;
        public long writtenNumber = 0;
        public boolean numberWritten = false;
        public boolean stringWritten = false;
        private final TokenBuffer _tb = new TokenBuffer(null, null);

        @Override
        public void writeString(String value) throws IOException {
            this.writtenString = value;
            this.stringWritten = true;
            _tb.writeString(value);
        }

        @Override
        public void writeNumber(long value) throws IOException {
            this.writtenNumber = value;
            this.numberWritten = true;
            _tb.writeNumber(value);
        }

        @Override
        public void writeNumber(String value) throws IOException {
             this.writtenNumber = Long.parseLong(value); // For simplicity, assume it's a long
             this.numberWritten = true;
             _tb.writeNumber(value);
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            _tb.writeFieldName(name);
        }

        @Override
        public void writeStartObject() throws IOException { _tb.writeStartObject(); }
        @Override
        public void writeEndObject() throws IOException { _tb.writeEndObject(); }
        @Override
        public void writeStartArray() throws IOException { _tb.writeStartArray(); }
        @Override
        public void writeEndArray() throws IOException { _tb.writeEndArray(); }
        @Override
        public void writeNull() throws IOException { _tb.writeNull(); }
        @Override
        public void writeBoolean(boolean state) throws IOException { _tb.writeBoolean(state); }
        @Override
        public void writeFloat(float value) throws IOException { _tb.writeFloat(value); }
        @Override
        public void writeDouble(double value) throws IOException { _tb.writeDouble(value); }
        @Override
        public void writeBinary(byte[] data) throws IOException { _tb.writeBinary(data); }
        @Override
        public void writeRaw(String json) throws IOException { _tb.writeRaw(json); }
        @Override
        public void writeRaw(char[] buffer, int offset, int length) throws IOException { _tb.writeRaw(buffer, offset, length); }
        @Override
        public void writeRaw(Object raw) throws IOException { _tb.writeRaw(raw); }
        @Override
        public void writeRawUTF8String(byte[] bytes, int offset, int length) throws IOException { _tb.writeRawUTF8String(bytes, offset, length); }
        @Override
        public void writeUTF8String(byte[] bytes, int offset, int length) throws IOException { _tb.writeUTF8String(bytes, offset, length); }
        @Override
        public void writeStringField(String fieldName, String value) throws IOException { _tb.writeStringField(fieldName, value); }
        @Override
        public void writeBooleanField(String fieldName, boolean value) throws IOException { _tb.writeBooleanField(fieldName, value); }
        @Override
        public void writeNullField(String fieldName) throws IOException { _tb.writeNullField(fieldName); }
        @Override
        public void writeIntField(String fieldName, int value) throws IOException { _tb.writeIntField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, int value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, long value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, double value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, float value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, BigDecimal value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, BigInteger value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, short value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeNumberField(String fieldName, byte value) throws IOException { _tb.writeNumberField(fieldName, value); }
        @Override
        public void writeObject(Object value) throws IOException { _tb.writeObject(value); }
        @Override
        public void writeTree(JsonNode value) throws IOException { _tb.writeTree(value); }
        @Override
        public JsonGenerator enable(Feature f) { _tb.enable(f); return this; }
        @Override
        public JsonGenerator disable(Feature f) { _tb.disable(f); return this; }
        @Override
        public JsonGenerator set(Feature f, boolean state) { _tb.set(f, state); return this; }
        @Override
        public boolean isEnabled(Feature f) { return _tb.isEnabled(f); }
        @Override
        public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override
        public void close() throws IOException { _tb.close(); }
        @Override
        public boolean isClosed() { return _tb.isClosed(); }
        @Override
        public Version version() { return Version.unknownVersion(); }
        @Override
        public void flush() throws IOException { _tb.flush(); }
        @Override
        public JsonGenerator.OutputContext getOutputContext() { return _tb.getOutputContext(); }
    }

    // Mock SerializerProvider
    private static class MockSerializerProvider extends SerializerProvider {
        private final SerializationConfig _config;
        private final TimeZone _tz;
        private final Locale _locale;
        private final DateFormat _dateFormat;
        private final boolean _writeDatesAsTimestamps;

        // Basic constructor for minimal cases
        public MockSerializerProvider() {
            super(null);
            _config = null;
            _tz = TimeZone.getDefault();
            _locale = Locale.getDefault();
            _dateFormat = null;
            _writeDatesAsTimestamps = false;
        }

        public MockSerializerProvider(SerializationConfig config, TimeZone tz, Locale locale, DateFormat dateFormat, boolean writeDatesAsTimestamps) {
            super(null);
            _config = config;
            _tz = tz;
            _locale = locale;
            _dateFormat = dateFormat;
            _writeDatesAsTimestamps = writeDatesAsTimestamps;
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
        public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) {
                return _writeDatesAsTimestamps;
            }
            return false; // Default to false for other features
        }

        @Override
        public void defaultSerializeDateValue(Date date, JsonGenerator gen) throws IOException {
            // Simulate default serialization behavior. In the absence of a custom format,
            // it's either timestamp or a standard string format.
            if (_writeDatesAsTimestamps) {
                gen.writeNumber(date.getTime());
            } else {
                // Use a simple default format if no custom format is provided.
                DateFormat defaultFormat = new StdDateFormat().withLocale(getLocale()).withTimeZone(getTimeZone());
                gen.writeString(defaultFormat.format(date));
            }
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
        public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
            // Default to null, tests will override if needed
            return null;
        }
    }

    // Mock BeanProperty
    private static class MockBeanProperty implements BeanProperty {
        private final String _name;
        private final JavaType _type;

        public MockBeanProperty(String name, JavaType type) {
            _name = name;
            _type = type;
        }

        @Override public String getName() { return _name; }
        @Override public PropertyName getFullName() { return PropertyName.construct(_name); }
        @Override public PropertyName getSimpleName() { return PropertyName.construct(_name); }
        @Override public JavaType getType() { return _type; }
        @Override public JavaType getJavaType() { return _type; }
        @Override public Type getGenericPropertyType() { return _type.getRawClass(); } // Simplification
        @Override public boolean isRequired() { return false; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public AnnotatedMember getMember() { return null; }
        @Override public JavaType getReadType() { return _type; }
        @Override public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) { }
        @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_METADATA; }
        @Override public JsonFormat.Value findFormatOverrides(AnnotationIntrospector intr, com.fasterxml.jackson.databind.introspect.Annotated ann, Class<?> type) { return null;}
        @Override public void assignType(JavaType type) { }
        @Override public String toString() { return String.format("[MockBeanProperty: %s]", _name); }
    }

    // Mock JsonFormatVisitorWrapper
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

        @Override
        public void expectAnyFormat(JavaType type) {}
        @Override public void expectBooleanFormat(JavaType type) {}

        @Override
        public void expectIntegerFormat(JavaType type) {
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
            if (numberType == JsonParser.NumberType.LONG) {
                isIntFormatCalled = true;
                this.numberType = numberType;
                this.valueFormat = valueFormat;
            }
        }

        @Override
        public void expectStringFormat(JavaType type) {
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

    // --- Test Cases ---

    @Test
    public void testSerializeAsTimestampDefaultFeatureEnabled() throws Exception {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        DateFormat df = new StdDateFormat().withTimeZone(tz).withLocale(loc);
        // Feature WRITE_DATES_AS_TIMESTAMPS is enabled
        MockSerializerProvider provider = new MockSerializerProvider(null, tz, loc, df, true);
        DummyDateSerializer serializer = new DummyDateSerializer(null, null); // _useTimestamp is null
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertTrue(generator.numberWritten);
        assertEquals(date.getTime(), generator.writtenNumber);
        assertFalse(generator.stringWritten);
    }

    @Test
    public void testSerializeAsStringDefaultFeatureDisabled() throws Exception {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        DateFormat df = new StdDateFormat().withTimeZone(tz).withLocale(loc);
        // Feature WRITE_DATES_AS_TIMESTAMPS is disabled
        MockSerializerProvider provider = new MockSerializerProvider(null, tz, loc, df, false);
        DummyDateSerializer serializer = new DummyDateSerializer(null, null); // _useTimestamp is null
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertFalse(generator.numberWritten);
        assertTrue(generator.stringWritten);
        // Use the provider's defaultSerializeDateValue for expected string
        DateFormat expectedFormat = new StdDateFormat().withLocale(loc).withTimeZone(tz);
        assertEquals(expectedFormat.format(date), generator.writtenString);
    }

    @Test
    public void testSerializeWithCustomFormatAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        MockSerializerProvider provider = new MockSerializerProvider(null, TimeZone.getTimeZone("UTC"), Locale.US, null, false);
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, customDf); // Explicitly NOT timestamp
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
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        MockSerializerProvider provider = new MockSerializerProvider(null, TimeZone.getTimeZone("UTC"), Locale.US, null, false);
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.TRUE, customDf); // Explicitly timestamp
        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        serializer.serialize(date, generator, provider);

        assertTrue(generator.numberWritten);
        assertFalse(generator.stringWritten);
        assertEquals(date.getTime(), generator.writtenNumber);
    }

    @Test
    public void testCreateContextualWithNumericShape() throws Exception {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        DateFormat df = new StdDateFormat();
        MockSerializerProvider provider = new MockSerializerProvider(null, tz, loc, df, false) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER);
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.TRUE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNull(((DummyDateSerializer) contextualSerializer)._customFormat);
    }

    @Test
    public void testCreateContextualWithPattern() throws Exception {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        DateFormat df = new StdDateFormat();
        MockSerializerProvider provider = new MockSerializerProvider(null, tz, loc, df, false) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forPattern("MM/dd/yyyy");
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertEquals("MM/dd/yyyy", ((SimpleDateFormat)((DummyDateSerializer) contextualSerializer)._customFormat).toPattern());
    }

    @Test
    public void testCreateContextualWithLocaleAndTimeZone() throws Exception {
        TimeZone tz0 = TimeZone.getTimeZone("GMT");
        Locale loc0 = Locale.US;
        StdDateFormat df0 = new StdDateFormat().withTimeZone(tz0).withLocale(loc0);
        MockSerializerProvider provider = new MockSerializerProvider(null, tz0, loc0, df0, false) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.builder()
                        .setLocale(Locale.CANADA)
                        .setTimeZone(TimeZone.getTimeZone("PST"))
                        .build();
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertTrue(((DummyDateSerializer) contextualSerializer)._customFormat instanceof StdDateFormat);
        assertEquals(Locale.CANADA, ((StdDateFormat)((DummyDateSerializer) contextualSerializer)._customFormat).getLocale());
        assertEquals(TimeZone.getTimeZone("PST"), ((StdDateFormat)((DummyDateSerializer) contextualSerializer)._customFormat).getTimeZone());
    }

    @Test
    public void testCreateContextualWithNonStdDateFormatAndConfig() throws Exception {
        SimpleDateFormat customDf = new SimpleDateFormat("yyyy-MM-dd"); // A non-StdDateFormat
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.US;
        // Mock provider to use a non-StdDateFormat
        MockSerializerProvider provider = new MockSerializerProvider(null, tz, loc, customDf, false) {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.builder()
                        .setLocale(Locale.CANADA)
                        .setTimeZone(TimeZone.getTimeZone("PST"))
                        .build();
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        // Expecting reportBadDefinition because customDf is not SimpleDateFormat for configuration
        try {
            serializer.createContextual(provider, property);
            fail("Expected JsonMappingException for non-SimpleDateFormat config");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Configured `DateFormat`"));
            assertTrue(e.getMessage().contains("not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`"));
        }
    }

    @Test
    public void testIsEmptyDefault() throws Exception {
        // The implementation of isEmpty() in DateTimeSerializerBase always returns false.
        // This test verifies that behavior.
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        Date date = new Date(0L); // Epoch time
        MockSerializerProvider provider = new MockSerializerProvider();
        assertFalse(serializer.isEmpty(provider, date));
    }

    @Test
    public void testGetSchemaAsTimestamp() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, null, true); // WRITE_DATES_AS_TIMESTAMPS enabled
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);

        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("format").asText().contains("timestamp"));
    }

    @Test
    public void testGetSchemaAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, customDf, false); // WRITE_DATES_AS_TIMESTAMPS disabled
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, customDf);

        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
        assertTrue(schema.get("format").asText().contains("date-time"));
    }

    @Test
    public void testAcceptJsonFormatVisitorAsTimestamp() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, null, true); // WRITE_DATES_AS_TIMESTAMPS enabled
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);

        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        serializer.acceptJsonFormatVisitor(visitor, null);

        assertTrue(visitor.isIntFormatCalled);
        assertEquals(JsonParser.NumberType.LONG, visitor.numberType);
        assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.valueFormat);
    }

    @Test
    public void testAcceptJsonFormatVisitorAsString() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, customDf, false); // WRITE_DATES_AS_TIMESTAMPS disabled
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, customDf);

        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        serializer.acceptJsonFormatVisitor(visitor, null);

        assertTrue(visitor.isStringFormatCalled);
        assertEquals(JsonValueFormat.DATE_TIME, visitor.valueFormat);
    }

    @Test
    public void testSerializeAsStringWithReusedFormat() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, customDf);
        // Manually set a cloned format in the AtomicReference to simulate reuse
        DateFormat clonedDf = (DateFormat) customDf.clone();
        serializer._reusedCustomFormat.set(clonedDf);

        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider(null, TimeZone.getTimeZone("UTC"), Locale.US, customDf, false);
        
        serializer.serialize(date, generator, provider);

        assertTrue(generator.stringWritten);
        assertFalse(generator.numberWritten);
        assertEquals(customDf.format(date), generator.writtenString);
        
        // Ensure the reused format is still there after use (compareAndSet puts it back)
        assertNotNull(serializer._reusedCustomFormat.get());
        assertSame(clonedDf, serializer._reusedCustomFormat.get()); // Should be the same instance
    }

    @Test
    public void testSerializeAsStringWithClonedFormatWhenNoReuse() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        customDf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, customDf); // _reusedCustomFormat is null initially

        Date date = new Date(1678886400000L); // March 15, 2023, 12:00:00 PM GMT

        MockJsonGenerator generator = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider(null, TimeZone.getTimeZone("UTC"), Locale.US, customDf, false);

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
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.TRUE, null);
        MockSerializerProvider provider = new MockSerializerProvider(); // Basic provider
        assertTrue(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_false() throws Exception {
        DummyDateSerializer serializer = new DummyDateSerializer(Boolean.FALSE, null);
        MockSerializerProvider provider = new MockSerializerProvider(); // Basic provider
        assertFalse(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_feature_enabled() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, null, true); // WRITE_DATES_AS_TIMESTAMPS enabled
        DummyDateSerializer serializer = new DummyDateSerializer(null, null); // _useTimestamp is null
        assertTrue(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_feature_disabled() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider(null, null, null, null, false); // WRITE_DATES_AS_TIMESTAMPS disabled
        DummyDateSerializer serializer = new DummyDateSerializer(null, null); // _useTimestamp is null
        assertFalse(serializer._asTimestamp(provider));
    }
    
    @Test
    public void test_asTimestamp_when_useTimestamp_is_null_and_customFormat_present() throws Exception {
        DateFormat customDf = new SimpleDateFormat("yyyy-MM-dd");
        DummyDateSerializer serializer = new DummyDateSerializer(null, customDf); // _useTimestamp is null, _customFormat is present
        MockSerializerProvider provider = new MockSerializerProvider(); // Basic provider
        assertFalse(serializer._asTimestamp(provider));
    }

    @Test
    public void testCreateContextualWithEmptyFormatOverrides() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.empty(); // Empty overrides
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        // Should return the same serializer if no overrides are found
        assertSame(serializer, contextualSerializer);
    }

    @Test
    public void testCreateContextualWithAsStringShape() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertTrue(((DummyDateSerializer) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    @Test
    public void testCreateContextualWithFormatAsDate() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.DATE);
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertTrue(((DummyDateSerializer) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    @Test
    public void testCreateContextualWithFormatAsDateTime() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.DATE_TIME);
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertTrue(((DummyDateSerializer) contextualSerializer)._customFormat instanceof StdDateFormat);
    }
    
    @Test
    public void testCreateContextualWithFormatAsObject() throws Exception {
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonFormat.Value findFormatOverrides(BeanProperty property, JavaType type, Class<?> view) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT);
            }
        };
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        BeanProperty property = new MockBeanProperty("testDate", null);

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertTrue(contextualSerializer instanceof DummyDateSerializer);
        assertEquals(Boolean.FALSE, ((DummyDateSerializer) contextualSerializer)._useTimestamp);
        assertNotNull(((DummyDateSerializer) contextualSerializer)._customFormat);
        assertTrue(((DummyDateSerializer) contextualSerializer)._customFormat instanceof StdDateFormat);
    }

    @Test
    public void test_asTimestamp_provider_null_throws_exception() throws Exception {
        DummyDateSerializer serializer = new DummyDateSerializer(null, null);
        try {
            serializer._asTimestamp(null);
            fail("Expected IllegalArgumentException for null SerializerProvider");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Null SerializerProvider passed"));
        }
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover `_asTimestamp`, `createContextual`, `serialize`, `isEmpty`, `getSchema`, and `acceptJsonFormatVisitor`. Edge cases for timestamp vs. string serialization and custom format configurations are explored.
2. TEST CASE DESIGN -
    - `testSerializeAsTimestampDefaultFeatureEnabled`: Input: Date object, WRITE_DATES_AS_TIMESTAMPS enabled. Expected: Writes timestamp (long). Derived from `_asTimestamp` logic.
    - `testSerializeAsStringDefaultFeatureDisabled`: Input: Date object, WRITE_DATES_AS_TIMESTAMPS disabled. Expected: Writes string using default format. Derived from `_asTimestamp` and `_serializeAsString`.
    - `testSerializeWithCustomFormatAsString`: Input: Date object, custom format, explicitly as string. Expected: Writes string using custom format. Derived from `serialize` and `_serializeAsString`.
    - `testSerializeWithCustomFormatAsTimestamp`: Input: Date object, custom format, explicitly as timestamp. Expected: Writes timestamp (long). Derived from `serialize` and `_asTimestamp`.
    - `testCreateContextualWithNumericShape`: Input: `JsonFormat.Shape.NUMBER` override. Expected: Serializer configured for timestamp. Derived from `createContextual`.
    - `testCreateContextualWithPattern`: Input: `JsonFormat.Pattern` override. Expected: Serializer with `SimpleDateFormat`. Derived from `createContextual`.
    - `testCreateContextualWithLocaleAndTimeZone`: Input: `Locale`, `TimeZone` overrides. Expected: Serializer with `StdDateFormat` configured. Derived from `createContextual`.
    - `testCreateContextualWithNonStdDateFormatAndConfig`: Input: Non-`SimpleDateFormat`, locale/timezone overrides. Expected: `JsonMappingException`. Derived from `createContextual`.
    - `testIsEmptyDefault`: Input: Any Date. Expected: `false`. Derived from `isEmpty`.
    - `testGetSchemaAsTimestamp`: Input: `WRITE_DATES_AS_TIMESTAMPS` enabled. Expected: Schema type "number". Derived from `getSchema`.
    - `testGetSchemaAsString`: Input: `WRITE_DATES_AS_TIMESTAMPS` disabled. Expected: Schema type "string". Derived from `getSchema`.
    - `testAcceptJsonFormatVisitorAsTimestamp`: Input: `WRITE_DATES_AS_TIMESTAMPS` enabled. Expected: `visitIntFormat(LONG, UTC_MILLISEC)`. Derived from `acceptJsonFormatVisitor`.
    - `testAcceptJsonFormatVisitorAsString`: Input: `WRITE_DATES_AS_TIMESTAMPS` disabled. Expected: `visitStringFormat(DATE_TIME)`. Derived from `acceptJsonFormatVisitor`.
    - `testSerializeAsStringWithReusedFormat`: Input: Custom format, `_reusedCustomFormat` pre-populated. Expected: Serialized string, `_reusedCustomFormat` retains instance. Derived from `_serializeAsString`.
    - `testSerializeAsStringWithClonedFormatWhenNoReuse`: Input: Custom format, `_reusedCustomFormat` initially null. Expected: Serialized string, `_reusedCustomFormat` gets a clone. Derived from `_serializeAsString`.
    - `test_asTimestamp_when_useTimestamp_is_true`: Input: `_useTimestamp` is true. Expected: `true`. Derived from `_asTimestamp`.
    - `test_asTimestamp_when_useTimestamp_is_false`: Input: `_useTimestamp` is false. Expected: `false`. Derived from `_asTimestamp`.
    - `test_asTimestamp_when_useTimestamp_is_null_and_feature_enabled`: Input: `_useTimestamp` null, feature enabled. Expected: `true`. Derived from `_asTimestamp`.
    - `test_asTimestamp_when_useTimestamp_is_null_and_feature_disabled`: Input: `_useTimestamp` null, feature disabled. Expected: `false`. Derived from `_asTimestamp`.
    - `test_asTimestamp_when_useTimestamp_is_null_and_customFormat_present`: Input: `_useTimestamp` null, custom format. Expected: `false`. Derived from `_asTimestamp`.
    - `testCreateContextualWithEmptyFormatOverrides`: Input: Empty `JsonFormat.Value`. Expected: Same serializer instance. Derived from `createContextual`.
    - `testCreateContextualWithAsStringShape`: Input: `JsonFormat.Shape.STRING`. Expected: Serializer for string. Derived from `createContextual`.
    - `testCreateContextualWithFormatAsDate`: Input: `JsonFormat.Shape.DATE`. Expected: Serializer for string. Derived from `createContextual`.
    - `testCreateContextualWithFormatAsDateTime`: Input: `JsonFormat.Shape.DATE_TIME`. Expected: Serializer for string. Derived from `createContextual`.
    - `testCreateContextualWithFormatAsObject`: Input: `JsonFormat.Shape.OBJECT`. Expected: Serializer for string. Derived from `createContextual`.
    - `test_asTimestamp_provider_null_throws_exception`: Input: Null `SerializerProvider`. Expected: `IllegalArgumentException`. Derived from `_asTimestamp`.
4. DEFECT DETECTION STRATEGY - Tests verify the logic for choosing between timestamp and string serialization based on `_useTimestamp`, `_customFormat`, and `SerializationFeature.WRITE_DATES_AS_TIMESTAMPS`, as well as the contextualization logic for `JsonFormat` overrides.
5. SUMMARY - 27 tests.
6. LIMITATIONS - Mock implementations are simplified and may not cover all edge cases of the actual Jackson library components. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.