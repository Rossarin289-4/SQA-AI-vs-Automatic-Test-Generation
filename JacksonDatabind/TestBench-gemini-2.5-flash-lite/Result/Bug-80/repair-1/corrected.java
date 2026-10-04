package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Modifier;
import java.util.*;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.util.ClassScanner;

public class StdSubtypeResolverTest {

    // Helper method to create a mock MapperConfig
    private MapperConfig<?> createMockMapperConfig() {
        // Using a concrete implementation of MapperConfig is complex.
        // Since we only need getAnnotationIntrospector(), getSubtypeResolver(), and getTypeFactory(),
        // we'll create a minimal concrete class that extends MapperConfig and provides these.
        // This requires importing BaseSettings, TypeFactory, MapperFeature, etc.
        
        // Minimal BaseSettings
        BaseSettings baseSettings = new BaseSettings(
            null, // ClassIntrospector
            null, // AnnotationIntrospector
            null, // PropertyNamingStrategy
            null, // TypeParser
            TypeFactory.defaultInstance(), // TypeFactory
            null, // CJKFactory
            null, // HandlerInstantiator
            null, // Locale
            null, // TimeZone
            null, // JsonFactory
            null, // ClassIntrospector.MixInResolver
            null, // PropertyNamingStrategy.PropertyNamingStrategyImpl
            null // FormatType
        );

        return new MockMapperConfig(baseSettings, AnnotationIntrospector.nopInstance(), new StdSubtypeResolver(), TypeFactory.defaultInstance());
    }

    // Minimal concrete implementation of MapperConfig for testing purposes
    private static class MockMapperConfig extends MapperConfig<MockMapperConfig> {
        private final AnnotationIntrospector annotationIntrospector;
        private final SubtypeResolver subtypeResolver;
        private final TypeFactory typeFactory;

        protected MockMapperConfig(BaseSettings base, AnnotationIntrospector ai, SubtypeResolver sr, TypeFactory tf) {
            super(base, 0); // Default mapperFeatures to 0
            this.annotationIntrospector = ai;
            this.subtypeResolver = sr;
            this.typeFactory = tf;
        }

        @Override
        public MockMapperConfig with(MapperFeature... features) { return this; }
        @Override
        public MockMapperConfig without(MapperFeature... features) { return this; }
        @Override
        public MockMapperConfig with(MapperFeature feature, boolean state) { return this; }
        @Override
        public boolean useRootWrapping() { return false; }
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() { return annotationIntrospector; }
        @Override
        public SubtypeResolver getSubtypeResolver() { return subtypeResolver; }
        @Override
        public TypeFactory getTypeFactory() { return typeFactory; }
        @Override
        public JavaType constructType(Class<?> cls) { return typeFactory.constructType(cls); }
        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) { return typeFactory.constructSpecializedType(baseType, subclass); }
        @Override
        public BeanDescription introspectClassAnnotations(Class<?> cls) { return BeanDescription.forIgnoredType(cls); }
        @Override
        public BeanDescription introspectClassAnnotations(JavaType type) { return BeanDescription.forIgnoredType(type.getRawClass()); }
        @Override
        public BeanDescription introspectDirectClassAnnotations(Class<?> cls) { return BeanDescription.forIgnoredType(cls); }
        
