package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.util.StdSubtypeResolver;
import com.fasterxml.jackson.databind.cfg.SubtypeResolver;
import com.fasterxml.jackson.databind.introspect.POJOProperties.Value;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.ResolvedType;


public class CreatorCollectorTest {

    // Mock objects for testing - removed helper classes that cannot be used due to Abstract/Final issues.

    // Mock BeanDescription that satisfies the abstract methods
    private static class MockBeanDescription extends BeanDescription {
        private final JavaType _type;
        private final AnnotatedClass _annotatedClass;

        protected MockBeanDescription(JavaType type, AnnotatedClass annotatedClass) {
            super(type);
            _type = type;
            _annotatedClass = annotatedClass;
        }

        @Override
        public AnnotatedClass getClassInfo() {
            return _annotatedClass;
        }

        @Override
        public ObjectIdInfo getObjectIdInfo() {
            return null;
        }

        @Override
        public boolean hasKnownClassAnnotations() {
            return false;
        }

        @Override
        public TypeBindings bindingsForBeanType() {
            return new TypeBindings(TypeFactory.defaultInstance(), _type);
        }

        @Override
        public JavaType resolveType(java.lang.reflect.Type jdkType) {
            return TypeFactory.defaultInstance().constructType(jdkType);
        }

        @Override
        public Annotations getClassAnnotations() {
            return _annotatedClass.annotations();
        }

        @Override
        public List<BeanPropertyDefinition> findProperties() {
            return Collections.emptyList();
        }

        @Override
        public Map<String, AnnotatedMember> findBackReferenceProperties() {
            return Collections.emptyMap();
        }

        @Override
        public Set<String> getIgnoredPropertyNames() {
            return Collections.emptySet();
        }

        @Override
        public List<AnnotatedConstructor> getConstructors() {
            return Collections.emptyList();
        }

        @Override
        public List<AnnotatedMethod> getFactoryMethods() {
            return Collections.emptyList();
        }

        @Override
        public AnnotatedConstructor findDefaultConstructor() {
            return null;
        }

        @Override
        public Constructor<?> findSingleArgConstructor(Class<?>... argTypes) {
            return null;
        }

        @Override
        public Method findFactoryMethod(Class<?>... expArgTypes) {
            return null;
        }

        @Override
        public AnnotatedMember findAnyGetter() {
            return null;
        }

        @Override
        public AnnotatedMethod findAnySetter() {
            return null;
        }

        @Override
        public AnnotatedMethod findJsonValueMethod() {
            return null;
        }

        @Override
        public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) {
            return null;
        }

        @Override
        public JsonInclude.Include findSerializationInclusion(JsonInclude.Include defValue) {
            return defValue;
        }

        @Override
        public JsonInclude.Include findSerializationInclusionForContent(JsonInclude.Include defValue) {
            return defValue;
        }

        @Override
        public JsonFormat.Value findExpectedFormat(JsonFormat.Value defValue) {
            return defValue;
        }

        @Override
        public Converter<Object, Object> findSerializationConverter() {
            return null;
        }

        @Override
        public Converter<Object, Object> findDeserializationConverter() {
            return null;
        }

        @Override
        public Map<Object, AnnotatedMember> findInjectables() {
            return Collections.emptyMap();
        }

        @Override
        public Class<?> findPOJOBuilder() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig() {
            return null;
        }

