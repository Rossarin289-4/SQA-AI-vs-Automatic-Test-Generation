package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;
import org.mockito.stubbing.Answer;
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

public class ReturnsEmptyValuesTest {
    @Test
    public void testPrimitiveAndWrapperDefaults() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(Integer.valueOf(0), answer.returnValueFor(int.class));
        assertEquals(Integer.valueOf(0), answer.returnValueFor(Integer.class));
        assertEquals(Boolean.FALSE, answer.returnValueFor(boolean.class));
        assertEquals(Character.valueOf('\0'), answer.returnValueFor(char.class));
    }

    @Test
    public void testCollectionDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new LinkedList<Object>(), answer.returnValueFor(Collection.class));
    }

    @Test
    public void testSetDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new HashSet<Object>(), answer.returnValueFor(Set.class));
    }

    @Test
    public void testHashSetDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new HashSet<Object>(), answer.returnValueFor(HashSet.class));
    }

    @Test
    public void testSortedSetDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new TreeSet<Object>(), answer.returnValueFor(SortedSet.class));
    }

    @Test
    public void testTreeSetDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new TreeSet<Object>(), answer.returnValueFor(TreeSet.class));
    }

    @Test
    public void testLinkedHashSetDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new LinkedHashSet<Object>(), answer.returnValueFor(LinkedHashSet.class));
    }

    @Test
    public void testListDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new LinkedList<Object>(), answer.returnValueFor(List.class));
    }

    @Test
    public void testLinkedListDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new LinkedList<Object>(), answer.returnValueFor(LinkedList.class));
    }

    @Test
    public void testArrayListDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new ArrayList<Object>(), answer.returnValueFor(ArrayList.class));
    }

    @Test
    public void testMapDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new HashMap<Object, Object>(), answer.returnValueFor(Map.class));
    }

    @Test
    public void testHashMapDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new HashMap<Object, Object>(), answer.returnValueFor(HashMap.class));
    }

    @Test
    public void testSortedMapDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new TreeMap<Object, Object>(), answer.returnValueFor(SortedMap.class));
    }

    @Test
    public void testTreeMapDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new TreeMap<Object, Object>(), answer.returnValueFor(TreeMap.class));
    }

    @Test
    public void testLinkedHashMapDefault() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(new LinkedHashMap<Object, Object>(), answer.returnValueFor(LinkedHashMap.class));
    }

    @Test
    public void testUnsupportedTypeReturnsNull() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        assertEquals(null, answer.returnValueFor(String.class));
    }

    @Test
    public void testReturnedListsAreMutableAndIndependent() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        List<?> first = (List<?>) answer.returnValueFor(List.class);
        List<?> second = (List<?>) answer.returnValueFor(List.class);
        ((List<Object>) first).add("x");
        assertEquals(1, first.size());
        assertEquals(0, second.size());
    }

    @Test
    public void testReturnedMapsAreMutableAndIndependent() throws Exception {
        ReturnsEmptyValues answer = new ReturnsEmptyValues();
        Map<?, ?> first = (Map<?, ?>) answer.returnValueFor(Map.class);
        Map<?, ?> second = (Map<?, ?>) answer.returnValueFor(Map.class);
        ((Map<Object, Object>) first).put("k", "v");
        assertEquals(1, first.size());
        assertEquals(0, second.size());
    }
}
