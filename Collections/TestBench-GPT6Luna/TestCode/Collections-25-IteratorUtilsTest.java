package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.iterators.ArrayIterator;
import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.EnumerationIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.iterators.ObjectGraphIterator;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.apache.commons.collections4.iterators.SingletonIterator;
import org.apache.commons.collections4.iterators.SingletonListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsTest {
    @Test
    public void testToListConsumesIteratorInOrder() throws Exception {
        List<String> result = IteratorUtils.toList(IteratorUtils.arrayIterator(new String[] {"a", "b"}));
        assertEquals(2, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
    }

    @Test
    public void testToArrayConsumesIterator() throws Exception {
        Object[] result = IteratorUtils.toArray(IteratorUtils.arrayIterator(new String[] {"x", "y"}));
        assertEquals(2, result.length);
        assertEquals("x", result[0]);
        assertEquals("y", result[1]);
    }

    @Test
    public void testGetFirstElement() throws Exception {
        assertEquals("a", IteratorUtils.get(IteratorUtils.arrayIterator(new String[] {"a", "b"}), 0));
    }

    @Test
    public void testGetLastElementAtIndexBoundary() throws Exception {
        assertEquals("b", IteratorUtils.get(IteratorUtils.arrayIterator(new String[] {"a", "b"}), 1));
    }

    @Test
    public void testGetPastEndThrows() throws Exception {
        try {
            IteratorUtils.get(IteratorUtils.arrayIterator(new String[] {"a"}), 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testGetNegativeIndexThrows() throws Exception {
        try {
            IteratorUtils.get(IteratorUtils.arrayIterator(new String[] {"a"}), -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testSizeConsumesAllElements() throws Exception {
        assertEquals(3, IteratorUtils.size(IteratorUtils.arrayIterator(new String[] {"a", "b", "c"})));
    }

    @Test
    public void testSizeNullIteratorIsZero() throws Exception {
        assertEquals(0, IteratorUtils.size(null));
    }

    @Test
    public void testContainsFindsAndRejectsValues() throws Exception {
        assertTrue(IteratorUtils.contains(IteratorUtils.arrayIterator(new String[] {"a", "b"}), "b"));
        assertFalse(IteratorUtils.contains(IteratorUtils.arrayIterator(new String[] {"a", "b"}), "c"));
    }

    @Test
    public void testFindReturnsFirstMatch() throws Exception {
        Predicate<Integer> even = new Predicate<Integer>() {
            public boolean evaluate(Integer value) {
                return value % 2 == 0;
            }
        };
        assertEquals(Integer.valueOf(4),
                IteratorUtils.find(IteratorUtils.arrayIterator(new Integer[] {1, 4, 6}), even));
    }

    @Test
    public void testMatchesAnyAndAll() throws Exception {
        Predicate<Integer> positive = new Predicate<Integer>() {
            public boolean evaluate(Integer value) {
                return value > 0;
            }
        };
        assertTrue(IteratorUtils.matchesAny(
                IteratorUtils.arrayIterator(new Integer[] {-1, 2}), positive));
        assertFalse(IteratorUtils.matchesAll(
                IteratorUtils.arrayIterator(new Integer[] {2, -1}), positive));
    }

    @Test
    public void testMatchesAllOnEmptyIterator() throws Exception {
        Predicate<String> alwaysFalse = new Predicate<String>() {
            public boolean evaluate(String value) {
                return false;
            }
        };
        assertTrue(IteratorUtils.matchesAll(IteratorUtils.<String>emptyIterator(), alwaysFalse));
    }

    @Test
    public void testIsEmptyForNullAndNonemptyIterator() throws Exception {
        assertTrue(IteratorUtils.isEmpty(null));
        assertFalse(IteratorUtils.isEmpty(IteratorUtils.arrayIterator(new String[] {"a"})));
    }

    @Test
    public void testToStringDefaultFormatting() throws Exception {
        assertEquals("[a, b]", IteratorUtils.toString(
                IteratorUtils.arrayIterator(new String[] {"a", "b"})));
    }

    @Test
    public void testToStringEmptyIterator() throws Exception {
        assertEquals("[]", IteratorUtils.toString(IteratorUtils.<String>emptyIterator()));
    }

    @Test
    public void testGetIteratorFromArray() throws Exception {
        Iterator<?> iterator = IteratorUtils.getIterator(new String[] {"a", "b"});
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testGetIteratorFromList() throws Exception {
        List<String> values = new ArrayList<String>();
        values.add("one");
        values.add("two");
        Iterator<?> iterator = IteratorUtils.getIterator(values);
        assertEquals("one", iterator.next());
        assertEquals("two", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testChainedIteratorKeepsSourceOrder() throws Exception {
        Iterator<String> iterator = IteratorUtils.chainedIterator(
                IteratorUtils.arrayIterator(new String[] {"a"}),
                IteratorUtils.arrayIterator(new String[] {"b", "c"}));
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCollatedIteratorMergesSortedInputs() throws Exception {
        Iterator<Integer> iterator = IteratorUtils.collatedIterator(null,
                IteratorUtils.arrayIterator(new Integer[] {1, 4}),
                IteratorUtils.arrayIterator(new Integer[] {2, 3}));
        assertEquals(Integer.valueOf(1), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testFilteredIteratorKeepsMatchingElements() throws Exception {
        Predicate<Integer> even = new Predicate<Integer>() {
            public boolean evaluate(Integer value) {
                return value % 2 == 0;
            }
        };
        Iterator<Integer> iterator = IteratorUtils.filteredIterator(
                IteratorUtils.arrayIterator(new Integer[] {1, 2, 3, 4}), even);
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testTransformedIteratorTransformsOnRead() throws Exception {
        Transformer<Integer, String> transform = new Transformer<Integer, String>() {
            public String transform(Integer value) {
                return String.valueOf(value * 2);
            }
        };
        Iterator<String> iterator = IteratorUtils.transformedIterator(
                IteratorUtils.arrayIterator(new Integer[] {3, 5}), transform);
        assertEquals("6", iterator.next());
        assertEquals("10", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSingletonIteratorHasOneValue() throws Exception {
        Iterator<String> iterator = IteratorUtils.singletonIterator("only");
        assertTrue(iterator.hasNext());
        assertEquals("only", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testZippingIteratorAlternatesInputs() throws Exception {
        Iterator<String> iterator = IteratorUtils.zippingIterator(
                IteratorUtils.arrayIterator(new String[] {"a", "c"}),
                IteratorUtils.arrayIterator(new String[] {"b", "d"}));
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
        assertEquals("d", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testEmptyListIteratorHasNoElements() throws Exception {
        ListIterator<String> iterator = IteratorUtils.emptyListIterator();
        assertFalse(iterator.hasNext());
        assertFalse(iterator.hasPrevious());
        assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void testEmptyOrderedIteratorHasNoElements() throws Exception {
        assertFalse(IteratorUtils.emptyOrderedIterator().hasNext());
    }

    @Test
    public void testEmptyMapIteratorsHaveNoKeys() throws Exception {
        assertFalse(IteratorUtils.<String, String>emptyMapIterator().hasNext());
        assertFalse(IteratorUtils.<String, String>emptyOrderedMapIterator().hasNext());
    }

    @Test
    public void testSingletonListIteratorCanMoveBothWays() throws Exception {
        ListIterator<String> iterator = IteratorUtils.singletonListIterator("v");
        assertEquals(-1, iterator.nextIndex());
        assertEquals("v", iterator.next());
        assertEquals(0, iterator.nextIndex());
        assertEquals("v", iterator.previous());
        assertEquals(-1, iterator.previousIndex());
    }

    @Test
    public void testArrayListIteratorTraversesFromStart() throws Exception {
        ListIterator<String> iterator = IteratorUtils.arrayListIterator(new String[] {"a", "b"});
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
        assertEquals("b", iterator.previous());
    }

    @Test
    public void testBoundedIteratorHonorsZeroAndOneMaximum() throws Exception {
        assertFalse(IteratorUtils.boundedIterator(
                IteratorUtils.arrayIterator(new String[] {"x"}), 0).hasNext());
        BoundedIterator<String> iterator =
                IteratorUtils.boundedIterator(IteratorUtils.arrayIterator(new String[] {"x", "y"}), 1);
        assertTrue(iterator.hasNext());
        assertEquals("x", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testUnmodifiableIteratorReadsElement() throws Exception {
        Iterator<String> iterator =
                IteratorUtils.unmodifiableIterator(IteratorUtils.arrayIterator(new String[] {"v"}));
        assertEquals("v", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testUnmodifiableListIteratorReadsWithoutMutation() throws Exception {
        ListIterator<String> iterator =
                IteratorUtils.unmodifiableListIterator(IteratorUtils.arrayListIterator(new String[] {"v"}));
        assertEquals("v", iterator.next());
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testObjectGraphIteratorYieldsRootWithoutTransformer() throws Exception {
        Iterator<String> iterator = IteratorUtils.objectGraphIterator("root", null);
        assertEquals("root", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testFilteredListIteratorReturnsMatchingValue() throws Exception {
        Predicate<Integer> positive = new Predicate<Integer>() {
            public boolean evaluate(Integer value) {
                return value > 0;
            }
        };
        ListIterator<Integer> iterator = IteratorUtils.filteredListIterator(
                IteratorUtils.arrayListIterator(new Integer[] {-1, 2}), positive);
        assertEquals(Integer.valueOf(2), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testLoopingIteratorRepeatsValues() throws Exception {
        List<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        Iterator<String> iterator = IteratorUtils.loopingIterator(values);
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("a", iterator.next());
    }

    @Test
    public void testLoopingListIteratorRepeatsAndNavigatesBack() throws Exception {
        List<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        ListIterator<String> iterator = IteratorUtils.loopingListIterator(values);
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("a", iterator.next());
        assertEquals("a", iterator.previous());
    }

    @Test
    public void testNodeListIteratorRejectsNull() throws Exception {
        try {
            IteratorUtils.nodeListIterator((NodeList) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        assertEquals(0, IteratorUtils.size(IteratorUtils.<String>emptyIterator()));
    }

    @Test
    public void testPeekingIteratorReturnsNextElement() throws Exception {
        Iterator<String> iterator = IteratorUtils.peekingIterator(
                IteratorUtils.arrayIterator(new String[] {"a", "b"}));
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testPushbackIteratorReadsElement() throws Exception {
        Iterator<String> iterator = IteratorUtils.pushbackIterator(
                IteratorUtils.arrayIterator(new String[] {"a"}));
        assertEquals("a", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSkippingIteratorSkipsRequestedPrefix() throws Exception {
        Iterator<String> iterator =
                IteratorUtils.skippingIterator(IteratorUtils.arrayIterator(new String[] {"a", "b", "c"}), 2);
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testEnumerationViewsPreserveElements() throws Exception {
        Enumeration<String> enumeration =
                IteratorUtils.asEnumeration(IteratorUtils.arrayIterator(new String[] {"a", "b"}));
        Iterator<String> iterator = IteratorUtils.asIterator(enumeration);
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterableViewsIterateElements() throws Exception {
        Iterable<String> single =
                IteratorUtils.asIterable(IteratorUtils.arrayIterator(new String[] {"a", "b"}));
        Iterator<String> it = single.iterator();
        assertEquals("a", it.next());
        assertEquals("b", it.next());

        Iterable<String> multiple =
                IteratorUtils.asMultipleUseIterable(IteratorUtils.arrayIterator(new String[] {"c"}));
        assertEquals("c", multiple.iterator().next());
    }

    @Test
    public void testToListIteratorNavigatesCachedValues() throws Exception {
        ListIterator<String> iterator =
                IteratorUtils.toListIterator(IteratorUtils.arrayIterator(new String[] {"a", "b"}));
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("b", iterator.previous());
    }

    @Test
    public void testApplyExecutesClosureForEachElement() throws Exception {
        final List<Integer> seen = new ArrayList<Integer>();
        Closure<Integer> closure = new Closure<Integer>() {
            public void execute(Integer value) {
                seen.add(value);
            }
        };
        IteratorUtils.apply(IteratorUtils.arrayIterator(new Integer[] {1, 2}), closure);
        assertEquals(2, seen.size());
        assertEquals(Integer.valueOf(1), seen.get(0));
        assertEquals(Integer.valueOf(2), seen.get(1));
    }
}
