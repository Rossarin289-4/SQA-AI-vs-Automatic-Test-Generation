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

public class CreatorCollectorTest {

    // Mock implementations for dependencies that are hard to instantiate
    private static class MockMapperConfig extends MapperConfig<MockMapperConfig> {
        private final boolean canOverrideAccess;
        private final boolean forceAccess;
        private final int mapperFeatures;

        protected MockMapperConfig(BaseSettings base, int mapperFeatures, boolean canOverrideAccess, boolean forceAccess) {
            // Adjusting super constructor call to match available constructors
            super(base, mapperFeatures, null, null, null, null, null);
            this.canOverrideAccess = canOverrideAccess;
            this.forceAccess = forceAccess;
            this.mapperFeatures = mapperFeatures;
        }

        @Override
        public MockMapperConfig with(MapperFeature... features) {
            return this;
        }

        @Override
        public MockMapperConfig without(MapperFeature... features) {
            return this;
        }

        @Override
        public MockMapperConfig with(MapperFeature feature, boolean state) {
            return this;
        }

        @Override
        public SubtypeResolver getSubtypeResolver() {
            return new SimpleSubtypeResolver();
        }

        @Override
        public boolean useRootWrapping() {
            return false;
        }

        @Override
        public BeanDescription introspectClassAnnotations(JavaType type) {
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
        
        // Implementing abstract method findRootName
        @Override
        public com.fasterxml.jackson.databind.PropertyName findRootName(JavaType type) {
            return null;
        }
    }

    private static class MockBaseSettings extends BaseSettings {
        protected MockBaseSettings() {
            // Need to provide non-null arguments to BaseSettings constructor
            super(null, // ClassIntrospector.nopInstance(),
                  null, // AnnotationIntrospector.nopInstance(),
                  null, // PropertyNamingStrategy.getDefault(),
                  TypeFactory.defaultInstance(),
                  null, // IconResolver.nopInstance(),
                  null, // JavaTypeResolver.nopInstance(),
                  null, // ClassIntrospector.nopInstance(),
                  null, // Version.unknownVersion(),
                  null, // Locale.getDefault(),
                  null, // TimeZone.getTimeZone("UTC"));
                  null, // InjectableValues.nopInstance());
                  null); // MapperVersioned.forPackage(null)
        }
    }
    
    private static class MockAnnotatedParameter extends AnnotatedParameter {
        private final JavaType _type;
        private final AnnotatedWithParams _owner;
        private final int _index;
        
        public MockAnnotatedParameter(AnnotatedWithParams owner, JavaType type, int index) {
            // Need to provide a non-null AnnotationMap to super constructor
            super(null, null, 0); // Dummy values for super constructor
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
    }

    private static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private final Class<?> _returnType;
        private final JavaType[] _paramTypes;
        private final Member _member;

        public MockAnnotatedWithParams(Member member, Class<?> returnType, JavaType[] paramTypes) {
            // Need to provide non-null arguments to super constructor
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
        
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }

        @Override
        public Object call1(Object arg) throws Exception { return null; }

        @Override
        public Object call(Object... args) throws Exception { return null; }
    }
    
    private static class MockCreatorProperty extends CreatorProperty {
        private final Object _injectableValueId;
        private final int _creatorIndex;
        private final Object _simulatedValue;

