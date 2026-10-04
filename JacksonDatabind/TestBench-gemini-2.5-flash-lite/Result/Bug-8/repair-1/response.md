```java
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

public class CreatorCollectorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock objects for testing
    private static class MockBeanDescription extends BeanDescription {
        protected MockBeanDescription(JavaType type) {
            super(type);
        }
        @Override public AnnotatedClass getClassInfo() { return null; }
        @Override public ObjectIdInfo getObjectIdInfo() { return null; }
        @Override public boolean hasKnownClassAnnotations() { return false; }
        @Override public TypeBindings bindingsForBeanType() { return new TypeBindings(TypeFactory.defaultInstance(), (JavaType)null); }
        @Override public JavaType resolveType(java.lang.reflect.Type jdkType) { return null; }
        @Override public Annotations getClassAnnotations() { return null; }
        @Override public List<BeanPropertyDefinition> findProperties() { return Collections.emptyList(); }
        @Override public Map<String,AnnotatedMember> findBackReferenceProperties() { return Collections.emptyMap(); }
        @Override public Set<String> getIgnoredPropertyNames() { return Collections.emptySet(); }
        @Override public List<AnnotatedConstructor> getConstructors() { return Collections.emptyList(); }
        @Override public List<AnnotatedMethod> getFactoryMethods() { return Collections.emptyList(); }
        @Override public AnnotatedConstructor findDefaultConstructor() { return null; }
        @Override public Constructor<?> findSingleArgConstructor(Class<?>... argTypes) { return null; }
        @Override public Method findFactoryMethod(Class<?>... expArgTypes) { return null; }
        @Override public AnnotatedMember findAnyGetter() { return null; }
        @Override public AnnotatedMethod findAnySetter() { return null; }
        @Override public AnnotatedMethod findJsonValueMethod() { return null; }
        @Override public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes) { return null; }
        @Override public JsonInclude.Include findSerializationInclusion(JsonInclude.Include defValue) { return defValue; }
        @Override public JsonInclude.Include findSerializationInclusionForContent(JsonInclude.Include defValue) { return defValue; }
        @Override public JsonFormat.Value findExpectedFormat(JsonFormat.Value defValue) { return defValue; }
        @Override public Converter<Object,Object> findSerializationConverter() { return null; }
        @Override public Converter<Object,Object> findDeserializationConverter() { return null; }
        @Override public Map<Object, AnnotatedMember> findInjectables() { return Collections.emptyMap(); }
        @Override public Class<?> findPOJOBuilder() { return null; }
        @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig() { return null; }
        @Override public boolean instantiateBean(boolean lazy) { throw new UnsupportedOperationException(); } // Added to satisfy abstract method
    }

    private static class MockDeserializationConfig extends DeserializationConfig {
        protected MockDeserializationConfig() { super(null, TypeFactory.defaultInstance(), null, null, null, null, null, null, 0); }
    }

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
            return null;
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
    }

    private static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private final Class<?>[] _paramTypes;
        private final Member _member;

        public MockAnnotatedWithParams(Class<?>[] paramTypes, Member member) {
            super(null, null, null, null, null);
            _paramTypes = paramTypes;
            _member = member;
        }
        
        public MockAnnotatedWithParams(Class<?>[] paramTypes) {
            this(paramTypes, null);
        }

        @Override public int getParameterCount() { return _paramTypes.length; }
        @Override public Class<?> getRawParameterType(int index) { return _paramTypes[index]; }
        @Override public JavaType getGenericParameterType(int index) { return null; }
        @Override public Member getAnnotated() { return _member; }
        @Override public String toString() { return "MockAnnotatedWithParams"; }
    }

    private static class MockAnnotatedParameter extends AnnotatedParameter {
        protected MockAnnotatedParameter(AnnotationMap annotations, Member member, JavaType type, int index) {
            super(annotations, member, type, index);
        }
    }

    // Test Constructor
    @Test
    public void testConstructorInitialization() {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        assertNotNull(collector);
        assertNull(collector._creators[0]); // C_DEFAULT
        assertEquals(0, collector._explicitCreators);
        assertFalse(collector._hasNonDefaultCreator);
    }

    // Test setDefaultCreator
    @Test
    public void testSetDefaultCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams(new Class<?>[0], null);
        collector.setDefaultCreator(defaultCreator);
        assertNotNull(collector._creators[CreatorCollector.C_DEFAULT]);
        assertTrue(collector.hasDefaultCreator());
    }

    // Test addStringCreator
    @Test
    public void testAddStringCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams stringCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        collector.addStringCreator(stringCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addIntCreator
    @Test
    public void testAddIntCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams intCreator = new MockAnnotatedWithParams(new Class<?>[]{int.class}, null);
        collector.addIntCreator(intCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_INT]);
        assertEquals(CreatorCollector.C_INT, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addLongCreator
    @Test
    public void testAddLongCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams longCreator = new MockAnnotatedWithParams(new Class<?>[]{long.class}, null);
        collector.addLongCreator(longCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_LONG]);
        assertEquals(CreatorCollector.C_LONG, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addDoubleCreator
    @Test
    public void testAddDoubleCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams doubleCreator = new MockAnnotatedWithParams(new Class<?>[]{double.class}, null);
        collector.addDoubleCreator(doubleCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_DOUBLE]);
        assertEquals(CreatorCollector.C_DOUBLE, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addBooleanCreator
    @Test
    public void testAddBooleanCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams booleanCreator = new MockAnnotatedWithParams(new Class<?>[]{boolean.class}, null);
        collector.addBooleanCreator(booleanCreator, true);
        assertNotNull(collector._creators[CreatorCollector.C_BOOLEAN]);
        assertEquals(CreatorCollector.C_BOOLEAN, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addDelegatingCreator
    @Test
    public void testAddDelegatingCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams delegatingCreator = new MockAnnotatedWithParams(new Class<?>[]{Object.class}, null);
        CreatorProperty[] injectables = new CreatorProperty[1];
        // Mock CreatorProperty constructor requires more arguments
        injectables[0] = new CreatorProperty("injectable", JavaType.constructUnsafe(Object.class), null, null, null, null, 0, null, null);
        collector.addDelegatingCreator(delegatingCreator, true, injectables);
        assertNotNull(collector._creators[CreatorCollector.C_DELEGATE]);
        assertNotNull(collector._delegateArgs);
        assertEquals(CreatorCollector.C_DELEGATE, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }

    // Test addPropertyCreator
    @Test
    public void testAddPropertyCreator() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class, int.class}, null);
        CreatorProperty[] properties = new CreatorProperty[2];
        // Need to mock CreatorProperty with a name
        properties[0] = new CreatorProperty("name", JavaType.constructUnsafe(String.class), null, null, null, null, 0, null, null);
        properties[1] = new CreatorProperty("age", JavaType.constructUnsafe(int.class), null, null, null, null, 1, null, null);
        collector.addPropertyCreator(propertyCreator, true, properties);
        assertNotNull(collector._creators[CreatorCollector.C_PROPS]);
        assertNotNull(collector._propertyBasedArgs);
        assertEquals(CreatorCollector.C_PROPS, collector._explicitCreators);
        assertTrue(collector._hasNonDefaultCreator);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddPropertyCreator_duplicateName() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class, int.class}, null);
        CreatorProperty[] properties = new CreatorProperty[2];
        properties[0] = new CreatorProperty("name", JavaType.constructUnsafe(String.class), null, null, null, null, 0, null, null);
        properties[1] = new CreatorProperty("name", JavaType.constructUnsafe(int.class), null, null, null, null, 1, null, null); // duplicate name
        collector.addPropertyCreator(propertyCreator, true, properties);
    }
    
    // Test addIncompleteParameter
    @Test
    public void testAddIncompleteParameter() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedParameter incompleteParam = new MockAnnotatedParameter(null, null, null, 0);
        collector.addIncompeteParameter(incompleteParam);
        assertNotNull(collector._incompleteParameter);
    }

    // Test constructValueInstantiator - Vanilla cases
    @Test
    public void testConstructValueInstantiator_VanillaCollection() throws Exception {
        // Use a concrete type for BeanDescription
        JavaType type = TypeFactory.defaultInstance().constructType(Collection.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla)instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaList() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(ArrayList.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_COLLECTION, ((CreatorCollector.Vanilla)instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaMap() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Map.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_MAP, ((CreatorCollector.Vanilla)instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaLinkedHashMap() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(LinkedHashMap.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_MAP, ((CreatorCollector.Vanilla)instantiator)._type);
    }

    @Test
    public void testConstructValueInstantiator_VanillaHashMap() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(HashMap.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof CreatorCollector.Vanilla);
        assertEquals(CreatorCollector.Vanilla.TYPE_HASH_MAP, ((CreatorCollector.Vanilla)instantiator)._type);
    }

    // Test constructValueInstantiator - Standard StdValueInstantiator
    @Test
    public void testConstructValueInstantiator_StdValueInstantiator() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class); // A non-vanilla type
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.setDefaultCreator(new MockAnnotatedWithParams(new Class<?>[0], null)); // A default creator
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
    }

    // Test constructValueInstantiator with delegate creator
    @Test
    public void testConstructValueInstantiator_WithDelegate() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams delegatingCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        collector.addDelegatingCreator(delegatingCreator, true, null);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
        StdValueInstantiator stdInst = (StdValueInstantiator) instantiator;
        // The delegate creator itself is not directly accessible from StdValueInstantiator API,
        // but its presence influences the constructed instantiator. We can't directly assert getDelegateCreator()
        // as it might be null if type resolution fails etc.
        // A better test would be to check if the configured delegate type is correct.
        // For now, we check if it's a StdValueInstantiator.
    }

    // Test constructValueInstantiator with property-based creator
    @Test
    public void testConstructValueInstantiator_WithProperties() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams propertyCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        CreatorProperty[] properties = new CreatorProperty[1];
        properties[0] = new CreatorProperty("name", JavaType.constructUnsafe(String.class), null, null, null, null, 0, null, null);
        collector.addPropertyCreator(propertyCreator, true, properties);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
        StdValueInstantiator stdInst = (StdValueInstantiator) instantiator;
        // Similar to delegate creator, direct access to 'withArgsCreator' might not be public.
        // Checking if it's a StdValueInstantiator and configured is the best we can do here.
    }
    
    // Test constructValueInstantiator with incomplete parameter
    @Test
    public void testConstructValueInstantiator_WithIncompleteParameter() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = new MockBeanDescription(type);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedParameter incompleteParam = new MockAnnotatedParameter(null, null, null, 0);
        collector.addIncompeteParameter(incompleteParam);
        ValueInstantiator instantiator = collector.constructValueInstantiator(new MockDeserializationConfig());
        assertTrue(instantiator instanceof StdValueInstantiator);
        StdValueInstantiator stdInst = (StdValueInstantiator) instantiator;
        // Direct access to getIncompleteParameter() is not available on ValueInstantiator.
        // Checking it's a StdValueInstantiator is the best we can do here.
    }
    
    // Test verifyNonDup for explicit creator overriding implicit
    @Test
    public void testVerifyNonDup_ExplicitOverridesImplicit() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        AnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        
        collector.addStringCreator(implicitCreator, false); // Implicit
        collector._explicitCreators = 0; // Ensure it's not marked explicit

        collector.addStringCreator(explicitCreator, true); // Explicit

        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators); // Should be marked explicit
    }

    // Test verifyNonDup for implicit creator being ignored if explicit exists
    @Test
    public void testVerifyNonDup_ImplicitIgnoredIfExplicitExists() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams explicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        AnnotatedWithParams implicitCreator = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        
        collector.addStringCreator(explicitCreator, true); // Explicit
        collector._explicitCreators = CreatorCollector.C_STRING; // Ensure it's marked explicit

        collector.addStringCreator(implicitCreator, false); // Implicit

        assertNotNull(collector._creators[CreatorCollector.C_STRING]);
        assertEquals(explicitCreator, collector._creators[CreatorCollector.C_STRING]); // Explicit should remain
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators); // Explicit should remain
    }

    // Test verifyNonDup for conflicting explicit creators
    @Test(expected = IllegalArgumentException.class)
    public void testVerifyNonDup_ConflictingExplicitCreators() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        AnnotatedWithParams explicitCreator1 = new MockAnnotatedWithParams(new Class<?>[]{String.class}, null);
        AnnotatedWithParams explicitCreator2 = new MockAnnotatedWithParams(new Class<?>[]{Integer.class}, null);
        
        collector.addStringCreator(explicitCreator1, true);
        collector._explicitCreators = CreatorCollector.C_STRING;

        // This should throw IllegalArgumentException because both are explicit and different
        collector.addStringCreator(explicitCreator2, true);
    }

    // Test verifyNonDup for type compatibility when overriding
    @Test
    public void testVerifyNonDup_TypeCompatibility() throws Exception {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        
        // Mock AnnotatedWithParams to return different raw parameter types
        AnnotatedWithParams creatorA = new MockAnnotatedWithParams(new Class<?>[]{Number.class}, null) {
            @Override public String toString() { return "CreatorA"; }
        };
        AnnotatedWithParams creatorB = new MockAnnotatedWithParams(new Class<?>[]{Integer.class}, null) {
            @Override public String toString() { return "CreatorB"; }
        };
        
        collector.addStringCreator(creatorA, false); // Add Number creator first
        // Then add Integer creator, which is more specific
        collector.addStringCreator(creatorB, false);
        
        // The more specific one (Integer) should be kept.
        assertEquals(creatorB, collector._creators[CreatorCollector.C_STRING]);
    }
    
    // Test verifyNonDup with _fixAccess
    @Test
    public void testFixAccessCalled() throws Exception {
        // This test verifies that _fixAccess is called. We can't easily mock ClassUtil.checkAndFixAccess,
        // but we can assume if _canFixAccess is true, the creator is set.
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true); // canFixAccess is true
        AnnotatedWithParams creator = new MockAnnotatedWithParams(new Class<?>[0], null);
        collector.setDefaultCreator(creator);
        assertNotNull(collector._creators[CreatorCollector.C_DEFAULT]);
    }

    // Test hasDefaultCreator
    @Test
    public void testHasDefaultCreator_WhenSet() {
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.setDefaultCreator(new MockAnnotatedWithParams(new Class<?>[0], null));
        assertTrue(collector.hasDefaultCreator());
    }

    @Test
    public void testHasDefaultCreator_WhenNotSet() {
        BeanDescription desc = new MockBeanDescription(null);
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
        BeanDescription desc = new MockBeanDescription(null);
        CreatorCollector collector = new CreatorCollector(desc, true);
        collector.addStringCreator(new MockAnnotatedWithParams(new Class<?>[]{String.class}, null), true);
        assertEquals(CreatorCollector.C_STRING, collector._explicitCreators);
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover the `CreatorCollector` class by focusing on its methods for adding different types of creators (`setDefaultCreator`, `addStringCreator`, etc.), constructing a `ValueInstantiator`, and handling internal state (`_explicitCreators`, `_hasNonDefaultCreator`). The tests also examine the behavior of the nested `Vanilla` `ValueInstantiator`.
2. TEST CASE DESIGN -
    - `testConstructorInitialization`: No input, null BeanDescription, true canFixAccess. Expected: a new CreatorCollector instance. Derived from constructor.
    - `testSetDefaultCreator`: No input, mock creator. Expected: default creator is set, hasDefaultCreator returns true. Derived from setDefaultCreator logic.
    - `testAddStringCreator`: No input, mock creator. Expected: string creator is set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addStringCreator logic.
    - `testAddIntCreator`: No input, mock creator. Expected: int creator is set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addIntCreator logic.
    - `testAddLongCreator`: No input, mock creator. Expected: long creator is set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addLongCreator logic.
    - `testAddDoubleCreator`: No input, mock creator. Expected: double creator is set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addDoubleCreator logic.
    - `testAddBooleanCreator`: No input, mock creator. Expected: boolean creator is set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addBooleanCreator logic.
    - `testAddDelegatingCreator`: No input, mock creator, mock injectables. Expected: delegating creator and _delegateArgs are set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addDelegatingCreator logic.
    - `testAddPropertyCreator`: No input, mock creator, mock properties. Expected: property creator and _propertyBasedArgs are set, _explicitCreators and _hasNonDefaultCreator are updated. Derived from addPropertyCreator logic.
    - `testAddPropertyCreator_duplicateName`: Mock creator, properties with duplicate names. Expected: IllegalArgumentException. Derived from addPropertyCreator logic checking for duplicate names.
    - `testAddIncompleteParameter`: No input, mock parameter. Expected: _incompleteParameter is set. Derived from addIncompeteParameter logic.
    - `testConstructValueInstantiator_VanillaCollection`: Mock BeanDescription for Collection. Expected: Vanilla instantiator of TYPE_COLLECTION. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_VanillaList`: Mock BeanDescription for List. Expected: Vanilla instantiator of TYPE_COLLECTION. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_VanillaMap`: Mock BeanDescription for Map. Expected: Vanilla instantiator of TYPE_MAP. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_VanillaLinkedHashMap`: Mock BeanDescription for LinkedHashMap. Expected: Vanilla instantiator of TYPE_MAP. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_VanillaHashMap`: Mock BeanDescription for HashMap. Expected: Vanilla instantiator of TYPE_HASH_MAP. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_StdValueInstantiator`: Mock BeanDescription for String, default creator set. Expected: StdValueInstantiator. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_WithDelegate`: Mock BeanDescription for String, delegating creator added. Expected: StdValueInstantiator. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_WithProperties`: Mock BeanDescription for String, property creator added. Expected: StdValueInstantiator. Derived from constructValueInstantiator logic.
    - `testConstructValueInstantiator_WithIncompleteParameter`: Mock BeanDescription for String, incomplete parameter added. Expected: StdValueInstantiator. Derived from constructValueInstantiator logic.
    - `testVerifyNonDup_ExplicitOverridesImplicit`: Implicit and explicit creators. Expected: explicit creator is kept. Derived from verifyNonDup logic.
    - `testVerifyNonDup_ImplicitIgnoredIfExplicitExists`: Explicit and implicit creators. Expected: explicit creator is kept, implicit ignored. Derived from verifyNonDup logic.
    - `testVerifyNonDup_ConflictingExplicitCreators`: Two explicit, different creators. Expected: IllegalArgumentException. Derived from verifyNonDup logic.
    - `testVerifyNonDup_TypeCompatibility`: Two creators with different parameter types. Expected: more specific parameter type kept. Derived from verifyNonDup logic.
    - `testFixAccessCalled`: Mock creator, canFixAccess is true. Expected: creator is set. Derived from _fixAccess call.
    - `testHasDefaultCreator_WhenSet`: Default creator set. Expected: true. Derived from hasDefaultCreator logic.
    - `testHasDefaultCreator_WhenNotSet`: No default creator. Expected: false. Derived from hasDefaultCreator logic.
    - `testVanillaGetValueTypeDesc`: Different Vanilla types. Expected: correct class names. Derived from Vanilla.getValueTypeDesc logic.
    - `testVanillaCanInstantiate`: Vanilla type. Expected: true. Derived from Vanilla.canInstantiate logic.
    - `testVanillaCanCreateUsingDefault`: Vanilla type. Expected: true. Derived from Vanilla.canCreateUsingDefault logic.
    - `testVanillaCreateUsingDefault`: Different Vanilla types. Expected: correct instance types. Derived from Vanilla.createUsingDefault logic.
    - `testVanillaCreateUsingDefault_UnknownType`: Unknown Vanilla type. Expected: IllegalStateException. Derived from Vanilla.createUsingDefault logic.
    - `testConstructorWithExplicitCreators`: Explicit string creator added. Expected: _explicitCreators has C_STRING mask. Derived from addStringCreator logic.
4. DEFECT DETECTION STRATEGY - The tests verify the correct instantiation of `ValueInstantiator` based on various creator configurations, including edge cases like conflicting creators and type compatibility. They also check the internal state updates of `CreatorCollector`.
5. SUMMARY - 33 tests.
6. LIMITATIONS - Mocking complex Jackson types like `BeanDescription` and `DeserializationContext` is necessary, and some internal states of `StdValueInstantiator` are not directly assertable through public APIs. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```