package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FilteringParserDelegateAI22Test {

    @Test
    public void testGetFilter() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, true);
        assertSame(filter, delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());
    }

    @Test
    public void testTokenAccessorsInitialState() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, false, false);
        assertNull(delegate.getCurrentToken());
        assertNull(delegate.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.currentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
    }

    @Test
    public void testFilterContext() {
        TokenFilter filter = new TokenFilter();
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, false);
        assertNotNull(delegate._filterContext());
    }
}