        public MockCreatorProperty(String name, JavaType type, int index, Object injectableValueId, Object simulatedValue) {
            // Satisfy the constructor of CreatorProperty
            super(new PropertyName(name), type, null, null, null, null, index, injectableValueId, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
            _simulatedValue = simulatedValue;
            _creatorIndex = index;
            _injectableValueId = injectableValueId;
        }
        
        @Override
        public Object findInjectableValue(DeserializationContext context, Object beanInstance) {
            return _injectableValueId;
        }

        @Override
        public void inject(DeserializationContext context, Object beanInstance) throws IOException {
            // No-op
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            // No-op
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            return _simulatedValue;
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
        @Override
        public List<BeanProperty.Std> findProperties() { return Collections.emptyList(); } 
        @Override
        public Map<String,AnnotatedMember> findBackReferences(Set<String> ignored) { return Collections.emptyMap(); }
        @Override
        public List<AnnotatedMethod> getConstructors() { return Collections.emptyList(); }
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
        @Override
        public boolean findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value format) { return false; }
        @Override
        public Map<String, String> findCreatorParameters(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker) { return Collections.emptyMap(); }
        @Override
        public Object instantiateBean(boolean errors) { return null; }
        @Override
        public List<SettableBeanProperty> findProperties(com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> checker, com.fasterxml.jackson.databind.type.TypeBindings typeBindings, com.fasterxml.jackson.databind.util.TypeKeyResolverProvider<?> typeKeyResolverProvider, Set<String> ignored, boolean forDeser) { return Collections.emptyList(); }
    }
    
    private static class MockDeserializationConfig extends DeserializationConfig {
        protected MockDeserializationConfig(BaseSettings base, int mapperFeatures, SubtypeResolver subtypes, AnnotationIntrospector ai, PropertyNamingStrategy pns, TypeResolverBuilder<?> typer, VisibilityChecker<?> vc) {
            // Need to provide non-null arguments that match super constructor
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
        
        // Implementing abstract method findRootName
        @Override
        public com.fasterxml.jackson.databind.PropertyName findRootName(JavaType type) {
            return null;
        }
    }

    // Helper to create a basic DeserializationConfig
    private DeserializationConfig createConfig() {
        BaseSettings baseSettings = new MockBaseSettings();
        int mapperFeatures = MapperFeature.collectFeatureDefaults(MapperFeature.class);
        SubtypeResolver subtypeResolver = new SimpleSubtypeResolver();
        AnnotationIntrospector annotationIntrospector = AnnotationIntrospector.nopInstance();
        PropertyNamingStrategy propertyNamingStrategy = PropertyNamingStrategy.getDefault();
        TypeResolverBuilder<?> typer = new DefaultTypeResolverBuilder(null);
        VisibilityChecker<?> visibilityChecker = baseSettings.getDefaultVisibilityChecker();
        
        return new MockDeserializationConfig(baseSettings, mapperFeatures, subtypeResolver, annotationIntrospector, propertyNamingStrategy, typer, visibilityChecker);
    }

    @Test
    public void testConstructValueInstantiatorWithDefaultCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

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
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        
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
        MockAnnotatedWithParams arrayDelegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{arrayDelegateType});
        
        SettableBeanProperty[] injectables = new SettableBeanProperty[]{
                new MockCreatorProperty("inject1", null, 0, null, null)
        };
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

        MockAnnotatedWithParams propertyConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{
            TypeFactory.defaultInstance().constructType(String.class),
            TypeFactory.defaultInstance().constructType(int.class)
        });
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

