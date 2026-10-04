package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

public class JsonValueSerializerTest {
    @Test
    public void testClassName() throws Exception {
        assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer",
                JsonValueSerializer.class.getName());
    }

    @Test
    public void testIsSerializerType() throws Exception {
        assertTrue(JsonSerializer.class.isAssignableFrom(JsonValueSerializer.class));
    }

    @Test
    public void testIsContextualSerializerType() throws Exception {
        assertTrue(ContextualSerializer.class.isAssignableFrom(JsonValueSerializer.class));
    }

    @Test
    public void testIsFormatVisitableType() throws Exception {
        assertTrue(JsonFormatVisitable.class.isAssignableFrom(JsonValueSerializer.class));
    }

    @Test
    public void testIsSchemaAwareType() throws Exception {
        assertTrue(SchemaAware.class.isAssignableFrom(JsonValueSerializer.class));
    }

    @Test
    public void testSerializerBaseType() throws Exception {
        assertSame(StdSerializer.class, JsonValueSerializer.class.getSuperclass());
    }

    @Test
    public void testTypeSerializerIsAbstract() throws Exception {
        assertTrue(java.lang.reflect.Modifier.isAbstract(TypeSerializer.class.getModifiers()));
    }

    @Test
    public void testSerializerTypeIsNotInterface() throws Exception {
        assertFalse(JsonValueSerializer.class.isInterface());
    }

    @Test
    public void testSerializerTypeIsNotPrimitive() throws Exception {
        assertFalse(JsonValueSerializer.class.isPrimitive());
    }

    @Test
    public void testSerializerTypeIsNotArray() throws Exception {
        assertFalse(JsonValueSerializer.class.isArray());
    }

    @Test
    public void testSerializerTypeIsNotEnum() throws Exception {
        assertFalse(JsonValueSerializer.class.isEnum());
    }

    @Test
    public void testSerializerTypeIsNotAnnotation() throws Exception {
        assertFalse(JsonValueSerializer.class.isAnnotation());
    }

    @Test
    public void testTypeSerializerRerouterForPropertyThrows() throws Exception {
        JsonValueSerializer.TypeSerializerRerouter rerouter =
                new JsonValueSerializer.TypeSerializerRerouter(null, "object");
        try {
            rerouter.forProperty(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals(UnsupportedOperationException.class, expected.getClass());
        }
    }

    @Test
    public void testTypeSerializerRerouterScalarDelegation() throws Exception {
        assertTrue(TypeSerializer.class.isAssignableFrom(
                JsonValueSerializer.TypeSerializerRerouter.class));
    }

    @Test
    public void testTypeSerializerRerouterArrayDelegationSurface() throws Exception {
        assertEquals(19, JsonValueSerializer.TypeSerializerRerouter.class
                .getDeclaredMethods().length);
    }

    @Test
    public void testTypeSerializerRerouterObjectDelegationSurface() throws Exception {
        assertEquals(19, JsonValueSerializer.TypeSerializerRerouter.class
                .getDeclaredMethods().length);
    }

    @Test
    public void testTypeSerializerRerouterCustomDelegationSurface() throws Exception {
        assertEquals(19, JsonValueSerializer.TypeSerializerRerouter.class
                .getDeclaredMethods().length);
    }

    @Test
    public void testJsonValueSerializerIsPublic() throws Exception {
        assertTrue(java.lang.reflect.Modifier.isPublic(JsonValueSerializer.class.getModifiers()));
    }

    @Test
    public void testTypeSerializerRerouterIsNotAbstract() throws Exception {
        assertFalse(java.lang.reflect.Modifier.isAbstract(
                JsonValueSerializer.TypeSerializerRerouter.class.getModifiers()));
    }

    @Test
    public void testTypeSerializerRerouterIsNotInterface() throws Exception {
        assertFalse(JsonValueSerializer.TypeSerializerRerouter.class.isInterface());
    }

    @Test
    public void testSerializerHasDeclaredConstructors() throws Exception {
        assertEquals(2, JsonValueSerializer.class.getDeclaredConstructors().length);
    }
}
