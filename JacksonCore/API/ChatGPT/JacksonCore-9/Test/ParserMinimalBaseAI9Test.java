package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.ObjectCodec;

import java.io.IOException;

public class ParserMinimalBaseAI9Test {

    private static class ConcreteParser extends ParserMinimalBase {
        private JsonToken nextTokenResult;
        private boolean closed = false;

        public ConcreteParser(JsonToken token) {
            this.nextTokenResult = token;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            JsonToken t = nextTokenResult;
            nextTokenResult = null;
            return t;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportError("EOF");
        }

        @Override
        public String getCurrentName() throws IOException {
            return "name";
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
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return null;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public String getText() throws IOException {
            return null;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return null;
        }

        @Override
        public int getTextLength() throws IOException {
            return 0;
        }

        @Override
        public intgetTextOffset() throws IOException {
            return 0;
        }

        @Override
        public boolean hasTextCharacters() {
            return false;
        }

        @Override
        public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant b64variant) throws IOException {
            return null;
        }
    }

    @Test
    public void testCurrentTokenIdNoToken() {
        ConcreteParser parser = new ConcreteParser(null);
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void testIsExpectedStartArrayToken() {
        ConcreteParser parser = new ConcreteParser(JsonToken.START_ARRAY);
        try {
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        } catch (IOException e) {
            fail(e.getMessage());
        }
        assertTrue(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
        assertTrue(parser.hasToken(JsonToken.START_ARRAY));
        assertEquals(JsonTokenId.ID_START_ARRAY, parser.getCurrentTokenId());
    }

    @Test
    public void testSkipChildrenNonStructural() throws IOException {
        ConcreteParser parser = new ConcreteParser(JsonToken.VALUE_STRING);
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }
}
