```java
package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;

public class JacksonAnnotationIntrospectorTest {

    // Helper to create a mock AnnotatedClass for testing
    private AnnotatedClass createMockAnnotatedClass(Class<?> cls) {
        AnnotationIntrospector intr = new JacksonAnnotationIntrospector(); // Using the class under test itself as introspector
        MixInResolver mir = null; // Not needed for most tests here.
        return AnnotatedClass.construct(cls, intr, mir);
    }

    // Helper to create a mock AnnotatedMember for testing
    private AnnotatedMember createMockAnnotatedMember(Class<?> declaringClass, String fieldName) throws NoSuchFieldException {
        AnnotationIntrospector intr = new JacksonAnnotationIntrospector();
        Field field = declaringClass.getDeclaredField(fieldName);
        AnnotatedClass context = AnnotatedClass.construct(declaringClass, intr, null);
        AnnotationMap annotations = new AnnotationMap(); // Empty annotations for simplicity
        return new VirtualAnnotatedMember(context, declaringClass, fieldName, field.getType());
    }

    // Helper to create a mock AnnotatedMethod for testing
    private AnnotatedMethod createMockAnnotatedMethod(Class<?> declaringClass, String methodName, Class<?>... parameterTypes) throws NoSuchMethodException {
        AnnotationIntrospector intr = new JacksonAnnotationIntrospector();
        java.lang.reflect.Method method = declaringClass.getDeclaredMethod(methodName, parameterTypes);
        AnnotatedClass context = AnnotatedClass.construct(declaringClass, intr, null);
        AnnotationMap annotations = new AnnotationMap();
        return new AnnotatedMethod(context, method, annotations);
    }

    @Test
    public void testIsAnnotationBundle() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        // Test with an annotation that has JacksonAnnotationsInside
        Annotation annWithBundle = new Annotation() {
            @Override public Class<? extends Annotation> annotationType() { return JacksonAnnotationsInside.class; }
            @Override public String toString() { return "@JacksonAnnotationsInside"; }
        };
        assertTrue(introspector.isAnnotationBundle(annWithBundle));

        // Test with an annotation that does not have JacksonAnnotationsInside
        Annotation annWithoutBundle = new Annotation() {
            @Override public Class<? extends Annotation> annotationType() { return JsonProperty.class; }
            @Override public String toString() { return "@JsonProperty"; }
        };
        assertFalse(introspector.isAnnotationBundle(annWithoutBundle));
    }

    @Test
    public void testFindEnumValue_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        // Need a dummy enum with a JsonProperty annotation
        assertEquals("custom_name", introspector.findEnumValue(TestEnumWithAnnotation.VALUE));
    }

    @Test
    public void testFindEnumValue_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        assertEquals("DEFAULT_NAME", introspector.findEnumValue(TestEnumWithoutAnnotation.DEFAULT_NAME));
    }

    @Test
    public void testFindRootName_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithRootName.class);
        PropertyName rootName = introspector.findRootName(ac);
        assertNotNull(rootName);
        assertEquals("MyRoot", rootName.getSimpleName());
    }

    @Test
    public void testFindRootName_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutRootName.class);
        assertNull(introspector.findRootName(ac));
    }

    @Test
    public void testFindPropertiesToIgnore_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithIgnore.class);
        String[] ignored = introspector.findPropertiesToIgnore(ac);
        assertNotNull(ignored);
        assertArrayEquals(new String[]{"field1", "field2"}, ignored);
    }

    @Test
    public void testFindPropertiesToIgnore_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutIgnore.class);
        assertNull(introspector.findPropertiesToIgnore(ac));
    }

    @Test
    public void testFindIgnoreUnknownProperties_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassIgnoreUnknownTrue.class);
        assertTrue(introspector.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testFindIgnoreUnknownProperties_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassIgnoreUnknownFalse.class);
        assertFalse(introspector.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testFindIgnoreUnknownProperties_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutIgnoreUnknown.class);
        assertNull(introspector.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testIsIgnorableType_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassIgnorableTrue.class);
        assertTrue(introspector.isIgnorableType(ac));
    }

    @Test
    public void testIsIgnorableType_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassIgnorableFalse.class);
        assertFalse(introspector.isIgnorableType(ac));
    }

    @Test
    public void testIsIgnorableType_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutIgnorable.class);
        assertNull(introspector.isIgnorableType(ac));
    }

    @Test
    public void testFindFilterId_WithId() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithFilter.class);
        Object filterId = introspector.findFilterId(ac);
        assertNotNull(filterId);
        assertEquals("myFilter", filterId);
    }

    @Test
    public void testFindFilterId_EmptyId() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithEmptyFilter.class);
        assertNull(introspector.findFilterId(ac));
    }

    @Test
    public void testFindFilterId_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutFilter.class);
        assertNull(introspector.findFilterId(ac));
    }

    @Test
    public void testFindNamingStrategy_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithNamingStrategy.class);
        assertEquals(MyNamingStrategy.class, introspector.findNamingStrategy(ac));
    }

    @Test
    public void testFindNamingStrategy_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutNamingStrategy.class);
        assertNull(introspector.findNamingStrategy(ac));
    }

    @Test
    public void testFindAutoDetectVisibility_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithAutoDetect.class);
        VisibilityChecker<?> checker = VisibilityChecker.defaultInstance();
        VisibilityChecker<?> newChecker = introspector.findAutoDetectVisibility(ac, checker);
        // Based on JsonAutoDetect.Visibility.ANY
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.isGetterVisible());
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.isFieldVisible());
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.isSetterVisible());
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.isCreatorVisible());
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.isIsGetterVisible());
    }

    @Test
    public void testFindAutoDetectVisibility_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutAutoDetect.class);
        VisibilityChecker<?> checker = VisibilityChecker.defaultInstance();
        VisibilityChecker<?> newChecker = introspector.findAutoDetectVisibility(ac, checker);
        // Should return the original checker if no annotation found
        assertSame(checker, newChecker);
    }

    @Test
    public void testFindImplicitPropertyName_ReturnsNull() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        // The method itself returns null, so we test that.
        // Need a mock AnnotatedMember.
        AnnotatedMember member = createMockAnnotatedMember(String.class, "length");
        assertNull(introspector.findImplicitPropertyName(member));
    }

    @Test
    public void testHasIgnoreMarker_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithIgnore.class, "ignoredField");
        assertTrue(introspector.hasIgnoreMarker(member));
    }

    @Test
    public void testHasIgnoreMarker_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutIgnore.class, "normalField");
        assertFalse(introspector.hasIgnoreMarker(member));
    }

    @Test
    public void testHasRequiredMarker_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithRequired.class, "requiredField");
        assertTrue(introspector.hasRequiredMarker(member));
    }

    @Test
    public void testHasRequiredMarker_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutRequired.class, "optionalField");
        assertFalse(introspector.hasRequiredMarker(member));
    }

    @Test
    public void testHasRequiredMarker_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutRequired.class, "defaultField");
        assertNull(introspector.hasRequiredMarker(member));
    }

    @Test
    public void testFindPropertyAccess_ReadWrite() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithPropertyAccess.class, "readWriteField");
        assertEquals(JsonProperty.Access.READ_WRITE, introspector.findPropertyAccess(member));
    }

    @Test
    public void testFindPropertyAccess_ReadOnly() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithPropertyAccess.class, "readOnlyField");
        assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(member));
    }

    @Test
    public void testFindPropertyAccess_WriteOnly() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithPropertyAccess.class, "writeOnlyField");
        assertEquals(JsonProperty.Access.WRITE_ONLY, introspector.findPropertyAccess(member));
    }

    @Test
    public void testFindPropertyAccess_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutPropertyAccess.class, "normalField");
        assertNull(introspector.findPropertyAccess(member));
    }

    @Test
    public void testFindPropertyDescription() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDescription.class);
        assertEquals("This is a description.", introspector.findPropertyDescription(ac));
    }

    @Test
    public void testFindPropertyDescription_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDescription.class);
        assertNull(introspector.findPropertyDescription(ac));
    }

    @Test
    public void testFindPropertyIndex_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithIndex.class);
        assertEquals(Integer.valueOf(5), introspector.findPropertyIndex(ac));
    }

    @Test
    public void testFindPropertyIndex_Unknown() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithUnknownIndex.class);
        assertNull(introspector.findPropertyIndex(ac));
    }

    @Test
    public void testFindPropertyIndex_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutIndex.class);
        assertNull(introspector.findPropertyIndex(ac));
    }

    @Test
    public void testFindPropertyDefaultValue_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDefaultValue.class);
        assertEquals("defaultValue", introspector.findPropertyDefaultValue(ac));
    }

    @Test
    public void testFindPropertyDefaultValue_Empty() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithEmptyDefaultValue.class);
        assertNull(introspector.findPropertyDefaultValue(ac));
    }

    @Test
    public void testFindPropertyDefaultValue_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDefaultValue.class);
        assertNull(introspector.findPropertyDefaultValue(ac));
    }

    @Test
    public void testFindFormat_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithFormat.class);
        JsonFormat.Value format = introspector.findFormat(ac);
        assertNotNull(format);
        assertEquals("yyyy-MM-dd", format.getDatePattern());
    }

    @Test
    public void testFindFormat_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutFormat.class);
        assertNull(introspector.findFormat(ac));
    }

    @Test
    public void testFindReferenceType_Managed() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithReference.class, "managedRef");
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(member);
        assertNotNull(ref);
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, ref.getType());
        assertEquals("parent", ref.getName());
    }

    @Test
    public void testFindReferenceType_Back() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithReference.class, "backRef");
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(member);
        assertNotNull(ref);
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, ref.getType());
        assertEquals("child", ref.getName());
    }

    @Test
    public void testFindReferenceType_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutReference.class, "normalField");
        assertNull(introspector.findReferenceType(member));
    }

    @Test
    public void testFindUnwrappingNameTransformer_Enabled() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithUnwrapped.class, "unwrappedField");
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(member);
        assertNotNull(transformer);
        assertEquals("prefix_", transformer.transform("fieldName"));
        assertEquals("fieldName_suffix", transformer.reverse(transformer.transform("fieldName")));
    }

    @Test
    public void testFindUnwrappingNameTransformer_Disabled() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithUnwrappedDisabled.class, "unwrappedFieldDisabled");
        assertNull(introspector.findUnwrappingNameTransformer(member));
    }

    @Test
    public void testFindUnwrappingNameTransformer_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutUnwrapped.class, "normalField");
        assertNull(introspector.findUnwrappingNameTransformer(member));
    }

    @Test
    public void testFindInjectableValueId_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithInject.class, "injectableFieldWithValue");
        assertEquals("customId", introspector.findInjectableValueId(member));
    }

    @Test
    public void testFindInjectableValueId_EmptyValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithInject.class, "injectableFieldEmptyValue");
        // Expected to use the field's raw type name
        assertEquals("java.lang.String", introspector.findInjectableValueId(member));
    }

    @Test
    public void testFindInjectableValueId_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutInject.class, "normalField");
        assertNull(introspector.findInjectableValueId(member));
    }

    @Test
    public void testFindViews_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithViews.class);
        Class<?>[] views = introspector.findViews(ac);
        assertNotNull(views);
        assertArrayEquals(new Class<?>[]{MyView1.class, MyView2.class}, views);
    }

    @Test
    public void testFindViews_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutViews.class);
        assertNull(introspector.findViews(ac));
    }

    @Test
    public void testFindTypeResolver_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = null; // Mock or provide a real one if needed
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithTypeInfo.class);
        JavaType baseType = null; // Mock or provide a real one if needed
        TypeResolverBuilder<?> builder = introspector.findTypeResolver(config, ac, baseType);
        assertNotNull(builder);
        // This is hard to assert specific type without a concrete mock config and baseType.
        // We can check if it's not the default StdTypeResolverBuilder if custom resolver is specified.
        // For this example, assume it's correctly constructed based on annotation.
        // If default type resolver is used, it would be StdTypeResolverBuilder.
        // If a custom resolver is used (e.g. using JsonTypeResolver), it would be that class.
        assertTrue(builder instanceof StdTypeResolverBuilder); // Assuming StdTypeResolverBuilder is default.
    }

    @Test
    public void testFindTypeResolver_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = null;
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutTypeInfo.class);
        JavaType baseType = null;
        assertNull(introspector.findTypeResolver(config, ac, baseType));
    }

    @Test
    public void testFindSubtypes_WithAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSubtypes.class);
        List<NamedType> subtypes = introspector.findSubtypes(ac);
        assertNotNull(subtypes);
        assertEquals(2, subtypes.size());
        assertTrue(subtypes.contains(new NamedType(SubtypeA.class, "a")));
        assertTrue(subtypes.contains(new NamedType(SubtypeB.class, "b")));
    }

    @Test
    public void testFindSubtypes_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSubtypes.class);
        assertNull(introspector.findSubtypes(ac));
    }

    @Test
    public void testFindTypeName_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithTypeName.class);
        assertEquals("CustomTypeName", introspector.findTypeName(ac));
    }

    @Test
    public void testFindTypeName_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutTypeName.class);
        assertNull(introspector.findTypeName(ac));
    }

    @Test
    public void testIsTypeId_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithTypeId.class, "typeIdField");
        assertTrue(introspector.isTypeId(member));
    }

    @Test
    public void testIsTypeId_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutTypeId.class, "normalField");
        assertFalse(introspector.isTypeId(member));
    }

    @Test
    public void testFindObjectIdInfo_WithGenerator() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithObjectId.class);
        ObjectIdInfo objectIdInfo = introspector.findObjectIdInfo(ac);
        assertNotNull(objectIdInfo);
        assertEquals("id", objectIdInfo.getPropertyName().getSimpleName());
        assertEquals(ObjectIdGenerators.IntSequenceGenerator.class, objectIdInfo.getGeneratorType());
    }

    @Test
    public void testFindObjectIdInfo_NoneGenerator() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithNoObjectId.class);
        assertNull(introspector.findObjectIdInfo(ac));
    }

    @Test
    public void testFindObjectIdInfo_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutObjectId.class);
        assertNull(introspector.findObjectIdInfo(ac));
    }

    @Test
    public void testFindObjectReferenceInfo_AlwaysAsIdTrue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        ObjectIdInfo initialInfo = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.IntSequenceGenerator.class, null);
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithObjectReferenceAlwaysIdTrue.class);
        ObjectIdInfo updatedInfo = introspector.findObjectReferenceInfo(ac, initialInfo);
        assertNotNull(updatedInfo);
        assertTrue(updatedInfo.alwaysAsId());
        assertSame(initialInfo.getPropertyName(), updatedInfo.getPropertyName());
    }

    @Test
    public void testFindObjectReferenceInfo_AlwaysAsIdFalse() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        ObjectIdInfo initialInfo = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.IntSequenceGenerator.class, null);
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithObjectReferenceAlwaysIdFalse.class);
        ObjectIdInfo updatedInfo = introspector.findObjectReferenceInfo(ac, initialInfo);
        assertNotNull(updatedInfo);
        assertFalse(updatedInfo.alwaysAsId());
        assertSame(initialInfo.getPropertyName(), updatedInfo.getPropertyName());
    }

    @Test
    public void testFindObjectReferenceInfo_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        ObjectIdInfo initialInfo = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.IntSequenceGenerator.class, null);
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutObjectReference.class);
        ObjectIdInfo updatedInfo = introspector.findObjectReferenceInfo(ac, initialInfo);
        assertNotNull(updatedInfo);
        assertSame(initialInfo, updatedInfo); // Should be the same object if no annotation
    }

    @Test
    public void testFindSerializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSerializerUsing.class);
        assertEquals(MySerializer.class, introspector.findSerializer(ac));
    }

    @Test
    public void testFindSerializer_WithRawValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithRawValue.class);
        Object serializer = introspector.findSerializer(ac);
        assertNotNull(serializer);
        assertTrue(serializer instanceof RawSerializer);
    }

    @Test
    public void testFindSerializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSerializer.class);
        assertNull(introspector.findSerializer(ac));
    }

    @Test
    public void testFindKeySerializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithKeySerializer.class);
        assertEquals(MyKeySerializer.class, introspector.findKeySerializer(ac));
    }

    @Test
    public void testFindKeySerializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutKeySerializer.class);
        assertNull(introspector.findKeySerializer(ac));
    }

    @Test
    public void testFindContentSerializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithContentSerializer.class);
        assertEquals(MyContentSerializer.class, introspector.findContentSerializer(ac));
    }

    @Test
    public void testFindContentSerializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutContentSerializer.class);
        assertNull(introspector.findContentSerializer(ac));
    }

    @Test
    public void testFindNullSerializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithNullSerializer.class);
        assertEquals(MyNullSerializer.class, introspector.findNullSerializer(ac));
    }

    @Test
    public void testFindNullSerializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutNullSerializer.class);
        assertNull(introspector.findNullSerializer(ac));
    }

    @Test
    public void testFindSerializationInclusion_NonNull() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithInclusionNonNull.class);
        assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_NonDefault() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithInclusionNonDefault.class);
        assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_NonEmpty() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithInclusionNonEmpty.class);
        assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_DefaultValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithInclusionDefault.class);
        assertEquals(JsonInclude.Include.DEFAULT_INCLUSION, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_FromJsonSerialize() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithJsonSerializeInclusion.class);
        assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusion_FallbackToDefault() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutInclusion.class);
        assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusionForContent_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithContentInclusion.class);
        assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusionForContent(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusionForContent_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutContentInclusion.class);
        assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusionForContent(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSerializationType.class);
        assertEquals(MyConcreteType.class, introspector.findSerializationType(ac));
    }

    @Test
    public void testFindSerializationType_AsExplicit() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSerializationAs.class);
        assertEquals(MyConcreteTypeForAs.class, introspector.findSerializationType(ac));
    }

    @Test
    public void testFindSerializationType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSerializationType.class);
        assertNull(introspector.findSerializationType(ac));
    }

    @Test
    public void testFindSerializationKeyType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSerializationKeyType.class);
        assertEquals(MyKeyType.class, introspector.findSerializationKeyType(ac, null));
    }

    @Test
    public void testFindSerializationKeyType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSerializationKeyType.class);
        assertNull(introspector.findSerializationKeyType(ac, null));
    }

    @Test
    public void testFindSerializationContentType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSerializationContentType.class);
        assertEquals(MyContentType.class, introspector.findSerializationContentType(ac, null));
    }

    @Test
    public void testFindSerializationContentType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSerializationContentType.class);
        assertNull(introspector.findSerializationContentType(ac, null));
    }

    @Test
    public void testFindSerializationTyping_Static() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithTypingStatic.class);
        assertEquals(JsonSerialize.Typing.STATIC, introspector.findSerializationTyping(ac));
    }

    @Test
    public void testFindSerializationTyping_Dynamic() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithTypingDynamic.class);
        assertEquals(JsonSerialize.Typing.DYNAMIC, introspector.findSerializationTyping(ac));
    }

    @Test
    public void testFindSerializationTyping_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutTyping.class);
        assertNull(introspector.findSerializationTyping(ac));
    }

    @Test
    public void testFindSerializationConverter_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithConverter.class);
        assertEquals(MyConverter.class, introspector.findSerializationConverter(ac));
    }

    @Test
    public void testFindSerializationConverter_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutConverter.class);
        assertNull(introspector.findSerializationConverter(ac));
    }

    @Test
    public void testFindSerializationContentConverter_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithContentConverter.class, "contentField");
        assertEquals(MyContentConverter.class, introspector.findSerializationContentConverter(member));
    }

    @Test
    public void testFindSerializationContentConverter_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutContentConverter.class, "normalField");
        assertNull(introspector.findSerializationContentConverter(member));
    }

    @Test
    public void testFindSerializationPropertyOrder_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithPropertyOrder.class);
        String[] order = introspector.findSerializationPropertyOrder(ac);
        assertNotNull(order);
        assertArrayEquals(new String[]{"prop1", "prop2"}, order);
    }

    @Test
    public void testFindSerializationPropertyOrder_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutPropertyOrder.class);
        assertNull(introspector.findSerializationPropertyOrder(ac));
    }

    @Test
    public void testFindSerializationSortAlphabetically_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSortAlphaTrue.class);
        assertTrue(introspector.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testFindSerializationSortAlphabetically_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithSortAlphaFalse.class);
        assertFalse(introspector.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testFindSerializationSortAlphabetically_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutSortAlpha.class);
        assertNull(introspector.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testFindAndAddVirtualProperties_WithAttrs() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = null; // Mock or provide a real one
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithVirtualAttrs.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        introspector.findAndAddVirtualProperties(config, ac, properties);
        assertEquals(2, properties.size()); // Check for both attrs
        assertTrue(properties.get(0) instanceof AttributePropertyWriter);
        assertTrue(properties.get(1) instanceof AttributePropertyWriter);
    }

    @Test
    public void testFindAndAddVirtualProperties_WithProps() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = null; // Mock or provide a real one
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithVirtualProps.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        introspector.findAndAddVirtualProperties(config, ac, properties);
        assertEquals(1, properties.size());
        assertTrue(properties.get(0) instanceof VirtualBeanPropertyWriter);
    }

    @Test
    public void testFindAndAddVirtualProperties_Without() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = null;
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutVirtual.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        introspector.findAndAddVirtualProperties(config, ac, properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void testFindNameForSerialization_WithJsonGetter() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonGetter.class, "field"); // Assuming 'field' is the member backing the getter
        PropertyName name = introspector.findNameForSerialization(member);
        assertNotNull(name);
        assertEquals("getterName", name.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_WithJsonProperty() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonProperty.class, "someField");
        PropertyName name = introspector.findNameForSerialization(member);
        assertNotNull(name);
        assertEquals("propertyName", name.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_WithJsonSerialize() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonSerialize.class, "fieldWithSerialize");
        PropertyName name = introspector.findNameForSerialization(member);
        assertNotNull(name);
        assertEquals("", name.getSimpleName()); // Empty string implies default/no explicit naming
    }

    @Test
    public void testFindNameForSerialization_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutName.class, "normalField");
        assertNull(introspector.findNameForSerialization(member));
    }

    @Test
    public void testHasAsValueAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithAsValue.class, "getValue");
        assertTrue(introspector.hasAsValueAnnotation(method));
    }

    @Test
    public void testHasAsValueAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithoutAsValue.class, "someMethod");
        assertFalse(introspector.hasAsValueAnnotation(method));
    }

    @Test
    public void testFindDeserializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializerUsing.class);
        assertEquals(MyDeserializer.class, introspector.findDeserializer(ac));
    }

    @Test
    public void testFindDeserializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDeserializer.class);
        assertNull(introspector.findDeserializer(ac));
    }

    @Test
    public void testFindKeyDeserializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithKeyDeserializer.class);
        assertEquals(MyKeyDeserializer.class, introspector.findKeyDeserializer(ac));
    }

    @Test
    public void testFindKeyDeserializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutKeyDeserializer.class);
        assertNull(introspector.findKeyDeserializer(ac));
    }

    @Test
    public void testFindContentDeserializer_WithUsing() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithContentDeserializer.class);
        assertEquals(MyContentDeserializer.class, introspector.findContentDeserializer(ac));
    }

    @Test
    public void testFindContentDeserializer_None() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutContentDeserializer.class);
        assertNull(introspector.findContentDeserializer(ac));
    }

    @Test
    public void testFindDeserializationType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializationType.class);
        assertEquals(MyConcreteTypeForDeserialization.class, introspector.findDeserializationType(ac, null));
    }

    @Test
    public void testFindDeserializationType_AsExplicit() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializationAs.class);
        assertEquals(MyConcreteTypeForDeserializationAs.class, introspector.findDeserializationType(ac, null));
    }

    @Test
    public void testFindDeserializationType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDeserializationType.class);
        assertNull(introspector.findDeserializationType(ac, null));
    }

    @Test
    public void testFindDeserializationKeyType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializationKeyType.class);
        assertEquals(MyKeyTypeForDeserialization.class, introspector.findDeserializationKeyType(ac, null));
    }

    @Test
    public void testFindDeserializationKeyType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDeserializationKeyType.class);
        assertNull(introspector.findDeserializationKeyType(ac, null));
    }

    @Test
    public void testFindDeserializationContentType_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializationContentType.class);
        assertEquals(MyContentTypeForDeserialization.class, introspector.findDeserializationContentType(ac, null));
    }

    @Test
    public void testFindDeserializationContentType_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDeserializationContentType.class);
        assertNull(introspector.findDeserializationContentType(ac, null));
    }

    @Test
    public void testFindDeserializationConverter_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithDeserializationConverter.class);
        assertEquals(MyDeserializationConverter.class, introspector.findDeserializationConverter(ac));
    }

    @Test
    public void testFindDeserializationConverter_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutDeserializationConverter.class);
        assertNull(introspector.findDeserializationConverter(ac));
    }

    @Test
    public void testFindDeserializationContentConverter_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithDeserializationContentConverter.class, "contentField");
        assertEquals(MyDeserializationContentConverter.class, introspector.findDeserializationContentConverter(member));
    }

    @Test
    public void testFindDeserializationContentConverter_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutDeserializationContentConverter.class, "normalField");
        assertNull(introspector.findDeserializationContentConverter(member));
    }

    @Test
    public void testFindValueInstantiator_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithValueInstantiator.class);
        assertEquals(MyValueInstantiator.class, introspector.findValueInstantiator(ac));
    }

    @Test
    public void testFindValueInstantiator_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutValueInstantiator.class);
        assertNull(introspector.findValueInstantiator(ac));
    }

    @Test
    public void testFindPOJOBuilder_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithPojoBuilder.class);
        assertEquals(MyPojoBuilder.class, introspector.findPOJOBuilder(ac));
    }

    @Test
    public void testFindPOJOBuilder_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutPojoBuilder.class);
        assertNull(introspector.findPOJOBuilder(ac));
    }

    @Test
    public void testFindPOJOBuilderConfig_WithValue() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithPojoBuilderConfig.class);
        JsonPOJOBuilder.Value config = introspector.findPOJOBuilderConfig(ac);
        assertNotNull(config);
        assertEquals("withPrefix", config.withPrefix);
        assertEquals("withoutSuffix", config.withoutSuffix);
    }

    @Test
    public void testFindPOJOBuilderConfig_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutPojoBuilderConfig.class);
        assertNull(introspector.findPOJOBuilderConfig(ac));
    }

    @Test
    public void testFindNameForDeserialization_WithJsonSetter() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonSetter.class, "value"); // Assuming 'value' is the parameter for setValue
        PropertyName name = introspector.findNameForDeserialization(member);
        assertNotNull(name);
        assertEquals("setterName", name.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_WithJsonProperty() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonPropertyForDeserialization.class, "someField");
        PropertyName name = introspector.findNameForDeserialization(member);
        assertNotNull(name);
        assertEquals("propertyNameForDeserialization", name.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_WithJsonDeserialize() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithJsonDeserialize.class, "fieldWithDeserialize");
        PropertyName name = introspector.findNameForDeserialization(member);
        assertNotNull(name);
        assertEquals("", name.getSimpleName()); // Empty string implies default/no explicit naming
    }

    @Test
    public void testFindNameForDeserialization_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMember member = createMockAnnotatedMember(AnnotatedMemberWithoutNameForDeserialization.class, "normalField");
        assertNull(introspector.findNameForDeserialization(member));
    }

    @Test
    public void testHasAnySetterAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithAnySetter.class, "setAny", String.class, Object.class);
        assertTrue(introspector.hasAnySetterAnnotation(method));
    }

    @Test
    public void testHasAnySetterAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithoutAnySetter.class, "someMethod");
        assertFalse(introspector.hasAnySetterAnnotation(method));
    }

    @Test
    public void testHasAnyGetterAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithAnyGetter.class, "getAny");
        assertTrue(introspector.hasAnyGetterAnnotation(method));
    }

    @Test
    public void testHasAnyGetterAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedMethod method = createMockAnnotatedMethod(AnnotatedMethodWithoutAnyGetter.class, "someMethod");
        assertFalse(introspector.hasAnyGetterAnnotation(method));
    }

    @Test
    public void testHasCreatorAnnotation_True() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithCreator.class);
        assertTrue(introspector.hasCreatorAnnotation(ac));
    }

    @Test
    public void testHasCreatorAnnotation_False() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutCreator.class);
        assertFalse(introspector.hasCreatorAnnotation(ac));
    }

    @Test
    public void testFindCreatorBinding_Properties() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithCreatorProperties.class);
        assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(ac));
    }

    @Test
    public void testFindCreatorBinding_Delegating() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithCreatorDelegating.class);
        assertEquals(JsonCreator.Mode.DELEGATING, introspector.findCreatorBinding(ac));
    }

    @Test
    public void testFindCreatorBinding_Default() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithCreatorDefault.class);
        assertEquals(JsonCreator.Mode.DEFAULT, introspector.findCreatorBinding(ac));
    }

    @Test
    public void testFindCreatorBinding_Disabled() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithCreatorDisabled.class);
        assertEquals(JsonCreator.Mode.DISABLED, introspector.findCreatorBinding(ac));
    }

    @Test
    public void testFindCreatorBinding_WithoutAnnotation() throws Exception {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = createMockAnnotatedClass(AnnotatedClassWithoutCreatorBinding.class);
        assertNull(introspector.findCreatorBinding(ac));
    }

    // Dummy annotations and classes for testing
    // Enum types must be top-level or static nested classes, not local.
    enum TestEnumWithAnnotation {
        @JsonProperty("custom_name") VALUE
    }
    enum TestEnumWithoutAnnotation {
        DEFAULT_NAME
    }

    @JsonRootName("MyRoot")
    private static class AnnotatedClassWithRootName {}
    private static class AnnotatedClassWithoutRootName {}

    @JsonIgnoreProperties({"field1", "field2"})
    private static class AnnotatedClassWithIgnore {}
    private static class AnnotatedClassWithoutIgnore {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class AnnotatedClassIgnoreUnknownTrue {}
    @JsonIgnoreProperties(ignoreUnknown = false)
    private static class AnnotatedClassIgnoreUnknownFalse {}
    private static class AnnotatedClassWithoutIgnoreUnknown {}

    @JsonIgnoreType
    private static class AnnotatedClassIgnorableTrue {}
    // Using a different annotation to signify "false" for testing `isIgnorableType`
    private static class AnnotatedClassIgnorableFalse {}
    private static class AnnotatedClassWithoutIgnorable {}

    @JsonFilter("myFilter")
    private static class AnnotatedClassWithFilter {}
    @JsonFilter("")
    private static class AnnotatedClassWithEmptyFilter {}
    private static class AnnotatedClassWithoutFilter {}

    private static class MyNamingStrategy extends PropertyNamingStrategy {}
    @JsonNaming(MyNamingStrategy.class)
    private static class AnnotatedClassWithNamingStrategy {}
    private static class AnnotatedClassWithoutNamingStrategy {}

    @JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.ANY,
        isGetterVisibility = JsonAutoDetect.Visibility.ANY,
        setterVisibility = JsonAutoDetect.Visibility.ANY,
        creatorVisibility = JsonAutoDetect.Visibility.ANY
    )
    private static class AnnotatedClassWithAutoDetect {}
    private static class AnnotatedClassWithoutAutoDetect {}

    private static class AnnotatedMemberWithIgnore { @JsonIgnore String ignoredField; }
    private static class AnnotatedMemberWithoutIgnore { String normalField; }

    private static class AnnotatedMemberWithRequired { @JsonProperty(required = true) String requiredField; }
    private static class AnnotatedMemberWithoutRequired { String optionalField; String defaultField; }

    private static class AnnotatedMemberWithPropertyAccess {
        @JsonProperty(access = JsonProperty.Access.READ_WRITE) String readWriteField;
        @JsonProperty(access = JsonProperty.Access.READ_ONLY) String readOnlyField;
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) String writeOnlyField;
    }
    private static class AnnotatedMemberWithoutPropertyAccess { String normalField; }

    @JsonPropertyDescription("This is a description.")
    private static class AnnotatedClassWithDescription {}
    private static class AnnotatedClassWithoutDescription {}

    @JsonProperty(index = 5)
    private static class AnnotatedClassWithIndex {}
    @JsonProperty(index = JsonProperty.INDEX_UNKNOWN)
    private static class AnnotatedClassWithUnknownIndex {}
    private static class AnnotatedClassWithoutIndex {}

    @JsonProperty(defaultValue = "defaultValue")
    private static class AnnotatedClassWithDefaultValue {}
    @JsonProperty(defaultValue = "")
    private static class AnnotatedClassWithEmptyDefaultValue {}
    private static class AnnotatedClassWithoutDefaultValue {}

    @JsonFormat(pattern = "yyyy-MM-dd")
    private static class AnnotatedClassWithFormat {}
    private static class AnnotatedClassWithoutFormat {}

    private static class AnnotatedMemberWithReference {
        @JsonManagedReference("parent") String managedRef;
        @JsonBackReference("child") String backRef;
    }
    private static class AnnotatedMemberWithoutReference { String normalField; }

    @JsonUnwrapped(enabled = true, prefix = "prefix_", suffix = "_suffix")
    private static class AnnotatedMemberWithUnwrapped { String unwrappedField; }
    @JsonUnwrapped(enabled = false)
    private static class AnnotatedMemberWithUnwrappedDisabled { String unwrappedFieldDisabled; }
    private static class AnnotatedMemberWithoutUnwrapped { String normalField; }

    private static class AnnotatedMemberWithInject {
        @JacksonInject("customId") String injectableFieldWithValue;
        @JacksonInject("") String injectableFieldEmptyValue;
    }
    private static class AnnotatedMemberWithoutInject { String normalField; }

    private static class MyView1 {}
    private static class MyView2 {}
    @JsonView({MyView1.class, MyView2.class})
    private static class AnnotatedClassWithViews {}
    private static class AnnotatedClassWithoutViews {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    private static class AnnotatedClassWithTypeInfo {}
    private static class AnnotatedClassWithoutTypeInfo {}

    @JsonSubTypes({@JsonSubTypes.Type(value = SubtypeA.class, name = "a"), @JsonSubTypes.Type(value = SubtypeB.class, name = "b")})
    private static class AnnotatedClassWithSubtypes {}
    private static class AnnotatedClassWithoutSubtypes {}
    private static class SubtypeA {}
    private static class SubtypeB {}

    @JsonTypeName("CustomTypeName")
    private static class AnnotatedClassWithTypeName {}
    private static class AnnotatedClassWithoutTypeName {}

    private static class AnnotatedMemberWithTypeId { @JsonTypeId String typeIdField; }
    private static class AnnotatedMemberWithoutTypeId { String normalField; }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    private static class AnnotatedClassWithObjectId {}
    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    private static class AnnotatedClassWithNoObjectId {}
    private static class AnnotatedClassWithoutObjectId {}

    @JsonIdentityReference(alwaysAsId = true)
    private static class AnnotatedClassWithObjectReferenceAlwaysIdTrue {}
    @JsonIdentityReference(alwaysAsId = false)
    private static class AnnotatedClassWithObjectReferenceAlwaysIdFalse {}
    private static class AnnotatedClassWithoutObjectReference {}

    private static class MySerializer extends JsonSerializer<Object> {}
    @JsonSerialize(using = MySerializer.class)
    private static class AnnotatedClassWithSerializerUsing {}
    @JsonRawValue(true)
    private static class AnnotatedClassWithRawValue {}
    private static class AnnotatedClassWithoutSerializer {}

    private static class MyKeySerializer extends JsonSerializer<Object> {}
    @JsonSerialize(keyUsing = MyKeySerializer.class)
    private static class AnnotatedClassWithKeySerializer {}
    private static class AnnotatedClassWithoutKeySerializer {}

    private static class MyContentSerializer extends JsonSerializer<Object> {}
    @JsonSerialize(contentUsing = MyContentSerializer.class)
    private static class AnnotatedClassWithContentSerializer {}
    private static class AnnotatedClassWithoutContentSerializer {}

    private static class MyNullSerializer extends JsonSerializer<Object> {}
    @JsonSerialize(nullsUsing = MyNullSerializer.class)
    private static class AnnotatedClassWithNullSerializer {}
    private static class AnnotatedClassWithoutNullSerializer {}

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class AnnotatedClassWithInclusionNonNull {}
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private static class AnnotatedClassWithInclusionNonDefault {}
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private static class AnnotatedClassWithInclusionNonEmpty {}
    @JsonInclude(JsonInclude.Include.DEFAULT_INCLUSION)
    private static class AnnotatedClassWithInclusionDefault {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    private static class AnnotatedClassWithJsonSerializeInclusion {}
    private static class AnnotatedClassWithoutInclusion {}

    @JsonInclude(content = JsonInclude.Include.NON_NULL)
    private static class AnnotatedClassWithContentInclusion {}
    private static class AnnotatedClassWithoutContentInclusion {}

    private static class MyConcreteType {}
    @JsonSerialize(as = MyConcreteType.class)
    private static class AnnotatedClassWithSerializationType {}
    @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
    private static class AnnotatedClassWithTypingStatic {}
    @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
    private static class AnnotatedClassWithTypingDynamic {}
    private static class AnnotatedClassWithoutTyping {}

    private static class MyKeyType {}
    @JsonSerialize(keyAs = MyKeyType.class)
    private static class AnnotatedClassWithSerializationKeyType {}
    private static class AnnotatedClassWithoutSerializationKeyType {}

    private static class MyContentType {}
    @JsonSerialize(contentAs = MyContentType.class)
    private static class AnnotatedClassWithSerializationContentType {}
    private static class AnnotatedClassWithoutSerializationContentType {}

    private static class MyConverter {}
    @JsonSerialize(converter = MyConverter.class)
    private static class AnnotatedClassWithConverter {}
    private static class AnnotatedClassWithoutConverter {}

    private static class MyContentConverter {}
    @JsonSerialize(contentConverter = MyContentConverter.class)
    private static class AnnotatedMemberWithContentConverter { Object contentField; }
    private static class AnnotatedMemberWithoutContentConverter { Object normalField; }

    @JsonPropertyOrder({"prop1", "prop2"})
    private static class AnnotatedClassWithPropertyOrder {}
    private static class AnnotatedClassWithoutPropertyOrder {}

    @JsonPropertyOrder(alphabetic = true)
    private static class AnnotatedClassWithSortAlphaTrue {}
    @JsonPropertyOrder(alphabetic = false)
    private static class AnnotatedClassWithSortAlphaFalse {}
    private static class AnnotatedClassWithoutSortAlpha {}

    // For findAndAddVirtualProperties
    private static class AnnotatedClassWithVirtualAttrs {
        @JsonAppend.Attr(value = "attr1") String attr1;
        @JsonAppend.Attr(value = "attr2", propName = "renamedAttr2") String attr2;
    }
    private static class AnnotatedClassWithVirtualProps {
        @JsonAppend.Prop(value = MyVirtualBeanPropertyWriter.class, type = String.class) String prop1;
    }
    private static class AnnotatedClassWithoutVirtual {}
    // Dummy for JsonAppend.Prop
    private static class MyVirtualBeanPropertyWriter extends VirtualBeanPropertyWriter {
        protected MyVirtualBeanPropertyWriter(BeanPropertyDefinition propDef, AnnotatedMember member, JavaType declaredType) { super(propDef, member, declaredType); }
        @Override protected Object getPropertyValue(Object bean) throws Exception { return null; }
        @Override public VirtualBeanPropertyWriter withConfig(MapperConfig<?> config, AnnotatedClass annotClass, BeanPropertyDefinition propDef, JavaType type) { return this; }
    }

    private static class AnnotatedMemberWithJsonGetter {
        @JsonGetter("getterName")
        public String getField() { return "value"; } // Dummy method to simulate getter
    }
    private static class AnnotatedMemberWithJsonProperty { @JsonProperty("propertyName") String someField; }
    @JsonSerialize
    private static class AnnotatedMemberWithJsonSerialize { Object fieldWithSerialize; } // Presence of annotation is enough
    private static class AnnotatedMemberWithoutName { Object normalField; }

    private static class AnnotatedMethodWithAsValue {
        @JsonValue
        public boolean getValue() { return true; }
    }
    private static class AnnotatedMethodWithoutAsValue { void someMethod() {} }

    private static class MyDeserializer extends JsonDeserializer<Object> {}
    @JsonDeserialize(using = MyDeserializer.class)
    private static class AnnotatedClassWithDeserializerUsing {}
    private static class AnnotatedClassWithoutDeserializer {}

    private static class MyKeyDeserializer extends KeyDeserializer {}
    @JsonDeserialize(keyUsing = MyKeyDeserializer.class)
    private static class AnnotatedClassWithKeyDeserializer {}
    private static class AnnotatedClassWithoutKeyDeserializer {}

    private static class MyContentDeserializer extends JsonDeserializer<Object> {}
    @JsonDeserialize(contentUsing = MyContentDeserializer.class)
    private static class AnnotatedClassWithContentDeserializer {}
    private static class AnnotatedClassWithoutContentDeserializer {}

    private static class MyConcreteTypeForDeserialization {}
    @JsonDeserialize(as = MyConcreteTypeForDeserialization.class)
    private static class AnnotatedClassWithDeserializationType {}
    private static class MyConcreteTypeForDeserializationAs {}
    @JsonDeserialize(as = MyConcreteTypeForDeserializationAs.class)
    private static class AnnotatedClassWithDeserializationAs {}
    private static class AnnotatedClassWithoutDeserializationType {}

    private static class MyKeyTypeForDeserialization {}
    @JsonDeserialize(keyAs = MyKeyTypeForDeserialization.class)
    private static class AnnotatedClassWithDeserializationKeyType {}
    private static class AnnotatedClassWithoutDeserializationKeyType {}

    private static class MyContentTypeForDeserialization {}
    @JsonDeserialize(contentAs = MyContentTypeForDeserialization.class)
    private static class AnnotatedClassWithDeserializationContentType {}
    private static class AnnotatedClassWithoutDeserializationContentType {}

    private static class MyDeserializationConverter {}
    @JsonDeserialize(converter = MyDeserializationConverter.class)
    private static class AnnotatedClassWithDeserializationConverter {}
    private static class AnnotatedClassWithoutDeserializationConverter {}

    private static class MyDeserializationContentConverter {}
    @JsonDeserialize(contentConverter = MyDeserializationContentConverter.class)
    private static class AnnotatedMemberWithDeserializationContentConverter { Object contentField; }
    private static class AnnotatedMemberWithoutDeserializationContentConverter { Object normalField; }

    private static class MyValueInstantiator {}
    @JsonValueInstantiator(MyValueInstantiator.class)
    private static class AnnotatedClassWithValueInstantiator {}
    private static class AnnotatedClassWithoutValueInstantiator {}

    private static class MyPojoBuilder {}
    @JsonDeserialize(builder = MyPojoBuilder.class)
    private static class AnnotatedClassWithPojoBuilder {}
    private static class AnnotatedClassWithoutPojoBuilder {}

    @JsonPOJOBuilder(withPrefix = "withPrefix", withoutSuffix = "withoutSuffix")
    private static class AnnotatedClassWithPojoBuilderConfig {}
    private static class AnnotatedClassWithoutPojoBuilderConfig {}

    private static class AnnotatedMemberWithJsonSetter { @JsonSetter("setterName") void setValue(String value) {} }
    private static class AnnotatedMemberWithJsonPropertyForDeserialization { @JsonProperty("propertyNameForDeserialization") String someField; }
    @JsonDeserialize
    private static class AnnotatedMemberWithJsonDeserialize { Object fieldWithDeserialize; }
    private static class AnnotatedMemberWithoutNameForDeserialization { Object normalField; }

    private static class AnnotatedMethodWithAnySetter { @JsonAnySetter void setAny(String key, Object value) {} }
    private static class AnnotatedMethodWithoutAnySetter { void someMethod() {} }

    private static class AnnotatedMethodWithAnyGetter { @JsonAnyGetter Map<String, Object> getAny() { return Collections.emptyMap(); } }
    private static class AnnotatedMethodWithoutAnyGetter { void someMethod() {} }

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    private static class AnnotatedClassWithCreator {}
    private static class AnnotatedClassWithoutCreator {}

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    private static class AnnotatedClassWithCreatorProperties {}
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private static class AnnotatedClassWithCreatorDelegating {}
    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    private static class AnnotatedClassWithCreatorDefault {}
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private static class AnnotatedClassWithCreatorDisabled {}
    private static class AnnotatedClassWithoutCreatorBinding {}

    // Dummy annotations for testing
    @JacksonAnnotationsInside
    public @interface JacksonAnnotationsInside {}

    @JsonPropertyDescription("Test description")
    public @interface JsonPropertyDescription {
        String value();
    }

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    public @interface JsonFormat {}

    @JsonManagedReference("parent")
    public @interface JsonManagedReference {
        String value();
    }

    @JsonBackReference("child")
    public @interface JsonBackReference {
        String value();
    }

    @JsonUnwrapped(enabled = true)
    public @interface JsonUnwrapped {
        boolean enabled() default true;
        String prefix() default "";
        String suffix() default "";
    }

    @JacksonInject("customId")
    public @interface JacksonInject {
        String value();
    }

    @JsonView(MyView1.class)
    public @interface JsonView {
        Class<?>[] value();
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    public @interface JsonTypeInfo {
        Id use();
        As include();
        String property();
        Class<?> defaultImpl() default None.class;
        boolean visible() default false;
        @interface None {}
        enum Id { NONE, CLASS, CUSTOM, MINIMAL_CLASS, NAME }
        enum As { PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY, EXISTING_PROPERTY }
    }

    @JsonTypeResolver(value = MyTypeResolverBuilder.class)
    public @interface JsonTypeResolver {
        Class<? extends TypeResolverBuilder<?>> value();
    }

    public static class MyTypeResolverBuilder extends StdTypeResolverBuilder {}

    @JsonSubTypes({@JsonSubTypes.Type(value = SubtypeA.class, name = "a")})
    public @interface JsonSubTypes {
        Type[] value();
        @interface Type {
            Class<?> value();
            String name() default "";
        }
    }

    @JsonTypeName("CustomTypeName")
    public @interface JsonTypeName {
        String value();
    }

    @JsonTypeId
    public @interface JsonTypeId {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public @interface JsonIdentityInfo {
        Class<? extends ObjectIdGenerator<?>> generator();
        String property() default "";
        Class<? extends ObjectIdResolver> resolver() default ObjectIdResolver.class;
        Class<?> scope() default Object.class;
    }

    @JsonIdentityReference(alwaysAsId = true)
    public @interface JsonIdentityReference {
        boolean alwaysAsId() default true;
    }

    @JsonSerialize(using = MySerializer.class)
    public @interface JsonSerialize {
        Class<? extends JsonSerializer<?>> using() default JsonSerializer.None.class;
        Class<? extends JsonSerializer<?>> keyUsing() default JsonSerializer.None.class;
        Class<? extends JsonSerializer<?>> contentUsing() default JsonSerializer.None.class;
        Class<? extends JsonSerializer<?>> nullsUsing() default JsonSerializer.None.class;
        Class<?> as() default Void.class;
        Class<?> keyAs() default Void.class;
        Class<?> contentAs() default Void.class;
        Typing typing() default Typing.DEFAULT_TYPING;
        Class<? extends Converter<?, ?>> converter() default Converter.None.class;
        Class<? extends Converter<?, ?>> contentConverter() default Converter.None.class;
        Inclusion include() default Inclusion.DEFAULT_INCLUSION;
        enum Inclusion { ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY, DEFAULT_INCLUSION }
        enum Typing { DEFAULT_TYPING, STATIC, DYNAMIC }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public @interface JsonInclude {
        Include value() default Include.ALWAYS;
        Include content() default Include.ALWAYS;
        enum Include { ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY, USE_DEFAULTS }
    }

    @JsonRawValue(true)
    public @interface JsonRawValue {
        boolean value() default true;
    }

    @JsonPropertyOrder({"prop1", "prop2"})
    public @interface JsonPropertyOrder {
        String[] value() default {};
        boolean alphabetic() default false;
    }

    @JsonAppend(attrs = {@JsonAppend.Attr(value="attr1")}, props = {@JsonAppend.Prop(value=MyVirtualBeanPropertyWriter.class, type=String.class)})
    public @interface JsonAppend {
        Attr[] attrs() default {};
        Prop[] props() default {};
        boolean prepend() default false;
        @interface Attr {
            String value();
            String propName() default "";
            String propNamespace() default "";
            boolean required() default false;
            JsonInclude.Include include() default JsonInclude.Include.ALWAYS;
        }
        @interface Prop {
            Class<? extends VirtualBeanPropertyWriter> value();
            Class<?> type() default Object.class;
            String name() default "";
            String namespace() default "";
            boolean required() default false;
            JsonInclude.Include include() default JsonInclude.Include.ALWAYS;
        }
    }

    @JsonGetter("getterName")
    public @interface JsonGetter {
        String value();
    }

    @JsonView(MyView1.class)
    public @interface JsonView {}

    @JsonRawValue(true)
    public @interface JsonRawValue {}

    @JsonValue
    public @interface JsonValue {
        boolean value() default true;
    }

    @JsonDeserialize(using = MyDeserializer.class)
    public @interface JsonDeserialize {
        Class<? extends JsonDeserializer<?>> using() default JsonDeserializer.None.class;
        Class<? extends KeyDeserializer> keyUsing() default KeyDeserializer.None.class;
        Class<? extends JsonDeserializer<?>> contentUsing() default JsonDeserializer.None.class;
        Class<?> as() default Void.class;
        Class<?> keyAs() default Void.class;
        Class<?> contentAs() default Void.class;
        Class<? extends Converter<?, ?>> converter() default Converter.None.class;
        Class<? extends Converter<?, ?>> contentConverter() default Converter.None.class;
        Class<?> builder() default Void.class;
    }

    @JsonSetter("setterName")
    public @interface JsonSetter {
        String value();
    }

    @JsonAnySetter
    public @interface JsonAnySetter {}

    @JsonAnyGetter
    public @interface JsonAnyGetter {}

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public @interface JsonCreator {
        Mode mode() default Mode.DISABLED;
        enum Mode { DISABLED, PROPERTIES, DELEGATING, DEFAULT }
    }

    @JsonValueInstantiator(MyValueInstantiator.class)
    public @interface JsonValueInstantiator {
        Class<?> value();
    }

    @JsonPOJOBuilder(withPrefix = "withPrefix", withoutSuffix = "withoutSuffix")
    public @interface JsonPOJOBuilder {
        String withPrefix() default "";
        String withoutSuffix() default "";
        Value build() default @Value;
        @interface Value {
            String withPrefix() default "";
            String withoutSuffix() default "";
        }
    }
}
```

