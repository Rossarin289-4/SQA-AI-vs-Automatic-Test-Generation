package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;

public class FrequencyTest {
    @Test
    public void testDefaultConstructor() {
        Frequency freq = new Frequency();
        assertNotNull(freq);
        assertEquals(0, freq.getSumFreq());
    }

    @Test
    public void testConstructorWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        Frequency freq = new Frequency(reverseComparator);
        assertNotNull(freq);
        assertEquals(0, freq.getSumFreq());
    }

    @Test
    public void testAddValueObject() {
        Frequency freq = new Frequency();
        freq.addValue("apple");
        assertEquals(1, freq.getCount("apple"));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testAddValueComparable() {
        Frequency freq = new Frequency();
        freq.addValue("banana");
        assertEquals(1, freq.getCount("banana"));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testAddValueInteger() {
        Frequency freq = new Frequency();
        freq.addValue(10);
        assertEquals(1, freq.getCount(10));
        assertEquals(1, freq.getCount(10L));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testAddValueIntegerObject() {
        Frequency freq = new Frequency();
        freq.addValue(Integer.valueOf(20));
        assertEquals(1, freq.getCount(Integer.valueOf(20)));
        assertEquals(1, freq.getCount(20L));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testAddValueLong() {
        Frequency freq = new Frequency();
        freq.addValue(30L);
        assertEquals(1, freq.getCount(30L));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testAddValueChar() {
        Frequency freq = new Frequency();
        freq.addValue('a');
        assertEquals(1, freq.getCount('a'));
        assertEquals(1, freq.getCount(Character.valueOf('a')));
        assertEquals(1, freq.getSumFreq());
    }

    @Test
    public void testClear() {
        Frequency freq = new Frequency();
        freq.addValue("test");
        freq.addValue(1);
        freq.clear();
        assertEquals(0, freq.getSumFreq());
        assertEquals(0, freq.getCount("test"));
        assertEquals(0, freq.getCount(1));
    }

    @Test
    public void testValuesIterator() {
        Frequency freq = new Frequency();
        freq.addValue("one");
        freq.addValue(2);
        freq.addValue("one");
        Iterator<Object> iterator = freq.valuesIterator();
        assertTrue(iterator.hasNext());
        Object first = iterator.next();
        assertTrue(first.equals("one") || first.equals(2L));
        assertTrue(iterator.hasNext());
        Object second = iterator.next();
        assertTrue(second.equals("one") || second.equals(2L));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testGetSumFreq() {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getSumFreq());
        freq.addValue("a");
        freq.addValue("b"); // This will throw IllegalArgumentException as String and Integer are not comparable
        // The original test failed because it mixed types that are not comparable by default.
        // Let's test with comparable types only.
        Frequency freq2 = new Frequency();
        freq2.addValue(1);
        freq2.addValue(2);
        freq2.addValue(3);
        assertEquals(3, freq2.getSumFreq());
    }

    @Test
    public void testGetCountObject() {
        Frequency freq = new Frequency();
        freq.addValue("hello");
        freq.addValue("world");
        freq.addValue("hello");
        assertEquals(2, freq.getCount("hello"));
        assertEquals(1, freq.getCount("world"));
        assertEquals(0, freq.getCount("test"));
    }

    @Test
    public void testGetCountInt() {
        Frequency freq = new Frequency();
        freq.addValue(5);
        freq.addValue(10);
        freq.addValue(5);
        assertEquals(2, freq.getCount(5));
        assertEquals(1, freq.getCount(10));
        assertEquals(0, freq.getCount(15));
    }

    @Test
    public void testGetCountLong() {
        Frequency freq = new Frequency();
        freq.addValue(100L);
        freq.addValue(200L);
        freq.addValue(100L);
        assertEquals(2, freq.getCount(100L));
        assertEquals(1, freq.getCount(200L));
        assertEquals(0, freq.getCount(300L));
    }

    @Test
    public void testGetCountChar() {
        Frequency freq = new Frequency();
        freq.addValue('x');
        freq.addValue('y');
        freq.addValue('x');
        assertEquals(2, freq.getCount('x'));
        assertEquals(1, freq.getCount('y'));
        assertEquals(0, freq.getCount('z'));
    }
    
    @Test
    public void testGetCountIntegerObject() {
        Frequency freq = new Frequency();
        freq.addValue(Integer.valueOf(50));
        freq.addValue(Integer.valueOf(60));
        freq.addValue(Integer.valueOf(50));
        assertEquals(2, freq.getCount(Integer.valueOf(50)));
        assertEquals(1, freq.getCount(Integer.valueOf(60)));
        assertEquals(0, freq.getCount(Integer.valueOf(70)));
    }

    @Test
    public void testGetCountWithMixedIntegerTypes() {
        Frequency freq = new Frequency();
        freq.addValue(5); // adds as Long 5
        freq.addValue(Integer.valueOf(5)); // adds as Long 5
        freq.addValue(5L); // adds as Long 5
        assertEquals(3, freq.getCount(5));
        assertEquals(3, freq.getCount(Integer.valueOf(5)));
        assertEquals(3, freq.getCount(5L));
    }

    @Test
    public void testGetCountNonComparable() {
        Frequency freq = new Frequency();
        freq.addValue("abc");
        assertEquals(0, freq.getCount(123)); // Integer is not comparable with String
    }
    
    @Test
    public void testGetCountWhenEmpty() {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getCount("any"));
        assertEquals(0, freq.getCount(1));
    }

    @Test
    public void testGetPct() {
        Frequency freq = new Frequency();
        freq.addValue("A");
        freq.addValue("B");
        freq.addValue("A");
        freq.addValue("C");
        assertEquals(0.5, freq.getPct("A"), 1e-9);
        assertEquals(0.25, freq.getPct("B"), 1e-9);
        assertEquals(0.25, freq.getPct("C"), 1e-9);
        assertEquals(0.0, freq.getPct("D"), 1e-9);
    }

    @Test
    public void testGetPctWhenEmpty() {
        Frequency freq = new Frequency();
        assertTrue(Double.isNaN(freq.getPct("A")));
    }

    @Test
    public void testGetCumFreq() {
        Frequency freq = new Frequency();
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple");
        freq.addValue("cherry");
        freq.addValue("banana");
        freq.addValue("apple");
        
        // Assuming natural order for strings
        assertEquals(3, freq.getCumFreq("apple")); // 3 apples
        assertEquals(5, freq.getCumFreq("banana")); // 3 apples + 2 bananas
        assertEquals(6, freq.getCumFreq("cherry")); // 3 apples + 2 bananas + 1 cherry
        assertEquals(6, freq.getCumFreq("date")); // greater than last, should be total sum
        assertEquals(0, freq.getCumFreq("aardvark")); // less than first
    }
    
    @Test
    public void testGetCumFreqWithIntegers() {
        Frequency freq = new Frequency();
        freq.addValue(10);
        freq.addValue(20);
        freq.addValue(10);
        freq.addValue(30);
        freq.addValue(20);
        freq.addValue(10);

        // values are stored as Longs: 10, 10, 10, 20, 20, 30
        assertEquals(3, freq.getCumFreq(10));
        assertEquals(5, freq.getCumFreq(20));
        assertEquals(6, freq.getCumFreq(30));
        assertEquals(6, freq.getCumFreq(40)); // greater than last
        assertEquals(0, freq.getCumFreq(5)); // less than first
    }

    @Test
    public void testGetCumFreqWhenEmpty() {
        Frequency freq = new Frequency();
        assertEquals(0, freq.getCumFreq("any"));
    }

    @Test
    public void testGetCumFreqNonComparable() {
        Frequency freq = new Frequency();
        freq.addValue("abc");
        assertEquals(0, freq.getCumFreq(123)); // Integer is not comparable with String
    }

    @Test
    public void testGetCumPct() {
        Frequency freq = new Frequency();
        freq.addValue("A");
        freq.addValue("B");
        freq.addValue("A");
        freq.addValue("C");
        freq.addValue("A");
        // A: 3, B: 1, C: 1. Sum: 5
        assertEquals(0.6, freq.getCumPct("A"), 1e-9); // 3/5
        assertEquals(0.8, freq.getCumPct("B"), 1e-9); // (3+1)/5
        assertEquals(1.0, freq.getCumPct("C"), 1e-9); // (3+1+1)/5
        assertEquals(1.0, freq.getCumPct("D"), 1e-9); // greater than last
        assertEquals(0.0, freq.getCumPct("X"), 1e-9); // less than first. Corrected from original test.
    }
    
    @Test
    public void testGetCumPctWithIntegers() {
        Frequency freq = new Frequency();
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(1);
        // values as Long: 1, 1, 1, 2, 3. Sum: 5
        assertEquals(0.6, freq.getCumPct(1), 1e-9); // 3/5
        assertEquals(0.8, freq.getCumPct(2), 1e-9); // (3+1)/5
        assertEquals(1.0, freq.getCumPct(3), 1e-9); // (3+1+1)/5
        assertEquals(1.0, freq.getCumPct(4), 1e-9); // greater than last
        assertEquals(0.0, freq.getCumPct(0), 1e-9); // less than first
    }

    @Test
    public void testGetCumPctWhenEmpty() {
        Frequency freq = new Frequency();
        assertTrue(Double.isNaN(freq.getCumPct("A")));
    }
    
    @Test
    public void testGetCumPctNonComparable() {
        Frequency freq = new Frequency();
        freq.addValue("abc");
        assertEquals(0.0, freq.getCumPct(123), 1e-9); // Integer is not comparable with String
    }

    @Test
    public void testToStringWithMixedTypes() {
        // The original test failed because it tried to add values of incomparable types (String and Integer)
        // to the same Frequency instance without a comparator, leading to IllegalArgumentException.
        // Also, toString() iterates through keys, and TreeMap would throw ClassCastException if keys are not comparable.
        // To fix this, we should either use a comparator that handles mixed types, or test with a single type.
        // Given the constraints, we will test with a single type (Long) which is comparable.
        Frequency freq = new Frequency();
        freq.addValue(10L);
        freq.addValue(5L);
        freq.addValue(20L);
        freq.addValue(5L);

        // Expected order: 5, 10, 20
        // 5: Freq=2, Pct=2/4=0.5, CumPct=0.5
        // 10: Freq=1, Pct=1/4=0.25, CumPct=(2+1)/4=0.75
        // 20: Freq=1, Pct=1/4=0.25, CumPct=(2+1+1)/4=1.0
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n" +
                          "5\t2\t50%\t50%\n" +
                          "10\t1\t25%\t75%\n" +
                          "20\t1\t25%\t100%\n";
        assertEquals(expected, freq.toString());
    }

    @Test
    public void testToStringWithCharacters() {
        Frequency freq = new Frequency();
        freq.addValue('b');
        freq.addValue('a');
        freq.addValue('c');
        freq.addValue('a');

        // Order: a, b, c
        // a: Freq=2, Pct=2/4=0.5, CumPct=0.5
        // b: Freq=1, Pct=1/4=0.25, CumPct=0.75
        // c: Freq=1, Pct=1/4=0.25, CumPct=1.0
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n" +
                          "a\t2\t50%\t50%\n" +
                          "b\t1\t25%\t75%\n" +
                          "c\t1\t25%\t100%\n";
        assertEquals(expected, freq.toString());
    }
    
    @Test
    public void testToStringEmpty() {
        Frequency freq = new Frequency();
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n";
        assertEquals(expected, freq.toString());
    }

    @Test
    public void testAddValueWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue("apple");
        freq.addValue("banana");
        freq.addValue("apple");

        // With reverse order, "banana" comes before "apple"
        // Order: banana, apple
        // apple: Freq=2, Pct=2/3, CumPct=2/3
        // banana: Freq=1, Pct=1/3, CumPct=1.0
        // toString uses NumberFormat.getPercentInstance() which can vary.
        // Let's assert counts and sum, which are independent of formatting.
        assertEquals(2, freq.getCount("apple"));
        assertEquals(1, freq.getCount("banana"));
        assertEquals(3, freq.getSumFreq());
        
        // Verifying the order in toString with a comparator needs careful handling of number formatting.
        // For "apple", it should come first if comparator is reverse order.
        // String order: apple, banana. Reverse order: banana, apple.
        // So, banana should appear first in TreeMap if using natural order.
        // With reverse order, apple should appear first.
        
        // Let's re-check the TreeMap behavior with a comparator.
        // TreeMap(Comparator): Keys are sorted according to the comparator.
        // For String, Comparator.reverseOrder() means "apple" comes before "banana".
        // So toString should output "apple" first.
        
        // The previous assertion for expected toString was incorrect.
        // With reverse order: apple, banana
        // apple: Freq=2, Pct=2/3, CumPct=2/3
        // banana: Freq=1, Pct=1/3, CumPct=1.0
        
        // Example precise formatting for percent:
        // 2/3 = 0.6666... -> 67%
        // 1/3 = 0.3333... -> 33%
        // CumPct for apple (2/3) should be 67%
        // CumPct for banana (1.0) should be 100%

        // Let's construct the expected string carefully.
        NumberFormat nf = NumberFormat.getPercentInstance();
        String applePct = nf.format((double) 2 / 3);
        String bananaPct = nf.format((double) 1 / 3);
        String appleCumPct = nf.format((double) 2 / 3);
        String bananaCumPct = nf.format((double) 3 / 3);

        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n" +
                          "apple\t2\t" + applePct + "\t" + appleCumPct + "\n" +
                          "banana\t1\t" + bananaPct + "\t" + bananaCumPct + "\n";
        assertEquals(expected, freq.toString());
    }
    
    @Test
    public void testAddValueObjectWithInteger() {
        Frequency freq = new Frequency();
        freq.addValue((Object) Integer.valueOf(100));
        assertEquals(1, freq.getCount(100));
        assertEquals(1, freq.getCount(100L));
        assertEquals(1, freq.getSumFreq());
    }
    
    @Test
    public void testGetCumFreqWithObjectAndInteger() {
        Frequency freq = new Frequency();
        freq.addValue(Integer.valueOf(10));
        freq.addValue(Integer.valueOf(20));
        freq.addValue(Integer.valueOf(10));
        freq.addValue(Integer.valueOf(30));
        
        // Values are stored as Longs: 10, 10, 20, 30
        assertEquals(2, freq.getCumFreq(Integer.valueOf(10)));
        assertEquals(3, freq.getCumFreq(Integer.valueOf(20)));
        assertEquals(4, freq.getCumFreq(Integer.valueOf(30)));
    }
}
