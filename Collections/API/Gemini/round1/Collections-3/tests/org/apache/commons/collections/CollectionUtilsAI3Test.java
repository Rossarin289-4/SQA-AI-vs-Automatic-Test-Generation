package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CollectionUtilsAI3Test {

    @Test
    public void testConstructor() {
        CollectionUtils utils = new CollectionUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testUnion() {
        List a = new ArrayList();
        a.add("A");
        a.add("A");
        a.add("B");

        List b = new ArrayList();
        b.add("A");
        b.add("B");
        b.add("B");
        b.add("C");

        Collection union = CollectionUtils.union(a, b);
        Assert.assertEquals(5, union.size());

        Map card = CollectionUtils.getCardinalityMap(union);
        Assert.assertEquals(new Integer(2), card.get("A"));
        Assert.assertEquals(new Integer(2), card.get("B"));
        Assert.assertEquals(new Integer(1), card.get("C"));
    }

    @Test
    public void testIntersection() {
        List a = new ArrayList();
        a.add("A");
        a.add("A");
        a.add("B");
        a.add("C");

        List b = new ArrayList();
        b.add("A");
        b.add("B");
        b.add("B");
        b.add("D");

        Collection intersection = CollectionUtils.intersection(a, b);
        Assert.assertEquals(2, intersection.size());

        Map card = CollectionUtils.getCardinalityMap(intersection);
        Assert.assertEquals(new Integer(1), card.get("A"));
        Assert.assertEquals(new Integer(1), card.get("B"));
        Assert.assertNull(card.get("C"));
        Assert.assertNull(card.get("D"));
    }

    @Test
    public void testDisjunction() {
        List a = new ArrayList();
        a.add("A");
        a.add("A");
        a.add("B");
        a.add("C");

        List b = new ArrayList();
        b.add("A");
        b.add("B");
        b.add("B");
        b.add("D");

        Collection disjunction = CollectionUtils.disjunction(a, b);
        Assert.assertEquals(4, disjunction.size());

        Map card = CollectionUtils.getCardinalityMap(disjunction);
        Assert.assertEquals(new Integer(1), card.get("A"));
        Assert.assertEquals(new Integer(1), card.get("B"));
        Assert.assertEquals(new Integer(1), card.get("C"));
        Assert.assertEquals(new Integer(1), card.get("D"));
    }

    @Test
    public void testSubtract() {
        List a = new ArrayList();
        a.add("A");
        a.add("A");
        a.add("B");
        a.add("C");

        List b = new ArrayList();
        b.add("A");
        b.add("B");

        Collection diff = CollectionUtils.subtract(a, b);
        Assert.assertEquals(2, diff.size());

        Map card = CollectionUtils.getCardinalityMap(diff);
        Assert.assertEquals(new Integer(1), card.get("A"));
        Assert.assertEquals(new Integer(1), card.get("C"));
        Assert.assertNull(card.get("B"));
    }

    @Test
    public void testContainsAny() {
        List smaller = new ArrayList();
        smaller.add("X");

        List larger = new ArrayList();
        larger.add("Y");
        larger.add("Z");

        Assert.assertFalse(CollectionUtils.containsAny(smaller, larger));
        Assert.assertFalse(CollectionUtils.containsAny(larger, smaller));

        larger.add("X");
        Assert.assertTrue(CollectionUtils.containsAny(smaller, larger));
        Assert.assertTrue(CollectionUtils.containsAny(larger, smaller));
    }

    @Test
    public void testIsSubCollection() {
        List sub = new ArrayList();
        sub.add("A");
        sub.add("B");

        List sup = new ArrayList();
        sup.add("A");
        sup.add("A");
        sup.add("B");

        Assert.assertTrue(CollectionUtils.isSubCollection(sub, sup));
        Assert.assertFalse(CollectionUtils.isSubCollection(sup, sub));
    }

    @Test
    public void testIsEmptyAndIsNotEmpty() {
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertFalse(CollectionUtils.isNotEmpty(null));

        List list = new ArrayList();
        Assert.assertTrue(CollectionUtils.isEmpty(list));
        Assert.assertFalse(CollectionUtils.isNotEmpty(list));

        list.add("item");
        Assert.assertFalse(CollectionUtils.isEmpty(list));
        Assert.assertTrue(CollectionUtils.isNotEmpty(list));
    }

    @Test
    public void testReverseArray() {
        Object[] even = new Object[]{"1", "2", "3", "4"};
        CollectionUtils.reverseArray(even);
        Assert.assertArrayEquals(new Object[]{"4", "3", "2", "1"}, even);

        Object[] odd = new Object[]{"A", "B", "C"};
        CollectionUtils.reverseArray(odd);
        Assert.assertArrayEquals(new Object[]{"C", "B", "A"}, odd);

        Object[] empty = new Object[0];
        CollectionUtils.reverseArray(empty);
        Assert.assertEquals(0, empty.length);
    }

    @Test
    public void testIsFullAndMaxSize() {
        List list = new ArrayList();
        Assert.assertFalse(CollectionUtils.isFull(list));
        Assert.assertEquals(-1, CollectionUtils.maxSize(list));

        try {
            CollectionUtils.isFull(null);
            Assert.fail("Expected NullPointerException for isFull(null)");
        } catch (NullPointerException e) {
            // expected
        }

        try {
            CollectionUtils.maxSize(null);
            Assert.fail("Expected NullPointerException for maxSize(null)");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testPredicatedAndTransformedCollection() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return object != null && ((String) object).startsWith("A");
            }
        };

        Collection predColl = CollectionUtils.predicatedCollection(new ArrayList(), predicate);
        predColl.add("Apple");
        Assert.assertEquals(1, predColl.size());

        try {
            predColl.add("Banana");
            Assert.fail("Expected IllegalArgumentException when predicate fails");
        } catch (IllegalArgumentException e) {
            // expected
        }

        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                return input == null ? null : input.toString().toUpperCase();
            }
        };

        Collection transColl = CollectionUtils.transformedCollection(new ArrayList(), transformer);
        transColl.add("lower");
        Assert.assertTrue(transColl.contains("LOWER"));
    }
}
