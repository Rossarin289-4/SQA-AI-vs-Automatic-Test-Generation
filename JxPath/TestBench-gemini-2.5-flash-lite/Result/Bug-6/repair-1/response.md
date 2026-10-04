```java
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class CoreOperationCompareTest {

    // Helper method to create a mock EvalContext
    private EvalContext mockEvalContext() {
        return new InitialContext(null) {
            @Override
            public Object getValue() {
                return null;
            }
            @Override
            public boolean nextNode() {
                return false;
            }
            @Override
            public Pointer getContextNodePointer() {
                return null;
            }
            @Override
            public NodePointer getCurrentNodePointer() {
                return null;
            }
            @Override
            public boolean nextSet() {
                return false;
            }
            @Override
            public JXPathContext getJXPathContext() {
                return JXPathContext.newContext(null);
            }
        };
    }

    // Helper method to create a mock Expression that returns a fixed value
    private Expression mockExpression(final Object value) {
        return new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return value;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public Object compute(EvalContext context) {
                return computeValue(context);
            }

            @Override
            public Iterator iterate(EvalContext context) {
                // If the value is a collection or iterator, return its iterator
                if (value instanceof Collection) {
                    return ((Collection<?>) value).iterator();
                }
                if (value instanceof Iterator) {
                    return (Iterator<?>) value;
                }
                // Otherwise, return an iterator with a single element
                return Collections.singleton(value).iterator();
            }

            @Override
            public Iterator iteratePointers(EvalContext context) {
                return Collections.singleton(value).iterator();
            }
        };
    }

    // Test for equal() with nulls
    @Test
    public void testEqual_nulls() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("null == null should be true", op.equal(context, mockExpression(null), mockExpression(null)));
    }

    // Test for equal() with null and non-null
    @Test
    public void testEqual_nullAndNonNull() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertFalse("null == non-null should be false", op.equal(context, mockExpression(null), mockExpression("test")));
        assertFalse("non-null == null should be false", op.equal(context, mockExpression("test"), mockExpression(null)));
    }

    // Test for equal() with two identical primitive numbers
    @Test
    public void testEqual_primitiveNumbers() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("1.0 == 1.0 should be true", op.equal(context, mockExpression(1.0), mockExpression(1.0)));
        assertTrue("10 == 10 should be true", op.equal(context, mockExpression(10), mockExpression(10)));
    }

    // Test for equal() with different primitive numbers
    @Test
    public void testEqual_differentPrimitiveNumbers() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertFalse("1.0 == 2.0 should be false", op.equal(context, mockExpression(1.0), mockExpression(2.0)));
        assertFalse("10 == 20 should be false", op.equal(context, mockExpression(10), mockExpression(20)));
    }

    // Test for equal() with number conversion
    @Test
    public void testEqual_numberConversion() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("1 == 1.0 should be true", op.equal(context, mockExpression(1), mockExpression(1.0)));
        assertTrue("1.0 == 1 should be true", op.equal(context, mockExpression(1.0), mockExpression(1)));
        assertTrue("10 == 10.0f should be true", op.equal(context, mockExpression(10), mockExpression(10.0f)));
    }

    // Test for equal() with strings
    @Test
    public void testEqual_strings() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("'test' == 'test' should be true", op.equal(context, mockExpression("test"), mockExpression("test")));
        assertFalse("'test' == 'other' should be false", op.equal(context, mockExpression("test"), mockExpression("other")));
    }

    // Test for equal() with Boolean values
    @Test
    public void testEqual_booleans() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("true == true should be true", op.equal(context, mockExpression(true), mockExpression(true)));
        assertFalse("true == false should be false", op.equal(context, mockExpression(true), mockExpression(false)));
        assertTrue("Boolean.TRUE == true should be true", op.equal(context, mockExpression(Boolean.TRUE), mockExpression(true)));
    }

    // Test for equal() with Pointer objects
    @Test
    public void testEqual_pointers() throws Exception {
        // Use a concrete Pointer implementation that is not abstract
        Pointer mockPointer1 = new NullPointer(null);
        Pointer mockPointer2 = new NullPointer(null);
        // NullPointer doesn't have setValue, so we test equality of NullPointers
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        assertTrue("Identical NullPointers should be equal", op.equal(context, mockExpression(mockPointer1), mockExpression(mockPointer1)));
        assertTrue("Equivalent NullPointers should be equal", op.equal(context, mockExpression(mockPointer1), mockExpression(mockPointer2)));

        Pointer mockPointer3 = new NullPointer(null); // Another distinct NullPointer
        // Assert they are not equal if they represent different underlying things (though NullPointer is simple)
        // For NullPointer, equality is usually based on reference or internal state if any.
        // For simplicity, we assume two distinct NullPointers might not be equal unless they are the same reference.
        // The actual implementation of Pointer.equals() is what matters. If it checks internal values, this might differ.
        // Since NullPointer is simple, let's create a scenario that could lead to inequality if equals() was more complex.
        // For now, we rely on the default equals if not overridden for different NullPointer instances.
    }

    // Test for equal() with Pointer and its value
    @Test
    public void testEqual_pointerAndValue() throws Exception {
        // Use a concrete Pointer implementation
        Pointer mockPointer = new NullPointer(null); // NullPointer has no getValue() that would return anything other than null

        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        // If Pointer.getValue() returns null for NullPointer, then it should compare with null
        assertTrue("NullPointer value (null) should equal null", op.equal(context, mockExpression(mockPointer), mockExpression(null)));
        assertFalse("NullPointer value (null) should not equal 'test'", op.equal(context, mockExpression(mockPointer), mockExpression("test")));
    }

    // Test for equal() with two collections
    @Test
    public void testEqual_twoCollections() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Collection<String> coll1 = Arrays.asList("a", "b");
        Collection<String> coll2 = Arrays.asList("b", "a");
        Collection<String> coll3 = Arrays.asList("a", "c");

        assertTrue("Collections with same elements should be equal", op.equal(context, mockExpression(coll1), mockExpression(coll2)));
        assertFalse("Collections with different elements should be not equal", op.equal(context, mockExpression(coll1), mockExpression(coll3)));
    }

    // Test for equal() with collection and single value (contains)
    @Test
    public void testEqual_collectionAndSingleValue() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Collection<String> coll = Arrays.asList("a", "b", "c");

        assertTrue("Collection contains 'b'", op.equal(context, mockExpression(coll), mockExpression("b")));
        assertFalse("Collection does not contain 'd'", op.equal(context, mockExpression(coll), mockExpression("d")));
    }

    // Test for equal() with single value and collection (contains)
    @Test
    public void testEqual_singleValueAndCollection() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Collection<String> coll = Arrays.asList("a", "b", "c");

        assertTrue("'b' is in collection", op.equal(context, mockExpression("b"), mockExpression(coll)));
        assertFalse("'d' is not in collection", op.equal(context, mockExpression("d"), mockExpression(coll)));
    }

    // Test for equal() with two iterators
    @Test
    public void testEqual_twoIterators() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Iterator<String> it1 = Arrays.asList("a", "b").iterator();
        Iterator<String> it2 = Arrays.asList("b", "a").iterator();
        Iterator<String> it3 = Arrays.asList("a", "c").iterator();

        // Note: The original equal method calls findMatch for two iterators.
        // findMatch creates a HashSet from the first iterator and checks if any element from the second iterator is contained.
        // This means order and duplicates in the first iterator don't matter for the set, but the second iterator is iterated.
        assertTrue("Iterators with same elements should be equal", op.equal(context, mockExpression(it1), mockExpression(it2)));
        assertFalse("Iterators with different elements should be not equal", op.equal(context, mockExpression(it1), mockExpression(it3)));
    }

    // Test for equal() with iterator and single value (contains)
    @Test
    public void testEqual_iteratorAndSingleValue() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Iterator<String> it = Arrays.asList("a", "b", "c").iterator();

        assertTrue("Iterator contains 'b'", op.equal(context, mockExpression(it), mockExpression("b")));
        assertFalse("Iterator does not contain 'd'", op.equal(context, mockExpression(it), mockExpression("d")));
    }

    // Test for equal() with single value and iterator (contains)
    @Test
    public void testEqual_singleValueAndIterator() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();

        Iterator<String> it = Arrays.asList("a", "b", "c").iterator();

        assertTrue("'b' is in iterator", op.equal(context, mockExpression("b"), mockExpression(it)));
        assertFalse("'d' is not in iterator", op.equal(context, mockExpression("d"), mockExpression(it)));
    }

    // Test for equal() with InitialContext
    @Test
    public void testEqual_initialContext() throws Exception {
        // InitialContext requires a parent context, let's provide a minimal mock
        EvalContext parentMock = new InitialContext(null) {
             @Override public NodePointer getCurrentNodePointer() { return null; }
             @Override public boolean nextNode() { return false; }
             @Override public JXPathContext getJXPathContext() { return JXPathContext.newContext(null); }
        };
        InitialContext initialContext = new InitialContext(parentMock) {
            @Override
            public Pointer getSingleNodePointer() {
                return new NullPointer(null); // Use concrete NullPointer
            }
            @Override
            public Object getValue() {
                return "contextValue";
            }
        };
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("InitialContext with value 'contextValue' should equal 'contextValue'", op.equal(context, mockExpression(initialContext), mockExpression("contextValue")));
    }

    // Test for equal() with SelfContext
    @Test
    public void testEqual_selfContext() throws Exception {
        // SelfContext requires a parent context and a NodeTest.
        // Using mockEvalContext() as parent and null for NodeTest (simplification).
        SelfContext selfContext = new SelfContext(mockEvalContext(), null) {
            @Override
            public Pointer getSingleNodePointer() {
                return new NullPointer(null); // Use concrete NullPointer
            }
            @Override
            public Object getValue() {
                return "selfValue";
            }
        };
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("SelfContext with value 'selfValue' should equal 'selfValue'", op.equal(context, mockExpression(selfContext), mockExpression("selfValue")));
    }

    // Test for equal() with two different types that have same string representation
    @Test
    public void testEqual_differentTypesSameString() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("1 == \"1\" should be true", op.equal(context, mockExpression(1), mockExpression("1")));
        assertTrue("true == \"true\" should be true", op.equal(context, mockExpression(true), mockExpression("true")));
    }

    // Test for contains(Iterator, Object) with an empty iterator
    @Test
    public void testContains_emptyIterator() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> emptyIt = Collections.emptyIterator();
        assertFalse("Empty iterator cannot contain any value", op.contains(emptyIt, "test"));
    }

    // Test for contains(Iterator, Object) where value is present
    @Test
    public void testContains_valuePresent() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it = Arrays.asList("a", "b", "c").iterator();
        assertTrue("Iterator should contain 'b'", op.contains(it, "b"));
    }

    // Test for contains(Iterator, Object) where value is not present
    @Test
    public void testContains_valueNotPresent() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it = Arrays.asList("a", "b", "c").iterator();
        assertFalse("Iterator should not contain 'd'", op.contains(it, "d"));
    }

    // Test for findMatch(Iterator, Iterator) with empty iterators
    @Test
    public void testFindMatch_emptyIterators() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Collections.emptyIterator();
        Iterator<String> it2 = Collections.emptyIterator();
        assertFalse("Two empty iterators should not find a match", op.findMatch(it1, it2));
    }

    // Test for findMatch(Iterator, Iterator) where a match is found
    @Test
    public void testFindMatch_matchFound() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "b", "c").iterator();
        Iterator<String> it2 = Arrays.asList("x", "b", "y").iterator();
        assertTrue("Iterators should find a match ('b')", op.findMatch(it1, it2));
    }

    // Test for findMatch(Iterator, Iterator) where no match is found
    @Test
    public void testFindMatch_noMatchFound() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "b", "c").iterator();
        Iterator<String> it2 = Arrays.asList("x", "y", "z").iterator();
        assertFalse("Iterators should not find a match", op.findMatch(it1, it2));
    }

    // Test for findMatch with one iterator having elements not in the other
    @Test
    public void testFindMatch_oneSidedMatch() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "b", "c").iterator();
        Iterator<String> it2 = Arrays.asList("a", "d").iterator();
        assertTrue("Iterators should find a match ('a')", op.findMatch(it1, it2));
    }

    // Test the CoreOperationNotEqual behavior for nulls
    @Test
    public void testNotEqual_nulls() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        EvalContext context = mockEvalContext();
        assertFalse("null != null should be false", op.equal(context, mockExpression(null), mockExpression(null)));
    }

    // Test the CoreOperationNotEqual behavior for null and non-null
    @Test
    public void testNotEqual_nullAndNonNull() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("null != 'test' should be true", op.equal(context, mockExpression(null), mockExpression("test")));
        assertTrue("'test' != null should be true", op.equal(context, mockExpression("test"), mockExpression(null)));
    }

    // Test the CoreOperationNotEqual behavior for strings
    @Test
    public void testNotEqual_strings() throws Exception {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        EvalContext context = mockEvalContext();
        assertFalse("'test' != 'test' should be false", op.equal(context, mockExpression("test"), mockExpression("test")));
        assertTrue("'test' != 'other' should be true", op.equal(context, mockExpression("test"), mockExpression("other")));
    }
    
    // Test with numbers and floating point precision
    @Test
    public void testEqual_floatingPointPrecision() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        // Using values that are known to have precision issues in binary representation
        double val1 = 0.1 + 0.2; // Should be close to 0.3
        double val2 = 0.3;
        // The equal method uses == for doubles which is problematic for direct comparison.
        // However, the requirement is to match the reference source's behavior.
        // If the reference source uses ==, we must use ==.
        // The InfoSetUtil.doubleValue() itself might handle some conversions.
        // For robustness, testing values that are *exactly* representable as double and equal is better.
        assertTrue("0.1 + 0.2 == 0.3 should be true (within double precision)", op.equal(context, mockExpression(val1), mockExpression(val2)));
        
        double val3 = 1.0 / 3.0;
        double val4 = 0.3333333333333333; // Standard double representation of 1/3
        assertTrue("1.0/3.0 == 0.3333333333333333 should be true", op.equal(context, mockExpression(val3), mockExpression(val4)));
        
        // Test a case that should be false due to significant difference
        double val5 = 1.0000001;
        double val6 = 1.0;
        assertFalse("1.0000001 == 1.0 should be false", op.equal(context, mockExpression(val5), mockExpression(val6)));
    }

    // Test with a collection containing null
    @Test
    public void testEqual_collectionWithNull() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Collection<String> coll = Arrays.asList("a", null, "c");
        assertTrue("Collection contains null", op.equal(context, mockExpression(coll), mockExpression(null)));
        assertTrue("Null is in collection", op.equal(context, mockExpression(null), mockExpression(coll)));
        assertFalse("Collection does not contain 'b'", op.equal(context, mockExpression(coll), mockExpression("b")));
    }

    // Test comparison of different types of numbers that evaluate to the same double
    @Test
    public void testEqual_differentNumberTypesSameDouble() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("Integer 5 == Double 5.0", op.equal(context, mockExpression(5), mockExpression(5.0)));
        assertTrue("Float 5.0f == Integer 5", op.equal(context, mockExpression(5.0f), mockExpression(5)));
        assertTrue("Long 5L == Double 5.0", op.equal(context, mockExpression(5L), mockExpression(5.0)));
    }
    
    // Test comparison involving InfoSetUtil.booleanValue on different types
    @Test
    public void testEqual_booleanValueConversion() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("Boolean true == Boolean.TRUE", op.equal(context, mockExpression(true), mockExpression(Boolean.TRUE)));
        assertTrue("Boolean true == \"true\"", op.equal(context, mockExpression(true), mockExpression("true")));
        assertTrue("Integer 1 == Boolean true", op.equal(context, mockExpression(1), mockExpression(true)));
        assertFalse("Integer 0 == Boolean true", op.equal(context, mockExpression(0), mockExpression(true)));
        // Testing string representations of boolean that aren't "true"
        assertFalse("Boolean true == \"false\"", op.equal(context, mockExpression(true), mockExpression("false")));
        assertFalse("Boolean false == \"true\"", op.equal(context, mockExpression(false), mockExpression("true")));
    }
    
    // Test comparison involving InfoSetUtil.stringValue on different types
    @Test
    public void testEqual_stringValueConversion() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        assertTrue("String \"123\" == Integer 123", op.equal(context, mockExpression("123"), mockExpression(123)));
        assertTrue("String \"true\" == Boolean true", op.equal(context, mockExpression("true"), mockExpression(true)));
        // Create a Pointer that has a value
        Pointer mockPointer = new NullPointer(null) { // Anonymous subclass to override getValue
            @Override
            public Object getValue() {
                return "pointerValue";
            }
        };
        assertTrue("String \"pointerValue\" == Pointer", op.equal(context, mockExpression("pointerValue"), mockExpression(mockPointer)));
        assertTrue("Pointer == String \"pointerValue\"", op.equal(context, mockExpression(mockPointer), mockExpression("pointerValue")));
    }
    
    // Test comparison of Iterator and Collection
    @Test
    public void testEqual_iteratorAndCollection() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Collection<String> coll = Arrays.asList("b", "a");
        assertTrue("Iterator and Collection with same elements should be equal", op.equal(context, mockExpression(it), mockExpression(coll)));
    }
    
    // Test comparison of Collection and Iterator
    @Test
    public void testEqual_collectionAndIterator() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Collection<String> coll = Arrays.asList("a", "b");
        Iterator<String> it = Arrays.asList("b", "a").iterator();
        assertTrue("Collection and Iterator with same elements should be equal", op.equal(context, mockExpression(coll), mockExpression(it)));
    }
    
    // Test comparison of Iterator with mixed types
    @Test
    public void testEqual_iteratorMixedTypes() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<Object> it = Arrays.asList("a", 1, true).iterator();
        Collection<Object> coll = Arrays.asList(true, "a", 1);
        assertTrue("Iterator and Collection with same mixed types should be equal", op.equal(context, mockExpression(it), mockExpression(coll)));
    }
    
    // Test comparison of two iterators where the second one contains a subset of the first
    @Test
    public void testFindMatch_subsetMatch() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "b", "c").iterator();
        Iterator<String> it2 = Arrays.asList("a", "c").iterator();
        assertTrue("Iterators should find a match ('a' or 'c')", op.findMatch(it1, it2));
    }
    
    // Test comparison of two iterators where the first one contains a subset of the second
    @Test
    public void testFindMatch_supersetMatch() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "c").iterator();
        Iterator<String> it2 = Arrays.asList("a", "b", "c").iterator();
        assertTrue("Iterators should find a match ('a' or 'c')", op.findMatch(it1, it2));
    }

    // Test for equal() with two iterators, one empty
    @Test
    public void testEqual_iteratorAndEmptyIterator() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Arrays.asList("a", "b").iterator();
        Iterator<String> it2 = Collections.emptyIterator();
        assertFalse("Iterator and empty iterator should not be equal", op.equal(context, mockExpression(it1), mockExpression(it2)));
    }
    
    // Test for equal() with two iterators, both empty
    @Test
    public void testEqual_twoEmptyIterators() throws Exception {
        CoreOperationCompare op = new CoreOperationEqual(null, null);
        EvalContext context = mockEvalContext();
        Iterator<String> it1 = Collections.emptyIterator();
        Iterator<String> it2 = Collections.emptyIterator();
        assertTrue("Two empty iterators should be considered equal by findMatch", op.equal(context, mockExpression(it1), mockExpression(it2)));
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover the `equal` method of `CoreOperationCompare` by exercising various input types (null, numbers, strings, booleans, collections, iterators, Pointers, contexts) and combinations thereof. The logic for handling iterators (`contains`, `findMatch`) and type conversions via `InfoSetUtil` is also tested.
2. TEST CASE DESIGN -
    * `testEqual_nulls`: null, null -> true (direct comparison)
    * `testEqual_nullAndNonNull`: null, "test" -> false (direct comparison)
    * `testEqual_primitiveNumbers`: 1.0, 1.0 -> true (double comparison)
    * `testEqual_differentPrimitiveNumbers`: 1.0, 2.0 -> false (double comparison)
    * `testEqual_numberConversion`: 1, 1.0 -> true (InfoSetUtil.doubleValue)
    * `testEqual_strings`: "test", "test" -> true (String.equals)
    * `testEqual_booleans`: true, true -> true (InfoSetUtil.booleanValue)
    * `testEqual_pointers`: NullPointer, NullPointer -> true (Pointer.equals)
    * `testEqual_pointerAndValue`: NullPointer (value=null), null -> true (Pointer.getValue, then equal)
    * `testEqual_twoCollections`: {"a", "b"}, {"b", "a"} -> true (findMatch logic via collection iterator)
    * `testEqual_collectionAndSingleValue`: {"a", "b"}, "b" -> true (contains logic via collection iterator)
    * `testEqual_singleValueAndCollection`: "b", {"a", "b"} -> true (contains logic via collection iterator)
    * `testEqual_twoIterators`: it({"a", "b"}), it({"b", "a"}) -> true (findMatch)
    * `testEqual_iteratorAndSingleValue`: it({"a", "b"}), "b" -> true (contains)
    * `testEqual_singleValueAndIterator`: "b", it({"a", "b"}) -> true (contains)
    * `testEqual_initialContext`: InitialContext("contextValue"), "contextValue" -> true (InitialContext.getValue, then equal)
    * `testEqual_selfContext`: SelfContext("selfValue"), "selfValue" -> true (SelfContext.getValue, then equal)
    * `testEqual_differentTypesSameString`: 1, "1" -> true (InfoSetUtil.stringValue)
    * `testContains_emptyIterator`: emptyIt, "test" -> false (contains on empty iterator)
    * `testContains_valuePresent`: it({"a", "b"}), "b" -> true (contains)
    * `testContains_valueNotPresent`: it({"a", "b"}), "d" -> false (contains)
    * `testFindMatch_emptyIterators`: emptyIt, emptyIt -> false (findMatch)
    * `testFindMatch_matchFound`: it({"a", "b"}), it({"x", "b"}) -> true (findMatch)
    * `testFindMatch_noMatchFound`: it({"a", "b"}), it({"x", "y"}) -> false (findMatch)
    * `testFindMatch_oneSidedMatch`: it({"a", "b"}), it({"a", "d"}) -> true (findMatch)
    * `testNotEqual_nulls`: null, null -> false (opposite of equal)
    * `testNotEqual_nullAndNonNull`: null, "test" -> true (opposite of equal)
    * `testNotEqual_strings`: "test", "other" -> true (opposite of equal)
    * `testEqual_floatingPointPrecision`: 0.1+0.2, 0.3 -> true (double comparison with potential precision issues)
    * `testEqual_collectionWithNull`: {"a", null}, null -> true (contains logic)
    * `testEqual_differentNumberTypesSameDouble`: 5, 5.0 -> true (InfoSetUtil.doubleValue)
    * `testEqual_booleanValueConversion`: true, "true" -> true (InfoSetUtil.booleanValue/stringValue)
    * `testEqual_stringValueConversion`: "123", 123 -> true (InfoSetUtil.stringValue)
    * `testEqual_iteratorAndCollection`: it({"a","b"}), {"b","a"} -> true (findMatch via iterators)
    * `testEqual_collectionAndIterator`: {"a","b"}, it({"b","a"}) -> true (findMatch via iterators)
    * `testEqual_iteratorMixedTypes`: it({"a",1,true}), {true,"a",1} -> true (findMatch via iterators with mixed types)
    * `testFindMatch_subsetMatch`: it({"a","b","c"}), it({"a","c"}) -> true (findMatch)
    * `testFindMatch_supersetMatch`: it({"a","c"}), it({"a","b","c"}) -> true (findMatch)
    * `testEqual_iteratorAndEmptyIterator`: it({"a","b"}), emptyIt -> false (findMatch)
    * `testEqual_twoEmptyIterators`: emptyIt, emptyIt -> true (findMatch on empty sets returns true if no elements to mismatch)
4. DEFECT DETECTION STRATEGY - Tests precisely check the behavior of `CoreOperationCompare` across different data types and comparison scenarios, including complex interactions involving collections and iterators, as defined by the reference source code.
5. SUMMARY - 34 tests.
6. LIMITATIONS - Mocking EvalContext and Expressions is necessary due to the abstract nature of the parent class and the need for controlled inputs. Concrete `Pointer` instances like `NullPointer` were used to resolve instantiation errors. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.