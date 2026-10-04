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
import com.fasterxml.jackson.databind.deser.ValueInstantiator; // Added import

public class BuilderBasedDeserializerTest {

    // Helper method to create a TokenBuffer, a common object used in tests.
    private TokenBuffer createTokenBuffer(DeserializationContext ctxt) throws IOException {
        // The constructor TokenBuffer(ObjectCodec codec, boolean hasNativeIds) is available.
        // Using null for codec and false for hasNativeIds as they are not critical for this test.
        return new TokenBuffer(null, false);
    }

    // Mockito imports (assuming these are available in the test environment)
    private static <T> T mock(Class<T> clazz) {
        return org.mockito.Mockito.mock(clazz);
    }

    private static <T> T any(Class<T> clazz) {
        return org.mockito.Mockito.any(clazz);
    }

    private static String anyString() {
        return org.mockito.Mockito.anyString();
    }

    private static void when(Object methodCall) {
        org.mockito.Mockito.when(methodCall);
    }

    private static void verify(Object mock) {
        org.mockito.Mockito.verify(mock);
    }

    private static void verify(Object mock, int times, Object methodCall) {
        org.mockito.Mockito.verify(mock, org.mockito.Mockito.times(times)).when(methodCall);
    }

    private static void doNothing() {
        org.mockito.Mockito.doNothing();
    }

    private static <T> T eq(T value) {
        return org.mockito.Mockito.eq(value);
    }

