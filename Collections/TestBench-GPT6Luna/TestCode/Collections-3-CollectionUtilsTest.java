package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.collection.PredicatedCollection;
import org.apache.commons.collections.collection.SynchronizedCollection;
import org.apache.commons.collections.collection.TransformedCollection;
import org.apache.commons.collections.collection.TypedCollection;
import org.apache.commons.collections.collection.UnmodifiableBoundedCollection;
import org.apache.commons.collections.collection.UnmodifiableCollection;

public class CollectionUtilsTest {
    @Test
    public void testUnionUsesMaximumCardinality() throws Exception {
        List a = new ArrayList();
        a.add("x"); a.add("x"); a.add("y");
        List b = new ArrayList();
        b.add("x"); b.add("y"); b.add("y");
        Map counts = CollectionUtils.getCardinalityMap(CollectionUtils.union(a, b));
        assertEquals(Integer.valueOf(2), counts.get("x"));
        assertEquals(Integer.valueOf(2), counts.get("y"));
    }

    @Test
    public void testIntersectionUsesMinimumCardinality() throws Exception {
        List a = new ArrayList();
        a.add("x"); a.add("x"); a.add("y");
        List b = new ArrayList();
        b.add("x"); b.add("y"); b.add("y");
        Map counts = CollectionUtils.getCardinalityMap(CollectionUtils.intersection(a, b));
        assertEquals(Integer.valueOf(1), counts.get("x"));
        assertEquals(Integer.valueOf(1), counts.get("y"));
        assertEquals(2, CollectionUtils.intersection(a, b).size());
    }

    @Test
    public void testDisjunctionUsesCardinalityDifference() throws Exception {
        List a = new ArrayList();
        a.add("x"); a.add("x"); a.add("y");
        List b = new ArrayList();
        b.add("x"); b.add("y"); b.add("y");
        Map counts = CollectionUtils.getCardinalityMap(CollectionUtils.disjunction(a, b));
        assertEquals(Integer.valueOf(1), counts.get("x"));
        assertEquals(Integer.valueOf(1), counts.get("y"));
        assertEquals(2, CollectionUtils.disjunction(a, b).size());
    }

    @Test
    public void testSubtractRemovesOneOccurrencePerInputElement() throws Exception {
        List a = new ArrayList();
        a.add("x"); a.add("x"); a.add("y");
        List b = new ArrayList();
        b.add("x"); b.add("z");
        Collection result = CollectionUtils.subtract(a, b);
        assertEquals(2, result.size());
        assertEquals(Integer.valueOf(1), CollectionUtils.getCardinalityMap(result).get("x"));
        assertEquals(Integer.valueOf(1), CollectionUtils.getCardinalityMap(result).get("y"));
    }

    @Test
    public void testContainsAnyForMatchAndNoMatch() throws Exception {
        List a = new ArrayList();
        a.add("a"); a.add("b");
        List matching = new ArrayList();
        matching.add("b");
        List disjoint = new ArrayList();
        disjoint.add("c");
        assertTrue(CollectionUtils.containsAny(a, matching));
        assertFalse(CollectionUtils.containsAny(a, disjoint));
    }

    @Test
    public void testCardinalityMapCountsDuplicatesAndNull() throws Exception {
        List values = new ArrayList();
        values.add("a"); values.add("a"); values.add(null);
        Map counts = CollectionUtils.getCardinalityMap(values);
        assertEquals(2, counts.size());
        assertEquals(Integer.valueOf(2), counts.get("a"));
        assertEquals(Integer.valueOf(1), counts.get(null));
    }

    @Test
    public void testSubCollectionComparesDuplicateCounts() throws Exception {
        List smaller = new ArrayList();
        smaller.add("a"); smaller.add("a");
        List larger = new ArrayList();
        larger.add("a"); larger.add("a"); larger.add("b");
        List tooMany = new ArrayList();
        tooMany.add("a"); tooMany.add("a"); tooMany.add("a");
        assertTrue(CollectionUtils.isSubCollection(smaller, larger));
        assertFalse(CollectionUtils.isSubCollection(tooMany, larger));
    }

    @Test
    public void testProperSubCollectionRequiresStrictlySmallerSize() throws Exception {
        List a = new ArrayList();
        a.add("a");
        List larger = new ArrayList();
        larger.add("a"); larger.add("b");
        List equal = new ArrayList();
        equal.add("a");
        assertTrue(CollectionUtils.isProperSubCollection(a, larger));
        assertFalse(CollectionUtils.isProperSubCollection(a, equal));
    }

    @Test
    public void testEqualCollectionComparesFrequenciesNotOrder() throws Exception {
        List a = new ArrayList();
        a.add("a"); a.add("b"); a.add("a");
        List reordered = new ArrayList();
        reordered.add("b"); reordered.add("a"); reordered.add("a");
        List differentCounts = new ArrayList();
        differentCounts.add("a"); differentCounts.add("b"); differentCounts.add("b");
        assertTrue(CollectionUtils.isEqualCollection(a, reordered));
        assertFalse(CollectionUtils.isEqualCollection(a, differentCounts));
    }

    @Test
    public void testCardinalityHandlesNullAndSets() throws Exception {
        List values = new ArrayList();
        values.add(null); values.add("a"); values.add(null);
        Set set = new HashSet();
        set.add("a");
        assertEquals(2, CollectionUtils.cardinality(null, values));
        assertEquals(1, CollectionUtils.cardinality("a", set));
        assertEquals(0, CollectionUtils.cardinality("z", set));
    }

