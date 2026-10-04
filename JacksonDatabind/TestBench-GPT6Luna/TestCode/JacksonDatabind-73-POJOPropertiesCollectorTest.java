package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Modifier;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class POJOPropertiesCollectorTest {
    @Test
    public void testPropertyBuilderNameAndInternalName() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("inside"));
        assertEquals("inside", p.getName());
        assertEquals("inside", p.getInternalName());
        assertTrue(p.hasName(PropertyName.construct("inside")));
    }

    @Test
    public void testRenamedBuilderRetainsInternalName() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("inside"));
        POJOPropertyBuilder renamed = p.withSimpleName("outside");
        assertEquals("outside", renamed.getName());
        assertEquals("inside", renamed.getInternalName());
        assertEquals("inside", p.getName());
    }

    @Test
    public void testWithNameUsesNewFullName() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("old"));
        PropertyName name = PropertyName.construct("new");
        POJOPropertyBuilder renamed = p.withName(name);
        assertEquals("new", renamed.getName());
        assertTrue(renamed.hasName(name));
    }

    @Test
    public void testCompareNamesAlphabetically() throws Exception {
        POJOPropertyBuilder a = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("a"));
        POJOPropertyBuilder b = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("b"));
        assertTrue(a.compareTo(b) < 0);
        assertTrue(b.compareTo(a) > 0);
    }

    @Test
    public void testEmptyBuilderHasNoAccessors() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("x"));
        assertFalse(p.hasGetter());
        assertFalse(p.hasSetter());
        assertFalse(p.hasField());
        assertFalse(p.hasConstructorParameter());
        assertFalse(p.couldSerialize());
        assertFalse(p.couldDeserialize());
    }

    @Test
    public void testAddFieldChangesCapabilityAndVisibility() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, true, false);
        assertTrue(p.hasField());
        assertTrue(p.couldSerialize());
        assertTrue(p.couldDeserialize());
        assertTrue(p.anyVisible());
        assertFalse(p.anyIgnorals());
        assertSame(annotated, p.getField());
    }

    @Test
    public void testIgnoredFieldFlagsAndRemoval() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, true, true);
        assertTrue(p.anyIgnorals());
        p.removeIgnored();
        assertFalse(p.hasField());
        assertFalse(p.anyIgnorals());
    }

    @Test
    public void testInvisibleFieldCanBePruned() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, false, false);
        assertFalse(p.anyVisible());
        assertEquals(Access.AUTO, p.removeNonVisible(false));
        assertFalse(p.hasField());
    }

    @Test
    public void testVisibleFieldSurvivesVisibilityPruning() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, true, false);
        p.removeNonVisible(false);
        assertSame(annotated, p.getField());
        assertTrue(p.couldDeserialize());
    }

    @Test
    public void testExplicitFieldNameCollection() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        PropertyName external = PropertyName.construct("external");
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, external, true, true, false);
        assertTrue(p.isExplicitlyIncluded());
        assertTrue(p.isExplicitlyNamed());
        assertEquals(Collections.singleton(external), p.findExplicitNames());
    }

    @Test
    public void testImplicitFieldNameIsNotExplicit() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, true, false);
        assertFalse(p.isExplicitlyNamed());
        assertTrue(p.findExplicitNames().isEmpty());
    }

    @Test
    public void testRemoveConstructorsClearsConstructorCapability() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addCtor(null, PropertyName.construct("value"), false, true, false);
        assertTrue(p.hasConstructorParameter());
        assertTrue(p.couldDeserialize());
        p.removeConstructors();
        assertFalse(p.hasConstructorParameter());
        assertFalse(p.couldDeserialize());
        assertFalse(p.getConstructorParameters().hasNext());
    }

    @Test
    public void testAddAllMergesFieldAccessors() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder first = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        POJOPropertyBuilder second = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        first.addField(annotated, null, false, true, false);
        second.addAll(first);
        assertTrue(second.hasField());
        assertTrue(second.anyVisible());
        assertSame(annotated, second.getField());
    }

    @Test
    public void testTrimByVisibilityPrefersVisibleUnannotatedField() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, false, false);
        p.addField(annotated, null, false, true, false);
        p.trimByVisibility();
        assertSame(annotated, p.getField());
        assertTrue(p.anyVisible());
    }

    @Test
    public void testMergeAnnotationsWithNoAccessorsIsSafe() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.mergeAnnotations(true);
        assertFalse(p.hasGetter());
        assertFalse(p.hasField());
        assertFalse(p.couldSerialize());
    }

    @Test
    public void testPrimaryAndNonConstructorMutatorFromField() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, null, false, true, false);
        assertSame(annotated, p.getAccessor());
        assertSame(annotated, p.getMutator());
        assertSame(annotated, p.getNonConstructorMutator());
        assertSame(annotated, p.getPrimaryMember());
    }

    @Test
    public void testNoAnnotationMetadataDefaults() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        assertNull(p.findViews());
        assertNull(p.findReferenceType());
        assertFalse(p.isTypeId());
        assertNull(p.findAccess());
    }

    @Test
    public void testIncludedAndNamedAreDistinctForEmptyName() throws Exception {
        java.lang.reflect.Field field = Sample.class.getDeclaredField("value");
        AnnotatedField annotated = new AnnotatedField(null, field, new AnnotationMap());
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addField(annotated, PropertyName.construct(""), false, true, false);
        assertFalse(p.isExplicitlyIncluded());
        assertFalse(p.isExplicitlyNamed());
        assertTrue(p.findExplicitNames().isEmpty());
    }

    @Test
    public void testFullNameAndWrapperNameWithoutMember() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        assertEquals(PropertyName.construct("value"), p.getFullName());
        assertNull(p.getWrapperName());
    }

    @Test
    public void testGetterAccessorsAndMetadataWithoutIntrospector() throws Exception {
        java.lang.reflect.Method method = Sample.class.getDeclaredMethod("getValue");
        AnnotatedMethod annotated = new AnnotatedMethod(null, method, new AnnotationMap(), null);
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addGetter(annotated, null, false, true, false);
        assertSame(annotated, p.getGetter());
        assertSame(annotated, p.getAccessor());
        assertSame(annotated, p.getPrimaryMember());
        assertNull(p.getSetter());
        assertNull(p.getMetadata().getDescription());
    }

    @Test
    public void testSetterAndGetterAreReturnedAsAppropriateMutators() throws Exception {
        java.lang.reflect.Method getter = Sample.class.getDeclaredMethod("getValue");
        java.lang.reflect.Method setter = Sample.class.getDeclaredMethod("setValue", int.class);
        AnnotatedMethod annotatedGetter = new AnnotatedMethod(null, getter, new AnnotationMap(), null);
        AnnotatedMethod annotatedSetter = new AnnotatedMethod(null, setter, new AnnotationMap(), null);
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addGetter(annotatedGetter, null, false, true, false);
        p.addSetter(annotatedSetter, null, false, true, false);
        assertSame(annotatedSetter, p.getSetter());
        assertSame(annotatedSetter, p.getMutator());
        assertSame(annotatedSetter, p.getNonConstructorMutator());
        assertSame(annotatedGetter, p.getAccessor());
    }

    @Test
    public void testConstructorParameterRetrievalAndIterator() throws Exception {
        java.lang.reflect.Constructor<?> ctor = Sample.class.getDeclaredConstructor(int.class);
        AnnotatedConstructor annotatedCtor = new AnnotatedConstructor(null, ctor, new AnnotationMap(), null);
        AnnotatedParameter param = new AnnotatedParameter(annotatedCtor, null, new AnnotationMap(), 0);
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, false,
                PropertyName.construct("value"));
        p.addCtor(param, PropertyName.construct("value"), false, true, false);
        assertSame(param, p.getConstructorParameter());
        assertSame(param, p.getConstructorParameters().next());
        assertSame(param, p.getMutator());
        assertSame(param, p.getPrimaryMember());
    }

    @Test
    public void testInclusionDefaultsToEmptyWithoutIntrospector() throws Exception {
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        assertEquals(JsonInclude.Value.empty(), p.findInclusion());
    }

    @Test
    public void testGetterAndSetterFixture() throws Exception {
        java.lang.reflect.Method getter = Sample.class.getDeclaredMethod("getValue");
        java.lang.reflect.Method setter = Sample.class.getDeclaredMethod("setValue", int.class);
        AnnotatedMethod annotatedGetter = new AnnotatedMethod(null, getter, new AnnotationMap(), null);
        AnnotatedMethod annotatedSetter = new AnnotatedMethod(null, setter, new AnnotationMap(), null);
        POJOPropertyBuilder p = new POJOPropertyBuilder(null, null, true,
                PropertyName.construct("value"));
        p.addGetter(annotatedGetter, PropertyName.construct("external"), true, true, false);
        p.addSetter(annotatedSetter, PropertyName.construct("external"), true, true, false);
        assertTrue(p.hasGetter());
        assertTrue(p.hasSetter());
        assertTrue(p.couldSerialize());
        assertTrue(p.couldDeserialize());
        assertEquals("value", p.getName());
    }

    public static class Sample {
        public int value;

        public Sample() { }

        public Sample(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
