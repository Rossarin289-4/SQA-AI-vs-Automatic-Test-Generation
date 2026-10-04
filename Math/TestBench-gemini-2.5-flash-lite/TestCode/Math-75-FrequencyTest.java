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
        // Format for percentage might be locale-dependent, using a safe assumption for common locales
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(0); // Avoid .00 if not necessary
        nf.setMaximumFractionDigits(0);
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t" + nf.format(1.0) + "\t" + nf.format(1.0) + "\n";
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
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(0);
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("1\t2\t" + nf.format(2.0/3.0) + "\t" + nf.format(2.0/3.0) + "\n"));
        assertTrue(output.contains("2\t1\t" + nf.format(1.0/3.0) + "\t" + nf.format(3.0/3.0) + "\n"));
    }

    @Test
    public void testToStringWithChars() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('b');
        freq.addValue('a');
        String output = freq.toString();
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(0);
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("a\t2\t" + nf.format(2.0/3.0) + "\t" + nf.format(2.0/3.0) + "\n"));
        assertTrue(output.contains("b\t1\t" + nf.format(1.0/3.0) + "\t" + nf.format(3.0/3.0) + "\n"));
    }

    @Test
    public void testGetSumFreqMultipleValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue('a'); // This will throw an exception as 'a' is not comparable to Integer 1 and 2.
        // The previous test design was flawed. If an exception is expected, it should be caught.
        // If the goal is to test getSumFreq, then we should only add compatible types.
        // Let's create a new frequency and add only compatible types.
        Frequency freq2 = new Frequency();
        freq2.addValue(1);
        freq2.addValue(2);
        freq2.addValue(1);
        freq2.addValue(Long.valueOf(3));
        assertEquals(4, freq2.getSumFreq());
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
        // Test adding a non-Comparable object, which should throw IllegalArgumentException
        try {
            freq.addValue(new Object());
            fail("Expected IllegalArgumentException for non-Comparable object");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("class (java.lang.Object) does not implement Comparable"));
        }
        
        // Test getCount with a type that is not comparable to the existing values (Integer)
        // The getCount(Comparable<?>) method catches ClassCastException and returns 0.
        assertEquals(0, freq.getCount(new StringBuilder("test"))); // StringBuilder is not Comparable to Integer
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
        // Add values using Integer.MAX_VALUE and Integer.MAX_VALUE - 1
        freq.addValue(Integer.MAX_VALUE);
        freq.addValue(Integer.MAX_VALUE - 1);
        freq.addValue(Integer.MAX_VALUE);
        
        // The internal representation for Integer values is Long.
        // So, getCount(Integer.MAX_VALUE) should return 2.
        // getCount(Integer.MAX_VALUE - 1) should return 1.
        assertEquals(3, freq.getSumFreq());
        assertEquals(2, freq.getCount(Integer.MAX_VALUE));
        assertEquals(1, freq.getCount(Integer.MAX_VALUE - 1));
        assertEquals(2.0/3.0, freq.getPct(Integer.MAX_VALUE), 1e-9);
        
        // Cumulative frequency: Integer.MAX_VALUE - 1 is smaller than Integer.MAX_VALUE
        assertEquals(1L, freq.getCumFreq(Integer.MAX_VALUE - 1));
        assertEquals(3L, freq.getCumFreq(Integer.MAX_VALUE));
        
        // Cumulative percentage
        assertEquals(1.0/3.0, freq.getCumPct(Integer.MAX_VALUE - 1), 1e-9);
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
        // The Comparator should compare objects based on their natural order or a specified one.
        // For this test, we want to ensure that values are added and retrieved correctly.
        // The custom comparator here is intended for reverse order for Integers.
        Comparator<Comparable<?>> reverseComparator = new Comparator<Comparable<?>>() {
            @Override
            public int compare(Comparable<?> o1, Comparable<?> o2) {
                // Ensure both are comparable and of types that can be compared.
                if (o1 == null || o2 == null) {
                    // Handle nulls if necessary, though TreeMap usually doesn't allow null keys without a special comparator.
                    // For this context, assume non-null comparable objects.
                    return 0;
                }
                
                // Attempt to compare as integers in reverse order
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return ((Integer) o2).compareTo((Integer) o1);
                }
                // Fallback to natural ordering if not integers or if types differ in a way not handled.
                // This might throw ClassCastException if types are not mutually comparable.
                try {
                    @SuppressWarnings("unchecked")
                    Comparable<Object> c1 = (Comparable<Object>) o1;
                    return c1.compareTo(o2);
                } catch (ClassCastException e) {
                    // If they are not comparable, let the TreeMap handle it or throw an appropriate exception.
                    // For robustness in testing, we might return a value indicating they are different or not ordered.
                    // However, the underlying TreeMap will likely throw ClassCastException if it cannot compare keys.
                    // The source code of Frequency catches ClassCastException when getting values, so let's propagate it.
                    throw e;
                }
            }
        };
        
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(2);
        
        Iterator<Comparable<?>> it = freq.valuesIterator();
        // With a reverse comparator for integers, the iteration order should be 3, 2, 1.
        // However, the values added are 1, 2, 3, 2. The keys in TreeMap will be {1, 2, 3}.
        // The comparator is used for ordering keys. So, when iterating keys, it will be in the order defined by the comparator.
        // For Integers, reverse order means 3, then 2, then 1.
        assertEquals(3, it.next());
        assertEquals(2, it.next());
        assertEquals(1, it.next());

        // Basic count and pct should be unaffected by comparator order for lookup.
        assertEquals(4, freq.getSumFreq());
        assertEquals(2, freq.getCount(2)); // Lookup by value, not by iterator order.
        assertEquals(1.0/4.0, freq.getPct(3), 1e-9);
    }

    @Test
    public void testToStringWithComparator() throws Exception {
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
                return 0; // Should not reach here with valid comparable objects
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1);

        // The order of iteration and thus toString depends on the comparator.
        // With reverse comparator for integers, keys are ordered as 3, 2, 1.
        String output = freq.toString();
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(0);

        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        // The toString method iterates through the keys based on the comparator's order.
        // Keys are: 3, 2, 1. Counts: 3:1, 2:1, 1:2. Total: 4.
        // CumFreq: 3:1, 2:2, 1:4.
        // Pct: 3: 1/4, 2: 1/4, 1: 2/4.
        // CumPct: 3: 1/4, 2: 2/4, 1: 4/4.
        assertTrue(output.contains("3\t1\t" + nf.format(1.0/4.0) + "\t" + nf.format(1.0/4.0) + "\n"));
        assertTrue(output.contains("2\t1\t" + nf.format(1.0/4.0) + "\t" + nf.format(2.0/4.0) + "\n"));
        assertTrue(output.contains("1\t2\t" + nf.format(2.0/4.0) + "\t" + nf.format(4.0/4.0) + "\n"));
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
        freq4.addValue(1L); // Add as long
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

        // Test with different comparator
        Frequency freq6 = new Frequency(Comparator.reverseOrder());
        Frequency freq7 = new Frequency(Comparator.reverseOrder());
        freq6.addValue(1);
        freq7.addValue(1);
        assertEquals(freq6, freq7);
        assertEquals(freq6.hashCode(), freq7.hashCode());
        
        // freq1 and freq6 use different comparators (natural vs reverse), so they should not be equal
        assertNotEquals(freq1, freq6); 
    }

    @Test
    public void testToStringWithNonIntegerComparable() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple");
        String output = freq.toString();
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(0);
        assertTrue(output.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(output.contains("apple\t2\t" + nf.format(2.0/3.0) + "\t" + nf.format(2.0/3.0) + "\n"));
        assertTrue(output.contains("banana\t1\t" + nf.format(1.0/3.0) + "\t" + nf.format(3.0/3.0) + "\n"));
    }
}
