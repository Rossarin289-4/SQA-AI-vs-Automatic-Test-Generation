package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class CollectionDeserializerTest {
    @Test
    public void testAccumulatorAddsWithoutPendingReference() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.add("a");
        assertEquals(Arrays.<Object>asList("a"), result);
    }

    @Test
    public void testAccumulatorAddsAfterPendingReference() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        UnresolvedForwardReference reference = new UnresolvedForwardReference("pending");
        accumulator.handleUnresolvedReference(reference);
        accumulator.add("later");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testResolveFirstReferencePreservesOrder() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        UnresolvedForwardReference reference = new UnresolvedForwardReference("pending");
        accumulator.handleUnresolvedReference(reference);
        accumulator.add("later");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testResolveSecondReferenceKeepsEarlierPendingSegment() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("first"));
        accumulator.add("middle");
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("second"));
        accumulator.add("last");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testResolveUnknownReferenceThrows() throws Exception {
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, new ArrayList<Object>());
        try {
            accumulator.resolveForwardReference("missing", "value");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testResolveFirstOfTwoPendingReferences() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("first"));
        accumulator.add("between");
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("second"));
        accumulator.add("after");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAccumulatorCanResolveRemainingPendingReference() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("first"));
        accumulator.add("between");
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("second"));
        accumulator.add("after");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAccumulatorAcceptsNullValue() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.add(null);
        assertEquals(1, result.size());
        assertNull(result.get(0));
    }

    @Test
    public void testAccumulatorResolutionWithEmptyFollowingSegment() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAccumulatorAddsAfterResolution() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        accumulator.add("after");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAccumulatorResolutionUsesEqualIdentifier() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAccumulatorCanResolvePendingReferenceAfterAddingValues() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.add("before");
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        accumulator.add("after");
        assertEquals(Arrays.<Object>asList("before"), result);
    }

    @Test
    public void testIsCachableWhenDeserializersAreNull() throws Exception {
        JavaType type = new ObjectMapper().getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, null, null, null);
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testContentTypeFromCollectionType() throws Exception {
        JavaType type = new ObjectMapper().getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, null, null, null);
        assertEquals(type.getContentType(), deserializer.getContentType());
    }

    @Test
    public void testContentDeserializerIsConfiguredDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, null, null, null);
        assertNull(deserializer.getContentDeserializer());
    }

    @Test
    public void testDeserializeWithTypeUsesTypedArrayPath() throws Exception {
        JavaType type = new ObjectMapper().getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, null, null, null);
        assertNull(deserializer.getContentDeserializer());
    }

    @Test
    public void testDeserializeEmptyArrayWithConfiguredMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, null, null, null);
        assertEquals(0, ((Collection<?>) mapper.readValue("[]", type)).size());
    }

    @Test
    public void testHandleResolvedForwardReferenceResolvesPendingItem() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        Referring referring = accumulator.handleUnresolvedReference(
                new UnresolvedForwardReference("pending"));
        assertTrue(result.isEmpty());
    }
}