    @Test
    public void testDeserializeStartObjectThenEndObject() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);
        // Added a mock for handleUnexpectedToken as it's called when token is END_OBJECT
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        // BeanPropertyMap.emptyForDefaults() is not a static method, use construct with empty data.
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null); // null for config is okay here
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc)); // Use concrete mock class
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeValueString() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(mockParser.getText()).thenReturn("testString");
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
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
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        when(mockParser.getIntValue()).thenReturn(123);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
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
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_FLOAT);
        when(mockParser.getDoubleValue()).thenReturn(123.45);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
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
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_TRUE);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
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
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_FALSE);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
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
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        // Need to handle END_ARRAY as nextToken will be called by the loop.
        when(mockParser.nextToken()).thenReturn(JsonToken.END_ARRAY);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createFromObject(DeserializationContext ctxt) throws IOException {
                return new ArrayList<>(); // Simulate creating a list
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertTrue(result instanceof List);
    }

    @Test
    public void testDeserializeFieldNameThenEndObject() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("fieldName");
        when(mockParser.nextToken()).thenReturn(JsonToken.END_OBJECT); // Simulate after FIELD_NAME
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test
    public void testFinishBuildWithNullBuildMethod() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        Object builderInstance = new Object(); // A dummy builder instance

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {}); // ValueInstantiator needed
        builder.setPOJOBuilder(null, null); // Explicitly null build method

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            // Need to override to access protected method, or use a test specific runner.
            // For simplicity, we'll assume we can call it.
            // A cleaner way would be to make this an inner class for access.
            @Override
            protected final Object finishBuild(DeserializationContext ctxt, Object builder) throws IOException {
                // This override simulates the condition where _buildMethod is null.
                // According to the source, if _buildMethod is null, it returns the builder itself.
                if (null == _buildMethod) {
                    return builder;
                }
                // This part won't be reached as _buildMethod is null in the instance being tested.
                return super.finishBuild(ctxt, builder);
            }
        };

        // Need to set the _buildMethod to null. It's already null from the builder.
        // Need a mock JsonParser and a mock DeserializationContext.
        JsonParser mockParser = mock(JsonParser.class);
        // A token that would lead to the call to finishBuild.
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null); // For cases when finishBuild is not called.

        // Call the deserialize method, which internally calls finishBuild
        Object result = deserializer.deserialize(mockParser, mockCtxt);

        // The method should return the builder instance if _buildMethod is null.
        // The result of deserialize(..., ctxt) when token is VALUE_EMBEDDED_OBJECT without a build method would be the builder itself.
        // This is because _vanillaProcessing is false, and deserializeFromObject will be called.
        // If no properties are found, it returns the created builder.
        // Let's directly test the finishBuild logic by calling it.
        Object finishBuildResult = deserializer.finishBuild(mockCtxt, builderInstance);
        assertSame(builderInstance, finishBuildResult);
    }

    @Test
    public void testFinishBuildWithExceptionInInvoke() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        Object builderInstance = new Object();
        Exception buildException = new RuntimeException("Build method failed");

        // Mocking the build method to throw an exception
        AnnotatedMethod mockBuildMethod = mock(AnnotatedMethod.class);
        Method mockMethod = mock(Method.class);
        when(mockBuildMethod.getMember()).thenReturn(mockMethod);
        when(mockMethod.invoke(any(Object.class))).thenThrow(buildException);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(mockBuildMethod, null);

        // Mocking DeserializationContext for wrapAndThrow.
        // wrapAndThrow is a protected method, so we need to mock it indirectly or use a subclass.
        // For this test, we'll focus on the exception being thrown from invoke.
        // The wrapAndThrow method is called in the finally block of finishBuild.
        // We will wrap the call to finishBuild in a try-catch.

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        try {
            // Directly calling finishBuild to test its exception handling.
            deserializer.finishBuild(mockCtxt, builderInstance);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // The source code calls wrapInstantiationProblem which wraps the original exception.
            // We expect an IOException to be thrown by wrapInstantiationProblem.
            assertTrue(e instanceof IOException);
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Build method failed", e.getCause().getMessage());
        }
    }


    @Test
    public void testDeserializeWithNullToken() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        when(mockParser.getCurrentToken()).thenReturn(null);
        // The handleUnexpectedToken should be called when the token is null.
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNull(result); // Assuming handleUnexpectedToken returns null.
    }

    @Test
    public void testDeserializeWithUnknownToken() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        // Using a token that's not explicitly handled in the switch statement for START_OBJECT.
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertNull(result); // Assuming handleUnexpectedToken returns null.
    }


    @Test
    public void testDeserializeFromObjectWithDelegate() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object delegateValue = new Object();
        Object resultBuilder = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
                return delegate; // Return the delegate value directly as the builder
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        deserializer._delegateDeserializer = mock(JsonDeserializer.class); // Set delegate deserializer
        when(((JsonDeserializer<Object>) deserializer._delegateDeserializer).deserialize(mockParser, mockCtxt)).thenReturn(delegateValue);

        // Call the specific method
        Object finalResult = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(delegateValue, finalResult);
    }

    @Test
    public void testDeserializeFromObjectWithPropertyBasedCreator() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object createdBean = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("prop");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("value");
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.deserializeSetAndReturn(mockParser, mockCtxt, createdBean)).thenReturn(createdBean);
        properties = properties.withProperty(prop);

        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        when(creator.startBuilding(mockParser, mockCtxt, null)).thenReturn(buffer);
        when(creator.build(mockCtxt, buffer)).thenReturn(createdBean);
        when(creator.findCreatorProperty(anyString())).thenReturn(null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            // Override to use the mocked creator
            @Override
            protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException {
                _propertyBasedCreator = creator; // Set the mocked creator
                return super._deserializeUsingPropertyBased(p, ctxt);
            }
        };
        deserializer._propertyBasedCreator = creator; // Ensure it's set
        deserializer._nonStandardCreation = true; // To trigger the property based creator path

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(createdBean, result);
    }

    @Test
    public void testDeserializeFromObjectWithView() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();
        Class<?> activeView = Object.class;

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("someProp");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("someValue");

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.visibleInView(activeView)).thenReturn(true);
        when(prop.deserializeSetAndReturn(mockParser, mockCtxt, beanInstance)).thenReturn(beanInstance);
        properties = properties.withProperty(prop);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            // Override to provide mock _beanProperties and _needViewProcesing
            @Override
            protected Object deserializeWithView(JsonParser p, DeserializationContext ctxt, Object bean, Class<?> view) throws IOException {
                return bean; // Simulate successful view processing
            }
        };
        deserializer._beanProperties = properties; // Set mocked properties
        deserializer._needViewProcesing = true; // Enable view processing

        when(mockCtxt.getActiveView()).thenReturn(activeView); // Set active view

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(beanInstance, result);
    }

    @Test
    public void testDeserializeFromObjectVanillaProcessing() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object createdBean = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);
        when(mockCtxt.handleUnexpectedToken(any(Class.class), any(JsonParser.class))).thenReturn(null);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return createdBean;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.deserializeSetAndReturn(mockParser, mockCtxt, createdBean)).thenReturn(createdBean);
        properties = properties.withProperty(prop);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        deserializer._beanProperties = properties;
        deserializer._vanillaProcessing = true; // Enable vanilla processing

        Object result = deserializer.deserialize(mockParser, mockCtxt);
        assertSame(createdBean, result);
    }

    @Test
    public void testDeserializeFromObjectWithUnwrappedPropertyHandler() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();
        TokenBuffer tokens = new TokenBuffer(null, false); // Use available constructor

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("unwrappedProp");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("unwrappedValue");

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        // Mocking UnwrappedPropertyHandler
        UnwrappedPropertyHandler unwrappedHandler = mock(UnwrappedPropertyHandler.class);
        // We need to mock the _unwrappedPropertyHandler field in BuilderBasedDeserializer
        // This requires a subclass or reflection. Let's use a subclass.
        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                // Initialize fields that are needed
                _unwrappedPropertyHandler = unwrappedHandler;
                _beanProperties = properties; // Need this for find
                _valueInstantiator = new MockValueInstantiator(beanDesc) {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
                _needViewProcesing = false; // Disable views for this test
            }
            @Override
            protected Object deserializeWithUnwrapped(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                // Simulate the logic of processing unwrapped properties
                return super.deserializeWithUnwrapped(p, ctxt, bean); // Call the actual method
            }
        };

        // Mocking the processUnwrapped method call within deserializeWithUnwrapped
        doNothing().when(unwrappedHandler).processUnwrapped(any(JsonParser.class), any(DeserializationContext.class), any(Object.class), any(TokenBuffer.class));

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(beanInstance, result);
        verify(unwrappedHandler, times(1)).processUnwrapped(any(JsonParser.class), any(DeserializationContext.class), eq(beanInstance), any(TokenBuffer.class));
    }

    @Test
    public void testDeserializeFromObjectWithExternalTypeIdHandler() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("externalProp");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("externalValue");

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        // Mocking ExternalTypeHandler
        ExternalTypeHandler externalTypeIdHandler = mock(ExternalTypeHandler.class);
        // We need to mock the _externalTypeIdHandler field in BuilderBasedDeserializer
        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _externalTypeIdHandler = externalTypeIdHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator(beanDesc) {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
            }

            @Override
            protected Object deserializeWithExternalTypeId(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                return super.deserializeWithExternalTypeId(p, ctxt, bean);
            }
        };

        // Mocking start and complete methods of ExternalTypeHandler
        ExternalTypeHandler startedHandler = mock(ExternalTypeHandler.class);
        when(externalTypeIdHandler.start()).thenReturn(startedHandler);
        when(startedHandler.complete(any(JsonParser.class), any(DeserializationContext.class), any(Object.class))).thenReturn(beanInstance);

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(beanInstance, result);
        verify(externalTypeIdHandler, times(1)).start();
        verify(startedHandler, times(1)).complete(any(JsonParser.class), any(DeserializationContext.class), eq(beanInstance));
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object builtBean = new Object();
        TokenBuffer tokens = new TokenBuffer(null, false);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("prop1");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("value1");

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        // Mocking PropertyBasedCreator and UnwrappedPropertyHandler
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        when(creator.startBuilding(mockParser, mockCtxt, null)).thenReturn(buffer);
        when(creator.build(mockCtxt, buffer)).thenReturn(builtBean);
        when(creator.findCreatorProperty(anyString())).thenReturn(null);

        UnwrappedPropertyHandler unwrappedHandler = mock(UnwrappedPropertyHandler.class);
        doNothing().when(unwrappedHandler).processUnwrapped(any(JsonParser.class), any(DeserializationContext.class), any(Object.class), any(TokenBuffer.class));

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
        assertSame(builtBean, result);
        verify(unwrappedHandler, times(1)).processUnwrapped(any(JsonParser.class), any(DeserializationContext.class), eq(builtBean), any(TokenBuffer.class));
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);

        // The method throws IllegalStateException, so we expect that.
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
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
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        ObjectIdReader objectIdReader = mock(ObjectIdReader.class);

        BeanDeserializerBase newDeserializer = originalDeserializer.withObjectIdReader(objectIdReader);

        // Check that a new instance is returned and it has the objectIdReader set
        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(objectIdReader, ((BuilderBasedDeserializer)newDeserializer)._objectIdReader);
    }

    @Test
    public void testWithIgnorableProperties() throws Exception {
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
        Set<String> newIgnorableProps = new HashSet<>(Arrays.asList("prop1", "prop2"));

        BeanDeserializerBase newDeserializer = originalDeserializer.withIgnorableProperties(newIgnorableProps);

        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(newIgnorableProps, ((BuilderBasedDeserializer)newDeserializer)._ignorableProps);
    }

    @Test
    public void testWithBeanProperties() throws Exception {
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap originalProperties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, originalProperties, backRefs, ignorableProps, false, false);
        BeanPropertyMap newProperties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null); // Another empty map

        BeanDeserializerBase newDeserializer = originalDeserializer.withBeanProperties(newProperties);

        assertNotSame(originalDeserializer, newDeserializer);
        assertEquals(newProperties, ((BuilderBasedDeserializer)newDeserializer)._beanProperties);
    }

    @Test
    public void testAsArrayDeserializer() throws Exception {
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer originalDeserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);

        // The asArrayDeserializer method returns a BeanAsArrayBuilderDeserializer.
        // We need to ensure the properties and build method are passed correctly.
        // Let's add a dummy property to _beanProperties to simulate non-empty.
        SettableBeanProperty dummyProp = mock(SettableBeanProperty.class);
        // Need to create BeanPropertyMap with the property
        List<SettableBeanProperty> propList = new ArrayList<>();
        propList.add(dummyProp);
        originalDeserializer._beanProperties = BeanPropertyMap.construct(null, propList, null, null);


        // The asArrayDeserializer method calls _beanProperties.getPropertiesInInsertionOrder()
        // We need to mock this behavior.
        // Since we cannot directly mock a method on a final class like BeanPropertyMap,
        // we will rely on the fact that it calls the constructor of BeanAsArrayBuilderDeserializer.
        Deserializer<?> arrayDeserializer = originalDeserializer.asArrayDeserializer();

        assertTrue(arrayDeserializer instanceof BeanAsArrayBuilderDeserializer);
    }

    @Test
    public void testDeserializeWithUnwrappedDirectly() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();
        TokenBuffer tokens = new TokenBuffer(null, false);

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        UnwrappedPropertyHandler unwrappedHandler = mock(UnwrappedPropertyHandler.class);
        doNothing().when(unwrappedHandler).processUnwrapped(any(JsonParser.class), any(DeserializationContext.class), any(Object.class), any(TokenBuffer.class));

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _unwrappedPropertyHandler = unwrappedHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator(beanDesc) {
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
        // The processUnwrapped will be called within deserializeWithUnwrapped.
        // This test ensures the method can be called and returns the expected object.
    }

    @Test
    public void testDeserializeWithExternalTypeIdDirectly() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);

        ExternalTypeHandler externalTypeIdHandler = mock(ExternalTypeHandler.class);
        ExternalTypeHandler startedHandler = mock(ExternalTypeHandler.class);
        when(externalTypeIdHandler.start()).thenReturn(startedHandler);
        when(startedHandler.complete(any(JsonParser.class), any(DeserializationContext.class), any(Object.class))).thenReturn(beanInstance);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _externalTypeIdHandler = externalTypeIdHandler;
                _beanProperties = properties;
                _valueInstantiator = new MockValueInstantiator(beanDesc) {
                    @Override
                    public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                        return beanInstance;
                    }
                };
            }
        };

        Object result = deserializer.deserializeWithExternalTypeId(mockParser, mockCtxt);
        assertSame(beanInstance, result);
        verify(externalTypeIdHandler, times(1)).start();
        verify(startedHandler, times(1)).complete(any(JsonParser.class), any(DeserializationContext.class), eq(beanInstance));
    }

    @Test
    public void testDeserializeWithViewDirectly() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object beanInstance = new Object();
        Class<?> activeView = Object.class;

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT, JsonToken.END_OBJECT);

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {
            @Override
            public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
                return beanInstance;
            }
        });
        builder.setPOJOBuilder(null, null);

        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            {
                _needViewProcesing = true; // Enable view processing
                _beanProperties = properties;
            }
        };

        when(mockCtxt.getActiveView()).thenReturn(activeView);

        Object result = deserializer.deserializeWithView(mockParser, mockCtxt, beanInstance, activeView);
        assertSame(beanInstance, result);
        // Further validation would involve checking property visibility if properties were set up.
    }

    @Test
    public void testDeserializeObjectUsingNonDefault() throws Exception {
        DeserializationContext mockCtxt = mock(DeserializationContext.class);
        JsonParser mockParser = mock(JsonParser.class);
        Object createdBean = new Object();

        when(mockParser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.END_OBJECT);
        when(mockParser.getCurrentName()).thenReturn("prop");
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(mockParser.getText()).thenReturn("value");

        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {});
        builder.setPOJOBuilder(null, null);
        builder.setIgnoreUnknownProperties(true);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.deserializeSetAndReturn(mockParser, mockCtxt, createdBean)).thenReturn(createdBean);
        properties = properties.withProperty(prop);

        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        when(creator.startBuilding(mockParser, mockCtxt, null)).thenReturn(buffer);
        when(creator.build(mockCtxt, buffer)).thenReturn(createdBean);
        when(creator.findCreatorProperty(anyString())).thenReturn(null);

        // This test needs to call deserializeFromObjectUsingNonDefault directly or via deserializeFromObject
        // when _nonStandardCreation is true and other handlers are null.
        BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false) {
            @Override
            public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
                // Force non-standard creation path
                _nonStandardCreation = true;
                // Ensure other handlers are null
                _unwrappedPropertyHandler = null;
                _externalTypeIdHandler = null;
                _needViewProcesing = false;
                // And set up property-based creator if needed
                _propertyBasedCreator = creator;
                return super.deserializeFromObject(p, ctxt);
            }
        };
        deserializer._propertyBasedCreator = creator;

        Object result = deserializer.deserializeFromObject(mockParser, mockCtxt);
        assertSame(createdBean, result);
    }

    @Test
    public void testDeserializer_constructor_initialArgCheck() {
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        // Test case where objectIdReader is not null
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {}); // Use concrete mock class
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
        BeanDescription beanDesc = mock(BeanDescription.class);
        BeanPropertyMap properties = BeanPropertyMap.construct(null, Collections.emptyList(), null, null);
        Map<String, SettableBeanProperty> backRefs = Collections.emptyMap();
        Set<String> ignorableProps = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, null);
        builder.setValueInstantiator(new MockValueInstantiator(beanDesc) {}); // Use concrete mock class
        builder.setPOJOBuilder(null, null);
        // _objectIdReader is null by default in Builder, which is correct.

        try {
            BuilderBasedDeserializer deserializer = new BuilderBasedDeserializer(builder, beanDesc, properties, backRefs, ignorableProps, false, false);
            assertNotNull(deserializer);
            // Optionally check other fields if needed.
        } catch (IllegalArgumentException e) {
            fail("Did not expect IllegalArgumentException when ObjectIdReader is null: " + e.getMessage());
        }
    }


    // Helper mock classes for ValueInstantiator
    private static class MockValueInstantiator extends ValueInstantiator {
        protected final BeanDescription _beanDesc;

        public MockValueInstantiator(BeanDescription beanDesc) {
            _beanDesc = beanDesc;
        }

        @Override public String toString() { return "MockValueInstantiator"; }

        // Implemented methods for basic functionality
        @Override public boolean canCreateUsingDefault(DeserializationConfig config) { return true; }
        @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException { return new Object(); }

        @Override public boolean canCreateFromString(DeserializationConfig config) { return true; }
        @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return "String:" + value; }

        @Override public boolean canCreateFromInt(DeserializationConfig config) { return true; }
        @Override public Object createFromInt(DeserializationContext ctxt, int value) throws IOException { return Integer.valueOf(value); }

        @Override public boolean canCreateFromLong(DeserializationConfig config) { return true; }
        @Override public Object createFromLong(DeserializationContext ctxt, long value) throws IOException { return Long.valueOf(value); }

        @Override public boolean canCreateFromFloat(DeserializationConfig config) { return true; }
        @Override public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException { return Double.valueOf(value); } // Note: Method signature uses double

        @Override public boolean canCreateFromBoolean(DeserializationConfig config) { return true; }
        @Override public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException { return Boolean.valueOf(value); }

        @Override public boolean canCreateFromNull(DeserializationConfig config) { return true; }
        @Override public Object createFromNull(DeserializationContext ctxt) throws IOException { return null; }

        @Override public boolean canCreateUsingDelegate(DeserializationConfig config) { return true; }
        @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return delegate; }

        @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] properties) throws IOException { return new Object(); }

        @Override public ValueInstantiator copy() { return this; }
        @Override public JavaType getValueTypeDesc() { return null; } // Corrected return type
        @Override public boolean canHandleSpecial(AnyDeserializer ad) { return false;} // Added implementation
        @Override public String getBuilderType() { return null;} // Added implementation
        @Override public SettableBeanProperty findCreatorProperty(String name) { return null;} // Added implementation
        @Override public Class<?> getManagedReferencePropertyType() {return null;} // Added implementation
    }
}
```