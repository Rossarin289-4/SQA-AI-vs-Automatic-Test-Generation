package com.fasterxml.jackson.core.filter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;

public class FilteringParserDelegateAI22Test {

    @Test
    public void testConstructionAndBasicGetters() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        Assert.assertEquals(filter, delegate.getFilter());
        Assert.assertEquals(0, delegate.getMatchCount());
        Assert.assertFalse(delegate.hasCurrentToken());
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertNull(delegate.currentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.currentTokenId());
        Assert.assertFalse(delegate.isExpectedStartArrayToken());
        Assert.assertFalse(delegate.isExpectedStartObjectToken());
        Assert.assertNull(delegate.getLastClearedToken());
        
        delegate.close();
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertNull(delegate.getLastClearedToken());
        delegate.clearCurrentToken(); // Should do nothing when _currToken is null

        JsonToken t = delegate.nextToken();
        Assert.assertNotNull(t);
        Assert.assertTrue(delegate.hasCurrentToken());

        delegate.clearCurrentToken();
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertEquals(t, delegate.getLastClearedToken());

        delegate.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrowsException() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            delegate.close();
        }
    }

    @Test
    public void testHasTokenAndIdMethods() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[10]");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertTrue(delegate.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(delegate.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_NUMBER_INT));
        Assert.assertFalse(delegate.hasToken(JsonToken.START_ARRAY));

        JsonToken t = delegate.nextToken(); // START_ARRAY
        Assert.assertEquals(JsonToken.START_ARRAY, t);
        Assert.assertTrue(delegate.hasCurrentToken());
        Assert.assertTrue(delegate.hasToken(JsonToken.START_ARRAY));
        Assert.assertTrue(delegate.hasTokenId(JsonToken.START_ARRAY.id()));
        Assert.assertTrue(delegate.isExpectedStartArrayToken());
        Assert.assertFalse(delegate.isExpectedStartObjectToken());

        delegate.close();
    }

    @Test
    public void testSkipChildrenWhenNotStruct() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        JsonToken t = delegate.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        // skipChildren should return immediately when current token is not START_OBJECT or START_ARRAY
        JsonParser skipped = delegate.skipChildren();
        Assert.assertEquals(delegate, skipped);

        delegate.close();
    }

    @Test
    public void testNextValue() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\": 42}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        JsonToken t = delegate.nextValue();
        // First token is START_OBJECT, nextValue moves past field name if any, but first is START_OBJECT
        Assert.assertEquals(JsonToken.START_OBJECT, t);

        delegate.close();
    }
}
