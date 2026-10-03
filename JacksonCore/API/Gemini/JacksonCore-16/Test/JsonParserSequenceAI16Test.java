package com.fasterxml.jackson.core.util;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;

public class JsonParserSequenceAI16Test {

    // Minimal stub of JsonParser for testing JsonParserSequence behavior deterministically
    private static class DummyJsonParser extends JsonParser {
        private final JsonToken[] tokens;
        private int index = 0;
        private boolean closed = false;
        private boolean hasCurrent = false;
        private JsonToken current = null;

        public DummyJsonParser(JsonToken... tokens) {
            this.tokens = tokens;
        }

        public DummyJsonParser(boolean hasCurrent, JsonToken current, JsonToken... tokens) {
            this.hasCurrent = hasCurrent;
            this.current = current;
            this.tokens = tokens;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (index < tokens.length) {
                current = tokens[index++];
                hasCurrent = true;
                return current;
            }
            current = null;
            hasCurrent = false;
            return null;
        }

        @Override
        public boolean hasCurrentToken() {
            return hasCurrent;
        }

        @Override
        public JsonToken currentToken() {
            return current;
        }

        @Override
        public JsonToken getCurrentToken() {
            return current;
        }

        // Unused required abstract methods from JsonParser
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) { }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public String getCurrentName() throws IOException { return null; }
        @Override public void overrideCurrentName(String name) { }
        @Override public String getText() throws IOException { return null; }
        @Override public char[] getTextCharacters() throws IOException { return null; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public Number getNumberValue() throws IOException { return null; }
        @Override public NumberType getNumberType() throws IOException { return null; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0; }
        @Override public java.math.BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override public float getFloatValue() throws IOException { return 0f; }
        @Override public double getDoubleValue() throws IOException { return 0.0; }
        @Override public java.math.BigDecimal getDecimalValue() throws IOException { return null; }
        @Override public Object getEmbeddedObject() throws IOException { return null; }
        @Override public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant b64variant) throws IOException { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public void clearCurrentToken() { current = null; hasCurrent = false; }
        @Override public String getValueAsString() throws IOException { return null; }
        @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
    }

    @Test
    public void testContainedParsersCount() {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.END_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testNextTokenSequence() throws IOException {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT, JsonToken.FIELD_NAME);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, seq.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, seq.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void testSuppressNextTokenWhenDelegateHasCurrent() throws IOException {
        DummyJsonParser p1 = new DummyJsonParser(true, JsonToken.START_ARRAY, JsonToken.VALUE_NUMBER_INT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.END_ARRAY);
        
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        
        // Since p1 already had current token (START_ARRAY), sequence suppresses nextToken on construction and returns current
        Assert.assertEquals(JsonToken.START_ARRAY, seq.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, seq.nextToken());
        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void testCloseSequence() throws IOException {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.END_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertFalse(p1.isClosed());
        Assert.assertFalse(p2.isClosed());

        seq.close();

        Assert.assertTrue(p1.isClosed());
        Assert.assertTrue(p2.isClosed());
    }

    @Test
    public void testCreateFlattenedWithNestedSequences() {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.FIELD_NAME);
        DummyJsonParser p3 = new DummyJsonParser(JsonToken.END_OBJECT);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(seq1, p3);

        Assert.assertEquals(3, seq2.containedParsersCount());
    }

    @Test
    public void testCreateFlattenedFirstIsSequenceOnly() {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.END_OBJECT);
        DummyJsonParser p3 = new DummyJsonParser(JsonToken.VALUE_NULL);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(seq1, p3);

        Assert.assertEquals(3, seq2.containedParsersCount());
    }

    @Test
    public void testCreateFlattenedSecondIsSequenceOnly() {
        DummyJsonParser p1 = new DummyJsonParser(JsonToken.START_OBJECT);
        DummyJsonParser p2 = new DummyJsonParser(JsonToken.END_OBJECT);
        DummyJsonParser p3 = new DummyJsonParser(JsonToken.VALUE_NULL);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p2, p3);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(p1, seq1);

        Assert.assertEquals(3, seq2.containedParsersCount());
    }

    @Test
    public void testSwitchToNextWithCurrentTokenCondition() throws IOException {
        // p1 ends immediately (returns null on nextToken)
        DummyJsonParser p1 = new DummyJsonParser();
        // p2 has a current token set when switched to
        DummyJsonParser p2 = new DummyJsonParser(true, JsonToken.VALUE_TRUE);
        
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        // First call to nextToken on p1 returns null, triggers switch to p2, which uses hasCurrentToken()
        Assert.assertEquals(JsonToken.VALUE_TRUE, seq.nextToken());
        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void testNullDelegateHandling() throws IOException {
        JsonParserSequence seq = JsonParserSequence.createFlattened(
                new DummyJsonParser(JsonToken.START_OBJECT),
                new DummyJsonParser(JsonToken.END_OBJECT)
        );
        Assert.assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        Assert.assertNull(seq.nextToken());
        // Subsequent calls should safely return null
        Assert.assertNull(seq.nextToken());
    }
}
