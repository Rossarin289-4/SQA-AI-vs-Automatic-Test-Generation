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
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class CreatorCollectorTest {

    // Mock implementations for dependencies that are hard to instantiate

    

    
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

    

    // Helper to create a basic DeserializationConfig









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





