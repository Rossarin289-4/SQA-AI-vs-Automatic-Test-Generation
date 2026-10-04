package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiPredicate;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.node.NullNode;

public class InnerClassPropertyTest {

    // Mock class for testing purposes. Needs a non-static inner class.
    public static class OuterClass {
        public class InnerClass {
            private String value;
            private OuterClass _outer; // To hold the reference

            public InnerClass(OuterClass outer, String value) {
                this._outer = outer; // Store the outer class reference
                this.value = value;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public OuterClass getOuter() {
                return _outer;
            }
        }
    }

    // Mock class for testing deserialization.
    public static class MockSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Object _value;
        private String _fieldName;
        private int _index = -1;

        public MockSettableBeanProperty(String name, JavaType type, String fieldName) {
            super(new PropertyName(name), type, null, null);
            _fieldName = fieldName;
        }

        protected MockSettableBeanProperty(SettableBeanProperty src, JsonDeserializer<?> deser) {
            super(src, deser);
            if (src instanceof MockSettableBeanProperty) {
                this._value = ((MockSettableBeanProperty) src)._value; // Copy value for testing
                this._fieldName = ((MockSettableBeanProperty) src)._fieldName;
                this._index = ((MockSettableBeanProperty) src)._index;
            }
        }

        protected MockSettableBeanProperty(MockSettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this._value = src._value;
            this._fieldName = src._fieldName;
            this._index = src._index;
        }

        @Override
        public void assignIndex(int index) {
            _index = index;
        }

        @Override
        public int getPropertyIndex() {
            return _index;
        }

        @Override
        public int getCreatorIndex() {
            return 0; // Not relevant for this mock
        }

        @Override
        public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException {
            try {
                Object value = _valueDeserializer.deserialize(jp, ctxt);
                set(bean, value);
            } catch (Exception e) {
                throw new IOException(e);
            }
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            Object value = deserialize(jp, ctxt);
            return setAndReturn(instance, value);
        }

        @Override
        public final void set(Object instance, Object value) throws IOException {
            this._value = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return value; // Return the value that was set
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null; // Not relevant for this mock
        }

        @Override
        public AnnotatedMember getMember() {
            return null; // Not relevant for this mock
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new MockSettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new MockSettableBeanProperty(this, deser);
        }

        public Object getValue() {
            return _value;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // Mock JsonDeserializer for testing
    public static class MockJsonDeserializer<T> extends JsonDeserializer<T> {
        private T _valueToReturn;

        public MockJsonDeserializer(T valueToReturn) {
            _valueToReturn = valueToReturn;
        }

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _valueToReturn;
        }

        @Override
        public T getNullValue(DeserializationContext ctxt) {
            return null;
        }
    }

    // Mock DeserializationContext for testing
    // It needs to implement abstract methods and have a valid constructor.

    // Mock JsonParser for testing

    @Test
    public void testConstructorAndDelegate() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        assertNotNull(innerProp);
        assertNotNull(innerProp._delegate);
        assertEquals(delegate, innerProp._delegate);
        assertNotNull(innerProp._creator);
        assertEquals(ctor, innerProp._creator);
    }

