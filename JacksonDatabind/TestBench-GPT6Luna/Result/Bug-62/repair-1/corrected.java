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
        accumulator.resolveForwardReference("id", "resolved");
        assertEquals(Arrays.<Object>asList("resolved", "later"), result);
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
        accumulator.resolveForwardReference("second-id", "second-value");
        assertEquals(Arrays.<Object>asList("middle", "second-value", "last"), result);
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
        accumulator.resolveForwardReference("first-id", "first-value");
        assertEquals(Arrays.<Object>asList("first-value", "between"), result);
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
        accumulator.resolveForwardReference("first-id", "first-value");
        accumulator.resolveForwardReference("second-id", "second-value");
        assertEquals(Arrays.<Object>asList("first-value", "between", "second-value", "after"), result);
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
        accumulator.resolveForwardReference("id", "value");
        assertEquals(Arrays.<Object>asList("value"), result);
    }

    @Test
    public void testAccumulatorAddsAfterResolution() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        accumulator.resolveForwardReference("id", "value");
        accumulator.add("after");
        assertEquals(Arrays.<Object>asList("value", "after"), result);
    }

    @Test
    public void testAccumulatorResolutionUsesEqualIdentifier() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        accumulator.resolveForwardReference(new String("id"), "value");
        assertEquals(Arrays.<Object>asList("value"), result);
    }

    @Test
    public void testAccumulatorCanResolvePendingReferenceAfterAddingValues() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);
        accumulator.add("before");
        accumulator.handleUnresolvedReference(new UnresolvedForwardReference("pending"));
        accumulator.add("after");
        accumulator.resolveForwardReference("id", "resolved");
        assertEquals(Arrays.<Object>asList("before", "resolved", "after"), result);
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
        JsonDeserializer<Object> valueDeserializer =
                (JsonDeserializer<Object>) mapper.getDeserializationContext().findRootValueDeserializer(
                        mapper.constructType(String.class));
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        CollectionDeserializer deserializer =
                new CollectionDeserializer(type, valueDeserializer, null, null);
        assertSame(valueDeserializer, deserializer.getContentDeserializer());
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
        referring.handleResolvedForwardReference("id", "resolved");
        assertEquals(Arrays.<Object>asList("resolved"), result);
    }
}
