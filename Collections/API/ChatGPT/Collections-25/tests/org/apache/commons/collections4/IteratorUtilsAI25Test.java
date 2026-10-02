package org.apache.commons.collections4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IteratorUtilsAI25Test {

    @Test
    public void testEmptyIteratorHasNoElementsAndCanBeReset() {
        ResettableIterator<String> iterator = IteratorUtils.emptyIterator();

        Assert.assertFalse(iterator.hasNext());
        iterator.reset();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testSingletonIteratorReturnsValueAndCanBeReset() {
        ResettableIterator<String> iterator = IteratorUtils.singletonIterator("only");

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("only", iterator.next());
        Assert.assertFalse(iterator.hasNext());

        iterator.reset();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("only", iterator.next());
    }

    @Test
    public void testFindReturnsFirstMatchingElementAndConsumesThroughMatch() {
        List<Integer> values = Arrays.asList(1, 4, 6, 8);
        Iterator<Integer> iterator = values.iterator();

        Integer result = IteratorUtils.find(iterator, new Predicate<Integer>() {
            public boolean evaluate(Integer object) {
                return object.intValue() % 2 == 0;
            }
        });

        Assert.assertEquals(Integer.valueOf(4), result);
        Assert.assertEquals(Integer.valueOf(6), iterator.next());
    }

    @Test
    public void testMatchesAnyAndMatchesAllHandleNullAndEmptyIterators() {
        Predicate<Integer> positive = new Predicate<Integer>() {
            public boolean evaluate(Integer object) {
                return object.intValue() > 0;
            }
        };

        Assert.assertFalse(IteratorUtils.matchesAny(null, positive));
        Assert.assertTrue(IteratorUtils.matchesAll(null, positive));
        Assert.assertFalse(IteratorUtils.matchesAny(Arrays.<Integer>asList().iterator(), positive));
        Assert.assertTrue(IteratorUtils.matchesAll(Arrays.<Integer>asList().iterator(), positive));
        Assert.assertFalse(IteratorUtils.matchesAll(Arrays.asList(2, -1, 3).iterator(), positive));
    }

    @Test
    public void testContainsSupportsNullAndConsumesUntilMatch() {
        Iterator<String> iterator = Arrays.asList("first", null, "last").iterator();

        Assert.assertTrue(IteratorUtils.contains(iterator, null));
        Assert.assertEquals("last", iterator.next());
        Assert.assertFalse(IteratorUtils.contains(null, "anything"));
    }

    @Test
    public void testGetReturnsIndexedElementAndLeavesFollowingElement() {
        Iterator<String> iterator = Arrays.asList("zero", "one", "two", "three").iterator();

        Assert.assertEquals("two", IteratorUtils.get(iterator, 2));
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("three", iterator.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRejectsNegativeIndex() {
        IteratorUtils.get(Arrays.asList("value").iterator(), -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetThrowsWhenIndexExceedsIteratorContents() {
        IteratorUtils.get(Arrays.asList("a", "b").iterator(), 2);
    }

    @Test
    public void testSizeAndIsEmptyReflectIteratorState() {
        Iterator<Integer> iterator = Arrays.asList(10, 20, 30).iterator();

        Assert.assertFalse(IteratorUtils.isEmpty(iterator));
        Assert.assertEquals(3, IteratorUtils.size(iterator));
        Assert.assertTrue(IteratorUtils.isEmpty(iterator));
        Assert.assertEquals(0, IteratorUtils.size(null));
        Assert.assertTrue(IteratorUtils.isEmpty(null));
    }

    @Test
    public void testToStringUsesDefaultAndCustomFormatting() {
        Assert.assertEquals("[alpha, null, 3]",
                IteratorUtils.toString(Arrays.<Object>asList("alpha", null, Integer.valueOf(3)).iterator()));

        String formatted = IteratorUtils.toString(Arrays.asList(2, 5).iterator(),
                new Transformer<Integer, String>() {
                    public String transform(Integer input) {
                        return "#" + (input.intValue() * input.intValue());
                    }
                }, "|", "<", ">");

        Assert.assertEquals("<#4|#25>", formatted);
        Assert.assertEquals("()", IteratorUtils.toString(null,
                new Transformer<Object, String>() {
                    public String transform(Object input) {
                        return String.valueOf(input);
                    }
                }, ",", "(", ")"));
    }

    @Test(expected = NullPointerException.class)
    public void testToStringRejectsNullTransformer() {
        IteratorUtils.toString(Arrays.asList("x").iterator(), null);
    }
}
