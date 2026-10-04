package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

public class BeanDeserializerFactoryTest {
    @Test
    public void testInstanceCreation() {
        assertNotNull(BeanDeserializerFactory.instance);
        assertTrue(BeanDeserializerFactory.instance instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsNewInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        BeanDeserializerFactory newFactory = (BeanDeserializerFactory) factory.withConfig(config);
        assertNotSame(factory, newFactory);
        assertTrue(newFactory instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigReturnsSameInstanceIfConfigIsSame() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        BeanDeserializerFactory sameFactory = (BeanDeserializerFactory) factory.withConfig(config);
        assertSame(factory, sameFactory);
    }























    @Test
    public void testIsPotentialBeanType() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(String.class));
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(Integer.class));
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(Object.class));
    }

    @Test
    public void testIsPotentialBeanTypeThrowsExceptionForNonBeanTypes() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(int.class); // Primitive
            fail("Should throw IllegalArgumentException for primitive type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("primitive"));
        }

        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(List.class); // Abstract
            fail("Should throw IllegalArgumentException for abstract type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("abstract"));
        }

        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(Enum.class); // Enum
            fail("Should throw IllegalArgumentException for enum type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Enum"));
        }
    }


    // Helper method to create a mock DeserializationContext




    // Helper to create a mock AnnotatedField
    private AnnotatedField createMockAnnotatedField(String fieldName, Class<?> fieldType) {
        // This is a simplified mock. A real AnnotatedField requires reflection.
        // We'll create a dummy object that pretends to be an AnnotatedField.
        try {
            // Need a mock Field object
            java.lang.reflect.Field mockField = MockClass.class.getDeclaredField(fieldName);
            return new AnnotatedField(null, mockField, null);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to create a mock AnnotatedMethod
    private AnnotatedMethod createMockAnnotatedMethod(String methodName, Class<?> returnType, Class<?>... paramTypes) throws NoSuchMethodException {
        // This is a simplified mock. A real AnnotatedMethod requires reflection.
        Method mockMethod = MockClass.class.getDeclaredMethod(methodName, paramTypes);
        return new AnnotatedMethod(null, mockMethod, null, null);
    }


    // Mock class for reflection
    static class MockClass {
        public String someBackRef; // Placeholder for back-ref
        public void setUnknown(String key, Object value) {} // Placeholder for any setter
        public String getSomeField() { return null; } // Placeholder for getter
        public String someField; // Placeholder for field
        public void someMethod(String param) {}
        public void someMethodWithVoid() {}
        public void someBackRef(String arg) {} // Added for the back-ref test
    }


    // Mock classes for testing purposes
    static class MyBean {
        public String name;
        public int age;
    }

    static class MyBeanWithBuilder {
        public String value;

        public static class Builder {
            private String builderValue;

            public Builder withValue(String value) {
                this.builderValue = value;
                return this;
            }

            public MyBeanWithBuilder build() {
                MyBeanWithBuilder bean = new MyBeanWithBuilder();
                bean.value = this.builderValue;
                return bean;
            }
        }
    }

    static class MyBeanWithObjectId {
        @JsonProperty("id")
        private int id;
        private String data;
    }

    static class MyBeanWithInjectable {
        @JacksonInject("someValue")
        public String injectedField;
    }

    static class MyBeanWithAnySetter {
        private Map<String, Object> unknownProps = new HashMap<>();

        @JsonAnySetter
        public void setUnknown(String key, Object value) {
            unknownProps.put(key, value);
        }
    }

    static class MyBeanWithIgnored {
        public String visible;
        @JsonIgnore
        public String ignored;
    }

    static class MyBeanWithConstructor {
        public final String name;
        public final int count;

        public MyBeanWithConstructor(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    static class MyBeanWithSetterless {
        public String publicField;
    }

    static class MyBeanWithIgnorableType {
        public SomeIgnorableType ignorable;
    }

    @JsonIgnoreType // Mark this type as ignorable
    static class SomeIgnorableType {
        public String nested;
    }

    static class MyEmptyBean {
        // No fields, no constructors, should be handled.
    }
}



