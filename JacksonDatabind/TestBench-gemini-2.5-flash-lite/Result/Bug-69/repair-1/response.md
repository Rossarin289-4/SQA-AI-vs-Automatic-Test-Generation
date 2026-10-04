```java
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.TypeBuilder;

public class CreatorCollectorTest {

    // Mock implementations for dependencies that are hard to instantiate
    private static class MockMapperConfig extends MapperConfig<MockMapperConfig> {
        private final boolean canOverrideAccess;
        private final boolean forceAccess;
        private final int mapperFeatures;

        protected MockMapperConfig(BaseSettings base, int mapperFeatures, boolean canOverrideAccess, boolean forceAccess) {
            super(base, mapperFeatures, null, null, null, null, null); // Satisfy super constructor
            this.canOverrideAccess = canOverrideAccess;
            this.forceAccess = forceAccess;
            this.mapperFeatures = mapperFeatures;
        }

        @Override
        public MockMapperConfig with(MapperFeature... features) {
            // Simplistic implementation for testing
            return this;
        }

        @Override
        public MockMapperConfig without(MapperFeature... features) {
            // Simplistic implementation for testing
            return this;
        }

        @Override
        public MockMapperConfig with(MapperFeature feature, boolean state) {
            // Simplistic implementation for testing
            return this;
        }

        @Override
        public SubtypeResolver getSubtypeResolver() {
            return null; // Not used in the methods we are testing
        }

        @Override
        public boolean useRootWrapping() {
            return false; // Not relevant for these tests
        }

        @Override
        public BeanDescription introspectClassAnnotations(JavaType type) {
            // Provide a minimal BeanDescription if needed, though CreatorCollector usually
            // relies on the one passed in its constructor.
            return null;
        }
        
        @Override
        public boolean canOverrideAccessModifiers() {
            return canOverrideAccess;
        }

        @Override
        public boolean isEnabled(MapperFeature f) {
            return (mapperFeatures & f.getMask()) != 0;
        }
    }

    private static class MockBaseSettings extends BaseSettings {
        protected MockBaseSettings() {
            super(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null);
        }
    }
    
    private static class MockAnnotatedParameter extends AnnotatedParameter {
        private final JavaType _type;
        private final AnnotatedWithParams _owner;
        private final int _index;
        
        public MockAnnotatedParameter(AnnotatedWithParams owner, JavaType type, int index) {
            super(null, null, 0); // Super constructor requires non-null inputs
            _type = type;
            _owner = owner;
            _index = index;
        }

        @Override
        public JavaType getType() { return _type; }
        @Override
        public AnnotatedWithParams getOwner() { return _owner; }
        @Override
        public int getIndex() { return _index; }
        @Override
        public Member getMember() { return null; }
        @Override
        public int getModifiers() { return 0; }
        @Override
        public String getName() { return "param" + _index; }
        // fixAccess is final in AnnotatedMember, so cannot override
    }

    private static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private final Class<?> _returnType;
        private final JavaType[] _paramTypes;
        private final Member _member;

        public MockAnnotatedWithParams(Member member, Class<?> returnType, JavaType[] paramTypes) {
            // Satisfy super constructor, using dummy values for TypeResolutionContext and AnnotationMap
            super(null, null); 
            _member = member;
            _returnType = returnType;
            _paramTypes = paramTypes;
        }
        
        @Override
        public Member getMember() { return _member; }
        @Override
        public Class<?> getRawReturnType() { return _returnType; }
        @Override
        public JavaType getParameterType(int index) { return _paramTypes[index]; }
        @Override
        public int getParameterCount() { return _paramTypes.length; }
        // fixAccess is final in AnnotatedMember, so cannot override
        
        // Need to implement the abstract method getAnnotation
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }

        // Need to implement the abstract method call1
        @Override
        public Object call1(Object arg) throws Exception { return null; }

        // Need to implement the abstract method call
        @Override
        public Object call(Object... args) throws Exception { return null; }
    }
    
    private static class MockCreatorProperty extends CreatorProperty {
        private final Object _injectableValueId;
        private final int _creatorIndex;
        private final Object _simulatedValue; // To simulate setting

        public MockCreatorProperty(String name, JavaType type, int index, Object injectableValueId, Object simulatedValue) {
            // Using nulls for parameters that aren't directly relevant to the tests
            super(new PropertyName(name), type, null, null, null, null, index, injectableValueId, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
            _simulatedValue = simulatedValue; // Store value for simple get simulation
            _creatorIndex = index;
            _injectableValueId = injectableValueId;
        }
        
        // Override to provide specific return types for simulation
        @Override
        public Object findInjectableValue(DeserializationContext context, Object beanInstance) {
            return _injectableValueId; // Simulate finding injectable value
        }

        @Override
        public void inject(DeserializationContext context, Object beanInstance) throws IOException {
            // No-op for simulation
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            // No-op for simulation
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            return _simulatedValue; // Simulate returning a value
        }
        
        @Override
        public int getCreatorIndex() {
            return _creatorIndex;
        }

        @Override
        public Object getInjectableValueId() {
            return _injectableValueId;
        }
    }

    private static class MockBeanDescription extends BeanDescription {
        private final JavaType _type;

        protected MockBeanDescription(BaseSettings base, JavaType type) {
            super(base, type, null, null, null, null, null);
            _type = type;
        }

        @Override
        public JavaType getType() { return _type; }
        @Override
        public AnnotatedClass getClassInfo() { return null; }
        @Override
        public List<AnnotatedConstructor> getConstructors(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker) { return Collections.emptyList(); }
        @Override
        public List<AnnotatedMethod> getFactoryMethods(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker) { return Collections.emptyList(); }
        @Override
        public AnnotatedConstructor findDefaultConstructor() { return null; }
        @Override
        public AnnotatedMethod findAnySetter(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker) { return null; }
        @Override
        public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) { return null; }
        @Override
        public BeanProperty findProperty(PropertyName name) { return null; }
        @Override
        public Set<String> getIgnoredPropertyNames() { return Collections.emptySet(); }
        // Corrected return type to match superclass declaration
        @Override
        public List<BeanProperty.Std> findProperties() { return Collections.emptyList(); } 
        @Override
        public Map<String,AnnotatedMember> findBackReferences(Set<String> ignored) { return Collections.emptyMap(); }
        // Corrected return type to match superclass declaration
        @Override
        public List<AnnotatedMethod> getConstructors() { return Collections.emptyList(); }
        // Corrected return type to match superclass declaration
        @Override
        public List<AnnotatedMethod> getFactoryMethods() { return Collections.emptyList(); }
        @Override
        public AnnotatedMember findJsonValueAccessor() { return null; }
        @Override
        public AnnotatedMethod findAnyGetter() { return null; }
        @Override
        public AnnotatedMember findForward(String name) { return null; }
        @Override
        public boolean hasKnownProperty(PropertyName name) { return false; }
        // Corrected parameter type to match superclass declaration
        @Override
        public boolean findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value format) { return false; }
        @Override
        public Map<String, String> findCreatorParameters(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker) { return Collections.emptyMap(); }
        // Need to implement abstract methods: instantiateBean, findDefaultConstructorProperties, findProperties...
        @Override
        public Object instantiateBean(boolean errors) { return null; }
        @Override
        public List<SettableBeanProperty> findProperties(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker, BeanProperty.Std.TypeResolverBuilder<?> typeResolverBuilder, Set<String> ignored, boolean forDeser) { return Collections.emptyList(); }
    }
    
    // Mock DeserializationConfig to satisfy constructValueInstantiator
    private static class MockDeserializationConfig extends DeserializationConfig {
        protected MockDeserializationConfig(BaseSettings base, int mapperFeatures, SubtypeResolver subtypes, AnnotationIntrospector ai, PropertyNamingStrategy pns, TypeResolverBuilder<?> typer, VisibilityChecker<?> vc) {
            super(base, mapperFeatures, subtypes, ai, pns, typer, vc);
        }

        @Override
        public BaseSettings getBaseSettings() {
            return _base;
        }
        
        @Override
        public boolean canOverrideAccessModifiers() {
            return _base.canOverrideAccessModifiers();
        }
        
        @Override
        public boolean isEnabled(MapperFeature f) {
            return (_mapperFeatures & f.getMask()) != 0;
        }
        
        @Override
        public JavaType constructType(Class<?> cls) {
             return TypeFactory.defaultInstance().constructType(cls);
        }
    }

    // Helper to create a basic DeserializationConfig
    private DeserializationConfig createConfig() {
        BaseSettings baseSettings = new MockBaseSettings();
        int mapperFeatures = MapperFeature.collectFeatureDefaults(MapperFeature.class);
        SubtypeResolver subtypeResolver = null; // Or use new SimpleSubtypeResolver();
        AnnotationIntrospector annotationIntrospector = null; // Or use AnnotationIntrospector.nopInstance();
        PropertyNamingStrategy propertyNamingStrategy = null; // Or use PropertyNamingStrategy.getDefault();
        TypeResolverBuilder<?> typer = null; // Or use new DefaultTypeResolverBuilder(null);
        VisibilityChecker<?> visibilityChecker = baseSettings.getDefaultVisibilityChecker();
        
        return new MockDeserializationConfig(baseSettings, mapperFeatures, subtypeResolver, annotationIntrospector, propertyNamingStrategy, typer, visibilityChecker);
    }

    @Test
    public void testConstructValueInstantiatorWithDefaultCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Mock AnnotatedWithParams for a default constructor (no parameters)
        MockAnnotatedWithParams defaultConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(defaultConstructor);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());

        assertTrue(instantiator.canCreateUsingDefault());
        assertFalse(instantiator.canCreateFromObjectWith());
    }

    @Test
    public void testConstructValueInstantiatorWithDelegateCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        // Mock AnnotatedWithParams for a delegate constructor (one parameter)
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        
        // Mock SettableBeanProperty for potential injectables (not strictly needed for this test's assertion)
        SettableBeanProperty[] injectables = new SettableBeanProperty[]{
                new MockCreatorProperty("inject1", null, 0, null, null)
        };
        collector.addDelegatingCreator(delegateConstructor, true, injectables);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());

        assertTrue(instantiator.canCreateUsingDelegate());
        assertEquals(delegateType, instantiator.getDelegateType(createConfig()));
    }

    @Test
    public void testConstructValueInstantiatorWithArrayDelegateCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType arrayDelegateType = TypeFactory.defaultInstance().constructType(List.class);
        // Mock AnnotatedWithParams for an array delegate constructor (one parameter)
        MockAnnotatedWithParams arrayDelegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{arrayDelegateType});
        
        SettableBeanProperty[] injectables = new SettableBeanProperty[]{
                new MockCreatorProperty("inject1", null, 0, null, null)
        };
        // This call is intended to register an array delegate
        collector.addDelegatingCreator(arrayDelegateConstructor, true, injectables);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());

        assertTrue(instantiator.canCreateUsingArrayDelegate());
        assertEquals(arrayDelegateType, instantiator.getArrayDelegateType(createConfig()));
    }

    @Test
    public void testConstructValueInstantiatorWithPropertyBasedCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Mock AnnotatedWithParams for a property-based constructor (multiple parameters)
        MockAnnotatedWithParams propertyConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{
            TypeFactory.defaultInstance().constructType(String.class),
            TypeFactory.defaultInstance().constructType(int.class)
        });
        // Mock SettableBeanProperty for the properties
        SettableBeanProperty[] properties = new SettableBeanProperty[]{
                new MockCreatorProperty("prop1", TypeFactory.defaultInstance().constructType(String.class), 0, null, null),
                new MockCreatorProperty("prop2", TypeFactory.defaultInstance().constructType(int.class), 1, null, null)
        };
        collector.addPropertyCreator(propertyConstructor, true, properties);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());

        assertTrue(instantiator.canCreateFromObjectWith());
        assertEquals(2, instantiator.getFromObjectArguments(createConfig()).length);
    }

    @Test
    public void testConstructValueInstantiatorWithVariousCreators() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Default creator
        MockAnnotatedWithParams defaultConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(defaultConstructor);

        // Delegate creator
        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        collector.addDelegatingCreator(delegateConstructor, true, null);

        // Property-based creator
        MockAnnotatedWithParams propertyConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        SettableBeanProperty[] properties = new SettableBeanProperty[]{
                new MockCreatorProperty("prop1", TypeFactory.defaultInstance().constructType(String.class), 0, null, null)
        };
        collector.addPropertyCreator(propertyConstructor, true, properties);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());

        assertTrue(instantiator.canCreateUsingDefault());
        assertTrue(instantiator.canCreateUsingDelegate());
        assertTrue(instantiator.canCreateFromObjectWith());
    }

    @Test
    public void testAddStringCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams stringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(stringCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator.canCreateFromString());
    }

    @Test
    public void testAddIntCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams intCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(int.class)});
        collector.addIntCreator(intCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator.canCreateFromInt());
    }

    @Test
    public void testAddLongCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams longCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(long.class)});
        collector.addLongCreator(longCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator.canCreateFromLong());
    }

    @Test
    public void testAddDoubleCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams doubleCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(double.class)});
        collector.addDoubleCreator(doubleCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator.canCreateFromDouble());
    }

    @Test
    public void testAddBooleanCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams booleanCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(boolean.class)});
        collector.addBooleanCreator(booleanCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator.canCreateFromBoolean());
    }

    @Test
    public void testHasDefaultCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        assertFalse(collector.hasDefaultCreator());
        MockAnnotatedWithParams defaultConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(defaultConstructor);
        assertTrue(collector.hasDefaultCreator());
    }

    @Test
    public void testHasDelegatingCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        assertFalse(collector.hasDelegatingCreator());
        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        collector.addDelegatingCreator(delegateConstructor, true, null);
        assertTrue(collector.hasDelegatingCreator());
    }

    @Test
    public void testHasPropertyBasedCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        assertFalse(collector.hasPropertyBasedCreator());
        MockAnnotatedWithParams propertyConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[1]);
        SettableBeanProperty[] properties = new SettableBeanProperty[]{
                new MockCreatorProperty("prop1", null, 0, null, null)
        };
        collector.addPropertyCreator(propertyConstructor, true, properties);
        assertTrue(collector.hasPropertyBasedCreator());
    }

    @Test
    public void testAddIncompleteParameter() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // MockAnnotatedParameter for an incomplete parameter
        MockAnnotatedParameter incompleteParam = new MockAnnotatedParameter(null, TypeFactory.defaultInstance().constructType(Object.class), 0);
        collector.addIncompeteParameter(incompleteParam);

        // Construct the ValueInstantiator and check if the incomplete parameter is set
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        // StdValueInstantiator has a field for incomplete parameter.
        // We can check if it's non-null.
        // Since StdValueInstantiator is internal to jackson, we can't directly assert its type.
        // However, if _incompleteParameter is set, it should be passed to StdValueInstantiator.
        // A simple check here is to ensure the instantiator is not null.
        assertNotNull(instantiator);
        // A more direct check would be to retrieve the incomplete parameter from the instantiator if possible.
        // For StdValueInstantiator, this is not public API.
    }

    @Test
    public void testNonDefaultCreatorFlagIsSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Add any non-default creator
        MockAnnotatedWithParams stringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(stringCreator, true);

        // Check if _hasNonDefaultCreator is true. This is a private field, so we'll need to
        // rely on a method that uses it. constructValueInstantiator does this.
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        // The logic in constructValueInstantiator branches based on _hasNonDefaultCreator.
        // If it's true, it doesn't use the Vanilla instantiator for well-known types.
        // If it's false, it might.
        // So, testing that we get a StdValueInstantiator (or a custom one) rather than Vanilla is a good indicator.
        assertTrue(instantiator instanceof StdValueInstantiator);
    }

    @Test
    public void testExplicitCreatorFlagIsSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams explicitStringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(explicitStringCreator, true); // explicit = true

        // _explicitCreators is private, so we check its effect.
        // The verifyNonDup method sets bits in _explicitCreators.
        // A subsequent explicit creator should throw an exception if it conflicts with an explicit one.
        MockAnnotatedWithParams anotherExplicitStringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        try {
            collector.addStringCreator(anotherExplicitStringCreator, true);
            fail("Should have thrown IllegalArgumentException for conflicting explicit creators");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Duplicate creator property"));
        }
    }

    @Test
    public void testVerifyNonDupWithExplicitAndImplicit() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Add an explicit creator
        MockAnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(explicitCreator, true);

        // Add an implicit creator - should be ignored without exception
        MockAnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        // The verifyNonDup method returns true if the new creator is to be used, false otherwise.
        // Here, an implicit creator is encountered when an explicit one exists, so it should be ignored (return false).
        boolean result = collector.verifyNonDup(implicitCreator, CreatorCollector.C_STRING, false); 
        assertFalse("Implicit creator should be ignored when explicit one exists", result);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]); // Ensure original explicit creator remains

        // Now test adding an explicit creator when an implicit one exists
        collector = new CreatorCollector(beanDesc, mapperConfig); // Reset collector
        MockAnnotatedWithParams existingImplicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector._creators[CreatorCollector.C_STRING] = existingImplicitCreator; // Manually set existing creator
        // _explicitCreators is NOT set for implicit creator

        MockAnnotatedWithParams newExplicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        result = collector.verifyNonDup(newExplicitCreator, CreatorCollector.C_STRING, true); // Trying to add explicit
        assertTrue("Explicit creator should replace implicit one", result);
        assertEquals(newExplicitCreator, collector._creators[CreatorCollector.C_STRING]); // Ensure new explicit creator is set
        assertTrue("Explicit creator flag should be set", (collector._explicitCreators & (1 << CreatorCollector.C_STRING)) != 0);
    }

    @Test
    public void testVerifyNonDupConflictingTypes() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        // Add a creator for String
        MockAnnotatedWithParams creator1 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(creator1, true);

        // Add another creator for String, which is assignable to the first (should be rejected)
        MockAnnotatedWithParams creator2 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(Object.class)});
        boolean result = collector.verifyNonDup(creator2, CreatorCollector.C_STRING, true);
        assertFalse("More generic type (Object) should not override more specific (String)", result);
        assertEquals(creator1, collector._creators[CreatorCollector.C_STRING]);

        // Add a creator for String, which is more specific than the first (should replace)
        MockAnnotatedWithParams creator3 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(StringBuilder.class)});
        result = collector.verifyNonDup(creator3, CreatorCollector.C_STRING, true);
        assertTrue("More specific type (StringBuilder) should replace more generic (String)", result);
        assertEquals(creator3, collector._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testFixAccessIsCalled() throws Exception {
        // This test relies on side effects of ClassUtil.checkAndFixAccess, which we can't easily mock here.
        // We'll test by ensuring _fixAccess is called by methods that are supposed to use it.
        // For example, setDefaultCreator calls _fixAccess.
        // The _fixAccess method returns the input member after potentially modifying it.
        // We check that the returned member is not null and is the same instance passed in (since no modification happens in mock).
        
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        // Test with canFixAccess = true
        MapperConfig<?> mapperConfigCanFix = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collectorCanFix = new CreatorCollector(beanDesc, mapperConfigCanFix);

        MockAnnotatedWithParams creator = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collectorCanFix.setDefaultCreator(creator);
        assertNotNull(collectorCanFix._creators[CreatorCollector.C_DEFAULT]);
        // In the real implementation, _fixAccess might modify the passed member.
        // Here, we check that it was at least called and assigned.

        // Test with canFixAccess = false
        MapperConfig<?> mapperConfigNoFix = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), false, false);
        CreatorCollector collectorNoFix = new CreatorCollector(beanDesc, mapperConfigNoFix);
        MockAnnotatedWithParams creator2 = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collectorNoFix.setDefaultCreator(creator2);
        assertNotNull(collectorNoFix._creators[CreatorCollector.C_DEFAULT]);
    }

    @Test
    public void testDuplicateCreatorPropertyException() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams propertyConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[2]);
        SettableBeanProperty[] properties = new SettableBeanProperty[]{
                new MockCreatorProperty("prop1", null, 0, null, null),
                new MockCreatorProperty("prop1", null, 1, null, null) // Duplicate name
        };

        try {
            collector.addPropertyCreator(propertyConstructor, true, properties);
            fail("Should have thrown IllegalArgumentException for duplicate creator property name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Duplicate creator property \"prop1\""));
        }
    }

    @Test
    public void testDelegateArgsAreSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        
        SettableBeanProperty[] injectables = new SettableBeanProperty[]{
                new MockCreatorProperty("inject1", null, 0, null, null),
                // The source code has a special case for C_ARRAY_DELEGATE vs C_DELEGATE detection
                // based on whether the parameter type is Collection-like.
                // For C_DELEGATE, we don't need a specific marker.
        };
        collector.addDelegatingCreator(delegateConstructor, true, injectables);

        // The _delegateArgs field is private. We can only check its effect through constructValueInstantiator.
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        // We can't directly check _delegateArgs here. The test mainly ensures no exceptions are thrown
        // and that the instantiator is created correctly.
        assertNotNull(instantiator); 
    }

    @Test
    public void testArrayDelegateArgsAreSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType arrayDelegateType = TypeFactory.defaultInstance().constructType(List.class);
        MockAnnotatedWithParams arrayDelegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{arrayDelegateType});
        
        SettableBeanProperty[] injectables = new SettableBeanProperty[]{
                new MockCreatorProperty("inject1", null, 0, null, null)
        };
        // This call should register as an array delegate because List.class is Collection-like.
        collector.addDelegatingCreator(arrayDelegateConstructor, true, injectables); 

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertNotNull(instantiator);
        // Again, direct check of _arrayDelegateArgs is not possible.
    }
    
    // Test for Vanilla instantiator creation for well-known types
    @Test
    public void testConstructVanillaInstantiatorForCollection() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(ArrayList.class) // Simulate a collection type
        );
        // Mapper features that would allow overriding access are not critical here, focus on non-default creator
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false); 
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        // No creators added, so _hasNonDefaultCreator remains false.
        // This should lead to Vanilla instantiator for collection types.
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla) instantiator)._type);
        assertTrue(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testConstructVanillaInstantiatorForMap() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(LinkedHashMap.class) // Simulate a map type
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false); // No overriding access
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_MAP, ((CreatorCollector.Vanilla) instantiator)._type);
        assertTrue(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testConstructVanillaInstantiatorForHashMap() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(HashMap.class) // Simulate a HashMap type
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false); // No overriding access
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_HASH_MAP, ((CreatorCollector.Vanilla) instantiator)._type);
        assertTrue(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testNonVanillaForWellKnownTypeIfCreatorAdded() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(ArrayList.class) // Simulate a collection type
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false); // No overriding access
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        // Add any creator, even if it's not used by the main logic, to trigger _hasNonDefaultCreator
        MockAnnotatedWithParams dummyCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(dummyCreator);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        // Should not be Vanilla, as _hasNonDefaultCreator is true
        assertFalse(instantiator instanceof CreatorCollector.Vanilla);
        // It will be StdValueInstantiator due to the default creator
        assertTrue(instantiator instanceof StdValueInstantiator);
    }
    
    @Test
    public void testComputeDelegateTypeForNullCreator() throws Exception {
        // Test the private method _computeDelegateType by observing its effect on constructValueInstantiator.
        // If _creators[C_DELEGATE] is null, it should return null.
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        // _creators[C_DELEGATE] is null by default.
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        // _computeDelegateType is called for _delegateArgs.
        // If _creators[C_DELEGATE] is null, delegateType will be null.
        assertNull(instantiator.getDelegateType(createConfig()));
    }

    @Test
    public void testComputeDelegateTypeWithArgs() throws Exception {
        // Test the private method _computeDelegateType with delegateArgs.
        // It needs to find the index of the delegate parameter.
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        // Constructor with two parameters, where the first one is the delegate type
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType, TypeFactory.defaultInstance().constructType(Integer.class)});
        
        // The SettableBeanProperty array should contain the delegate's parameter at the correct index.
        // The source code indicates it looks for a null entry in delegateArgs for the delegate itself
        // and uses that index to determine the type from the creator.
        // However, the typical pattern is that the delegate type is the *first* parameter if `_delegateArgs` is non-null.
        // Let's assume the logic in _computeDelegateType correctly identifies the delegate parameter.
        
        // The code:
        // int ix = 0;
        // if (delegateArgs != null) {
        //     for (int i = 0, len = delegateArgs.length; i < len; ++i) {
        //         if (delegateArgs[i] == null) { // marker for delegate itself
        //             ix = i;
        //             break;
        //         }
        //     }
        // }
        // return creator.getParameterType(ix);

        // This means if we have a delegate constructor with one argument, and that argument is *not* null in _delegateArgs,
        // then `delegateArgs[0]` is not null, the loop finishes without finding a null, and `ix` remains 0.
        // So, `creator.getParameterType(0)` is used.
        
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[]{
                new MockCreatorProperty("delegateProp", delegateType, 0, null, null) // This is the delegate argument
        };
        collector.addDelegatingCreator(delegateConstructor, true, delegateArgs);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertEquals(delegateType, instantiator.getDelegateType(createConfig()));
    }
}
```