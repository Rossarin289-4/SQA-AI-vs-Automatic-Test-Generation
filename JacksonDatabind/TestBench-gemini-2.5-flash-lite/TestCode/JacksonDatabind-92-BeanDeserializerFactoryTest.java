package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer; // Corrected import
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.util.TokenBuffer;


public class BeanDeserializerFactoryTest {

    // Helper to create a dummy DeserializationContext

    // Helper to create a dummy BeanDescription

    // Helper to create a dummy DeserializerFactoryConfig
    private DeserializerFactoryConfig createDummyConfig() {
        return new DeserializerFactoryConfig();
    }

    @Test
    public void testInstanceIsNotNull() throws Exception {
        assertNotNull("Instance should not be null", BeanDeserializerFactory.instance);
    }

    @Test
    public void testInstanceWithConfigIsNotNull() throws Exception {
        // The `withConfig` method returns a new instance of the factory.
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = BeanDeserializerFactory.instance.withConfig(config);
        assertNotNull("Instance with config should not be null", newFactory);
        // Ensure it's still a BeanDeserializerFactory or a subclass if overridden.
        assertTrue("The returned factory should be a BeanDeserializerFactory", newFactory instanceof BeanDeserializerFactory);
    }





















    @Test
    public void testCheckIllegalTypesWhenLegal() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        // This should not throw any exception as String is not in the default illegal list.
        BeanDeserializerFactory.instance.checkIllegalTypes(ctxt, type, beanDesc);
    }

    @Test
    public void testBuildBeanDeserializerForAbstractTypeThatCannotBeMaterialized() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.Collection.class); // Abstract and not easily materializable to a default concrete type without resolvers
        BeanDescription beanDesc = createDummyBeanDescription(type);
        
        // Call buildBeanDeserializer. It should not throw an exception if it can handle abstract types,
        // possibly by returning a null deserializer or a default one if no concrete type is found.
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        
        // The method `buildBeanDeserializer` itself should not throw. It might return null if it cannot build a deserializer.
        // The current logic in `createBeanDeserializer` checks for abstract types, materializes, and then calls `buildBeanDeserializer`.
        // If `materializeAbstractType` returns null, and `findStdDeserializer` doesn't find one, it proceeds to `isPotentialBeanType` and `buildBeanDeserializer`.
        // For `Collection.class`, `isPotentialBeanType` should pass, leading to `buildBeanDeserializer`.
        // If it returns null, that's a valid outcome. If it returns a deserializer, that's also fine.
        // The assertion here is just to ensure no exception is thrown.
        assertNotNull("Deserializer construction for abstract Collection should not fail", deserializer);
    }

    @Test
    public void testConstructSettablePropertyForMethod() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType beanType = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        DeserializerFactoryConfig config = createDummyConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        AnnotatedMethod setterMethod = null;
        try {
            setterMethod = new AnnotatedMethod(
                    null,
                    BeanExample.class.getMethod("setFieldA", String.class),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find setFieldA method: " + e.getMessage());
        }
        // SimpleBeanPropertyDefinition requires config, member, name
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), setterMethod, PropertyName.construct("fieldA"));
        JavaType propType = ctxt.constructType(String.class); // Type of the setter parameter

        SettableBeanProperty prop = factory.constructSettableProperty(ctxt, beanDesc, propDef, propType);
        assertNotNull("SettableBeanProperty should be constructed for method", prop);
        assertTrue("Property should be a MethodProperty", prop instanceof MethodProperty);
    }

    @Test
    public void testConstructSettablePropertyForField() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType beanType = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        DeserializerFactoryConfig config = createDummyConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        AnnotatedField field = null;
        try {
            field = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldB"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field fieldB: " + e.getMessage());
        }
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), field, PropertyName.construct("fieldB"));
        JavaType propType = ctxt.constructType(Integer.class); // Type of the field

        SettableBeanProperty prop = factory.constructSettableProperty(ctxt, beanDesc, propDef, propType);
        assertNotNull("SettableBeanProperty should be constructed for field", prop);
        assertTrue("Property should be a FieldProperty", prop instanceof FieldProperty);
    }

    @Test
    public void testConstructSetterlessProperty() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType beanType = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        DeserializerFactoryConfig config = createDummyConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        AnnotatedMethod getterMethod = null;
        try {
            getterMethod = new AnnotatedMethod(
                    null,
                    BeanExample.class.getMethod("getFieldA"),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find getFieldA method: " + e.getMessage());
        }
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), getterMethod, PropertyName.construct("fieldA"));
        // JavaType propType = ctxt.constructType(String.class); // Type inferred from getter

        SettableBeanProperty prop = factory.constructSetterlessProperty(ctxt, beanDesc, propDef);
        assertNotNull("SetterlessProperty should be constructed", prop);
        assertTrue("Property should be a SetterlessProperty", prop instanceof SetterlessProperty);
    }

    @Test
    public void testConstructAnySetter() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType beanType = ctxt.constructType(BeanWithAnySetter.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        DeserializerFactoryConfig config = createDummyConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        AnnotatedMethod setterMethod = null;
        try {
            // The method signature is (String propertyName, Object value)
            setterMethod = new AnnotatedMethod(
                    null,
                    BeanWithAnySetter.class.getMethod("setAny", String.class, Object.class),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find setAny method: " + e.getMessage());
        }
        SettableAnyProperty anySetter = factory.constructAnySetter(ctxt, beanDesc, setterMethod);
        assertNotNull("SettableAnyProperty should be constructed", anySetter);
    }

    @Test
    public void testBuildAbstractDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.Collection.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        
        // We need to mock BeanDeserializerBuilder to return AbstractDeserializer when buildAbstract() is called.
        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override
            protected BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext ctxt, BeanDescription beanDesc) {
                // Return a custom builder that overrides buildAbstract
                return new BeanDeserializerBuilder(beanDesc, ctxt.getConfig()) {
                    @Override
                    public AbstractDeserializer buildAbstract() {
                        // Return a simple mock of AbstractDeserializer
                        // AbstractDeserializer constructor takes a JavaType.
                        return new AbstractDeserializer(type) {
                            // AbstractDeserializer is abstract, so we need to implement its abstract methods.
                            // However, for testing purposes, we can often get away with a minimal implementation
                            // if these methods are not called by the tested code path.
                            @Override
                            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                                return null; // Mock implementation
                            }
                            // Might need to override other abstract methods if they are called.
                        };
                    }
                    // Ensure other methods don't cause issues, e.g., build()
                    @Override
                    public JsonDeserializer<?> build() {
                        // This path is not taken if buildAbstract is called first.
                        return null;
                    }
                };
            }
            // Need to ensure ValueInstantiator is available for the builder.
            @Override
            protected ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) {
                 // Provide a dummy ValueInstantiator if required by the builder.
                 return new ValueInstantiator(ctxt.getConfig(), beanDesc) {
                     @Override public boolean canCreateFromObjectWith() { return false; }
                     @Override public boolean canCreateUsingDefault() { return false; }
                     // Provide minimal implementations for other abstract methods.
                     @Override public boolean canInstantiate() { return false; }
                     @Override public boolean canCreateUsingDelegate() { return false; }
                     @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) { return null; }
                     @Override public Object createUsingDefault(DeserializationContext ctxt) { return null; }
                     @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) { return null; }
                     @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return null; }
                 };
            }
        };

        // Call buildBeanDeserializer which internally calls buildAbstract if type is abstract and cannot instantiate.
        JsonDeserializer<Object> deserializer = factory.buildBeanDeserializer(ctxt, type, beanDesc);
        assertTrue("Should return an AbstractDeserializer", deserializer instanceof AbstractDeserializer);
    }

    // Helper to create a dummy DeserializationContext with a specific config
    private DeserializationContext createDummyContextWithConfig(DeserializationConfig config) throws Exception {
        DeserializerFactory factory = BeanDeserializerFactory.instance;
        JsonParser mockParser = null;
        InjectableValues mockInjectables = null;

        return new DeserializationContext(factory, config) {
            @Override public JsonParser getParser() { return mockParser; }
            @Override public InjectableValues getInjectableValues() { return mockInjectables; }
            @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
            @Override
            public BeanDescription introspectForBuilder(JavaType builderType) throws JsonMappingException {
                POJOPropertiesCollector collector = new POJOPropertiesCollector(null, null, builderType, null, null, null);
                return BasicBeanDescription.forDeserialization(collector, builderType, null, null, null);
            }
            @Override
            public JavaType constructType(Class<?> cls) { return getTypeFactory().constructType(cls); }
            @Override
            public ObjectIdResolver objectIdResolverInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                return new ObjectIdReader.DefaultObjectIdResolver();
            }
            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                if (info.getGeneratorType() == ObjectIdGenerators.PropertyGenerator.class) {
                    return new PropertyBasedObjectIdGenerator(info.getScope());
                }
                return info.newGeneratorInstance(info.getScope());
            }
            @Override
            public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException {
                if (type.getRawClass() == String.class) return new StringDeserializer();
                return null;
            }
            @Override
            public KeyDeserializer keyDeserializerInstance(Annotated annotated, ObjectKeyInstantiator inst) throws JsonMappingException {
                return null;
            }
        };
    }


    // --- Dummy classes for testing ---

    public static class BeanExample {
        public String fieldA;
        public Integer fieldB;

        public String getFieldA() { return fieldA; }
        public void setFieldA(String value) { this.fieldA = value; }
    }

    public static class BeanWithObjectId {
        public int id;
        private BeanWithObjectId otherBean; // Example of a self-reference

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public void setOtherBean(BeanWithObjectId otherBean) { this.otherBean = otherBean; }
    }

    public static class BeanWithInjectable {
        @com.fasterxml.jackson.annotation.JacksonInject
        public Object injectableField;
    }

    public static class BeanWithReference {
        private BeanWithReference otherBean;

        // This setter is for a back-reference property
        public void setOtherBean(BeanWithReference otherBean) { this.otherBean = otherBean; }
    }

    public static class BuiltBean {
        private String name;
        // Constructor for the value object
        public BuiltBean(String name) { this.name = name; }
        
        // Builder class
        public static class Builder {
            private String name;
            public Builder withName(String name) { this.name = name; return this; }
            public BuiltBean build() { return new BuiltBean(name); }
        }
    }

    public static class BeanWithAnySetter {
        private Map<String, Object> properties = new HashMap<>();

        @com.fasterxml.jackson.annotation.JsonAnySetter
        public void setAny(String propertyName, Object value) {
            properties.put(propertyName, value);
        }
    }
}





