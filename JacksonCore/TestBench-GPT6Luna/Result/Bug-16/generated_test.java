package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;

public class JsonParserSequenceTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testHeaderOnly() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testCreateFlattenedParserCount() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(2, sequence.containedParsersCount());
    }

    @Test
    public void testFirstParserTokenThenSecondParserToken() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertNull(sequence.nextToken());
    }

    @Test
    public void testInitiallyCurrentTokenIsReturnedBeforeAdvancing() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, first.nextToken());
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
    }

    @Test
    public void testSecondParserWithInitiallyCurrentToken() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, second.nextToken());
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
    }

    @Test
    public void testSequenceContainingSingleTokenParser() throws Exception {
        JsonParser first = new JsonFactory().createParser("");
        JsonParser second = new JsonFactory().createParser("3");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertNull(sequence.nextToken());
    }

    @Test
    public void testNestedSequenceIsFlattened() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParser third = new JsonFactory().createParser("3");
        JsonParserSequence inner = JsonParserSequence.createFlattened(first, second);
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, third);
        assertEquals(3, outer.containedParsersCount());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertNull(outer.nextToken());
    }

    @Test
    public void testFlatteningSkipsConsumedParserInSequence() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParser third = new JsonFactory().createParser("3");
        JsonParserSequence inner = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, inner.nextToken());
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, third);
        assertEquals(3, outer.containedParsersCount());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
    }

    @Test
    public void testFlattenSequenceAsSecondArgument() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParser third = new JsonFactory().createParser("3");
        JsonParserSequence inner = JsonParserSequence.createFlattened(second, third);
        JsonParserSequence outer = JsonParserSequence.createFlattened(first, inner);
        assertEquals(3, outer.containedParsersCount());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertNull(outer.nextToken());
    }

    @Test
    public void testCloseClosesAllParsers() throws Exception {
        JsonParser first = new JsonFactory().createParser("1");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        sequence.close();
        assertTrue(first.isClosed());
        assertTrue(second.isClosed());
    }

    @Test
    public void testCloseWhenFirstParserIsEmpty() throws Exception {
        JsonParser first = new JsonFactory().createParser("");
        JsonParser second = new JsonFactory().createParser("2");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        sequence.close();
        assertTrue(first.isClosed());
        assertTrue(second.isClosed());
    }

    @Test
    public void testOneEmptyParserFallsThroughToNext() throws Exception {
        JsonParser first = new JsonFactory().createParser("");
        JsonParser second = new JsonFactory().createParser("4");
        JsonParserSequence sequence = JsonParserSequence.createFlattened(first, second);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertNull(sequence.nextToken());
    }

    @Test
    public void testSeveralEmptyParsersFallThrough() throws Exception {
        JsonParser first = new JsonFactory().createParser("");
        JsonParser second = new JsonFactory().createParser("");
        JsonParser third = new JsonFactory().createParser("5");
        JsonParserSequence inner = JsonParserSequence.createFlattened(first, second);
        JsonParserSequence sequence = JsonParserSequence.createFlattened(inner, third);
        assertEquals(JsonToken.VALUE_NUMBER_INT, sequence.nextToken());
        assertNull(sequence.nextToken());
    }
}
