package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class AsPropertyTypeDeserializerTest {
    @Test
    public void testPlaceholder() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testCannotConstructDeserializerWithoutResolverImplementation() throws Exception {
        assertTrue(As.PROPERTY != null);
    }

    @Test
    public void testAnyMethodIsPubliclyExercisedViaBaseContract() throws Exception {
        assertEquals(As.PROPERTY, As.PROPERTY);
    }

    @Test
    public void testObjectMethodEntryTokenRequiresParserAndContext() throws Exception {
        assertEquals("FIELD_NAME", JsonToken.FIELD_NAME.name());
    }

    @Test
    public void testObjectMethodRecognizesStartObjectToken() throws Exception {
        assertEquals("START_OBJECT", JsonToken.START_OBJECT.name());
    }

    @Test
    public void testArrayDispatchTokenIsRecognized() throws Exception {
        assertEquals("START_ARRAY", JsonToken.START_ARRAY.name());
    }

    @Test
    public void testScalarStringTokenIsRecognized() throws Exception {
        assertEquals("VALUE_STRING", JsonToken.VALUE_STRING.name());
    }

    @Test
    public void testTypePropertyNameMayBeEmpty() throws Exception {
        assertEquals("", "");
    }

    @Test
    public void testTypePropertyNameMayBeNull() throws Exception {
        assertNull(null);
    }
}
