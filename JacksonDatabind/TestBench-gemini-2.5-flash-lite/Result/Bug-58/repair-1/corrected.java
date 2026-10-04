package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;


public class BeanDeserializerFactoryTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a basic DeserializerFactory with default config
    private BeanDeserializerFactory createFactory() {
        return new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    // Helper method to create a dummy DeserializationContext
    private DeserializationContext createDummyContext() {
        return new ObjectMapper().getDeserializationContext();
    }

    // Helper method to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription(JavaType type) {
        return createDummyBeanDescription(type, new ObjectMapper());
    }
    
    private BeanDescription createDummyBeanDescription(JavaType type, ObjectMapper mapper) {
        return mapper.getDeserializationConfig().introspect(type);
    }

    @Test
    public void testDefaultInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        assertNotNull(factory);
        assertTrue(factory instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsNewInstanceWhenDifferent() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = factory.withConfig(newConfig);
        assertNotSame(factory, newFactory);
        assertTrue(newFactory instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsSameInstanceWhenSame() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        DeserializerFactory newFactory = factory.withConfig(config);
        assertSame(factory, newFactory);
    }

    @Test
    public void testCreateBeanDeserializerForKnownType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertFalse(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForAbstractTypeWithoutResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(List.class); // Abstract type
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNull(deserializer);
    }

    @Test
    public void testCreateBeanDeserializerForThrowableType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(RuntimeException.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForPotentialBeanType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(HashMap.class); // Potential bean type, though it has std deserializer
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertFalse(deserializer instanceof BeanDeserializer);
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType valueType = mapper.constructType(SampleBuilder.class);
        BeanDescription builderDesc = createDummyBeanDescription(valueType, mapper); // Bean description for the builder class itself
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        try {
            JavaType dummyValueType = mapper.constructType(Object.class);
            Class<?> dummyBuilderClass = Object.class;
            
            // Call the method to check for exceptions.
            factory.createBuilderBasedDeserializer(ctxt, dummyValueType, createDummyBeanDescription(dummyValueType, mapper), dummyBuilderClass);
            assertTrue(true); 
        } catch (Exception e) {
            fail("createBuilderBasedDeserializer threw an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testBuildBeanDeserializerWithInstantiator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(HashMap.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();
        
        JsonDeserializer<Object> builtDeserializer = factory.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(builtDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerWithObjectIdReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(ObjectIdTestClass.class); 
        
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(PropertyName.construct("id"), String.class, ObjectIdGenerators.PropertyGenerator.class, null);
        
        // Simulate a BeanDescription with ObjectIdInfo
        BeanDescription mockBeanDesc = new BasicBeanDescription(mapper.getTypeFactory(), type, mapper.getDeserializationConfig().introspect(type).getClassInfo(), Collections.emptyList()) {
            @Override
            public ObjectIdInfo getObjectIdInfo() {
                return objectIdInfo;
            }
        };

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, mockBeanDesc);
        factory.addObjectIdReader(ctxt, mockBeanDesc, builder);
        
        assertNotNull(builder.getObjectIdReader());
        assertEquals(propertyName("id"), builder.getObjectIdReader().propertyName);
        assertEquals(String.class, builder.getObjectIdReader().getIdType().getRawClass());
    }

    @Test
    public void testBuildThrowableDeserializerWithInitCause() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Exception.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testBuildThrowableDeserializerIgnoresLocalizedMessage() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Exception.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testBuildThrowableDeserializerIgnoresSuppressed() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Exception.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testBuildThrowableDeserializerIgnoresMessage() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Exception.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        JsonDeserializer<Object> deserializer = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testConstructBeanDeserializerBuilder() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        assertNotNull(builder);
        assertTrue(builder instanceof BeanDeserializerBuilder);
    }

    @Test
    public void testAddBeanPropsWithIgnoredProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) {
                return Collections.singleton("field2"); // Ignore field2
            }
            // Other methods from AnnotationIntrospector must be implemented or overridden
            // to avoid compilation errors. For this test, only findPropertiesToIgnore is relevant.
            // We'll provide minimal implementations for other required methods.
            public Boolean isIgnorableType(AnnotatedClass ac) { return null; }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        ctxt = mapper.getDeserializationContext(); 

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        
        factory.addBeanProps(ctxt, beanDesc, builder);
        
        Set<String> ignoredProps = (Set<String>) getField(builder, "_ignorableProps");
        assertNotNull(ignoredProps);
        assertTrue(ignoredProps.contains("field2"));
    }
    
    @Test
    public void testAddBeanPropsWithAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithAnySetter.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        
        factory.addBeanProps(ctxt, beanDesc, builder);
        
        assertNotNull(builder.getAnySetter());
        assertEquals("anySet", builder.getAnySetter().getPropertyName().getSimpleName());
    }

    @Test
    public void testAddBeanPropsWithConstructorParameter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithCtorParam.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        
        factory.addBeanProps(ctxt, beanDesc, builder);
        
        SettableBeanProperty idProp = builder.findProperty(propertyName("id"));
        assertNotNull(idProp);
        assertTrue(idProp instanceof CreatorProperty);
    }

    @Test
    public void testFilterBeanPropsIgnoresExplicitlyNamedProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) {
                return Collections.singleton("field1");
            }
            // Minimal implementations for other required methods
            public Boolean isIgnorableType(AnnotatedClass ac) { return null; }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        ctxt = mapper.getDeserializationContext();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        
        List<BeanPropertyDefinition> filteredProps = factory.filterBeanProps(ctxt, beanDesc, builder, props, new HashSet<>(Arrays.asList("field1")));
        
        assertEquals(1, filteredProps.size()); 
        assertEquals("field2", filteredProps.get(0).getName()); 
    }
    
    @Test
    public void testFilterBeanPropsIgnoresIgnorableTypes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithIgnorableType.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Boolean isIgnorableType(AnnotatedClass ac) {
                if (ac.getRawClass().equals(IgnorableType.class)) {
                    return Boolean.TRUE;
                }
                return null; // Default case
            }
            // Minimal implementations for other required methods
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        ctxt = mapper.getDeserializationContext();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        
        List<BeanPropertyDefinition> filteredProps = factory.filterBeanProps(ctxt, beanDesc, builder, props, new HashSet<>());
        
        assertEquals(1, filteredProps.size()); 
        assertEquals("field3", filteredProps.get(0).getName());
    }
    
    @Test
    public void testAddReferenceProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithBackReference.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        
        factory.addReferenceProperties(ctxt, beanDesc, builder);
        
        Map<String, SettableBeanProperty> backRefs = (Map<String, SettableBeanProperty>) getField(builder, "_backRefProperties");
        assertNotNull(backRefs);
        assertTrue(backRefs.containsKey("ref"));
    }

    @Test
    public void testAddInjectables() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithInjectable.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        
        factory.addInjectables(ctxt, beanDesc, builder);
        
        List<ValueInjector> injectables = (List<ValueInjector>) getField(builder, "_injectables");
        assertNotNull(injectables);
        assertEquals(1, injectables.size());
        assertEquals("myValueId", injectables.get(0).getValueId());
    }

    @Test
    public void testConstructAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBeanWithAnySetter.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotatedMethod setter = beanDesc.findAnySetter();
        assertNotNull(setter);

        SettableAnyProperty anySetter = factory.constructAnySetter(ctxt, beanDesc, setter);
        assertNotNull(anySetter);
        assertEquals("anySet", anySetter.getPropertyName().getSimpleName());
    }

    @Test
    public void testConstructSettablePropertyFromMethod() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotatedMethod setter = null;
        for (BeanPropertyDefinition propDef : beanDesc.findProperties()) {
            if (propDef.hasSetter() && "field1".equals(propDef.getName())) {
                setter = (AnnotatedMethod) propDef.getNonConstructorMutator();
                break;
            }
        }
        assertNotNull(setter);
        
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(ctxt.getConfig(), setter);
        JavaType propType = setter.getParameterType(0);

        SettableBeanProperty prop = factory.constructSettableProperty(ctxt, beanDesc, propDef, propType);
        assertNotNull(prop);
        assertTrue(prop instanceof MethodProperty);
        assertEquals("field1", prop.getName());
    }

    @Test
    public void testConstructSettablePropertyFromField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotatedField field = null;
        for (BeanPropertyDefinition propDef : beanDesc.findProperties()) {
            if (propDef.hasField() && "field2".equals(propDef.getName())) {
                field = (AnnotatedField) propDef.getMutator();
                break;
            }
        }
        assertNotNull(field);
        
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(ctxt.getConfig(), field);
        JavaType propType = field.getType();

        SettableBeanProperty prop = factory.constructSettableProperty(ctxt, beanDesc, propDef, propType);
        assertNotNull(prop);
        assertTrue(prop instanceof FieldProperty);
        assertEquals("field2", prop.getName());
    }

    @Test
    public void testConstructSetterlessProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(type, mapper);
        DeserializationContext ctxt = createDummyContext();
        BeanDeserializerFactory factory = createFactory();

        AnnotatedMethod getter = null;
        for (BeanPropertyDefinition propDef : beanDesc.findProperties()) {
            if (propDef.hasGetter() && !propDef.hasSetter() && "field3".equals(propDef.getName())) {
                getter = propDef.getGetter();
                break;
            }
        }
        assertNotNull(getter);
        
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(ctxt.getConfig(), getter);

        SettableBeanProperty prop = factory.constructSetterlessProperty(ctxt, beanDesc, propDef);
        assertNotNull(prop);
        assertTrue(prop instanceof SetterlessProperty);
        assertEquals("field3", prop.getName());
    }

    @Test
    public void testIsPotentialBeanTypePositive() {
        assertTrue(createFactory().isPotentialBeanType(SampleBean.class));
        assertTrue(createFactory().isPotentialBeanType(Object.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypePrimitive() {
        createFactory().isPotentialBeanType(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeAbstractClass() {
        createFactory().isPotentialBeanType(AbstractBean.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeInterface() {
        createFactory().isPotentialBeanType(List.class);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeEnum() {
        createFactory().isPotentialBeanType(SampleEnum.class);
    }

    @Test
    public void testIsIgnorableTypeTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Boolean isIgnorableType(AnnotatedClass ac) {
                if (ac.getRawClass().equals(IgnorableType.class)) {
                    return Boolean.TRUE;
                }
                return null; // Default case
            }
             // Minimal implementations for other required methods
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDescription beanDesc = createDummyBeanDescription(mapper.constructType(Object.class), mapper);
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();

        assertTrue(createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes));
    }

    @Test
    public void testIsIgnorableTypeFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Boolean isIgnorableType(AnnotatedClass ac) {
                if (ac.getRawClass().equals(IgnorableType.class)) {
                    return Boolean.FALSE; // Explicitly not ignorable
                }
                return null; // Default case
            }
            // Minimal implementations for other required methods
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDescription beanDesc = createDummyBeanDescription(mapper.constructType(Object.class), mapper);
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();

        assertFalse(createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes));
    }

    @Test
    public void testIsIgnorableTypeDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            // No annotation to mark as ignorable
            public Boolean isIgnorableType(AnnotatedClass ac) { return null; }
            // Minimal implementations for other required methods
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDescription beanDesc = createDummyBeanDescription(mapper.constructType(Object.class), mapper);
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();

        assertFalse(createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, SampleBean.class, ignoredTypes));
    }

    @Test
    public void testIsIgnorableTypeMemoization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Boolean isIgnorableType(AnnotatedClass ac) {
                if (ac.getRawClass().equals(IgnorableType.class)) {
                    return Boolean.TRUE;
                }
                return null; // Default case
            }
            // Minimal implementations for other required methods
            public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            public String findPropertyName(Annotated a) { return null; }
            public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            public String findDefaultPropertyName(AnnotatedField f) { return null; }
            public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            public String findEnumValue(Enum<?> value) { return null; }
            public boolean hasIgnoreMarker(Annotated a) { return false; }
            public boolean isIgnorableField(AnnotatedField f) { return false; }
            public Object findDefaultDeserializer(Annotated a) { return null; }
            public Object findDeserializer(Annotated a) { return null; }
            public Object findKeyDeserializer(Annotated a) { return null; }
            public Object findContentDeserializer(Annotated a) { return null; }
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            public Method findAnySetter(AnnotatedClass ac) { return null; }
            public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            public String findNamespace(Annotated a) { return null; }
            public String findFormatString(Annotated a) { return null; }
            public Boolean findRequired(Annotated a) { return null; }
            public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            public String findFormat(Annotated a) { return null; }
            public Boolean findAsProperty(Annotated a) { return null; }
            public String findPropertyDescription(Annotated a) { return null; }
            public Integer findIntrospector(Annotated a) { return null; }
            public String findGetterName(AnnotatedMethod am) { return null; }
            public String findSetterName(AnnotatedMethod am) { return null; }
            public String findFieldType(AnnotatedField af) { return null; }
            public String findParameterName(AnnotatedParameter ap) { return null; }
            public String findJavaType(Annotated a) { return null; }
            public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            public String findDefaultValue(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findPropertyDescription(AnnotatedField af) { return null; }
            public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            public String findPropertyDescription(AnnotatedMethod am) { return null; }
            public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            public String findEnumDescription(Annotated a) { return null; }
            public String findFormatDescription(Annotated a) { return null; }
            public String findContentDescription(Annotated a) { return null; }
            public String findValueDescription(Annotated a) { return null; }
            public String findEnumMapDescription(Annotated a) { return null; }
            public String findEnumValuesDescription(Annotated a) { return null; }
            public String findEnum(Annotated a) { return null; }
            public String findString(Annotated a) { return null; }
            public String findDescription(Annotated a) { return null; }
            public String findTagValue(Annotated a) { return null; }
            public String findValue(Annotated a) { return null; }
            public String findName(Annotated a) { return null; }
            public String findAlias(Annotated a) { return null; }
            public String findValueSeparator(Annotated a) { return null; }
            public String findKeySeparator(Annotated a) { return null; }
            public String findContentSeparator(Annotated a) { return null; }
            public String findPropertySeparator(Annotated a) { return null; }
            public String findObjectSeparator(Annotated a) { return null; }
            public String findEnumKeySeparator(Annotated a) { return null; }
            public String findEnumValuesSeparator(Annotated a) { return null; }
            public String findEnumMapSeparator(Annotated a) { return null; }
            public String findEnumSeparator(Annotated a) { return null; }
            public String findSeparator(Annotated a) { return null; }
            public String findPropertyOrder(Annotated a) { return null; }
            public String[] findPropertiesOrder(Annotated a) { return null; }
            public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            public Map<String,String> findSubTypes(Annotated a) { return null; }
            public String findValueOnEmpty(Annotated a) { return null; }
            public String findPropertyOnEmpty(Annotated a) { return null; }
            public String findKeyOnEmpty(Annotated a) { return null; }
            public String findContentOnEmpty(Annotated a) { return null; }
            public String findEnumOnEmpty(Annotated a) { return null; }
            public String findEnumMapOnEmpty(Annotated a) { return null; }
            public String findEnumValuesOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            public String findSeparatorOnEmpty(Annotated a) { return null; }
            public String findFormatDescription(AnnotatedClass ac) { return null; }
            public String findFormatDescription(AnnotatedField af) { return null; }
            public String findFormatDescription(AnnotatedParameter ap) { return null; }
            public String findFormatDescription(AnnotatedMethod am) { return null; }
            public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            public String findJavaTypeDescription(AnnotatedField af) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            public String findContentDescription(Annotated a, String propertyName) { return null; }
            public String findValueDescription(Annotated a, String propertyName) { return null; }
            public String findEnumDescription(Annotated a, String propertyName) { return null; }
            public String findFormatDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDescription beanDesc = createDummyBeanDescription(mapper.constructType(Object.class), mapper);
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();

        // Call once to populate the map
        createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes);
        // Call again, should use memoized value
        assertTrue(createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes));
        assertEquals(1, ignoredTypes.size()); // Only one entry should be present
    }

    // Dummy classes for testing purposes

    public static class SampleBean {
        private String field1;
        public String field2;
        protected String field3;

        public String getField1() { return field1; }
        public void setField1(String field1) { this.field1 = field1; }
        
        public String getField3() { return field3; }
    }

    public static class SampleBeanWithAnySetter {
        private String value;
        
        public void anySet(String name, Object val) {
            this.value = val.toString(); 
        }
    }

    public static class SampleBeanWithCtorParam {
        private int id;
        
        public SampleBeanWithCtorParam(int id) {
            this.id = id;
        }
    }

    public static class SampleBeanWithBackReference {
        @com.fasterxml.jackson.annotation.JsonBackReference("ref")
        public SampleBean other; 
    }
    
    public static class SampleBeanWithInjectable {
        @com.fasterxml.jackson.annotation.JacksonInject("myValueId")
        public String injectedField;
    }

    public static class SampleBeanWithIgnorableType {
        public IgnorableType field1;
        public String field2;
        public String field3;
    }

    @com.fasterxml.jackson.annotation.JsonIgnoreType
    public static class IgnorableType {
    }

    public static abstract class AbstractBean { }

    public enum SampleEnum { VALUE1, VALUE2 }

    public static class ObjectIdTestClass {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        // This annotation is not directly available in API outline, using a placeholder if needed.
        // Assuming it's for testing ObjectIdGenerator.PropertyGenerator.
        // A real annotation might be different or require specific configuration.
        // For now, we rely on the mock BeanDescription to provide ObjectIdInfo.
        public String id;
    }

    public static class SampleBuilder {
        private String property;

        public void setProperty(String property) {
            this.property = property;
        }

        public String build() {
            return this.property;
        }
    }
    
    // Helper to access private fields for testing
    private Object getField(Object obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to create PropertyName
    private PropertyName propertyName(String name) {
        return PropertyName.construct(name);
    }
}
