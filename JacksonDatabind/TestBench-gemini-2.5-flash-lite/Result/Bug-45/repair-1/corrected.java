package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;

// Mock implementation of BeanProperty.Bogus to avoid compilation issues
abstract class BogusBeanProperty extends BeanProperty.Bogus {
    protected BogusBeanProperty(com.fasterxml.jackson.databind.PropertyName name, JavaType type, com.fasterxml.jackson.databind.util.AccessPattern indexedListScale, com.fasterxml.jackson.databind.util.AccessPattern indexedListScale2, com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceWrapper ref, com.fasterxml.jackson.databind.introspect.AnnotatedMember member, com.fasterxml.jackson.databind.PropertyMetadata metadata, boolean isRequired) {
        super(name, type, indexedListScale, indexedListScale2, ref, member, metadata, isRequired);
    }
}

// Mock implementation of AnnotatedMember to avoid compilation issues
abstract class BogusAnnotatedMember extends AnnotatedMember {
    protected BogusAnnotatedMember(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, JavaType type, com.fasterxml.jackson.databind.util.AccessPattern index, com.fasterxml.jackson.databind.AnnotationMap classAnnotations, com.fasterxml.jackson.databind.AnnotationMap memberAnnotations) {
        super(config, type, index, classAnnotations, memberAnnotations);
    }

    protected BogusAnnotatedMember() {
        super(null, null, null, null, null);
    }
}

public class DateTimeSerializerBaseTest {

    // Dummy implementation of DateTimeSerializerBase for testing
    static class TestDateTimeSerializer<T> extends DateTimeSerializerBase<T> {
        private long timestampValue;

        protected TestDateTimeSerializer(Class<T> type, Boolean useTimestamp, DateFormat customFormat) {
            super(type, useTimestamp, customFormat);
            this.timestampValue = 0L;
        }

        public void setTimestampValue(long timestampValue) {
            this.timestampValue = timestampValue;
        }

        @Override
        public DateTimeSerializerBase<T> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateTimeSerializer<T>(this.handledType(), timestamp, customFormat);
        }

        @Override
        protected long _timestamp(T value) {
            if (value == null) {
                return 0L;
            }
            return this.timestampValue;
        }

