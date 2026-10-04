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
    public void testEmptyDistribution() throws Exception {
        Frequency frequency = new Frequency();
        assertEquals(0L, frequency.getSumFreq());
        assertEquals(0L, frequency.getCount(1));
        assertTrue(Double.isNaN(frequency.getPct(1)));
        assertTrue(Double.isNaN(frequency.getCumPct(1)));
    }

    @Test
    public void testAddRepeatedValuesAndSum() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(4);
        frequency.addValue(4);
        frequency.addValue(7);
        assertEquals(3L, frequency.getSumFreq());
        assertEquals(2L, frequency.getCount(4));
        assertEquals(1L, frequency.getCount(7));
    }

    @Test
    public void testIntegerAndLongValuesShareCount() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(Integer.valueOf(5));
        frequency.addValue(Long.valueOf(5));
        frequency.addValue(5);
        assertEquals(3L, frequency.getCount(Integer.valueOf(5)));
        assertEquals(3L, frequency.getCount(5L));
    }

    @Test
    public void testIntegerMaximumAndAdjacentLong() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(Integer.MAX_VALUE);
        frequency.addValue((long) Integer.MAX_VALUE + 1L);
        assertEquals(1L, frequency.getCount(Integer.MAX_VALUE));
        assertEquals(1L, frequency.getCount((long) Integer.MAX_VALUE + 1L));
        assertEquals(2L, frequency.getSumFreq());
    }

    @Test
    public void testIntegerMinimumAndAdjacentLong() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(Integer.MIN_VALUE);
        frequency.addValue((long) Integer.MIN_VALUE - 1L);
        assertEquals(1L, frequency.getCount(Integer.MIN_VALUE));
        assertEquals(1L, frequency.getCount((long) Integer.MIN_VALUE - 1L));
        assertEquals(2L, frequency.getSumFreq());
    }

    @Test
    public void testLongRangeValues() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(Long.MAX_VALUE);
        frequency.addValue(Long.MIN_VALUE);
        assertEquals(1L, frequency.getCount(Long.MAX_VALUE));
        assertEquals(1L, frequency.getCount(Long.MIN_VALUE));
        assertEquals(2L, frequency.getSumFreq());
    }

    @Test
    public void testMissingValueHasZeroCount() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(8);
        assertEquals(0L, frequency.getCount(5));
        assertEquals(2L, frequency.getSumFreq());
    }

    @Test
    public void testPercentages() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(2);
        frequency.addValue(8);
        assertEquals(2.0 / 3.0, frequency.getPct(2), 1e-12);
        assertEquals(1.0 / 3.0, frequency.getPct(8), 1e-12);
        assertEquals(0.0, frequency.getPct(5), 1e-12);
    }

    @Test
    public void testCumulativeFrequencyBelowFirstAtFirstAndMiddle() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(2);
        frequency.addValue(5);
        frequency.addValue(9);
        assertEquals(0L, frequency.getCumFreq(1));
        assertEquals(2L, frequency.getCumFreq(2));
        assertEquals(3L, frequency.getCumFreq(5));
    }

    @Test
    public void testCumulativeFrequencyBetweenAndAboveLast() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(5);
        frequency.addValue(9);
        assertEquals(2L, frequency.getCumFreq(6));
        assertEquals(3L, frequency.getCumFreq(9));
        assertEquals(3L, frequency.getCumFreq(10));
    }

    @Test
    public void testCumulativePercentages() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(2);
        frequency.addValue(5);
        frequency.addValue(9);
        assertEquals(0.5, frequency.getCumPct(2), 1e-12);
        assertEquals(0.75, frequency.getCumPct(5), 1e-12);
        assertEquals(1.0, frequency.getCumPct(9), 1e-12);
    }

    @Test
    public void testCharacterValues() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue('a');
        frequency.addValue('c');
        frequency.addValue('c');
        assertEquals(2L, frequency.getCount('c'));
        assertEquals(3L, frequency.getCumFreq('c'));
        assertEquals(2.0 / 3.0, frequency.getPct('c'), 1e-12);
    }

    @Test
    public void testIncomparableQueryReturnsZero() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(3);
        assertEquals(0L, frequency.getCount(Character.valueOf('x')));
        assertEquals(0L, frequency.getCumFreq(Character.valueOf('x')));
        assertEquals(0.0, frequency.getCumPct(Character.valueOf('x')), 1e-12);
    }

    @Test
    public void testValuesIteratorIsOrdered() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(7);
        frequency.addValue(2);
        frequency.addValue(5);
        Iterator iterator = frequency.valuesIterator();
        assertEquals(Long.valueOf(2), iterator.next());
        assertEquals(Long.valueOf(5), iterator.next());
        assertEquals(Long.valueOf(7), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testClearRemovesAllEntries() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(2);
        frequency.addValue(4);
        frequency.clear();
        assertEquals(0L, frequency.getSumFreq());
        assertEquals(0L, frequency.getCount(2));
        assertTrue(Double.isNaN(frequency.getPct(2)));
    }

    @Test
    public void testToStringEmptyHeader() throws Exception {
        Frequency frequency = new Frequency();
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", frequency.toString());
    }

    @Test
    public void testToStringContainsFrequencyRow() throws Exception {
        Frequency frequency = new Frequency();
        frequency.addValue(4);
        frequency.addValue(4);
        String text = frequency.toString();
        assertTrue(text.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(text.contains("4\t2\t100%\t100%\n"));
    }
}
