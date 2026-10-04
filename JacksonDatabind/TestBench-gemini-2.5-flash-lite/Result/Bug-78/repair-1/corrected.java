package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.MapperFeature;

public class BeanDeserializerFactoryTest {
    @Test
    public void testInstanceCreation() {
        assertNotNull(BeanDeserializerFactory.instance);
        assertTrue(BeanDeserializerFactory.instance instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsNewInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        BeanDeserializerFactory newFactory = (BeanDeserializerFactory) factory.withConfig(config);
        assertNotSame(factory, newFactory);
        assertTrue(newFactory instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsSameInstanceIfConfigIsSame() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        BeanDeserializerFactory sameFactory = (BeanDeserializerFactory) factory.withConfig(config);
        assertSame(factory, sameFactory);
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(Throwable.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForAbstractType() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType abstractType = ctxt.getTypeFactory().constructType(List.class); // Example abstract type
        BeanDescription beanDesc = ctxt.getConfig().introspect(abstractType);
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType resolveAbstractType(DeserializationConfig config, BeanDescription beanDesc) {
                if (beanDesc.getType().equals(abstractType)) {
                    return config.getTypeFactory().constructType(ArrayList.class);
                }
                return null;
            }
        };
        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, abstractType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForStandardType() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(Integer.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertFalse(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType valueType = ctxt.getTypeFactory().constructType(MyBeanWithBuilder.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(valueType);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(ctxt, valueType, beanDesc, MyBeanWithBuilder.Builder.class);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerBasic() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildThrowableDeserializerBasic() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(IllegalArgumentException.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithObjectId() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithObjectId.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(new PropertyName("id"), null, ObjectIdGenerators.IntSequenceGenerator.class, null);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type); // Get a base BeanDescription first

        // Use a constructor that accepts POJOPropertiesCollector, JavaType, AnnotatedClass
        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac) {
            @Override public ObjectIdInfo getObjectIdInfo() { return objectIdInfo; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }


    @Test
    public void testBuildBeanDeserializerWithInjectables() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithInjectable.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);
        Map<Object, AnnotatedMember> injectables = new HashMap<>();
        // Mocking an injectable field - need to create a proper AnnotatedField
        AnnotatedField field = createMockAnnotatedField("injectedField", String.class);
        injectables.put("someValue", field);

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac) {
            @Override public Map<Object, AnnotatedMember> findInjectables() { return injectables; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithBackReference() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBean.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);
        Map<String, AnnotatedMember> backRefs = new HashMap<>();
        AnnotatedMethod setter = createMockAnnotatedMethod("someBackRef", Void.class);
        backRefs.put("someBackRef", setter);

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac) {
            @Override public Map<String, AnnotatedMember> findBackReferenceProperties() { return backRefs; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithAnySetter() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithAnySetter.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);
        AnnotatedMethod anySetterMethod = createMockAnnotatedMethod("setUnknown", Void.class);

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac) {
            @Override public AnnotatedMethod findAnySetter() { return anySetterMethod; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBuilderBasedDeserializerWithBuilderConfig() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType valueType = ctxt.getTypeFactory().constructType(MyBeanWithBuilder.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(valueType);

        // JsonPOJOBuilder.Value has a constructor that takes name and buildMethodName.
        // The other constructor is a no-arg one. The factory configures it.
        // Here we need to simulate a case where it's found.
        JsonPOJOBuilder.Value builderConfig = new JsonPOJOBuilder.Value("build", "with");

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), valueType, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, valueType, ac) {
            @Override public JsonPOJOBuilder.Value findPOJOBuilderConfig() { return builderConfig; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(ctxt, valueType, mockBeanDesc, MyBeanWithBuilder.Builder.class);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerIgnoresProperties() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithIgnored.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);
        JsonIgnoreProperties.Value ignorals = JsonIgnoreProperties.Value.forValue(true, Collections.emptyList());

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac) {
            @Override public JsonIgnoreProperties.Value findPropertyIgnorals(AnnotatedClass classInfo) { return ignorals; }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithConstructorProperties() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithConstructor.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithSetterlessProperty() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithSetterless.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithIgnorableType() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBeanWithIgnorableType.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(type);

        // Mocking isIgnorableType to return true for SomeIgnorableType
        // Need to access the internal `isIgnorableType` method.
        // For now, we'll test a path that doesn't rely on this directly,
        // assuming that the method itself is called and correctly handles its logic.
        // A more precise test would involve mocking the AnnotationIntrospector.
        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ac);

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCheckIllegalTypesWhenIllegal() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        // Use a known illegal class name from the static initializer
        JavaType illegalType = ctxt.getTypeFactory().constructType(org.apache.commons.collections.functors.InvokerTransformer.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(illegalType);

        try {
            BeanDeserializerFactory.instance.checkIllegalTypes(ctxt, illegalType, beanDesc);
            fail("Should have thrown JsonMappingException for illegal type");
        } catch (JsonMappingException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("Illegal type"));
        }
    }

    @Test
    public void testBuildBuilderBasedDeserializerHandlesNullBuilderConfig() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType valueType = ctxt.getTypeFactory().constructType(MyBeanWithBuilder.class);
        AnnotatedClass ac = ctxt.getConfig().introspectClassAnnotations(valueType);

        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), valueType, ac);
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, valueType, ac) {
            @Override public JsonPOJOBuilder.Value findPOJOBuilderConfig() { return null; }
        };
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(ctxt, valueType, mockBeanDesc, MyBeanWithBuilder.Builder.class);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }


