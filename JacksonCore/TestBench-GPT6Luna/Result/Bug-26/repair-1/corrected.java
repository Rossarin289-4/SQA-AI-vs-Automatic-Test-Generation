package com.fasterxml.jackson.core.json.async;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.async.NonBlockingInputFeeder;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.VersionUtil;

public class NonBlockingJsonParserTest {
    @Test
    public void testFeederIsParser() throws Exception {
        NonBlockingJsonParser parser = newParser();
        assertSame(parser, parser.getNonBlockingInputFeeder());
    }

    @Test
    public void testNeedMoreInputInitially() throws Exception {
        NonBlockingJsonParser parser = newParser();
        assertTrue(parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputAfterFeed() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("1"), 0, 1);
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputAfterConsumingFeed() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("1"), 0, 1);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertTrue(parser.needMoreInput());
    }

    @Test
    public void testEndOfInputStopsNeedMore() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.endOfInput();
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testFeedSubrange() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("x7y"), 1, 2);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("7", parser.getText());
    }

    @Test
    public void testFeedEmptyRange() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes(""), 0, 0);
        assertTrue(parser.needMoreInput());
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
    }

    @Test
    public void testFeedReversedRangeRejected() throws Exception {
        NonBlockingJsonParser parser = newParser();
        try {
            parser.feedInput(bytes("x"), 1, 0);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testFeedAfterEndRejected() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.endOfInput();
        try {
            parser.feedInput(bytes("1"), 0, 1);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testReleaseBufferedCopiesAvailableBytes() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("123"), 0, 3);
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(3, parser.releaseBuffered(out));
        assertEquals("123", new String(out.toByteArray(), "UTF-8"));
    }

    @Test
    public void testReleaseBufferedEmptyAfterConsumption() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("1"), 0, 1);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.releaseBuffered(new java.io.ByteArrayOutputStream()));
    }

    @Test
    public void testNextTokenEmptyInputUnavailable() throws Exception {
        NonBlockingJsonParser parser = newParser();
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
    }

    @Test
    public void testNextTokenNumberAndEnd() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("1"), 0, 1);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.endOfInput();
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenBoolean() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("true"), 0, 4);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testSplitKeywordAcrossFeeds() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("tr"), 0, 2);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        assertTrue(parser.needMoreInput());
        parser.feedInput(bytes("ue"), 0, 2);
        parser.endOfInput();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testSplitStringAcrossFeeds() throws Exception {
        NonBlockingJsonParser parser = newParser();
        parser.feedInput(bytes("\"ab"), 0, 3);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());
        parser.feedInput(bytes("c\""), 0, 2);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abc", parser.getText());
    }

    private static NonBlockingJsonParser newParser() {
        IOContext context = new IOContext(null, null, false);
        return new NonBlockingJsonParser(context, JsonParser.Feature.collectDefaults(),
                ByteQuadsCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults()));
    }

    private static byte[] bytes(String value) throws Exception {
        return value.getBytes("UTF-8");
    }
}
