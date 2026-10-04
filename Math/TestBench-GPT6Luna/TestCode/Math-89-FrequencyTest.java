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
    public void testAddValueOverloadsShareIntegralCounts() throws Exception {
        Frequency f = new Frequency();
        f.addValue(2);
        f.addValue(Integer.valueOf(2));
        f.addValue(2L);
        f.addValue(Long.valueOf(2));
        assertEquals(4L, f.getCount(2));
        assertEquals(4L, f.getSumFreq());
    }

    @Test
    public void testAddValueObjectWithLong() throws Exception {
        Frequency f = new Frequency();
        f.addValue((Object) Long.valueOf(3));
        assertEquals(1L, f.getCount(3));
    }

    @Test
    public void testAddValueCharacter() throws Exception {
        Frequency f = new Frequency();
        f.addValue('a');
        f.addValue('b');
        f.addValue('a');
        assertEquals(2L, f.getCount('a'));
        assertEquals(1L, f.getCount('b'));
    }

    @Test
    public void testAddValueNonComparableThrows() throws Exception {
        Frequency f = new Frequency();
        try {
            f.addValue((Object) new Object());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(0L, f.getSumFreq());
    }

    @Test
    public void testAddValueIncomparableToExistingThrows() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        try {
            f.addValue('a');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1L, f.getSumFreq());
    }

    @Test
    public void testClearEmptiesFrequency() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
    }

    @Test
    public void testValuesIteratorIsOrderedAndContainsDistinctValues() throws Exception {
        Frequency f = new Frequency();
        f.addValue(3);
        f.addValue(1);
        f.addValue(3);
        Iterator it = f.valuesIterator();
        assertEquals(Long.valueOf(1), it.next());
        assertEquals(Long.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testSumFrequencyAcrossValues() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(3L, f.getSumFreq());
    }

    @Test
    public void testCountForMissingAndIntegerEquivalent() throws Exception {
        Frequency f = new Frequency();
        f.addValue(7L);
        f.addValue(7L);
        assertEquals(2L, f.getCount(Integer.valueOf(7)));
        assertEquals(0L, f.getCount(8));
    }

    @Test
    public void testCountForIncomparableValueIsZero() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        assertEquals(0L, f.getCount('a'));
    }

    @Test
    public void testPercentageForPresentAndMissingValues() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(2.0 / 3.0, f.getPct(1), 1e-12);
        assertEquals(0.0, f.getPct(3), 1e-12);
    }

    @Test
    public void testPercentageWhenEmptyIsNaN() throws Exception {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getPct(1)));
    }

    @Test
    public void testCumulativeFrequencyBelowFirstAtFirstAndBetweenValues() throws Exception {
        Frequency f = new Frequency();
        f.addValue(2);
        f.addValue(2);
        f.addValue(4);
        f.addValue(6);
        assertEquals(0L, f.getCumFreq(1));
        assertEquals(2L, f.getCumFreq(2));
        assertEquals(3L, f.getCumFreq(5));
    }

    @Test
    public void testCumulativeFrequencyAtAndAboveLast() throws Exception {
        Frequency f = new Frequency();
        f.addValue(2);
        f.addValue(5);
        f.addValue(5);
        assertEquals(3L, f.getCumFreq(5));
        assertEquals(3L, f.getCumFreq(9));
    }

    @Test
    public void testCumulativeFrequencyIncomparableIsZero() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        assertEquals(0L, f.getCumFreq('a'));
    }

    @Test
    public void testCumulativeFrequencyForCharacters() throws Exception {
        Frequency f = new Frequency();
        f.addValue('a');
        f.addValue('c');
        f.addValue('c');
        assertEquals(1L, f.getCumFreq('b'));
        assertEquals(3L, f.getCumFreq('c'));
    }

    @Test
    public void testCumulativePercentageForMiddleAndUncomparableValues() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(3);
        f.addValue(3);
        assertEquals(1.0 / 3.0, f.getCumPct(1), 1e-12);
        assertEquals(0.0, f.getCumPct('a'), 1e-12);
    }

    @Test
    public void testCumulativePercentageWhenEmptyIsNaN() throws Exception {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getCumPct(1)));
    }

    @Test
    public void testToStringHasHeaderAndRows() throws Exception {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        String text = f.toString();
        assertTrue(text.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(text.contains("1\t1\t50%\t50%\n"));
        assertTrue(text.contains("2\t1\t50%\t100%\n"));
    }

    @Test
    public void testToStringEmptyHasHeaderOnly() throws Exception {
        Frequency f = new Frequency();
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", f.toString());
    }
}
