package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperFeatures;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.ClassScanner.Default;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.type.SimpleType;

// Define enums outside the test methods
enum TestEnum { VALUE1, VALUE2 }
enum TestEnum2 { A, B, C }

public class AnnotationIntrospectorTest {

    // Helper to create a mock AnnotatedClass
    private AnnotatedClass createMockAnnotatedClass(Class<?> cls) {
        TypeFactory tf = TypeFactory.defaultInstance();
        return new AnnotatedClass(tf.constructType(cls), cls, AnnotationMap.emptyMap(), Collections.emptyList(), null, null, null, null, null);
    }

    // Helper to create a mock AnnotatedMember
    private AnnotatedMember createMockAnnotatedMember() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType dummyType = tf.constructType(Object.class);
        return new AnnotatedField(null, null, AnnotationMap.emptyMap());
    }

    // Helper to create a mock MapperConfig
    private MapperConfig<?> createMockMapperConfig() {
        BaseSettings settings = new BaseSettings(TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        return new MapperConfig(settings, MapperFeatures.collect(MapperFeatures.class).intValue());
    }

    // Helper to create a mock JavaType
    private JavaType createMockJavaType(Class<?> cls) {
        TypeFactory tf = TypeFactory.defaultInstance();
        return tf.constructType(cls);
    }

    @Test
    public void testReferencePropertyManagedStaticFactory() throws Exception {
        ReferenceProperty prop = ReferenceProperty.managed("test");
        assertNotNull(prop);
        assertEquals(ReferenceProperty.Type.MANAGED_REFERENCE, prop.getType());
        assertEquals("test", prop.getName());
        assertTrue(prop.isManagedReference());
        assertFalse(prop.isBackReference());
    }

    @Test
    public void testReferencePropertyBackStaticFactory() throws Exception {
        ReferenceProperty prop = ReferenceProperty.back("test");
        assertNotNull(prop);
        assertEquals(ReferenceProperty.Type.BACK_REFERENCE, prop.getType());
        assertEquals("test", prop.getName());
        assertFalse(prop.isManagedReference());
        assertTrue(prop.isBackReference());
    }

    @Test
    public void testNopInstance() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        assertNotNull(ai);
        assertTrue(ai instanceof NopAnnotationIntrospector);
    }

    @Test
    public void testPairIntrospector() throws Exception {
        AnnotationIntrospector ai1 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector ai2 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector pair = AnnotationIntrospector.pair(ai1, ai2);
        assertNotNull(pair);
        assertTrue(pair instanceof AnnotationIntrospectorPair);
        AnnotationIntrospectorPair pairImpl = (AnnotationIntrospectorPair) pair;
        // Accessing protected field _introspectors is necessary for this test.
        // If this were a production system, a getter would be preferred.
        assertEquals(ai1, pairImpl._introspectors[0]);
        assertEquals(ai2, pairImpl._introspectors[1]);
    }

    @Test
    public void testAllIntrospectorsReturnsSingletonForNonPair() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        Collection<AnnotationIntrospector> introspectors = ai.allIntrospectors();
        assertNotNull(introspectors);
        assertEquals(1, introspectors.size());
        assertTrue(introspectors.contains(ai));
    }
    
    @Test
    public void testAllIntrospectorsWithResultCollection() throws Exception {
        AnnotationIntrospector ai1 = new JacksonAnnotationIntrospector();
        AnnotationIntrospector ai2 = new JacksonAnnotationIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospector.pair(ai1, ai2);
        Collection<AnnotationIntrospector> result = new ArrayList<>();
        pair.allIntrospectors(result);
        assertTrue(result.contains(ai1));
        assertTrue(result.contains(ai2));
        assertEquals(2, result.size());
    }

    @Test
    public void testVersionReturnsNonNullForConcrete() throws Exception {
        // JacksonAnnotationIntrospector is a concrete subclass that provides a version
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNotNull(ai.version());
        assertTrue(ai.version() instanceof Version);
    }

    @Test
    public void testFindRootNameReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        PropertyName name = ai.findRootName(ac);
        assertNull(name);
    }

    @Test
    public void testFindPropertiesToIgnoreReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember(); // Using mock member as Annotated type
        String[] properties = ai.findPropertiesToIgnore(ann, true);
        assertNull(properties);
        properties = ai.findPropertiesToIgnore(ann, false);
        assertNull(properties);
    }
    
    @Test
    public void testFindIgnoreUnknownPropertiesReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        Boolean ignore = ai.findIgnoreUnknownProperties(ac);
        assertNull(ignore);
    }

    @Test
    public void testIsIgnorableTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        Boolean ignorable = ai.isIgnorableType(ac);
        assertNull(ignorable);
    }

    @Test
    public void testFindFilterIdReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        Object filterId = ai.findFilterId(ann);
        assertNull(filterId);
    }

    @Test
    public void testFindNamingStrategyReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        Object namingStrategy = ai.findNamingStrategy(ac);
        assertNull(namingStrategy);
    }

    @Test
    public void testFindClassDescriptionReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        String description = ai.findClassDescription(ac);
        assertNull(description);
    }

    @Test
    public void testFindAutoDetectVisibilityReturnsDefaultChecker() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        VisibilityChecker<?> checker = ai.findAutoDetectVisibility(ac, VisibilityChecker.defaultInstance());
        assertNotNull(checker);
        // We can't assert equality to default instance without knowing its concrete type and how it's implemented.
        // But we can assert it's not null and is a VisibilityChecker.
    }

    @Test
    public void testFindTypeResolverReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        JavaType baseType = createMockJavaType(String.class);
        TypeResolverBuilder<?> resolver = ai.findTypeResolver(config, ac, baseType);
        assertNull(resolver);
    }

    @Test
    public void testFindPropertyTypeResolverReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedMember am = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        TypeResolverBuilder<?> resolver = ai.findPropertyTypeResolver(config, am, baseType);
        assertNull(resolver);
    }

    @Test
    public void testFindPropertyContentTypeResolverReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedMember am = createMockAnnotatedMember();
        JavaType containerType = createMockJavaType(List.class); // Example container type
        TypeResolverBuilder<?> resolver = ai.findPropertyContentTypeResolver(config, am, containerType);
        assertNull(resolver);
    }

    @Test
    public void testFindSubtypesReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        List<NamedType> subtypes = ai.findSubtypes(a);
        assertNull(subtypes);
    }

    @Test
    public void testFindTypeNameReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        String typeName = ai.findTypeName(ac);
        assertNull(typeName);
    }

    @Test
    public void testIsTypeIdReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember member = createMockAnnotatedMember();
        Boolean isTypeId = ai.isTypeId(member);
        assertNull(isTypeId);
    }

    @Test
    public void testFindReferenceTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember member = createMockAnnotatedMember();
        ReferenceProperty refProp = ai.findReferenceType(member);
        assertNull(refProp);
    }

    @Test
    public void testFindUnwrappingNameTransformerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember member = createMockAnnotatedMember();
        NameTransformer transformer = ai.findUnwrappingNameTransformer(member);
        assertNull(transformer);
    }

    @Test
    public void testHasIgnoreMarkerReturnsFalseByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember m = createMockAnnotatedMember();
        assertFalse(ai.hasIgnoreMarker(m));
    }

    @Test
    public void testFindInjectableValueIdReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember m = createMockAnnotatedMember();
        Object id = ai.findInjectableValueId(m);
        assertNull(id);
    }

    @Test
    public void testHasRequiredMarkerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember m = createMockAnnotatedMember();
        Boolean required = ai.hasRequiredMarker(m);
        assertNull(required);
    }

    @Test
    public void testFindViewsReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        Class<?>[] views = ai.findViews(a);
        assertNull(views);
    }

    @Test
    public void testFindFormatReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        JsonFormat.Value format = ai.findFormat(ann);
        assertNull(format);
    }

    @Test
    public void testFindWrapperNameReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        PropertyName wrapperName = ai.findWrapperName(ann);
        assertNull(wrapperName);
    }

    @Test
    public void testFindPropertyDefaultValueReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        String defaultValue = ai.findPropertyDefaultValue(ann);
        assertNull(defaultValue);
    }

    @Test
    public void testFindPropertyDescriptionReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        String description = ai.findPropertyDescription(ann);
        assertNull(description);
    }

    @Test
    public void testFindPropertyIndexReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        Integer index = ai.findPropertyIndex(ann);
        assertNull(index);
    }

    @Test
    public void testFindImplicitPropertyNameReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember member = createMockAnnotatedMember();
        String implicitName = ai.findImplicitPropertyName(member);
        assertNull(implicitName);
    }

    @Test
    public void testFindPropertyAccessReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        JsonProperty.Access access = ai.findPropertyAccess(ann);
        assertNull(access);
    }

    @Test
    public void testResolveSetterConflictReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        
        // Need to create mock AnnotatedMethods with valid constructors.
        // AnnotatedMethod constructor is protected and requires specific arguments.
        // We'll use a concrete subclass or mock it if necessary.
        // For now, let's assume a minimal valid creation.
        // Since AnnotatedMethod is not directly instantiable in a simple way for testing,
        // we'll use a placeholder or a known subclass if available.
        // If not, we might have to skip this test or mock it heavily.
        // The available constructors for AnnotatedMethod are:
        // AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])
        // AnnotatedMethod(Serialization) - this one is not available via public API or simple instantiation.

        // Let's try creating AnnotatedMethod using a more appropriate approach if possible.
        // If not, we may have to acknowledge this test cannot be easily done with the provided API.
        
        // For now, attempting to create valid AnnotatedMethod instances.
        // If direct instantiation is problematic, this test might need rethinking.
        
        // Mocking using a simpler approach for the sake of testability.
        // In a real scenario, one would use reflection or a dedicated mocking framework.
        // Given the constraints, direct instantiation of AnnotatedMethod might be tricky.
        
        // Let's try a simpler approach assuming AnnotatedMethod can be constructed in a way that satisfies its internal checks for testing.
        // If not, we will have to skip this particular test.
        
        // Re-examining AnnotatedMethod. It's a concrete class and has protected constructors.
        // JacksonAnnotationIntrospector.resolveSetterConflict takes two AnnotatedMethod.
        // Creating these is the challenge.

        // As a workaround, we'll use a known concrete subclass if possible or just skip if impossible.
        // Since no other concrete subclass is listed for AnnotatedMethod, we'll make a best effort.
        
        // Let's assume we can create dummy objects that satisfy the type.
        // If the actual implementation of resolveSetterConflict relies on the internal state of AnnotatedMethod beyond its signature,
        // this test might fail or need more sophisticated mocking.
        
        // Creating mock AnnotatedMethods. This is a critical point for testing.
        // AnnotatedMethod requires a Method object.
        java.lang.reflect.Method dummyMethod1 = null;
        java.lang.reflect.Method dummyMethod2 = null;
        try {
            dummyMethod1 = String.class.getMethod("length"); // A method that exists
            dummyMethod2 = Object.class.getMethod("hashCode"); // Another method
        } catch (NoSuchMethodException e) {
            // This should not happen for standard Java methods
            fail("Failed to get dummy methods for AnnotatedMethod testing.");
        }
        
        AnnotatedMethod setter1 = new AnnotatedMethod(null, dummyMethod1, AnnotationMap.emptyMap(), null);
        AnnotatedMethod setter2 = new AnnotatedMethod(null, dummyMethod2, AnnotationMap.emptyMap(), null);

        AnnotatedMethod resolved = ai.resolveSetterConflict(config, setter1, setter2);
        assertNull(resolved);
    }

    @Test
    public void testFindSerializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object serializer = ai.findSerializer(am);
        assertNull(serializer);
    }

    @Test
    public void testFindKeySerializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object keySerializer = ai.findKeySerializer(am);
        assertNull(keySerializer);
    }

    @Test
    public void testFindContentSerializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object contentSerializer = ai.findContentSerializer(am);
        assertNull(contentSerializer);
    }

    @Test
    public void testFindNullSerializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object nullSerializer = ai.findNullSerializer(am);
        assertNull(nullSerializer);
    }

    @Test
    public void testFindSerializationTypingReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        JsonSerialize.Typing typing = ai.findSerializationTyping(a);
        assertNull(typing);
    }

    @Test
    public void testFindSerializationConverterReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        Object converter = ai.findSerializationConverter(a);
        assertNull(converter);
    }

    @Test
    public void testFindSerializationContentConverterReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember a = createMockAnnotatedMember();
        Object converter = ai.findSerializationContentConverter(a);
        assertNull(converter);
    }

    @Test
    public void testFindSerializationInclusionReturnsDefaultValue() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        JsonInclude.Include defValue = JsonInclude.Include.NON_DEFAULT;
        JsonInclude.Include inclusion = ai.findSerializationInclusion(a, defValue);
        assertEquals(defValue, inclusion);
    }

    @Test
    public void testFindSerializationInclusionForContentReturnsDefaultValue() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        JsonInclude.Include defValue = JsonInclude.Include.NON_EMPTY;
        JsonInclude.Include inclusion = ai.findSerializationInclusionForContent(a, defValue);
        assertEquals(defValue, inclusion);
    }

    @Test
    public void testFindPropertyInclusionReturnsEmptyValue() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        JsonInclude.Value inclusion = ai.findPropertyInclusion(a);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Value.empty(), inclusion);
    }

    @Test
    public void testFindSerializationTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        Class<?> serClass = ai.findSerializationType(a);
        assertNull(serClass);
    }

    @Test
    public void testFindSerializationKeyTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember am = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        Class<?> keyClass = ai.findSerializationKeyType(am, baseType);
        assertNull(keyClass);
    }

    @Test
    public void testFindSerializationContentTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember am = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        Class<?> contentClass = ai.findSerializationContentType(am, baseType);
        assertNull(contentClass);
    }

    @Test
    public void testRefineSerializationTypeReturnsBaseTypeByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        Annotated a = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        JavaType refinedType = null;
        try {
            refinedType = ai.refineSerializationType(config, a, baseType);
        } catch (JsonMappingException e) {
            fail("Should not throw exception for nop introspector: " + e.getMessage());
        }
        assertNotNull(refinedType);
        // For nop, it should return the original type
        assertEquals(baseType, refinedType);
    }

    @Test
    public void testFindSerializationPropertyOrderReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        String[] order = ai.findSerializationPropertyOrder(ac);
        assertNull(order);
    }

    @Test
    public void testFindSerializationSortAlphabeticallyReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated ann = createMockAnnotatedMember();
        Boolean sort = ai.findSerializationSortAlphabetically(ann);
        assertNull(sort);
    }

    @Test
    public void testFindAndAddVirtualPropertiesDoesNothingByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        ai.findAndAddVirtualProperties(config, ac, properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void testFindNameForSerializationReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        PropertyName name = ai.findNameForSerialization(a);
        assertNull(name);
    }

    @Test
    public void testHasAsValueAnnotationReturnsFalseByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        // AnnotatedMethod requires specific constructor arguments.
        java.lang.reflect.Method dummyMethod = null;
        try {
            dummyMethod = String.class.getMethod("length");
        } catch (NoSuchMethodException e) {
            fail("Failed to get dummy method for AnnotatedMethod testing.");
        }
        AnnotatedMethod am = new AnnotatedMethod(null, dummyMethod, AnnotationMap.emptyMap(), null);
        assertFalse(ai.hasAsValueAnnotation(am));
    }

    @Test
    public void testFindEnumValueReturnsName() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        assertEquals("VALUE1", ai.findEnumValue(TestEnum.VALUE1));
    }

    @Test
    public void testFindEnumValuesDelegatesToFindEnumValue() throws Exception {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        Enum<?>[] enumValues = TestEnum2.values();
        String[] names = new String[enumValues.length];
        String[] result = ai.findEnumValues(TestEnum2.class, enumValues, names);
        assertNotNull(result);
        assertEquals("A", result[0]);
        assertEquals("B", result[1]);
        assertEquals("C", result[2]);
        // Check that the input array was also populated
        assertNotNull(names);
        assertEquals("A", names[0]);
    }

    @Test
    public void testFindDeserializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object deserializer = ai.findDeserializer(am);
        assertNull(deserializer);
    }

    @Test
    public void testFindKeyDeserializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object keyDeserializer = ai.findKeyDeserializer(am);
        assertNull(keyDeserializer);
    }

    @Test
    public void testFindContentDeserializerReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        Object contentDeserializer = ai.findContentDeserializer(am);
        assertNull(contentDeserializer);
    }

    @Test
    public void testFindDeserializationConverterReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        Object converter = ai.findDeserializationConverter(a);
        assertNull(converter);
    }

    @Test
    public void testFindDeserializationContentConverterReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedMember a = createMockAnnotatedMember();
        Object converter = ai.findDeserializationContentConverter(a);
        assertNull(converter);
    }

    @Test
    public void testRefineDeserializationTypeReturnsBaseTypeByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        MapperConfig<?> config = createMockMapperConfig();
        Annotated a = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        JavaType refinedType = null;
        try {
            refinedType = ai.refineDeserializationType(config, a, baseType);
        } catch (JsonMappingException e) {
            fail("Should not throw exception for nop introspector: " + e.getMessage());
        }
        assertNotNull(refinedType);
        assertEquals(baseType, refinedType);
    }

    @Test
    public void testFindDeserializationTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        JavaType baseType = createMockJavaType(String.class);
        Class<?> deserClass = ai.findDeserializationType(am, baseType);
        assertNull(deserClass);
    }

    @Test
    public void testFindDeserializationKeyTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        JavaType baseKeyType = createMockJavaType(String.class);
        Class<?> keyClass = ai.findDeserializationKeyType(am, baseKeyType);
        assertNull(keyClass);
    }

    @Test
    public void testFindDeserializationContentTypeReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated am = createMockAnnotatedMember();
        JavaType baseContentType = createMockJavaType(String.class);
        Class<?> contentClass = ai.findDeserializationContentType(am, baseContentType);
        assertNull(contentClass);
    }

    @Test
    public void testFindValueInstantiatorReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        Object instantiator = ai.findValueInstantiator(ac);
        assertNull(instantiator);
    }

    @Test
    public void testFindPOJOBuilderReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        Class<?> builderClass = ai.findPOJOBuilder(ac);
        assertNull(builderClass);
    }

    @Test
    public void testFindPOJOBuilderConfigReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        AnnotatedClass ac = createMockAnnotatedClass(String.class);
        JsonPOJOBuilder.Value config = ai.findPOJOBuilderConfig(ac);
        assertNull(config);
    }

    @Test
    public void testFindNameForDeserializationReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        PropertyName name = ai.findNameForDeserialization(a);
        assertNull(name);
    }

    @Test
    public void testHasAnySetterAnnotationReturnsFalseByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        java.lang.reflect.Method dummyMethod = null;
        try {
            dummyMethod = String.class.getMethod("length");
        } catch (NoSuchMethodException e) {
            fail("Failed to get dummy method for AnnotatedMethod testing.");
        }
        AnnotatedMethod am = new AnnotatedMethod(null, dummyMethod, AnnotationMap.emptyMap(), null);
        assertFalse(ai.hasAnySetterAnnotation(am));
    }

    @Test
    public void testHasAnyGetterAnnotationReturnsFalseByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        java.lang.reflect.Method dummyMethod = null;
        try {
            dummyMethod = String.class.getMethod("length");
        } catch (NoSuchMethodException e) {
            fail("Failed to get dummy method for AnnotatedMethod testing.");
        }
        AnnotatedMethod am = new AnnotatedMethod(null, dummyMethod, AnnotationMap.emptyMap(), null);
        assertFalse(ai.hasAnyGetterAnnotation(am));
    }

    @Test
    public void testHasCreatorAnnotationReturnsFalseByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        assertFalse(ai.hasCreatorAnnotation(a));
    }

    @Test
    public void testFindCreatorBindingReturnsNullByDefault() throws Exception {
        AnnotationIntrospector ai = AnnotationIntrospector.nopInstance();
        Annotated a = createMockAnnotatedMember();
        JsonCreator.Mode mode = ai.findCreatorBinding(a);
        assertNull(mode);
    }

    @Test
    public void test_findAnnotation_delegatesTo_getAnnotation() throws Exception {
        // Mock Annotated interface to control getAnnotation behavior
        Annotated mockAnnotated = new AnnotatedClass(TypeFactory.defaultInstance().constructType(String.class), String.class, AnnotationMap.emptyMap(), Collections.emptyList(), null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> aClass) {
                if (aClass == TestAnnotation.class) {
                    return (A) new TestAnnotation() {};
                }
                return null;
            }
            
            // Override hasAnnotation and hasOneOf as well to avoid potential issues if the introspector checks these first
            @Override
            public boolean hasAnnotation(Class<? extends Annotation> aClass) {
                return aClass == TestAnnotation.class;
            }

            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) {
                for (Class<? extends Annotation> cls : annoClasses) {
                    if (cls == TestAnnotation.class) return true;
                }
                return false;
            }
        };
        
        // Test with a concrete introspector that calls _findAnnotation
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        
        Annotation found = ai._findAnnotation(mockAnnotated, TestAnnotation.class);
        assertNotNull(found);
        assertTrue(found instanceof TestAnnotation);

        Annotation notFound = ai._findAnnotation(mockAnnotated, JsonProperty.class);
        assertNull(notFound);
    }

    @Test
    public void test_hasAnnotation_delegatesTo_hasAnnotation() throws Exception {
        Annotated mockAnnotated = new AnnotatedClass(TypeFactory.defaultInstance().constructType(String.class), String.class, AnnotationMap.emptyMap(), Collections.emptyList(), null, null, null, null, null) {
            @Override
            public boolean hasAnnotation(Class<? extends Annotation> aClass) {
                return aClass == TestAnnotation.class;
            }
        };
        
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        assertTrue(ai._hasAnnotation(mockAnnotated, TestAnnotation.class));
        assertFalse(ai._hasAnnotation(mockAnnotated, JsonProperty.class));
    }
    
    @Test
    public void test_hasOneOf_delegatesTo_hasOneOf() throws Exception {
        Annotated mockAnnotated = new AnnotatedClass(TypeFactory.defaultInstance().constructType(String.class), String.class, AnnotationMap.emptyMap(), Collections.emptyList(), null, null, null, null, null) {
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) {
                for (Class<? extends Annotation> cls : annoClasses) {
                    if (cls == TestAnnotation.class || cls == AnotherTestAnnotation.class) return true;
                }
                return false;
            }
        };
        
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector(); // Use a concrete subclass
        
        Class<? extends Annotation>[] annotations1 = new Class[] { TestAnnotation.class, JsonProperty.class };
        assertTrue(ai._hasOneOf(mockAnnotated, annotations1));
        
        Class<? extends Annotation>[] annotations2 = new Class[] { Integer.class, AnotherTestAnnotation.class };
        assertTrue(ai._hasOneOf(mockAnnotated, annotations2));
        
        Class<? extends Annotation>[] annotations3 = new Class[] { JsonProperty.class, Override.class };
        assertFalse(ai._hasOneOf(mockAnnotated, annotations3));
    }
    
    // Dummy annotation for testing
    private @interface TestAnnotation {}
    private @interface AnotherTestAnnotation {}
}
