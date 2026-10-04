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
import com.fasterxml.jackson.databind.cfg.MapperConfig;
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

public class AnnotationIntrospectorTest {
    @Test
    public void testManagedReference() throws Exception {
        AnnotationIntrospector.ReferenceProperty p =
                AnnotationIntrospector.ReferenceProperty.managed("parent");
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, p.getType());
        assertEquals("parent", p.getName());
        assertTrue(p.isManagedReference());
        assertFalse(p.isBackReference());
    }

    @Test
    public void testBackReference() throws Exception {
        AnnotationIntrospector.ReferenceProperty p =
                AnnotationIntrospector.ReferenceProperty.back("child");
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, p.getType());
        assertEquals("child", p.getName());
        assertFalse(p.isManagedReference());
        assertTrue(p.isBackReference());
    }

    @Test
    public void testReferencePropertyAcceptsNullName() throws Exception {
        AnnotationIntrospector.ReferenceProperty p =
                new AnnotationIntrospector.ReferenceProperty(
                        AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, null);
        assertNull(p.getName());
        assertTrue(p.isManagedReference());
    }

    @Test
    public void testNopInstanceIsSingleton() throws Exception {
        assertSame(AnnotationIntrospector.nopInstance(), AnnotationIntrospector.nopInstance());
    }

    @Test
    public void testNopIntrospectorsContainNop() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertEquals(1, nop.allIntrospectors().size());
        assertSame(nop, nop.allIntrospectors().iterator().next());
    }

    @Test
    public void testAllIntrospectorsAddsThis() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        List<AnnotationIntrospector> result = new ArrayList<AnnotationIntrospector>();
        assertSame(result, nop.allIntrospectors(result));
        assertEquals(1, result.size());
        assertSame(nop, result.get(0));
    }

    @Test
    public void testPairFlattensToItsChildren() throws Exception {
        AnnotationIntrospector first = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector second = new JacksonAnnotationIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospector.pair(first, second);
        Collection<AnnotationIntrospector> all = pair.allIntrospectors();
        assertEquals(2, all.size());
        Iterator<AnnotationIntrospector> it = all.iterator();
        assertSame(first, it.next());
        assertSame(second, it.next());
    }

    @Test
    public void testNopAnnotationDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertFalse(nop.isAnnotationBundle(null));
        assertNull(nop.findObjectIdInfo(null));
        assertNull(nop.findRootName(null));
        assertNull(nop.findPropertiesToIgnore(null, true));
        assertNull(nop.findIgnoreUnknownProperties(null));
        assertNull(nop.isIgnorableType(null));
    }

    @Test
    public void testNopVisibilityReturnsChecker() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        assertSame(checker, nop.findAutoDetectVisibility(null, checker));
    }

    @Test
    public void testNopReferenceAndMemberDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findReferenceType(null));
        assertFalse(nop.hasIgnoreMarker(null));
        assertNull(nop.findInjectableValueId(null));
        assertNull(nop.hasRequiredMarker(null));
        assertNull(nop.findImplicitPropertyName(null));
    }

    @Test
    public void testNopPropertyDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findViews(null));
        assertNull(nop.findFormat(null));
        assertNull(nop.findWrapperName(null));
        assertNull(nop.findPropertyDefaultValue(null));
        assertNull(nop.findPropertyDescription(null));
        assertNull(nop.findPropertyIndex(null));
        assertNull(nop.findPropertyAccess(null));
    }

    @Test
    public void testNopSerializerDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findSerializer(null));
        assertNull(nop.findKeySerializer(null));
        assertNull(nop.findContentSerializer(null));
        assertNull(nop.findNullSerializer(null));
        assertNull(nop.findSerializationTyping(null));
        assertNull(nop.findSerializationConverter(null));
    }

    @Test
    public void testInclusionReturnsSuppliedDefault() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertSame(JsonInclude.Include.NON_NULL,
                nop.findSerializationInclusion(null, JsonInclude.Include.NON_NULL));
        assertSame(JsonInclude.Include.ALWAYS,
                nop.findSerializationInclusionForContent(null, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testEmptyPropertyInclusion() throws Exception {
        JsonInclude.Value value = AnnotationIntrospector.nopInstance().findPropertyInclusion(null);
        assertNotNull(value);
        assertEquals(JsonInclude.Value.empty(), value);
    }

    @Test
    public void testEnumValueUsesEnumName() throws Exception {
        assertEquals("FIRST", AnnotationIntrospector.nopInstance().findEnumValue(Sample.FIRST));
    }

    @Test
    public void testEnumValuesFillOnlyMissingNames() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        String[] names = new String[] { null, "custom" };
        String[] result = nop.findEnumValues(Sample.class,
                new Enum<?>[] { Sample.FIRST, Sample.SECOND }, names);
        assertSame(names, result);
        assertEquals("FIRST", result[0]);
        assertEquals("custom", result[1]);
    }

    @Test
    public void testEnumValuesEmptyInput() throws Exception {
        String[] names = new String[0];
        assertSame(names, AnnotationIntrospector.nopInstance()
                .findEnumValues(Sample.class, new Enum<?>[0], names));
        assertEquals(0, names.length);
    }

    @Test
    public void testNopSerializationRefinementsAreNull() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findSerializationType(null));
        assertNull(nop.findSerializationKeyType(null, null));
        assertNull(nop.findSerializationContentType(null, null));
    }

    @Test
    public void testNopSerializationNameAndTypeNames() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findSerializationPropertyOrder(null));
        assertNull(nop.findSerializationSortAlphabetically(null));
        assertNull(nop.findNameForSerialization(null));
        assertFalse(nop.hasAsValueAnnotation(null));
    }

    @Test
    public void testNopDeserializationDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findDeserializer(null));
        assertNull(nop.findKeyDeserializer(null));
        assertNull(nop.findContentDeserializer(null));
        assertNull(nop.findDeserializationConverter(null));
        assertNull(nop.findDeserializationContentConverter(null));
        assertNull(nop.findNameForDeserialization(null));
    }

    @Test
    public void testNopDeserializerTypeRefinementsAreNull() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findDeserializationType(null, null));
        assertNull(nop.findDeserializationKeyType(null, null));
        assertNull(nop.findDeserializationContentType(null, null));
        assertNull(nop.findValueInstantiator(null));
        assertNull(nop.findPOJOBuilder(null));
        assertNull(nop.findPOJOBuilderConfig(null));
    }

    @Test
    public void testNopCreatorMarkersAreFalseOrNull() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertFalse(nop.hasAnySetterAnnotation(null));
        assertFalse(nop.hasAnyGetterAnnotation(null));
        assertFalse(nop.hasCreatorAnnotation(null));
        assertNull(nop.findCreatorBinding(null));
    }

    @Test
    public void testNopObjectReferenceInfoReturnsSameInput() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findObjectReferenceInfo(null, null));
    }

    @Test
    public void testNopClassAndSubtypeLookups() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findFilterId(null));
        assertNull(nop.findNamingStrategy(null));
        assertNull(nop.findClassDescription(null));
        assertNull(nop.findSubtypes(null));
        assertNull(nop.findTypeName(null));
    }

    @Test
    public void testNopTypeResolverLookups() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.findTypeResolver(null, null, null));
        assertNull(nop.findPropertyTypeResolver(null, null, null));
        assertNull(nop.findPropertyContentTypeResolver(null, null, null));
    }

    @Test
    public void testNopTypeIdAndUnwrappingDefaults() throws Exception {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        assertNull(nop.isTypeId(null));
        assertNull(nop.findUnwrappingNameTransformer(null));
    }

    @Test
    public void testNopSerializationContentConverterIsNull() throws Exception {
        assertNull(AnnotationIntrospector.nopInstance().findSerializationContentConverter(null));
    }

    @Test
    public void testNopVirtualPropertyHookLeavesListUnchanged() throws Exception {
        List<BeanPropertyWriter> properties = new ArrayList<BeanPropertyWriter>();
        AnnotationIntrospector.nopInstance().findAndAddVirtualProperties(null, null, properties);
        assertEquals(0, properties.size());
    }

    @Test
    public void testNopSetterConflictIsUnresolved() throws Exception {
        assertNull(AnnotationIntrospector.nopInstance().resolveSetterConflict(null, null, null));
    }

    @Test
    public void testNopSerializationRefinementReturnsBaseType() throws Exception {
        JavaType base = TypeFactory.defaultInstance().constructType(String.class);
        JavaType refined = AnnotationIntrospector.nopInstance()
                .refineSerializationType(null, null, base);
        assertSame(base, refined);
    }

    @Test
    public void testNopVersionIsAvailable() throws Exception {
        assertNotNull(AnnotationIntrospector.nopInstance().version());
    }

    private enum Sample {
        FIRST, SECOND
    }
}