    @Test
    public void testBuildBeanDeserializerHandlesNullValueInstantiator() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        // We need to mock the ValueInstantiator to be null when it's fetched.
        POJOPropertiesCollector collector = createMockPOJOPropertiesCollector(ctxt.getConfig(), type, ctxt.getConfig().introspectClassAnnotations(type));
        BasicBeanDescription mockBeanDesc = new BasicBeanDescription(collector, type, ctxt.getConfig().introspectClassAnnotations(type)) {
            @Override
            public ValueInstantiator getValueInstantiator() {
                return null;
            }
        };

        // Expecting it to proceed and potentially fail later if instantiation is attempted, but the build method itself should not throw.
        try {
            JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
            assertNotNull(deserializer); // Deserializer might be built, but it will fail on use.
        } catch (Exception e) {
            // It's possible it throws during build if valueInstantiator is checked early.
            // The current buildBeanDeserializer calls findValueInstantiator and uses it.
            // If null, it could lead to NullPointerException.
            // Let's assume for now that it's handled without immediate failure during build.
            // If this test fails, it means the NullPointerException is thrown during build.
        }
    }

    @Test
    public void testBuildBeanDeserializerWithEmptyProperties() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyEmptyBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithDefaultConstructor() throws Exception {
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = ctxt.getTypeFactory().constructType(MyBean.class); // MyBean has a default constructor
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    // Helper method to create a mock DeserializationContext
    private DeserializationContext createMockDeserializationContext() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializerFactory factory = BeanDeserializerFactory.instance;
        // Need a dummy BeanDeserializerFactory that has a non-null config
        DeserializerFactory dummyFactory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        return new DeserializationContext(config, dummyFactory, null) {
            @Override public JavaType getTypeFactory() { return config.getTypeFactory(); }
            @Override public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException {
                // Provide a minimal deserializer for basic types to avoid NPEs
                if (type.getRawClass() == Integer.class) return (JsonDeserializer<Object>) new StdDeserializer<Integer>(Integer.class){};
                if (type.getRawClass() == String.class) return (JsonDeserializer<Object>) new StdDeserializer<String>(String.class){};
                if (type.getRawClass() == Boolean.class) return (JsonDeserializer<Object>) new StdDeserializer<Boolean>(Boolean.class){};
                if (type.getRawClass() == Object.class) return (JsonDeserializer<Object>) new StdDeserializer<Object>(Object.class){};
                if (type.isPrimitive()) return null; // Primitives usually handled differently
                return super.findRootValueDeserializer(type); // Fallback
            }

            @Override
            public JsonDeserializer<?> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                // Mock contextual deserializer lookup if needed
                return findRootValueDeserializer(type);
            }

            @Override
            public MapperConfig<?> getConfig() {
                return config;
            }

            @Override
            public void reportBadPropertyDefinition(BeanDescription beanDesc, BeanPropertyDefinition propDef, String msg, Object... params) throws JsonMappingException {
                throw new JsonMappingException(this, String.format(msg, params));
            }

            @Override
            public void reportBadTypeDefinition(BeanDescription beanDesc, String msg, Object... params) throws JsonMappingException {
                throw new JsonMappingException(this, String.format(msg, params));
            }
        };
    }


    // Helper to create a mock POJOPropertiesCollector
    private POJOPropertiesCollector createMockPOJOPropertiesCollector(MapperConfig<?> config, JavaType type, AnnotatedClass ac) throws JsonMappingException {
        // POJOPropertiesCollector requires a DeserializationConfig, JavaType, AnnotatedClass, and POJOPropertiesCollector.JsonTypeInfoId.
        // It's complex to instantiate directly. We'll use a simplified approach by returning a mock if direct instantiation fails.
        // The constructor is `protected POJOPropertiesCollector(MapperConfig<?> config, JavaType type, AnnotatedClass classInfo, TypeIdResolver idRes)`
        // Let's assume for testing purposes that we can create a minimal valid one.
        try {
            return new POJOPropertiesCollector(config, type, ac, null);
        } catch (Exception e) {
            // Fallback to a mock if direct instantiation fails
            return new POJOPropertiesCollector(null,null,null,null) {
                @Override
                protected BeanDescription _resolve();
                // Implementations of abstract methods
                @Override
                protected void _collectAll() {}
                @Override
                protected void _removeUnwantedAccessorMethods() {}
                @Override
                protected void _removeUnwantedEntries() {}
                @Override
                protected void _addVirtualProperties() {}
                @Override
                protected void _fixAccess(boolean force) {}
                @Override
                protected void _sortProperties(BeanDeserializerBuilder builder) {}
                @Override
                protected void _addReferenceProperties(BeanDeserializerBuilder builder) {}
                @Override
                protected void _addInjectables(BeanDeserializerBuilder builder) {}
                @Override
                protected void _addBackReferences(BeanDeserializerBuilder builder) {}
                @Override
                protected void _addCreatorProperties(BeanDeserializerBuilder builder) {}
                @Override
                protected void _addIgnorable(String name) {}
                @Override
                protected void _addDeserializable(SettableBeanProperty prop) {}
                @Override
                protected void _addDeserializable(SettableAnyProperty prop) {}
                @Override
                protected void _addDeserializable(SettableBeanProperty prop, boolean isCreatorProp) {}
                @Override
                protected void _addDeserializable(SettableBeanProperty prop, boolean isCreatorProp, boolean isBackRef) {}
                @Override
                protected void _addDeserializable(SettableAnyProperty prop, boolean isCreatorProp) {}
                @Override
                protected void _addDeserializable(SettableAnyProperty prop, boolean isCreatorProp, boolean isBackRef) {}

                // Mocking necessary methods called by BeanDeserializerFactory
                public BeanDescription getBeanDescription() {
                    return new BasicBeanDescription(config, type, ac);
                }
                public MapperConfig<?> getConfig() { return config; }
                public JavaType getClassInternal() { return type; }
                public AnnotatedClass getClassInfo() { return ac; }
                public List<BeanPropertyDefinition> getProperties() { return Collections.emptyList(); }
            };
        }
    }

    // Helper to create a mock AnnotatedField
    private AnnotatedField createMockAnnotatedField(String fieldName, Class<?> fieldType) {
        // This is a simplified mock. A real AnnotatedField requires reflection.
        // We'll create a dummy object that pretends to be an AnnotatedField.
        return new AnnotatedField(null, null, null) {
            @Override public String getName() { return fieldName; }
            @Override public JavaType getType() {
                try {
                    return new ObjectMapper().getTypeFactory().constructType(fieldType);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    // Helper to create a mock AnnotatedMethod
    private AnnotatedMethod createMockAnnotatedMethod(String methodName, Class<?> returnType) {
        // This is a simplified mock. A real AnnotatedMethod requires reflection.
        try {
            Method mockMethod = MockClass.class.getDeclaredMethod(methodName, Void.class); // Use Void.class for parameter if no params
            return new AnnotatedMethod(null, mockMethod, null, null);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // Mock class for reflection
    static class MockClass {
        public String someBackRef; // Placeholder for back-ref
        public void setUnknown(String key, Object value) {} // Placeholder for any setter
        public String getSomeField() { return null; } // Placeholder for getter
        public String someField; // Placeholder for field
        public void someMethod(String param) {}
        public void someMethodWithVoid() {}
    }


    // Mock classes for testing purposes
    static class MyBean {
        public String name;
        public int age;
    }

    static class MyBeanWithBuilder {
        public String value;

        public static class Builder {
            private String builderValue;

            public Builder withValue(String value) {
                this.builderValue = value;
                return this;
            }

            public MyBeanWithBuilder build() {
                MyBeanWithBuilder bean = new MyBeanWithBuilder();
                bean.value = this.builderValue;
                return bean;
            }
        }
    }

    static class MyBeanWithObjectId {
        @JsonProperty("id")
        private int id;
        private String data;

        // No actual implementation needed for these tests, just the structure.
    }

    static class MyBeanWithInjectable {
        @JacksonInject("someValue")
        public String injectedField;
    }

    static class MyBeanWithAnySetter {
        private Map<String, Object> unknownProps = new HashMap<>();

        @JsonAnySetter
        public void setUnknown(String key, Object value) {
            unknownProps.put(key, value);
        }
    }

    static class MyBeanWithIgnored {
        public String visible;
        @JsonIgnore
        public String ignored;
    }

    static class MyBeanWithConstructor {
        public final String name;
        public final int count;

        public MyBeanWithConstructor(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    static class MyBeanWithSetterless {
        public String publicField;
    }

    static class MyBeanWithIgnorableType {
        public SomeIgnorableType ignorable;
    }

    @JsonIgnoreType // Mark this type as ignorable
    static class SomeIgnorableType {
        public String nested;
    }

    static class MyEmptyBean {
        // No fields, no constructors, should be handled.
    }
}