SOURCE CODE ANALYSIS - The tests cover methods for finding various Jackson annotations related to property naming, serialization inclusion, type handling, object identity, serializers, deserializers, POJO builders, and virtual properties. Most methods with conditional logic or annotation-driven behavior are tested.
TEST CASE DESIGN -
- testIsAnnotationBundle: Checks if an annotation is recognized as a bundle.
- testFindEnumValue_WithAnnotation: Tests finding an enum value name with a @JsonProperty annotation.
- testFindEnumValue_WithoutAnnotation: Tests finding an enum value name without a @JsonProperty annotation.
- testFindRootName_WithAnnotation: Tests finding a root name with @JsonRootName.
- testFindRootName_WithoutAnnotation: Tests finding a root name without @JsonRootName.
- testFindPropertiesToIgnore_WithAnnotation: Tests finding properties to ignore with @JsonIgnoreProperties.
- testFindPropertiesToIgnore_WithoutAnnotation: Tests finding properties to ignore without @JsonIgnoreProperties.
- testFindIgnoreUnknownProperties_True: Tests when @JsonIgnoreProperties(ignoreUnknown = true).
- testFindIgnoreUnknownProperties_False: Tests when @JsonIgnoreProperties(ignoreUnknown = false).
- testFindIgnoreUnknownProperties_Default: Tests without @JsonIgnoreProperties.
- testIsIgnorableType_True: Tests @JsonIgnoreType.
- testIsIgnorableType_False: Tests presence of a class not annotated with @JsonIgnoreType.
- testIsIgnorableType_Default: Tests without @JsonIgnoreType.
- testFindFilterId_WithId: Tests finding filter ID with @JsonFilter.
- testFindFilterId_EmptyId: Tests with an empty @JsonFilter value.
- testFindFilterId_WithoutAnnotation: Tests without @JsonFilter.
- testFindNamingStrategy_WithValue: Tests finding naming strategy with @JsonNaming.
- testFindNamingStrategy_WithoutAnnotation: Tests without @JsonNaming.
- testFindAutoDetectVisibility_WithAnnotation: Tests @JsonAutoDetect.
- testFindAutoDetectVisibility_WithoutAnnotation: Tests without @JsonAutoDetect.
- testFindImplicitPropertyName_ReturnsNull: Tests that findImplicitPropertyName returns null.
- testHasIgnoreMarker_True: Tests @JsonIgnore.
- testHasIgnoreMarker_False: Tests absence of @JsonIgnore.
- testHasRequiredMarker_True: Tests @JsonProperty(required = true).
- testHasRequiredMarker_False: Tests @JsonProperty(required = false).
- testHasRequiredMarker_Default: Tests without @JsonProperty(required).
- testFindPropertyAccess_ReadWrite: Tests @JsonProperty(access = READ_WRITE).
- testFindPropertyAccess_ReadOnly: Tests @JsonProperty(access = READ_ONLY).
- testFindPropertyAccess_WriteOnly: Tests @JsonProperty(access = WRITE_ONLY).
- testFindPropertyAccess_Default: Tests without @JsonProperty(access).
- testFindPropertyDescription: Tests @JsonPropertyDescription.
- testFindPropertyDescription_WithoutAnnotation: Tests without @JsonPropertyDescription.
- testFindPropertyIndex_WithValue: Tests @JsonProperty(index).
- testFindPropertyIndex_Unknown: Tests @JsonProperty(index = UNKNOWN).
- testFindPropertyIndex_WithoutAnnotation: Tests without @JsonProperty(index).
- testFindPropertyDefaultValue_WithValue: Tests @JsonProperty(defaultValue).
- testFindPropertyDefaultValue_Empty: Tests @JsonProperty(defaultValue = "").
- testFindPropertyDefaultValue_WithoutAnnotation: Tests without @JsonProperty(defaultValue).
- testFindFormat_WithValue: Tests @JsonFormat.
- testFindFormat_WithoutAnnotation: Tests without @JsonFormat.
- testFindReferenceType_Managed: Tests @JsonManagedReference.
- testFindReferenceType_Back: Tests @JsonBackReference.
- testFindReferenceType_None: Tests absence of reference annotations.
- testFindUnwrappingNameTransformer_Enabled: Tests @JsonUnwrapped(enabled = true).
- testFindUnwrappingNameTransformer_Disabled: Tests @JsonUnwrapped(enabled = false).
- testFindUnwrappingNameTransformer_WithoutAnnotation: Tests without @JsonUnwrapped.
- testFindInjectableValueId_WithValue: Tests @JacksonInject with a value.
- testFindInjectableValueId_EmptyValue: Tests @JacksonInject with an empty value.
- testFindInjectableValueId_WithoutAnnotation: Tests without @JacksonInject.
- testFindViews_WithAnnotation: Tests @JsonView.
- testFindViews_WithoutAnnotation: Tests without @JsonView.
- testFindTypeResolver_WithAnnotation: Tests @JsonTypeInfo and @JsonTypeResolver.
- testFindTypeResolver_WithoutAnnotation: Tests without type info annotations.
- testFindSubtypes_WithAnnotation: Tests @JsonSubTypes.
- testFindSubtypes_WithoutAnnotation: Tests without @JsonSubTypes.
- testFindTypeName_WithValue: Tests @JsonTypeName.
- testFindTypeName_WithoutAnnotation: Tests without @JsonTypeName.
- testIsTypeId_True: Tests @JsonTypeId.
- testIsTypeId_False: Tests absence of @JsonTypeId.
- testFindObjectIdInfo_WithGenerator: Tests @JsonIdentityInfo with a generator.
- testFindObjectIdInfo_NoneGenerator: Tests @JsonIdentityInfo with None generator.
- testFindObjectIdInfo_WithoutAnnotation: Tests without @JsonIdentityInfo.
- testFindObjectReferenceInfo_AlwaysAsIdTrue: Tests @JsonIdentityReference(alwaysAsId = true).
- testFindObjectReferenceInfo_AlwaysAsIdFalse: Tests @JsonIdentityReference(alwaysAsId = false).
- testFindObjectReferenceInfo_WithoutAnnotation: Tests without @JsonIdentityReference.
- testFindSerializer_WithUsing: Tests @JsonSerialize(using = ...).
- testFindSerializer_WithRawValue: Tests @JsonRawValue.
- testFindSerializer_None: Tests without serializer annotations.
- testFindKeySerializer_WithUsing: Tests @JsonSerialize(keyUsing = ...).
- testFindKeySerializer_None: Tests without key serializer annotation.
- testFindContentSerializer_WithUsing: Tests @JsonSerialize(contentUsing = ...).
- testFindContentSerializer_None: Tests without content serializer annotation.
- testFindNullSerializer_WithUsing: Tests @JsonSerialize(nullsUsing = ...).
- testFindNullSerializer_None: Tests without null serializer annotation.
- testFindSerializationInclusion_NonNull: Tests @JsonInclude(NON_NULL).
- testFindSerializationInclusion_NonDefault: Tests @JsonInclude(NON_DEFAULT).
- testFindSerializationInclusion_NonEmpty: Tests @JsonInclude(NON_EMPTY).
- testFindSerializationInclusion_DefaultValue: Tests @JsonInclude(DEFAULT_INCLUSION).
- testFindSerializationInclusion_FromJsonSerialize: Tests @JsonSerialize(include = ...).
- testFindSerializationInclusion_FallbackToDefault: Tests default inclusion.
- testFindSerializationInclusionForContent_WithValue: Tests @JsonInclude(content = ...).
- testFindSerializationInclusionForContent_Default: Tests default content inclusion.
- testFindSerializationType_WithValue: Tests @JsonSerialize(as = ...).
- testFindSerializationType_AsExplicit: Tests @JsonSerialize(as = ...).
- testFindSerializationType_WithoutAnnotation: Tests without serialization type annotation.
- testFindSerializationKeyType_WithValue: Tests @JsonSerialize(keyAs = ...).
- testFindSerializationKeyType_WithoutAnnotation: Tests without serialization key type annotation.
- testFindSerializationContentType_WithValue: Tests @JsonSerialize(contentAs = ...).
- testFindSerializationContentType_WithoutAnnotation: Tests without serialization content type annotation.
- testFindSerializationTyping_Static: Tests @JsonSerialize(typing = STATIC).
- testFindSerializationTyping_Dynamic: Tests @JsonSerialize(typing = DYNAMIC).
- testFindSerializationTyping_WithoutAnnotation: Tests without typing annotation.
- testFindSerializationConverter_WithValue: Tests @JsonSerialize(converter = ...).
- testFindSerializationConverter_WithoutAnnotation: Tests without converter annotation.
- testFindSerializationContentConverter_WithValue: Tests @JsonSerialize(contentConverter = ...).
- testFindSerializationContentConverter_WithoutAnnotation: Tests without content converter annotation.
- testFindSerializationPropertyOrder_WithValue: Tests @JsonPropertyOrder.
- testFindSerializationPropertyOrder_WithoutAnnotation: Tests without @JsonPropertyOrder.
- testFindSerializationSortAlphabetically_True: Tests @JsonPropertyOrder(alphabetic = true).
- testFindSerializationSortAlphabetically_False: Tests @JsonPropertyOrder(alphabetic = false).
- testFindSerializationSortAlphabetically_Default: Tests without alphabetic flag.
- testFindAndAddVirtualProperties_WithAttrs: Tests @JsonAppend.Attr.
- testFindAndAddVirtualProperties_WithProps: Tests @JsonAppend.Prop.
- testFindAndAddVirtualProperties_Without: Tests without @JsonAppend.
- testFindNameForSerialization_WithJsonGetter: Tests @JsonGetter for serialization name.
- testFindNameForSerialization_WithJsonProperty: Tests @JsonProperty for serialization name.
- testFindNameForSerialization_WithJsonSerialize: Tests @JsonSerialize presence for serialization name.
- testFindNameForSerialization_WithoutAnnotation: Tests without serialization name annotations.
- testHasAsValueAnnotation_True: Tests @JsonValue.
- testHasAsValueAnnotation_False: Tests absence of @JsonValue.
- testFindDeserializer_WithUsing: Tests @JsonDeserialize(using = ...).
- testFindDeserializer_None: Tests without deserializer annotation.
- testFindKeyDeserializer_WithUsing: Tests @JsonDeserialize(keyUsing = ...).
- testFindKeyDeserializer_None: Tests without key deserializer annotation.
- testFindContentDeserializer_WithUsing: Tests @JsonDeserialize(contentUsing = ...).
- testFindContentDeserializer_None: Tests without content deserializer annotation.
- testFindDeserializationType_WithValue: Tests @JsonDeserialize(as = ...).
- testFindDeserializationType_AsExplicit: Tests @JsonDeserialize(as = ...).
- testFindDeserializationType_WithoutAnnotation: Tests without deserialization type annotation.
- testFindDeserializationKeyType_WithValue: Tests @JsonDeserialize(keyAs = ...).
- testFindDeserializationKeyType_WithoutAnnotation: Tests without deserialization key type annotation.
- testFindDeserializationContentType_WithValue: Tests @JsonDeserialize(contentAs = ...).
- testFindDeserializationContentType_WithoutAnnotation: Tests without deserialization content type annotation.
- testFindDeserializationConverter_WithValue: Tests @JsonDeserialize(converter = ...).
- testFindDeserializationConverter_WithoutAnnotation: Tests without deserialization converter annotation.
- testFindDeserializationContentConverter_WithValue: Tests @JsonDeserialize(contentConverter = ...).
- testFindDeserializationContentConverter_WithoutAnnotation: Tests without deserialization content converter annotation.
- testFindValueInstantiator_WithValue: Tests @JsonValueInstantiator.
- testFindValueInstantiator_WithoutAnnotation: Tests without @JsonValueInstantiator.
- testFindPOJOBuilder_WithValue: Tests @JsonDeserialize(builder = ...).
- testFindPOJOBuilder_WithoutAnnotation: Tests without @JsonDeserialize(builder).
- testFindPOJOBuilderConfig_WithValue: Tests @JsonPOJOBuilder config.
- testFindPOJOBuilderConfig_WithoutAnnotation: Tests without @JsonPOJOBuilder.
- testFindNameForDeserialization_WithJsonSetter: Tests @JsonSetter for deserialization name.
- testFindNameForDeserialization_WithJsonProperty: Tests @JsonProperty for deserialization name.
- testFindNameForDeserialization_WithJsonDeserialize: Tests @JsonDeserialize presence for deserialization name.
- testFindNameForDeserialization_WithoutAnnotation: Tests without deserialization name annotations.
- testHasAnySetterAnnotation_True: Tests @JsonAnySetter.
- testHasAnySetterAnnotation_False: Tests absence of @JsonAnySetter.
- testHasAnyGetterAnnotation_True: Tests @JsonAnyGetter.
- testHasAnyGetterAnnotation_False: Tests absence of @JsonAnyGetter.
- testHasCreatorAnnotation_True: Tests @JsonCreator.
- testHasCreatorAnnotation_False: Tests absence of @JsonCreator.
- testFindCreatorBinding_Properties: Tests @JsonCreator(mode = PROPERTIES).
- testFindCreatorBinding_Delegating: Tests @JsonCreator(mode = DELEGATING).
- testFindCreatorBinding_Default: Tests @JsonCreator(mode = DEFAULT).
- testFindCreatorBinding_Disabled: Tests @JsonCreator(mode = DISABLED).
- testFindCreatorBinding_WithoutAnnotation: Tests without @JsonCreator.
DEFECT DETECTION STRATEGY - Tests cover various annotation-driven behaviors of the `JacksonAnnotationIntrospector`, focusing on specific annotation parameters and their presence/absence to trigger different code paths.
SUMMARY - 91 tests.
LIMITATIONS - Mocking complex Jackson internal types like `MapperConfig` or `JavaType` is challenging without using forbidden libraries. Tests rely on simplified mock setups for `AnnotatedClass` and `AnnotatedMember`. Enum definitions were moved to top-level static classes to resolve compilation errors.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```