    @Test
    public void testWithNewName() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);
        PropertyName newName = new PropertyName("newName");

        InnerClassProperty renamedProp = innerProp.withName(newName);

        assertNotNull(renamedProp);
        assertNotSame(innerProp, renamedProp);
        assertEquals(newName, renamedProp.getName());
        assertEquals(newName, renamedProp._delegate.getName());
        assertEquals(innerProp._creator, renamedProp._creator);
    }

    @Test
    public void testWithDifferentName() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);
        PropertyName newName = new PropertyName("anotherName");

        InnerClassProperty renamedProp = innerProp.withName(newName);

        assertNotNull(renamedProp);
        assertNotSame(innerProp, renamedProp);
        assertEquals(newName, renamedProp.getName());
        assertNotEquals(innerProp.getName(), renamedProp.getName());
    }

    @Test
    public void testWithDifferentNameAndOriginal() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);
        PropertyName newName = new PropertyName("newName");

        InnerClassProperty renamedProp = innerProp.withName(newName);

        assertNotNull(renamedProp);
        // Ensure original object is unchanged
        assertEquals(new PropertyName("testProp"), innerProp.getName());
    }

    @Test
    public void testWithValueDeserializer() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);
        MockJsonDeserializer<String> newDeser = new MockJsonDeserializer<>("newValue");

        InnerClassProperty newProp = innerProp.withValueDeserializer(newDeser);

        assertNotNull(newProp);
        assertNotSame(innerProp, newProp);
        assertEquals(newDeser, newProp._delegate.getValueDeserializer());
        assertEquals(innerProp._creator, newProp._creator);
    }

    @Test
    public void testAssignIndexAndGetters() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        innerProp.assignIndex(5);
        assertEquals(5, innerProp.getPropertyIndex());
        assertEquals(0, innerProp.getCreatorIndex()); // Mock delegate has index 0
    }

    @Test
    public void testAssignIndexZero() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        innerProp.assignIndex(0);
        assertEquals(0, innerProp.getPropertyIndex());
    }

    @Test
    public void testGetAnnotation() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        assertNull(innerProp.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        assertNull(innerProp.getMember());
    }




    @Test
    public void testSet() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        OuterClass.InnerClass valueToSet = outer.new InnerClass(outer, "setValue");
        innerProp.set(outer, valueToSet);

        assertEquals(valueToSet, ((MockSettableBeanProperty)innerProp._delegate).getValue());
    }

    @Test
    public void testSetAndReturn() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");
        InnerClassProperty innerProp = new InnerClassProperty(delegate, ctor);

        OuterClass.InnerClass valueToSet = outer.new InnerClass(outer, "setAndReturnValue");
        Object returned = innerProp.setAndReturn(outer, valueToSet);

        assertEquals(valueToSet, returned);
        assertEquals(valueToSet, ((MockSettableBeanProperty)innerProp._delegate).getValue());
    }

    // Test case for the readResolve method (simulating deserialization)
    @Test
    public void testReadResolve() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");

        InnerClassProperty original = new InnerClassProperty(delegate, ctor);

        AnnotatedConstructor dummyAnnotated = new AnnotatedConstructor(null, ctor, null, null);
        Field annotatedField = InnerClassProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(original, dummyAnnotated);

        Object resolved = original.readResolve();

        assertTrue(resolved instanceof InnerClassProperty);
        InnerClassProperty resolvedProp = (InnerClassProperty) resolved;

        assertEquals(original._delegate, resolvedProp._delegate);
        assertEquals(original._creator, resolvedProp._creator);
        assertEquals(dummyAnnotated, resolvedProp._annotated);
    }

    @Test
    public void testReadResolveWithNullAnnotated() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");

        InnerClassProperty original = new InnerClassProperty(delegate, ctor);

        Field annotatedField = InnerClassProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(original, null);

        Object resolved = original.readResolve();

        assertTrue(resolved instanceof InnerClassProperty);
        InnerClassProperty resolvedProp = (InnerClassProperty) resolved;

        assertEquals(original._delegate, resolvedProp._delegate);
        assertEquals(original._creator, resolvedProp._creator);
        assertNull(resolvedProp._annotated);
    }

    // Test case for the writeReplace method (simulating serialization)
    @Test
    public void testWriteReplaceWithAnnotated() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");

        InnerClassProperty original = new InnerClassProperty(delegate, ctor);

        AnnotatedConstructor dummyAnnotated = new AnnotatedConstructor(null, ctor, null, null);
        Field annotatedField = InnerClassProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(original, dummyAnnotated);

        Object replaced = original.writeReplace();

        assertSame(original, replaced);
    }

    @Test
    public void testWriteReplaceWithoutAnnotated() throws Exception {
        OuterClass outer = new OuterClass();
        Constructor<?> ctor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class, String.class);
        JavaType dummyType = TypeFactory.defaultInstance().constructType(Object.class);
        MockSettableBeanProperty delegate = new MockSettableBeanProperty("testProp", dummyType, "fieldName");

        InnerClassProperty original = new InnerClassProperty(delegate, ctor);

        Field annotatedField = InnerClassProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(original, null);

        Object replaced = original.writeReplace();

        assertTrue(replaced instanceof InnerClassProperty);
        InnerClassProperty replacedProp = (InnerClassProperty) replaced;

        assertEquals(original._delegate, replacedProp._delegate);
        assertEquals(original._creator, replacedProp._creator);
        assertNotNull(replacedProp._annotated);
        assertNotNull(replacedProp._annotated.getAnnotated());
        assertEquals(original._creator, replacedProp._annotated.getAnnotated());
    }

}


