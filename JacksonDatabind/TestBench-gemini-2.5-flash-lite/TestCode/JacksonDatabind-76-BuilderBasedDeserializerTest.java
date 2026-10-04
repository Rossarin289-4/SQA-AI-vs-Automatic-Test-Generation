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
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap; // Added import
import com.fasterxml.jackson.databind.util.ArrayIterator; // Added import

// Mockito imports replaced with basic mocks where possible, or removed if not essential.
// Mockito.when, Mockito.verify etc are not used.

public class BuilderBasedDeserializerTest {

    // Mock implementation for DeserializationContext

    // Mock implementation for JsonParser

    // Mock implementation for BeanDescription

    // Mock implementation for BeanPropertyMap


    // Mock implementation for SettableBeanProperty

    // Mock implementation for ValueInstantiator

    // Helper to create a TokenBuffer
    private TokenBuffer createTokenBuffer(DeserializationContext ctxt) throws IOException {
        return new TokenBuffer(null, false);
    }

    // Helper to create a dummy BeanDescription

    // Helper to create a dummy BeanPropertyMap

    // Helper to create a dummy DeserializationConfig









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





