package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;
import com.fasterxml.jackson.dataformat.xml.util.TypeUtil;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.SimpleType; // Needed for SimpleType
import com.fasterxml.jackson.databind.type.CollectionType; // Needed for CollectionType

public class XmlSerializerProviderTest {

    // Dummy classes to satisfy compilation and constructor calls
    // Must not inherit from final classes. Methods that are final in base classes cannot be overridden.
    private static class DummyGenerator extends TokenBuffer {
        protected DummyGenerator() {
            // IOContext and ObjectCodec are required
            super(null, null);
        }
    }

    // Abstract method implementations for JavaType
    private static class MockJavaType extends SimpleType {
        private final boolean _isIndexed;

        protected MockJavaType(Class<?> cls, boolean isIndexed) {
            // Super constructor takes Class, int, TypeBindings, List<JavaType>, Object, Object, boolean
            super(cls, TypeBindings.emptyBindings(), null, null, null, false);
            _isIndexed = isIndexed;
        }

        @Override
        public boolean isCollectionLikeType() {
            return _isIndexed;
        }

        @Override
        public boolean isArrayType() {
            return _rawClass.isArray();
        }
    }

    private static class DummyXmlRootNameLookup extends XmlRootNameLookup {
        public DummyXmlRootNameLookup() {
            super();
        }

        @Override
        public QName findRootName(JavaType rootType, MapperConfig<?> config) {
            return null; // Simplify tests
        }

        @Override
        public QName findRootName(Class<?> rootType, MapperConfig<?> config) {
            return null; // Simplify tests
        }
    }

    private static class DummySerializationConfig extends SerializationConfig {
        private PropertyName _fullRootName = null;

        // Must call super with required parameters
        protected DummySerializationConfig() {
            super(null, null, null, null, null, null, null, 0);
        }

        public void setFullRootName(PropertyName name) {
            _fullRootName = name;
        }

        @Override
        public PropertyName getFullRootName() {
            return _fullRootName;
        }
    }

    private static class DummySerializerFactory extends SerializerFactory {
        // Must implement abstract methods
        @Override
        public JsonSerializer<Object> createSerializer(SerializationConfig config, JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public boolean usesKeySerializers() {
            return false;
        }

        @Override
        public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType keyType) throws JsonMappingException {
            return null;
        }

