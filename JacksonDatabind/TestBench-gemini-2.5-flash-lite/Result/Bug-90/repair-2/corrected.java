package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.lang.reflect.Type;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;
import java.util.Collection;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeParameter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class ValueInstantiatorTest {

    private static final JavaType DUMMY_JAVA_TYPE = null; // Needs a concrete instantiation for tests
    private static final DeserializationConfig DUMMY_CONFIG = null; // Needs a concrete instantiation for tests
    private static final DeserializationContext DUMMY_CONTEXT = null; // Needs a concrete instantiation for tests
    private static final JsonParser DUMMY_PARSER = new JsonNodeFactory(false).objectNode().traverse(); // Mock JsonParser

    private StdValueInstantiator createStdValueInstantiator(Class<?> type) {
        return new StdValueInstantiator(DUMMY_CONFIG, type);
    }

    @Test
    public void testGetValueClass_default() {
        ValueInstantiator instantiator = new StdValueInstantiator(DUMMY_CONFIG, Object.class);
        assertEquals(Object.class, instantiator.getValueClass());
    }

    @Test
    public void testGetValueClass_custom() {
        ValueInstantiator instantiator = new StdValueInstantiator(DUMMY_CONFIG, String.class);
        assertEquals(String.class, instantiator.getValueClass());
    }

    @Test
    public void testGetValueTypeDesc_default() {
        ValueInstantiator instantiator = new StdValueInstantiator(DUMMY_CONFIG, Object.class);
        assertEquals(Object.class.getName(), instantiator.getValueTypeDesc());
    }

    @Test
    public void testGetValueTypeDesc_custom() {
        ValueInstantiator instantiator = new StdValueInstantiator(DUMMY_CONFIG, String.class);
        assertEquals(String.class.getName(), instantiator.getValueTypeDesc());
    }

    @Test
    public void testCanInstantiate_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canInstantiate());
    }
    
    @Test
    public void testCanInstantiate_withDefaultCreator() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromObjectSettings(mockAnnotatedWithParams(), null, null, null, null, null);
        assertTrue(instantiator.canInstantiate());
    }

    @Test
    public void testCanCreateFromString_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromString());
    }

    @Test
    public void testCanCreateFromString_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromStringCreator(mockAnnotatedWithParams());
        assertTrue(instantiator.canCreateFromString());
    }

    @Test
    public void testCanCreateFromInt_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromInt());
    }

    @Test
    public void testCanCreateFromInt_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromIntCreator(mockAnnotatedWithParams());
        assertTrue(instantiator.canCreateFromInt());
    }

    @Test
    public void testCanCreateFromLong_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromLong());
    }

    @Test
    public void testCanCreateFromLong_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromLongCreator(mockAnnotatedWithParams());
        assertTrue(instantiator.canCreateFromLong());
    }

    @Test
    public void testCanCreateFromDouble_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromDouble());
    }

    @Test
    public void testCanCreateFromDouble_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromDoubleCreator(mockAnnotatedWithParams());
        assertTrue(instantiator.canCreateFromDouble());
    }

    @Test
    public void testCanCreateFromBoolean_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromBoolean());
    }

    @Test
    public void testCanCreateFromBoolean_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromBooleanCreator(mockAnnotatedWithParams());
        assertTrue(instantiator.canCreateFromBoolean());
    }

    @Test
    public void testCanCreateUsingDefault_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testCanCreateUsingDefault_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromObjectSettings(mockAnnotatedWithParams(), null, null, null, null, null);
        assertTrue(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testCanCreateUsingDelegate_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateUsingDelegate());
    }

    @Test
    public void testCanCreateUsingDelegate_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromObjectSettings(null, mockAnnotatedWithParams(), mockJavaType(), null, null, null);
        assertTrue(instantiator.canCreateUsingDelegate());
    }

    @Test
    public void testCanCreateUsingArrayDelegate_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateUsingArrayDelegate());
    }

    @Test
    public void testCanCreateUsingArrayDelegate_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromArraySettings(mockAnnotatedWithParams(), mockJavaType(), null);
        assertTrue(instantiator.canCreateUsingArrayDelegate());
    }

    @Test
    public void testCanCreateFromObjectWith_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertFalse(instantiator.canCreateFromObjectWith());
    }

    @Test
    public void testCanCreateFromObjectWith_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        instantiator.configureFromObjectSettings(null, null, null, null, mockAnnotatedWithParams(), null);
        assertTrue(instantiator.canCreateFromObjectWith());
    }

    @Test
    public void testGetDelegateType_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getDelegateType(DUMMY_CONFIG));
    }

    @Test
    public void testGetDelegateType_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        JavaType delegateType = mockJavaType();
        instantiator.configureFromObjectSettings(null, null, delegateType, null, null, null);
        assertEquals(delegateType, instantiator.getDelegateType(DUMMY_CONFIG));
    }
    
    @Test
    public void testGetArrayDelegateType_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getArrayDelegateType(DUMMY_CONFIG));
    }

    @Test
    public void testGetArrayDelegateType_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        JavaType arrayDelegateType = mockJavaType();
        instantiator.configureFromArraySettings(null, arrayDelegateType, null);
        assertEquals(arrayDelegateType, instantiator.getArrayDelegateType(DUMMY_CONFIG));
    }

    @Test
    public void testGetFromObjectArguments_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getFromObjectArguments(DUMMY_CONFIG));
    }
    
    @Test
    public void testGetFromObjectArguments_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        SettableBeanProperty[] args = new SettableBeanProperty[1];
        instantiator.configureFromObjectSettings(null, null, null, null, mockAnnotatedWithParams(), args);
        assertNotNull(instantiator.getFromObjectArguments(DUMMY_CONFIG));
        assertEquals(args.length, instantiator.getFromObjectArguments(DUMMY_CONFIG).length);
    }

    @Test
    public void testCreateUsingDefault_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        try {
            instantiator.createUsingDefault(mockDeserializationContext());
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no default no-arguments constructor found"));
        }
    }
    
    @Test
    public void testCreateUsingDefault_withCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        Object mockResult = new Object();
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall(mockResult);
        instantiator.configureFromObjectSettings(mockCreator, null, null, null, null, null);
        Object result = instantiator.createUsingDefault(mockDeserializationContext());
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromObjectWith_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        try {
            instantiator.createFromObjectWith(mockDeserializationContext(), new Object[0]);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no creator with arguments specified"));
        }
    }

    @Test
    public void testCreateFromObjectWith_withCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        Object[] args = { "arg1", 123 };
        Object mockResult = new Object();
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall(mockResult, args);
        instantiator.configureFromObjectSettings(null, null, null, null, mockCreator, null);
        Object result = instantiator.createFromObjectWith(mockDeserializationContext(), args);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateUsingDelegate_noDelegate() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        try {
            instantiator.createUsingDelegate(mockDeserializationContext(), new Object());
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no delegate creator specified"));
        }
    }
    
    @Test
    public void testCreateUsingDelegate_withDelegate() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        Object delegate = new Object();
        Object mockResult = new Object();
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, delegate);
        instantiator.configureFromObjectSettings(null, mockCreator, mockJavaType(), null, null, null);
        Object result = instantiator.createUsingDelegate(mockDeserializationContext(), delegate);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateUsingArrayDelegate_noArrayDelegate() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        try {
            instantiator.createUsingArrayDelegate(mockDeserializationContext(), new Object());
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no array delegate creator specified"));
        }
    }
    
    @Test
    public void testCreateUsingArrayDelegate_withArrayDelegate() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        Object delegate = new Object();
        Object mockResult = new Object();
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, delegate);
        instantiator.configureFromArraySettings(mockCreator, mockJavaType(), null);
        Object result = instantiator.createUsingArrayDelegate(mockDeserializationContext(), delegate);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromString_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(String.class);
        String input = "testString";
        try {
            instantiator.createFromString(mockDeserializationContext(), input);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no String-argument constructor/factory method"));
        }
    }

    @Test
    public void testCreateFromString_withCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(String.class);
        String input = "testString";
        Object mockResult = "createdFromString";
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, input);
        instantiator.configureFromStringCreator(mockCreator);
        Object result = instantiator.createFromString(mockDeserializationContext(), input);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromString_emptyStringAsNull() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        DeserializationContext mockContext = mockDeserializationContextWithFeature(
            DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        Object result = instantiator.createFromString(mockContext, "");
        assertNull(result);
    }

    @Test
    public void testCreateFromString_emptyStringAsNull_disabled() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        DeserializationContext mockContext = mockDeserializationContextWithFeature(
            DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, false);
        try {
            instantiator.createFromString(mockContext, "");
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no String-argument constructor/factory method"));
        }
    }
    
    @Test
    public void testCreateFromInt_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Integer.class);
        try {
            instantiator.createFromInt(mockDeserializationContext(), 123);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no int/Int-argument constructor/factory method"));
        }
    }

    @Test
    public void testCreateFromInt_withIntCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Integer.class);
        Object mockResult = Integer.valueOf(456);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, 456);
        instantiator.configureFromIntCreator(mockCreator);
        Object result = instantiator.createFromInt(mockDeserializationContext(), 123);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }
    
    @Test
    public void testCreateFromInt_withLongCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Integer.class);
        Object mockResult = Long.valueOf(789L);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, 123L);
        instantiator.configureFromLongCreator(mockCreator);
        Object result = instantiator.createFromInt(mockDeserializationContext(), 123);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromLong_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Long.class);
        try {
            instantiator.createFromLong(mockDeserializationContext(), 123L);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no long/Long-argument constructor/factory method"));
        }
    }
    
    @Test
    public void testCreateFromLong_withLongCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Long.class);
        Object mockResult = Long.valueOf(456L);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, 789L);
        instantiator.configureFromLongCreator(mockCreator);
        Object result = instantiator.createFromLong(mockDeserializationContext(), 789L);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromDouble_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Double.class);
        try {
            instantiator.createFromDouble(mockDeserializationContext(), 123.45);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no double/Double-argument constructor/factory method"));
        }
    }
    
    @Test
    public void testCreateFromDouble_withDoubleCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Double.class);
        Object mockResult = Double.valueOf(67.89);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, 67.89);
        instantiator.configureFromDoubleCreator(mockCreator);
        Object result = instantiator.createFromDouble(mockDeserializationContext(), 67.89);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }

    @Test
    public void testCreateFromBoolean_noCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Boolean.class);
        try {
            instantiator.createFromBoolean(mockDeserializationContext(), true);
            fail("Should have thrown handleMissingInstantiator");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no boolean/Boolean-argument constructor/factory method"));
        }
    }
    
    @Test
    public void testCreateFromBoolean_withBooleanCreator() throws IOException {
        StdValueInstantiator instantiator = createStdValueInstantiator(Boolean.class);
        Object mockResult = Boolean.TRUE;
        AnnotatedWithParams mockCreator = mockAnnotatedWithParamsWithCall1(mockResult, true);
        instantiator.configureFromBooleanCreator(mockCreator);
        Object result = instantiator.createFromBoolean(mockDeserializationContext(), true);
        assertNotNull(result);
        assertEquals(mockResult, result);
    }
    
    @Test
    public void testGetDefaultCreator_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getDefaultCreator());
    }

    @Test
    public void testGetDefaultCreator_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(mockCreator, null, null, null, null, null);
        assertEquals(mockCreator, instantiator.getDefaultCreator());
    }

    @Test
    public void testGetDelegateCreator_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getDelegateCreator());
    }

    @Test
    public void testGetDelegateCreator_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, mockCreator, mockJavaType(), null, null, null);
        assertEquals(mockCreator, instantiator.getDelegateCreator());
    }

    @Test
    public void testGetArrayDelegateCreator_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getArrayDelegateCreator());
    }

    @Test
    public void testGetArrayDelegateCreator_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParams();
        instantiator.configureFromArraySettings(mockCreator, mockJavaType(), null);
        assertEquals(mockCreator, instantiator.getArrayDelegateCreator());
    }

    @Test
    public void testGetWithArgsCreator_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getWithArgsCreator());
    }

    @Test
    public void testGetWithArgsCreator_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        AnnotatedWithParams mockCreator = mockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, null, null, null, mockCreator, null);
        assertEquals(mockCreator, instantiator.getWithArgsCreator());
    }

    @Test
    public void testGetIncompleteParameter_default() {
        ValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        assertNull(instantiator.getIncompleteParameter());
    }

    @Test
    public void testGetIncompleteParameter_configured() {
        StdValueInstantiator instantiator = createStdValueInstantiator(Object.class);
        AnnotatedParameter mockParam = mockAnnotatedParameter();
        instantiator.configureIncompleteParameter(mockParam);
        assertEquals(mockParam, instantiator.getIncompleteParameter());
    }

    // Helper methods and mocks
    
    private static AnnotatedWithParams mockAnnotatedWithParams() {
        return new MockAnnotatedWithParams(0);
    }

    private static AnnotatedWithParams mockAnnotatedWithParamsWithCall(Object returnValue) {
        return new MockAnnotatedWithParams(0, returnValue);
    }
    
    private static AnnotatedWithParams mockAnnotatedWithParamsWithCall(Object returnValue, Object[] args) {
        return new MockAnnotatedWithParams(args.length, returnValue, args);
    }
    
    private static AnnotatedWithParams mockAnnotatedWithParamsWithCall1(Object returnValue, Object arg1) {
        return new MockAnnotatedWithParams(1, returnValue, new Object[]{arg1});
    }

    private static AnnotatedParameter mockAnnotatedParameter() {
        return new MockAnnotatedParameter();
    }

    private static JavaType mockJavaType() {
        return new MockJavaType(Object.class); // Provide a concrete class
    }

    private static DeserializationContext mockDeserializationContext() {
        return new MockDeserializationContext();
    }
    
    private static DeserializationContext mockDeserializationContextWithFeature(
            DeserializationFeature feature, boolean enabled) {
        return new MockDeserializationContext(feature, enabled);
    }
    
    private static DeserializationContext mockDeserializationContextWithHandler(Object handler) throws IOException {
        DeserializationContext ctx = new MockDeserializationContext();
        // You would typically use a mock object for the 'context' to return specific values.
        // For simplicity here, we'll assume a basic mock setup.
        return ctx;
    }

    // Mock implementations for necessary classes
    
    static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private final Object _returnValue;
        private final Object[] _args;
        private final int _argCount;

        MockAnnotatedWithParams(int argCount) {
            this(argCount, null, null);
        }

        MockAnnotatedWithParams(int argCount, Object returnValue) {
            this(argCount, returnValue, null);
        }

        MockAnnotatedWithParams(int argCount, Object returnValue, Object[] args) {
            // Provide dummy values for the abstract parent class constructor
            super(null, null, null);
            _argCount = argCount;
            _returnValue = returnValue;
            _args = args;
        }

        @Override public int getParameterCount() { return _argCount; }
        @Override public Class<?> getRawParameterType(int index) { return Object.class; }
        @Override public JavaType getParameterType(int index) { return null; }
        @Override public Type getGenericParameterType(int index) { return null; }
        @Override public AnnotatedParameter getParameter(int index) { return null; } // Final method in superclass
        @Override public Object call() throws Exception { return _returnValue; }
        @Override public Object call(Object[] args) throws Exception { return _returnValue; }
        @Override public Object call1(Object arg) throws Exception { return _returnValue; }
        
        // Methods from AnnotatedMember that are called by AnnotatedWithParams methods
        @Override public Class<?> getDeclaringClass() { return Object.class; }
        @Override public Member getMember() { return null; }
        @Override public int getModifiers() { return 0; }
        @Override public String getName() { return "mockMethod"; }
        @Override public AnnotationMap getParameterAnnotations(int index) { return null; } // Final method in superclass
        @Override public AnnotatedParameter replaceParameterAnnotations(int index, AnnotationMap ann) { return null; } // Final method in superclass
        @Override public AnnotatedWithParams withAnnotations(AnnotationMap annotations) { return this; }
        @Override public Object getValue(Object pojo) { throw new UnsupportedOperationException(); } // From AnnotatedMember
        @Override public void setValue(Object pojo, Object value) { throw new UnsupportedOperationException(); } // From AnnotatedMember
        @Override public AnnotatedElement getAnnotated() { return null; } // From AnnotatedMember
    }

    static class MockAnnotatedParameter extends AnnotatedParameter {
        MockAnnotatedParameter() {
            // Provide dummy values for the final parent class constructor
            super(null, null, null, 0);
        }
    }

    static class MockJavaType extends JavaType {
        private final Class<?> _rawClass;

        protected MockJavaType(Class<?> rawClass) {
            // Pass nulls to the abstract parent constructor, as they are not directly used in this mock.
            super(rawClass, 0, null, null, null, null, false);
            _rawClass = rawClass;
        }
        
        @Override public Class<?> getRawClass() { return _rawClass; }
        @Override public String toString() { return "MockJavaType<" + _rawClass.getName() + ">"; }

        // Override abstract methods with dummy implementations
        @Override public JavaType findSuperClass(int n) { return null; }
        @Override public JavaType findSuperInterface(int n) { return null; }
        @Override public boolean isContainerType() { return false; }
        @Override public String getFullCanonicalName() { return _rawClass.getName(); }
        @Override public String getGenericSignature() { return ""; }
        @Override public String getErasedSignature() { return ""; }
        @Override public JavaType containedType(int index) { return null; }
        @Override public int containedTypeCount() { return 0; }
        @Override public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType erasure, List<JavaType> parameterTypes) { return this; }
        @Override public JavaType withTypeHandler(Object handler) { return this; }
        @Override public JavaType withContentTypeHandler(Object handler) { return this; }
        @Override public JavaType withValueHandler(Object handler) { return this; }
        @Override public JavaType withContentValueHandler(Object handler) { return this; }
        @Override public JavaType withStorage(Map<Class<?>, TypeParameter<JavaType>> storage) { return this; }
        @Override public boolean hasValueHandler() { return false; }
        @Override public Object getValueHandler() { return null; }
        @Override public boolean hasContentValueHandler() { return false; }
        @Override public Object getContentValueHandler() { return null; }
        @Override protected JavaType _withTypeBindings(TypeBindings newBindings) { return this; }
        @Override public JavaType forceResolve() { return this; }
        @Override public boolean isArrayType() { return false; }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isAbstract() { return false; }
        @Override public boolean isConcrete() { return true; }
        @Override public boolean isThrowable() { return false; }
        @Override public boolean isNumberType() { return false; }
        @Override public boolean isPrimitive() { return false; }
        @Override public boolean isFinal() { return false; }
        @Override public boolean isIgnoredType() { return false; }
        @Override public boolean isCollectionLikeType() { return false; }
        @Override public boolean isMapLikeType() { return false; }
        @Override public boolean isFunctionType() { return false; }
        @Override public boolean hasGenerics() { return false; }
        @Override public boolean hasRawClass(Class<?> clz) { return _rawClass == clz; }
        @Override public boolean isJavaLangObject() { return _rawClass == Object.class; }
        @Override public boolean isArray() { return false; }
        @Override public boolean isInstantiatable() { return true; }
        @Override public boolean isBooleanOrPrimitive() { return false; }
        @Override public boolean isIntegerBased() { return false; }
        @Override public boolean isDoubleBased() { return false; }
        @Override public boolean isTextual() { return false; }
        @Override public boolean isBoolean() { return false; }
        @Override public boolean isNumeric() { return false; }
        @Override public boolean isIntegralType() { return false; }
        @Override public boolean isFloatOrDouble() { return false; }
        @Override public boolean isCollection() { return false; }
        @Override public boolean isMap() { return false; }
        @Override public boolean hasIdiomaticHandles(boolean includeSuper) { return false; }
        @Override public boolean isTypedSerializationSubset() { return false; }
        @Override public JavaType containedTypeOrUnknown(int index) { return null; }
        @Override public JavaType findSuperType(Class<?> target) { return null; }
        @Override public boolean isSelfReferential() { return false; }
        @Override public JavaType narrowBy(Class<?> targetSubclass) { return this; }
        @Override public JavaType broadenCapacity(Class<?> superClass) { return this; }
    }

    static class MockDeserializationContext extends DeserializationContext {
        private final DeserializationFeature _feature;
        private final boolean _enabled;
        
        MockDeserializationContext() {
            this(null, false);
        }

        MockDeserializationContext(DeserializationFeature feature, boolean enabled) {
            // Pass nulls for JsonFactory, ObjectMapper, DeserializerFactory which are not used in this mock
            super(null, null, null);
            _feature = feature;
            _enabled = enabled;
        }

        @Override
        public JsonParser getParser() {
            return DUMMY_PARSER;
        }

        @Override
        public void handleMissingInstantiator(JavaType type, JsonParser p, String msg, Object... params) throws IOException {
            throw new IOException(String.format(msg, params));
        }
        
        @Override
        public boolean isEnabled(DeserializationFeature f) {
            if (_feature != null && _feature == f) {
                return _enabled;
            }
            return super.isEnabled(f); // Default to false for other features
        }
        
        // Dummy implementations for abstract methods
        @Override public ValueInstantiator findValueInstantiator(JavaType type) { return null; }
        @Override public JsonDeserializer<?> findValueDeserializer(JavaType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> findKeyDeserializer(JavaType type, BeanDescription beanDesc) { return null; }
        @Override public JavaType resolveType(TypeReference<?> typeRef) { return null; }
        @Override public ObjectIdReader findObjectIdReader(JavaType type, BeanDescription beanDesc) { return null; }
        @Override public Object findInjectableValue(Object valueId, BeanProperty beanProperty, Object beanInstance) { return null; }
        @Override public void reportInputMismatch(JavaType targetType, String msg, Object... params) throws IOException { throw new IOException(String.format(msg, params)); }
        @Override public void reportInputMismatch(BeanDeserializerBuilder builder, JavaType targetType, String msg, Object... params) throws IOException { throw new IOException(String.format(msg, params)); }
        @Override public void reportInputMismatch(Object valueToConvert, String msg, Object... params) throws IOException { throw new IOException(String.format(msg, params)); }
        @Override public void reportUnrecognizedProperty(Object beanOrClass, String propertyName, JsonDeserializer<?> desserializer, Collection<Object> knownProperties) throws IOException { throw new IOException("Unrecognized property: " + propertyName); }
        @Override public void reportBadMerge(BeanProperty prop, JsonDeserializer<?> deserializer, String method) throws IOException { throw new IOException("Bad merge"); }
        @Override public JsonMappingException instantiationException(Class<?> beanClass, Throwable cause) { return new JsonMappingException(null, "Instantiation failed", cause); }
        @Override public JsonMappingException instantiationException(Class<?> beanClass, String msg) { return new JsonMappingException(null, "Instantiation failed: " + msg); }
        @Override public JsonMappingException invalidTypeIdException(JavaType baseType, String invalidTypeId, String message) { return new JsonMappingException(null, "Invalid type ID"); }
        @Override public JsonMappingException invalidFormatException(Object value, String expected, JavaType targetType, Throwable cause) { return new JsonMappingException(null, "Invalid format", cause); }
        @Override public JsonMappingException endOfInputException(Class<?> basicBType) { return new JsonMappingException(null, "End of input"); }
        @Override public JsonMappingException reportPropertyReadConflict(Class<?> beanClass, String propertyName, PropertyMetadata.MergeInfo mergeInfo, String conflictReason) { return new JsonMappingException(null, "Property read conflict"); }
        @Override public JsonMappingException unknownTypeException(JavaType type, String value) { return new JsonMappingException(null, "Unknown type"); }
        @Override public JsonMappingException invalidDefinitionException(JavaType type, String fieldName, String reason) { return new JsonMappingException(null, "Invalid definition"); }
        @Override public JsonMappingException propertyNotFoundException(Object bean, String propertyName, String msg) { return new JsonMappingException(null, "Property not found: " + propertyName); }
        @Override public JsonMappingException endOfInputException(JsonParser p, String msg) { return new JsonMappingException(null, msg); }
        @Override public <T> T readValue(JsonParser p, JavaType valueType) throws IOException { return null; }
        @Override public JsonNode readTree(JsonParser p) throws IOException { return null; }
        @Override public Object handleInstantiationProblem(Class<?> instClass, Object[] arguments, Throwable cause) { return null; }
        @Override public Object handleMissingInstantiator(JavaType valueType, JsonParser p, String msg, Object... params) throws IOException {
            // This needs to throw an exception, not return null, as it's supposed to signal an error.
            // We'll adapt the original behavior for this mock.
            throw new IOException(String.format(msg, params));
        }
        @Override public void consume(JsonParser p) throws IOException {}
    }
}