        MockAnnotatedWithParams defaultConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(defaultConstructor);

        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType});
        collector.addDelegatingCreator(delegateConstructor, true, null);

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

        MockAnnotatedParameter incompleteParam = new MockAnnotatedParameter(null, TypeFactory.defaultInstance().constructType(Object.class), 0);
        collector.addIncompeteParameter(incompleteParam);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertNotNull(instantiator);
    }

    @Test
    public void testNonDefaultCreatorFlagIsSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams stringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(stringCreator, true);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
    }

    @Test
    public void testExplicitCreatorFlagIsSet() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams explicitStringCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(explicitStringCreator, true);

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

        MockAnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(explicitCreator, true);

        MockAnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        boolean result = collector.verifyNonDup(implicitCreator, CreatorCollector.C_STRING, false); 
        assertFalse("Implicit creator should be ignored when explicit one exists", result);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]);

        collector = new CreatorCollector(beanDesc, mapperConfig); 
        MockAnnotatedWithParams existingImplicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector._creators[CreatorCollector.C_STRING] = existingImplicitCreator; 

        MockAnnotatedWithParams newExplicitCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        result = collector.verifyNonDup(newExplicitCreator, CreatorCollector.C_STRING, true);
        assertTrue("Explicit creator should replace implicit one", result);
        assertEquals(newExplicitCreator, collector._creators[CreatorCollector.C_STRING]);
        assertTrue("Explicit creator flag should be set", (collector._explicitCreators & (1 << CreatorCollector.C_STRING)) != 0);
    }

    @Test
    public void testVerifyNonDupConflictingTypes() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        MockAnnotatedWithParams creator1 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(String.class)});
        collector.addStringCreator(creator1, true);

        MockAnnotatedWithParams creator2 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(Object.class)});
        boolean result = collector.verifyNonDup(creator2, CreatorCollector.C_STRING, true);
        assertFalse("More generic type (Object) should not override more specific (String)", result);
        assertEquals(creator1, collector._creators[CreatorCollector.C_STRING]);

        MockAnnotatedWithParams creator3 = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{TypeFactory.defaultInstance().constructType(StringBuilder.class)});
        result = collector.verifyNonDup(creator3, CreatorCollector.C_STRING, true);
        assertTrue("More specific type (StringBuilder) should replace more generic (String)", result);
        assertEquals(creator3, collector._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testFixAccessIsCalled() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfigCanFix = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collectorCanFix = new CreatorCollector(beanDesc, mapperConfigCanFix);

        MockAnnotatedWithParams creator = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collectorCanFix.setDefaultCreator(creator);
        assertNotNull(collectorCanFix._creators[CreatorCollector.C_DEFAULT]);

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
                new MockCreatorProperty("inject1", null, 0, null, null)
        };
        collector.addDelegatingCreator(delegateConstructor, true, injectables);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
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
        collector.addDelegatingCreator(arrayDelegateConstructor, true, injectables); 

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertNotNull(instantiator);
    }
    
    @Test
    public void testConstructVanillaInstantiatorForCollection() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(ArrayList.class)
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false); 
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla) instantiator)._type);
        assertTrue(instantiator.canCreateUsingDefault());
    }

    @Test
    public void testConstructVanillaInstantiatorForMap() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(
            new MockBaseSettings(),
            TypeFactory.defaultInstance().constructType(LinkedHashMap.class)
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false);
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
            TypeFactory.defaultInstance().constructType(HashMap.class)
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false);
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
            TypeFactory.defaultInstance().constructType(ArrayList.class)
        );
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperConfig.collectFeatureDefaults(MapperFeature.class), false, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        MockAnnotatedWithParams dummyCreator = new MockAnnotatedWithParams(null, Object.class, new JavaType[0]);
        collector.setDefaultCreator(dummyCreator);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        
        assertFalse(instantiator instanceof CreatorCollector.Vanilla);
        assertTrue(instantiator instanceof StdValueInstantiator);
    }
    
    @Test
    public void testComputeDelegateTypeForNullCreator() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);
        
        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertNull(instantiator.getDelegateType(createConfig()));
    }

    @Test
    public void testComputeDelegateTypeWithArgs() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(new MockBaseSettings(), null);
        MapperConfig<?> mapperConfig = new MockMapperConfig(new MockBaseSettings(), MapperFeature.collectFeatureDefaults(MapperFeature.class), true, false);
        CreatorCollector collector = new CreatorCollector(beanDesc, mapperConfig);

        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        MockAnnotatedWithParams delegateConstructor = new MockAnnotatedWithParams(null, Object.class, new JavaType[]{delegateType, TypeFactory.defaultInstance().constructType(Integer.class)});
        
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[]{
                new MockCreatorProperty("delegateProp", delegateType, 0, null, null)
        };
        collector.addDelegatingCreator(delegateConstructor, true, delegateArgs);

        ValueInstantiator instantiator = collector.constructValueInstantiator(createConfig());
        assertEquals(delegateType, instantiator.getDelegateType(createConfig()));
    }
}