    @Test
    public void testGetSupportsArrayAndRejectsNegativeIndex() throws Exception {
        Object[] values = new Object[] {"first", "last"};
        assertEquals("first", CollectionUtils.get(values, 0));
        assertEquals("last", CollectionUtils.get(values, 1));
        try {
            CollectionUtils.get(values, -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testGetIteratorAdvancesToRequestedElement() throws Exception {
        List values = new ArrayList();
        values.add("first"); values.add("middle"); values.add("last");
        Iterator iterator = values.iterator();
        assertEquals("middle", CollectionUtils.get(iterator, 1));
        assertEquals("last", iterator.next());
    }

    @Test
    public void testIndexUsesListIndexAndReturnsOriginalForNegativeIndex() throws Exception {
        List values = new ArrayList();
        values.add("first"); values.add("last");
        assertEquals("first", CollectionUtils.index(values, 0));
        assertSame(values, CollectionUtils.index(values, -1));
    }

    @Test
    public void testSizeCountsArrayAndRemainingIteratorElements() throws Exception {
        Object[] values = new Object[] {"a", "b", "c"};
        assertEquals(3, CollectionUtils.size(values));
        Iterator iterator = java.util.Arrays.asList(values).iterator();
        iterator.next();
        assertEquals(2, CollectionUtils.size(iterator));
    }

    @Test
    public void testSizeIsEmptyForArrayAndCollection() throws Exception {
        assertTrue(CollectionUtils.sizeIsEmpty(new Object[0]));
        assertFalse(CollectionUtils.sizeIsEmpty(new Object[] {"x"}));
        assertFalse(CollectionUtils.sizeIsEmpty(java.util.Arrays.asList("x")));
    }

    @Test
    public void testNullSafeEmptyChecks() throws Exception {
        assertTrue(CollectionUtils.isEmpty(null));
        assertFalse(CollectionUtils.isNotEmpty(null));
        assertTrue(CollectionUtils.isNotEmpty(java.util.Arrays.asList("x")));
    }

    @Test
    public void testReverseArraySwapsEndpointsAndPreservesMiddle() throws Exception {
        Object[] values = new Object[] {"a", "b", "c"};
        CollectionUtils.reverseArray(values);
        assertEquals("c", values[0]);
        assertEquals("b", values[1]);
        assertEquals("a", values[2]);
    }

    @Test
    public void testAddIgnoreNullAndAddAllIterator() throws Exception {
        List values = new ArrayList();
        assertFalse(CollectionUtils.addIgnoreNull(values, null));
        assertTrue(CollectionUtils.addIgnoreNull(values, "a"));
        List more = new ArrayList();
        more.add("b"); more.add("c");
        CollectionUtils.addAll(values, more.iterator());
        assertEquals(3, values.size());
        assertEquals("c", values.get(2));
    }

    @Test
    public void testRetainAllPreservesMatchingDuplicates() throws Exception {
        List values = new ArrayList();
        values.add("a"); values.add("a"); values.add("b");
        List retain = new ArrayList();
        retain.add("a");
        Collection result = CollectionUtils.retainAll(values, retain);
        assertEquals(2, result.size());
        assertEquals(Integer.valueOf(2), CollectionUtils.getCardinalityMap(result).get("a"));
        assertEquals(3, values.size());
    }

    @Test
    public void testRemoveAllRemovesEveryOccurrenceOfMatchingValues() throws Exception {
        List values = new ArrayList();
        values.add("a"); values.add("a"); values.add("b");
        List remove = new ArrayList();
        remove.add("a");
        Collection result = CollectionUtils.removeAll(values, remove);
        assertEquals(1, result.size());
        assertTrue(result.contains("b"));
        assertEquals(3, values.size());
    }

    @Test
    public void testSynchronizedAndUnmodifiableDecoratorsExposeContents() throws Exception {
        List values = new ArrayList();
        values.add("a");
        Collection synchronizedValues = CollectionUtils.synchronizedCollection(values);
        Collection unmodifiableValues = CollectionUtils.unmodifiableCollection(values);
        assertEquals(1, synchronizedValues.size());
        assertTrue(unmodifiableValues.contains("a"));
    }

    @Test
    public void testFindWithNullPredicateReturnsNull() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertNull(CollectionUtils.find(values, null));
    }

    @Test
    public void testForAllDoWithNullClosureLeavesCollectionUnchanged() throws Exception {
        List values = new ArrayList();
        values.add("a");
        CollectionUtils.forAllDo(values, null);
        assertEquals(1, values.size());
        assertEquals("a", values.get(0));
    }

    @Test
    public void testFilterWithNullPredicateLeavesCollectionUnchanged() throws Exception {
        List values = new ArrayList();
        values.add("a");
        CollectionUtils.filter(values, null);
        assertEquals(1, values.size());
        assertEquals("a", values.get(0));
    }

    @Test
    public void testTransformWithNullTransformerLeavesCollectionUnchanged() throws Exception {
        List values = new ArrayList();
        values.add("a");
        CollectionUtils.transform(values, null);
        assertEquals(1, values.size());
        assertEquals("a", values.get(0));
    }

    @Test
    public void testCountMatchesWithNullPredicateIsZero() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertEquals(0, CollectionUtils.countMatches(values, null));
    }

    @Test
    public void testExistsWithNullPredicateIsFalse() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertFalse(CollectionUtils.exists(values, null));
    }

    @Test
    public void testSelectWithNullPredicateReturnsEmptyCollection() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertEquals(0, CollectionUtils.select(values, null).size());
    }

    @Test
    public void testSelectRejectedWithNullPredicateReturnsEmptyCollection() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertEquals(0, CollectionUtils.selectRejected(values, null).size());
    }

    @Test
    public void testCollectWithNullTransformerReturnsEmptyCollection() throws Exception {
        List values = new ArrayList();
        values.add("a");
        assertEquals(0, CollectionUtils.collect(values, null).size());
    }
}
