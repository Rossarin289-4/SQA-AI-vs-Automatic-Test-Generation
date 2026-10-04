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
    public void testIsIgnorableTypeMemoization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Minimal AnnotationIntrospector to define isIgnorableType behavior
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Boolean isIgnorableType(AnnotatedClass ac) {
                if (ac.getRawClass().equals(IgnorableType.class)) {
                    return Boolean.TRUE;
                }
                return null; // Default case
            }
            // Provide minimal implementations for all other abstract methods
            @Override public Set<String> findPropertiesToIgnore(AnnotatedClass ac, Class<?> beanClass, boolean forDeser) { return Collections.emptySet(); }
            @Override public JsonInclude.Value findInclusion(Annotated annotated) { return null; }
            @Override public JsonInclude.Value findInclusion(AnnotatedClass ac) { return null; }
            @Override public String findPropertyName(Annotated a) { return null; }
            @Override public String findSettablePropertyName(AnnotatedMethod am) { return null; }
            @Override public String findGettablePropertyName(AnnotatedMethod am) { return null; }
            @Override public String findDefaultPropertyName(AnnotatedField f) { return null; }
            @Override public String findDefaultPropertyName(AnnotatedParameter p) { return null; }
            @Override public String findDefaultPropertyName(AnnotatedMethod m) { return null; }
            @Override public String[] findPropertiesToIgnore(AnnotatedClass ac, boolean forDeser) { return null; }
            @Override public String[] findEnumValues(Class<?> enumClass, EnumMap<?, String> values) { return null; }
            @Override public String findEnumValue(Enum<?> value) { return null; }
            @Override public boolean hasIgnoreMarker(Annotated a) { return false; }
            @Override public boolean isIgnorableField(AnnotatedField f) { return false; }
            @Override public Object findDefaultDeserializer(Annotated a) { return null; }
            @Override public Object findDeserializer(Annotated a) { return null; }
            @Override public Object findKeyDeserializer(Annotated a) { return null; }
            @Override public Object findContentDeserializer(Annotated a) { return null; }
            @Override public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            @Override public ObjectIdInfo findObjectIdInfo(Annotated a) { return null; }
            @Override public ObjectIdGenerator.PropertyGenerator findObjectIdGenerator(Annotated a, ObjectIdInfo oi) { return null; }
            @Override public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            @Override public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            @Override public String findAnySetterMethodName(AnnotatedClass ac) { return null; }
            @Override public Method findAnySetter(AnnotatedClass ac) { return null; }
            @Override public Map<String,AnnotatedMember> findBackReferenceProperties(AnnotatedClass ac) { return null; }
            @Override public List<AnnotatedMethod> findCreators(AnnotatedClass ac) { return Collections.emptyList(); }
            @Override public List<AnnotatedMember> findProperties(AnnotatedClass ac, boolean forDeser) { return Collections.emptyList(); }
            @Override public List<AnnotatedMethod> findExternalPropertyBuilders(AnnotatedClass ac) { return Collections.emptyList(); }
            @Override public List<AnnotatedMethod> findJsonValueMethods(AnnotatedClass ac) { return Collections.emptyList(); }
            @Override public AnnotatedMethod findJsonValueMethod(AnnotatedClass ac) { return null; }
            @Override public String findNamespace(Annotated a) { return null; }
            @Override public String findFormatString(Annotated a) { return null; }
            @Override public Boolean findRequired(Annotated a) { return null; }
            @Override public TypeResolverBuilder findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            @Override public TypeDeserializer findTypeDeserializer(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) throws JsonMappingException { return null; }
            @Override public DateDeserializer.DateStyle findDateStyle(Annotated a) { return null; }
            @Override public String findFormat(Annotated a) { return null; }
            @Override public Boolean findAsProperty(Annotated a) { return null; }
            @Override public String findPropertyDescription(Annotated a) { return null; }
            @Override public Integer findIntrospector(Annotated a) { return null; }
            @Override public String findGetterName(AnnotatedMethod am) { return null; }
            @Override public String findSetterName(AnnotatedMethod am) { return null; }
            @Override public String findFieldType(AnnotatedField af) { return null; }
            @Override public String findParameterName(AnnotatedParameter ap) { return null; }
            @Override public String findJavaType(Annotated a) { return null; }
            @Override public Class<?> findNamingStrategy(AnnotatedClass ac) { return null; }
            @Override public String findDefaultValue(Annotated a) { return null; }
            @Override public String findContentDescription(Annotated a) { return null; }
            @Override public String findPropertyDescription(AnnotatedField af) { return null; }
            @Override public String findPropertyDescription(AnnotatedParameter ap) { return null; }
            @Override public String findPropertyDescription(AnnotatedMethod am) { return null; }
            @Override public Boolean findIsGetter(AnnotatedMethod am) { return null; }
            @Override public String findEnumDescription(Annotated a) { return null; }
            @Override public String findFormatDescription(Annotated a) { return null; }
            @Override public String findContentDescription(Annotated a) { return null; }
            @Override public String findValueDescription(Annotated a) { return null; }
            @Override public String findEnumMapDescription(Annotated a) { return null; }
            @Override public String findEnumValuesDescription(Annotated a) { return null; }
            @Override public String findEnum(Annotated a) { return null; }
            @Override public String findString(Annotated a) { return null; }
            @Override public String findDescription(Annotated a) { return null; }
            @Override public String findTagValue(Annotated a) { return null; }
            @Override public String findValue(Annotated a) { return null; }
            @Override public String findName(Annotated a) { return null; }
            @Override public String findAlias(Annotated a) { return null; }
            @Override public String findValueSeparator(Annotated a) { return null; }
            @Override public String findKeySeparator(Annotated a) { return null; }
            @Override public String findContentSeparator(Annotated a) { return null; }
            @Override public String findPropertySeparator(Annotated a) { return null; }
            @Override public String findObjectSeparator(Annotated a) { return null; }
            @Override public String findEnumKeySeparator(Annotated a) { return null; }
            @Override public String findEnumValuesSeparator(Annotated a) { return null; }
            @Override public String findEnumMapSeparator(Annotated a) { return null; }
            @Override public String findEnumSeparator(Annotated a) { return null; }
            @Override public String findSeparator(Annotated a) { return null; }
            @Override public String findPropertyOrder(Annotated a) { return null; }
            @Override public String[] findPropertiesOrder(Annotated a) { return null; }
            @Override public String[] findPropertyIgnoredNames(Annotated a) { return null; }
            @Override public Map<String,String> findSubTypes(Annotated a) { return null; }
            @Override public String findValueOnEmpty(Annotated a) { return null; }
            @Override public String findPropertyOnEmpty(Annotated a) { return null; }
            @Override public String findKeyOnEmpty(Annotated a) { return null; }
            @Override public String findContentOnEmpty(Annotated a) { return null; }
            @Override public String findEnumOnEmpty(Annotated a) { return null; }
            @Override public String findEnumMapOnEmpty(Annotated a) { return null; }
            @Override public String findEnumValuesOnEmpty(Annotated a) { return null; }
            @Override public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findValueSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findKeySeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findContentSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findPropertySeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findObjectSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findEnumKeySeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findEnumValuesSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findEnumMapSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findEnumSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findSeparatorOnEmpty(Annotated a) { return null; }
            @Override public String findFormatDescription(AnnotatedClass ac) { return null; }
            @Override public String findFormatDescription(AnnotatedField af) { return null; }
            @Override public String findFormatDescription(AnnotatedParameter ap) { return null; }
            @Override public String findFormatDescription(AnnotatedMethod am) { return null; }
            @Override public String findFormatDescription(AnnotatedParameter ap, String propertyName) { return null; }
            @Override public String findFormatDescription(AnnotatedMethod am, String propertyName) { return null; }
            @Override public String findFormatDescription(AnnotatedField af, String propertyName) { return null; }
            @Override public String findFormatDescription(AnnotatedClass ac, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(Annotated a) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedClass ac) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedField af) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedParameter ap) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedMethod am) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedParameter ap, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedMethod am, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedField af, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(AnnotatedClass ac, String propertyName) { return null; }
            @Override public String findPropertyDescription(Annotated a, String propertyName) { return null; }
            @Override public String findContentDescription(Annotated a, String propertyName) { return null; }
            @Override public String findValueDescription(Annotated a, String propertyName) { return null; }
            @Override public String findEnumDescription(Annotated a, String propertyName) { return null; }
            @Override public String findFormatDescription(Annotated a, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(Annotated a, String propertyName) { return null; }
            @Override public String findJavaTypeDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            @Override public String findFormatDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            @Override public String findContentDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            @Override public String findValueDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            @Override public String findEnumDescription(Annotated a, String propertyName, Class<?> type) { return null; }
            @Override public String findPropertyDescription(Annotated a, String propertyName, Class<?> type) { return null; }
        };
        mapper.setAnnotationIntrospector(ai);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        BeanDescription beanDesc = createDummyBeanDescription(mapper.constructType(Object.class), mapper);
        Map<Class<?>, Boolean> ignoredTypes = new HashMap<>();

        // Call once to populate the memoization map
        createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes);
        // Call again, it should use the memoized value without re-evaluating the annotation
        assertTrue(createFactory().isIgnorableType(ctxt.getConfig(), beanDesc, IgnorableType.class, ignoredTypes));
        // Ensure the map contains only one entry, confirming memoization
        assertEquals(1, ignoredTypes.size());
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
        public IgnorableType field1; // This field should be ignored because IgnorableType is marked as ignorable.
        public String field2;
        public String field3;
    }

    @com.fasterxml.jackson.annotation.JsonIgnoreType
    public static class IgnorableType {
    }

    public static abstract class AbstractBean { }

    public enum SampleEnum { VALUE1, VALUE2 }

    public static class ObjectIdTestClass {
        // This field will be used to test ObjectIdReader with PropertyGenerator.
        // We rely on mocking to provide the ObjectIdInfo.
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
            throw new RuntimeException("Failed to access field: " + fieldName, e);
        }
    }

    // Helper to create PropertyName
    private PropertyName propertyName(String name) {
        return PropertyName.construct(name);
    }
}





