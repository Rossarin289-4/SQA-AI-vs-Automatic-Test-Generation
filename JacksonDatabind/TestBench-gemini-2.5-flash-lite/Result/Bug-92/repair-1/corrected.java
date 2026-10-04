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
import com.fasterxml.jackson.databind.deser.std.IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.FieldProperty;
import com.fasterxml.jackson.databind.introspect.MethodProperty;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.SetterlessProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;


public class BeanDeserializerFactoryTest {

    // Helper to create a dummy DeserializationContext
    private DeserializationContext createDummyContext() {
        MapperConfig<?> config = new DeserializationConfig(TypeFactory.defaultInstance(), null, null);
        return new DeserializationContext(null, config, null) {
            @Override
            public DeserializerFactory getFactory() {
                return BeanDeserializerFactory.instance;
            }

            @Override
            public JavaType constructType(Class<?> cls) {
                return TypeFactory.defaultInstance().constructType(cls);
            }

            @Override
            public BeanDescription introspectForBuilder(JavaType builderType) throws JsonMappingException {
                // Basic implementation for testing
                return BasicBeanDescription.forDeserialization(null, builderType, null, null, null);
            }

            @Override
            public JavaType getTypeFactory() {
                return TypeFactory.defaultInstance();
            }

            @Override
            public ObjectIdResolver objectIdResolverInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                return new ObjectIdReader.DefaultObjectIdResolver();
            }

            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                // For PropertyGenerator, needs BeanDescription
                if (info.getGeneratorType() == ObjectIdGenerators.PropertyGenerator.class) {
                    return new PropertyBasedObjectIdGenerator(info.getScope());
                }
                return info.newGeneratorInstance(info.getScope());
            }
            
