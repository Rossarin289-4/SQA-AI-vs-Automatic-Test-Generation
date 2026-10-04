package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

public class DeserializerCacheTest {
    @Test
    public void testNewCacheStartsEmpty() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushEmptyCacheKeepsItEmpty() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullValueTypeIsRejected() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        try {
            cache.findValueDeserializer(null, null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullTypeHasNoValueDeserializer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        try {
            cache.hasValueDeserializerFor(null, null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullKeyTypeFailsAtFactoryCall() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        try {
            cache.findKeyDeserializer(null, null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCanBeCalledRepeatedly() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers();
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testRepeatedEmptyFlushDoesNotChangeCount() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        int before = cache.cachedDeserializersCount();
        cache.flushCachedDeserializers();
        assertEquals(before, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullValueTypeRejectedAgainAfterFlush() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers();
        try {
            cache.findValueDeserializer(null, null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullTypeCheckAfterFlush() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers();
        try {
            cache.hasValueDeserializerFor(null, null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFreshCachesHaveEqualCounts() throws Exception {
        DeserializerCache first = new DeserializerCache();
        DeserializerCache second = new DeserializerCache();
        assertEquals(first.cachedDeserializersCount(), second.cachedDeserializersCount());
    }

    @Test
    public void testCountRemainsZeroAfterAnotherFlush() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testNullKeyTypeDoesNotPopulateCache() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        try {
            cache.findKeyDeserializer(null, null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }
}
