package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParserSequenceAI16Test {

    @Test
    public void testContainedParsersCount() {
        JsonParser p1 = new JsonParserDelegate(null);
        JsonParser p2 = new JsonParserDelegate(null);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testCreateFlattenedNesting() {
        JsonParser p1 = new JsonParserDelegate(null);
        JsonParser p2 = new JsonParserDelegate(null);
        JsonParser p3 = new JsonParserDelegate(null);
        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(seq1, p3);
        assertEquals(3, seq2.containedParsersCount());
    }

    @Test
    public void testNextTokenNullDelegate() throws IOException {
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[0]);
        seq.delegate = null;
        assertNull(seq.nextToken());
    }
}
