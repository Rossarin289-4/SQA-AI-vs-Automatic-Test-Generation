package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;
import org.mockito.stubbing.Answer;

public class ReturnsEmptyValuesTest {
    @Test
    public void testPrimitiveReturnValue() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(Integer.valueOf(0), answer.returnValueFor(int.class));
    }

    @Test
    public void testWrapperReturnValue() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(Integer.valueOf(0), answer.returnValueFor(Integer.class));
    }

    @Test
    public void testBooleanPrimitiveReturnValue() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(Boolean.FALSE, answer.returnValueFor(boolean.class));
    }

    @Test
    public void testIterableReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((Iterable<?>) answer.returnValueFor(Iterable.class)).spliterator().getExactSizeIfKnown());
    }

    @Test
    public void testCollectionReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((Collection<?>) answer.returnValueFor(Collection.class)).size());
    }

    @Test
    public void testSetReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((Set<?>) answer.returnValueFor(Set.class)).size());
    }

    @Test
    public void testSortedSetReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((SortedSet<?>) answer.returnValueFor(SortedSet.class)).size());
    }

    @Test
    public void testListReturnValueIsMutable() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        List<Object> values = (List<Object>) answer.returnValueFor(List.class);
        values.add("x");
        assertEquals(1, values.size());
    }

    @Test
    public void testArrayListReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((ArrayList<?>) answer.returnValueFor(ArrayList.class)).size());
    }

    @Test
    public void testLinkedListReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((LinkedList<?>) answer.returnValueFor(LinkedList.class)).size());
    }

    @Test
    public void testLinkedHashSetReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((LinkedHashSet<?>) answer.returnValueFor(LinkedHashSet.class)).size());
    }

    @Test
    public void testMapReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((Map<?, ?>) answer.returnValueFor(Map.class)).size());
    }

    @Test
    public void testHashMapReturnValueIsMutable() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        Map<Object, Object> values = (Map<Object, Object>) answer.returnValueFor(HashMap.class);
        values.put("k", "v");
        assertEquals(1, values.size());
    }

    @Test
    public void testSortedMapReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((SortedMap<?, ?>) answer.returnValueFor(SortedMap.class)).size());
    }

    @Test
    public void testTreeMapReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((TreeMap<?, ?>) answer.returnValueFor(TreeMap.class)).size());
    }

    @Test
    public void testLinkedHashMapReturnValueIsEmpty() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(0, ((LinkedHashMap<?, ?>) answer.returnValueFor(LinkedHashMap.class)).size());
    }

    @Test
    public void testUnrecognizedTypeReturnsNull() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertNull(answer.returnValueFor(String.class));
    }

    @Test
    public void testSerializableTypeReturnsNull() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertNull(answer.returnValueFor(Serializable.class));
    }
}
