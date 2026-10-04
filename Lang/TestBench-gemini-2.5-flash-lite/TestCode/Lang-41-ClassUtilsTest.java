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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetShortClassName_ObjectNonNull_ReturnsShortName() {
        assertEquals("String", ClassUtils.getShortClassName(new String("test"), "defaultValue"));
    }

    @Test
    public void testGetShortClassName_ObjectNull_ReturnsValueIfNull() {
        assertEquals("defaultValue", ClassUtils.getShortClassName(null, "defaultValue"));
    }

    @Test
    public void testGetShortClassName_ClassNonNull_ReturnsShortName() {
        assertEquals("Integer", ClassUtils.getShortClassName(Integer.class));
    }

    @Test
    public void testGetShortClassName_ClassNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassName_StringNonNull_ReturnsShortName() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
    }

    @Test
    public void testGetShortClassName_StringNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }

    @Test
    public void testGetShortClassName_StringEmpty_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    @Test
    public void testGetShortClassName_StringArray_ReturnsShortNameWithBrackets() {
        assertEquals("String[]", ClassUtils.getShortClassName("java.lang.String[]"));
    }

    @Test
    public void testGetShortClassName_NestedClass_ReturnsShortNameWithDots() {
        assertEquals("Outer.Inner", ClassUtils.getShortClassName("org.example.Outer$Inner"));
    }
     
    @Test
    public void testGetShortClassName_PrimitiveArray_ReturnsShortNameWithBrackets() {
        assertEquals("int[]", ClassUtils.getShortClassName("int[]"));
    }

    @Test
    public void testGetShortClassName_PrimitiveArrayJVMName_ReturnsShortNameWithBrackets() {
        assertEquals("int[]", ClassUtils.getShortClassName("[I"));
    }

    @Test
    public void testGetPackageName_ObjectNonNull_ReturnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName(new String("test"), "defaultValue"));
    }

    @Test
    public void testGetPackageName_ObjectNull_ReturnsValueIfNull() {
        assertEquals("defaultValue", ClassUtils.getPackageName(null, "defaultValue"));
    }

    @Test
    public void testGetPackageName_ClassNonNull_ReturnsPackageName() {
        assertEquals("java.util", ClassUtils.getPackageName(ArrayList.class));
    }

    @Test
    public void testGetPackageName_ClassNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageName_StringNonNull_ReturnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
    }

    @Test
    public void testGetPackageName_StringNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageName((String) null));
    }

    @Test
    public void testGetPackageName_StringEmpty_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageName(""));
    }

    @Test
    public void testGetPackageName_StringArray_ReturnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String[]"));
    }

    @Test
    public void testGetPackageName_NestedClass_ReturnsPackageName() {
        assertEquals("org.example", ClassUtils.getPackageName("org.example.Outer$Inner"));
    }

    @Test
    public void testGetPackageName_PrimitiveArray_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageName("int[]"));
    }

    @Test
    public void testGetPackageName_PrimitiveArrayJVMName_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageName("[I"));
    }

    @Test
    public void testGetAllSuperclasses_NonNullClass_ReturnsList() {
        List<Class<?>> superclasses = ClassUtils.getAllSuperclasses(ArrayList.class);
        assertNotNull(superclasses);
        assertTrue(superclasses.contains(java.util.AbstractList.class));
        assertTrue(superclasses.contains(Object.class));
    }

    @Test
    public void testGetAllSuperclasses_NullClass_ReturnsNull() {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllInterfaces_NonNullClass_ReturnsList() {
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(ArrayList.class);
        assertNotNull(interfaces);
        assertTrue(interfaces.contains(List.class));
        assertTrue(interfaces.contains(Cloneable.class));
        assertTrue(interfaces.contains(java.io.Serializable.class));
    }

    @Test
    public void testGetAllInterfaces_NullClass_ReturnsNull() {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testConvertClassNamesToClasses_NonNullList_ReturnsClasses() {
        List<String> classNames = new ArrayList<String>();
        classNames.add("java.lang.String");
        classNames.add("java.lang.Integer");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(classNames);
        assertNotNull(classes);
        assertEquals(2, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(Integer.class, classes.get(1));
    }

    @Test
    public void testConvertClassNamesToClasses_NullList_ReturnsNull() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassNamesToClasses_InvalidClassName_ReturnsNullInList() {
        List<String> classNames = new ArrayList<String>();
        classNames.add("invalid.ClassName");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(classNames);
        assertNotNull(classes);
        assertEquals(1, classes.size());
        assertNull(classes.get(0));
    }

    @Test
    public void testConvertClassesToClassNames_NonNullList_ReturnsClassNames() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(Integer.class);
        List<String> classNames = ClassUtils.convertClassesToClassNames(classes);
        assertNotNull(classNames);
        assertEquals(2, classNames.size());
        assertEquals("java.lang.String", classNames.get(0));
        assertEquals("java.lang.Integer", classNames.get(1));
    }

    @Test
    public void testConvertClassesToClassNames_NullList_ReturnsNull() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testConvertClassesToClassNames_NullInList_ReturnsNullInList() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        List<String> classNames = ClassUtils.convertClassesToClassNames(classes);
        assertNotNull(classNames);
        assertEquals(2, classNames.size());
        assertEquals("java.lang.String", classNames.get(0));
        assertNull(classNames.get(1));
    }

    @Test
    public void testIsAssignable_SameClasses_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class));
    }

    @Test
    public void testIsAssignable_SuperclassToSubclass_ReturnsFalse() {
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testIsAssignable_SubclassToSuperclass_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(String.class, Object.class));
    }

    @Test
    public void testIsAssignable_PrimitiveToInt_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
    }

    @Test
    public void testIsAssignable_IntToLong_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
    }

    @Test
    public void testIsAssignable_LongToInt_ReturnsFalse() {
        assertFalse(ClassUtils.isAssignable(Long.TYPE, Integer.TYPE));
    }

    @Test
    public void testIsAssignable_NullToNonNullReference_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(null, String.class));
    }

    @Test
    public void testIsAssignable_NullToPrimitive_ReturnsFalse() {
        assertFalse(ClassUtils.isAssignable(null, Integer.TYPE));
    }

    @Test
    public void testIsAssignable_NonNullReferenceToNull_ReturnsFalse() {
        assertFalse(ClassUtils.isAssignable(String.class, null));
    }

    @Test
    public void testIsAssignable_ArrayTypesMatch_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class}));
    }

    @Test
    public void testIsAssignable_ArrayLengthsDiffer_ReturnsFalse() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class, Integer.class}));
    }

    @Test
    public void testIsAssignable_ArrayElementsAssignable_ReturnsTrue() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{Object.class}));
    }
    
    @Test
    public void testPrimitiveToWrapper_Int_ReturnsInteger() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
    }

    @Test
    public void testPrimitiveToWrapper_Boolean_ReturnsBoolean() {
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
    }

    @Test
    public void testPrimitiveToWrapper_Void_ReturnsVoid() {
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
    }

    @Test
    public void testPrimitiveToWrapper_NonNullPrimitive_ReturnsWrapper() {
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(Long.TYPE));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(Double.TYPE));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(Character.TYPE));
    }

    @Test
    public void testPrimitiveToWrapper_NonNullNonPrimitive_ReturnsSameClass() {
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertEquals(ArrayList.class, ClassUtils.primitiveToWrapper(ArrayList.class));
    }

    @Test
    public void testPrimitiveToWrapper_Null_ReturnsNull() {
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitivesToWrappers_NonNullArray_ReturnsWrappers() {
        Class<?>[] primitives = {int.class, long.class, boolean.class, char.class, byte.class, short.class, float.class, double.class, void.class};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertNotNull(wrappers);
        assertEquals(9, wrappers.length);
        assertEquals(Integer.class, wrappers[0]);
        assertEquals(Long.class, wrappers[1]);
        assertEquals(Boolean.class, wrappers[2]);
        assertEquals(Character.class, wrappers[3]);
        assertEquals(Byte.class, wrappers[4]);
        assertEquals(Short.class, wrappers[5]);
        assertEquals(Float.class, wrappers[6]);
        assertEquals(Double.class, wrappers[7]);
        assertEquals(Void.TYPE, wrappers[8]);
    }

    @Test
    public void testPrimitivesToWrappers_NullArray_ReturnsNull() {
        assertNull(ClassUtils.primitivesToWrappers(null));
    }

    @Test
    public void testPrimitivesToWrappers_EmptyArray_ReturnsEmptyArray() {
        Class<?>[] emptyArray = new Class<?>[0];
        Class<?>[] result = ClassUtils.primitivesToWrappers(emptyArray);
        assertNotNull(result);
        assertEquals(0, result.length);
    }
    
    @Test
    public void testWrapperToPrimitive_Integer_ReturnsInt() {
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
    }

    @Test
    public void testWrapperToPrimitive_Boolean_ReturnsBoolean() {
        assertEquals(Boolean.TYPE, ClassUtils.wrapperToPrimitive(Boolean.class));
    }

    @Test
    public void testWrapperToPrimitive_Void_ReturnsVoid() {
        // Void.class is not a primitive wrapper, so it should return null.
        assertNull(ClassUtils.wrapperToPrimitive(Void.class));
    }

    @Test
    public void testWrapperToPrimitive_NonNullWrapper_ReturnsPrimitive() {
        assertEquals(Long.TYPE, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(Double.TYPE, ClassUtils.wrapperToPrimitive(Double.class));
        assertEquals(Character.TYPE, ClassUtils.wrapperToPrimitive(Character.class));
    }

    @Test
    public void testWrapperToPrimitive_NonNullNonWrapper_ReturnsNull() {
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(ArrayList.class));
    }

    @Test
    public void testWrapperToPrimitive_Null_ReturnsNull() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitives_NonNullArray_ReturnsPrimitives() {
        Class<?>[] wrappers = {Integer.class, Long.class, Boolean.class, Character.class, Byte.class, Short.class, Float.class, Double.class, Void.class};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertNotNull(primitives);
        assertEquals(9, primitives.length);
        assertEquals(Integer.TYPE, primitives[0]);
        assertEquals(Long.TYPE, primitives[1]);
        assertEquals(Boolean.TYPE, primitives[2]);
        assertEquals(Character.TYPE, primitives[3]);
        assertEquals(Byte.TYPE, primitives[4]);
        assertEquals(Short.TYPE, primitives[5]);
        assertEquals(Float.TYPE, primitives[6]);
        assertEquals(Double.TYPE, primitives[7]);
        assertEquals(Void.TYPE, primitives[8]); // Void.class maps to Void.TYPE
    }

    @Test
    public void testWrappersToPrimitives_NullArray_ReturnsNull() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
    }

    @Test
    public void testWrappersToPrimitives_EmptyArray_ReturnsEmptyArray() {
        Class<?>[] emptyArray = new Class<?>[0];
        Class<?>[] result = ClassUtils.wrappersToPrimitives(emptyArray);
        assertNotNull(result);
        assertEquals(0, result.length);
    }
    
    @Test
    public void testIsInnerClass_InnerClass_ReturnsTrue() {
        assertTrue(ClassUtils.isInnerClass(InnerClassExample.Inner.class));
    }

    @Test
    public void testIsInnerClass_StaticNestedClass_ReturnsTrue() {
        assertTrue(ClassUtils.isInnerClass(StaticNestedClassExample.StaticNested.class));
    }

    @Test
    public void testIsInnerClass_TopLevelClass_ReturnsFalse() {
        assertFalse(ClassUtils.isInnerClass(String.class));
    }

    @Test
    public void testIsInnerClass_Null_ReturnsFalse() {
        assertFalse(ClassUtils.isInnerClass(null));
    }

    private static class InnerClassExample {
        class Inner {
        }
    }

    private static class StaticNestedClassExample {
        static class StaticNested {
        }
    }

    @Test
    public void testGetClass_ValidClassNameWithClassLoader_ReturnsClass() throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> cls = ClassUtils.getClass(classLoader, "java.lang.String", true);
        assertNotNull(cls);
        assertEquals(String.class, cls);
    }

    @Test
    public void testGetClass_ValidClassNameNoClassLoader_ReturnsClass() throws ClassNotFoundException {
        Class<?> cls = ClassUtils.getClass("java.lang.Integer", true);
        assertNotNull(cls);
        assertEquals(Integer.class, cls);
    }

    @Test
    public void testGetClass_ValidClassNameAndClassLoaderOnly_ReturnsClass() throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> cls = ClassUtils.getClass(classLoader, "java.lang.Boolean");
        assertNotNull(cls);
        assertEquals(Boolean.class, cls);
    }

    @Test
    public void testGetClass_ValidClassNameOnly_ReturnsClass() throws ClassNotFoundException {
        Class<?> cls = ClassUtils.getClass("java.lang.Double");
        assertNotNull(cls);
        assertEquals(Double.class, cls);
    }
    
    @Test
    public void testGetPublicMethod_PublicMethodExists_ReturnsMethod() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("length", method.getName());
        assertTrue(Modifier.isPublic(method.getModifiers()));
        assertTrue(method.getDeclaringClass().equals(String.class));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_PrivateMethod_ThrowsNoSuchMethodException() throws Exception {
        ClassUtils.getPublicMethod(String.class, "privateMethod", new Class<?>[0]);
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_MethodNotFound_ThrowsNoSuchMethodException() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }
    
    @Test
    public void testToClass_ObjectArray_ReturnsClassArray() {
        Object[] array = {"a", Integer.valueOf(1), Boolean.TRUE};
        Class<?>[] classes = ClassUtils.toClass(array);
        assertNotNull(classes);
        assertEquals(3, classes.length);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
        assertEquals(Boolean.class, classes[2]);
    }

    @Test
    public void testToClass_EmptyObjectArray_ReturnsEmptyClassArray() {
        Object[] array = {};
        Class<?>[] classes = ClassUtils.toClass(array);
        assertNotNull(classes);
        assertEquals(0, classes.length);
    }

    @Test
    public void testToClass_NullArray_ReturnsNull() {
        assertNull(ClassUtils.toClass(null));
    }
    
    @Test
    public void testGetShortCanonicalName_ObjectNonNull_ReturnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName(new String("test"), "defaultValue"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(new String[0], "defaultValue"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(new int[0], "defaultValue"));
    }

    @Test
    public void testGetShortCanonicalName_ObjectNull_ReturnsValueIfNull() {
        assertEquals("defaultValue", ClassUtils.getShortCanonicalName(null, "defaultValue"));
    }

    @Test
    public void testGetShortCanonicalName_ClassNonNull_ReturnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
    }

    @Test
    public void testGetShortCanonicalName_ClassNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetShortCanonicalName_StringNonNull_ReturnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("java.lang.String[]"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
    }

    @Test
    public void testGetShortCanonicalName_StringNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
    }

    @Test
    public void testGetShortCanonicalName_StringEmpty_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getShortCanonicalName(""));
    }

    @Test
    public void testGetPackageCanonicalName_ObjectNonNull_ReturnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(new String("test"), "defaultValue"));
        assertEquals("", ClassUtils.getPackageCanonicalName(new String[0], "defaultValue"));
        assertEquals("", ClassUtils.getPackageCanonicalName(new int[0], "defaultValue"));
    }

    @Test
    public void testGetPackageCanonicalName_ObjectNull_ReturnsValueIfNull() {
        assertEquals("defaultValue", ClassUtils.getPackageCanonicalName(null, "defaultValue"));
    }

    @Test
    public void testGetPackageCanonicalName_ClassNonNull_ReturnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("", ClassUtils.getPackageCanonicalName(String[].class));
        assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
    }

    @Test
    public void testGetPackageCanonicalName_ClassNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetPackageCanonicalName_StringNonNull_ReturnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String[]"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
    }

    @Test
    public void testGetPackageCanonicalName_StringNull_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageCanonicalName((String) null));
    }

    @Test
    public void testGetPackageCanonicalName_StringEmpty_ReturnsEmptyString() {
        assertEquals("", ClassUtils.getPackageCanonicalName(""));
    }

}
