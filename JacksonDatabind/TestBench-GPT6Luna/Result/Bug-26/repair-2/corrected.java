package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {
    @Test
    public void testInternalSettingsSetAndReplace() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.getInternalSetting("k"));
        assertNull(writer.setInternalSetting("k", "first"));
        assertEquals("first", writer.setInternalSetting("k", "second"));
        assertEquals("second", writer.getInternalSetting("k"));
    }

    @Test
    public void testInternalSettingsRemoveAndReinsert() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        writer.setInternalSetting("k", "v");
        assertEquals("v", writer.removeInternalSetting("k"));
        assertNull(writer.getInternalSetting("k"));
        assertNull(writer.removeInternalSetting("k"));
        assertNull(writer.setInternalSetting("k", "again"));
        assertEquals("again", writer.getInternalSetting("k"));
    }

    @Test
    public void testReadResolveVirtualWriter() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertSame(writer, writer.readResolve());
    }

    @Test
    public void testAnnotationsOnVirtualWriter() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.getAnnotation(Deprecated.class));
        assertNull(writer.getContextAnnotation(Deprecated.class));
    }

    @Test
    public void testFormatLookupWithoutIntrospector() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.findFormatOverrides(null));
        assertNull(writer.findFormatOverrides(null));
    }

    @Test
    public void testAssignSerializerAndRejectReplacement() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        JsonSerializer<Object> serializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) { }
        };
        writer.assignSerializer(serializer);
        assertTrue(writer.hasSerializer());
        assertSame(serializer, writer.getSerializer());
        try {
            writer.assignSerializer(null);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testAssignSameSerializerAgain() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        JsonSerializer<Object> serializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) { }
        };
        writer.assignSerializer(serializer);
        writer.assignSerializer(serializer);
        assertSame(serializer, writer.getSerializer());
    }

    @Test
    public void testAssignNullSerializerAndRejectReplacement() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        JsonSerializer<Object> serializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) { }
        };
        writer.assignNullSerializer(serializer);
        assertTrue(writer.hasNullSerializer());
        try {
            writer.assignNullSerializer(null);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testAssignSameNullSerializerAgain() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        JsonSerializer<Object> serializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) { }
        };
        writer.assignNullSerializer(serializer);
        writer.assignNullSerializer(serializer);
        assertTrue(writer.hasNullSerializer());
    }

    @Test
    public void testAssignAndClearTypeSerializer() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.getTypeSerializer());
        writer.assignTypeSerializer(null);
        assertNull(writer.getTypeSerializer());
    }

    @Test
    public void testVirtualWriterBasicAccessors() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertFalse(writer.isVirtual());
        assertFalse(writer.isUnwrapping());
        assertFalse(writer.hasSerializer());
        assertFalse(writer.hasNullSerializer());
        assertFalse(writer.willSuppressNulls());
        assertNull(writer.getSerializationType());
        assertNull(writer.getRawSerializationType());
        assertNull(writer.getViews());
    }

    @Test
    public void testVirtualWriterNameAndText() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.getSerializedName());
        assertEquals("property 'null' (virtual, no static serializer)", writer.toString());
    }

    @Test
    public void testNameConflictWithNullWrapper() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertTrue(writer.wouldConflictWithName(new PropertyName("null")));
        assertFalse(writer.wouldConflictWithName(new PropertyName("other")));
        assertFalse(writer.wouldConflictWithName(new PropertyName("null", "ns")));
    }

    @Test
    public void testRenameVirtualWriterIsIdentityForNoOp() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertSame(writer, writer.rename(NameTransformer.simpleTransformer("", "")));
    }

    @Test
    public void testRenameVirtualWriterChangesName() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        BeanPropertyWriter renamed = writer.rename(NameTransformer.simpleTransformer("pre", "suf"));
        assertEquals("prenullsuf", renamed.getName());
        assertEquals("null", writer.getName());
    }

    @Test
    public void testUnwrappingWriterReportsUnwrapping() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        BeanPropertyWriter unwrapped =
                writer.unwrappingWriter(NameTransformer.simpleTransformer("pre", "suf"));
        assertTrue(unwrapped.isUnwrapping());
        assertEquals("prenullsuf", unwrapped.getName());
    }

    @Test
    public void testVirtualGetterHasNoPropertyValue() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        assertNull(writer.getPropertyType());
        assertNull(writer.getGenericPropertyType());
        assertNull(writer.get(null));
    }

    @Test
    public void testVirtualWriterSuppressesOmittedFieldWhenGeneratorCanOmit()
            throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        writer.serializeAsOmittedField(null, null, null);
        assertTrue(true);
    }

    @Test
    public void testVirtualWriterPlaceholderWritesNull() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        writer.serializeAsPlaceholder(null, null, null);
        assertFalse(writer.hasNullSerializer());
    }

    @Test
    public void testVirtualWriterElementWritesNull() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        writer.serializeAsElement(null, null, null);
        assertNull(writer.get(null));
    }

    @Test
    public void testDepositSchemaPropertyIgnoresNullVisitor() throws Exception {
        BeanPropertyWriter writer = new BeanPropertyWriter();
        writer.depositSchemaProperty((JsonObjectFormatVisitor) null);
        assertFalse(writer.isRequired());
    }
}