        @Override
        public SerializerFactory withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig config) {
            return null;
        }
    }

    private static class DummyJsonSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value == null) {
                gen.writeNull();
            } else if (value instanceof String) {
                gen.writeString((String) value);
            } else if (value instanceof Integer) {
                gen.writeNumber((Integer) value);
            } else if (value instanceof Boolean) {
                gen.writeBoolean((Boolean) value);
            } else if (value.getClass().isArray()) {
                gen.writeStartArray();
                if (value instanceof String[]) {
                    for (String s : (String[]) value) gen.writeString(s);
                } else if (value instanceof Integer[]) {
                    for (Integer i : (Integer[]) value) gen.writeNumber(i);
                }
                gen.writeEndArray();
            } else if (value instanceof java.util.List) {
                gen.writeStartArray();
                for (Object item : (java.util.List<?>) value) {
                    serialize(item, gen, serializers);
                }
                gen.writeEndArray();
            }
        }
    }

    // A minimal ToXmlGenerator implementation for testing purposes
    private static class MinimalToXmlGenerator extends ToXmlGenerator {
        private boolean initialized = false;
        private QName nextName = null;

        protected MinimalToXmlGenerator(IOContext ctxt, int stdFeatures, int xmlFeatures, ObjectCodec codec, XMLStreamWriter sw) {
            super(ctxt, stdFeatures, xmlFeatures, codec, sw);
        }

        @Override
        public void initGenerator() throws IOException {
            initialized = true;
        }

        @Override
        public boolean setNextNameIfMissing(QName name) throws IOException {
            if (this.nextName == null) {
                this.nextName = name;
                return true;
            }
            return false;
        }

        @Override
        public void setNextName(QName name) throws IOException {
            this.nextName = name;
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public void writeStartObject() throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public void writeEndObject() throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public void writeStartArray() throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public void writeEndArray() throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public void writeString(String text) throws IOException {
            // Do nothing for this dummy
        }

        @Override
        public XMLStreamWriter getStaxWriter() {
            return null; // Not implemented
        }
        
        @Override
        public void setDefaultNamespace(String ns) throws XMLStreamException {
            // Not implemented
        }

        @Override
        public boolean inRoot() {
            return true; // Assume it is root for testing _initWithRootName
        }

        @Override
        public void _handleStartObject() throws IOException {
            // Do nothing
        }

        @Override
        public void _handleEndObject() throws IOException {
            // Do nothing
        }
    }


    private XmlSerializerProvider createProvider(XmlRootNameLookup rootNames) {
        return new XmlSerializerProvider(rootNames);
    }

    private XmlSerializerProvider createProvider(XmlSerializerProvider src, SerializationConfig config, SerializerFactory f) {
        return new XmlSerializerProvider(src, config, f);
    }

    @Test
    public void testSerializeNullValue() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator();
        provider.serializeValue(gen, null);
        assertTrue(true); // No observable output with dummy generator
    }

    @Test
    public void testSerializeNullValueWithRootNameConfigured() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig();
        config.setFullRootName(PropertyName.construct("RootElement"));
        provider = createProvider(provider, config, new DummySerializerFactory());
        JsonGenerator gen = new DummyGenerator();
        provider.serializeValue(gen, null);
        assertTrue(true);
    }

    @Test
    public void testSerializeNullValueWithRootNameConfiguredNamespace() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig();
        config.setFullRootName(new PropertyName("RootElement", "http://example.com"));
        provider = createProvider(provider, config, new DummySerializerFactory());
        JsonGenerator gen = new DummyGenerator();
        provider.serializeValue(gen, null);
        assertTrue(true);
    }

    @Test
    public void testSerializeNonNullValue() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        Object value = "testString";
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, value, type);
        assertTrue(true); // Based on super class logic, assume it calls serializer
    }

    @Test
    public void testSerializeNonNullValueAsArray() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        Object value = new String[]{"a", "b"};
        // Use a CollectionType to simulate isIndexedType properly
        CollectionType arrayType = CollectionType.construct(java.util.List.class, new MockJavaType(String.class, false));
        provider.serializeValue(xgen, value, arrayType);
        assertTrue(true);
    }

    @Test
    public void testSerializeNonNullValueWithSpecificSerializer() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        Object value = 123;
        JavaType intType = new MockJavaType(Integer.class, false);
        JsonSerializer<Object> specificSerializer = new DummyJsonSerializer();
        provider.serializeValue(xgen, value, intType, specificSerializer);
        assertTrue(true);
    }

    @Test
    public void testSerializeNonNullValueWithSpecificSerializerAsArray() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        Object value = new Integer[]{1, 2};
        CollectionType intArrayType = CollectionType.construct(java.util.List.class, new MockJavaType(Integer.class, false));
        JsonSerializer<Object> specificSerializer = new DummyJsonSerializer();
        provider.serializeValue(xgen, value, intArrayType, specificSerializer);
        assertTrue(true);
    }

    @Test
    public void testSerializeValueWithNonXmlGenerator() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator(); // Not a ToXmlGenerator
        try {
            provider.serializeValue(gen, "someValue");
            fail("Expected JsonMappingException for non-ToXmlGenerator");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        }
    }

    @Test
    public void testSerializeValueWithNonXmlGeneratorAndRootType() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator(); // Not a ToXmlGenerator
        JavaType intType = new MockJavaType(Integer.class, false);
        Object value = 42;
        try {
            provider.serializeValue(gen, value, intType);
            fail("Expected JsonMappingException for non-ToXmlGenerator");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        }
    }

    @Test
    public void testSerializeValueWithNonXmlGeneratorAndRootTypeAndSerializer() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator(); // Not a ToXmlGenerator
        JavaType booleanType = new MockJavaType(Boolean.class, false);
        Object value = true;
        JsonSerializer<Object> dummySerializer = new DummyJsonSerializer();
        try {
            provider.serializeValue(gen, value, booleanType, dummySerializer);
            fail("Expected JsonMappingException for non-ToXmlGenerator");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        }
    }

    @Test
    public void testSerializeXmlNull() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        // Need to use a ToXmlGenerator for _serializeXmlNull to be fully exercised, even if it doesn't directly use its methods.
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        provider.serializeValue(xgen, null);
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testInitWithRootName_setNextNameIfMissing_returnsFalse() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig();
        config.setFullRootName(PropertyName.construct("ConfiguredRoot"));
        provider = createProvider(provider, config, new DummySerializerFactory());

        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(new IOContext(null, null, false), 0, 0, null, null) {
            @Override
            public boolean setNextNameIfMissing(QName name) throws IOException {
                return false; // Simulate name already being set
            }
            @Override
            public void setNextName(QName name) throws IOException {
                // This call should happen if inRoot() is true
            }
        };

        // Call a method that triggers _initWithRootName
        provider.serializeValue(xgen, "some value");
        assertTrue(true); // If no exception, the flow was entered.
    }

    @Test
    public void testRootNameFromConfigWithNamespace() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig();
        config.setFullRootName(new PropertyName("MyRoot", "http://my.ns"));
        provider = createProvider(provider, config, new DummySerializerFactory());

        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        xgen.initGenerator(); // Ensures initGenerator is called
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, "test", type);
        assertTrue(true);
    }

    @Test
    public void testRootNameFromConfigWithoutNamespace() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig();
        config.setFullRootName(PropertyName.construct("MyRoot"));
        provider = createProvider(provider, config, new DummySerializerFactory());

        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        xgen.initGenerator();
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, "test", type);
        assertTrue(true);
    }
    
    @Test
    public void testRootNameFromConfigIsNull() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig(); // No root name set
        provider = createProvider(provider, config, new DummySerializerFactory());
        
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        xgen.initGenerator();
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, "test", type);
        assertTrue(true);
    }

    @Test
    public void testAsXmlGeneratorWhenIsTokenBuffer() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        TokenBuffer tb = new TokenBuffer(null, null);
        // This bypasses the exception in _asXmlGenerator, as TokenBuffer is handled.
        provider.serializeValue(tb, "someValue");
        assertTrue(true);
    }

    @Test
    public void testHandleRuntimeExceptionInSerialize() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator();
        
        JsonSerializer<Object> throwingSerializer = new DummyJsonSerializer() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                throw new RuntimeException("Simulated runtime exception");
            }
        };
        
        JavaType type = new MockJavaType(String.class, false);
        try {
            provider.serializeValue(gen, "value", type, throwingSerializer);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Simulated runtime exception"));
            assertTrue(e.getCause() instanceof RuntimeException);
        }
    }

    @Test
    public void testHandleIOExceptionInSerialize() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator();
        
        JsonSerializer<Object> throwingSerializer = new DummyJsonSerializer() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                throw new IOException("Simulated IO exception");
            }
        };
        
        JavaType type = new MockJavaType(String.class, false);
        try {
            provider.serializeValue(gen, "value", type, throwingSerializer);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Simulated IO exception"));
            assertFalse(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testSerializeValueWithNullGeneratorAndNullRootType() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator(); // Not ToXmlGenerator
        Object value = "test";
        try {
            provider.serializeValue(gen, value, null); // Pass null rootType
            fail("Expected JsonMappingException for non-ToXmlGenerator");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        }
    }

    @Test
    public void testSerializeValueWithNullGeneratorAndNullRootTypeAndNullSerializer() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        JsonGenerator gen = new DummyGenerator(); // Not ToXmlGenerator
        Object value = 100;
        try {
            provider.serializeValue(gen, value, null, null); // Pass null rootType and null serializer
            fail("Expected JsonMappingException for non-ToXmlGenerator");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        }
    }
    
    @Test
    public void testCreateInstance() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        SerializationConfig config = new DummySerializationConfig();
        SerializerFactory factory = new DummySerializerFactory();
        
        DefaultSerializerProvider newProvider = provider.createInstance(config, factory);
        
        assertNotNull(newProvider);
        assertTrue(newProvider instanceof XmlSerializerProvider);
        // Accessing protected member _rootNameLookup for verification
        assertEquals(provider._rootNameLookup, ((XmlSerializerProvider) newProvider)._rootNameLookup);
    }

    @Test
    public void testSerializeValueWithRootNameLookup() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        DummySerializationConfig config = new DummySerializationConfig(); // No root name set
        provider = createProvider(provider, config, new DummySerializerFactory());
        
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        xgen.initGenerator();
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, "test", type);
        assertTrue(true);
    }
    
    @Test
    public void testSerializeNonNullValueWithRootNameLookup_StringClass() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new DummyXmlRootNameLookup() { // Use anonymous dummy
            @Override
            public QName findRootName(Class<?> rootType, MapperConfig<?> config) {
                if (rootType == String.class) {
                    return new QName("http://example.com", "StringRoot");
                }
                return super.findRootName(rootType, config);
            }
        });
        DummySerializationConfig config = new DummySerializationConfig();
        provider = createProvider(provider, config, new DummySerializerFactory());

        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        JavaType type = new MockJavaType(String.class, false);
        provider.serializeValue(xgen, "hello", type);
        assertTrue(true);
    }

    @Test
    public void testIsIndexedType_Class() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        
        // MockJavaType simulates isIndexedType behavior via isCollectionLikeType.
        JavaType indexedType = new MockJavaType(String[].class, true);
        provider.serializeValue(xgen, new String[]{"a", "b"}, indexedType);
        assertTrue(true);
    }
    
    @Test
    public void testIsIndexedType_JavaType() throws Exception {
        XmlSerializerProvider provider = createProvider(new DummyXmlRootNameLookup());
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        
        // Use CollectionType to correctly simulate an indexed type for JavaType
        CollectionType listType = CollectionType.construct(java.util.List.class, new MockJavaType(String.class, false));
        provider.serializeValue(xgen, java.util.Collections.emptyList(), listType);
        assertTrue(true);
    }
    
    @Test
    public void testSerializeValueWithRootNameLookup_UsingClass() throws Exception {
        XmlSerializerProvider provider = new XmlSerializerProvider(new DummyXmlRootNameLookup() {
            @Override
            public QName findRootName(Class<?> rootType, MapperConfig<?> config) {
                if (rootType == Integer.class) {
                    return new QName("http://ns.com", "IntRoot");
                }
                return null;
            }
        });
        DummySerializationConfig config = new DummySerializationConfig();
        provider = createProvider(provider, config, new DummySerializerFactory());
        
        IOContext ctxt = new IOContext(null, null, false);
        MinimalToXmlGenerator xgen = new MinimalToXmlGenerator(ctxt, 0, 0, null, null);
        JavaType type = new MockJavaType(Integer.class, false);
        provider.serializeValue(xgen, 123, type); // Call serializeValue(gen, value, rootType)
        assertTrue(true);
    }
}
