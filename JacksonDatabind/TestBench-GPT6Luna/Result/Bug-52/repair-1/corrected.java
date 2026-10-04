package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;

public class BeanDeserializerBaseTest {
    @Test
    public void testClassKeyEquality() throws Exception {
        ClassKey first = new ClassKey(String.class);
        ClassKey second = new ClassKey(String.class);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testClassKeyDifferentClasses() throws Exception {
        assertNotEquals(new ClassKey(String.class), new ClassKey(Integer.class));
    }

    @Test
    public void testClassKeyReset() throws Exception {
        ClassKey key = new ClassKey(String.class);
        key.reset(Integer.class);
        assertEquals(new ClassKey(Integer.class), key);
    }

    @Test
    public void testClassKeyCompareSameClass() throws Exception {
        assertEquals(0, new ClassKey(String.class).compareTo(new ClassKey(String.class)));
    }

    @Test
    public void testClassKeyCompareDifferentClasses() throws Exception {
        int forward = new ClassKey(String.class).compareTo(new ClassKey(Integer.class));
        int reverse = new ClassKey(Integer.class).compareTo(new ClassKey(String.class));
        assertEquals(-Integer.signum(forward), Integer.signum(reverse));
    }

    @Test
    public void testTokenBufferStartsEmpty() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        assertNull(buffer.firstToken());
    }

    @Test
    public void testTokenBufferFirstTokenAfterWritingString() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeString("x");
        assertEquals(JsonToken.VALUE_STRING, buffer.firstToken());
    }

    @Test
    public void testTokenBufferArrayStartToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
    }

    @Test
    public void testTokenBufferObjectStartToken() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buffer.firstToken());
    }

    @Test
    public void testTokenBufferEnableFeature() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testTokenBufferDisableFeature() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        buffer.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testTokenBufferCloseChangesClosedState() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testTokenBufferCodecSetter() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        assertNull(buffer.getCodec());
        buffer.setCodec(null);
        assertNull(buffer.getCodec());
    }

    @Test
    public void testTypeDeserializerNaturalString() throws Exception {
        assertNull(TypeDeserializer.deserializeIfNatural(null, null, String.class));
    }

    @Test
    public void testExternalTypeHandlerUnconfiguredLookup() throws Exception {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build().start();
        assertFalse(handler.handleTypePropertyValue(null, null, "missing", null));
        assertFalse(handler.handlePropertyValue(null, null, "missing", null));
        assertSame(null, handler.complete(null, null, null));
    }

    @Test
    public void testExternalTypeHandlerEmptyBuilderAndStart() throws Exception {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build(null);
        assertSame(null, handler.start().complete(null, null, null));
    }

    @Test
    public void testTypeDeserializerNaturalUnsupportedInput() throws Exception {
        assertNull(TypeDeserializer.deserializeIfNatural(null, null, Integer.class));
    }

    @Test
    public void testClassKeyCompareResultIsAntisymmetric() throws Exception {
        ClassKey a = new ClassKey(String.class);
        ClassKey b = new ClassKey(Integer.class);
        assertEquals(Integer.signum(a.compareTo(b)), -Integer.signum(b.compareTo(a)));
    }

    @Test
    public void testTokenBufferEndArrayFirstTokenRemainsStart() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeStartArray();
        buffer.writeEndArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
    }

    @Test
    public void testExternalTypeHandlerCompleteEmptyPreservesBean() throws Exception {
        Object bean = new Object();
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build(null).start();
        assertSame(bean, handler.complete(null, null, bean));
    }

    @Test
    public void testExternalTypeHandlerUnknownPropertyIsNotHandled() throws Exception {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build(null).start();
        assertFalse(handler.handlePropertyValue(null, null, "", null));
    }

    @Test
    public void testExternalTypeHandlerUnknownTypePropertyIsNotHandled() throws Exception {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build(null).start();
        assertFalse(handler.handleTypePropertyValue(null, null, "", null));
    }

    @Test
    public void testTokenBufferFirstTokenForNullValue() throws Exception {
        TokenBuffer buffer = new TokenBuffer((ObjectCodec) null);
        buffer.writeNull();
        assertEquals(JsonToken.VALUE_NULL, buffer.firstToken());
    }

    @Test
    public void testClassKeyResetToSameClass() throws Exception {
        ClassKey key = new ClassKey(Integer.class);
        key.reset(Integer.class);
        assertEquals(0, key.compareTo(new ClassKey(Integer.class)));
    }
}
