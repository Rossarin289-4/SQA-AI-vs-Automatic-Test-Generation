package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilteringParserDelegateAI21Test {

    @Test
    public void testConstructionAndGetters() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, false);

        assertSame(filter, delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());
        assertFalse(delegate.hasCurrentToken());
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
    }

    @Test
    public void testTokenStateQueriesWithNoToken() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, false, true);

        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
    }

    @Test
    public void testFilterContextAccess() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, true);

        assertNotNull(delegate._filterContext());
    }
}