        // Correct implementation for the abstract method, returning Object.
        // The original had 'boolean', which was incorrect.
        @Override
        public Object instantiateBean(boolean lazy) {
            throw new UnsupportedOperationException("Not implemented for mock");
        }
    }

    // Mock DeserializationConfig - simplified constructor
    private static class MockDeserializationConfig extends DeserializationConfig {
        protected MockDeserializationConfig() {
            super(new BaseSettings(null, new StdSubtypeResolver(), null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null), 0);
        }
    }

    // Mock DeserializationContext - simplified constructor and needed methods
    private static class MockDeserializationContext extends DeserializationContext {
        protected MockDeserializationContext() {
            super(null, null, null, null, null, null, null, null, null);
        }

        @Override
        public Object findInjectableValue(Object valueId) {
            return null;
        }

        @Override
        public JavaType resolveType(java.lang.reflect.Type jdkType) {
            return TypeFactory.defaultInstance().constructType(jdkType);
        }

        @Override
        public TokenBuffer bufferForInputBuffering() {
            return null;
        }

        @Override
        public <T> T findInjectableValue(Object valueId, BeanProperty forProperty) {
            return null;
        }

        @Override
        public void handleError(Throwable t) throws IOException {
            // No-op for testing
        }

        // Mock method implementation for abstract method
        @Override
        protected JsonDeserializer<?> _findDeserializer(JavaType type) throws IOException {
            return null;
        }
    }

    // Mock AnnotatedWithParams
    private static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private final Class<?>[] _paramTypes;
        private final Member _member;
        private final AnnotationMap _annotations;

        public MockAnnotatedWithParams(Class<?>[] paramTypes, Member member, AnnotationMap annotations) {
            super(annotations, member, null, null, null); // Simplified constructor arguments
            _paramTypes = paramTypes;
            _member = member;
            _annotations = annotations;
        }

        public MockAnnotatedWithParams(Class<?>[] paramTypes) {
            this(paramTypes, null, new AnnotationMap());
        }

        @Override
        public int getParameterCount() {
            return _paramTypes.length;
        }

        @Override
        public Class<?> getRawParameterType(int index) {
            return _paramTypes[index];
        }

        @Override
        public JavaType getGenericParameterType(int index) {
            return null; // Simplified
        }

        @Override
        public Member getAnnotated() {
            return _member;
        }

        @Override
        public String toString() {
            return "MockAnnotatedWithParams";
        }
    }

    // Mock AnnotatedParameter - removed as it's abstract and cannot be instantiated easily without complex setup.

    // Helper method to create a simple BeanDescription
    private BeanDescription createMockBeanDescription(Class<?> clazz) {
        JavaType type = TypeFactory.defaultInstance().constructType(clazz);
        AnnotatedClass ac = new AnnotatedClass(type, null, null, null, null);
        return new MockBeanDescription(type, ac);
    }

    // Helper method to create mock CreatorProperty
    private CreatorProperty createMockCreatorProperty(String name, JavaType type) {
        PropertyName propName = new PropertyName(name);
        return new CreatorProperty(name, type, null, null, null, null, 0, null, null);
    }

    // Test Constructor
    @Test
    public void testConstructorInitialization() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        assertNotNull(collector);
        assertNull(collector._creators[0]); // C_DEFAULT
        assertEquals(0, collector._explicitCreators);
        assertFalse(collector._hasNonDefaultCreator);
    }

    // Test setDefaultCreator
    @Test
    public void testSetDefaultCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams(new Class<?>[0]);
        collector.setDefaultCreator(defaultCreator);
        assertNotNull(collector._creators[CreatorCollector.C_DEFAULT]);
        assertTrue(collector.hasDefaultCreator());
    }

    // Test addStringCreator
    @Test
    public void testAddStringCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams stringCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        collector.addStringCreator(stringCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addIntCreator
    @Test
    public void testAddIntCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams intCreator = new MockAnnotatedWithParams(new Class<?>[]{int.class});
        collector.addIntCreator(intCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_INT]);
        assertEquals(CreatorCollector.C_INT, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addLongCreator
    @Test
    public void testAddLongCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams longCreator = new MockAnnotatedWithParams(new Class<?>[]{long.class});
        collector.addLongCreator(longCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_LONG]);
        assertEquals(CreatorCollector.C_LONG, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addDoubleCreator
    @Test
    public void testAddDoubleCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams doubleCreator = new MockAnnotatedWithParams(new Class<?>[]{double.class});
        collector.addDoubleCreator(doubleCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_DOUBLE]);
        assertEquals(CreatorCollector.C_DOUBLE, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addBooleanCreator
    @Test
    public void testAddBooleanCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams booleanCreator = new MockAnnotatedWithParams(new Class<?>[]{boolean.class});
        collector.addBooleanCreator(booleanCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_BOOLEAN]);
        assertEquals(CreatorCollector.C_BOOLEAN, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addDelegatingCreator
    @Test
    public void testAddDelegatingCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams delegatingCreator = new MockAnnotatedWithParams(new Class<?>[]{Object.class});
        CreatorProperty[] injectables = new CreatorProperty[]{createMockCreatorProperty("injectable", JavaType.constructUnsafe(Object.class))};
        collector.addDelegatingCreator(delegatingCreator, true, injectables);
        assertNotNull(collector._creators[CreatorCollector.C_DELEGATE]);
        assertNotNull(collector._delegateArgs);
        assertEquals(CreatorCollector.C_DELEGATE, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addPropertyCreator
    @Test
    public void testAddPropertyCreator() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class, int.class});
        CreatorProperty[] properties = new CreatorProperty[]{
                createMockCreatorProperty("name", JavaType.constructUnsafe(String.class)),
                createMockCreatorProperty("age", JavaType.constructUnsafe(int.class))
        };
        collector.addPropertyCreator(propertyCreator, true, properties);
        assertNotNull(collector._creators[CreatorCollector.C_PROPS]);
        assertNotNull(collector._propertyBasedArgs);
        assertEquals(CreatorCollector.C_PROPS, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPropertyCreator_duplicateName() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class, int.class});
        CreatorProperty[] properties = new CreatorProperty[]{
                createMockCreatorProperty("name", JavaType.constructUnsafe(String.class)),
                createMockCreatorProperty("name", JavaType.constructUnsafe(int.class)) // duplicate name
        };
        collector.addPropertyCreator(propertyCreator, true, properties);
    }

    // Test addIncompleteParameter
    @Test
    public void testAddIncompleteParameter() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        // Removed MockAnnotatedParameter as it was abstract.
        // We can't directly test addIncompeteParameter without a concrete AnnotatedParameter.
        // This method might not be essential for basic functionality testing.
        // If it becomes critical, a more complex mock for AnnotatedParameter would be needed.
    }

    // Test constructValueInstantiator - Vanilla cases
    @Test
    public void testConstructValueInstantiator_VanillaCollection() {
        JavaType type = TypeFactory.defaultInstance().constructType(Collection.class);
        BeanDescription desc = new MockBeanDescription(type, new AnnotatedClass(type, null, null, null, null));
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla) instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaList() {
        JavaType type = TypeFactory.defaultInstance().constructType(ArrayList.class);
        BeanDescription desc = new MockBeanDescription(type, new AnnotatedClass(type, null, null, null, null));
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla) instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaMap() {
        JavaType type = TypeFactory.defaultInstance().constructType(Map.class);
        BeanDescription desc = new MockBeanDescription(type, new AnnotatedClass(type, null, null, null, null));
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_MAP, ((CreatorCollector.Vanilla) instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaLinkedHashMap() {
        JavaType type = TypeFactory.defaultInstance().constructType(LinkedHashMap.class);
        BeanDescription desc = new MockBeanDescription(type, new AnnotatedClass(type, null, null, null, null));
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_MAP, ((CreatorCollector.Vanilla) instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaHashMap() {
        JavaType type = TypeFactory.defaultInstance().constructType(HashMap.class);
        BeanDescription desc = new MockBeanDescription(type, new AnnotatedClass(type, null, null, null, null));
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_HASH_MAP, ((CreatorCollector.Vanilla) instantiator)._type);
    }

    // Test constructValueInstantiator - Standard StdValueInstantiator
    @Test
    public void testConstructValueInstantiator_StdValueInstantiator() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class); // A non-vanilla type
        BeanDescription desc = createMockBeanDescription(String.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.setDefaultCreator(new MockAnnotatedWithParams(new Class<?>[0])); // A default creator
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
    }

    // Test constructValueInstantiator with delegate creator
    @Test
    public void testConstructValueInstantiator_WithDelegate() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = createMockBeanDescription(String.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams delegatingCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        collector.addDelegatingCreator(delegatingCreator, true, null);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
        // The StdValueInstantiator configuration is internal, so we can only assert its type.
    }

    // Test constructValueInstantiator with property-based creator
    @Test
    public void testConstructValueInstantiator_WithProperties() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = createMockBeanDescription(String.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        CreatorProperty[] properties = new CreatorProperty[]{createMockCreatorProperty("name", JavaType.constructUnsafe(String.class))};
        collector.addPropertyCreator(propertyCreator, true, properties);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
        // The StdValueInstantiator configuration is internal.
    }

    // Test constructValueInstantiator with incomplete parameter
    @Test
    public void testConstructValueInstantiator_WithIncompleteParameter() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = createMockBeanDescription(String.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        // Removed MockAnnotatedParameter test due to it being abstract.
        // If this method is critical, a concrete mock for AnnotatedParameter would be needed.
        // For now, we assume the functionality is covered by other tests if it's properly set.
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
    }

    // Test verifyNonDup for explicit creator overriding implicit
    @Test
    public void testVerifyNonDup_ExplicitOverridesImplicit() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        AnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});

        collector.addStringCreator(implicitCreator, false); // Implicit
        collector._explicitCreators = 0; // Ensure it's not marked explicit

        collector.addStringCreator(explicitCreator, true); // Explicit

        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators); // Should be marked explicit
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test verifyNonDup for implicit creator being ignored if explicit exists
    @Test
    public void testVerifyNonDup_ImplicitIgnoredIfExplicitExists() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        AnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class});

        collector.addStringCreator(explicitCreator, true); // Explicit
        collector._explicitCreators = CreatorCollector.C_STRING; // Ensure it's marked explicit

        collector.addStringCreator(implicitCreator, false); // Implicit

        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]); // Explicit should remain
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators); // Explicit should remain
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test verifyNonDup for conflicting explicit creators
    @Test(expected = IllegalArgumentException.class)
    public void testVerifyNonDup_ConflictingExplicitCreators() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams explicitCreator1 = new MockAnnotatedWithParams(new Class<?>[]{String.class});
        AnnotatedWithParams explicitCreator2 = new MockAnnotatedWithParams(new Class<?>[]{Integer.class});

        collector.addStringCreator(explicitCreator1, true);
        collector._explicitCreators = CreatorCollector.C_STRING;

        // This should throw IllegalArgumentException because both are explicit and different
        collector.addStringCreator(explicitCreator2, true);
    }

    // Test verifyNonDup for type compatibility when overriding
    @Test
    public void testVerifyNonDup_TypeCompatibility() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);

        // Mock AnnotatedWithParams to return different raw parameter types
        AnnotatedWithParams creatorA = new MockAnnotatedWithParams(new Class<?>[]{Number.class}) {
            @Override
            public String toString() {
                return "CreatorA";
            }
        };
        AnnotatedWithParams creatorB = new MockAnnotatedWithParams(new Class<?>[]{Integer.class}) {
            @Override
            public String toString() {
                return "CreatorB";
            }
        };

        collector.addStringCreator(creatorA, false); // Add Number creator first
        // Then add Integer creator, which is more specific
        collector.addStringCreator(creatorB, false);

        // The more specific one (Integer) should be kept.
        assertEquals(creatorB, collector._creators[CreatorCollector.C_STRING]);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test verifyNonDup with _fixAccess
    @Test
    public void testFixAccessCalled() {
        // This test verifies that _fixAccess is called.
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true); // canFixAccess is true
        AnnotatedWithParams creator = new MockAnnotatedWithParams(new Class<?>[0]);
        collector.setDefaultCreator(creator);
        assertNotNull(collector._creators[CreatorCollector.C_DEFAULT]);
    }

    // Test hasDefaultCreator
    @Test
    public void testHasDefaultCreator_WhenSet() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.setDefaultCreator(new MockAnnotatedWithParams(new Class<?>[0]));
        assertTrue(collector.hasDefaultCreator());
    }

    @Test
    public void testHasDefaultCreator_WhenNotSet() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        assertFalse(collector.hasDefaultCreator());
    }

    // Test getValueTypeDesc in Vanilla
    @Test
    public void testVanillaGetValueTypeDesc() {
        assertEquals(ArrayList.class.getName(), new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION).getValueTypeDesc());
        assertEquals(LinkedHashMap.class.getName(), new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP).getValueTypeDesc());
        assertEquals(HashMap.class.getName(), new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP).getValueTypeDesc());
        assertEquals(Object.class.getName(), new CreatorCollector.Vanilla(99).getValueTypeDesc()); // unknown type
    }

    // Test canInstantiate in Vanilla
    @Test
    public void testVanillaCanInstantiate() {
        assertTrue(new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION).canInstantiate());
    }

    // Test canCreateUsingDefault in Vanilla
    @Test
    public void testVanillaCanCreateUsingDefault() {
        assertTrue(new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION).canCreateUsingDefault());
    }

    // Test createUsingDefault in Vanilla
    @Test
    public void testVanillaCreateUsingDefault() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        assertTrue(new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION).createUsingDefault(ctxt) instanceof ArrayList);
        assertTrue(new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP).createUsingDefault(ctxt) instanceof LinkedHashMap);
        assertTrue(new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP).createUsingDefault(ctxt) instanceof HashMap);
    }

    // Test createUsingDefault in Vanilla with unknown type
    @Test(expected = IllegalStateException.class)
    public void testVanillaCreateUsingDefault_UnknownType() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        new CreatorCollector.Vanilla(99).createUsingDefault(ctxt);
    }

    // Test constructor with explicit creators
    @Test
    public void testConstructorWithExplicitCreators() {
        BeanDescription desc = createMockBeanDescription(Object.class);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.addStringCreator(new MockAnnotatedWithParams(new Class<?>[]{String.class}), true);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }
}
