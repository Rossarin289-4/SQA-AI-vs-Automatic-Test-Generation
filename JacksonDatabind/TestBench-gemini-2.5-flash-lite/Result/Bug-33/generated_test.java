package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class JacksonAnnotationIntrospectorTest {

    // Test for version()
    @Test
    public void testVersion() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        Version version = ai.version();
        assertNotNull(version);
        assertFalse(version.toString().isEmpty());
    }

    // Test for isAnnotationBundle() with a JacksonAnnotationsInside annotation

    // Test for isAnnotationBundle() without a JacksonAnnotationsInside annotation
    
    // Test for findEnumValue() with a custom JsonProperty

    // Test for findEnumValue() without a custom JsonProperty

    // Test for findRootName() with JsonRootName annotation
    @Test
    public void testFindRootName_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        @JsonRootName("customRoot")
        class AnnotatedMyClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(AnnotatedMyClass.class, ai, null);
        
        PropertyName rootName = ai.findRootName(ac);
        assertNotNull(rootName);
        assertEquals("customRoot", rootName.getSimpleName());
    }
    
    // Test for findRootName() without JsonRootName annotation
    @Test
    public void testFindRootName_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyClass.class, ai, null);
        
        assertNull(ai.findRootName(ac));
    }

    // Test findPropertiesToIgnore for serialization
    @Test
    public void testFindPropertiesToIgnore_Serialization() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IgnorableProperties {
            @JsonIgnoreProperties({"field1", "field2"})
            class MyClass {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IgnorableProperties.MyClass.class, ai, null);
        String[] ignored = ai.findPropertiesToIgnore(ac, true);
        assertNotNull(ignored);
        assertArrayEquals(new String[]{"field1", "field2"}, ignored);
    }

    // Test findPropertiesToIgnore for deserialization
    @Test
    public void testFindPropertiesToIgnore_Deserialization() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IgnorableProperties {
            @JsonIgnoreProperties(value = {"field1", "field2"}, allowSetters = true)
            class MyClass {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IgnorableProperties.MyClass.class, ai, null);
        String[] ignored = ai.findPropertiesToIgnore(ac, false);
        assertNotNull(ignored);
        assertArrayEquals(new String[]{"field1", "field2"}, ignored);
    }
    
    // Test findIgnoreUnknownProperties when true
    @Test
    public void testFindIgnoreUnknownProperties_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IgnoreUnknown {
            @JsonIgnoreProperties(ignoreUnknown = true)
            class MyClass {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IgnoreUnknown.MyClass.class, ai, null);
        assertTrue(ai.findIgnoreUnknownProperties(ac));
    }

    // Test findIgnoreUnknownProperties when false
    @Test
    public void testFindIgnoreUnknownProperties_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IgnoreUnknown {
            @JsonIgnoreProperties(ignoreUnknown = false)
            class MyClass {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IgnoreUnknown.MyClass.class, ai, null);
        assertFalse(ai.findIgnoreUnknownProperties(ac));
    }
    
    // Test isIgnorableType when true
    @Test
    public void testIsIgnorableType_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonIgnoreType
        class MyType {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyType.class, ai, null);
        assertTrue(ai.isIgnorableType(ac));
    }

    // Test isIgnorableType when false
    @Test
    public void testIsIgnorableType_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonIgnoreType(value = false)
        class MyType {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyType.class, ai, null);
        assertFalse(ai.isIgnorableType(ac));
    }

    // Test findFilterId with a non-empty value
    @Test
    public void testFindFilterId_WithValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        @JsonFilter("myFilter")
        class AnnotatedMyClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(AnnotatedMyClass.class, ai, null);
        assertEquals("myFilter", ai.findFilterId(ac));
    }
    
    // Test findFilterId with an empty value (should be null)
    @Test
    public void testFindFilterId_WithEmptyValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        @JsonFilter("")
        class AnnotatedMyClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(AnnotatedMyClass.class, ai, null);
        assertNull(ai.findFilterId(ac));
    }

    // Test findNamingStrategy with JsonNaming annotation
    
    // Test findNamingStrategy without JsonNaming annotation
    @Test
    public void testFindNamingStrategy_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyClass.class, ai, null);
        assertNull(ai.findNamingStrategy(ac));
    }

    // Test findAutoDetectVisibility with JsonAutoDetect annotation
    
    // Test findAutoDetectVisibility without JsonAutoDetect annotation
    @Test
    public void testFindAutoDetectVisibility_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyClass {}
        
        VisibilityChecker<?> defaultChecker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> checker = ai.findAutoDetectVisibility(AnnotatedClass.construct(MyClass.class, ai, null), defaultChecker);
        
        assertSame(defaultChecker, checker);
    }
    
    // Test hasIgnoreMarker for a field annotated with JsonIgnore
    @Test
    public void testHasIgnoreMarker_WithJsonIgnore() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IgnorableField {
            @JsonIgnore
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IgnorableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertTrue(ai.hasIgnoreMarker(annotatedField));
    }
    
    // Test hasIgnoreMarker for a field without JsonIgnore
    @Test
    public void testHasIgnoreMarker_WithoutJsonIgnore() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NonIgnorableField {
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NonIgnorableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertFalse(ai.hasIgnoreMarker(annotatedField));
    }

    // Test hasRequiredMarker for a property marked as required
    @Test
    public void testHasRequiredMarker_Required() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class RequiredField {
            @JsonProperty(required = true)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(RequiredField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertTrue(ai.hasRequiredMarker(annotatedField));
    }
    
    // Test hasRequiredMarker for a property not marked as required
    @Test
    public void testHasRequiredMarker_NotRequired() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NotRequiredField {
            @JsonProperty(required = false)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NotRequiredField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertFalse(ai.hasRequiredMarker(annotatedField));
    }
    
    // Test hasRequiredMarker when annotation is not present
    @Test
    public void testHasRequiredMarker_NoAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoAnnotationField {
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NoAnnotationField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertNull(ai.hasRequiredMarker(annotatedField));
    }

    // Test findPropertyAccess for READ_ONLY
    @Test
    public void testFindPropertyAccess_ReadOnly() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AccessProperty {
            @JsonProperty(access = JsonProperty.Access.READ_ONLY)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AccessProperty.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(annotatedField));
    }

    // Test findPropertyAccess for WRITE_ONLY
    @Test
    public void testFindPropertyAccess_WriteOnly() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AccessProperty {
            @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AccessProperty.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals(JsonProperty.Access.WRITE_ONLY, ai.findPropertyAccess(annotatedField));
    }
    
    // Test findPropertyAccess for AUTO
    @Test
    public void testFindPropertyAccess_Auto() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AccessProperty {
            @JsonProperty(access = JsonProperty.Access.AUTO)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AccessProperty.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals(JsonProperty.Access.AUTO, ai.findPropertyAccess(annotatedField));
    }

    // Test findPropertyDescription
    @Test
    public void testFindPropertyDescription() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class DescribedField {
            @JsonPropertyDescription("A description for this field")
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DescribedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals("A description for this field", ai.findPropertyDescription(annotatedField));
    }
    
    // Test findPropertyIndex
    @Test
    public void testFindPropertyIndex() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IndexedField {
            @JsonProperty(index = 5)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IndexedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals(Integer.valueOf(5), ai.findPropertyIndex(annotatedField));
    }
    
    // Test findPropertyIndex when index is unknown
    @Test
    public void testFindPropertyIndex_Unknown() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class IndexedField {
            @JsonProperty(index = JsonProperty.INDEX_UNKNOWN)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(IndexedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertNull(ai.findPropertyIndex(annotatedField));
    }

    // Test findPropertyDefaultValue
    @Test
    public void testFindPropertyDefaultValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class DefaultValueField {
            @JsonProperty(defaultValue = "default")
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DefaultValueField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertEquals("default", ai.findPropertyDefaultValue(annotatedField));
    }
    
    // Test findPropertyDefaultValue when defaultValue is empty string
    @Test
    public void testFindPropertyDefaultValue_Empty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class DefaultValueField {
            @JsonProperty(defaultValue = "")
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DefaultValueField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertNull(ai.findPropertyDefaultValue(annotatedField));
    }

    // Test findFormat with JsonFormat annotation
    @Test
    public void testFindFormat_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class FormattedField {
            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
            public Date dateField;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(FormattedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("dateField")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        JsonFormat.Value formatValue = ai.findFormat(annotatedField);
        assertNotNull(formatValue);
        assertEquals(JsonFormat.Shape.STRING, formatValue.getShape());
        assertEquals("yyyy-MM-dd", formatValue.getPattern());
    }
    
    // Test findFormat without JsonFormat annotation
    @Test
    public void testFindFormat_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class UnformattedField {
            public Date dateField;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(UnformattedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("dateField")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findFormat(annotatedField));
    }

    // Test findReferenceType for JsonManagedReference
    
    // Test findReferenceType for JsonBackReference
    
    // Test findReferenceType without reference annotations
    @Test
    public void testFindReferenceType_None() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoRef {
            public String field;
        }

        AnnotatedClass ac = AnnotatedClass.construct(NoRef.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findReferenceType(annotatedField));
    }

    // Test findUnwrappingNameTransformer with JsonUnwrapped enabled
    @Test
    public void testFindUnwrappingNameTransformer_Enabled() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class UnwrappedField {
            @JsonUnwrapped(enabled = true, prefix = "pre_", suffix = "_suf")
            public String unwrapped;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(UnwrappedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("unwrapped")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        NameTransformer transformer = ai.findUnwrappingNameTransformer(annotatedField);
        assertNotNull(transformer);
        assertEquals("pre_unwrapped_suf", transformer.transform("unwrapped"));
    }
    
    // Test findUnwrappingNameTransformer with JsonUnwrapped disabled
    @Test
    public void testFindUnwrappingNameTransformer_Disabled() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class UnwrappedField {
            @JsonUnwrapped(enabled = false)
            public String unwrapped;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(UnwrappedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("unwrapped")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findUnwrappingNameTransformer(annotatedField));
    }
    
    // Test findInjectableValueId with explicit value
    @Test
    public void testFindInjectableValueId_Explicit() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class InjectableField {
            @JacksonInject("myId")
            public String injected;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(InjectableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("injected")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals("myId", ai.findInjectableValueId(annotatedField));
    }
    
    // Test findInjectableValueId with empty value (uses type name)
    @Test
    public void testFindInjectableValueId_EmptyValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class InjectableField {
            @JacksonInject("")
            public String injected;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(InjectableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("injected")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(String.class.getName(), ai.findInjectableValueId(annotatedField));
    }

    // Test findViews with JsonView annotation
    
    // Test findViews without JsonView annotation
    @Test
    public void testFindViews_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoViewsClass {
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NoViewsClass.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findViews(annotatedField));
    }
    
    // Test findTypeResolver with explicit TypeResolverBuilder
    @Test
    public void testFindTypeResolver_ExplicitBuilder() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomTypeResolverBuilder extends StdTypeResolverBuilder {}
        
        class ResolvingClass {
            @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
            @JsonTypeResolver(value = CustomTypeResolverBuilder.class)
            public Object obj;
        }

        AnnotatedClass ac = AnnotatedClass.construct(ResolvingClass.class, ai, null);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        
        TypeResolverBuilder<?> builder = ai.findTypeResolver(null, ac, baseType); 
        assertNotNull(builder);
        assertTrue(builder instanceof CustomTypeResolverBuilder);
    }

    // Test findTypeResolver with standard TypeResolverBuilder

    // Test findTypeResolver with JsonTypeInfo.Id.NONE

    // Test findSubtypes with JsonSubTypes annotation
    @Test
    public void testFindSubtypes_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class BaseType {}
        class SubTypeA extends BaseType {}
        class SubTypeB extends BaseType {}
        
        class Container {
            @JsonSubTypes({
                @JsonSubTypes.Type(value = SubTypeA.class, name = "typeA"),
                @JsonSubTypes.Type(value = SubTypeB.class, name = "typeB")
            })
            public BaseType value;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Container.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("value")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        List<NamedType> subtypes = ai.findSubtypes(annotatedField);
        assertNotNull(subtypes);
        assertEquals(2, subtypes.size());
        
        Map<String, NamedType> subtypeMap = new HashMap<>();
        for (NamedType nt : subtypes) {
            subtypeMap.put(nt.getName(), nt);
        }
        
        assertTrue(subtypeMap.containsKey("typeA"));
        assertEquals(SubTypeA.class, subtypeMap.get("typeA").getType());
        
        assertTrue(subtypeMap.containsKey("typeB"));
        assertEquals(SubTypeB.class, subtypeMap.get("typeB").getType());
    }
    
    // Test findSubtypes without JsonSubTypes annotation
    @Test
    public void testFindSubtypes_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class BaseType {}
        class Container {
            public BaseType value;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Container.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("value")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findSubtypes(annotatedField));
    }

    // Test findTypeName with JsonTypeName annotation
    @Test
    public void testFindTypeName_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonTypeName("customTypeName")
        class MyType {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyType.class, ai, null);
        assertEquals("customTypeName", ai.findTypeName(ac));
    }
    
    // Test findTypeName without JsonTypeName annotation
    @Test
    public void testFindTypeName_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyType {}
        
        AnnotatedClass ac = AnnotatedClass.construct(MyType.class, ai, null);
        assertNull(ai.findTypeName(ac));
    }

    // Test isTypeId with JsonTypeId annotation
    @Test
    public void testIsTypeId_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class TypeIdField {
            @JsonTypeId
            public String id;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypeIdField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("id")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertTrue(ai.isTypeId(annotatedField));
    }
    
    // Test isTypeId without JsonTypeId annotation
    @Test
    public void testIsTypeId_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NonTypeIdField {
            public String id;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NonTypeIdField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("id")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        assertFalse(ai.isTypeId(annotatedField));
    }

    // Test findObjectIdInfo with a generator
    @Test
    public void testFindObjectIdInfo_WithGenerator() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ObjectIdClass {
            @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
            public Object obj;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(ObjectIdClass.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("obj")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        ObjectIdInfo objectIdInfo = ai.findObjectIdInfo(annotatedField);
        assertNotNull(objectIdInfo);
        assertEquals(ObjectIdGenerators.IntSequenceGenerator.class, objectIdInfo.getGeneratorType());
        assertEquals("id", objectIdInfo.getPropertyName().getSimpleName());
    }
    
    // Test findObjectIdInfo with generator as None
    @Test
    public void testFindObjectIdInfo_GeneratorNone() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ObjectIdClass {
            @JsonIdentityInfo(generator = ObjectIdGenerators.None.class, property = "id")
            public Object obj;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(ObjectIdClass.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("obj")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findObjectIdInfo(annotatedField));
    }

    // Test findObjectReferenceInfo with alwaysAsId set to true
    
    // Test findObjectReferenceInfo with alwaysAsId set to false

    // Test findSerializer with JsonSerialize(using = ...)
    @Test
    public void testFindSerializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomSerializer extends JsonSerializer<Object> {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException { }
        }
        
        class SerializableField {
            @JsonSerialize(using = CustomSerializer.class)
            public Object field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(SerializableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object serializer = ai.findSerializer(annotatedField);
        assertNotNull(serializer);
        assertEquals(CustomSerializer.class, serializer);
    }

    // Test findSerializer with JsonRawValue
    @Test
    public void testFindSerializer_RawValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class RawValueField {
            @JsonRawValue(value = true)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(RawValueField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object serializer = ai.findSerializer(annotatedField);
        assertNotNull(serializer);
        assertTrue(serializer instanceof RawSerializer);
    }
    
    // Test findKeySerializer with JsonSerialize(keyUsing = ...)
    @Test
    public void testFindKeySerializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomKeySerializer extends JsonSerializer<Object> {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException { }
        }
        
        class SerializableMap {
            @JsonSerialize(keyUsing = CustomKeySerializer.class)
            public Map<String, Integer> map;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(SerializableMap.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("map")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object serializer = ai.findKeySerializer(annotatedField);
        assertNotNull(serializer);
        assertEquals(CustomKeySerializer.class, serializer);
    }

    // Test findContentSerializer with JsonSerialize(contentUsing = ...)
    @Test
    public void testFindContentSerializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomContentSerializer extends JsonSerializer<Object> {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException { }
        }
        
        class SerializableList {
            @JsonSerialize(contentUsing = CustomContentSerializer.class)
            public List<String> list;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(SerializableList.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("list")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object serializer = ai.findContentSerializer(annotatedField);
        assertNotNull(serializer);
        assertEquals(CustomContentSerializer.class, serializer);
    }
    
    // Test findNullSerializer with JsonSerialize(nullsUsing = ...)
    @Test
    public void testFindNullSerializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomNullSerializer extends JsonSerializer<Object> {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException { }
        }
        
        class NullableField {
            @JsonSerialize(nullsUsing = CustomNullSerializer.class)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NullableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object serializer = ai.findNullSerializer(annotatedField);
        assertNotNull(serializer);
        assertEquals(CustomNullSerializer.class, serializer);
    }

    // Test findSerializationInclusion for NON_NULL
    @Test
    public void testFindSerializationInclusion_NonNull() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Includable {
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Includable.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(JsonInclude.Include.NON_NULL, ai.findSerializationInclusion(annotatedField, JsonInclude.Include.USE_DEFAULTS));
    }
    
    // Test findSerializationInclusion for NON_DEFAULT using JsonInclude.Include
    @Test
    public void testFindSerializationInclusion_NonDefault_JsonInclude() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Includable {
            @JsonInclude(JsonInclude.Include.NON_DEFAULT)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Includable.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(JsonInclude.Include.NON_DEFAULT, ai.findSerializationInclusion(annotatedField, JsonInclude.Include.USE_DEFAULTS));
    }

    // Test findSerializationInclusion for NON_DEFAULT using deprecated JsonSerialize.Inclusion
    @Test
    public void testFindSerializationInclusion_NonDefault_JsonSerialize() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Includable {
            @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Includable.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(JsonInclude.Include.NON_DEFAULT, ai.findSerializationInclusion(annotatedField, JsonInclude.Include.USE_DEFAULTS));
    }

    // Test findSerializationInclusionForContent
    @Test
    public void testFindSerializationInclusionForContent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ContentIncludable {
            @JsonInclude(content = JsonInclude.Include.NON_EMPTY)
            public List<String> list;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(ContentIncludable.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("list")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(JsonInclude.Include.NON_EMPTY, ai.findSerializationInclusionForContent(annotatedField, JsonInclude.Include.USE_DEFAULTS));
    }

    // Test findPropertyInclusion
    @Test
    public void testFindPropertyInclusion() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class PropertyIncludable {
            @JsonInclude(value = JsonInclude.Include.ALWAYS, content = JsonInclude.Include.NON_NULL)
            public String field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(PropertyIncludable.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        JsonInclude.Value inclusion = ai.findPropertyInclusion(annotatedField);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Include.ALWAYS, inclusion.getValueInclusion());
        assertEquals(JsonInclude.Include.NON_NULL, inclusion.getContentInclusion());
    }

    // Test findSerializationType with JsonSerialize(as = ...)
    @Test
    public void testFindSerializationType_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class BaseType {}
        class SpecificType extends BaseType {}
        
        class TypedField {
            @JsonSerialize(as = SpecificType.class)
            public BaseType field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Class<?> serType = ai.findSerializationType(annotatedField);
        assertNotNull(serType);
        assertEquals(SpecificType.class, serType);
    }
    
    // Test findSerializationType with JsonSerialize(as = Void.class) - should return null
    @Test
    public void testFindSerializationType_BogusClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class TypedField {
            @JsonSerialize(as = Void.class)
            public Object field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertNull(ai.findSerializationType(annotatedField));
    }

    // Test findSerializationKeyType with JsonSerialize(keyAs = ...)
    @Test
    public void testFindSerializationKeyType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class KeyType {}
        
        class TypedMap {
            @JsonSerialize(keyAs = KeyType.class)
            public Map<String, Integer> map;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedMap.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("map")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Map.class);
        
        Class<?> serKeyType = ai.findSerializationKeyType(annotatedField, baseType);
        assertNotNull(serKeyType);
        assertEquals(KeyType.class, serKeyType);
    }

    // Test findSerializationContentType with JsonSerialize(contentAs = ...)
    @Test
    public void testFindSerializationContentType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ContentType {}
        
        class TypedList {
            @JsonSerialize(contentAs = ContentType.class)
            public List<String> list;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedList.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("list")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseType = TypeFactory.defaultInstance().constructType(List.class);
        
        Class<?> serContentType = ai.findSerializationContentType(annotatedField, baseType);
        assertNotNull(serContentType);
        assertEquals(ContentType.class, serContentType);
    }

    // Test findSerializationTyping with JsonSerialize(typing = ...)
    @Test
    public void testFindSerializationTyping() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class PolymorphicField {
            @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
            public Object field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(PolymorphicField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        assertEquals(JsonSerialize.Typing.DYNAMIC, ai.findSerializationTyping(annotatedField));
    }

    // Test findSerializationConverter with JsonSerialize(converter = ...)
    
    // Test findSerializationContentConverter with JsonSerialize(contentConverter = ...)

    // Test findSerializationPropertyOrder
    @Test
    public void testFindSerializationPropertyOrder() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonPropertyOrder({"prop2", "prop1"})
        class OrderedClass {
            public String prop1;
            public String prop2;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(OrderedClass.class, ai, null);
        String[] order = ai.findSerializationPropertyOrder(ac);
        assertNotNull(order);
        assertArrayEquals(new String[]{"prop2", "prop1"}, order);
    }
    
    // Test findSerializationSortAlphabetically when alphabetic is true
    @Test
    public void testFindSerializationSortAlphabetically_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonPropertyOrder(alphabetic = true)
        class SortedClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(SortedClass.class, ai, null);
        assertTrue(ai.findSerializationSortAlphabetically(ac));
    }
    
    // Test findSerializationSortAlphabetically when alphabetic is false
    @Test
    public void testFindSerializationSortAlphabetically_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        @JsonPropertyOrder(alphabetic = false)
        class SortedClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(SortedClass.class, ai, null);
        assertFalse(ai.findSerializationSortAlphabetically(ac));
    }
    
    // Test findSerializationSortAlphabetically when annotation is absent
    @Test
    public void testFindSerializationSortAlphabetically_Absent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class UnsortedClass {}
        
        AnnotatedClass ac = AnnotatedClass.construct(UnsortedClass.class, ai, null);
        assertNull(ai.findSerializationSortAlphabetically(ac));
    }

    // Test findNameForSerialization with JsonGetter
    @Test
    public void testFindNameForSerialization_JsonGetter() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Getters {
            @JsonGetter("customName")
            public String getName() { return "value"; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Getters.class, ai, null);
        AnnotatedMethod method = ac.findMethod("getName", new Class<?>[0]);
        assertNotNull(method);
        
        PropertyName name = ai.findNameForSerialization(method);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }
    
    // Test findNameForSerialization with JsonProperty
    @Test
    public void testFindNameForSerialization_JsonProperty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Getters {
            @JsonProperty("customName")
            public String getValue() { return "value"; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Getters.class, ai, null);
        AnnotatedMethod method = ac.findMethod("getValue", new Class<?>[0]);
        assertNotNull(method);
        
        PropertyName name = ai.findNameForSerialization(method);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }

    // Test findNameForSerialization with other annotations implying a property
    @Test
    public void testFindNameForSerialization_ImpliedProperty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Implied {
            @JsonView(Object.class) // Other annotation
            public String property;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Implied.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("property")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        PropertyName name = ai.findNameForSerialization(annotatedField);
        assertNotNull(name);
        assertEquals("", name.getSimpleName());
    }

    // Test hasAsValueAnnotation when true
    @Test
    public void testHasAsValueAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AsValueMethod {
            @JsonValue
            public String asValue() { return "value"; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AsValueMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("asValue", new Class<?>[0]);
        assertNotNull(method);
        assertTrue(ai.hasAsValueAnnotation(method));
    }
    
    // Test hasAsValueAnnotation when value is false
    @Test
    public void testHasAsValueAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AsValueMethod {
            @JsonValue(value = false)
            public String asValue() { return "value"; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AsValueMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("asValue", new Class<?>[0]);
        assertNotNull(method);
        assertFalse(ai.hasAsValueAnnotation(method));
    }
    
    // Test hasAsValueAnnotation when annotation is absent
    @Test
    public void testHasAsValueAnnotation_Absent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoAsValueMethod {
            public String method() { return "value"; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NoAsValueMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("method", new Class<?>[0]);
        assertNotNull(method);
        assertFalse(ai.hasAsValueAnnotation(method));
    }

    // Test findDeserializer with JsonDeserialize(using = ...)
    @Test
    public void testFindDeserializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomDeserializer extends JsonDeserializer<Object> {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws java.io.IOException { return null; }
        }
        
        class DeserializableField {
            @JsonDeserialize(using = CustomDeserializer.class)
            public Object field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DeserializableField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object deserializer = ai.findDeserializer(annotatedField);
        assertNotNull(deserializer);
        assertEquals(CustomDeserializer.class, deserializer);
    }
    
    // Test findKeyDeserializer with JsonDeserialize(keyUsing = ...)
    @Test
    public void testFindKeyDeserializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomKeyDeserializer extends KeyDeserializer {
            @Override public Object deserializeKey(String key, DeserializationContext ctxt) throws java.io.IOException { return null; }
        }
        
        class DeserializableMap {
            @JsonDeserialize(keyUsing = CustomKeyDeserializer.class)
            public Map<String, Integer> map;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DeserializableMap.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("map")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object deserializer = ai.findKeyDeserializer(annotatedField);
        assertNotNull(deserializer);
        assertEquals(CustomKeyDeserializer.class, deserializer);
    }

    // Test findContentDeserializer with JsonDeserialize(contentUsing = ...)
    @Test
    public void testFindContentDeserializer_UsingClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CustomContentDeserializer extends JsonDeserializer<Object> {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws java.io.IOException { return null; }
        }
        
        class DeserializableList {
            @JsonDeserialize(contentUsing = CustomContentDeserializer.class)
            public List<String> list;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(DeserializableList.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("list")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        
        Object deserializer = ai.findContentDeserializer(annotatedField);
        assertNotNull(deserializer);
        assertEquals(CustomContentDeserializer.class, deserializer);
    }

    // Test findDeserializationType with JsonDeserialize(as = ...)
    @Test
    public void testFindDeserializationType_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class BaseType {}
        class SpecificType extends BaseType {}
        
        class TypedField {
            @JsonDeserialize(as = SpecificType.class)
            public BaseType field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType.class);
        
        Class<?> deserType = ai.findDeserializationType(annotatedField, baseType);
        assertNotNull(deserType);
        assertEquals(SpecificType.class, deserType);
    }
    
    // Test findDeserializationType with JsonDeserialize(as = Void.class) - should return null
    @Test
    public void testFindDeserializationType_BogusClass() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class TypedField {
            @JsonDeserialize(as = Void.class)
            public Object field;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedField.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("field")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);

        assertNull(ai.findDeserializationType(annotatedField, baseType));
    }

    // Test findDeserializationKeyType with JsonDeserialize(keyAs = ...)
    @Test
    public void testFindDeserializationKeyType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class KeyType {}
        
        class TypedMap {
            @JsonDeserialize(keyAs = KeyType.class)
            public Map<String, Integer> map;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedMap.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("map")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseKeyType = TypeFactory.defaultInstance().constructType(String.class);
        
        Class<?> deserKeyType = ai.findDeserializationKeyType(annotatedField, baseKeyType);
        assertNotNull(deserKeyType);
        assertEquals(KeyType.class, deserKeyType);
    }

    // Test findDeserializationContentType with JsonDeserialize(contentAs = ...)
    @Test
    public void testFindDeserializationContentType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ContentType {}
        
        class TypedList {
            @JsonDeserialize(contentAs = ContentType.class)
            public List<String> list;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(TypedList.class, ai, null);
        AnnotatedField annotatedField = null;
        for (AnnotatedField af : ac.fields()) {
            if (af.getAnnotated().getName().equals("list")) {
                annotatedField = af;
                break;
            }
        }
        assertNotNull(annotatedField);
        JavaType baseContentType = TypeFactory.defaultInstance().constructType(String.class);
        
        Class<?> deserContentType = ai.findDeserializationContentType(annotatedField, baseContentType);
        assertNotNull(deserContentType);
        assertEquals(ContentType.class, deserContentType);
    }

    // Test findDeserializationConverter with JsonDeserialize(converter = ...)
    
    // Test findDeserializationContentConverter with JsonDeserialize(contentConverter = ...)

    // Test findValueInstantiator with JsonValueInstantiator

    // Test findPOJOBuilder with JsonDeserialize(builder = ...)
    @Test
    public void testFindPOJOBuilder() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class MyBuilder {}
        
        class BuildableClass {
            @JsonDeserialize(builder = MyBuilder.class)
            public Object obj;
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(BuildableClass.class, ai, null);
        Class<?> builderClass = ai.findPOJOBuilder(ac);
        assertNotNull(builderClass);
        assertEquals(MyBuilder.class, builderClass);
    }
    
    // Test findPOJOBuilderConfig with JsonPOJOBuilder

    // Test findNameForDeserialization with JsonSetter
    @Test
    public void testFindNameForDeserialization_JsonSetter() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Setters {
            @JsonSetter("customName")
            public void setName(String name) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Setters.class, ai, null);
        AnnotatedMethod method = ac.findMethod("setName", new Class<?>[]{String.class});
        assertNotNull(method);
        
        PropertyName name = ai.findNameForDeserialization(method);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }
    
    // Test findNameForDeserialization with JsonProperty
    @Test
    public void testFindNameForDeserialization_JsonProperty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class Setters {
            @JsonProperty("customName")
            public void setValue(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(Setters.class, ai, null);
        AnnotatedMethod method = ac.findMethod("setValue", new Class<?>[]{String.class});
        assertNotNull(method);
        
        PropertyName name = ai.findNameForDeserialization(method);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }

    // Test findNameForDeserialization with other annotations implying a property
    @Test
    public void testFindNameForDeserialization_ImpliedProperty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class ImpliedSet {
            @JsonDeserialize(as = String.class) // Other annotation
            public void setProperty(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(ImpliedSet.class, ai, null);
        AnnotatedMethod method = ac.findMethod("setProperty", new Class<?>[]{String.class});
        assertNotNull(method);
        
        PropertyName name = ai.findNameForDeserialization(method);
        assertNotNull(name);
        assertEquals("", name.getSimpleName());
    }

    // Test hasAnySetterAnnotation when true
    @Test
    public void testHasAnySetterAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AnySetterMethod {
            @JsonAnySetter
            public void setAny(String key, Object value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AnySetterMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("setAny", new Class<?>[]{String.class, Object.class});
        assertNotNull(method);
        assertTrue(ai.hasAnySetterAnnotation(method));
    }
    
    // Test hasAnySetterAnnotation when false
    @Test
    public void testHasAnySetterAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoAnySetterMethod {
            public void setAny(String key, Object value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NoAnySetterMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("setAny", new Class<?>[]{String.class, Object.class});
        assertNotNull(method);
        assertFalse(ai.hasAnySetterAnnotation(method));
    }

    // Test hasAnyGetterAnnotation when true
    @Test
    public void testHasAnyGetterAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class AnyGetterMethod {
            @JsonAnyGetter
            public Map<String, Object> getAny() { return null; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(AnyGetterMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("getAny", new Class<?>[0]);
        assertNotNull(method);
        assertTrue(ai.hasAnyGetterAnnotation(method));
    }
    
    // Test hasAnyGetterAnnotation when false
    @Test
    public void testHasAnyGetterAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NoAnyGetterMethod {
            public Map<String, Object> getAny() { return null; }
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NoAnyGetterMethod.class, ai, null);
        AnnotatedMethod method = ac.findMethod("getAny", new Class<?>[0]);
        assertNotNull(method);
        assertFalse(ai.hasAnyGetterAnnotation(method));
    }

    // Test hasCreatorAnnotation when true (Mode.PROPERTIES)
    @Test
    public void testHasCreatorAnnotation_True_Properties() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CreatorClass {
            @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
            public CreatorClass(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(CreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == String.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertTrue(ai.hasCreatorAnnotation(constructor));
    }
    
    // Test hasCreatorAnnotation when true (Mode.DELEGATING)
    @Test
    public void testHasCreatorAnnotation_True_Delegating() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CreatorClass {
            @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
            public CreatorClass(int value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(CreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == int.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertTrue(ai.hasCreatorAnnotation(constructor));
    }
    
    // Test hasCreatorAnnotation when false (Mode.DISABLED)
    @Test
    public void testHasCreatorAnnotation_False_Disabled() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CreatorClass {
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            public CreatorClass(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(CreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == String.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertFalse(ai.hasCreatorAnnotation(constructor));
    }

    // Test findCreatorBinding for Mode.PROPERTIES
    @Test
    public void testFindCreatorBinding_Properties() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CreatorClass {
            @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
            public CreatorClass(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(CreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == String.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertEquals(JsonCreator.Mode.PROPERTIES, ai.findCreatorBinding(constructor));
    }
    
    // Test findCreatorBinding for Mode.DELEGATING
    @Test
    public void testFindCreatorBinding_Delegating() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class CreatorClass {
            @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
            public CreatorClass(int value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(CreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == int.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertEquals(JsonCreator.Mode.DELEGATING, ai.findCreatorBinding(constructor));
    }
    
    // Test findCreatorBinding when annotation is absent
    @Test
    public void testFindCreatorBinding_Absent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        
        class NonCreatorClass {
            public NonCreatorClass(String value) {}
        }
        
        AnnotatedClass ac = AnnotatedClass.construct(NonCreatorClass.class, ai, null);
        AnnotatedConstructor constructor = null;
        for(AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1 && c.getRawParameterType(0) == String.class) {
                constructor = c;
                break;
            }
        }
        assertNotNull(constructor);
        assertNull(ai.findCreatorBinding(constructor));
    }

    // Test for findImplicitPropertyName

    // Test for findTypeResolver (using AnnotatedClass)

    // Test for findPropertyContentTypeResolver

    // Test for findAndAddVirtualProperties
}



