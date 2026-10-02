package com.fasterxml.jackson.core.filter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class FilteringParserDelegateAI15Test {

    @Test
    public void testConstructionAndBasicGetters() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{\"a\":1}");
        TokenFilter tf = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, tf, true, true);

        Assert.assertNotNull(delegate.getFilter());
        Assert.assertEquals(0, delegate.getMatchCount());
        Assert.assertFalse(delegate.hasCurrentToken());
        Assert.assertEquals(com.fasterxml.jackson.core.JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertFalse(delegate.isExpectedStartArrayToken());
        Assert.assertFalse(delegate.isExpectedStartObjectToken());
        Assert.assertNull(delegate.getLastClearedToken());
        
        delegate.close();
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertNull(delegate.getCurrentToken());
        delegate.clearCurrentToken(); // Should be a no-op when current token is null
        Assert.assertNull(delegate.getLastClearedToken());

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
        JsonParser jp = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            delegate.close();
        }
    }

    @Test
    public void testSkipChildrenWhenNotStruct() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("1");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);
        
        // current token is null, skipChildren should just return 'this'
        FilteringParserDelegate result = (FilteringParserDelegate) delegate.skipChildren();
        Assert.assertSame(delegate, result);

        delegate.close();
    }

    @Test
    public void testNextValue() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);

        // Next token should be START_OBJECT
        JsonToken t1 = delegate.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, t1);

        // nextValue should handle FIELD_NAME and return the value token (VALUE_NUMBER_INT for '1')
        JsonToken t2 = delegate.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t2);
        Assert.assertEquals("1", delegate.getText());

        delegate.close();
    }

    @Test
    public void testFilteringSimpleObjectIncludeAll() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{\"a\":1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("a", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals("1", delegate.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());

        delegate.close();
    }

    @Test
    public void testHasTokenMethods() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("true");
        FilteringParserDelegate delegate = new FilteringParserDelegate(jp, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertFalse(delegate.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_TRUE));
        Assert.assertFalse(delegate.hasToken(JsonToken.VALUE_TRUE));

        Assert.assertEquals(JsonToken.VALUE_TRUE, delegate.nextToken());
        Assert.assertTrue(delegate.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_TRUE));
        Assert.assertTrue(delegate.hasToken(JsonToken.VALUE_TRUE));

        delegate.close();
    }
}