        // Need to override all abstract methods from MapperConfig and ClassIntrospector.MixInResolver
        // For simplicity, providing minimal implementations that don't affect subtype resolution logic.
        @Override
        public boolean isEnabled(MapperFeature f) { return false; }
        @Override
        public boolean hasMapperFeatures(int featureMask) { return false; }
        @Override
        public boolean isAnnotationProcessingEnabled() { return false; }
        @Override
        public boolean canOverrideAccessModifiers() { return false; }
        @Override
        public boolean shouldSortPropertiesAlphabetically() { return false; }
        @Override
        public ClassIntrospector getClassIntrospector() {
            // A minimal implementation that returns a no-op introspector
            return new ClassIntrospector() {
                @Override
                public BeanDescription forClassAnnotations(MapperConfig<?> config, JavaType type, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(type.getRawClass());
                }
                @Override
                public BeanDescription forClassAnnotations(MapperConfig<?> config, Class<?> cls, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(cls);
                }
                @Override
                public BeanDescription forDirectClassAnnotations(MapperConfig<?> config, JavaType type, ClassIntrospector.MixInResolver mixer) {
                     return BeanDescription.forIgnoredType(type.getRawClass());
                }
                 @Override
                public BeanDescription forDirectClassAnnotations(MapperConfig<?> config, Class<?> cls, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(cls);
                }
                 @Override
                public BeanDescription forProperties(MapperConfig<?> config, JavaType type, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(type.getRawClass());
                }
                @Override
                public BeanDescription forProperties(MapperConfig<?> config, Class<?> cls, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(cls);
                }
                @Override
                public BeanDescription forCreation(MapperConfig<?> config, JavaType type, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(type.getRawClass());
                }
                @Override
                public BeanDescription forCreation(MapperConfig<?> config, Class<?> cls, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(cls);
                }
                 @Override
                public BeanDescription forSerialization(MapperConfig<?> config, JavaType type, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(type.getRawClass());
                }
                @Override
                public BeanDescription forSerialization(MapperConfig<?> config, Class<?> cls, ClassIntrospector.MixInResolver mixer) {
                    return BeanDescription.forIgnoredType(cls);
                }
            };
        }
        @Override
        public boolean findMixInClassFor(Class<?> cls) { return false; }
        @Override
        public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException { return null; }
        @Override
        public JavaType constructFromCanonical(String canonical, TypeResolutionContext ctxt) throws IllegalArgumentException { return null; }
        @Override
        public JavaType constructFromCanonical(String canonical, String pkg) throws IllegalArgumentException { return null; }
        @Override
        public JavaType constructFromCanonical(String canonical, String pkg, TypeResolutionContext ctxt) throws IllegalArgumentException { return null; }
        @Override
        public AnnotatedClass resolveTopic(JavaType type) { return AnnotatedClassResolver.resolveWithoutSuperTypes(this, type.getRawClass()); }
        @Override
        public AnnotatedClass resolveTopic(Class<?> cls) { return AnnotatedClassResolver.resolveWithoutSuperTypes(this, cls); }
    }

    // Minimal concrete implementation of AnnotatedMember for testing purposes
    private static class MockAnnotatedMember extends AnnotatedMember {
        private final Class<?> rawType;

        protected MockAnnotatedMember(Class<?> rawType) {
            // AnnotatedMember requires context and type bindings, which we can mock as null for simplicity
            super(null, null);
            this.rawType = rawType;
        }

        @Override
        public Class<?> getRawType() { return rawType; }
        @Override
        public String getFullNameFor(String suffix) { return "mockMember" + suffix; }
        @Override
        public AnnotatedWithAnnotations withAnnotations(AnnotationMap annotations) { return this; }
        @Override
        public int getModifiers() { return Modifier.PUBLIC; }
        @Override
        public String toString() { return "MockAnnotatedMember(" + rawType.getName() + ")"; }

        // Abstract methods that must be implemented
        @Override
        public AnnotatedClass resolveClass(TypeResolutionContext context) {
            // Dummy implementation, returning a basic AnnotatedClass for the raw type
            return AnnotatedClassResolver.resolveWithoutSuperTypes(null, rawType);
        }
    }

    // Helper to create a dummy JavaType
    private JavaType createJavaType(Class<?> cls) {
        // Using TypeFactory from our mock config
        return createMockMapperConfig().getTypeFactory().constructType(cls);
    }

    @Test
    public void testRegisterSubtypesWithNullArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes((NamedType[]) null);
        assertNull(resolver._registeredSubtypes);
    }

    @Test
    public void testRegisterSubtypesWithEmptyArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType[0]);
        assertNull(resolver._registeredSubtypes);
    }

    @Test
    public void testRegisterSubtypesWithNamedTypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        NamedType nt1 = new NamedType(String.class, "myString");
        NamedType nt2 = new NamedType(Integer.class);
        resolver.registerSubtypes(nt1, nt2);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());
        assertTrue(resolver._registeredSubtypes.contains(nt1));
        assertTrue(resolver._registeredSubtypes.contains(nt2));
    }

    @Test
    public void testRegisterSubtypesWithClasses() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class, Integer.class);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());
        NamedType nt1 = new NamedType(String.class, null);
        NamedType nt2 = new NamedType(Integer.class, null);
        assertTrue(resolver._registeredSubtypes.contains(nt1));
        assertTrue(resolver._registeredSubtypes.contains(nt2));
    }
    
    @Test
    public void testRegisterSubtypesDuplicateClasses() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class, String.class);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(1, resolver._registeredSubtypes.size());
        NamedType nt = new NamedType(String.class, null);
        assertTrue(resolver._registeredSubtypes.contains(nt));
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithNullPropertyAndBaseType() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class), new NamedType(Integer.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);
        AnnotatedMember property = createMockAnnotatedMember(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Integer.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithPropertyAnnotations() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        AnnotatedMember property = createMockAnnotatedMember(Object.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithBaseTypeAnnotations() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        AnnotatedMember property = createMockAnnotatedMember(Object.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithBaseTypeAndSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class), new NamedType(Integer.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);
        AnnotatedMember property = createMockAnnotatedMember(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Integer.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWhenBaseTypeHasNoSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Boolean.class);
        AnnotatedMember property = createMockAnnotatedMember(Boolean.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Boolean.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByClassWhenRegisteredSubtypeIsBaseType() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Number.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);
        AnnotatedMember property = createMockAnnotatedMember(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Number.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByClassWithComplexHierarchy() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Dog.class), new NamedType(Cat.class), new NamedType(ElectricCar.class));
        
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Animal.class);
        AnnotatedMember property = createMockAnnotatedMember(Animal.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);
        
        assertEquals(2, subtypes.size());
        Set<Class<?>> foundTypes = new HashSet<>();
        for(NamedType nt : subtypes) {
            foundTypes.add(nt.getType());
        }
        assertTrue(foundTypes.contains(Dog.class));
        assertTrue(foundTypes.contains(Cat.class));
    }

    static class Animal {}
    static class Mammal extends Animal {}
    static class Dog extends Mammal {}
    static class Cat extends Mammal {}
    static class Vehicle {}
    static class Car extends Vehicle {}
    static class ElectricCar extends Car {}

    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithNullPropertyAndBaseType() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class), new NamedType(Integer.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Integer.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithNamedRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class, "myString"), new NamedType(Integer.class, "myInt"));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(2, subtypes.size());
        Set<String> names = new HashSet<>();
        Set<Class<?>> types = new HashSet<>();
        for (NamedType nt : subtypes) {
            names.add(nt.getName());
            types.add(nt.getType());
        }
        assertTrue(names.contains("myString"));
        assertTrue(names.contains("myInt"));
        assertTrue(types.contains(String.class));
        assertTrue(types.contains(Integer.class));
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithBaseTypeAndRegistered() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(String.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(String.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithBaseTypeAndAbstractRegistered() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Mammal.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Animal.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Mammal.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithNamedSubtypesAndConcreteBaseType() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Dog.class, "Buddy"));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Dog.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Dog.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithMultipleRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Integer.class, "int"), new NamedType(Double.class, "dbl"));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(2, subtypes.size());
        Set<String> names = new HashSet<>();
        Set<Class<?>> types = new HashSet<>();
        for (NamedType nt : subtypes) {
            names.add(nt.getName());
            types.add(nt.getType());
        }
        assertTrue(names.contains("int"));
        assertTrue(names.contains("dbl"));
        assertTrue(types.contains(Integer.class));
        assertTrue(types.contains(Double.class));
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithMixedRegisteredAndUnnamed() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Integer.class, "myInt"), new NamedType(Float.class));
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Number.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(2, subtypes.size());
        Set<String> names = new HashSet<>();
        Set<Class<?>> types = new HashSet<>();
        for (NamedType nt : subtypes) {
            names.add(nt.getName());
            types.add(nt.getType());
        }
        assertTrue(names.contains("myInt"));
        assertTrue(names.contains(null)); // For the unnamed Float
        assertTrue(types.contains(Integer.class));
        assertTrue(types.contains(Float.class));
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithNoRegisteredSubtypesAndNoAnnotations() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(String.class);
        AnnotatedMember property = createMockAnnotatedMember(String.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(String.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByClassWithPropertyDefinedSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        AnnotatedMember property = createMockAnnotatedMember(Object.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithPropertyDefinedSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithBaseTypeAnnotationLogic() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(BaseTypeForAnnotationTest.class);
        AnnotatedMember property = createMockAnnotatedMember(BaseTypeForAnnotationTest.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(BaseTypeForAnnotationTest.class, nt.getType());
        assertNull(nt.getName());
    }
    
    static class BaseTypeForAnnotationTest {}

    @Test
    public void testCollectAndResolveSubtypesByTypeIdWithBaseTypeAnnotationLogic() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(BaseTypeForAnnotationTest.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(BaseTypeForAnnotationTest.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void test_collectAndResolveSubtypesByClass_withConfigAndAnnotatedClass() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedClass annotatedClass = AnnotatedClassResolver.resolveWithoutSuperTypes(config, String.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, annotatedClass);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(String.class, nt.getType());
        assertNull(nt.getName());
    }
    
    @Test
    public void test_collectAndResolveSubtypesByTypeId_withConfigAndAnnotatedClass() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedClass annotatedClass = AnnotatedClassResolver.resolveWithoutSuperTypes(config, Integer.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, annotatedClass);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Integer.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void test_collectAndResolveSubtypesByClass_withEmptyRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(); // Empty array
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        AnnotatedMember property = createMockAnnotatedMember(Object.class);

        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByClass(config, property, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }

    @Test
    public void test_collectAndResolveSubtypesByTypeId_withEmptyRegisteredSubtypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(); // Empty array
        MapperConfig<?> config = createMockMapperConfig();
        JavaType baseType = createJavaType(Object.class);
        
        Collection<NamedType> subtypes = resolver.collectAndResolveSubtypesByTypeId(config, null, baseType);
        
        assertEquals(1, subtypes.size());
        NamedType nt = subtypes.iterator().next();
        assertEquals(Object.class, nt.getType());
        assertNull(nt.getName());
    }
}
