```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;

public class BeanDeserializerBaseTest {
    // Helper method to create a dummy BeanDescription for testing purposes
    private BeanDescription createDummyBeanDescription(JavaType type) {
        // BeanDescription constructor requires AnnotationIntrospector, which we don't have.
        // We need to simulate it or use a factory if available.
        // For now, let's create a minimal AnnotatedClass and use a simplified BeanDescription.
        AnnotatedClass ac = AnnotatedClass.construct(type.getRawClass(), null, null);
        return new BeanDescription(null, type, ac, Collections.emptyList(), Collections.emptyList(), null, null);
    }

    // Helper method to create a dummy BeanPropertyMap
    private BeanPropertyMap createDummyBeanPropertyMap() {
        // BeanPropertyMap has constructors requiring specific arguments.
        // Use a constructor that accepts a collection.
        return new BeanPropertyMap(false, Collections.emptyList());
    }

    // Helper method to create a dummy ValueInstantiator
    private ValueInstantiator createDummyValueInstantiator(JavaType type) {
        return new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return type.getRawClass(); }
            @Override public String getValueTypeDesc() { return type.getRawClass().getName(); }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromString() { return false; }
            @Override public boolean canCreateFromInt() { return false; }
            @Override public boolean canCreateFromLong() { return false; }
            @Override public boolean canCreateFromDouble() { return false; }
            @Override public boolean canCreateFromBoolean() { return false; }
            @Override public boolean canCreateUsingDefault() { return true; }
            @Override public boolean canCreateUsingDelegate() { return false; }
            @Override public boolean canCreateUsingArrayDelegate() { return false; }
            @Override public boolean canCreateFromObjectWith() { return false; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return null; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return null; }
            @Override public JavaType getArrayDelegateType(DeserializationConfig config) { return null; }
            @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException { return new Object(); }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException { return null; }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException { return null; }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
            @Override public Object createUsingArrayDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
            @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return null; }
            @Override public Object createFromInt(DeserializationContext ctxt, int value) throws IOException { return null; }
        };
    }

    // Helper method to create a dummy DeserializationContext
    private DeserializationContext createDummyDeserializationContext() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationContext();
    }

    // Helper method to create a dummy BeanDeserializerBuilder
    private BeanDeserializerBuilder createDummyBeanDeserializerBuilder(JavaType beanType) {
        // BeanDeserializerBuilder requires BeanDescription, PropertyNamingStrategy, and ValueInstantiator.
        // Providing null for some arguments where possible or creating dummy instances.
        return new BeanDeserializerBuilder(createDummyBeanDescription(beanType), null); // Null for propertyNamingStrategy for simplicity
    }
    
    // Helper to create a dummy JavaType
    private JavaType createDummyJavaType(Class<?> cls) {
        return SimpleType.constructUnsafe(cls);
    }

    // --- Tests ---

    @Test
    public void testConstructorBasic() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanPropertyMap properties = createDummyBeanPropertyMap();

        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);

        assertNotNull(deserializer);
        assertEquals(beanType, deserializer._beanType);
        assertEquals(properties, deserializer._beanProperties);
        assertNull(deserializer._delegateDeserializer);
        assertNull(deserializer._propertyBasedCreator);
        assertFalse(deserializer._nonStandardCreation);
        assertTrue(deserializer._vanillaProcessing);
    }

    @Test
    public void testConstructorWithDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator delegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateUsingDefault() { return false; }
            @Override public boolean canCreateUsingDelegate() { return true; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return createDummyJavaType(String.class); }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return delegate; }
        };
        builder.setValueInstantiator(delegateInstantiator);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        assertTrue(deserializer._valueInstantiator.canCreateUsingDelegate());
        assertFalse(deserializer._vanillaProcessing);
    }

    @Test
    public void testResolveBasicProperties() throws Exception {
        JavaType beanType = createDummyJavaType(String.class); 
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));

        // SettableBeanProperty.Field is not public. We need to use a concrete subclass or mock.
        // Let's use a simplified SettableBeanProperty directly.
        SettableBeanProperty prop = new SettableBeanProperty(
                PropertyName.construct("testProp"),
                createDummyJavaType(String.class),
                null, // property name
                null, // type deserializer
                null, // annotations
                PropertyMetadata.STD_OPTIONAL // metadata
        ) {
            private static final long serialVersionUID = 1L;
            private String _value;

            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                _value = p.getText();
                set(bean, _value);
            }

            @Override
            public void set(Object instance, Object value) throws IOException {
                if (instance instanceof Map) {
                    ((Map<String, Object>) instance).put(getName(), value);
                } else if (instance instanceof StringBuilder) {
                    if (value != null) ((StringBuilder) instance).append(value.toString());
                } else {
                    // Fallback for general objects, attempting to set a field named "testProp"
                    try {
                        java.lang.reflect.Field field = instance.getClass().getDeclaredField("testProp");
                        field.setAccessible(true);
                        field.set(instance, value);
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        // Ignore if field doesn't exist or is inaccessible
                    }
                }
            }

            @Override
            public Object get(Object instance) throws IOException {
                if (instance instanceof Map) {
                    return ((Map<String, Object>) instance).get(getName());
                } else if (instance instanceof StringBuilder) {
                    return ((StringBuilder) instance).toString();
                } else {
                    // Fallback for general objects
                    try {
                        java.lang.reflect.Field field = instance.getClass().getDeclaredField("testProp");
                        field.setAccessible(true);
                        return field.get(instance);
                    } catch (NoSuchFieldException | IllegalAccessException e) { return null; }
                }
            }
            
            @Override
            public String getName() { return "testProp"; }

            @Override
            public JavaType getType() { return createDummyJavaType(String.class); }
            
            @Override
            public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
                // Return a new instance or 'this' depending on immutability needs.
                // For simplicity, returning 'this' here, but a real implementation might create a new one.
                return this; 
            }
        };
        
        JsonDeserializer<Object> propDeserializer = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };
        // Need to make deserializer contextual before assigning
        propDeserializer = propDeserializer.createContextual(null, null); 
        prop.withValueDeserializer(propDeserializer);

        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        deserializer.resolve(ctxt);
        assertTrue(deserializer._vanillaProcessing);
    }

    @Test
    public void testCreateContextualWithObjectIdInfo() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));

        ObjectMapper mapper = new ObjectMapper();
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;
        
        // Mocking SettableBeanProperty.Field for idProperty
        SettableBeanProperty idProperty = new SettableBeanProperty(
            PropertyName.construct("id"),
            createDummyJavaType(Integer.class),
            null, null, null, PropertyMetadata.STD_REQUIRED
        ) {
             private static final long serialVersionUID = 1L;
             @Override public void set(Object instance, Object value) {}
             @Override public Object get(Object instance) { return 123; }
             @Override public String getName() { return "id"; }
             @Override public JavaType getType() { return createDummyJavaType(Integer.class); }
             @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        
        // Mocking ObjectIdResolver
        ObjectIdResolver resolver = new ObjectIdResolver() {
            @Override public void bindItem(Object id, Object item) { }
            @Override public Object resolveId(Object id) throws IOException { return null; }
            @Override public ObjectIdResolver newForDeserialization(Object context) { return this; }
        };

        DeserializationContext mockCtxt = new DeserializationContext(mapper.getDeserializationConfig().without(MapperFeature.USE_BASE_TYPE_DESERIALIZER)) {
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() {
                return new AnnotationIntrospector() {
                    @Override
                    public ObjectIdInfo findObjectIdInfo(Annotated a) {
                        return new ObjectIdInfo(PropertyName.construct("id"),
                                                createDummyJavaType(Integer.class).getRawClass(),
                                                ObjectIdGenerators.IntSequenceGenerator.class,
                                                null); 
                    }
                };
            }
            @Override
            public ObjectIdResolver objectIdResolverInstance(Annotated a, ObjectIdInfo info) throws JsonMappingException {
                return resolver;
            }
            @Override
            public JavaType constructType(Class<?> cls) {
                return createDummyJavaType(cls);
            }
            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo info) throws JsonMappingException {
                if (info.getGeneratorType() == ObjectIdGenerators.IntSequenceGenerator.class) {
                    return new ObjectIdGenerators.IntSequenceGenerator(info.getScope(), -1);
                }
                return null;
            }
            @Override
            public JsonDeserializer<?> findRootValueDeserializer(JavaType type) throws JsonMappingException {
                if (type.getRawClass().equals(Integer.class)) {
                    return new StdDeserializer<Integer>(Integer.class) {
                        @Override public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return p.getIntValue(); }
                    };
                }
                return super.findRootValueDeserializer(type);
            }
            @Override
            public BeanProperty findBeanProperty(String name) {
                if ("id".equals(name)) return idProperty;
                return null;
            }
            @Override
            public TypeFactory getTypeFactory() {
                return mapper.getTypeFactory();
            }
        };

        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        BeanDeserializerBase contextualDeserializer = (BeanDeserializerBase) deserializer.createContextual(mockCtxt, null); 
        
        assertNotNull(contextualDeserializer._objectIdReader);
        assertEquals("id", contextualDeserializer._objectIdReader.propertyName.getSimpleName());
    }
    
    @Test
    public void testDeserializeFromObjectWithDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator delegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateUsingDefault() { return false; }
            @Override public boolean canCreateUsingDelegate() { return true; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return createDummyJavaType(String.class); }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return "Delegate:" + delegate; }
        };
        builder.setValueInstantiator(delegateInstantiator);
        
        JsonDeserializer<Object> delegateDeserializer = new StdDelegatingDeserializer<>(
            new Converter<Object, Object>() {
                @Override public Object convert(Object value) { return value; }
                @Override public JavaType getInputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
                @Override public JavaType getOutputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
            }
        );

        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_delegateDeserializer");
            field.setAccessible(true);
            field.set(deserializer, delegateDeserializer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParser = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_STRING;
            @Override public JsonToken getCurrentToken() { return currentToken; }
            @Override public String getText() throws IOException { return "delegateInput"; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromObject(mockParser, ctxt);
        assertEquals("Delegate:delegateInput", result);
    }

    @Test
    public void testDeserializeFromObjectWithPropertyBasedCreator() throws Exception {
        JavaType beanType = createDummyJavaType(TestBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        JavaType nameType = createDummyJavaType(String.class);
        JavaType ageType = createDummyJavaType(Integer.class);

        SettableBeanProperty nameProp = new SettableBeanProperty(PropertyName.construct("name"), nameType, null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L;
            @Override public void set(Object instance, Object value) throws IOException { ((TestBean)instance).name = (String) value; }
            @Override public Object get(Object instance) throws IOException { return ((TestBean)instance).name; }
            @Override public String getName() { return "name"; }
            @Override public JavaType getType() { return nameType; }
            @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty ageProp = new SettableBeanProperty(PropertyName.construct("age"), ageType, null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L;
            @Override public void set(Object instance, Object value) throws IOException { ((TestBean)instance).age = (Integer) value; }
            @Override public Object get(Object instance) throws IOException { return ((TestBean)instance).age; }
            @Override public String getName() { return "age"; }
            @Override public JavaType getType() { return ageType; }
            @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        AnnotatedWithParams constructor = new AnnotatedConstructor(null, null) { 
            @Override
            public Constructor<?> getRawMember() {
                try {
                    return TestBean.class.getConstructor(String.class, int.class);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        
        // Need to create a PropertyBasedCreator. This requires a ValueInstantiator.
        ValueInstantiator vi = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return TestBean.class; }
            @Override public String getValueTypeDesc() { return "TestBean"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromObjectWith() { return true; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[]{ nameProp, ageProp }; }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException {
                // Manually assign parameters to buffer for testing
                buffer.assignParameter(props[0], "TestName");
                buffer.assignParameter(props[1], 30);
                return new TestBean("TestName", 30);
            }
        };

        PropertyBasedCreator creator = PropertyBasedCreator.construct(createDummyDeserializationContext(), 
            vi,
            new SettableBeanProperty[]{ nameProp, ageProp }
        );
        
        builder.setValueInstantiator(creator.getValueInstantiator()); 
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        // Inject the creator into the deserializer instance
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_propertyBasedCreator");
            field.setAccessible(true);
            field.set(deserializer, creator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParser = new MockJsonParser() {
            private LinkedList<JsonToken> tokens = new LinkedList<>(Arrays.asList(
                JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, // name
                JsonToken.FIELD_NAME, JsonToken.VALUE_NUMBER_INT, // age
                JsonToken.END_OBJECT
            ));
            private String currentFieldName = null;
            private int intValue = 30;

            @Override public JsonToken nextToken() throws IOException {
                if (!tokens.isEmpty()) {
                    JsonToken token = tokens.pollFirst();
                    if (token == JsonToken.FIELD_NAME) {
                        // Assign field name based on expected order
                        if (currentFieldName == null) currentFieldName = "name";
                        else currentFieldName = "age";
                    }
                    return token;
                }
                return JsonToken.NOT_AVAILABLE;
            }
            @Override public String getCurrentName() { return currentFieldName; }
            @Override public int getIntValue() throws IOException { return intValue; }
            @Override public String getText() throws IOException { return "TestName"; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromObject(mockParser, ctxt);
        assertTrue(result instanceof TestBean);
        assertEquals("TestName", ((TestBean)result).name);
        assertEquals(30, ((TestBean)result).age);
    }

    @Test
    public void testDeserializeFromStringWithDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator delegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromString() { return false; } 
            @Override public boolean canCreateUsingDelegate() { return true; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return createDummyJavaType(String.class); }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return "DelegateString:" + delegate; }
        };
        builder.setValueInstantiator(delegateInstantiator);

        JsonDeserializer<Object> delegateDeserializer = new StdDelegatingDeserializer<>(
             new Converter<Object, Object>() {
                @Override public Object convert(Object value) { return value; }
                @Override public JavaType getInputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
                @Override public JavaType getOutputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
            }
        );
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_delegateDeserializer");
            field.setAccessible(true);
            field.set(deserializer, delegateDeserializer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParser = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_STRING;
            @Override public JsonToken getCurrentToken() { return currentToken; }
            @Override public String getText() throws IOException { return "inputString"; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromString(mockParser, ctxt);
        assertEquals("DelegateString:inputString", result);
    }

    @Test
    public void testDeserializeFromStringDirectly() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator stringCreatorInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return String.class; }
            @Override public String getValueTypeDesc() { return "String"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromString() { return true; }
            @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return "CreatedString:" + value; }
        };
        builder.setValueInstantiator(stringCreatorInstantiator);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        MockJsonParser mockParser = new MockJsonParser() {
            private String text = "directString";
            private JsonToken currentToken = JsonToken.VALUE_STRING;

            @Override public String getText() throws IOException { return text; }
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };

        DeserializationContext ctxt = createDummyDeserializationContext();
        Object result = deserializer.deserializeFromString(mockParser, ctxt);

        assertEquals("CreatedString:directString", result);
    }

    @Test
    public void testDeserializeFromNumberWithDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(Integer.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator delegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromInt() { return false; } 
            @Override public boolean canCreateUsingDelegate() { return true; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return createDummyJavaType(Long.class); }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return Integer.valueOf(((Number)delegate).intValue() + 10); }
        };
        builder.setValueInstantiator(delegateInstantiator);

        JsonDeserializer<Object> delegateDeserializer = new StdDelegatingDeserializer<>(
             new Converter<Object, Object>() {
                @Override public Object convert(Object value) { return value; }
                @Override public JavaType getInputType(TypeFactory typeFactory) { return createDummyJavaType(Long.class); }
                @Override public JavaType getOutputType(TypeFactory typeFactory) { return createDummyJavaType(Long.class); }
            }
        );
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_delegateDeserializer");
            field.setAccessible(true);
            field.set(deserializer, delegateDeserializer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParser = new MockJsonParser() {
            private long numberValue = 100L;
            private JsonToken currentToken = JsonToken.VALUE_NUMBER_INT;
            @Override public NumberType getNumberType() { return NumberType.LONG; }
            @Override public int getIntValue() throws IOException { return (int) numberValue; }
            @Override public long getLongValue() throws IOException { return numberValue; }
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromNumber(mockParser, ctxt);
        assertEquals(Integer.valueOf(110), result);
    }

    @Test
    public void testDeserializeFromNumberDirectly() throws Exception {
        JavaType beanType = createDummyJavaType(Integer.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator intCreatorInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Integer.class; }
            @Override public String getValueTypeDesc() { return "Integer"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromInt() { return true; }
            @Override public Object createFromInt(DeserializationContext ctxt, int value) throws IOException { return value + 1; }
        };
        builder.setValueInstantiator(intCreatorInstantiator);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        MockJsonParser mockParser = new MockJsonParser() {
            private int intValue = 5;
            private JsonToken currentToken = JsonToken.VALUE_NUMBER_INT;
            @Override public NumberType getNumberType() { return NumberType.INT; }
            @Override public int getIntValue() throws IOException { return intValue; }
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromNumber(mockParser, ctxt);
        assertEquals(Integer.valueOf(6), result);
    }

    @Test
    public void testDeserializeFromBooleanWithDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(Boolean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator delegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromBoolean() { return false; } 
            @Override public boolean canCreateUsingDelegate() { return true; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return createDummyJavaType(String.class); }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return Boolean.valueOf(delegate.toString().equals("true")); }
        };
        builder.setValueInstantiator(delegateInstantiator);

        JsonDeserializer<Object> delegateDeserializer = new StdDelegatingDeserializer<>(
             new Converter<Object, Object>() {
                @Override public Object convert(Object value) { return value; }
                @Override public JavaType getInputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
                @Override public JavaType getOutputType(TypeFactory typeFactory) { return createDummyJavaType(String.class); }
            }
        );
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_delegateDeserializer");
            field.setAccessible(true);
            field.set(deserializer, delegateDeserializer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParserTrue = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_TRUE;
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        MockJsonParser mockParserFalse = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_FALSE;
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        // Test that delegate path is taken.
        Object resultTrue = deserializer.deserializeFromBoolean(mockParserTrue, ctxt);
        assertTrue((Boolean)resultTrue);

        Object resultFalse = deserializer.deserializeFromBoolean(mockParserFalse, ctxt);
        assertFalse((Boolean)resultFalse);
    }

    @Test
    public void testDeserializeFromBooleanDirectly() throws Exception {
        JavaType beanType = createDummyJavaType(Boolean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator booleanCreatorInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Boolean.class; }
            @Override public String getValueTypeDesc() { return "Boolean"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromBoolean() { return true; }
            @Override public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException { return value; }
        };
        builder.setValueInstantiator(booleanCreatorInstantiator);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        MockJsonParser mockParserTrue = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_TRUE;
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        MockJsonParser mockParserFalse = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.VALUE_FALSE;
            @Override public JsonToken getCurrentToken() { return currentToken; }
        };
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object resultTrue = deserializer.deserializeFromBoolean(mockParserTrue, ctxt);
        assertTrue((Boolean) resultTrue);

        Object resultFalse = deserializer.deserializeFromBoolean(mockParserFalse, ctxt);
        assertFalse((Boolean) resultFalse);
    }

    @Test
    public void testDeserializeFromArrayWithArrayDelegate() throws Exception {
        JavaType beanType = createDummyJavaType(List.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        
        ValueInstantiator arrayDelegateInstantiator = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return Object.class; }
            @Override public String getValueTypeDesc() { return "Object"; }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateUsingArrayDelegate() { return true; }
            @Override public JavaType getArrayDelegateType(DeserializationConfig config) { return createDummyJavaType(List.class); }
            @Override public Object createUsingArrayDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return new ArrayList<>((Collection<?>) delegate); }
        };
        builder.setValueInstantiator(arrayDelegateInstantiator);

        JsonDeserializer<Object> arrayDelegateDeserializer = new StdDelegatingDeserializer<>(
             new Converter<Object, Object>() {
                @Override public Object convert(Object value) { return value; }
                @Override public JavaType getInputType(TypeFactory typeFactory) { return createDummyJavaType(List.class); }
                @Override public JavaType getOutputType(TypeFactory typeFactory) { return createDummyJavaType(List.class); }
            }
        );
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_arrayDelegateDeserializer");
            field.setAccessible(true);
            field.set(deserializer, arrayDelegateDeserializer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MockJsonParser mockParser = new MockJsonParser() {
            private JsonToken currentToken = JsonToken.START_ARRAY;
            private LinkedList<JsonToken> tokens = new LinkedList<>(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY));
            private LinkedList<String> stringValues = new LinkedList<>(Arrays.asList("a")); 
            private LinkedList<Long> longValues = new LinkedList<>(Arrays.asList(1L)); 

            @Override public JsonToken getCurrentToken() { return currentToken; }
            @Override public JsonToken nextToken() throws IOException {
                if (!tokens.isEmpty()) {
                    currentToken = tokens.pollFirst();
                    return currentToken;
                }
                return JsonToken.NOT_AVAILABLE;
            }
            @Override public Object readValueAs(Class<?> valueType) throws IOException {
                if (valueType == String.class) return stringValues.pollFirst();
                if (valueType == Long.class || valueType == Integer.class) return longValues.pollFirst();
                return super.readValueAs(valueType);
            }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        Object result = deserializer.deserializeFromArray(mockParser, ctxt);
        assertTrue(result instanceof List);
        List<?> listResult = (List<?>) result;
        assertEquals(2, listResult.size());
        assertEquals("a", listResult.get(0));
        assertEquals(Integer.valueOf(1), listResult.get(1)); 
    }

    @Test
    public void testDeserializeFromObjectWithIgnoredProps() throws Exception {
        JavaType beanType = createDummyJavaType(TestBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        Set<String> ignorableProps = new HashSet<>(Arrays.asList("ignoredField"));
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, ignorableProps, false, false);
        
        MockJsonParser mockParser = new MockJsonParser() {
            private LinkedList<JsonToken> tokens = new LinkedList<>(Arrays.asList(
                JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, 
                JsonToken.FIELD_NAME, JsonToken.VALUE_NUMBER_INT, 
                JsonToken.END_OBJECT
            ));
            private String currentFieldName = null;
            private int intValue = 123;

            @Override public JsonToken nextToken() throws IOException {
                if (!tokens.isEmpty()) {
                    JsonToken token = tokens.pollFirst();
                    if (token == JsonToken.FIELD_NAME) {
                        currentFieldName = "ignoredField"; // First field name
                        return token;
                    } else if (token == JsonToken.VALUE_STRING) {
                        return token;
                    } else if (token == JsonToken.FIELD_NAME) { // Second field name
                        currentFieldName = "visibleField";
                        return token;
                    } else if (token == JsonToken.VALUE_NUMBER_INT) {
                        return token;
                    }
                    return token;
                }
                return JsonToken.NOT_AVAILABLE;
            }
            @Override public String getCurrentName() { return currentFieldName; }
            @Override public int getIntValue() throws IOException { return intValue; }
            @Override public String getText() throws IOException { return "someIgnoredValue"; }
        };
        DeserializationContext ctxt = createDummyDeserializationContext();
        // This test primarily checks that ignored properties are not processed or cause errors.
        // The actual behavior is checked by handleIgnoredProperty tests.
        Object result = deserializer.deserializeFromObject(mockParser, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testHandleIgnoredProperty() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        Set<String> ignorableProps = new HashSet<>(Collections.singletonList("dummyIgnored"));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, ignorableProps, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        MockJsonParser mockParser = new MockJsonParser() {
            @Override public JsonToken nextToken() throws IOException { return JsonToken.VALUE_NULL; } 
            @Override public void skipChildren() throws IOException {} 
        };
        
        DeserializationConfig configEnabled = ctxt.getConfig().with(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        DeserializationContext ctxtEnabled = new DeserializationContext(configEnabled);

        try {
            deserializer.handleIgnoredProperty(mockParser, ctxtEnabled, new Object(), "dummyIgnored");
            fail("Should have thrown IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            assertEquals("dummyIgnored", e.getPropertyName());
        }

        DeserializationConfig configDisabled = ctxt.getConfig().without(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        DeserializationContext ctxtDisabled = new DeserializationContext(configDisabled);
        try {
            deserializer.handleIgnoredProperty(mockParser, ctxtDisabled, new Object(), "dummyIgnored");
        } catch (Exception e) {
            fail("Should not have thrown an exception when FAIL_ON_IGNORED_PROPERTIES is disabled: " + e.getMessage());
        }
    }
    
    @Test
    public void testWrapAndThrowWithJsonMappingException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        // JsonMappingException.wrapWithPath is static, so we call it directly for assertion
        JsonMappingException originalException = new JsonMappingException("Original message");
        originalException.prependPathSegment(fieldName);

        try {
            deserializer.wrapAndThrow(originalException, bean, fieldName, ctxt); // The method will add the path
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Original message", e.getMessage());
            assertTrue(e.getPathReference().contains(fieldName));
        }
    }

    @Test
    public void testWrapAndThrowWithRuntimeException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        RuntimeException originalException = new RuntimeException("Runtime error");

        try {
            deserializer.wrapAndThrow(originalException, bean, fieldName, ctxt);
            fail("Expected RuntimeException wrapped in JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Runtime error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithInvocationTargetException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        InvocationTargetException ite = new InvocationTargetException(new RuntimeException("Inner error"));

        try {
            deserializer.wrapAndThrow(ite, bean, fieldName, ctxt);
            fail("Expected RuntimeException wrapped in JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Inner error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithWrapExceptionsEnabled() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationConfig config = createDummyDeserializationContext().getConfig().with(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = new DeserializationContext(config);
        Object bean = new Object();
        String fieldName = "testField";
        IOException ioException = new IOException("IO error");

        try {
            deserializer.wrapAndThrow(ioException, bean, fieldName, ctxt);
            fail("Expected IOException");
        } catch (JsonMappingException e) { // WRAP_EXCEPTIONS means it should still be wrapped
            assertTrue(e.getCause() instanceof IOException);
            assertEquals("IO error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithWrapExceptionsDisabled() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationConfig config = createDummyDeserializationContext().getConfig().without(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = new DeserializationContext(config);
        Object bean = new Object();
        String fieldName = "testField";
        IOException ioException = new IOException("IO error");

        try {
            deserializer.wrapAndThrow(ioException, bean, fieldName, ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("IO error", e.getMessage());
            // JsonMappingException.wrapWithPath might still add path info even if not wrapping
            // However, the core exception should be IOException.
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapInstantiationProblem() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Throwable throwable = new RuntimeException("Instantiation failure");

        try {
            deserializer.wrapInstantiationProblem(throwable, ctxt);
            fail("Expected handleInstantiationProblem");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Failed to instantiate"));
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Instantiation failure", e.getCause().getMessage());
        }
    }

    @Test
    public void testFindBackReference() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty backRefProp = new SettableBeanProperty(PropertyName.construct("backRef"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L;
            @Override public void set(Object instance, Object value) {}
            @Override public Object get(Object instance) { return null; }
            @Override public String getName() { return "backRef"; }
            @Override public JavaType getType() { return createDummyJavaType(String.class); }
            @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        Map<String, SettableBeanProperty> backRefs = new HashMap<>();
        backRefs.put("myRef", backRefProp);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), backRefs, null, false, false);
        
        assertNotNull(deserializer.findBackReference("myRef"));
        assertEquals(backRefProp, deserializer.findBackReference("myRef"));
        assertNull(deserializer.findBackReference("nonExistentRef"));
    }
    
    @Test
    public void testGetPropertyCount() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("prop2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        BeanPropertyMap properties = new BeanPropertyMap(false, Arrays.asList(prop1, prop2));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(2, deserializer.getPropertyCount());
    }

    @Test
    public void testGetKnownPropertyNames() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("name1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("name2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        BeanPropertyMap properties = new BeanPropertyMap(false, Arrays.asList(prop1, prop2));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        Collection<Object> names = deserializer.getKnownPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("name1"));
        assertTrue(names.contains("name2"));
    }

    @Test
    public void testIsCachable() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        assertTrue(deserializer.isCachable());
    }
    
    @Test
    public void testValueType() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        assertEquals(beanType, deserializer.getValueType());
    }

    @Test
    public void testUnwrappingDeserializer() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        // BeanDeserializerBase is abstract and unwrappingDeserializer is abstract.
        // We need a concrete subclass. BeanDeserializer implements it.
        // We'll test BeanDeserializer directly or mock the behavior.
        
        // Using a concrete implementation (BeanDeserializer) for testing.
        BeanDeserializer deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        NameTransformer transformer = new NameTransformer.Chained(new NameTransformer.Prefix("pre_"), new NameTransformer.Suffix("_suf"));
        JsonDeserializer<Object> unwrapping = deserializer.unwrappingDeserializer(transformer);
        
        assertNotNull(unwrapping);
        // Further assertions could check the type or behavior of the unwrapping deserializer if it were more complex.
    }

    @Test
    public void testWithObjectIdReader() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        ObjectIdReader oir = ObjectIdReader.construct(
            createDummyJavaType(Integer.class),
            PropertyName.construct("id"),
            new ObjectIdGenerators.IntSequenceGenerator(null, -1),
            createDummyDeserializationContext().findRootValueDeserializer(createDummyJavaType(Integer.class)),
            null, // No idProperty for this simple test
            new ObjectIdResolver() { // Dummy resolver
                @Override public void bindItem(Object id, Object item) {}
                @Override public Object resolveId(Object id) throws IOException { return null; }
                @Override public ObjectIdResolver newForDeserialization(Object context) { return this; }
            }
        );
        
        BeanDeserializerBase newDeserializer = deserializer.withObjectIdReader(oir);
        assertNotSame(deserializer, newDeserializer);
        assertNotNull(newDeserializer._objectIdReader);
        assertEquals("id", newDeserializer._objectIdReader.propertyName.getSimpleName());
    }

    @Test
    public void testWithIgnorableProperties() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        Set<String> initialIgnorable = new HashSet<>(Arrays.asList("prop1"));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, initialIgnorable, false, false);

        Set<String> newIgnorable = new HashSet<>(Arrays.asList("prop2", "prop3"));
        BeanDeserializerBase newDeserializer = deserializer.withIgnorableProperties(newIgnorable);
        
        assertNotSame(deserializer, newDeserializer);
        assertEquals(newIgnorable, newDeserializer._ignorableProps);
    }
    
    @Test
    public void testWithBeanProperties() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));

        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("prop2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap initialProps = new BeanPropertyMap(false, Arrays.asList(prop1));
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, initialProps, null, null, false, false);

        BeanPropertyMap newProps = new BeanPropertyMap(false, Arrays.asList(prop2));
        BeanDeserializerBase newDeserializer = deserializer.withBeanProperties(newProps);
        
        assertNotSame(deserializer, newDeserializer);
        assertEquals(newProps, newDeserializer._beanProperties);
    }

    @Test
    public void testHandledType() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        assertEquals(String.class, deserializer.handledType());
    }
    
    @Test
    public void testGetObjectIdReader() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);

        assertNull(deserializer.getObjectIdReader());
    }

    @Test
    public void testHasProperty() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);

        assertTrue(deserializer.hasProperty("testProp"));
        assertFalse(deserializer.hasProperty("nonExistentProp"));
    }

    @Test
    public void testHasViews() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false); // hasViews = false
        assertFalse(deserializer.hasViews());

        BeanDeserializerBase deserializerWithViews = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, true); // hasViews = true
        assertTrue(deserializerWithViews.hasViews());
    }
    
    @Test
    public void testGetBeanClass() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        assertEquals(String.class, deserializer.getBeanClass());
    }

    @Test
    public void testPropertiesIterator() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop1));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);

        Iterator<SettableBeanProperty> it = deserializer.properties();
        assertTrue(it.hasNext());
        assertEquals(prop1, it.next());
        assertFalse(it.hasNext());
    }
    
    @Test
    public void testCreatorPropertiesIterator() {
        JavaType beanType = createDummyJavaType(TestBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);

        JavaType nameType = createDummyJavaType(String.class);
        SettableBeanProperty nameProp = new SettableBeanProperty(PropertyName.construct("name"), nameType, null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name"; } @Override public JavaType getType() { return nameType; } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        
        ValueInstantiator vi = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return TestBean.class; }
            @Override public String getValueTypeDesc() { return "TestBean"; }
            @Override public boolean canCreateFromObjectWith() { return true; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[]{ nameProp }; }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException { return null; }
        };

        PropertyBasedCreator creator = PropertyBasedCreator.construct(createDummyDeserializationContext(), 
            vi,
            new SettableBeanProperty[]{ nameProp }
        );
        
        builder.setValueInstantiator(creator.getValueInstantiator()); 
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, createDummyBeanPropertyMap(), null, null, false, false);
        
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_propertyBasedCreator");
            field.setAccessible(true);
            field.set(deserializer, creator);
        } catch (Exception e) { throw new RuntimeException(e); }

        Iterator<SettableBeanProperty> it = deserializer.creatorProperties();
        assertTrue(it.hasNext());
        assertEquals(nameProp, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFindPropertyByName() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(prop, deserializer.findProperty("testProp"));
        assertNull(deserializer.findProperty("nonExistentProp"));
    }
    
    @Test
    public void testFindPropertyByPropertyName() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(prop, deserializer.findProperty(PropertyName.construct("testProp")));
        assertNull(deserializer.findProperty(PropertyName.construct("nonExistentProp")));
    }

    // Mock JsonParser implementation for testing
    static abstract class MockJsonParser extends JsonParser {
        @Override public void close() throws IOException {}
        @Override public JsonToken nextToken() throws IOException { return JsonToken.NOT_AVAILABLE; }
        @Override public JsonParser skipChildren() throws IOException { return this; }
        @Override public String getText() throws IOException { return null; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0L; }
        @Override public double getDoubleValue() throws IOException { return 0.0; }
        @Override public Number getNumberValue() throws IOException { return 0; }
        @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override public boolean getBooleanValue() throws IOException { return false; }
        @Override public String getCurrentName() throws IOException { return null; }
        @Override public JsonToken getCurrentToken() { return JsonToken.NOT_AVAILABLE; }
        @Override public void setCodec(ObjectCodec oc) {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public boolean canParseAsync() { return false; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public boolean isClosed() { return false; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        // Specific implementations will override these
        // Also, need to provide basic implementations for other methods if called by tested code.
        @Override public int getText(StringBuilder sb) throws IOException { return 0; }
        @Override public boolean getBooleanValue(BooleanCodec ctxt) throws IOException { return false; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override public byte[] getBinaryValue(NullValueHandler vh) throws IOException { return new byte[0]; }
        @Override public Object getEmbeddedObject() throws IOException { return null; }
    }
    
    // Dummy class for property-based creator tests
    static class TestBean {
        public String name;
        public int age;
        public TestBean(String name, int age) { this.name = name; this.age = age; }
    }
}
```