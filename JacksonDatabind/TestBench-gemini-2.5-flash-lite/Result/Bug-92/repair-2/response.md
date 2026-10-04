```java
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
import com.fasterxml.jackson.databind.introspect.FieldProperty; // Corrected import
import com.fasterxml.jackson.databind.introspect.MethodProperty; // Corrected import
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.SetterlessProperty; // Corrected import
import com.fasterxml.jackson.databind.util.TokenBuffer;


public class BeanDeserializerFactoryTest {

    // Helper to create a dummy DeserializationContext
    private DeserializationContext createDummyContext() throws Exception {
        // Basic setup for a DeserializationConfig
        MapperConfig<?> config = new DeserializationConfig(TypeFactory.defaultInstance(), null, null);
        // Need a valid JsonParser and InjectableValues for the context constructor
        JsonParser mockParser = null; // Mock or null if not used directly
        InjectableValues mockInjectables = null; // Mock or null if not used directly
        DeserializerFactory factory = BeanDeserializerFactory.instance; // Use the instance from the class

        // The DeserializationContext constructor requires specific parameters.
        // Based on the API, a common way to create it for testing is:
        // DeserializationContext(DeserializerFactory factory, DeserializationConfig config, JsonParser jp, InjectableValues values)
        // Since we are mocking, we might need to provide nulls or simple mocks.
        // However, a simpler approach might be to use a factory method if available or
        // directly instantiate the necessary components.

        // Let's try a simplified context creation if possible, or use existing test helpers if any.
        // The provided API outline shows several constructors, most are protected or private.
        // The one that seems most accessible for testing would be `DeserializationContext(DeserializerFactory factory, DeserializationConfig config)`
        // but that is not directly visible here, and it seems it's not public API.
        // Let's create a BasicBeanDescription as it's often used with DeserializationContext.

        // Trying a minimal setup, assuming DeserializationContext can be instantiated with factory and config.
        // If not, this part will need more significant refactoring based on available constructors.
        // The error suggests 'no suitable constructor found'. We will try to match one of the visible ones.
        // A common pattern is to use a DeserializerFactory and DeserializationConfig.
        // The error indicates DeserializationContext(DeserializerFactory, DeserializerCache) or similar.
        // Let's assume a minimal constructor is intended if available, or mock it.

        // Based on typical Jackson usage, DeserializationContext is usually obtained from ObjectMapper.
        // For direct testing, we need to simulate this.
        // Let's try to use a constructor that requires DeserializerFactory and DeserializationConfig.
        // Looking at the source code (if available), the base class `BasicDeserializerFactory` might hold clues.
        // The original code tried to use `new DeserializationContext(null, config, null)`. This is incorrect based on compiler errors.
        // A more plausible approach is to use a factory method or a specific test constructor if available.
        // Since the `DeserializationContext` is abstract, we cannot directly instantiate it.
        // We need to provide an anonymous inner class that implements its abstract methods.

        // Re-attempting context creation with a more robust anonymous class,
        // ensuring all abstract methods are overridden correctly.
        return new DeserializationContext(factory, config) {
            // Need to implement abstract methods from DeserializationContext and its superclasses.
            // getFactory() is already overridden in the previous attempt.
            // getParser() and getInjectableValues() are also abstract.

            @Override
            public JsonParser getParser() {
                return null; // Mocking
            }

            @Override
            public InjectableValues getInjectableValues() {
                return null; // Mocking
            }

            // The getTypeFactory() method was problematic. Let's ensure it returns a TypeFactory.
            @Override
            public TypeFactory getTypeFactory() {
                return TypeFactory.defaultInstance();
            }

            // Overriding other methods that might be required for abstract class.
            @Override
            public BeanDescription introspectForBuilder(JavaType builderType) throws JsonMappingException {
                // This should return a valid BeanDescription.
                // Using BasicBeanDescription requires a POJOPropertiesCollector.
                // For a dummy context, we can create a minimal one.
                POJOPropertiesCollector collector = new POJOPropertiesCollector(null, null, builderType, null, null, null);
                return BasicBeanDescription.forDeserialization(collector, builderType, null, null, null);
            }

             @Override
             public JavaType constructType(Class<?> cls) {
                 return getTypeFactory().constructType(cls);
             }

             @Override
             public ObjectIdResolver objectIdResolverInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                 return new ObjectIdReader.DefaultObjectIdResolver();
             }

            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(AnnotatedClass classInfo, ObjectIdInfo info) throws JsonMappingException {
                if (info.getGeneratorType() == ObjectIdGenerators.PropertyGenerator.class) {
                    // PropertyGenerator needs a PropertyBasedObjectIdGenerator
                    return new PropertyBasedObjectIdGenerator(info.getScope());
                }
                return info.newGeneratorInstance(info.getScope());
            }

            @Override
            public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException {
                // Mocking basic deserializers.
                if (type.getRawClass() == String.class) {
                    return new StringDeserializer();
                }
                // If we need IntegerDeserializer, it should be available.
                // If not, we'll have to mock it. Assuming StringDeserializer is enough for now.
                return null; // Default: no deserializer found
            }

            // Need to implement keyDeserializerInstance as per error message.
            @Override
            public KeyDeserializer keyDeserializerInstance(Annotated annotated, ObjectKeyInstantiator inst) throws JsonMappingException {
                return null; // Mocking
            }

            // The constructor error indicates issue with `new DeserializationContext(null, config, null)`
            // Trying a constructor that takes factory and config.
            // If this fails, we need to find the *correct* public/protected constructor.
            // Looking at the Jackson source, `DeserializationContext` has a protected constructor
            // `protected DeserializationContext(DeserializerFactory factory, DeserializationConfig config)`
            // We can use this in our anonymous class.
        };
    }

    // Helper to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription(JavaType type) {
        // BasicBeanDescription requires a POJOPropertiesCollector.
        POJOPropertiesCollector collector = new POJOPropertiesCollector(null, null, type, null, null, null);
        return BasicBeanDescription.forDeserialization(collector, type, null, null, null);
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
    public void testInstanceWithConfigIsNotNull() throws Exception {
        // The `withConfig` method returns a new instance of the factory.
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = BeanDeserializerFactory.instance.withConfig(config);
        assertNotNull("Instance with config should not be null", newFactory);
        // Ensure it's still a BeanDeserializerFactory or a subclass if overridden.
        assertTrue("The returned factory should be a BeanDeserializerFactory", newFactory instanceof BeanDeserializerFactory);
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
                            // Use ctxt.constructType for consistency
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
        // For createBuilderBasedDeserializer, beanDesc is for the builder class.
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

        // Mocking the AnnotatedMethod for initCause
        AnnotatedMethod initCauseMethod = null;
        try {
            initCauseMethod = new AnnotatedMethod(
                    null,
                    Exception.class.getMethod("initCause", Throwable.class),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find initCause method: " + e.getMessage());
        }

        // Mocking BeanDescription to return our mocked initCauseMethod
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
                if ("initCause".equals(name) && paramTypes.length == 1 && paramTypes[0] == Throwable.class) {
                    return initCauseMethod;
                }
                // For other methods, delegate to the base class or return null
                return super.findMethod(name, paramTypes);
            }
            // Need to ensure findProperties returns something, even if empty, to avoid NPEs in buildBeanDeserializer
            @Override
            public List<BeanPropertyDefinition> findProperties() {
                return Collections.emptyList();
            }
        };

        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, type, mockBeanDesc);
        assertNotNull("Deserializer for Exception should be built", deserializer);
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(RuntimeException.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);

        AnnotatedMethod initCauseMethod = null;
        try {
            initCauseMethod = new AnnotatedMethod(
                    null,
                    RuntimeException.class.getMethod("initCause", Throwable.class),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find initCause method: " + e.getMessage());
        }
        
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
                // Ensure properties are found to avoid issues in builder
                return Collections.emptyList();
            }

            @Override
            public Class<?> getBeanClass() {
                return RuntimeException.class;
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
        // Accessing protected field _beanDesc for assertion. In a real scenario, a getter would be preferred.
        assertEquals("Builder should be for the correct bean description", beanDesc, builder._beanDesc);
    }

    @Test
    public void testAddBeanProps() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanExample.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        AnnotatedField fieldA = null;
        try {
            fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field fieldA: " + e.getMessage());
        }
        SimpleBeanPropertyDefinition propDefA = SimpleBeanPropertyDefinition.construct(
            ctxt.getConfig(), fieldA, PropertyName.construct("fieldA"));

        List<BeanPropertyDefinition> propDefs = Collections.singletonList(propDefA);

        // Mock BeanDescription to return specific properties
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public List<BeanPropertyDefinition> findProperties() {
                return propDefs;
            }
        };

        BeanDeserializerFactory.instance.addBeanProps(ctxt, mockBeanDesc, builder);
        // Check if the builder contains any properties after the call.
        // The properties are added to an internal list in BeanDeserializerBuilder.
        // We can check if getProperties() returns anything.
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
                type, // scope type
                ObjectIdGenerators.PropertyGenerator.class,
                null); // generator type parameters
        
        AnnotatedField idField = null;
        try {
            idField = new AnnotatedField(null, BeanWithObjectId.class.getDeclaredField("id"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field id: " + e.getMessage());
        }
        
        SimpleBeanPropertyDefinition idPropDef = SimpleBeanPropertyDefinition.construct(ctxt.getConfig(), idField, PropertyName.construct("id"));
        // Use a placeholder type for the ID field.
        JavaType idFieldType = ctxt.constructType(Integer.class);
        SettableBeanProperty idProp = new FieldProperty(idPropDef, idFieldType, null, null, idField);

        // Mocking BeanDeserializerBuilder to provide the findProperty method.
        BeanDeserializerBuilder mockBuilder = new BeanDeserializerBuilder(beanDesc, ctxt.getConfig()) {
            @Override
            public SettableBeanProperty findProperty(PropertyName propertyName) {
                if (propertyName.getSimpleName().equals("id")) {
                    return idProp;
                }
                return null;
            }
        };
        
        // Mock ValueInstantiator to return the ID property in getFromObjectArguments
        ValueInstantiator mockValueInstantiator = new ValueInstantiator(ctxt.getConfig(), beanDesc) {
            @Override public boolean canCreateFromObjectWith() { return true; }
            // This createFromObjectWith might not be directly used by addObjectIdReader,
            // but ValueInstantiator requires it if canCreateFromObjectWith is true.
            @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) { return new BeanWithObjectId(); }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[]{idProp}; }
            // Need to implement other abstract methods of ValueInstantiator
            @Override public boolean canInstantiate() { return false; }
            @Override public boolean canCreateUsingDefault() { return false; }
            @Override public boolean canCreateUsingDelegate() { return false; }
            @Override public boolean canCreateFromObjectWith() { return true; } // Already set, but for completeness
            @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException, JsonProcessingException { return null; }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException, JsonProcessingException { return null; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[]{idProp}; } // Already set
        };
        mockBuilder.setValueInstantiator(mockValueInstantiator);

        // Mocking BeanDescription to return the ObjectIdInfo and other necessary details.
        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public ObjectIdInfo getObjectIdInfo() { return objectIdInfo; }
            @Override
            public JavaType getType() { return type; }
            @Override
            public Class<?> getBeanClass() { return BeanWithObjectId.class; }
            // Ensure findProperties returns something to satisfy potential calls within builder setup
            @Override public List<BeanPropertyDefinition> findProperties() { return Collections.emptyList(); }
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
            @Override public int Merced() { return 0; } // Dummy implementation
        };
        // Create a DeserializationConfig with the custom AnnotationIntrospector
        DeserializationConfig config = new DeserializationConfig(TypeFactory.defaultInstance(), null, null).with(ai);
        // Create a DeserializationContext using this config.
        DeserializationContext mockCtxt = createDummyContextWithConfig(config);

        AnnotatedField fieldA = null;
        try {
            fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field fieldA: " + e.getMessage());
        }
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
            @Override public int Merced() { return 0; } // Dummy implementation
        };
        DeserializationConfig config = new DeserializationConfig(TypeFactory.defaultInstance(), null, null).with(ai);
        DeserializationContext mockCtxt = createDummyContextWithConfig(config);

        AnnotatedField fieldA = null;
        AnnotatedField fieldB = null;
        try {
            fieldA = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldA"), null, null);
            fieldB = new AnnotatedField(null, BeanExample.class.getDeclaredField("fieldB"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field: " + e.getMessage());
        }
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
        AnnotatedField fieldInject = null;
        try {
            fieldInject = new AnnotatedField(null, BeanWithInjectable.class.getDeclaredField("injectableField"), null, null);
        } catch (NoSuchFieldException e) {
            fail("Could not find field injectableField: " + e.getMessage());
        }
        injectables.put("someValue", fieldInject); // The key is the valueId for the inject

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public Map<Object, AnnotatedMember> findInjectables() {
                return injectables;
            }
        };

        BeanDeserializerFactory.instance.addInjectables(ctxt, mockBeanDesc, builder);
        assertFalse("Builder should have injectables", builder.getInjectables().isEmpty());
        // The injectables are stored in a list of ValueInjector objects.
        assertEquals("Injectable value should be 'someValue'", "someValue", builder.getInjectables().get(0).getValueId());
    }

    @Test
    public void testAddReferenceProperties() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(BeanWithReference.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        BeanDeserializerBuilder builder = BeanDeserializerFactory.instance.constructBeanDeserializerBuilder(ctxt, beanDesc);

        Map<String, AnnotatedMember> backRefs = new HashMap<>();
        AnnotatedMethod setterMethod = null;
        try {
            setterMethod = new AnnotatedMethod(
                    null,
                    BeanWithReference.class.getMethod("setOtherBean", BeanWithReference.class),
                    null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find setOtherBean method: " + e.getMessage());
        }
        backRefs.put("other", setterMethod); // "other" is the reference name

        BeanDescription mockBeanDesc = new BasicBeanDescription(null, type, null, null, null, null, null) {
            @Override
            public Map<String, AnnotatedMember> findBackReferenceProperties() {
                return backRefs;
            }
        };

        // Need a concrete implementation for constructSettableProperty for this test.
        // Create a mock factory that overrides constructSettableProperty.
        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override
            protected SettableBeanProperty constructSettableProperty(DeserializationContext ctxt, BeanDescription beanDesc, BeanPropertyDefinition propDef, JavaType propType0) throws JsonMappingException {
                // Basic mock implementation, using MethodProperty if mutator is a method.
                if (propDef.getMutator() instanceof AnnotatedMethod) {
                    return new MethodProperty(propDef, propType0, null, null, (AnnotatedMethod) propDef.getMutator());
                }
                // Fallback for other mutator types if needed, though not expected here.
                return super.constructSettableProperty(ctxt, beanDesc, propDef, propType0);
            }
        };

        factory.addReferenceProperties(ctxt, mockBeanDesc, builder);
        // Back-reference properties are stored in _backRefProperties in BeanDeserializerBuilder.
        assertNotNull("Builder should have back-reference properties", builder._backRefProperties);
        assertFalse("Builder should have a back-reference for 'other'", builder._backRefProperties.isEmpty());
        assertTrue("Builder should contain a back-reference property named 'other'", builder._backRefProperties.containsKey("other"));
    }

    @Test
    public void testBuildBuilderBasedDeserializer() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType valueType = ctxt.constructType(BuiltBean.class);
        JavaType builderType = ctxt.constructType(BuiltBean.Builder.class);
        
        // Need to mock the BeanDescription for the builder class.
        AnnotatedMethod buildMethod = null;
        try {
            buildMethod = new AnnotatedMethod(null, BuiltBean.Builder.class.getMethod("build"), null, null);
        } catch (NoSuchMethodException e) {
            fail("Could not find build method: " + e.getMessage());
        }

        BeanDescription mockBuilderDesc = new BasicBeanDescription(null, builderType, null, null, null, null, null) {
            @Override
            public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
                if ("build".equals(name) && (paramTypes == null || paramTypes.length == 0)) {
                    return buildMethod;
                }
                return super.findMethod(name, paramTypes);
            }
            // Also need to provide POJOBuilder config
            @Override
            public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
                // Assuming "build" is the method name and no configuration prefix.
                return new JsonPOJOBuilder.Value("build", null);
            }
             // Ensure findProperties returns something
            @Override public List<BeanPropertyDefinition> findProperties() { return Collections.emptyList(); }
        };
        
        // ValueInstantiator for the builder
        ValueInstantiator builderInstantiator = new ValueInstantiator(ctxt.getConfig(), mockBuilderDesc) {
            @Override public boolean canCreateUsingDefault() { return true; }
            @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException, JsonProcessingException { return new BuiltBean.Builder(); }
            // Need to implement other abstract methods or provide dummy implementations
            @Override public boolean canInstantiate() { return false; }
            @Override public boolean canCreateUsingDelegate() { return false; }
            @Override public boolean canCreateFromObjectWith() { return false; }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException, JsonProcessingException { return null; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return null; }
        };

        // Need a factory that can provide our custom value instantiator.
        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            @Override protected ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) {
                // Return our mock instantiator if it's for the builder description
                if (beanDesc.getType().getRawClass() == BuiltBean.Builder.class) {
                    return builderInstantiator;
                }
                return super.findValueInstantiator(ctxt, beanDesc);
            }
        };

        JsonDeserializer<Object> deserializer = factory.createBuilderBasedDeserializer(ctxt, valueType, mockBuilderDesc, BuiltBean.Builder.class);
        assertNotNull("Builder-based deserializer should be created", deserializer);
    }

    @Test
    public void testIsPotentialBeanTypeForConcreteClass() throws Exception {
        // isPotentialBeanType is protected, need a subclass or a mock to call it.
        // For simplicity, we can make it public for testing or use reflection.
        // As per instructions, "Use only the source and target information present".
        // Since it's protected, direct call is not allowed.
        // Let's test it via createBeanDeserializer which uses it.
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type);
        // If isPotentialBeanType returns false for String, createBeanDeserializer might return null.
        // We expect it to return a deserializer, implying String is considered a potential bean type.
        JsonDeserializer<Object> deserializer = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("String should be considered a potential bean type", deserializer);
    }

    @Test
    public void testIsPotentialBeanTypeForPrimitive() {
        try {
            // isPotentialBeanType is protected. We can't call it directly.
            // The error message `Can not deserialize Class ... as a Bean` is thrown from within `isPotentialBeanType`.
            // We can indirectly test this by calling `createBeanDeserializer` with a primitive type.
            DeserializationContext ctxt = createDummyContext();
            JavaType type = ctxt.constructType(int.class); // Primitive type
            BeanDescription beanDesc = createDummyBeanDescription(type);
            BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
            fail("Primitive types should not be deserializable as beans and should lead to an error.");
        } catch (IllegalArgumentException e) {
            assertTrue("Exception message should indicate it's not a bean type", e.getMessage().contains("as a Bean"));
        } catch (JsonMappingException e) {
             // createBeanDeserializer can wrap IllegalArgumentException in JsonMappingException
             assertTrue("Exception message should indicate it's not a bean type", e.getCause().getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testCheckIllegalTypesWhenIllegal() throws Exception {
        DeserializationContext ctxt = createDummyContext();
        JavaType type = ctxt.constructType(String.class); // Example type
        BeanDescription beanDesc = createDummyBeanDescription(type);

        // Create a factory instance that overrides _cfgIllegalClassNames
        BeanDeserializerFactory factory = new BeanDeserializerFactory(createDummyConfig()) {
            // Override the field directly for testing purposes.
            // In a real scenario, this might be done via a constructor or setter if available.
            @Override
            protected Set<String> _cfgIllegalClassNames = Collections.singleton("java.lang.String");
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
```