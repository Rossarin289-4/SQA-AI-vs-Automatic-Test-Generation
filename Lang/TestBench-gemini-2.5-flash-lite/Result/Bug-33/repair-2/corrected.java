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
import java.util.Set; // Added import for Set
import java.util.Collection; // Added import for Collection

public class ClassUtilsTest {

    @Test
    public void testGetShortClassNameObjectString() {
        assertEquals("String", ClassUtils.getShortClassName(String.class, "null"));
        assertEquals("null", ClassUtils.getShortClassName(null, "null"));
        assertEquals("Object", ClassUtils.getShortClassName(new Object(), "null"));
    }

    @Test
    public void testGetShortClassNameClass() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null)); // Explicitly cast null to Class<?>
        assertEquals("Integer", ClassUtils.getShortClassName(Integer.class));
        assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
        assertEquals("Object", ClassUtils.getShortClassName(Object.class));
    }

    @Test
    public void testGetShortClassNameString() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("", ClassUtils.getShortClassName((String) null)); // Explicitly cast null to String
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("String", ClassUtils.getShortClassName("String"));
        assertEquals("List", ClassUtils.getShortClassName("java.util.List"));
        assertEquals("ArrayList", ClassUtils.getShortClassName("java.util.ArrayList"));
        assertEquals("ArrayList", ClassUtils.getShortClassName("java.util.ArrayList$Sub"));
        assertEquals("I", ClassUtils.getShortClassName("int"));
        assertEquals("I[]", ClassUtils.getShortClassName("[I"));
        assertEquals("Z[]", ClassUtils.getShortClassName("[Z"));
        assertEquals("B[]", ClassUtils.getShortClassName("[B"));
        assertEquals("S[]", ClassUtils.getShortClassName("[S"));
        assertEquals("C[]", ClassUtils.getShortClassName("[C"));
        assertEquals("F[]", ClassUtils.getShortClassName("[F"));
        assertEquals("J[]", ClassUtils.getShortClassName("[J"));
        assertEquals("D[]", ClassUtils.getShortClassName("[D"));
        assertEquals("Object[]", ClassUtils.getShortClassName("[Ljava.lang.Object;"));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortClassName("[[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortClassName("[[Ljava.lang.String;;")); // Malformed, but should process
    }

    @Test
    public void testGetPackageNameObjectString() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class, "null"));
        assertEquals("null", ClassUtils.getPackageName(null, "null"));
        assertEquals("java.util", ClassUtils.getPackageName(new ArrayList<>(), "null"));
    }

    @Test
    public void testGetPackageNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null)); // Explicitly cast null to Class<?>
        assertEquals("java.util", ClassUtils.getPackageName(ArrayList.class));
        assertEquals("", ClassUtils.getPackageName(Object.class)); // package-info.java case
    }

    @Test
    public void testGetPackageNameString() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("", ClassUtils.getPackageName((String) null)); // Explicitly cast null to String
        assertEquals("", ClassUtils.getPackageName(""));
        assertEquals("", ClassUtils.getPackageName("String"));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.List"));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.ArrayList"));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.ArrayList$Sub"));
        assertEquals("", ClassUtils.getPackageName("int"));
        assertEquals("", ClassUtils.getPackageName("[I"));
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageName("[[Ljava.lang.String;"));
    }

    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        assertTrue(ClassUtils.getAllSuperclasses(Object.class).isEmpty());
        assertEquals(1, ClassUtils.getAllSuperclasses(String.class).size());
        assertEquals(Object.class, ClassUtils.getAllSuperclasses(String.class).get(0));
        assertEquals(2, ClassUtils.getAllSuperclasses(ArrayList.class).size());
        assertEquals(Object.class, ClassUtils.getAllSuperclasses(ArrayList.class).get(1));
    }

    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));
        assertTrue(ClassUtils.getAllInterfaces(Object.class).isEmpty());
        assertEquals(1, ClassUtils.getAllInterfaces(ArrayList.class).size());
        assertEquals(List.class, ClassUtils.getAllInterfaces(ArrayList.class).get(0));
        assertEquals(2, ClassUtils.getAllInterfaces(HashSet.class).size());
        assertEquals(Set.class, ClassUtils.getAllInterfaces(HashSet.class).get(0));
        assertEquals(Collection.class, ClassUtils.getAllInterfaces(HashSet.class).get(1));
    }

    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        assertTrue(ClassUtils.convertClassNamesToClasses(new ArrayList<String>()).isEmpty());
        List<String> names = new ArrayList<>();
        names.add("java.lang.String");
        names.add("java.lang.Integer");
        names.add("nonexistent.Class");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(3, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(Integer.class, classes.get(1));
        assertNull(classes.get(2));
    }

    @Test
    public void testConvertClassesToClassNames() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
        assertTrue(ClassUtils.convertClassesToClassNames(new ArrayList<Class<?>>()).isEmpty());
        List<Class<?>> classes = new ArrayList<>();
        classes.add(String.class);
        classes.add(Integer.class);
        classes.add(null);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertEquals("java.lang.Integer", names.get(1));
        assertNull(names.get(2));
    }

    @Test
    public void testIsAssignableArrayArray() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class}));
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{Object.class}));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{Object.class}, new Class<?>[]{String.class}));
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{long.class}));
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{Integer.class}, new Class<?>[]{int.class})); // Autoboxing
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{Integer.class})); // Autoboxing
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{null}, new Class<?>[]{String.class}));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{null}, new Class<?>[]{int.class}));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, null));
        // The ambiguity for `isAssignable(null, null)` is resolved by explicitly calling the array version.
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], new Class<?>[0]));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, new Class<?>[0]));
        assertFalse(ClassUtils.isAssignable(new Class<?>[1], null));
    }

    @Test
    public void testIsAssignableArrayArrayBoolean() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class}, false));
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{Object.class}, false));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{Object.class}, new Class<?>[]{String.class}, false));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{long.class}, false)); // No autoboxing
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{long.class}, true)); // Autoboxing enabled
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{Integer.class}, new Class<?>[]{int.class}, true)); // Autoboxing
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{int.class}, new Class<?>[]{Integer.class}, true)); // Autoboxing
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{null}, new Class<?>[]{String.class}, false));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{null}, new Class<?>[]{int.class}, false));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, null, false));
        // The ambiguity for `isAssignable(null, null, false)` is resolved by explicitly calling the array version.
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], new Class<?>[0], false));
    }

    @Test
    public void testIsAssignableClassClass() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class));
        assertTrue(ClassUtils.isAssignable(String.class, Object.class));
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
        assertTrue(ClassUtils.isAssignable(int.class, long.class));
        assertTrue(ClassUtils.isAssignable(int.class, float.class));
        assertTrue(ClassUtils.isAssignable(int.class, double.class));
        assertTrue(ClassUtils.isAssignable(long.class, double.class));
        assertTrue(ClassUtils.isAssignable(float.class, double.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, Object.class));
        // Explicitly calling the version with a single Class parameter for null checks.
        assertTrue(ClassUtils.isAssignable(null, String.class)); // Ambiguity resolved by explicit null casts
        assertFalse(ClassUtils.isAssignable(null, int.class));
        assertFalse(ClassUtils.isAssignable(String.class, null));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class)); // Autoboxing
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class)); // Unboxing
    }

    @Test
    public void testIsAssignableClassClassBoolean() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class, false));
        assertTrue(ClassUtils.isAssignable(String.class, Object.class, false));
        assertFalse(ClassUtils.isAssignable(Object.class, String.class, false));
        assertFalse(ClassUtils.isAssignable(int.class, long.class, false)); // No autoboxing
        assertTrue(ClassUtils.isAssignable(int.class, long.class, true)); // Autoboxing enabled
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true)); // Unboxing enabled
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true)); // Autoboxing enabled
        // Explicitly calling the version with a single Class parameter for null checks.
        assertTrue(ClassUtils.isAssignable(null, String.class, false)); // Ambiguity resolved by explicit null casts
        assertFalse(ClassUtils.isAssignable(null, int.class, false));
        assertFalse(ClassUtils.isAssignable(String.class, null, false));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, false)); // Check for explicit autoboxing off
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, false)); // Check for explicit unboxing off
    }

    @Test
    public void testPrimitiveToWrapper() {
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
        assertEquals(Byte.class, ClassUtils.primitiveToWrapper(Byte.TYPE));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(Character.TYPE));
        assertEquals(Short.class, ClassUtils.primitiveToWrapper(Short.TYPE));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(Long.TYPE));
        assertEquals(Float.class, ClassUtils.primitiveToWrapper(Float.TYPE));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(Double.TYPE));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class)); // Non-primitive
    }

    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertTrue(ClassUtils.primitivesToWrappers(new Class<?>[0]).length == 0); // Use length check instead of isEmpty()
        Class<?>[] primitives = {int.class, boolean.class, String.class};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertEquals(3, wrappers.length);
        assertEquals(Integer.class, wrappers[0]);
        assertEquals(Boolean.class, wrappers[1]);
        assertEquals(String.class, wrappers[2]); // Non-primitive remains unchanged
    }

    @Test
    public void testWrapperToPrimitive() {
        assertEquals(Boolean.TYPE, ClassUtils.wrapperToPrimitive(Boolean.class));
        assertEquals(Byte.TYPE, ClassUtils.wrapperToPrimitive(Byte.class));
        assertEquals(Character.TYPE, ClassUtils.wrapperToPrimitive(Character.class));
        assertEquals(Short.TYPE, ClassUtils.wrapperToPrimitive(Short.class));
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(Long.TYPE, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(Float.TYPE, ClassUtils.wrapperToPrimitive(Float.class));
        assertEquals(Double.TYPE, ClassUtils.wrapperToPrimitive(Double.class));
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertNull(ClassUtils.wrapperToPrimitive(String.class)); // Non-wrapper
        assertNull(ClassUtils.wrapperToPrimitive(Integer.TYPE)); // Primitive
    }

    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertTrue(ClassUtils.wrappersToPrimitives(new Class<?>[0]).length == 0); // Use length check instead of isEmpty()
        Class<?>[] wrappers = {Integer.class, Boolean.class, String.class};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertEquals(3, primitives.length);
        assertEquals(Integer.TYPE, primitives[0]);
        assertEquals(Boolean.TYPE, primitives[1]);
        assertNull(primitives[2]); // Non-wrapper becomes null
    }

    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertFalse(ClassUtils.isInnerClass(null));
        // Anonymous inner class
        assertTrue(ClassUtils.isInnerClass(new Object() {}.getClass()));
        // Inner class
        assertTrue(ClassUtils.isInnerClass(new MyInnerClass().new InnerClass().getClass()));
    }

    // Helper class for isInnerClass test
    private static class MyInnerClass {
        class InnerClass {}
    }

    @Test
    public void testGetClassClassLoaderStringBoolean() throws Exception {
        ClassLoader cl = getClass().getClassLoader();
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String", true));
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String", false));
        assertEquals(int[].class, ClassUtils.getClass(cl, "int[]", true));
        assertEquals(int[].class, ClassUtils.getClass(cl, "[I", true));
        assertEquals(String[].class, ClassUtils.getClass(cl, "java.lang.String[]", true));
        assertEquals(String[].class, ClassUtils.getClass(cl, "[Ljava.lang.String;", true));
    }

    @Test
    public void testGetClassClassLoaderString() throws Exception {
        ClassLoader cl = getClass().getClassLoader();
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String"));
        assertEquals(int[].class, ClassUtils.getClass(cl, "[I"));
    }

    @Test
    public void testGetClassStringBoolean() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", true));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", false));
        assertEquals(int[].class, ClassUtils.getClass("int[]", true));
        assertEquals(int[].class, ClassUtils.getClass("[I", true));
        assertEquals(String[].class, ClassUtils.getClass("java.lang.String[]", true));
        assertEquals(String[].class, ClassUtils.getClass("[Ljava.lang.String;", true));
    }

    @Test
    public void testGetClassString() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(int[].class, ClassUtils.getClass("[I"));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethodNotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }

    @Test
    public void testGetPublicMethod() throws Exception {
        // Test with a public method
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertEquals("length", method.getName());
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));

        // Test with a method that requires searching through superclasses/interfaces
        // Example: List.add(Object) vs ArrayList.add(Object)
        List<String> list = new ArrayList<>();
        method = ClassUtils.getPublicMethod(list.getClass(), "add", new Class<?>[]{Object.class});
        assertEquals("add", method.getName());
        assertEquals(List.class, method.getDeclaringClass()); // Should find the interface method
    }

    @Test
    public void testToClass() {
        assertNull(ClassUtils.toClass(null));
        assertTrue(ClassUtils.toClass(new Object[0]).length == 0); // Use length check instead of isEmpty()
        Object[] objects = {"hello", Integer.valueOf(123), null};
        Class<?>[] classes = ClassUtils.toClass(objects);
        assertEquals(3, classes.length);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
        assertNull(classes[2]);
    }

    @Test
    public void testGetShortCanonicalNameObjectString() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class, "null"));
        assertEquals("null", ClassUtils.getShortCanonicalName(null, "null"));
        assertEquals("Integer", ClassUtils.getShortCanonicalName(Integer.valueOf(1), "null"));
    }

    @Test
    public void testGetShortCanonicalNameClass() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null)); // Explicitly cast null to Class<?>
        assertEquals("Integer", ClassUtils.getShortCanonicalName(Integer.class));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
        assertEquals("java.lang.String[][]", ClassUtils.getShortCanonicalName(String[][].class));
    }

    @Test
    public void testGetShortCanonicalNameString() {
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("", ClassUtils.getShortCanonicalName((String) null)); // Explicitly cast null to String
        assertEquals("", ClassUtils.getShortCanonicalName(""));
        assertEquals("String", ClassUtils.getShortCanonicalName("String"));
        assertEquals("List", ClassUtils.getShortCanonicalName("java.util.List"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        assertEquals("java.lang.String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
        assertEquals("java.lang.String[][]", ClassUtils.getShortCanonicalName("[[Ljava.lang.String;"));
        assertEquals("Map", ClassUtils.getShortCanonicalName("java.util.Map"));
    }

    @Test
    public void testGetPackageCanonicalNameObjectString() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class, "null"));
        assertEquals("null", ClassUtils.getPackageCanonicalName(null, "null"));
        assertEquals("java.util", ClassUtils.getPackageCanonicalName(new ArrayList<>(), "null"));
    }

    @Test
    public void testGetPackageCanonicalNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null)); // Explicitly cast null to Class<?>
        assertEquals("java.util", ClassUtils.getPackageCanonicalName(ArrayList.class));
        assertEquals("", ClassUtils.getPackageCanonicalName(Object.class));
    }

    @Test
    public void testGetPackageCanonicalNameString() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
        assertEquals("", ClassUtils.getPackageCanonicalName((String) null)); // Explicitly cast null to String
        assertEquals("", ClassUtils.getPackageCanonicalName(""));
        assertEquals("", ClassUtils.getPackageCanonicalName("String"));
        assertEquals("java.util", ClassUtils.getPackageCanonicalName("java.util.List"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I")); // Primitives have no package
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[[Ljava.lang.String;"));
    }
}
