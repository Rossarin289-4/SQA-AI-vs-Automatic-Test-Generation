package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CollectionUtilsAI3Test {

    @Test
    public void testUnionUsesMaximumCardinalityIncludingNull() {
        Collection first = Arrays.asList("a", "a", "b", null);
        Collection second = Arrays.asList("a", "c", "c", null, null);

        Collection result = CollectionUtils.union(first, second);

        Assert.assertEquals(7, result.size());
        Assert.assertEquals(2, Collections.frequency(result, "a"));
        Assert.assertEquals(1, Collections.frequency(result, "b"));
        Assert.assertEquals(2, Collections.frequency(result, "c"));
        Assert.assertEquals(2, Collections.frequency(result, null));
    }

    @Test
    public void testIntersectionAndDisjunctionRespectDuplicateCounts() {
        Collection first = Arrays.asList("x", "x", "x", "y", "z");
        Collection second = Arrays.asList("x", "x", "y", "y", "w");

        Collection intersection = CollectionUtils.intersection(first, second);
        Collection disjunction = CollectionUtils.disjunction(first, second);

        Assert.assertEquals(3, intersection.size());
        Assert.assertEquals(2, Collections.frequency(intersection, "x"));
        Assert.assertEquals(1, Collections.frequency(intersection, "y"));

        Assert.assertEquals(4, disjunction.size());
        Assert.assertEquals(1, Collections.frequency(disjunction, "x"));
        Assert.assertEquals(1, Collections.frequency(disjunction, "y"));
        Assert.assertEquals(1, Collections.frequency(disjunction, "z"));
        Assert.assertEquals(1, Collections.frequency(disjunction, "w"));
    }

    @Test
    public void testSubtractRemovesOnlyOneOccurrencePerElementInSecondCollection() {
        List first = new ArrayList(Arrays.asList("a", "b", "a", "c"));
        Collection second = Arrays.asList("a", "c", "a", "missing");

        Collection result = CollectionUtils.subtract(first, second);

        Assert.assertEquals(Arrays.asList("b"), new ArrayList(result));
        Assert.assertEquals(Arrays.asList("a", "b", "a", "c"), first);
    }

    @Test
    public void testContainsAnyForOverlappingAndDisjointCollections() {
        Assert.assertTrue(CollectionUtils.containsAny(
                Arrays.asList("one", "two", "three"),
                Arrays.asList("zero", "two")));

        Assert.assertFalse(CollectionUtils.containsAny(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four", "five")));
    }

    @Test
    public void testCardinalityMapAndSubCollectionUseElementMultiplicity() {
        Collection smaller = Arrays.asList("a", "a", "b", null);
        Collection larger = Arrays.asList("a", "a", "a", "b", null, null);
        Map counts = CollectionUtils.getCardinalityMap(smaller);

        Assert.assertEquals(Integer.valueOf(2), counts.get("a"));
        Assert.assertEquals(Integer.valueOf(1), counts.get("b"));
        Assert.assertEquals(Integer.valueOf(1), counts.get(null));
        Assert.assertTrue(CollectionUtils.isSubCollection(smaller, larger));
        Assert.assertFalse(CollectionUtils.isSubCollection(
                Arrays.asList("a", "a", "a", "a"), larger));
    }

    @Test
    public void testIsEmptyIsNotEmptyAndReverseArray() {
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertTrue(CollectionUtils.isEmpty(Collections.EMPTY_LIST));
        Assert.assertFalse(CollectionUtils.isNotEmpty(Collections.EMPTY_LIST));
        Assert.assertTrue(CollectionUtils.isNotEmpty(Arrays.asList("value")));

        Object[] values = new Object[] { "first", null, "last", Integer.valueOf(3) };
        CollectionUtils.reverseArray(values);

        Assert.assertArrayEquals(
                new Object[] { Integer.valueOf(3), "last", null, "first" }, values);
    }

    @Test
    public void testRetainAllAndRemoveAllPreserveInputCardinality() {
        Collection source = Arrays.asList("a", "b", "a", "c", "b");
        Collection selected = Arrays.asList("a", "c");

        Collection retained = CollectionUtils.retainAll(source, selected);
        Collection removed = CollectionUtils.removeAll(source, selected);

        Assert.assertEquals(Arrays.asList("a", "a", "c"), new ArrayList(retained));
        Assert.assertEquals(Arrays.asList("b", "b"), new ArrayList(removed));
        Assert.assertEquals(Arrays.asList("a", "b", "a", "c", "b"),
                new ArrayList(source));
    }

    @Test
    public void testSynchronizedAndUnmodifiableCollectionsAreBackedByOriginal() {
        List backing = new ArrayList();
        Collection synchronizedCollection = CollectionUtils.synchronizedCollection(backing);
        Collection unmodifiableCollection = CollectionUtils.unmodifiableCollection(backing);

        synchronizedCollection.add("added");
        backing.add("direct");

        Assert.assertEquals(2, backing.size());
        Assert.assertTrue(unmodifiableCollection.contains("added"));
        Assert.assertTrue(unmodifiableCollection.contains("direct"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableCollectionRejectsAdd() {
        Collection unmodifiableCollection =
                CollectionUtils.unmodifiableCollection(new ArrayList());

        unmodifiableCollection.add("not allowed");
    }

    @Test
    public void testPredicatedAndTransformedCollectionsApplyRulesOnAdd() {
        List predicateBacking = new ArrayList();
        Collection predicated = CollectionUtils.predicatedCollection(predicateBacking,
                new Predicate() {
                    public boolean evaluate(Object object) {
                        return object instanceof String
                                && ((String) object).length() > 2;
                    }
                });
        predicated.add("valid");

        List transformedBacking = new ArrayList();
        Collection transformed = CollectionUtils.transformedCollection(transformedBacking,
                new Transformer() {
                    public Object transform(Object input) {
                        return String.valueOf(input).toUpperCase();
                    }
                });
        transformed.add("value");

        Assert.assertEquals(Arrays.asList("valid"), predicateBacking);
        Assert.assertEquals(Arrays.asList("VALUE"), transformedBacking);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypedCollectionRejectsWrongType() {
        Collection typed = CollectionUtils.typedCollection(new ArrayList(), String.class);

        typed.add(Integer.valueOf(4));
    }
}
