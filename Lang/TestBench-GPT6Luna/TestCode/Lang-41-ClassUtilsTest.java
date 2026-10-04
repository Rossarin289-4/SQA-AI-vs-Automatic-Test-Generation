package org.apache.commons.lang;

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
    public void testGetShortClassNameNullObjectUsesFallback() throws Exception {
        assertEquals("missing", ClassUtils.getShortClassName((Object) null, "missing"));
    }

    @Test
    public void testGetPackageNameNullObjectUsesFallback() throws Exception {
        assertEquals("missing", ClassUtils.getPackageName((Object) null, "missing"));
    }

    @Test
    public void testGetAllSuperclassesOfString() throws Exception {
        List<Class<?>> actual = ClassUtils.getAllSuperclasses(String.class);
        assertEquals(1, actual.size());
        assertEquals(Object.class, actual.get(0));
    }

    @Test
    public void testGetAllSuperclassesNull() throws Exception {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllInterfacesOfArrayListIncludesInheritedInterfaces() throws Exception {
        List<Class<?>> actual = ClassUtils.getAllInterfaces(ArrayList.class);
        assertTrue(actual.contains(List.class));
        assertTrue(actual.contains(java.util.Collection.class));
    }

    @Test
    public void testGetAllInterfacesNull() throws Exception {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testConvertClassNamesToClassesIncludesInvalidAndNullNames() throws Exception {
        List<String> names = new ArrayList<String>();
        names.add("java.lang.String");
        names.add("missing.Type");
        names.add(null);
        List<Class<?>> actual = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(3, actual.size());
        assertEquals(String.class, actual.get(0));
        assertNull(actual.get(1));
        assertNull(actual.get(2));
    }

    @Test
    public void testConvertClassNamesToClassesNull() throws Exception {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassesToClassNamesCopiesNullEntries() throws Exception {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        assertEquals(java.util.Arrays.asList("java.lang.String", null),
                ClassUtils.convertClassesToClassNames(classes));
    }

    @Test
    public void testConvertClassesToClassNamesNull() throws Exception {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testIsAssignableArraySupportsPrimitiveWideningAndNullReference() throws Exception {
        assertTrue(ClassUtils.isAssignable(
                new Class<?>[] { int.class, null },
                new Class<?>[] { long.class, String.class }));
    }

    @Test
    public void testIsAssignableArrayRejectsMismatchedLengths() throws Exception {
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { int.class }, new Class<?>[0]));
    }

    @Test
    public void testPrimitiveToWrapperMapsVoidToVoid() throws Exception {
        assertEquals(void.class, ClassUtils.primitiveToWrapper(void.class));
    }

    @Test
    public void testPrimitiveToWrapperPreservesReferenceClassAndNull() throws Exception {
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitivesToWrappersConvertsAndPreservesNonPrimitive() throws Exception {
        Class<?>[] actual = ClassUtils.primitivesToWrappers(
                new Class<?>[] { int.class, void.class, String.class, null });
        assertEquals(Integer.class, actual[0]);
        assertEquals(void.class, actual[1]);
        assertEquals(String.class, actual[2]);
        assertNull(actual[3]);
    }

    @Test
    public void testPrimitivesToWrappersNullAndEmpty() throws Exception {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertEquals(0, ClassUtils.primitivesToWrappers(new Class<?>[0]).length);
    }

    @Test
    public void testWrapperToPrimitiveMapsWrapperAndRejectsOtherClasses() throws Exception {
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitivesConvertsAndPreservesUnknownAsNull() throws Exception {
        Class<?>[] actual = ClassUtils.wrappersToPrimitives(
                new Class<?>[] { Integer.class, String.class, null });
        assertEquals(int.class, actual[0]);
        assertNull(actual[1]);
        assertNull(actual[2]);
    }

    @Test
    public void testWrappersToPrimitivesNullAndEmpty() throws Exception {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertEquals(0, ClassUtils.wrappersToPrimitives(new Class<?>[0]).length);
    }

    @Test
    public void testIsInnerClassDistinguishesNestedAndTopLevelClasses() throws Exception {
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testGetClassLoadsPrimitiveAndCanonicalArrayNames() throws Exception {
        ClassLoader loader = ClassUtils.class.getClassLoader();
        assertEquals(int.class, ClassUtils.getClass(loader, "int", false));
        assertEquals(String[][].class, ClassUtils.getClass(loader, "java.lang.String[][]", false));
        assertEquals(int[].class, ClassUtils.getClass(loader, "[I", false));
    }

    @Test
    public void testGetClassRejectsUnknownName() throws Exception {
        try {
            ClassUtils.getClass(ClassUtils.class.getClassLoader(), "missing.Type", false);
            fail("expected ClassNotFoundException");
        } catch (ClassNotFoundException expected) {
        }
    }

    @Test
    public void testGetPublicMethodOnPublicClass() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "isEmpty", new Class<?>[0]);
        assertEquals("isEmpty", method.getName());
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test
    public void testGetPublicMethodThrowsWhenMethodIsMissing() throws Exception {
        try {
            ClassUtils.getPublicMethod(String.class, "missing", new Class<?>[0]);
            fail("expected NoSuchMethodException");
        } catch (NoSuchMethodException expected) {
        }
    }

    @Test
    public void testToClassNullEmptyAndPopulatedArrays() throws Exception {
        assertNull(ClassUtils.toClass(null));
        assertEquals(0, ClassUtils.toClass(new Object[0]).length);
        Class<?>[] actual = ClassUtils.toClass(new Object[] { "x", Integer.valueOf(1) });
        assertEquals(String.class, actual[0]);
        assertEquals(Integer.class, actual[1]);
    }

    @Test
    public void testShortCanonicalNameUsesFallbackForNullObject() throws Exception {
        assertEquals("missing", ClassUtils.getShortCanonicalName((Object) null, "missing"));
    }

    @Test
    public void testPackageCanonicalNameUsesFallbackForNullObject() throws Exception {
        assertEquals("missing", ClassUtils.getPackageCanonicalName((Object) null, "missing"));
    }
}
