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

    private NonBlockingJsonParser createParser(byte[] input) throws IOException {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // The constructor takes parserFeatures as the second argument. Pass 0 for default features.
        NonBlockingJsonParser parser = new NonBlockingJsonParser(ctxt, 0, sym);
        parser.feedInput(input, 0, input.length);
        return parser;
    }

    @Test
    public void testNeedMoreInputWhenBufferEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser(new byte[0]);
        assertTrue(parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputWhenBufferNotEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser("{}".getBytes());
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testFeedInputWhenBufferEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser(new byte[0]);
        parser.feedInput("{}".getBytes(), 0, 2);
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testFeedInputWhenBufferNotEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser("{}".getBytes());
        try {
            parser.feedInput("{}".getBytes(), 0, 2);
            fail("Should have thrown IllegalStateException");
        } catch (IOException e) {
            // Expected
            assertTrue(e.getMessage().contains("Still have 2 undecoded bytes"));
        }
    }

    @Test
    public void testFeedInputInvalidRange() throws Exception {
        NonBlockingJsonParser parser = createParser(new byte[0]);
        try {
            parser.feedInput("{}".getBytes(), 2, 0);
            fail("Should have thrown IllegalStateException");
        } catch (IOException e) {
            // Expected
            assertTrue(e.getMessage().contains("Input end (0) may not be before start (2)"));
        }
    }

    @Test
    public void testEndOfInput() throws Exception {
        NonBlockingJsonParser parser = createParser("{}".getBytes());
        parser.endOfInput();
        assertTrue(parser._endOfInput);
    }

    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser(new byte[0]);
        OutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(0, parser.releaseBuffered(out));
    }

    @Test
    public void testReleaseBufferedNotEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser("{}".getBytes());
        OutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(2, parser.releaseBuffered(out));
        assertEquals("{}", out.toString());
    }

    @Test
    public void testNextTokenNull() throws Exception {
        NonBlockingJsonParser parser = createParser("null".getBytes());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenTrue() throws Exception {
        NonBlockingJsonParser parser = createParser("true".getBytes());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws Exception {
        NonBlockingJsonParser parser = createParser("false".getBytes());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenNumberInt() throws Exception {
        NonBlockingJsonParser parser = createParser("123".getBytes());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testNextTokenNumberFloat() throws Exception {
        NonBlockingJsonParser parser = createParser("123.45".getBytes());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNextTokenNumberExponent() throws Exception {
        NonBlockingJsonParser parser = createParser("1.23e4".getBytes());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.23e4, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNextTokenStringEmpty() throws Exception {
        NonBlockingJsonParser parser = createParser("\"\"".getBytes());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("", parser.getText());
    }

    @Test
    public void testNextTokenStringSimple() throws Exception {
        NonBlockingJsonParser parser = createParser("\"hello\"".getBytes());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testNextTokenStringWithEscape() throws Exception {
        NonBlockingJsonParser parser = createParser("\"hello\\nworld\"".getBytes());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello\nworld", parser.getText());
    }

    @Test
    public void testNextTokenStringUnicodeEscape() throws Exception {
        NonBlockingJsonParser parser = createParser("\"\\u0041\"".getBytes());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
    }

    @Test
    public void testNextTokenObjectStart() throws Exception {
        NonBlockingJsonParser parser = createParser("{".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenObjectEnd() throws Exception {
        NonBlockingJsonParser parser = createParser("}".getBytes());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenArrayStart() throws Exception {
        NonBlockingJsonParser parser = createParser("[".getBytes());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenArrayEnd() throws Exception {
        NonBlockingJsonParser parser = createParser("]".getBytes());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenFieldName() throws Exception {
        NonBlockingJsonParser parser = createParser("\"fieldName\":".getBytes());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("fieldName", parser.getCurrentName());
    }

    @Test
    public void testNextTokenAfterEOF() throws Exception {
        NonBlockingJsonParser parser = createParser("".getBytes());
        parser.endOfInput();
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenInMiddleOfToken() throws Exception {
        NonBlockingJsonParser parser = new NonBlockingJsonParser(new IOContext(null, null, false), 0, ByteQuadsCanonicalizer.createRoot());
        parser.feedInput("1".getBytes(), 0, 1);
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken()); // Incomplete number
        parser.feedInput("2".getBytes(), 0, 1);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // Should complete the number '12'
    }

    @Test
    public void testNextTokenWithLeadingZerosAllowed() throws Exception {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // Use the mask FEAT_MASK_ALLOW_NUMERIC_LEADING_ZEROS from the NonBlockingJsonParser class.
        // Accessing it as a static final int.
        NonBlockingJsonParser parserWithFeature = new NonBlockingJsonParser(ctxt, NonBlockingJsonParser.FEAT_MASK_ALLOW_NUMERIC_LEADING_ZEROS, sym);
        parserWithFeature.feedInput("007".getBytes(), 0, 3);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserWithFeature.nextToken());
        assertEquals(7, parserWithFeature.getIntValue());
    }

    @Test
    public void testNextTokenWithLeadingZerosDisallowed() throws Exception {
        NonBlockingJsonParser parser = createParser("007".getBytes());
        // Default behavior should be disallowed if the feature is not enabled.
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        NonBlockingJsonParser parserWithoutFeature = new NonBlockingJsonParser(ctxt, 0, sym);
        parserWithoutFeature.feedInput("007".getBytes(), 0, 3);
        try {
            parserWithoutFeature.nextToken();
            fail("Should have thrown JsonParseException for leading zeros");
        } catch (JsonParseException e) {
            // Expected
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
    }

    @Test
    public void testNextTokenWithTrailingCommaAllowed() throws Exception {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // Use the mask FEAT_MASK_TRAILING_COMMA from the NonBlockingJsonParser class.
        NonBlockingJsonParser parserWithFeature = new NonBlockingJsonParser(ctxt, NonBlockingJsonParser.FEAT_MASK_TRAILING_COMMA, sym);
        parserWithFeature.feedInput("[1,]".getBytes(), 0, 4);
        assertEquals(JsonToken.START_ARRAY, parserWithFeature.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserWithFeature.nextToken());
        assertEquals(JsonToken.END_ARRAY, parserWithFeature.nextToken());
    }

    @Test
    public void testNextTokenWithTrailingCommaDisallowed() throws Exception {
        NonBlockingJsonParser parser = createParser("[1,]".getBytes());
        // Default behavior should be disallowed.
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        NonBlockingJsonParser parserWithoutFeature = new NonBlockingJsonParser(ctxt, 0, sym);
        parserWithoutFeature.feedInput("[1,]".getBytes(), 0, 4);
        assertEquals(JsonToken.START_ARRAY, parserWithoutFeature.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserWithoutFeature.nextToken());
        try {
            parserWithoutFeature.nextToken(); // Should be END_ARRAY, but finds comma
            fail("Should have thrown JsonParseException for trailing comma");
        } catch (JsonParseException e) {
            // Expected
            assertTrue(e.getMessage().contains("was expecting comma to separate"));
        }
    }

    @Test
    public void testStartDocumentWithBOM() throws Exception {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] json = "{}".getBytes();
        byte[] combined = new byte[bom.length + json.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(json, 0, combined, bom.length, json.length);

        NonBlockingJsonParser parser = createParser(combined);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testStartDocumentWithLeadingSpace() throws Exception {
        NonBlockingJsonParser parser = createParser("  {}".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testStartDocumentWithLeadingComment() throws Exception {
        NonBlockingJsonParser parser = createParser("// comment\n{}".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testStartFieldNameWithQuote() throws Exception {
        NonBlockingJsonParser parser = createParser("\"field\":".getBytes());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getCurrentName());
        // To test for value after field name, we need more input
        parser.feedInput("123".getBytes(), 0, 3);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testStartFieldNameWithAposQuoteAllowed() throws Exception {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // Use the mask FEAT_MASK_ALLOW_SINGLE_QUOTES from NonBlockingJsonParser.
        NonBlockingJsonParser parserWithFeature = new NonBlockingJsonParser(ctxt, NonBlockingJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES, sym);
        parserWithFeature.feedInput("'field':".getBytes(), 0, "'field':".length());
        assertEquals(JsonToken.FIELD_NAME, parserWithFeature.nextToken());
        assertEquals("field", parserWithFeature.getCurrentName());
    }

    @Test
    public void testStartFieldNameWithUnquotedNameAllowed() throws Exception {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // Use the mask FEAT_MASK_ALLOW_UNQUOTED_NAMES from NonBlockingJsonParser.
        NonBlockingJsonParser parserWithFeature = new NonBlockingJsonParser(ctxt, NonBlockingJsonParser.FEAT_MASK_ALLOW_UNQUOTED_NAMES, sym);
        parserWithFeature.feedInput("field:".getBytes(), 0, "field:".length());
        assertEquals(JsonToken.FIELD_NAME, parserWithFeature.nextToken());
        assertEquals("field", parserWithFeature.getCurrentName());
    }

    @Test
    public void testStartFieldNameWithTrailingCommaAndCloseObject() throws Exception {
        IOContext ctxt = new IOContext(null, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        // Use the mask FEAT_MASK_TRAILING_COMMA from NonBlockingJsonParser.
        NonBlockingJsonParser parserWithFeature = new NonBlockingJsonParser(ctxt, NonBlockingJsonParser.FEAT_MASK_TRAILING_COMMA, sym);
        parserWithFeature.feedInput("[1,]".getBytes(), 0, "[1,]".length());
        assertEquals(JsonToken.START_ARRAY, parserWithFeature.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parserWithFeature.nextToken());
        assertEquals(JsonToken.END_ARRAY, parserWithFeature.nextToken());
    }

    @Test
    public void testStartValueWithHashComment() throws Exception {
        NonBlockingJsonParser parser = createParser("# comment\n{}".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testStartValueWithSlashComment() throws Exception {
        NonBlockingJsonParser parser = createParser("// comment\n{}".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testStartValueWithCComment() throws Exception {
        NonBlockingJsonParser parser = createParser("/* comment */{}".getBytes());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }
}
