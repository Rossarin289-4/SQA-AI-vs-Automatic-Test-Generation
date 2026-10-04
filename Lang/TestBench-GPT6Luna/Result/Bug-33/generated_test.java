package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ClassUtilsTest {
    @Test
    public void testGetShortClassNameHandlesArrayEncodings() throws Exception {
        assertEquals("String[][]", ClassUtils.getShortClassName("[[Ljava.lang.String;"));
        assertEquals("int[]", ClassUtils.getShortClassName("[I"));
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }

    @Test
    public void testGetShortClassNameHandlesNestedNames() throws Exception {
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
        assertEquals("Name", ClassUtils.getShortClassName("Name"));
    }

    @Test
    public void testGetShortClassNameObjectNullFallback() throws Exception {
        assertEquals("fallback", ClassUtils.getShortClassName((Object) null, "fallback"));
    }

    @Test
    public void testGetPackageNameHandlesArrayEncodings() throws Exception {
        assertEquals("java.lang", ClassUtils.getPackageName("[[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageName("[I"));
        assertEquals("", ClassUtils.getPackageName((String) null));
    }

    @Test
    public void testGetPackageNameObjectNullFallback() throws Exception {
        assertEquals("fallback", ClassUtils.getPackageName((Object) null, "fallback"));
    }

    @Test
    public void testGetAllSuperclassesReturnsOrderedHierarchy() throws Exception {
        List<Class<?>> expected = new ArrayList<Class<?>>();
        expected.add(Number.class);
        expected.add(Object.class);
        assertEquals(expected, ClassUtils.getAllSuperclasses(Integer.class));
        assertEquals(null, ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllInterfacesReturnsDirectAndInheritedInterfaces() throws Exception {
        List<Class<?>> expected = new ArrayList<Class<?>>();
        expected.add(Comparable.class);
        expected.add(java.io.Serializable.class);
        assertEquals(expected, ClassUtils.getAllInterfaces(Integer.class));
        assertEquals(null, ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testConvertClassNamesIncludesFoundMissingAndNullEntries() throws Exception {
        List<String> names = new ArrayList<String>();
        names.add("java.lang.String");
        names.add(null);
        names.add("missing.Type");
        List<Class<?>> converted = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(3, converted.size());
        assertEquals(String.class, converted.get(0));
        assertEquals(null, converted.get(1));
        assertEquals(null, converted.get(2));
    }

    @Test
    public void testConvertClassesToClassNamesIncludesNull() throws Exception {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        assertEquals(java.util.Arrays.asList("java.lang.String", null),
                ClassUtils.convertClassesToClassNames(classes));
        assertEquals(null, ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testArrayIsAssignableHandlesNullsLengthsAndPrimitiveWidening() throws Exception {
        assertTrue(ClassUtils.isAssignable(new Class<?>[] { int.class }, new Class<?>[] { long.class }));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { long.class }, new Class<?>[] { int.class }));
        assertTrue(ClassUtils.isAssignable(new Class<?>[] { null }, new Class<?>[] { String.class }));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { null }, new Class<?>[] { int.class }));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] {}, new Class<?>[] { String.class }));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
    }

    @Test
    public void testPrimitiveToWrapperHandlesPrimitiveAndNonPrimitive() throws Exception {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(void.class, ClassUtils.primitiveToWrapper(void.class));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertEquals(null, ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitivesToWrappersConvertsEachElement() throws Exception {
        assertEquals(null, ClassUtils.primitivesToWrappers(null));
        assertEquals(0, ClassUtils.primitivesToWrappers(new Class<?>[0]).length);
        Class<?>[] converted = ClassUtils.primitivesToWrappers(
                new Class<?>[] { int.class, void.class, String.class, null });
        assertEquals(Integer.class, converted[0]);
        assertEquals(void.class, converted[1]);
        assertEquals(String.class, converted[2]);
        assertEquals(null, converted[3]);
    }

    @Test
    public void testWrapperToPrimitiveHandlesWrapperAndOtherClasses() throws Exception {
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(null, ClassUtils.wrapperToPrimitive(String.class));
        assertEquals(null, ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitivesConvertsEachElement() throws Exception {
        assertEquals(null, ClassUtils.wrappersToPrimitives(null));
        assertEquals(0, ClassUtils.wrappersToPrimitives(new Class<?>[0]).length);
        Class<?>[] converted = ClassUtils.wrappersToPrimitives(
                new Class<?>[] { Integer.class, String.class, null });
        assertEquals(int.class, converted[0]);
        assertEquals(null, converted[1]);
        assertEquals(null, converted[2]);
    }

    @Test
    public void testIsInnerClassChecksNameSeparator() throws Exception {
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testGetClassLoadsCanonicalAndJvmArrayNames() throws Exception {
        ClassLoader loader = ClassUtils.class.getClassLoader();
        assertEquals(String[].class, ClassUtils.getClass(loader, "java.lang.String[]", false));
        assertEquals(String[].class, ClassUtils.getClass(loader, "[Ljava.lang.String;", false));
        assertEquals(int[].class, ClassUtils.getClass(loader, "int[]", false));
        assertEquals(int.class, ClassUtils.getClass(loader, "int", false));
    }

    @Test
    public void testGetPublicMethodFindsPublicMethodOnPublicClass() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "isEmpty", new Class<?>[0]);
        assertEquals("isEmpty", method.getName());
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test
    public void testGetPublicMethodFindsInheritedPublicMethod() throws Exception {
        Method method = ClassUtils.getPublicMethod(Integer.class, "toString", new Class<?>[0]);
        assertEquals("toString", method.getName());
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test
    public void testToClassPreservesLengthAndNullEntries() throws Exception {
        assertEquals(null, ClassUtils.toClass(null));
        assertEquals(0, ClassUtils.toClass(new Object[0]).length);
        Class<?>[] result = ClassUtils.toClass(new Object[] { "x", null, Integer.valueOf(1) });
        assertEquals(3, result.length);
        assertEquals(String.class, result[0]);
        assertEquals(null, result[1]);
        assertEquals(Integer.class, result[2]);
    }

    @Test
    public void testShortCanonicalNameConvertsArrayNames() throws Exception {
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[[Ljava.lang.String;", "fallback"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I", "fallback"));
        assertEquals("fallback", ClassUtils.getShortCanonicalName((Object) null, "fallback"));
    }

    @Test
    public void testPackageCanonicalNameConvertsArrayNames() throws Exception {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[[Ljava.lang.String;", "fallback"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I", "fallback"));
        assertEquals("fallback", ClassUtils.getPackageCanonicalName((Object) null, "fallback"));
    }
}
