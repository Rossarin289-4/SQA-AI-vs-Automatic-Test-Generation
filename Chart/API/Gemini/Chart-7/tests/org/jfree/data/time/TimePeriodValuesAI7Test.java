package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the {@link TimePeriodValues} class.
 */
public class TimePeriodValuesAI7Test {

    @Test
    public void testConstructorAndGetters() {
        TimePeriodValues tpv = new TimePeriodValues("Series 1");
        assertEquals("Series 1", tpv.getKey());
        assertEquals("Time", tpv.getDomainDescription());
        assertEquals("Value", tpv.getRangeDescription());
        assertEquals(0, tpv.getItemCount());
        assertEquals(-1, tpv.getMinStartIndex());
        assertEquals(-1, tpv.getMaxStartIndex());
        assertEquals(-1, tpv.getMinMiddleIndex());
        assertEquals(-1, tpv.getMaxMiddleIndex());
        assertEquals(-1, tpv.getMinEndIndex());
        assertEquals(-1, tpv.getMaxEndIndex());

        TimePeriodValues tpv2 = new TimePeriodValues("Series 2", "Domain", "Range");
        assertEquals("Series 2", tpv2.getKey());
        assertEquals("Domain", tpv2.getDomainDescription());
        assertEquals("Range", tpv2.getRangeDescription());

        tpv2.setDomainDescription("New Domain");
        assertEquals("New Domain", tpv2.getDomainDescription());

        tpv2.setRangeDescription("New Range");
        assertEquals("New Range", tpv2.getRangeDescription());
    }