        @Override
        public void serialize(T value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (_asTimestamp(serializers)) {
                gen.writeNumber(_timestamp(value));
            } else {
                if (_customFormat != null) {
                    gen.writeString(_customFormat.format(new Date(_timestamp(value))));
                } else {
                    // Default ISO format
                    gen.writeString(new StdDateFormat().format(new Date(_timestamp(value))));
                }
            }
        }
    }

    // Mock SerializerProvider
    static class MockSerializerProvider extends SerializerProvider {
        private final boolean writeDatesAsTimestamps;
        private final Locale locale;
        private final TimeZone timeZone;
        private final AnnotationIntrospector annotationIntrospector;

        MockSerializerProvider(boolean writeDatesAsTimestamps, Locale locale, TimeZone timeZone, AnnotationIntrospector ai) {
            super(null, null, null);
            this.writeDatesAsTimestamps = writeDatesAsTimestamps;
            this.locale = locale;
            this.timeZone = timeZone;
            this.annotationIntrospector = ai;
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) {
                return writeDatesAsTimestamps;
            }
            return super.isEnabled(feature);
        }

        @Override
        public Locale getLocale() {
            return locale;
        }

        @Override
        public TimeZone getTimeZone() {
            return timeZone;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return annotationIntrospector;
        }

        // Mock implementation for AbstractSerializerProvider
        @Override
        public com.fasterxml.jackson.databind.ser.ValueInstantiator valueInstantiator(JavaType type) {
            return null;
        }
        
        @Override
        public SerializerFactory getSerializerFactory() {
            return null;
        }
    }

    // Dummy annotation class for JsonFormat
    static class JsonFormatAnnotated implements JsonFormat {
        private final JsonFormat.Value _format;

        JsonFormatAnnotated(JsonFormat.Value format) {
            _format = format;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return JsonFormat.class;
        }

        @Override
        public JsonFormat.Shape shape() { return _format.getShape(); }
        @Override
        public String pattern() { return _format.getPattern(); }
        @Override
        public String locale() { return _format.getLocale(); }
        @Override
        public String timezone() { return _format.getTimeZone(); }
        @Override
        public Boolean lenient() { return _format.isLenient(); }
        @Override
        public Integer timezoneId() { return _format.getTimezoneId(); }
        @Override
        public JsonFormat.Feature[] features() { return _format.getFeatures(); }
        @Override
        public JsonFormat.Feature[] with() { return _format.getWith(); }
        @Override
        public JsonFormat.Feature[] without() { return _format.getWithout(); }
    }
    
    // Mock JsonFormatVisitorWrapper
    static class MockJsonFormatVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        MockJsonFormatVisitorWrapper() {
            super(null);
        }
        
        static class Base extends MockJsonFormatVisitorWrapper {
            Base() { super(); }
            @Override
            public void expectAnyFormat(JavaType type) throws JsonMappingException {}
            @Override
            public JsonFormatVisitable expectArrayFormat(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonFormatVisitable expectBooleanFormat(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonFormatVisitable expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonFormatVisitable expectNumberFormat(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonFormatVisitable expectStringFormat(JavaType type) throws JsonMappingException { return null; }
            @Override
            public void basicPropertyDesc(BeanProperty prop) throws JsonMappingException {}
            @Override
            public SerializerProvider getProvider() { return new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), new JacksonAnnotationIntrospector()); }
        }
    }

    // Mock AnnotatedMember for testing
    static class MockAnnotatedMember extends BogusAnnotatedMember {
        private final Annotation _annotation;
        private final Class<?> _rawType;

        public MockAnnotatedMember(Class<?> rawType, Annotation annotation) {
            this._rawType = rawType;
            this._annotation = annotation;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (_annotation != null && acls.isInstance(_annotation)) {
                return (A) _annotation;
            }
            return null;
        }

        @Override
        public AnnotatedElement getAnnotated() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected int getModifiers() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getName() {
            return "dummyMember";
        }

        @Override
        public JavaType getType() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Class<?> getRawType() {
            return _rawType;
        }

        @Override
        public AnnotationMap getAllAnnotations() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Annotated withAnnotations(AnnotationMap fallback) {
            throw new UnsupportedOperationException();
        }
    }
    
    // Mock BeanProperty
    static class MockBeanProperty extends BogusBeanProperty {
        private final AnnotatedMember member;

        MockBeanProperty(AnnotatedMember member) {
            super(null, null, null, null, null, member, null, false);
            this.member = member;
        }

        @Override
        public AnnotatedMember getMember() {
            return member;
        }
    }

    // Test cases for createContextual method
    @Test
    public void testCreateContextualWithNumericShape() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER);
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertTrue(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
    }

    @Test
    public void testCreateContextualWithStringShape() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertFalse(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNotNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
        assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, ((SimpleDateFormat)((TestDateTimeSerializer<?>) contextualSerializer)._customFormat).toPattern());
    }

    @Test
    public void testCreateContextualWithStringShapeAndPattern() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.forPattern("yyyy-MM-dd");
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertFalse(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNotNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
        assertEquals("yyyy-MM-dd", ((SimpleDateFormat)((TestDateTimeSerializer<?>) contextualSerializer)._customFormat).toPattern());
    }

    @Test
    public void testCreateContextualWithStringShapeAndLocale() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, new Locale("fr", "FR"), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.forLocale(Locale.FRANCE);
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertFalse(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNotNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
        assertEquals(Locale.FRANCE, ((SimpleDateFormat)((TestDateTimeSerializer<?>) contextualSerializer)._customFormat).getLocale());
    }

    @Test
    public void testCreateContextualWithStringShapeAndTimeZone() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getTimeZone("GMT"), ai);
        JsonFormat.Value format = JsonFormat.Value.forTimeZone(TimeZone.getTimeZone("PST"));
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertFalse(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNotNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
        assertEquals(TimeZone.getTimeZone("PST"), ((SimpleDateFormat)((TestDateTimeSerializer<?>) contextualSerializer)._customFormat).getTimeZone());
    }

    @Test
    public void testCreateContextualWithNoAnnotation() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        BeanProperty property = null;

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertSame(serializer, contextualSerializer);
    }
    
    @Test
    public void testCreateContextualWithEmptyAnnotation() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.empty();
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertSame(serializer, contextualSerializer);
    }

    @Test
    public void testCreateContextualWithTimestampFlagTrue() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.useTimestamp(true);
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertTrue(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
    }
    
    @Test
    public void testCreateContextualWithTimestampFlagFalse() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        JsonFormat.Value format = JsonFormat.Value.useTimestamp(false);
        AnnotatedMember member = new MockAnnotatedMember(Object.class, new JsonFormatAnnotated(format));
        BeanProperty property = new MockBeanProperty(member);

        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertTrue(contextualSerializer instanceof TestDateTimeSerializer);
        assertFalse(((TestDateTimeSerializer<?>) contextualSerializer)._useTimestamp.booleanValue());
        assertNull(((TestDateTimeSerializer<?>) contextualSerializer)._customFormat);
    }

    // Test cases for isEmpty method
    @Test
    public void testIsEmptyWithNullValue() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        assertTrue(serializer.isEmpty(null));
    }

    @Test
    public void testIsEmptyWithZeroTimestamp() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        ((TestDateTimeSerializer<?>) serializer).setTimestampValue(0L);
        assertTrue(serializer.isEmpty(new Object()));
    }

    @Test
    public void testIsEmptyWithNonZeroTimestamp() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        ((TestDateTimeSerializer<?>) serializer).setTimestampValue(12345L);
        assertFalse(serializer.isEmpty(new Object()));
    }
    
    @Test
    public void testIsEmptyWithProviderAndNullValue() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        assertTrue(serializer.isEmpty(provider, null));
    }

    @Test
    public void testIsEmptyWithProviderAndZeroTimestamp() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        ((TestDateTimeSerializer<?>) serializer).setTimestampValue(0L);
        assertTrue(serializer.isEmpty(provider, new Object()));
    }

    @Test
    public void testIsEmptyWithProviderAndNonZeroTimestamp() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        ((TestDateTimeSerializer<?>) serializer).setTimestampValue(12345L);
        assertFalse(serializer.isEmpty(provider, new Object()));
    }

    // Test cases for _asTimestamp method
    @Test
    public void testAsTimestampWithUseTimestampTrue() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, Boolean.TRUE, null);
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        assertTrue(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampWithUseTimestampFalse() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, Boolean.FALSE, null);
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        assertFalse(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampWithCustomFormat() {
        DateFormat format = new SimpleDateFormat();
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, format);
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        assertFalse(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampWithSerializationFeatureEnabled() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(true, Locale.getDefault(), TimeZone.getDefault(), ai);
        assertTrue(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampWithSerializationFeatureDisabled() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializerProvider provider = new MockSerializerProvider(false, Locale.getDefault(), TimeZone.getDefault(), ai);
        assertFalse(serializer._asTimestamp(provider));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestampWithNullProvider() {
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, null);
        serializer._asTimestamp(null);
    }
    
    // Test cases for _acceptJsonFormatVisitor
    @Test
    public void testAcceptJsonFormatVisitorAsNumber() throws Exception {
        JsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper.Base();
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, Boolean.TRUE, null);
        serializer.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testAcceptJsonFormatVisitorAsString() throws Exception {
        JsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper.Base();
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, Boolean.FALSE, null);
        serializer.acceptJsonFormatVisitor(visitor, null);
    }
    
    @Test
    public void testAcceptJsonFormatVisitorAsStringWithCustomFormat() throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        JsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper.Base();
        DateTimeSerializerBase<?> serializer = new TestDateTimeSerializer<>(Object.class, null, format);
        serializer.acceptJsonFormatVisitor(visitor, null);
    }
}
