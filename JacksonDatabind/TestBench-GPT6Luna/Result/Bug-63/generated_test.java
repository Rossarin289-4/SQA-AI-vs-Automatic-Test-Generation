package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.*;

public class JsonMappingExceptionTest {
    @Test
    public void testReferenceWithField() throws Exception {
        Object source = new Object();
        JsonMappingException.Reference ref = new JsonMappingException.Reference(source, "name");
        assertSame(source, ref.getFrom());
        assertEquals("name", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
        assertEquals(source.getClass().getName() + "[\"name\"]", ref.getDescription());
    }

    @Test
    public void testReferenceWithIndexZero() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(List.class, 0);
        assertEquals(0, ref.getIndex());
        assertNull(ref.getFieldName());
        assertEquals("java.util.List[0]", ref.toString());
    }

    @Test
    public void testReferenceWithNegativeIndex() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, -1);
        assertEquals("java.lang.String[?]", ref.getDescription());
    }

    @Test
    public void testReferenceForUnknownSource() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(null);
        assertEquals("UNKNOWN[?]", ref.getDescription());
    }

    @Test
    public void testReferenceForArrayClass() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String[][].class, 2);
        assertEquals("java.lang.String[][][2]", ref.getDescription());
    }

    @Test
    public void testNullFieldNameRejected() throws Exception {
        try {
            new JsonMappingException.Reference(new Object(), (String) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testEmptyExceptionHasNoPath() throws Exception {
        JsonMappingException ex = new JsonMappingException("problem");
        assertEquals("problem", ex.getMessage());
        assertEquals("problem", ex.getLocalizedMessage());
        assertEquals(Collections.emptyList(), ex.getPath());
        assertEquals("", ex.getPathReference());
        assertNull(ex.getProcessor());
    }

    @Test
    public void testPrependFieldPathAndMessage() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        ex.prependPath(String.class, "value");
        assertEquals("java.lang.String[\"value\"]", ex.getPathReference());
        assertEquals("bad (through reference chain: java.lang.String[\"value\"])", ex.getMessage());
        assertEquals(1, ex.getPath().size());
    }

    @Test
    public void testPrependPathOrder() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        ex.prependPath(String.class, "last");
        ex.prependPath(List.class, 0);
        assertEquals("java.util.List[0]->java.lang.String[\"last\"]", ex.getPathReference());
        assertEquals(2, ex.getPath().size());
    }

    @Test
    public void testPathReferenceAppendsToBuilder() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        ex.prependPath(String.class, 1);
        StringBuilder builder = new StringBuilder("prefix:");
        assertSame(builder, ex.getPathReference(builder));
        assertEquals("prefix:java.lang.String[1]", builder.toString());
    }

    @Test
    public void testWrapWithPathCreatesMappingException() throws Exception {
        IOException cause = new IOException("read failed");
        JsonMappingException ex = JsonMappingException.wrapWithPath(cause, String.class, 3);
        assertSame(cause, ex.getCause());
        assertEquals("read failed (through reference chain: java.lang.String[3])", ex.getMessage());
        assertEquals(1, ex.getPath().size());
        assertEquals(3, ex.getPath().get(0).getIndex());
    }

    @Test
    public void testWrapExistingMappingExceptionPrependsPath() throws Exception {
        JsonMappingException original = new JsonMappingException("bad");
        JsonMappingException result = JsonMappingException.wrapWithPath(original, List.class, "item");
        assertSame(original, result);
        assertEquals("bad (through reference chain: java.util.List[\"item\"])", result.getMessage());
    }

    @Test
    public void testWrapWithEmptyMessageUsesClassPlaceholder() throws Exception {
        IOException cause = new IOException("");
        JsonMappingException ex = JsonMappingException.wrapWithPath(cause, Object.class, 0);
        assertEquals("(was java.io.IOException) (through reference chain: java.lang.Object[0])", ex.getMessage());
    }

    @Test
    public void testUnexpectedIOExceptionMessage() throws Exception {
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(new IOException("disk"));
        assertEquals("Unexpected IOException (of type java.io.IOException): disk", ex.getMessage());
    }

    @Test
    public void testFromParserPreservesMessage() throws Exception {
        JsonMappingException ex = JsonMappingException.from((JsonParser) null, "parse problem");
        assertEquals("parse problem", ex.getMessage());
        assertNull(ex.getProcessor());
    }

    @Test
    public void testPathListIsUnmodifiable() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        ex.prependPath(Object.class, 0);
        try {
            ex.getPath().clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, ex.getPath().size());
    }

    @Test
    public void testToStringIncludesClassAndMessage() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        assertEquals(JsonMappingException.class.getName() + ": bad", ex.toString());
    }

    @Test
    public void testLocalizedMessageIncludesPath() throws Exception {
        JsonMappingException ex = new JsonMappingException("bad");
        ex.prependPath(Object.class, "x");
        assertEquals(ex.getMessage(), ex.getLocalizedMessage());
    }
}