    @Test
    public void testAddAndGetters() {
        TimePeriodValues tpv = new TimePeriodValues("Series");
        SimpleTimePeriod p1 = new SimpleTimePeriod(100L, 200L);
        SimpleTimePeriod p2 = new SimpleTimePeriod(200L, 300L);

        tpv.add(p1, 55.5);
        tpv.add(p2, Double.valueOf(66.6));

        assertEquals(2, tpv.getItemCount());
        assertEquals(p1, tpv.getTimePeriod(0));
        assertEquals(p2, tpv.getTimePeriod(1));
        assertEquals(55.5, tpv.getValue(0).doubleValue(), 1e-9);
        assertEquals(66.6, tpv.getValue(1).doubleValue(), 1e-9);

        TimePeriodValue item0 = tpv.getDataItem(0);
        assertEquals(p1, item0.getPeriod());
        assertEquals(55.5, item0.getValue().doubleValue(), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullThrowsException() {
        TimePeriodValues tpv = new TimePeriodValues("Series");
        tpv.add((TimePeriodValue) null);
    }

    @Test
    public void testBoundsIndices() {
        TimePeriodValues tpv = new TimePeriodValues("Series");

        // Item 0: start = 100, end = 200, middle = 150
        tpv.add(new SimpleTimePeriod(100L, 200L), 1.0);
        assertEquals(0, tpv.getMinStartIndex());
        assertEquals(0, tpv.getMaxStartIndex());
        assertEquals(0, tpv.getMinMiddleIndex());
        assertEquals(0, tpv.getMaxMiddleIndex());
        assertEquals(0, tpv.getMinEndIndex());
        assertEquals(0, tpv.getMaxEndIndex());

        // Item 1: start = 50, end = 300, middle = 175
        // minStart should become 1, maxEnd should become 1
        tpv.add(new SimpleTimePeriod(50L, 300L), 2.0);
        assertEquals(1, tpv.getMinStartIndex());
        assertEquals(0, tpv.getMaxStartIndex());
        assertEquals(0, tpv.getMinMiddleIndex());
        assertEquals(1, tpv.getMaxMiddleIndex());
        assertEquals(0, tpv.getMinEndIndex());
        assertEquals(1, tpv.getMaxEndIndex());

        // Item 2: start = 120, end = 140, middle = 130
        // minMiddle should become 2, minEnd should become 2
        tpv.add(new SimpleTimePeriod(120L, 140L), 3.0);
        assertEquals(1, tpv.getMinStartIndex());
        assertEquals(2, tpv.getMaxStartIndex());
        assertEquals(2, tpv.getMinMiddleIndex());
        assertEquals(1, tpv.getMaxMiddleIndex());
        assertEquals(2, tpv.getMinEndIndex());
        assertEquals(1, tpv.getMaxEndIndex());

        // Item 3: start = 200, end = 400, middle = 300
        // maxStart -> 3, maxMiddle -> 3, maxEnd -> 3
        tpv.add(new SimpleTimePeriod(200L, 400L), 4.0);
        assertEquals(1, tpv.getMinStartIndex());
        assertEquals(3, tpv.getMaxStartIndex());
        assertEquals(2, tpv.getMinMiddleIndex());
        assertEquals(3, tpv.getMaxMiddleIndex());
        assertEquals(2, tpv.getMinEndIndex());
        assertEquals(3, tpv.getMaxEndIndex());
    }

    @Test
    public void testUpdate() {
        TimePeriodValues tpv = new TimePeriodValues("Series");
        tpv.add(new SimpleTimePeriod(100L, 200L), 10.0);
        tpv.add(new SimpleTimePeriod(200L, 300L), 20.0);

        tpv.update(1, Double.valueOf(99.0));
        assertEquals(99.0, tpv.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testDelete() {
        TimePeriodValues tpv = new TimePeriodValues("Series");
        tpv.add(new SimpleTimePeriod(100L, 200L), 1.0);
        tpv.add(new SimpleTimePeriod(50L, 300L), 2.0);
        tpv.add(new SimpleTimePeriod(120L, 140L), 3.0);
        tpv.add(new SimpleTimePeriod(200L, 400L), 4.0);

        // Delete index 1 and 2
        tpv.delete(1, 2);
        assertEquals(2, tpv.getItemCount());
        assertEquals(new SimpleTimePeriod(100L, 200L), tpv.getTimePeriod(0));
        assertEquals(new SimpleTimePeriod(200L, 400L), tpv.getTimePeriod(1));

        // Bounds recalculated:
        // Item 0: start 100, end 200, middle 150
        // Item 1: start 200, end 400, middle 300
        assertEquals(0, tpv.getMinStartIndex());
        assertEquals(1, tpv.getMaxStartIndex());
        assertEquals(0, tpv.getMinMiddleIndex());
        assertEquals(1, tpv.getMaxMiddleIndex());
        assertEquals(0, tpv.getMinEndIndex());
        assertEquals(1, tpv.getMaxEndIndex());
    }

    @Test
    public void testEqualsAndHashCode() {
        TimePeriodValues tpv1 = new TimePeriodValues("Series", "D", "R");
        TimePeriodValues tpv2 = new TimePeriodValues("Series", "D", "R");

        assertTrue(tpv1.equals(tpv1));
        assertTrue(tpv1.equals(tpv2));
        assertEquals(tpv1.hashCode(), tpv2.hashCode());

        tpv1.add(new SimpleTimePeriod(100L, 200L), 10.0);
        assertFalse(tpv1.equals(tpv2));

        tpv2.add(new SimpleTimePeriod(100L, 200L), 10.0);
        assertTrue(tpv1.equals(tpv2));
        assertEquals(tpv1.hashCode(), tpv2.hashCode());

        tpv2.setDomainDescription("Other Domain");
        assertFalse(tpv1.equals(tpv2));

        tpv2.setDomainDescription("D");
        tpv2.setRangeDescription("Other Range");
        assertFalse(tpv1.equals(tpv2));

        assertFalse(tpv1.equals(null));
        assertFalse(tpv1.equals("Not a TimePeriodValues"));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        TimePeriodValues tpv1 = new TimePeriodValues("Series", "Domain", "Range");
        tpv1.add(new SimpleTimePeriod(100L, 200L), 10.0);

        TimePeriodValues tpv2 = (TimePeriodValues) tpv1.clone();
        assertNotSame(tpv1, tpv2);
        assertEquals(tpv1, tpv2);

        TimePeriodValues empty = new TimePeriodValues("Empty");
        TimePeriodValues emptyClone = (TimePeriodValues) empty.clone();
        assertNotSame(empty, emptyClone);
        assertEquals(empty, emptyClone);
    }

    @Test
    public void testCreateCopy() throws CloneNotSupportedException {
        TimePeriodValues tpv = new TimePeriodValues("Series", "Domain", "Range");
        tpv.add(new SimpleTimePeriod(100L, 200L), 1.0);

        TimePeriodValues copy = tpv.createCopy(0, 0);
        assertNotSame(tpv, copy);
        assertEquals(1, copy.getItemCount());
        assertEquals(new SimpleTimePeriod(100L, 200L), copy.getTimePeriod(0));
        assertEquals(1.0, copy.getValue(0).doubleValue(), 1e-9);
        assertEquals("Domain", copy.getDomainDescription());
        assertEquals("Range", copy.getRangeDescription());
    }
}
