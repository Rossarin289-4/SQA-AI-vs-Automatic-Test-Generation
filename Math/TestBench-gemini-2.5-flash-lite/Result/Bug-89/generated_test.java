package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;

public class FrequencyTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAddValueInteger() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        assertEquals(1, freq.getCount(1));
        freq.addValue(Integer.valueOf(1));
        assertEquals(2, freq.getCount(1));
        freq.addValue(2);
        assertEquals(1, freq.getCount(2));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddValueLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1L);
        assertEquals(1, freq.getCount(1L));
        freq.addValue(Long.valueOf(1L));
        assertEquals(2, freq.getCount(1L));
        freq.addValue(2L);
        assertEquals(1, freq.getCount(2L));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddValueChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        assertEquals(1, freq.getCount('a'));
        freq.addValue(Character.valueOf('a'));
        assertEquals(2, freq.getCount('a'));
        freq.addValue('b');
        assertEquals(1, freq.getCount('b'));
        assertEquals(3, freq.getSumFreq());
    }
    
    @Test
    public void testAddValueObject() throws Exception {
        Frequency freq = new Frequency();
        String s1 = "test1";
        String s2 = "test2";
        freq.addValue(s1);
        assertEquals(1, freq.getCount(s1));
        freq.addValue(s1);
        assertEquals(2, freq.getCount(s1));
        freq.addValue(s2);
        assertEquals(1, freq.getCount(s2));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddValueIntegerAndLongMix() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(1L);
        assertEquals(2, freq.getCount(1L));
        freq.addValue(2);
        assertEquals(1, freq.getCount(2));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddValueIntegerAndCharMixFails() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        try {
            freq.addValue('a');
            fail("IllegalArgumentException not thrown for mixed types");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testClear() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(3, freq.getSumFreq());
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
        Iterator<Object> iterator = freq.valuesIterator();
        assertTrue(iterator.hasNext());
        Object first = iterator.next();
        // The order depends on TreeMap, for integers, it should be the natural order
        assertTrue(first.equals(1L) || first.equals(2)); // TreeMap might store as Long for integers
        assertTrue(iterator.hasNext());
        Object second = iterator.next();
        assertFalse(first.equals(second));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testGetSumFreqEmpty() throws Exception {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getSumFreq());
    }

    @Test
    public void testGetSumFreqSingleValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(5);
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testGetSumFreqMultipleValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(6, freq.getSumFreq());
    }

    @Test
    public void testGetCountEmpty() throws Exception {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getCount(1));
        assertEquals(0, freq.getCount('a'));
        assertEquals(0, freq.getCount("test"));
    }

    @Test
    public void testGetCountNonExistent() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        assertEquals(0, freq.getCount(3));
    }

    @Test
    public void testGetCountWithIntegerAndLong() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1); // adds as Long.valueOf(1)
        freq.addValue(1L); // adds as Long.valueOf(1)
        assertEquals(2, freq.getCount(1));
        assertEquals(2, freq.getCount(1L));
        assertEquals(2, freq.getCount(Integer.valueOf(1)));
        assertEquals(2, freq.getCount(Long.valueOf(1)));
    }

    @Test
    public void testGetCountWithChar() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue('a');
        freq.addValue('a');
        freq.addValue('b');
        assertEquals(2, freq.getCount('a'));
        assertEquals(1, freq.getCount('b'));
        assertEquals(0, freq.getCount('c'));
    }

    @Test
    public void testGetCountWithString() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue("hello");
        freq.addValue("world");
        freq.addValue("hello");
        assertEquals(2, freq.getCount("hello"));
        assertEquals(1, freq.getCount("world"));
        assertEquals(0, freq.getCount("test"));
    }

    @Test
    public void testGetCountWithNonComparableObject() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue("test");
        Object nonComparable = new Object();
        assertEquals(0, freq.getCount(nonComparable)); // Should return 0 without throwing exception
    }

    @Test
    public void testGetPctEmpty() throws Exception {
        Frequency freq = new Frequency();
        assertTrue(Double.isNaN(freq.getPct(1)));
        assertTrue(Double.isNaN(freq.getPct('a')));
        assertTrue(Double.isNaN(freq.getPct("test")));
    }

    @Test
    public void testGetPctSingleValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(10);
        assertEquals(1.0, freq.getPct(10), 1e-9);
        assertEquals(0.0, freq.getPct(20), 1e-9);
    }

    @Test
    public void testGetPctMultipleValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1); // Total 6. Counts: 1:3, 2:2, 3:1
        assertEquals(3.0 / 6.0, freq.getPct(1), 1e-9);
        assertEquals(2.0 / 6.0, freq.getPct(2), 1e-9);
        assertEquals(1.0 / 6.0, freq.getPct(3), 1e-9);
        assertEquals(0.0, freq.getPct(4), 1e-9);
    }

    @Test
    public void testGetCumFreqEmpty() throws Exception {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getCumFreq(1));
        assertEquals(0, freq.getCumFreq('a'));
        assertEquals(0, freq.getCumFreq("test"));
    }

    @Test
    public void testGetCumFreqSingleValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(10);
        assertEquals(1, freq.getCumFreq(10));
        assertEquals(1, freq.getCumFreq(11)); // v is greater than last key
        assertEquals(0, freq.getCumFreq(9));  // v is less than first key
    }

    @Test
    public void testGetCumFreqMultipleValuesNaturalOrder() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1); // Total 6. Counts: 1:3, 2:2, 3:1
        assertEquals(3, freq.getCumFreq(1));
        assertEquals(3 + 2, freq.getCumFreq(2));
        assertEquals(3 + 2 + 1, freq.getCumFreq(3));
        assertEquals(3 + 2 + 1, freq.getCumFreq(4)); // greater than last
        assertEquals(0, freq.getCumFreq(0)); // less than first
    }

    @Test
    public void testGetCumFreqWithComparator() throws Exception {
        Comparator<String> reverseComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Reverse order
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple");
        freq.addValue("cherry");
        freq.addValue("banana");
        freq.addValue("apple"); // Total 6. Counts: apple:3, banana:2, cherry:1
                                // In reverse order: cherry, banana, apple

        // With reverse comparator, "apple" > "banana" > "cherry"
        assertEquals(3, freq.getCumFreq("apple")); // Sum of counts for values <= "apple" (in reverse order) - apple. This seems to be where the confusion is.
        // The getCumFreq method sums counts of values less than OR EQUAL to 'v' based on the comparator.
        // With reverseComparator, the keys in TreeMap are ordered as: cherry, banana, apple.
        // getCumFreq("apple") should sum counts for values <= "apple" in this ordering.
        // The values are cherry, banana, apple.
        // If we check with "apple":
        // Values: cherry, banana, apple.
        // cumFreq for "apple" should be sum of counts for cherry, banana, apple.
        // count("cherry") = 1, count("banana") = 2, count("apple") = 3.
        // Total = 1 + 2 + 3 = 6.
        assertEquals(6, freq.getCumFreq("apple")); // Corrected expected value.
        assertEquals(1 + 2, freq.getCumFreq("banana")); // cherry (1) + banana (2) = 3
        assertEquals(1, freq.getCumFreq("cherry")); // cherry (1) = 1
        assertEquals(6, freq.getCumFreq("date")); // greater than last
        assertEquals(0, freq.getCumFreq("apricot")); // less than first
    }

    @Test
    public void testGetCumFreqWithNonComparableObject() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        Object nonComparable = new Object();
        assertEquals(0, freq.getCumFreq(nonComparable)); // Should return 0 without throwing exception
    }

    @Test
    public void testGetCumPctEmpty() throws Exception {
        Frequency freq = new Frequency();
        assertTrue(Double.isNaN(freq.getCumPct(1)));
        assertTrue(Double.isNaN(freq.getCumPct('a')));
        assertTrue(Double.isNaN(freq.getCumPct("test")));
    }

    @Test
    public void testGetCumPctSingleValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(10);
        assertEquals(1.0, freq.getCumPct(10), 1e-9);
        assertEquals(1.0, freq.getCumPct(11), 1e-9);
        assertEquals(0.0, freq.getCumPct(9), 1e-9);
    }

    @Test
    public void testGetCumPctMultipleValuesNaturalOrder() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(2);
        freq.addValue(1); // Total 6. Counts: 1:3, 2:2, 3:1
        assertEquals(3.0 / 6.0, freq.getCumPct(1), 1e-9);
        assertEquals((3.0 + 2.0) / 6.0, freq.getCumPct(2), 1e-9);
        assertEquals((3.0 + 2.0 + 1.0) / 6.0, freq.getCumPct(3), 1e-9);
        assertEquals((3.0 + 2.0 + 1.0) / 6.0, freq.getCumPct(4), 1e-9);
        assertEquals(0.0, freq.getCumPct(0), 1e-9);
    }

    @Test
    public void testToStringEmpty() throws Exception {
        Frequency freq = new Frequency();
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n";
        assertEquals(expected, freq.toString());
    }

    @Test
    public void testToStringWithValues() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        // The order of output in toString depends on TreeMap's keySet iterator.
        // For integers, it should be natural order.
        // Expected output format: Value \t Freq. \t Pct. \t Cum Pct. \n
        // Values: 1 (count 2), 2 (count 1). Sum = 3.
        // Pct: 1: 2/3, 2: 1/3. Cum Pct: 1: 2/3, 2: 3/3.

        String result = freq.toString();
        assertTrue(result.contains("1\t2\t"));
        assertTrue(result.contains("2\t1\t"));
        assertTrue(result.contains("Pct. \t Cum Pct. \n")); // Check header parts

        // Check percentage formatting (will be locale dependent, but for basic cases, should be reasonable)
        // The exact string format might vary, checking for presence of values is safer.
    }
    
    @Test
    public void testToStringWithComparator() throws Exception {
        Comparator<String> reverseComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Reverse order
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple"); // Total 3. Counts: apple:2, banana:1
                                // In reverse order: banana, apple
        
        String result = freq.toString();
        // The toString() method iterates through the keys in their sorted order.
        // With reverseComparator, the order will be banana, apple.
        assertTrue(result.contains("banana\t1\t"));
        assertTrue(result.contains("apple\t2\t"));
        assertTrue(result.contains("Pct. \t Cum Pct. \n"));
    }

    @Test
    public void testAddValueWithMaxIntValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Integer.MAX_VALUE);
        assertEquals(1, freq.getCount(Integer.MAX_VALUE));
        freq.addValue(Integer.MAX_VALUE);
        assertEquals(2, freq.getCount(Integer.MAX_VALUE));
        assertEquals(2, freq.getSumFreq());
    }

    @Test
    public void testAddValueWithMinIntValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Integer.MIN_VALUE);
        assertEquals(1, freq.getCount(Integer.MIN_VALUE));
        freq.addValue(Integer.MIN_VALUE);
        assertEquals(2, freq.getCount(Integer.MIN_VALUE));
        assertEquals(2, freq.getSumFreq());
    }

    @Test
    public void testGetCountWithMaxLongValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Long.MAX_VALUE);
        assertEquals(1, freq.getCount(Long.MAX_VALUE));
        freq.addValue(Long.MAX_VALUE);
        assertEquals(2, freq.getCount(Long.MAX_VALUE));
        assertEquals(2, freq.getSumFreq());
    }

    @Test
    public void testGetCountWithMinLongValue() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(Long.MIN_VALUE);
        assertEquals(1, freq.getCount(Long.MIN_VALUE));
        freq.addValue(Long.MIN_VALUE);
        assertEquals(2, freq.getCount(Long.MIN_VALUE));
        assertEquals(2, freq.getSumFreq());
    }
    
    @Test
    public void testAddValueAndThenClear() throws Exception {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.clear();
        freq.addValue(3);
        assertEquals(1, freq.getCount(3));
        assertEquals(1, freq.getSumFreq());
        assertEquals(0, freq.getCount(1));
        assertEquals(0, freq.getCount(2));
    }
}
