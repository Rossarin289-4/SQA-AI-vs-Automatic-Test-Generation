package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class JsonValueSerializerTest {

    // Mock class to simulate a bean with a @JsonValue method
    private static class MockBean {
        private String value;
        public MockBean(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    private static class MockBeanInt {
        private Integer value;
        public MockBeanInt(Integer value) { this.value = value; }
        public Integer getValue() { return value; }
    }

    private static class MockBeanBoolean {
        private Boolean value;
        public MockBeanBoolean(Boolean value) { this.value = value; }
        public Boolean getValue() { return value; }
    }

    private static class MockBeanDouble {
        private Double value;
        public MockBeanDouble(Double value) { this.value = value; }
        public Double getValue() { return value; }
    }

    private static class MockBeanNull {
        public String getValue() { return null; }
    }
    
    private static class CustomSerializer extends StdSerializer<Object> {
        protected CustomSerializer() { super(Object.class); }
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom_" + value.toString());
        }
    }

    @JacksonStdImpl
    static class MockAnnotatedValueBean {
        public String getValue() { return "annotated"; }
    }

    enum MockEnum {
        VALUE1, VALUE2;
        public String getValue() { return this.name().toLowerCase(); }
    }

    // Helper to create a simplified AnnotatedMethod for testing
    private AnnotatedMethod getAnnotatedMethod(Class<?> clazz, String methodName) throws Exception {
        Method method = clazz.getMethod(methodName);
        // Minimal constructor for AnnotatedMethod to avoid NullPointerExceptions in this test context
        return new AnnotatedMethod(null, method, null, null); 
    }

    @Test
    public void testToString() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        String expected = "(@JsonValue serializer for method " + MockBean.class.getName() + "#getValue)";
        assertEquals(expected, serializer.toString());
    }
    
    @Test
    public void testWithResolvedDifferentSerializer() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer originalSerializer = new JsonValueSerializer(am, null);
        
        // Use a known, simple serializer for testing
        JsonSerializer<Object> newSerializer = new StringSerializer();
        boolean newForceTypeInfo = true;
        // BeanProperty is not strictly needed for this specific test of withResolved()
        // as it's not used in the withResolved method itself, but in the new instance.
        // Setting to null for simplicity as the current withResolved implementation doesn't rely on its content.
        BeanProperty property = null; 

        JsonValueSerializer resolvedSerializer = originalSerializer.withResolved(property, newSerializer, newForceTypeInfo);

        assertNotNull(resolvedSerializer);
        assertNotSame(originalSerializer, resolvedSerializer); 
        // Check if the new instance has the updated properties
        assertEquals(property, resolvedSerializer._property);
        assertEquals(newSerializer, resolvedSerializer._valueSerializer);
        assertEquals(newForceTypeInfo, resolvedSerializer._forceTypeInformation);
    }

    @Test
    public void testWithResolvedSameProperties() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonSerializer<Object> existingSerializer = new StringSerializer();
        boolean forceTypeInfo = false;
        BeanProperty property = null; // Using null for simplicity as explained above.
        
        JsonValueSerializer originalSerializer = new JsonValueSerializer(am, existingSerializer);
        originalSerializer = originalSerializer.withResolved(property, existingSerializer, forceTypeInfo); 

        // Calling withResolved with the same properties should return the same instance
        JsonValueSerializer sameSerializer = originalSerializer.withResolved(property, existingSerializer, forceTypeInfo);

        assertNotNull(sameSerializer);
        assertSame(originalSerializer, sameSerializer);
    }
}
