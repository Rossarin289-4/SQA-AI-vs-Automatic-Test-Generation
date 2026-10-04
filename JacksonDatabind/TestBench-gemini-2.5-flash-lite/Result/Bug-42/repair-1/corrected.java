package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.util.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Accessor;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueAnchor;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.Bucket;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.util.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Accessor;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueAnchor;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.Bucket;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.GregorianCalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.JavaUtilDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateTimeDeserializers.DateDeserializer;

public class FromStringDeserializerTest {

    // Mock DeserializationContext that provides necessary methods
    private static class MockDeserializationContext extends DefaultDeserializationContext {

        protected MockDeserializationContext(DeserializerFactory df) {
            super(df, null); // Using a null DeserializerCache for simplicity
        }

        @Override
        public JavaType getTypeFactory() {
            // Provide a mock TypeFactory
            return new com.fasterxml.jackson.databind.type.TypeFactory(null, null) {
                @Override
                public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException {
                    // Basic mock for common types used in tests
                    if ("java.util.Map<java.lang.String, java.lang.Integer>".equals(canonical)) {
                        return new com.fasterxml.jackson.databind.type.SimpleType(java.util.Map.class);
                    }
                    // Fallback for other types
                    return new com.fasterxml.jackson.databind.type.SimpleType(Object.class);
                }
            };
        }

        @Override
        public Class<?> findClass(String className) throws ClassNotFoundException {
            switch (className) {
                case "java.io.File": return File.class;
                case "java.net.URL": return URL.class;
                case "java.net.URI": return URI.class;
                case "java.lang.Class": return Class.class;
                case "com.fasterxml.jackson.databind.JavaType": return JavaType.class;
                case "java.util.Currency": return Currency.class;
                case "java.util.regex.Pattern": return Pattern.class;
                case "java.util.Locale": return Locale.class;
                case "java.nio.charset.Charset": return Charset.class;
                case "java.util.TimeZone": return TimeZone.class;
                case "java.net.InetAddress": return InetAddress.class;
                case "java.net.InetSocketAddress": return InetSocketAddress.class;
                case "java.lang.String": return String.class;
                case "java.lang.Integer": return Integer.class;
                default: throw new ClassNotFoundException(className);
            }
        }

        @Override
        public JsonMappingException mappingException(JavaType type) {
            return new JsonMappingException("Mock mapping exception for type " + type.getRawClass().getName());
        }

        @Override
        public JsonMappingException mappingException(Class<?> type) {
            return new JsonMappingException("Mock mapping exception for type " + type.getName());
        }

        @Override
        public JsonMappingException mappingException(String msg, Object... params) {
            return new JsonMappingException(String.format(msg, params));
        }

        @Override
        public JsonMappingException instantiationException(Class<?> cls, Throwable cause) {
            return new JsonMappingException("Mock instantiation exception for class " + cls.getName(), cause);
        }
        
        @Override
        public JsonMappingException instantiationException(Class<?> cls, String msg) {
            return new JsonMappingException("Mock instantiation exception for class " + cls.getName() + ": " + msg);
        }

        @Override
        public JsonMappingException weirdStringException(String value, Class<?> targetType, String msg) {
            return new InvalidFormatException(msg, value, targetType);
        }
        
        @Override
        public boolean isEnabled(DeserializationFeature f) {
            if (f == DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS) return true;
            if (f == DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) return true;
            return false;
        }
    }

    // Mock JsonParser that allows setting current token and value
    private static class MockJsonParser extends TokenBuffer.Parser {
        private String currentValue;
        private JsonToken currentToken;
        private Object embeddedObject;

        protected MockJsonParser(String value) throws IOException {
            super(null, null); // TokenBuffer.Parser requires a JsonParser, null here for simplicity
            this.currentValue = value;
            this.currentToken = (value == null) ? JsonToken.VALUE_NULL : JsonToken.VALUE_STRING;
        }

        protected MockJsonParser(Object embeddedObject) throws IOException {
            super(null, null);
            this.embeddedObject = embeddedObject;
            this.currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        }

        // Override to control token progression
        @Override
        public JsonToken nextToken() throws IOException {
            if (currentToken == JsonToken.VALUE_STRING) {
                currentToken = JsonToken.END_ARRAY; // Simulate end after reading string
                return JsonToken.END_ARRAY;
            }
            if (currentToken == JsonToken.START_ARRAY) {
                currentToken = JsonToken.VALUE_STRING;
                return JsonToken.VALUE_STRING;
            }
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                 currentToken = JsonToken.END_ARRAY;
                 return JsonToken.END_ARRAY;
            }
            return null;
        }

