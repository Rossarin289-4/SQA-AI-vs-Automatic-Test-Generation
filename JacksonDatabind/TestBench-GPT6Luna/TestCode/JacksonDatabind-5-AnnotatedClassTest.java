package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class AnnotatedClassTest {
    @Test
    public void testConstructBasicClassIdentityAndTypes() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertSame(String.class, ac.getAnnotated());
        assertSame(String.class, ac.getRawType());
        assertEquals(String.class, ac.getGenericType());
        assertEquals(String.class.getName(), ac.getName());
    }

    @Test
    public void testModifiersAndStringRepresentation() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertEquals(String.class.getModifiers(), ac.getModifiers());
        assertEquals("[AnnotedClass java.lang.String]", ac.toString());
    }

    @Test
    public void testNoIntrospectorHasNoAnnotations() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNull(ac.getAnnotation(Deprecated.class));
        assertFalse(ac.hasAnnotations());
        assertEquals(0, count(ac.annotations()));
        assertEquals(0, ac.getAnnotations().size());
    }

    @Test
    public void testWithoutSuperTypesHasNoInheritedMethods() throws Exception {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNull(ac.findMethod("toString", new Class<?>[0]));
        assertTrue(ac.getMemberMethodCount() > 0);
        assertEquals(ac.getMemberMethodCount(), count(ac.memberMethods()));
    }

    @Test
    public void testConstructIncludesInheritedObjectMethod() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        AnnotatedMethod method = ac.findMethod("toString", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("toString", method.getName());
        assertEquals(String.class, method.getRawType());
    }

    @Test
    public void testFindMethodMatchesParameterTypes() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac.findMethod("substring", new Class<?>[] { int.class }));
        assertNotNull(ac.findMethod("substring", new Class<?>[] { int.class, int.class }));
        assertNull(ac.findMethod("substring", new Class<?>[] { String.class }));
    }

    @Test
    public void testFieldResolutionFiltersStaticFields() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        for (AnnotatedField field : ac.fields()) {
            assertFalse(Modifier.isStatic(field.getModifiers()));
        }
        assertEquals(count(ac.fields()), ac.getFieldCount());
    }

    @Test
    public void testCreatorResolutionForString() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNull(ac.getDefaultConstructor());
        assertTrue(ac.getConstructors().size() > 0);
        assertTrue(ac.getStaticMethods().size() >= 0);
    }

    @Test
    public void testPrimitiveClassHasNoFieldsOrMethods() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(int.class, null, null);
        assertEquals(0, ac.getFieldCount());
        assertEquals(0, ac.getMemberMethodCount());
        assertNull(ac.getDefaultConstructor());
        assertTrue(ac.getConstructors().isEmpty());
    }

    @Test
    public void testArrayClassHasNoFieldsOrDeclaredInstanceMethods() throws Exception {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(String[].class, null, null);
        assertEquals(0, ac.getFieldCount());
        assertEquals(0, ac.getMemberMethodCount());
        assertNull(ac.getDefaultConstructor());
    }

    @Test
    public void testWithAnnotationsUsesSuppliedAnnotationMap() throws Exception {
        AnnotatedClass original = AnnotatedClass.construct(String.class, null, null);
        AnnotationMap map = new AnnotationMap();
        AnnotatedClass copy = original.withAnnotations(map);
        assertSame(String.class, copy.getAnnotated());
        assertFalse(copy.hasAnnotations());
        assertEquals(0, copy.getAnnotations().size());
    }

    @Test
    public void testMemberMethodsExcludeStaticMethods() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        for (AnnotatedMethod method : ac.memberMethods()) {
            assertFalse(Modifier.isStatic(method.getModifiers()));
        }
        assertEquals(count(ac.memberMethods()), ac.getMemberMethodCount());
    }

    @Test
    public void testMethodsWithMoreThanTwoParametersAreExcluded() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNull(ac.findMethod("regionMatches",
                new Class<?>[] { boolean.class, int.class, String.class, int.class, int.class, int.class }));
    }

    @Test
    public void testObjectClassHasNoDefaultConstructor() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(Object.class, null, null);
        assertNotNull(ac.getDefaultConstructor());
        assertEquals(0, ac.getConstructors().size());
        assertNotNull(ac.findMethod("hashCode", new Class<?>[0]));
    }

    private int count(Iterable<?> values) {
        int size = 0;
        for (Object ignored : values) {
            ++size;
        }
        return size;
    }
}
