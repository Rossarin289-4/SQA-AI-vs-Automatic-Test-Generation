package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;
import org.apache.commons.math.MathRuntimeException;
import java.util.Locale; // Added import for Locale

public class FrequencyTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyFrequency() throws Exception {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getSumFreq());
        assertEquals(Double.NaN, freq.getPct(1), 1e-9);
        assertEquals(0L, freq.getCumFreq(1));
        assertEquals(Double.NaN, freq.getCumPct(1), 1e-9);
    }

    @Test
    public void testAddValueInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(1));
        assertEquals(1.0, freq.getPct(1), 1e-9);
        assertEquals(1L, freq.getCumFreq(1));
        assertEquals(1.0, freq.getCumPct(1), 1e-9);
    }

    @Test
    public void testAddValueLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1L);
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(1L));
        assertEquals(1.0, freq.getPct(1L), 1e-9);
        assertEquals(1L, freq.getCumFreq(1L));
        assertEquals(1.0, freq.getCumPct(1L), 1e-9);
    }

    @Test
    public void testAddValueComparableLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Long.valueOf(1));
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(Long.valueOf(1)));
        assertEquals(1.0, freq.getPct(Long.valueOf(1)), 1e-9);
        assertEquals(1L, freq.getCumFreq(Long.valueOf(1)));
        assertEquals(1.0, freq.getCumPct(Long.valueOf(1)), 1e-9);
    }
    
    @Test
    public void testAddValueIntegerAndLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(1L);
        assertEquals(2, freq.getSumFreq());
        assertEquals(2, freq.getCount(1));
        assertEquals(1.0, freq.getPct(1), 1e-9);
        assertEquals(2L, freq.getCumFreq(1));
        assertEquals(1.0, freq.getCumPct(1), 1e-9);
    }

    @Test
    public void testAddValueIntegerAndComparableLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Integer.valueOf(1));
        freq.addValue(Long.valueOf(1));
        assertEquals(2, freq.getSumFreq());
        assertEquals(2, freq.getCount(Integer.valueOf(1)));
        assertEquals(1.0, freq.getPct(Integer.valueOf(1)), 1e-9);
        assertEquals(2L, freq.getCumFreq(Integer.valueOf(1)));
        assertEquals(1.0, freq.getCumPct(Integer.valueOf(1)), 1e-9);
    }

    @Test
    public void testAddValueChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount('a'));
        assertEquals(1.0, freq.getPct('a'), 1e-9);
        assertEquals(1L, freq.getCumFreq('a'));
        assertEquals(1.0, freq.getCumPct('a'), 1e-9);
    }

    @Test
    public void testAddValueCharacter() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Character.valueOf('a'));
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(Character.valueOf('a')));
        assertEquals(1.0, freq.getPct(Character.valueOf('a')), 1e-9);
        assertEquals(1L, freq.getCumFreq(Character.valueOf('a')));
        assertEquals(1.0, freq.getCumPct(Character.valueOf('a')), 1e-9);
    }

    @Test
    public void testAddValueCharAndCharacter() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue(Character.valueOf('a'));
        assertEquals(2, freq.getSumFreq());
        assertEquals(2, freq.getCount('a'));
        assertEquals(1.0, freq.getPct('a'), 1e-9);
        assertEquals(2L, freq.getCumFreq('a'));
        assertEquals(1.0, freq.getCumPct('a'), 1e-9);
    }

    @Test
    public void testAddValueMixedTypesIntegerAndChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        try {
            freq.addValue('a');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddValueMixedTypesCharAndInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        try {
            freq.addValue(1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMultipleValuesInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(3, freq.getSumFreq());
        assertEquals(2, freq.getCount(1));
        assertEquals(1, freq.getCount(2));
        assertEquals(1.0/3.0, freq.getPct(2), 1e-9);
        assertEquals(2L, freq.getCumFreq(1));
        assertEquals(3L, freq.getCumFreq(2));
        assertEquals(2.0/3.0, freq.getCumPct(2), 1e-9);
    }

    @Test
    public void testMultipleValuesChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('b');
        freq.addValue('a');
        assertEquals(3, freq.getSumFreq());
        assertEquals(2, freq.getCount('a'));
        assertEquals(1, freq.getCount('b'));
        assertEquals(1.0/3.0, freq.getPct('b'), 1e-9);
        assertEquals(2L, freq.getCumFreq('a'));
        assertEquals(3L, freq.getCumFreq('b'));
        assertEquals(2.0/3.0, freq.getCumPct('b'), 1e-9);
    }

    @Test
    public void testClear() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.clear();
        assertEquals(0, freq.getSumFreq());
        assertEquals(0, freq.getCount(1));
        assertEquals(0, freq.getCount(2));
    }

    @Test
    public void testValuesIterator() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        Iterator<Comparable<?>> it = freq.valuesIterator();
        assertTrue(it.hasNext());
        Comparable<?> val1 = it.next();
        assertTrue(val1.equals(1L) || val1.equals(2L));
        Comparable<?> val2 = it.next();
        assertTrue(val1.equals(1L) ? val2.equals(2L) : val2.equals(1L));
        assertFalse(it.hasNext());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        Frequency freq = new Frequency();
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n";
        assertEquals(expected, freq.toString());
    }
    
    @Test
    public void testToStringSingleValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n";
        assertEquals(expected, freq.toString());
    }

    @Test
    public void testToStringMultipleValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        // The order depends on the TreeMap's natural ordering for Integers/Longs
        String output = freq.toString();
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("1\t2\t67%\t67%\n"));
        assertTrue(output.contains("2\t1\t33%\t100%\n"));
    }

    @Test
    public void testToStringWithChars() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('b');
        freq.addValue('a');
        String output = freq.toString();
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("a\t2\t67%\t67%\n"));
        assertTrue(output.contains("b\t1\t33%\t100%\n"));
    }

    @Test
    public void testGetSumFreqMultipleValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue('a');
        assertEquals(4, freq.getSumFreq());
    }

    @Test
    public void testGetCountForNonExistentValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        assertEquals(0, freq.getCount(2));
        assertEquals(0, freq.getCount('b'));
    }

    @Test
    public void testGetCountForNonComparableObject() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        try {
            freq.addValue(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        // Test getCount with an object that is not comparable to previous entries
        // The current implementation does not handle this well, it relies on TreeMap's ClassCastException
        // For a direct call to getCount(Object), it casts to Comparable and may throw ClassCastException
        // However, the problem statement says to use only public API and what's visible.
        // The deprecated getCount(Object) might be problematic.
        // Let's test getCount(Comparable<?>) with a type that shouldn't be comparable.
        // The current source catches ClassCastException and returns 0, so we test for 0.
        assertEquals(0, freq.getCount(new StringBuilder("test"))); // StringBuilder is not Comparable to Long or Character
    }

    @Test
    public void testGetPctForNonExistentValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(1);
        assertEquals(0.0, freq.getPct(2), 1e-9);
    }

    @Test
    public void testGetCumFreqWithInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(2L, freq.getCumFreq(1));
        assertEquals(3L, freq.getCumFreq(2));
        assertEquals(4L, freq.getCumFreq(3));
    }
    
    @Test
    public void testGetCumFreqWithChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('c');
        freq.addValue('b');
        freq.addValue('a');
        assertEquals(2L, freq.getCumFreq('a'));
        assertEquals(3L, freq.getCumFreq('b'));
        assertEquals(4L, freq.getCumFreq('c'));
    }

    @Test
    public void testGetCumFreqLessThanFirstValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        assertEquals(0L, freq.getCumFreq(0));
        assertEquals(0L, freq.getCumFreq(0L));
    }

    @Test
    public void testGetCumFreqGreaterThanLastValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        assertEquals(2L, freq.getCumFreq(3));
        assertEquals(2L, freq.getCumFreq(4));
        assertEquals(2L, freq.getCumFreq(4L));
    }

    @Test
    public void testGetCumPctWithInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(2.0/4.0, freq.getCumPct(1), 1e-9);
        assertEquals(3.0/4.0, freq.getCumPct(2), 1e-9);
        assertEquals(4.0/4.0, freq.getCumPct(3), 1e-9);
    }

    @Test
    public void testGetCumPctWithChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('c');
        freq.addValue('b');
        freq.addValue('a');
        assertEquals(2.0/4.0, freq.getCumPct('a'), 1e-9);
        assertEquals(3.0/4.0, freq.getCumPct('b'), 1e-9);
        assertEquals(4.0/4.0, freq.getCumPct('c'), 1e-9);
    }

    @Test
    public void testGetCumPctLessThanFirstValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        assertEquals(0.0, freq.getCumPct(0), 1e-9);
        assertEquals(0.0, freq.getCumPct(0L), 1e-9);
    }

    @Test
    public void testGetCumPctGreaterThanLastValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(3);
        assertEquals(2.0/2.0, freq.getCumPct(3), 1e-9);
        assertEquals(2.0/2.0, freq.getCumPct(4), 1e-9);
        assertEquals(2.0/2.0, freq.getCumPct(4L), 1e-9);
    }
    
    @Test
    public void testAddValueWithNegativeInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(-1);
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(-1));
        assertEquals(1.0, freq.getPct(-1), 1e-9);
        assertEquals(1L, freq.getCumFreq(-1));
        assertEquals(1.0, freq.getCumPct(-1), 1e-9);
    }

    @Test
    public void testAddValueWithZeroInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(0);
        assertEquals(1, freq.getSumFreq());
        assertEquals(1, freq.getCount(0));
        assertEquals(1.0, freq.getPct(0), 1e-9);
        assertEquals(1L, freq.getCumFreq(0));
        assertEquals(1.0, freq.getCumPct(0), 1e-9);
    }

    @Test
    public void testAddValueWithLargeInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Integer.MAX_VALUE);
        freq.addValue(Integer.MAX_VALUE - 1);
        freq.addValue(Integer.MAX_VALUE);
        assertEquals(3, freq.getSumFreq());
        assertEquals(2, freq.getCount(Integer.MAX_VALUE));
        assertEquals(1, freq.getCount(Integer.MAX_VALUE - 1));
        assertEquals(2.0/3.0, freq.getPct(Integer.MAX_VALUE), 1e-9);
        assertEquals(2L, freq.getCumFreq(Integer.MAX_VALUE - 1));
        assertEquals(3L, freq.getCumFreq(Integer.MAX_VALUE));
        assertEquals(2.0/3.0, freq.getCumPct(Integer.MAX_VALUE - 1), 1e-9);
        assertEquals(3.0/3.0, freq.getCumPct(Integer.MAX_VALUE), 1e-9);
    }

    @Test
    public void testGetCountWithZero() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(0);
        freq.addValue(1);
        freq.addValue(0);
        assertEquals(2, freq.getCount(0));
        assertEquals(1, freq.getCount(1));
    }

    @Test
    public void testGetCumFreqWithZero() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(0);
        freq.addValue(1);
        freq.addValue(0);
        freq.addValue(-1);
        assertEquals(1L, freq.getCumFreq(-1));
        assertEquals(3L, freq.getCumFreq(0));
        assertEquals(4L, freq.getCumFreq(1));
    }

    @Test
    public void testGetCumPctWithZero() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(0);
        freq.addValue(1);
        freq.addValue(0);
        freq.addValue(-1);
        assertEquals(1.0/4.0, freq.getCumPct(-1), 1e-9);
        assertEquals(3.0/4.0, freq.getCumPct(0), 1e-9);
        assertEquals(4.0/4.0, freq.getCumPct(1), 1e-9);
    }
    
    @Test
    public void testComparableObjects() throws Exception {
        Frequency freq = new Frequency();
        String s1 = "apple";
        String s2 = "banana";
        freq.addValue(s1);
        freq.addValue(s2);
        freq.addValue(s1);
        assertEquals(3, freq.getSumFreq());
        assertEquals(2, freq.getCount(s1));
        assertEquals(1, freq.getCount(s2));
        assertEquals(1.0/3.0, freq.getPct(s2), 1e-9);
        assertEquals(2L, freq.getCumFreq(s1));
        assertEquals(3L, freq.getCumFreq(s2));
        assertEquals(2.0/3.0, freq.getCumPct(s2), 1e-9);
    }

    @Test
    public void testComparatorConstructor() throws Exception {
        // Fixed: added o2 parameter and corrected comparison logic
        Comparator<Comparable<?>> reverseComparator = new Comparator<Comparable<?>>() {
            @Override
            public int compare(Comparable<?> o1, Comparable<?> o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return ((Integer) o2).compareTo((Integer) o1);
                }
                // For other types, assume natural order or handle as needed.
                // If not comparable, let the natural order of Comparable handle it or throw.
                // For simplicity in this test, we'll rely on the underlying Comparable's compareTo
                // if types are not Integer, or assume they are comparable.
                // A more robust comparator would handle diverse types.
                // For this bugfix context, focus on the integer comparison for reverse.
                // If o1 and o2 are different Comparable types and not Integers,
                // the behavior of freqTable.comparator() could be complex.
                // We assume here that if not integers, they are of the same comparable type.
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    try {
                        @SuppressWarnings("unchecked")
                        Comparable<Object> c1 = (Comparable<Object>) o1;
                        return c1.compareTo(o2); // Default to natural order if not Integers
                    } catch (ClassCastException e) {
                        throw MathRuntimeException.createIllegalArgumentException("Values not comparable: {0} and {1}", o1.getClass().getName(), o2.getClass().getName());
                    }
                }
                return 0; // Should ideally not reach here with proper Comparable objects
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(2);
        
        Iterator<Comparable<?>> it = freq.valuesIterator();
        assertEquals(3, it.next()); // Should iterate in reverse order
        assertEquals(2, it.next());
        assertEquals(1, it.next());

        // Basic count and pct should be unaffected by comparator order.
        assertEquals(4, freq.getSumFreq());
        assertEquals(2, freq.getCount(2));
        assertEquals(1.0/4.0, freq.getPct(3), 1e-9);
    }

    @Test
    public void testToStringWithComparator() throws Exception {
        // Fixed: added o2 parameter and corrected comparison logic
        Comparator<Comparable<?>> reverseComparator = new Comparator<Comparable<?>>() {
            @Override
            public int compare(Comparable<?> o1, Comparable<?> o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return ((Integer) o2).compareTo((Integer) o1);
                }
                 if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    try {
                        @SuppressWarnings("unchecked")
                        Comparable<Object> c1 = (Comparable<Object>) o1;
                        return c1.compareTo(o2); // Default to natural order if not Integers
                    } catch (ClassCastException e) {
                        throw MathRuntimeException.createIllegalArgumentException("Values not comparable: {0} and {1}", o1.getClass().getName(), o2.getClass().getName());
                    }
                }
                return 0;
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1);

        // The order of iteration and thus toString depends on the comparator
        String output = freq.toString();
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("3\t1\t25%\t25%\n")); // Smallest value first with reverse comparator
        assertTrue(output.contains("2\t1\t25%\t50%\n"));
        assertTrue(output.contains("1\t2\t50%\t100%\n"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Frequency freq1 = new Frequency();
        freq1.addValue(1);
        freq1.addValue(2);
        freq1.addValue(1);

        Frequency freq2 = new Frequency();
        freq2.addValue(1);
        freq2.addValue(2);
        freq2.addValue(1);

        Frequency freq3 = new Frequency();
        freq3.addValue(1);
        freq3.addValue(3);
        freq3.addValue(1);

        Frequency freq4 = new Frequency();
        freq4.addValue(1L);
        freq4.addValue(2L);
        freq4.addValue(1L);

        assertEquals(freq1, freq2);
        assertNotEquals(freq1, freq3);
        assertEquals(freq1.hashCode(), freq2.hashCode());
        assertNotEquals(freq1.hashCode(), freq3.hashCode());
        
        // Test with Long values which should be equal to Integer values for frequency counting
        assertEquals(freq1, freq4);
        assertEquals(freq1.hashCode(), freq4.hashCode());

        Frequency freq5 = new Frequency();
        assertNotEquals(freq1, freq5);
        assertNotEquals(freq1.hashCode(), freq5.hashCode());

        Frequency freq6 = new Frequency(Comparator.reverseOrder());
        Frequency freq7 = new Frequency(Comparator.reverseOrder());
        freq6.addValue(1);
        freq7.addValue(1);
        assertEquals(freq6, freq7);
        assertEquals(freq6.hashCode(), freq7.hashCode());
        assertNotEquals(freq1, freq6); // different comparator
    }

    @Test
    public void testToStringWithNonIntegerComparable() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple");
        String output = freq.toString();
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("apple\t2\t67%\t67%\n"));
        assertTrue(output.contains("banana\t1\t33%\t100%\n"));
    }
}