        @Override
        public String getValueAsString() {
            return currentValue;
        }

        @Override
        public String getText() {
            return currentValue;
        }
        
        @Override
        public JsonToken getCurrentToken() {
            return currentToken;
        }

        @Override
        public Object getEmbeddedObject() {
            return embeddedObject;
        }

        // Implement other necessary methods or throw UnsupportedOperationException
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public void close() throws IOException { }
        @Override public boolean isClosed() { return false; }
        @Override public String getCurrentName() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public Number getNumberValue() { return null; }
        @Override public int getIntValue() { return 0; }
        @Override public long getLongValue() { return 0L; }
        @Override public BigInteger getBigIntegerValue() { return BigInteger.ZERO; }
        @Override public float getFloatValue() { return 0.0f; }
        @Override public double getDoubleValue() { return 0.0; }
        @Override public BigDecimal getDecimalValue() { return BigDecimal.ZERO; }
        @Override public boolean getBooleanValue() { return false; }
        @Override public byte[] getBinaryValue() { return null; }
        @Override public String getValueAsString(String defaultValue) { return currentValue != null ? currentValue : defaultValue;}
        @Override public boolean hasTextCharacters() { return currentValue != null; }
        @Override public JsonParser.NumberType getNumberType() { return null; }
        @Override public void overrideCurrentName(String name) {}
        @Override public JsonParser skipChildren() { return this; }
        @Override public boolean canParseAsync() { return false; }
        @Override public boolean hasTokenId(int id) { return false; }
        @Override public boolean hasToken(JsonToken t) { return currentToken == t; }
        @Override public int getCurrentTokenId() { return currentToken.id(); }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setLocation(JsonLocation loc) {}
        @Override public boolean requiresCustomCodec() { return false; }
        @Override public boolean canEstimatePartialLargeBigIntArrays() { return false; }
        @Override public boolean canReadObjectId() { return false; }
        @Override public boolean canReadTypeId() { return false; }
        @Override public Object readResolve() throws IOException { return null; }
        @Override public boolean readBinaryValue(Base64Variant b, OutputStream os) throws IOException { return false; }
        @Override public int read(byte[] cbuf, int offset, int length) throws IOException { return 0; }
        @Override public <T> T readValueAs(Class<T> valueType) throws IOException { return null; }
        @Override public <T> T readValueAs(TypeReference<T> valueTypeRef) throws IOException { return null; }
    }

    // Helper to create a mock DeserializationContext
    private DeserializationContext createMockContext() {
        // Need a DeserializerFactory for the DefaultDeserializationContext constructor
        DeserializerFactory dummyFactory = BeanDeserializerFactory.instance;
        return new MockDeserializationContext(dummyFactory);
    }

    // Helper to create a mock JsonParser
    private JsonParser createMockParser(String value) throws IOException {
        return new MockJsonParser(value);
    }

    // Test Cases for File
    @Test
    public void testFileDeserialization() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        String path = "/tmp/testfile.txt";
        JsonParser jp = createMockParser(path);
        File file = deserializer.deserialize(jp, ctxt);
        assertNotNull(file);
        assertEquals(path, file.getPath());
    }

    @Test
    public void testFileDeserializationEmptyString() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();
        JsonParser jp = createMockParser("");
        File file = deserializer.deserialize(jp, ctxt);
        // _deserializeFromEmptyString() returns null by default for File
        assertNull(file);
    }

    // Test Cases for URL
    @Test
    public void testUrlDeserialization() throws Exception {
        FromStringDeserializer<URL> deserializer = new FromStringDeserializer.Std(URL.class, FromStringDeserializer.Std.STD_URL);
        DeserializationContext ctxt = createMockContext();
        String urlString = "http://example.com";
        JsonParser jp = createMockParser(urlString);
        URL url = deserializer.deserialize(jp, ctxt);
        assertNotNull(url);
        assertEquals(urlString, url.toString());
    }
    
    @Test
    public void testUrlDeserializationInvalid() throws Exception {
        FromStringDeserializer<URL> deserializer = new FromStringDeserializer.Std(URL.class, FromStringDeserializer.Std.STD_URL);
        DeserializationContext ctxt = createMockContext();
        String urlString = "invalid-url";
        JsonParser jp = createMockParser(urlString);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for invalid URL");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof java.net.MalformedURLException);
        }
    }

    // Test Cases for URI
    @Test
    public void testUriDeserialization() throws Exception {
        FromStringDeserializer<URI> deserializer = new FromStringDeserializer.Std(URI.class, FromStringDeserializer.Std.STD_URI);
        DeserializationContext ctxt = createMockContext();
        String uriString = "http://example.com/path";
        JsonParser jp = createMockParser(uriString);
        URI uri = deserializer.deserialize(jp, ctxt);
        assertNotNull(uri);
        assertEquals(uriString, uri.toString());
    }

    @Test
    public void testUriDeserializationEmptyString() throws Exception {
        FromStringDeserializer<URI> deserializer = new FromStringDeserializer.Std(URI.class, FromStringDeserializer.Std.STD_URI);
        DeserializationContext ctxt = createMockContext();
        JsonParser jp = createMockParser("");
        URI uri = deserializer.deserialize(jp, ctxt);
        // _deserializeFromEmptyString() handles URI specifically
        assertNotNull(uri);
        assertEquals("", uri.toString());
    }

    // Test Cases for Class
    @Test
    public void testClassDeserialization() throws Exception {
        FromStringDeserializer<Class<?>> deserializer = new FromStringDeserializer.Std(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = createMockContext();
        String className = "java.lang.String";
        JsonParser jp = createMockParser(className);
        Class<?> cls = deserializer.deserialize(jp, ctxt);
        assertNotNull(cls);
        assertEquals(String.class, cls);
    }

    @Test
    public void testClassDeserializationNonExistent() throws Exception {
        FromStringDeserializer<Class<?>> deserializer = new FromStringDeserializer.Std(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = createMockContext();
        String className = "com.nonexistent.MyClass";
        JsonParser jp = createMockParser(className);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for non-existent class");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Mock instantiation exception"));
            assertTrue(e.getCause() instanceof ClassNotFoundException);
        }
    }

    // Test Cases for JavaType
    @Test
    public void testJavaTypeDeserialization() throws Exception {
        FromStringDeserializer<JavaType> deserializer = new FromStringDeserializer.Std(JavaType.class, FromStringDeserializer.Std.STD_JAVA_TYPE);
        DeserializationContext ctxt = createMockContext();
        String typeString = "java.util.Map<java.lang.String, java.lang.Integer>";
        JsonParser jp = createMockParser(typeString);
        JavaType javaType = deserializer.deserialize(jp, ctxt);
        assertNotNull(javaType);
        // Note: Mock TypeFactory is very basic, so we can't assert complex type details easily.
        // We can at least check if it's not null and from the correct base type.
        assertTrue(javaType.getRawClass().equals(java.util.Map.class) || javaType.getRawClass().equals(Object.class));
    }

    // Test Cases for Currency
    @Test
    public void testCurrencyDeserialization() throws Exception {
        FromStringDeserializer<Currency> deserializer = new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        DeserializationContext ctxt = createMockContext();
        String currencyCode = "USD";
        JsonParser jp = createMockParser(currencyCode);
        Currency currency = deserializer.deserialize(jp, ctxt);
        assertNotNull(currency);
        assertEquals(currencyCode, currency.getCurrencyCode());
    }

    @Test
    public void testCurrencyDeserializationInvalid() throws Exception {
        FromStringDeserializer<Currency> deserializer = new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        DeserializationContext ctxt = createMockContext();
        String currencyCode = "INVALID";
        JsonParser jp = createMockParser(currencyCode);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for invalid currency code");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    // Test Cases for Pattern
    @Test
    public void testPatternDeserialization() throws Exception {
        FromStringDeserializer<Pattern> deserializer = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = createMockContext();
        String regex = "^[a-zA-Z]+$";
        JsonParser jp = createMockParser(regex);
        Pattern pattern = deserializer.deserialize(jp, ctxt);
        assertNotNull(pattern);
        assertEquals(regex, pattern.pattern());
    }

    @Test
    public void testPatternDeserializationInvalid() throws Exception {
        FromStringDeserializer<Pattern> deserializer = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        DeserializationContext ctxt = createMockContext();
        String regex = "[invalid"; // Malformed regex
        JsonParser jp = createMockParser(regex);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for malformed regex");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof java.util.regex.PatternSyntaxException);
        }
    }

    // Test Cases for Locale
    @Test
    public void testLocaleDeserializationSimple() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        String localeString = "en";
        JsonParser jp = createMockParser(localeString);
        Locale locale = deserializer.deserialize(jp, ctxt);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testLocaleDeserializationTwoParts() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        String localeString = "en_US";
        JsonParser jp = createMockParser(localeString);
        Locale locale = deserializer.deserialize(jp, ctxt);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testLocaleDeserializationThreeParts() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        String localeString = "en_US_POSIX";
        JsonParser jp = createMockParser(localeString);
        Locale locale = deserializer.deserialize(jp, ctxt);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());
    }
    
    @Test
    public void testLocaleDeserializationEmptyString() throws Exception {
        FromStringDeserializer<Locale> deserializer = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        DeserializationContext ctxt = createMockContext();
        JsonParser jp = createMockParser("");
        Locale locale = deserializer.deserialize(jp, ctxt);
        // _deserializeFromEmptyString() handles Locale specifically
        assertNotNull(locale);
        assertEquals(Locale.ROOT, locale);
    }


    // Test Cases for Charset
    @Test
    public void testCharsetDeserialization() throws Exception {
        FromStringDeserializer<Charset> deserializer = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = createMockContext();
        String charsetName = "UTF-8";
        JsonParser jp = createMockParser(charsetName);
        Charset charset = deserializer.deserialize(jp, ctxt);
        assertNotNull(charset);
        assertEquals(charsetName, charset.name());
    }

    @Test
    public void testCharsetDeserializationInvalid() throws Exception {
        FromStringDeserializer<Charset> deserializer = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        DeserializationContext ctxt = createMockContext();
        String charsetName = "INVALID-CHARSET";
        JsonParser jp = createMockParser(charsetName);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for invalid charset");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    // Test Cases for TimeZone
    @Test
    public void testTimeZoneDeserialization() throws Exception {
        FromStringDeserializer<TimeZone> deserializer = new FromStringDeserializer.Std(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = createMockContext();
        String tzId = "GMT";
        JsonParser jp = createMockParser(tzId);
        TimeZone timeZone = deserializer.deserialize(jp, ctxt);
        assertNotNull(timeZone);
        assertEquals(tzId, timeZone.getID());
    }

    @Test
    public void testTimeZoneDeserializationInvalid() throws Exception {
        FromStringDeserializer<TimeZone> deserializer = new FromStringDeserializer.Std(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        DeserializationContext ctxt = createMockContext();
        String tzId = "INVALID/ZONE";
        JsonParser jp = createMockParser(tzId);
        // TimeZone.getTimeZone returns GMT for invalid IDs, so we assert that behavior.
        TimeZone timeZone = deserializer.deserialize(jp, ctxt);
        assertNotNull(timeZone);
        assertEquals("GMT", timeZone.getID());
    }

    // Test Cases for InetAddress
    @Test
    public void testInetAddressDeserializationHost() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String host = "localhost";
        JsonParser jp = createMockParser(host);
        InetAddress address = deserializer.deserialize(jp, ctxt);
        assertNotNull(address);
        assertEquals(host, address.getHostName());
    }

    @Test
    public void testInetAddressDeserializationIpAddress() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String ip = "127.0.0.1";
        JsonParser jp = createMockParser(ip);
        InetAddress address = deserializer.deserialize(jp, ctxt);
        assertNotNull(address);
        assertEquals(ip, address.getHostAddress());
    }

    @Test
    public void testInetAddressDeserializationInvalid() throws Exception {
        FromStringDeserializer<InetAddress> deserializer = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String invalid = "not an ip or host";
        JsonParser jp = createMockParser(invalid);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for invalid address");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof java.net.UnknownHostException);
        }
    }

    // Test Cases for InetSocketAddress
    @Test
    public void testInetSocketAddressDeserializationHostPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "localhost:8080";
        JsonParser jp = createMockParser(addressString);
        InetSocketAddress socketAddress = deserializer.deserialize(jp, ctxt);
        assertNotNull(socketAddress);
        assertEquals("localhost", socketAddress.getHostName());
        assertEquals(8080, socketAddress.getPort());
    }

    @Test
    public void testInetSocketAddressDeserializationIpPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "192.168.1.1:9000";
        JsonParser jp = createMockParser(addressString);
        InetSocketAddress socketAddress = deserializer.deserialize(jp, ctxt);
        assertNotNull(socketAddress);
        assertEquals("192.168.1.1", socketAddress.getAddress().getHostAddress());
        assertEquals(9000, socketAddress.getPort());
    }
    
    @Test
    public void testInetSocketAddressDeserializationIpv6BracketPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "[::1]:80";
        JsonParser jp = createMockParser(addressString);
        InetSocketAddress socketAddress = deserializer.deserialize(jp, ctxt);
        assertNotNull(socketAddress);
        assertEquals("::1", socketAddress.getHostString());
        assertEquals(80, socketAddress.getPort());
    }

    @Test
    public void testInetSocketAddressDeserializationIpv6BracketNoPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "[::1]";
        JsonParser jp = createMockParser(addressString);
        InetSocketAddress socketAddress = deserializer.deserialize(jp, ctxt);
        assertNotNull(socketAddress);
        assertEquals("::1", socketAddress.getHostString());
        assertEquals(0, socketAddress.getPort());
    }

    @Test
    public void testInetSocketAddressDeserializationHostNoPort() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "example.com";
        JsonParser jp = createMockParser(addressString);
        InetSocketAddress socketAddress = deserializer.deserialize(jp, ctxt);
        assertNotNull(socketAddress);
        assertEquals("example.com", socketAddress.getHostName());
        assertEquals(0, socketAddress.getPort());
    }
    
    @Test
    public void testInetSocketAddressDeserializationInvalidBracket() throws Exception {
        FromStringDeserializer<InetSocketAddress> deserializer = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        DeserializationContext ctxt = createMockContext();
        String addressString = "[::1"; // Missing closing bracket
        JsonParser jp = createMockParser(addressString);
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for invalid IPv6 format");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Bracketed IPv6 address must contain closing bracket"));
            assertTrue(e.getCause() instanceof InvalidFormatException);
        }
    }

    // Test case for UNWRAP_SINGLE_VALUE_ARRAYS
    @Test
    public void testDeserializeUnwrapSingleValueArray() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();

        // Mock JsonParser to simulate START_ARRAY, then VALUE_STRING, then END_ARRAY
        JsonParser jp = new MockJsonParser("/tmp/unwrapped.txt") { // Initial value set from constructor
            private int state = 0; // 0: initial, 1: after START_ARRAY, 2: after VALUE_STRING, 3: after END_ARRAY

            @Override
            public JsonToken nextToken() throws IOException {
                switch (state) {
                    case 0: // Expecting START_ARRAY
                        state++;
                        currentToken = JsonToken.START_ARRAY;
                        return JsonToken.START_ARRAY;
                    case 1: // Expecting VALUE_STRING
                        state++;
                        currentToken = JsonToken.VALUE_STRING;
                        // currentValue is already set from constructor
                        return JsonToken.VALUE_STRING;
                    case 2: // Expecting END_ARRAY
                        state++;
                        currentToken = JsonToken.END_ARRAY;
                        return JsonToken.END_ARRAY;
                    default:
                        return null;
                }
            }
            
            @Override
            public String getValueAsString() {
                if (currentToken == JsonToken.VALUE_STRING) {
                    return currentValue;
                }
                return null;
            }
        };

        File file = deserializer.deserialize(jp, ctxt);
        assertNotNull(file);
        assertEquals("/tmp/unwrapped.txt", file.getPath());
    }
    
    @Test
    public void testDeserializeUnwrapSingleValueArray_WithMoreThanOneValue() throws Exception {
        FromStringDeserializer<File> deserializer = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = createMockContext();

        JsonParser jp = new MockJsonParser(null) { // Initial value not important here
            private int state = 0; 

            @Override
            public JsonToken nextToken() throws IOException {
                switch (state) {
                    case 0: // Expecting START_ARRAY
                        state++;
                        currentToken = JsonToken.START_ARRAY;
                        return JsonToken.START_ARRAY;
                    case 1: // Expecting first VALUE_STRING
                        state++;
                        currentToken = JsonToken.VALUE_STRING;
                        currentValue = "/tmp/first_value.txt"; // Set first value
                        return JsonToken.VALUE_STRING; 
                    case 2: // Expecting second VALUE_STRING (which should fail)
                        state++;
                        currentToken = JsonToken.VALUE_STRING; 
                        currentValue = "/tmp/second_value.txt"; // Set second value
                        return JsonToken.VALUE_STRING;
                    default:
                        return null;
                }
            }
            
            @Override
            public String getValueAsString() {
                if (currentToken == JsonToken.VALUE_STRING) {
                    return currentValue;
                }
                return null;
            }
        };

        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected exception for multiple values in unwrapped array");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Attempted to unwrap single value array for single 'java.io.File' value but there was more than a single value in the array"));
            // The exception is thrown by ctxt.wrongTokenException, which would have END_ARRAY as the expected token.
            // We can't directly assert the token on the exception from a mock, but the message is sufficient.
        }
    }

    // Test for _deserializeEmbedded
    @Test
    public void testDeserializeEmbeddedObject() throws Exception {
        // Test with a concrete FromStringDeserializer subclass that knows how to handle embedded objects.
        // Since we don't have concrete subclasses listed with overriden _deserializeEmbedded, we'll test the default behavior.
        FromStringDeserializer<Object> deserializer = new FromStringDeserializer.Std(Object.class, FromStringDeserializer.Std.STD_CLASS); // Use a type that can accept Object
        DeserializationContext ctxt = createMockContext();
        
        Object embeddedObj = "some arbitrary object";
        JsonParser jp = new MockJsonParser(embeddedObj) { // Pass embedded object to constructor
            @Override
            public JsonToken getCurrentToken() {
                return JsonToken.VALUE_EMBEDDED_OBJECT;
            }
        };
        
        // The default _deserializeEmbedded throws an exception.
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected mapping exception for unhandled embedded object");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Don't know how to convert embedded Object of type"));
            assertTrue(e.getMessage().contains("java.lang.Object"));
        }
    }

    // Test for _deserializeFromEmptyString
    @Test
    public void testDeserializeFromEmptyString() throws Exception {
        // To test _deserializeFromEmptyString directly, we need to create a subclass
        // that overrides it and call the public deserialize method.
        FromStringDeserializer<Object> deserializer = new FromStringDeserializer<Object>(Object.class) {
            @Override
            protected Object _deserialize(String value, DeserializationContext ctxt) throws IOException {
                return null; // Not relevant for this test
            }
            
            // Override to specifically test this method
            @Override
            protected Object _deserializeFromEmptyString() throws IOException {
                return "custom empty string result";
            }
        };
        
        DeserializationContext ctxt = createMockContext();
        JsonParser jp = createMockParser(""); // Empty string input
        
        // The main deserialize method calls _deserializeFromEmptyString when the trimmed string is empty.
        Object result = deserializer.deserialize(jp, ctxt);
        assertEquals("custom empty string result", result);
    }
    
    // Test for `findDeserializer` static method
    @Test
    public void testFindDeserializerExisting() throws Exception {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URL.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
        assertNotNull(FromStringDeserializer.findDeserializer(JavaType.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));
    }

    @Test
    public void testFindDeserializerNonExisting() throws Exception {
        assertNull(FromStringDeserializer.findDeserializer(String.class));
        assertNull(FromStringDeserializer.findDeserializer(Integer.class));
        assertNull(FromStringDeserializer.findDeserializer(Object.class));
    }

    // Test for `types` static method
    @Test
    public void testTypesStaticMethod() throws Exception {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(12, types.length); // Based on the reference source
        assertTrue(java.util.Arrays.asList(types).contains(File.class));
        assertTrue(java.util.Arrays.asList(types).contains(URL.class));
        assertTrue(java.util.Arrays.asList(types).contains(URI.class));
        assertTrue(java.util.Arrays.asList(types).contains(Class.class));
        assertTrue(java.util.Arrays.asList(types).contains(JavaType.class));
        assertTrue(java.util.Arrays.asList(types).contains(Currency.class));
        assertTrue(java.util.Arrays.asList(types).contains(Pattern.class));
        assertTrue(java.util.Arrays.asList(types).contains(Locale.class));
        assertTrue(java.util.Arrays.asList(types).contains(Charset.class));
        assertTrue(java.util.Arrays.asList(types).contains(TimeZone.class));
        assertTrue(java.util.Arrays.asList(types).contains(InetAddress.class));
        assertTrue(java.util.Arrays.asList(types).contains(InetSocketAddress.class));
    }
}
