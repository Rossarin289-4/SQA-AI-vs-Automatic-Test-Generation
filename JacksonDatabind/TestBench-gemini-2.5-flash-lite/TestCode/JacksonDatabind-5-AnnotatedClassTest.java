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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock AnnotationIntrospector and MixInResolver for testing purposes
    // Removed abstract methods from MockAnnotationIntrospector that are not overridden

    private static class MockMixInResolver implements MixInResolver {
        private final Map<Class<?>, Class<?>> mixins = new HashMap<>();

        public void add(Class<?> target, Class<?> mixin) {
            mixins.put(target, mixin);
        }

        @Override
        public Class<?> findMixInClassFor(Class<?> cls) {
            return mixins.get(cls);
        }
    }

    // Dummy annotation for testing - must be concrete for instantiation
    public @interface MockAnnotation {
        String value();
    }

    // Dummy annotation implementation for testing
    private static class MockAnnotationImpl implements MockAnnotation {
        private final String _value;

        public MockAnnotationImpl(String value) {
            _value = value;
        }

        @Override
        public String value() { return _value; }

        @Override
        public Class<? extends Annotation> annotationType() {
            return MockAnnotation.class;
        }
    }




    @Test
    public void testGetAnnotated() {
        AnnotatedClass ac = AnnotatedClass.construct(Integer.class, null, null);
        assertNotNull(ac);
        assertEquals(Integer.class, ac.getAnnotated());
    }

    @Test
    public void testGetModifiers() {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac);
        // String is public final, so modifiers should reflect that
        assertEquals(Modifier.PUBLIC | Modifier.FINAL, ac.getModifiers());
    }

    @Test
    public void testGetName() {
        AnnotatedClass ac = AnnotatedClass.construct(List.class, null, null);
        assertNotNull(ac);
        assertEquals("java.util.List", ac.getName());
    }


    @Test
    public void testGetAnnotation_absent() {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac);
        Annotation ann = ac.getAnnotation(Deprecated.class);
        assertNull(ann);
    }

    @Test
    public void testGetGenericType() {
        AnnotatedClass ac = AnnotatedClass.construct(List.class, null, null);
        assertNotNull(ac);
        // getGenericType() on AnnotatedClass returns the raw class itself
        assertEquals(List.class, ac.getGenericType());
    }

    @Test
    public void testGetRawType() {
        AnnotatedClass ac = AnnotatedClass.construct(Map.class, null, null);
        assertNotNull(ac);
        assertEquals(Map.class, ac.getRawType());
    }




    @Test
    public void testHasAnnotations_false() {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac);
        // No annotations are added by default for String.class
        assertFalse(ac.hasAnnotations());
    }

    @Test
    public void testGetDefaultConstructor_present() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithDefaultCtor.class, null, null);
        assertNotNull(ac);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();
        assertNotNull(ctor);
        assertTrue(ctor.getAnnotated().getParameterTypes().length == 0);
    }

    @Test
    public void testGetDefaultConstructor_absent() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithoutDefaultCtor.class, null, null);
        assertNotNull(ac);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();
        assertNull(ctor);
    }

    @Test
    public void testGetConstructors_present() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithMultipleCtors.class, null, null);
        assertNotNull(ac);
        List<AnnotatedConstructor> constructors = ac.getConstructors();
        assertNotNull(constructors);
        // Should contain only non-default constructors
        assertEquals(1, constructors.size());
        assertEquals(String.class, constructors.get(0).getAnnotated().getParameterTypes()[0]);
    }

    @Test
    public void testGetConstructors_absent() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithDefaultCtor.class, null, null);
        assertNotNull(ac);
        List<AnnotatedConstructor> constructors = ac.getConstructors();
        assertNotNull(constructors);
        // Only default constructor is present, which is not returned by getConstructors()
        assertTrue(constructors.isEmpty());
    }

    @Test
    public void testGetStaticMethods_present() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithStaticMethods.class, null, null);
        assertNotNull(ac);
        List<AnnotatedMethod> staticMethods = ac.getStaticMethods();
        assertNotNull(staticMethods);
        assertEquals(2, staticMethods.size()); // staticMethod and anotherStaticMethod
        // Check names to ensure correct methods are found
        Set<String> methodNames = new HashSet<>();
        for(AnnotatedMethod am : staticMethods) {
            methodNames.add(am.getName());
        }
        assertTrue(methodNames.contains("staticMethod"));
        assertTrue(methodNames.contains("anotherStaticMethod"));
    }

    @Test
    public void testGetStaticMethods_absent() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac);
        List<AnnotatedMethod> staticMethods = ac.getStaticMethods();
        assertNotNull(staticMethods);
        // String class has static methods like valueOf, format, etc.
        // The exact count depends on the JDK version, but it's not zero.
        assertTrue(!staticMethods.isEmpty());
    }

    @Test
    public void testMemberMethods_resolved() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithMethods.class, null, null);
        assertNotNull(ac);
        // Calling memberMethods() resolves them
        Iterable<AnnotatedMethod> methods = ac.memberMethods();
        assertNotNull(methods);
        assertTrue(methods.iterator().hasNext()); // SimpleClassWithMethods has publicMethod
    }

    @Test
    public void testGetMemberMethodCount_resolved() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithMethods.class, null, null);
        assertNotNull(ac);
        // Calling getMemberMethodCount() resolves them
        // SimpleClassWithMethods has publicMethod(String s) and privateMethod()
        // _isIncludableMemberMethod filters out private methods and methods with > 2 args.
        // publicMethod(String s) has 1 arg and is public, so it should be included.
        assertEquals(1, ac.getMemberMethodCount());
    }

    @Test
    public void testFindMethod_absent() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithMethods.class, null, null);
        assertNotNull(ac);
        // Ensure methods are resolved
        ac.memberMethods();
        AnnotatedMethod method = ac.findMethod("nonExistentMethod", new Class<?>[]{});
        assertNull(method);
    }

    @Test
    public void testFindMethod_present() throws Exception {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithMethods.class, null, null);
        assertNotNull(ac);
        // Ensure methods are resolved
        ac.memberMethods();
        AnnotatedMethod method = ac.findMethod("publicMethod", new Class<?>[]{String.class});
        assertNotNull(method);
        assertEquals("publicMethod", method.getName());
        assertEquals(String.class, method.getRawParameterType(0));
    }

    @Test
    public void testGetFieldCount_resolved() {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithFields.class, null, null);
        assertNotNull(ac);
        // Calling getFieldCount() resolves them
        assertEquals(2, ac.getFieldCount()); // SimpleClassWithFields has two fields: publicField and privateField
    }

    @Test
    public void testFields_resolved() {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleClassWithFields.class, null, null);
        assertNotNull(ac);
        // Calling fields() resolves them
        Iterable<AnnotatedField> fields = ac.fields();
        assertNotNull(fields);
        assertTrue(fields.iterator().hasNext());
        Set<String> fieldNames = new HashSet<>();
        for (AnnotatedField af : fields) {
            fieldNames.add(af.getName());
        }
        assertTrue(fieldNames.contains("publicField"));
        assertTrue(fieldNames.contains("privateField"));
    }

    @Test
    public void testToString() {
        AnnotatedClass ac = AnnotatedClass.construct(String.class, null, null);
        assertNotNull(ac);
        assertEquals("[AnnotedClass java.lang.String]", ac.toString());
    }

    // --- Helper classes for testing ---

    // Class with a default constructor
    public static class SimpleClassWithDefaultCtor {
        public SimpleClassWithDefaultCtor() {
        }
    }

    // Class without a default constructor
    public static class SimpleClassWithoutDefaultCtor {
        public SimpleClassWithoutDefaultCtor(String arg) {
        }
    }

    // Class with multiple constructors
    public static class SimpleClassWithMultipleCtors {
        public SimpleClassWithMultipleCtors() {
        }
        public SimpleClassWithMultipleCtors(String arg) {
        }
    }

    // Class with static methods
    public static class SimpleClassWithStaticMethods {
        public static void staticMethod() {
        }
        public static void anotherStaticMethod(int x) {
        }
    }

    // Class with regular methods
    public static class SimpleClassWithMethods {
        public void publicMethod(String s) {
        }
        private void privateMethod() {
        }
    }

    // Class with fields
    public static class SimpleClassWithFields {
        public String publicField;
        private int privateField;

        public SimpleClassWithFields(String publicField, int privateField) {
            this.publicField = publicField;
            this.privateField = privateField;
        }
    }
}
