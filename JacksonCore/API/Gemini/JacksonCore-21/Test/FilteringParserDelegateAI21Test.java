package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import org.junit.Assert;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;

public class FilteringParserDelegateAI21Test {

    @Test
    public void testConstructionAndGetters() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{}");
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);
        
        Assert.assertEquals(filter, delegate.getFilter());
        Assert.assertEquals(0, delegate.getMatchCount());
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertNull(delegate.currentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.currentTokenId());
        Assert.assertFalse(delegate.hasCurrentToken());
        Assert.assertFalse(delegate.hasTokenId(1));
        Assert.assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(delegate.isExpectedStartArrayToken());
        Assert.assertFalse(delegate.isExpectedStartObjectToken());
        
        p.close();
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        
        Assert.assertNull(delegate.getLastClearedToken());
        delegate.clearCurrentToken(); // should do nothing when _currToken is null
        Assert.assertNull(delegate.getLastClearedToken());

        JsonToken t = delegate.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, t);
        Assert.assertTrue(delegate.hasCurrentToken());

        delegate.clearCurrentToken();
        Assert.assertFalse(delegate.hasCurrentToken());
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.getLastClearedToken());

        p.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrowsException() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            p.close();
        }
    }

    @Test
    public void testSkipChildrenWhenNotStruct() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        
        // _currToken is null, skipChildren should return this immediately
        JsonParser result = delegate.skipChildren();
        Assert.assertEquals(delegate, result);
        
        p.close();
    }

    @Test
    public void testNextValueMethod() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\": 100}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken t1 = delegate.nextValue();
        Assert.assertEquals(JsonToken.START_OBJECT, t1);
        
        JsonToken t2 = delegate.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t2);

        p.close();
    }

    @Test
    public void testFilteringWithNoMatch() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{\"a\": 100}");
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                return null;
            }
        };
        
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, false, false);
        
        JsonToken t = delegate.nextToken();
        while (t != null) {
            t = delegate.nextToken();
        }
        Assert.assertNull(delegate.getCurrentToken());
        
        p.close();
    }
}
