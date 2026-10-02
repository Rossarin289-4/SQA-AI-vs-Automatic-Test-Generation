package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;

public class FilteringParserDelegateAI15Test {

    @Test
    public void testGetFilterAndMatchCount() {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, true);
        assertSame(filter, delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());
    }

    @Test
    public void testTokenAccessorsBeforeAnyToken() {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, true);
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
    }

    @Test
    public void testParsingContext() {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(null, filter, true, true);
        JsonStreamContext context = delegate.getParsingContext();
        assertNotNull(context);
    }
}