            @Override
            public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException {
                // Mock a simple deserializer for common types
                if (type.getRawClass() == String.class) return new StringDeserializer();
                if (type.getRawClass() == Integer.class) return new IntegerDeserializer();
                return null;
            }
        };
    }

    // Helper to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription(JavaType type) {
        return BasicBeanDescription.forDeserialization(null, type, null, null, null);
    }

    // Helper to create a dummy DeserializerFactoryConfig
    private DeserializerFactoryConfig createDummyConfig() {
        return new DeserializerFactoryConfig();
    }

    @Test
    public void testInstanceIsNotNull() throws Exception {
        assertNotNull("Instance should not be null", BeanDeserializerFactory.instance);
    }

    @Test
    public void testInstanceHasDefaultConfig() throws Exception {
        DeserializerFactoryConfig config = BeanDeserializerFactory.instance.withConfig(createDummyConfig());
        assertNotNull("Instance with default config should not be null", config);
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(Throwable.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertTrue("Deserializer for Throwable should be a ThrowableDeserializer", deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForAbstractType() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.List.class); // Abstract type
        BeanDescription beanDesc = createDummyBeanDescription(type);

        // Mock AbstractTypeResolver to return a concrete type
        DeserializerFactoryConfig configWithResolver = new DeserializerFactoryConfig()
                .withAbstractTypeResolver(new AbstractTypeResolver() {
                    @Override
                    public JavaType resolveAbstractType(DeserializationConfig config, BeanDescription typeDesc) {
                        if (typeDesc.getType().getRawClass() == java.util.List.class) {
                            return ctxt.constructType(java.util.ArrayList.class);
                        }
                        return null;
                    }
                });
        BeanDeserializerFactory factoryWithResolver = new BeanDeserializerFactory(configWithResolver);

        JsonDeserializer<Object> deserializer = factoryWithResolver.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Deserializer for abstract List should be created", deserializer);
    }

    @Test
    public void testCreateBeanDeserializerForStandardType() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Deserializer for String should be created", deserializer);
        assertTrue("Deserializer for String should be StringDeserializer", deserializer instanceof StringDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForPotentialBeanType() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(Object.class); // A general object type, can be a bean
        BeanDescription beanDesc = createDummyBeanDescription(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Deserializer for Object should be created (fallback to bean deserializer)", deserializer);
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType valueType = ctxt.constructType(BuiltBean.class); // Dummy value type
        JavaType builderType = ctxt.constructType(BuiltBean.Builder.class); // Dummy builder type
        BeanDescription builderDesc = createDummyBeanDescription(builderType);

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(ctxt, valueType, builderDesc, BuiltBean.Builder.class);
        assertNotNull("Builder-based deserializer should be created", deserializer);
    }

    @Test
    public void testBuildBeanDeserializerForSimpleBean() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Bean deserializer for BeanExample should be created", deserializer);
    }

    @Test
    public void testBuildBeanDeserializerForAbstractTypeWithMaterialization() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.Map.class); // Abstract type
        BeanDescription beanDesc = createDummyBeanDescription(type);

        DeserializerFactoryConfig configWithResolver = new DeserializerFactoryConfig()
                .withAbstractTypeResolver(new AbstractTypeResolver() {
                    @Override
                    public JavaType resolveAbstractType(DeserializationConfig config, BeanDescription typeDesc) {
                        if (typeDesc.getType().getRawClass() == java.util.Map.class) {
                            return ctxt.constructType(java.util.HashMap.class);
                        }
                        return null;
                    }
                });
        BeanDeserializerFactory factoryWithResolver = new BeanDeserializerFactory(configWithResolver);

        JsonDeserializer<Object> deserializer = factoryWithResolver.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Bean deserializer for abstract Map should be created after materialization", deserializer);
    }

    @Test
    public void testBuildBeanDeserializerForThrowableWithInitCause() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(Exception.class); // Subclass of Throwable
        BeanDescription beanDesc = createDummyBeanDescription(type);

        AnnotatedMethod initCauseMethod = new AnnotatedMethod(
                null,
                Exception.class.getMethod("initCause", Throwable.class),
                null, null);

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
                if ("initCause".equals(name) && paramTypes.length == 1 && paramTypes[0] == Throwable.class) {
                    return initCauseMethod;
                }
                return super.findMethod(name, paramTypes);
            }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertTrue("Deserializer for Exception should be built", deserializer != null);
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(RuntimeException.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);

        AnnotatedMethod initCauseMethod = new AnnotatedMethod(
                null,
                RuntimeException.class.getMethod("initCause", Throwable.class),
                null, null);
        
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
                if ("initCause".equals(name) && paramTypes.length == 1 && paramTypes[0] == Throwable.class) {
                    return initCauseMethod;
                }
                return super.findMethod(name, paramTypes);
            }
            
            @Override
            public List<BeanPropertyDefinition> findProperties() {
                return Collections.emptyList();
            }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildThrowableDeserializer(ctxt, type, mockBeanDesc);
        assertTrue("Throwable deserializer should be constructed", deserializer != null);
        assertTrue("Throwable deserializer should be of type ThrowableDeserializer", deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testConstructBeanDeserializerBuilder() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);
        assertNotNull("BeanDeserializerBuilder should be constructed", builder);
        assertEquals("Builder should be for the correct bean description", beanDesc, builder._beanDesc);
    }

    @Test
    public void testAddBeanProps() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        AnnotatedField fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
        SimpleBeanPropertyDefinition propDefA = SimpleBeanPropertyDefinition.construct(
            ctxt.getConfig(), fieldA, PropertyName.construct("fieldA"));

        List<BeanPropertyDefinition> propDefs = Collections.singletonList(propDefA);

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public List<BeanPropertyDefinition> findProperties() {
                return propDefs;
            }
        };

        // This test is tricky because addBeanProps populates the builder, which then builds the deserializer.
        // We can test if the builder is modified.
        BeanDeserializerFactory.instance.addBeanProps(ctxt, mockBeanDesc, builder);
        assertTrue("Builder should contain settable properties after addBeanProps", builder.getProperties().hasNext());
    }

    @Test
    public void testAddObjectIdReaderWhenPresent() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanWithObjectId.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        ObjectIdInfo objectIdInfo = new ObjectIdInfo(
                PropertyName.construct("id"),
                type,
                ObjectIdGenerators.PropertyGenerator.class,
                null);
        
        AnnotatedField idField = new AnnotatedField(null, BeanWithObjectId.class.getDeclaredField("id"), null, null);
        SimpleBeanPropertyDefinition idPropDef = SimpleBeanPropertyDefinition.construct(ctxt.getConfig(), idField, PropertyName.construct("id"));
        SettableBeanProperty idProp = new FieldProperty(idPropDef, ctxt.constructType(Integer.class), null, null, idField);

        BeanDeserializerBuilder mockBuilder = new BeanDeserializerBuilder(beanDesc, ctxt.getConfig()) {
            @Override
            public SettableBeanProperty findProperty(PropertyName propertyName) {
                if (propertyName.getSimpleName().equals("id")) return idProp;
                return null;
            }
        };
        
        // Mock ValueInstantiator to return the ID property
        ValueInstantiator mockValueInstantiator = new ValueInstantiator(ctxt.getConfig(), beanDesc) {
            @Override public boolean canCreateFromObjectWith() { return true; }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) { return new BeanWithObjectId(); }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[]{idProp}; }
        };
        mockBuilder.setValueInstantiator(mockValueInstantiator);

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public ObjectIdInfo getObjectIdInfo() { return objectIdInfo; }
            @Override
            public JavaType getType() { return type; }
            @Override
            public Class<?> getBeanClass() { return BeanWithObjectId.class; }
        };

        BeanDeserializerFactory.instance.addObjectIdReader(ctxt, mockBeanDesc, mockBuilder);
        assertNotNull("ObjectIdReader should be set on the builder", mockBuilder.getObjectIdReader());
    }

    @Test
    public void testAddBeanProps_IgnoreUnknownPropertiesTrue() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override public Boolean findIgnoreUnknownProperties(AnnotatedClass ac) { return Boolean.TRUE; }
            @Override public int Merced() { return 0; }
        };
        DeserializationConfig config = ctxt.getConfig().with(ai);
        DeserializationContext mockCtxt = new DeserializationContext(null, config, null) {
             @Override public DeserializerFactory getFactory() { return BeanDeserializerFactory.instance; }
             @Override public JavaType constructType(Class<?> cls) { return TypeFactory.defaultInstance().constructType(cls); }
             @Override public JavaType getTypeFactory() { return TypeFactory.defaultInstance(); }
        };

        AnnotatedField fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
        SimpleBeanPropertyDefinition propDefA = SimpleBeanPropertyDefinition.construct(mockCtxt.getConfig(), fieldA, PropertyName.construct("fieldA"));
        List<BeanPropertyDefinition> propDefs = Collections.singletonList(propDefA);
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override public List<BeanPropertyDefinition> findProperties() { return propDefs; }
        };

        BeanDeserializerFactory.instance.addBeanProps(mockCtxt, mockBeanDesc, builder);
        assertTrue("Builder should ignore unknown properties", builder._ignoreAllUnknown);
    }

    @Test
    public void testAddBeanProps_IgnoredProperties() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forView) { return new String[]{"fieldB"}; }
            @Override public int Merced() { return 0; }
        };
        DeserializationConfig config = ctxt.getConfig().with(ai);
        DeserializationContext mockCtxt = new DeserializationContext(null, config, null) {
             @Override public DeserializerFactory getFactory() { return BeanDeserializerFactory.instance; }
             @Override public JavaType constructType(Class<?> cls) { return TypeFactory.defaultInstance().constructType(cls); }
             @Override public JavaType getTypeFactory() { return TypeFactory.defaultInstance(); }
        };

        AnnotatedField fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
        AnnotatedField fieldB = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldB"), null, null);
        SimpleBeanPropertyDefinition propDefA = SimpleBeanPropertyDefinition.construct(mockCtxt.getConfig(), fieldA, PropertyName.construct("fieldA"));
        SimpleBeanPropertyDefinition propDefB = SimpleBeanPropertyDefinition.construct(mockCtxt.getConfig(), fieldB, PropertyName.construct("fieldB"));
        List<BeanPropertyDefinition> propDefs = Arrays.asList(propDefA, propDefB);
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override public List<BeanPropertyDefinition> findProperties() { return propDefs; }
        };

        BeanDeserializerFactory.instance.addBeanProps(mockCtxt, mockBeanDesc, builder);
        assertTrue("Property 'fieldB' should be marked as ignorable", builder._ignorableProps.contains("fieldB"));
    }

    @Test
    public void testAddInjectables() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanWithInjectable.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        Map<Object, AnnotatedMember> injectables = new HashMap<>();
        AnnotatedField fieldInject = new AnnotatedField(null, BeanWithInjectable.class.getDeclaredField("injectableField"), null, null);
        injectables.put("someValue", fieldInject);

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public Map<Object, AnnotatedMember> findInjectables() {
                return injectables;
            }
        };

        BeanDeserializerFactory.instance.addInjectables(ctxt, mockBeanDesc, builder);
        assertFalse("Builder should have injectables", builder.getInjectables().isEmpty());
        assertEquals("Injectable value should be 'someValue'", "someValue", builder.getInjectables().get(0).getValueId());
    }

    @Test
    public void testAddReferenceProperties() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanWithReference.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        Map<String, AnnotatedMember> backRefs = new HashMap<>();
        AnnotatedMethod setterMethod = new AnnotatedMethod(
                null,
                BeanWithReference.class.getMethod("setOtherBean", BeanWithReference.class),
                null, null);
        backRefs.put("other", setterMethod);

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public Map<String, AnnotatedMember> findBackReferenceProperties() {
                return backRefs;
            }
        };

        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override
            protected SettableBeanProperty constructSettableProperty(DeserializationContext ctxt, BeanDescription beanDesc, BeanPropertyDefinition propDef, JavaType propType0) throws JsonMappingException {
                return new MethodProperty(propDef, propType0, null, null, (AnnotatedMethod) propDef.getMutator());
            }
        };

        factory.addReferenceProperties(ctxt, mockBeanDesc, builder);
        assertNotNull("Builder should have back-reference properties", builder._backRefProperties);
        assertFalse("Builder should have a back-reference for 'other'", builder._backRefProperties.isEmpty());
    }

    @Test
    public void testBuildBuilderBasedDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType valueType = ctxt.constructType(BuiltBean.class);
        JavaType builderType = ctxt.constructType(BuiltBean.Builder.class);
        BeanDescription builderDesc = createDummyBeanDescription(builderType);

        AnnotatedMethod buildMethod = new AnnotatedMethod(null, BuiltBean.Builder.class.getMethod("build"), null, null);
        BeanDescription mockBuilderDesc = new BasicBeanDescription(null, builderType, null, null, null, null, null) {
            @Override
            public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
                if ("build".equals(name) && (paramTypes == null || paramTypes.length == 0)) {
                    return buildMethod;
                }
                return super.findMethod(name, paramTypes);
            }
            @Override
            public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
                return new JsonPOJOBuilder.Value("build", null);
            }
        };
        
        ValueInstantiator builderInstantiator = new ValueInstantiator(ctxt.getConfig(), mockBuilderDesc) {
            @Override public boolean canCreateUsingDefault() { return true; }
            @Override public Object createUsingDefault(DeserializationContext ctxt) { return new BuiltBean.Builder(); }
        };

        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override protected ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) {
                return builderInstantiator;
            }
        };

        JsonDeserializer<Object> deserializer = factory.createBuilderBasedDeserializer(ctxt, valueType, mockBuilderDesc, BuiltBean.Builder.class);
        assertNotNull("Builder-based deserializer should be created", deserializer);
    }

    @Test
    public void testIsPotentialBeanTypeForConcreteClass() throws Exception {
        assertTrue("String is a potential bean type", BeanDeserializerFactory.instance.isPotentialBeanType(String.class));
    }

    @Test
    public void testIsPotentialBeanTypeForAbstractClass() throws Exception {
        assertTrue("List is a potential bean type (can be materialized)", BeanDeserializerFactory.instance.isPotentialBeanType(List.class));
    }

    @Test
    public void testIsPotentialBeanTypeForPrimitive() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
            fail("Primitive types should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Exception message should indicate it's not a bean type", e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testCheckIllegalTypesWhenIllegal() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);

        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override protected Set<String> _cfgIllegalClassNames = Collections.singleton("java.lang.String");
        };

        try {
            factory.checkIllegalTypes(ctxt, type, beanDesc);
            fail("Should throw JsonMappingException for illegal type");
        } catch (JsonMappingException e) {
            assertTrue("Exception message should indicate illegal type", e.getMessage().contains("Illegal type"));
        }
    }

    @Test
    public void testCheckIllegalTypesWhenLegal() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerFactory.instance.checkIllegalTypes(ctxt, type, beanDesc);
    }

    @Test
    public void testBuildBeanDeserializerForAbstractTypeThatCannotBeMaterialized() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.Collection.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Deserializer should still be created, fallback to default behavior", deserializer);
    }

    @Test
    public void testConstructSettablePropertyForMethod() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType beanType = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        DeserializerFactoryConfig config = createDummyConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        AnnotatedMethod setterMethod = new AnnotatedMethod(
                null,
                BeanExample.class.getMethod("setFieldA", String.class),
                null, null);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), setterMethod, PropertyName.construct("fieldA"));
        JavaType propType = ctxt.constructType(String.class);

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

        AnnotatedField field = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldB"), null, null);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), field, PropertyName.construct("fieldB"));
        JavaType propType = ctxt.constructType(Integer.class);

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

        AnnotatedMethod getterMethod = new AnnotatedMethod(
                null,
                BeanExample.class.getMethod("getFieldA"),
                null, null);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                ctxt.getConfig(), getterMethod, PropertyName.construct("fieldA"));
        JavaType propType = ctxt.constructType(String.class);

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

        AnnotatedMethod setterMethod = new AnnotatedMethod(
                null,
                BeanWithAnySetter.class.getMethod("setAny", String.class, Object.class),
                null, null);
        SettableAnyProperty anySetter = factory.constructAnySetter(ctxt, beanDesc, setterMethod);
        assertNotNull("SettableAnyProperty should be constructed", anySetter);
    }

    @Test
    public void testBuildAbstractDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(java.util.Collection.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);
        builder.setValueInstantiator(new ValueInstantiator(ctxt.getConfig(), beanDesc) {});

        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override
            protected BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext ctxt, BeanDescription beanDesc) {
                return new BeanDeserializerBuilder(beanDesc, ctxt.getConfig()) {
                    @Override
                    public AbstractDeserializer buildAbstract() {
                        return new AbstractDeserializer(null) {};
                    }
                };
            }
        };

        JsonDeserializer<Object> deserializer = factory.buildBeanDeserializer(ctxt, type, beanDesc);
        assertTrue("Should return an AbstractDeserializer", deserializer instanceof AbstractDeserializer);
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
        private BeanWithObjectId otherBean;

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

        public void setOtherBean(BeanWithReference otherBean) { this.otherBean = otherBean; }
    }

    public static class BuiltBean {
        private String name;
        public BuiltBean(String name) { this.name = name; }
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

    // Helper for mocking BeanDescription to return specific properties
    private BeanDescription createDummyBeanPropertyDefinition(JavaType type) {
        return BasicBeanDescription.forDeserialization(null, type, null, null, null);
    }
}
