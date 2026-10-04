package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
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
// Added imports for types used in dummy implementations
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.introspect.AnnotatedElement;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;

public class BeanDeserializerFactoryTest {

    // Dummy enum for testing
    private enum TestEnum { A, B }

    // Helper method to create a minimal DeserializationContext
    private DeserializationContext createDummyContext() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        // Need a valid DeserializerFactory instance, use the static one
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerCache cache = new DeserializerCache(factory);
        return new DeserializationContext(config, factory, cache) {
            @Override
            public Object findInjectableValue(Object key, BeanProperty forProperty, BeanDescription beanDesc, BeanIdResolver resolver) {
                return null; // Dummy implementation
            }

            @Override
            public ValueInstantiator findValueInstantiator(BeanDescription beanDesc) {
                // Provide a simple default ValueInstantiator if needed.
                // For many tests, null might be acceptable if that code path isn't critical.
                // If buildBeanDeserializer is called directly, a valid ValueInstantiator might be needed.
                // For this dummy context, we'll return null as it's hard to mock properly.
                // Tests that require a functional ValueInstantiator will need a more specific setup.
                // A basic ValueInstantiator for a default constructor
                if (beanDesc != null && beanDesc.getBeanClass() != null) {
                    return new ValueInstantiator.Base(beanDesc.getBeanClass());
                }
                return null;
            }

            @Override
            public JavaType resolveType(TypeBindings typeBindings, JavaType javaType, AnnotatedElement element, String fallbackPath) {
                 // This is a complex method, return original type for simplicity.
                 return javaType;
            }

            @Override
            public Object resolveUnionProperty(JavaType type, BeanProperty prop, String fallbackPath) {
                return null;
            }
        };
    }

    // Helper method to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription(JavaType type) {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        return config.introspect(type);
    }

    @Test
    public void testInstanceCreation() throws Exception {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        assertNotNull(factory);
        assertSame(BeanDeserializerFactory.instance, factory);
    }

    @Test
    public void testWithConfigReturnsNewInstanceWhenDifferent() throws Exception {
        DeserializerFactoryConfig config1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig config2 = new DeserializerFactoryConfig().withAdditionalDeserializers(new Deserializers() {
            @Override public JsonDeserializer<?> findArrayDeserializer(ArrayType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer typeDeserializer, JsonDeserializer<?> elementDeser) { return null; }
            @Override public JsonDeserializer<?> findCollectionDeserializer(CollectionType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer typeDeserializer, JsonDeserializer<?> elementDeser) { return null; }
            @Override public JsonDeserializer<?> findCollectionLikeDeserializer(CollectionLikeType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer typeDeserializer, JsonDeserializer<?> elementDeser) { return null; }
            @Override public JsonDeserializer<?> findMapDeserializer(MapType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer typeDeserializer, KeyDeserializer keyDeser, JsonDeserializer<?> elementDeser) { return null; }
            @Override public JsonDeserializer<?> findMapLikeDeserializer(MapLikeType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer typeDeserializer, KeyDeserializer keyDeser, JsonDeserializer<?> elementDeser) { return null; }
            @Override public JsonDeserializer<?> findTreeNodeDeserializer(Class<? extends JsonNode> type, DeserializationConfig config, BeanDescription beanDesc) { return null; }
            @Override public JsonDeserializer<?> findBooleanDeserializer(String logicalName, DeserializationConfig config, BeanDescription beanDesc) { return null; }
            @Override public JsonDeserializer<?> findIntegerDeserializer(String logicalName, DeserializationConfig config, BeanDescription beanDesc) { return null; }
            @Override public JsonDeserializer<?> findDoubleDeserializer(String logicalName, DeserializationConfig config, BeanDescription beanDesc) { return null; }
            @Override public JsonDeserializer<?> findStringDeserializer(String logicalName, DeserializationConfig config, BeanDescription beanDesc) { return null; }
            // KeyDeserializer is also part of Deserializers interface for some Jackson versions,
            // but not directly in the provided API outline. The error was about `Deserializers`.
        });
        BeanDeserializerFactory factory1 = new BeanDeserializerFactory(config1);
        BeanDeserializerFactory factory2 = (BeanDeserializerFactory) factory1.withConfig(config2);
        assertNotSame(factory1, factory2);
    }

    @Test
    public void testWithConfigReturnsSameInstanceWhenSame() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        BeanDeserializerFactory factory2 = (BeanDeserializerFactory) factory.withConfig(config);
        assertSame(factory, factory2);
    }

    @Test
    public void testCreateBeanDeserializerForSimpleType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);

        // Use a DeserializationContext that has a valid config and factory.
        DeserializationContext mockCtxt = createDummyContext();
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(mockCtxt, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test
    public void testCreateBeanDeserializerForThrowableType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(RuntimeException.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        DeserializationContext mockCtxt = createDummyContext();

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(mockCtxt, type, beanDesc);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerForSimpleBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        DeserializationContext ctxt = createDummyContext(); // Use a functional context

        // buildBeanDeserializer requires a functional ValueInstantiator, which createDummyContext provides.
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildThrowableDeserializerForException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Exception.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        DeserializationContext ctxt = createDummyContext();

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    // --- Dummy classes for testing ---
    private static class SimpleBean {
        public String name;
        public int age;
        public SimpleBean() {}
        public SimpleBean(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    private static class ComplexBean {
        public Map<String, Integer> mapField;
        private List<SimpleBean> listField;
        public ComplexBean() {}
        public Map<String, Integer> getMapField() { return mapField; }
        public void setMapField(Map<String, Integer> mapField) { this.mapField = mapField; }
        public List<SimpleBean> getListField() { return listField; }
        public void setListField(List<SimpleBean> listField) { this.listField = listField; }
    }

    private static class BeanWithIgnored {
        public String visible;
        @JsonIgnore public String ignored;
    }

    private static class BeanWithPOJOBuilder {
        public String field1;
        public int field2;
        @JsonPOJOBuilder(buildMethodName = "buildMyBean")
        public static class Builder {
            private String field1;
            private int field2;
            public Builder field1(String value) { this.field1 = value; return this; }
            public Builder field2(int value) { this.field2 = value; return this; }
            // Simplified build method return type to match the context
            public Object buildMyBean() { return new Object(); }
        }
    }

    private static class BeanWithAnySetter {
        private Map<String, Object> unknownProperties = new HashMap<>();
        @JsonAnySetter
        public void setUnknown(String key, Object value) { unknownProperties.put(key, value); }
        public Map<String, Object> getUnknownProperties() { return unknownProperties; }
    }

    // --- Tests for helper methods ---

    @Test
    public void testAddBeanProps_HandlesIgnoredProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithIgnored.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(BeanWithIgnored.class)); // Dummy instantiation

        BeanDeserializerFactory.instance.addBeanProps(ctxt, beanDesc, builder);

        assertTrue(builder.getIgnorableProps().contains("ignored"));
        assertFalse(builder.getIgnorableProps().contains("visible"));
    }

    @Test
    public void testAddBeanProps_HandlesAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithAnySetter.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(BeanWithAnySetter.class));

        BeanDeserializerFactory.instance.addBeanProps(ctxt, beanDesc, builder);

        assertNotNull(builder.getAnySetter());
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType valueType = mapper.getTypeFactory().constructType(ComplexBean.class);
        JavaType builderType = mapper.getTypeFactory().constructType(BeanWithPOJOBuilder.Builder.class);
        BeanDescription builderDesc = mapper.getDeserializationConfig().introspectForBuilder(builderType);
        DeserializationContext ctxt = createDummyContext();

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(ctxt, valueType, builderDesc, BeanWithPOJOBuilder.Builder.class);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testConstructSettableProperty_MethodProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(SimpleBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        List<BeanPropertyDefinition> properties = beanDesc.findProperties();
        BeanPropertyDefinition namePropDef = properties.stream()
                .filter(p -> p.getName().equals("name"))
                .findFirst()
                .orElse(null);
        assertNotNull("Property definition for 'name' not found", namePropDef);

        JavaType propType = mapper.getTypeFactory().constructType(String.class);
        SettableBeanProperty methodProp = BeanDeserializerFactory.instance.constructSettableProperty(ctxt, beanDesc, namePropDef, propType);

        assertNotNull(methodProp);
        assertTrue(methodProp instanceof MethodProperty);
        assertEquals("name", methodProp.getName());
    }

    @Test
    public void testConstructSettableProperty_FieldProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(SimpleBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        // Find a property that is defined by a field.
        // In SimpleBean, 'name' and 'age' are public fields.
        List<BeanPropertyDefinition> properties = beanDesc.findProperties();
        BeanPropertyDefinition agePropDef = properties.stream()
                .filter(p -> p.getName().equals("age"))
                .findFirst()
                .orElse(null);
        assertNotNull("Property definition for 'age' not found", agePropDef);

        JavaType propType = mapper.getTypeFactory().constructType(int.class);
        // Ensure the property definition is indeed linked to a field.
        // The `constructSettableProperty` will pick the correct mutator (setter or field).
        SettableBeanProperty fieldProp = BeanDeserializerFactory.instance.constructSettableProperty(ctxt, beanDesc, agePropDef, propType);

        assertNotNull(fieldProp);
        // The implementation of `constructSettableProperty` may use a FieldProperty if a setter is not preferred.
        // For public fields, it generally uses FieldProperty.
        assertTrue(fieldProp instanceof FieldProperty);
        assertEquals("age", fieldProp.getName());
    }

    @Test
    public void testConstructSetterlessProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(ComplexBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        List<BeanPropertyDefinition> properties = beanDesc.findProperties();
        BeanPropertyDefinition listFieldPropDef = properties.stream()
                .filter(p -> p.getName().equals("listField"))
                .findFirst()
                .orElse(null);
        assertNotNull("Property definition for 'listField' not found", listFieldPropDef);

        SettableBeanProperty setterlessProp = BeanDeserializerFactory.instance.constructSetterlessProperty(ctxt, beanDesc, listFieldPropDef);

        assertNotNull(setterlessProp);
        assertTrue(setterlessProp instanceof SetterlessProperty);
        assertEquals("listField", setterlessProp.getName());
    }

    @Test
    public void testConstructAnySetter_Method() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithAnySetter.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        AnnotatedMember anySetterMember = beanDesc.findAnySetter();
        assertNotNull(anySetterMember);

        SettableAnyProperty anySetter = BeanDeserializerFactory.instance.constructAnySetter(ctxt, beanDesc, anySetterMember);

        assertNotNull(anySetter);
        assertEquals(Object.class, anySetter.getPropertyType().getRawClass());
    }

    @Test
    public void testConstructAnySetter_Field() throws Exception {
        class BeanWithAnySetterField {
            @JsonAnySetter
            public Map<String, Object> properties;
        }

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithAnySetterField.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        AnnotatedMember anySetterMember = beanDesc.findAnySetterField();
        assertNotNull(anySetterMember);

        SettableAnyProperty anySetter = BeanDeserializerFactory.instance.constructAnySetter(ctxt, beanDesc, anySetterMember);

        assertNotNull(anySetter);
        assertEquals(Object.class, anySetter.getPropertyType().getRawClass());
    }

    @Test
    public void testIsPotentialBeanType_Valid() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(SimpleBean.class));
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(Object.class));
    }

    @Test
    public void testIsPotentialBeanType_Primitive() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
            fail("Should throw IllegalArgumentException for primitive types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class int"));
        }
    }

    @Test
    public void testIsPotentialBeanType_Array() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(String[].class);
            fail("Should throw IllegalArgumentException for array types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class [Ljava.lang.String"));
        }
    }

    @Test
    public void testIsPotentialBeanType_Enum() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(TestEnum.class); // Use the top-level dummy enum
            fail("Should throw IllegalArgumentException for enum types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class .*TestEnum")); // Using regex for flexibility
        }
    }

    @Test
    public void testIsPotentialBeanType_ProxyOrInterface() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(List.class);
            fail("Should throw IllegalArgumentException for interface types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class java.util.List"));
        }
    }

    @Test
    public void testFilterBeanProps_IgnoresExplicitly() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithIgnored.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        List<BeanPropertyDefinition> propDefsIn = beanDesc.findProperties();
        Set<String> ignored = new HashSet<>();
        ignored.add("ignored"); // Explicitly ignored

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(BeanWithIgnored.class));

        List<BeanPropertyDefinition> filteredProps = BeanDeserializerFactory.instance.filterBeanProps(ctxt, beanDesc, builder, propDefsIn, ignored);

        assertEquals(1, filteredProps.size());
        assertEquals("visible", filteredProps.get(0).getName());
        assertTrue(builder.getIgnorableProps().contains("ignored"));
    }

    @Test
    public void testFilterBeanProps_IgnoresByIgnorableType() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();

        class BeanWithIgnorableType {
            public IgnorableType value;
        }
        @JsonIgnoreType
        class IgnorableType {}

        JavaType type = config.introspectClassAnnotations(BeanWithIgnorableType.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        List<BeanPropertyDefinition> propDefsIn = beanDesc.findProperties();
        Set<String> ignored = Collections.emptySet();

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(BeanWithIgnorableType.class));

        List<BeanPropertyDefinition> filteredProps = BeanDeserializerFactory.instance.filterBeanProps(ctxt, beanDesc, builder, propDefsIn, ignored);

        assertEquals(0, filteredProps.size());
        assertTrue(builder.getIgnorableProps().contains("value"));
    }

    @Test
    public void testAddBeanProps_IgnoresUnknownPropertiesDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(SimpleBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(SimpleBean.class));

        BeanDeserializerFactory.instance.addBeanProps(ctxt, beanDesc, builder);

        assertFalse(builder.isIgnoreUnknownProperties());
    }

    @Test
    public void testAddBeanProps_IgnoresUnknownPropertiesConfigured() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        config = config.with(MapperFeature.IGNORE_UNKNOWN_PROPERTIES); // Enable ignoring unknown properties

        JavaType type = config.introspectClassAnnotations(SimpleBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        // Need a DeserializationContext with the modified config.
        DeserializationContext ctxt = new DeserializationContext(config, BeanDeserializerFactory.instance, new DeserializerCache(BeanDeserializerFactory.instance)) {
            @Override public Object findInjectableValue(Object key, BeanProperty forProperty, BeanDescription beanDesc, BeanIdResolver resolver) { return null; }
            @Override public ValueInstantiator findValueInstantiator(BeanDescription beanDesc) { return new ValueInstantiator.Base(SimpleBean.class); } // Provide a basic instantiator
            @Override public JavaType resolveType(TypeBindings typeBindings, JavaType javaType, AnnotatedElement element, String fallbackPath) { return javaType; }
            @Override public Object resolveUnionProperty(JavaType type, BeanProperty prop, String fallbackPath) { return null; }
        };

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(SimpleBean.class));

        BeanDeserializerFactory.instance.addBeanProps(ctxt, beanDesc, builder);

        assertTrue(builder.isIgnoreUnknownProperties());
    }

    @Test
    public void testAddBeanProps_WithDefaultPropertyIgnorals() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();

        ConfigOverride override = new ConfigOverride(SimpleBean.class);
        override.setIgnoredProperties(JsonIgnoreProperties.Value.forIgnored("age"));
        config = config.with(override);

        JavaType type = config.introspectClassAnnotations(SimpleBean.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = new DeserializationContext(config, BeanDeserializerFactory.instance, new DeserializerCache(BeanDeserializerFactory.instance)) {
            @Override public Object findInjectableValue(Object key, BeanProperty forProperty, BeanDescription beanDesc, BeanIdResolver resolver) { return null; }
            @Override public ValueInstantiator findValueInstantiator(BeanDescription beanDesc) { return new ValueInstantiator.Base(SimpleBean.class); } // Provide a basic instantiator
            @Override public JavaType resolveType(TypeBindings typeBindings, JavaType javaType, AnnotatedElement element, String fallbackPath) { return javaType; }
            @Override public Object resolveUnionProperty(JavaType type, BeanProperty prop, String fallbackPath) { return null; }
        };

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(SimpleBean.class));

        BeanDeserializerFactory.instance.addBeanProps(ctxt, beanDesc, builder);

        assertTrue(builder.getIgnorableProps().contains("age"));
    }

    @Test
    public void testAddInjectables() throws Exception {
        class BeanWithInject {
            @JacksonInject("someValue")
            public String injectedField;
        }

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.introspectClassAnnotations(BeanWithInject.class).getType();
        BeanDescription beanDesc = config.introspect(type);
        DeserializationContext ctxt = createDummyContext();

        BeanDeserializerBuilder builder = new BeanDeserializerFactory(new DeserializerFactoryConfig()).constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator.Base(BeanWithInject.class));

        BeanDeserializerFactory.instance.addInjectables(ctxt, beanDesc, builder);

        assertNotNull(builder.getInjectables());
        assertEquals(1, builder.getInjectables().size());
    }

    @Test
    public void testBuildBeanDeserializer_HandlesPrimitiveType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(int.class); // Primitive type
        BeanDescription beanDesc = createDummyBeanDescription(type);
        DeserializationContext ctxt = createDummyContext();

        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
            fail("Should throw IllegalArgumentException for primitive types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class int"));
        }
    }

    @Test
    public void testBuildBeanDeserializer_HandlesEnumType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(TestEnum.class); // Use the top-level dummy enum
        BeanDescription beanDesc = createDummyBeanDescription(type);
        DeserializationContext ctxt = createDummyContext();

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        // For enums, it should not be a BeanDeserializer. It would be an EnumDeserializer.
        assertFalse(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializer_HandlesCollectionType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(List.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        DeserializationContext ctxt = createDummyContext();

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        // For collection types, it should not be a BeanDeserializer.
        assertFalse(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCheckIllegalTypes_WhenLegal() throws Exception {
        // Test with a known legal type (String.class)
        ObjectMapper mapper = new ObjectMapper();
        JavaType legalType = mapper.getTypeFactory().constructType(String.class);
        BeanDescription legalBeanDesc = createDummyBeanDescription(legalType);
        DeserializationContext ctxt = createDummyContext();

        try {
            BeanDeserializerFactory.instance.checkIllegalTypes(ctxt, legalType, legalBeanDesc);
            // Should not throw for legal types.
        } catch (JsonMappingException e) {
            fail("checkIllegalTypes should not throw for String.class: " + e.getMessage());
        }
    }

    @Test
    public void testBuildBeanDeserializer_NoCreatorArguments() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class); // Has default constructor
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        DeserializationContext ctxt = createDummyContext(); // Provides a ValueInstantiator

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializer_WithCreatorArguments() throws Exception {
        class BeanWithConstructor {
            public final String name;
            public final int age;
            public BeanWithConstructor(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(BeanWithConstructor.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        DeserializationContext ctxt = createDummyContext(); // Provides a ValueInstantiator

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof BeanDeserializer);
    }
}
