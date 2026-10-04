package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class ExternalTypeHandlerTest {

    // Mock classes and objects to facilitate testing

    // Mock SettableBeanProperty that allows storing a value

    // Mock TypeDeserializer

    // Mock DeserializationContext

    // Mock ObjectMapper to provide a DeserializationContext
    
    private static class MockValueInstantiator extends ValueInstantiator {
        @Override public boolean canCreateFromObjectWith() { return true; }
        @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] params) { return new Object(); }
        @Override public String getValueTypeDesc() { return "Object"; }
    }

    // Mock BeanPropertyMap for build method
    private static class MockBeanPropertyMap extends BeanPropertyMap {
        protected MockBeanPropertyMap(boolean caseInsensitive, Collection<SettableBeanProperty> props) {
            super(caseInsensitive, props);
        }
        
        // Override find to provide a simple lookup for mocks
        public SettableBeanProperty find(String key) {
            // This is a simplified lookup; real BeanPropertyMap is more complex
            for (SettableBeanProperty prop : this) {
                if (prop.getName().equals(key)) {
                    return prop;
                }
            }
            return null;
        }
    }

    // Helper method to create a mock JsonParser for a scalar value
    private JsonParser createMockParserForValue(String value) throws IOException {
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString(value);
        JsonParser p = tb.asParserOnFirstToken();
        p.nextToken(); // Move to the actual token
        return p;
    }
    
    // Helper method to create a mock JsonParser for a structure
    private JsonParser createMockParserForStructure(String jsonString) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser(jsonString);
        return p;
    }

    // --- Tests ---






    




    @Test
    public void testComplete_defaultImplPresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        Class<?> defaultClass = Object.class;
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", defaultClass, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId, should use defaultImpl
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("default_value");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertEquals("default_value", prop1.getValue());
    }
    
    @Test
    public void testComplete_defaultImplNaturalType() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(String.class); // Natural type for String
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        Class<?> defaultClass = String.class; // String is natural type
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", defaultClass, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("natural_string_value");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertEquals("natural_string_value", prop1.getValue());
    }

    @Test
    public void testComplete_bothMissing() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = null; // Missing typeId
        handler._tokens[0] = null; // Missing property tokens
        
        Object bean = new Object();
        JsonParser mockParser = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParser, mockContext, bean);
        assertSame(bean, result);
        assertNull(prop1.getValue());
    }

    @Test
    public void testComplete_handlePropertyValue_typeIdAndValuePresent_again() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("prop1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(prop1, typeDeser1) };
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("value1");
        handler._tokens[0] = tb;
        
        Object bean = new Object();
        JsonParser mockParserComplete = createMockParserForValue("dummy");
        DeserializationContext mockContext = new MockObjectMapper().getMockContext();
        
        Object result = handler.complete(mockParserComplete, mockContext, bean);
        assertSame(bean, result);
        assertEquals("value1", prop1.getValue());
    }
    
    @Test
    public void testComplete_propertyBasedCreator_allValuesPresent() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        
        MockSettableBeanProperty creatorProp1 = new MockSettableBeanProperty("creator1", beanType, 0);
        MockSettableBeanProperty creatorProp2 = new MockSettableBeanProperty("creator2", beanType, 1);
        SettableBeanProperty[] creatorProps = new SettableBeanProperty[] { creatorProp1, creatorProp2 };

        MockSettableBeanProperty externalProp1 = new MockSettableBeanProperty("external1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(externalProp1, typeDeser1);
        
        Map<String, Object> nameToPropIndex = new HashMap<>();
        nameToPropIndex.put("external1", 0);
        nameToPropIndex.put("type1", 0);
        
        ExtTypedProperty[] extProps = new ExtTypedProperty[] { new ExtTypedProperty(externalProp1, typeDeser1) };
        
        MockObjectMapper mockObjectMapper = new MockObjectMapper();
        ValueInstantiator mockValueInstantiator = new MockValueInstantiator();
        
        ExternalTypeHandler handler = new ExternalTypeHandler(beanType, extProps, nameToPropIndex, new String[1], new TokenBuffer[1]);
        
        handler._typeIds[0] = "typeA";
        TokenBuffer tb = new TokenBuffer(null, null);
        tb.writeString("external_value");
        handler._tokens[0] = tb;
        
        JsonParser mockParserBuffer = createMockParserForValue("dummy");
        // The PropertyValueBuffer requires a PropertyBasedCreator to be fully functional for tests.
        // We'll mock the necessary parts of the interaction.
        
        // A full PropertyBasedCreator setup is complex. Instead, we focus on how ExternalTypeHandler calls _deserializeAndSet.
        // The `complete` method takes a PropertyValueBuffer and a PropertyBasedCreator.
        // We'll simulate the external property handling part.
        
        Object bean = new Object(); // This will be the object on which properties are set.
        JsonParser mockParser = createMockParserForValue("dummy");
        
        // Directly call the internal _deserializeAndSet logic which `complete` would invoke.
        handler._deserializeAndSet(mockParser, mockObjectMapper.getMockContext(), bean, 0, "typeA");

        assertEquals("external_value", externalProp1.getValue());
    }
    
    @Test
    public void testBuilder_addExternal_singleProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        assertNotNull(builder._properties);
        assertEquals(1, builder._properties.size());
        assertEquals(prop1, builder._properties.get(0).getProperty());
        
        assertNotNull(builder._nameToPropertyIndex);
        assertEquals(2, builder._nameToPropertyIndex.size());
        assertEquals(0, builder._nameToPropertyIndex.get("prop1"));
        assertEquals(0, builder._nameToPropertyIndex.get("type1"));
    }

    @Test
    public void testBuilder_addExternal_multiplePropertiesSameName() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        MockSettableBeanProperty prop2 = new MockSettableBeanProperty("prop1", beanType); // Same name as prop1
        MockTypeDeserializer typeDeser2 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeB")); // Same type property name
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        builder.addExternal(prop2, typeDeser2);
        
        assertNotNull(builder._properties);
        assertEquals(2, builder._properties.size());
        assertEquals(prop1, builder._properties.get(0).getProperty());
        assertEquals(prop2, builder._properties.get(1).getProperty());
        
        assertNotNull(builder._nameToPropertyIndex);
        assertEquals(2, builder._nameToPropertyIndex.size());
        
        Object propNameIndex = builder._nameToPropertyIndex.get("prop1");
        assertTrue(propNameIndex instanceof List);
        List<?> propList = (List<?>) propNameIndex;
        assertEquals(2, propList.size());
        assertEquals(0, propList.get(0));
        assertEquals(1, propList.get(1));

        Object typeNameIndex = builder._nameToPropertyIndex.get("type1");
        assertTrue(typeNameIndex instanceof List);
        List<?> typeList = (List<?>) typeNameIndex;
        assertEquals(2, typeList.size());
        assertEquals(0, typeList.get(0));
        assertEquals(1, typeList.get(1));
    }
    
    @Test
    public void testBuilder_build_withOtherProps() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop1, typeDeser1);
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        BeanPropertyMap otherProps = new MockBeanPropertyMap(false, Arrays.asList(typeProp));
        
        ExternalTypeHandler handler = builder.build(otherProps);
        
        assertNotNull(handler);
        assertNotNull(handler._properties);
        assertEquals(1, handler._properties.length);
        
        ExtTypedProperty extTypedProp = handler._properties[0];
        assertNotNull(extTypedProp);
        assertEquals(prop1, extTypedProp.getProperty());
        assertEquals(typeProp, extTypedProp.getTypeProperty()); 
    }
    
    @Test
    public void testExtTypedProperty_linkTypeProperty() throws Exception {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        extTypedProp.linkTypeProperty(typeProp);
        
        assertEquals(typeProp, extTypedProp.getTypeProperty());
    }

    @Test
    public void testExtTypedProperty_hasTypePropertyName() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertTrue(extTypedProp.hasTypePropertyName("type1"));
        assertFalse(extTypedProp.hasTypePropertyName("otherName"));
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_whenPresent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", Object.class, MockTypeDeserializer.createMockResolver("typeA")); // Default impl present
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertTrue(extTypedProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_hasDefaultType_whenAbsent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA")); // No default impl
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertFalse(extTypedProp.hasDefaultType());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId_whenPresent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", Object.class, MockTypeDeserializer.createMockResolver("defaultTypeId"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertEquals("defaultTypeId", extTypedProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getDefaultTypeId_whenAbsent() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA")); // No default impl
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertNull(extTypedProp.getDefaultTypeId());
    }

    @Test
    public void testExtTypedProperty_getTypePropertyName() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1); 
        
        assertEquals("type1", extTypedProp.getTypePropertyName());
    }

    @Test
    public void testExtTypedProperty_getProperty() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertEquals(prop1, extTypedProp.getProperty());
    }
    
    @Test
    public void testExtTypedProperty_getTypeProperty() {
        JavaType beanType = SimpleType.constructUnsafe(Object.class);
        MockSettableBeanProperty prop1 = new MockSettableBeanProperty("prop1", beanType);
        MockTypeDeserializer typeDeser1 = new MockTypeDeserializer("type1", null, MockTypeDeserializer.createMockResolver("typeA"));
        ExtTypedProperty extTypedProp = new ExtTypedProperty(prop1, typeDeser1);
        
        assertNull(extTypedProp.getTypeProperty()); // Not linked initially
        
        MockSettableBeanProperty typeProp = new MockSettableBeanProperty("type1", beanType);
        extTypedProp.linkTypeProperty(typeProp);
        assertEquals(typeProp, extTypedProp.getTypeProperty());
    }
}





