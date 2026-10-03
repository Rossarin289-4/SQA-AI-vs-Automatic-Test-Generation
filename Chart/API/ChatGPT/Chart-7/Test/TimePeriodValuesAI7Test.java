package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimePeriodValuesAI7Test {

    @Test
    public void testConstructorAndDescriptions() {
        TimePeriodValues values = new TimePeriodValues("SeriesName", "CustomDomain", "CustomRange");
        assertEquals("SeriesName", values.getKey());
        assertEquals("CustomDomain", values.getDomainDescription());
        assertEquals("CustomRange", values.getRangeDescription());
        assertEquals(0, values.getItemCount());

        values.setDomainDescription("NewDomain");
        values.setRangeDescription("NewRange");
        assertEquals("NewDomain", values.getDomainDescription());
        assertEquals("NewRange", values.getRangeDescription());
    }

    @Test
    public void testAddAndUpdateAndItemAccess() {
        TimePeriodValues values = new TimePeriodValues("Test Series");
        SimpleTimePeriod period1 = new SimpleTimePeriod(1000L, 2000L);
        SimpleTimePeriod period2 = new SimpleTimePeriod(3000L, 4000L);

        values.add(period1, 10.5);
        values.add(period2, 20.0);

        assertEquals(2, values.getItemCount());
        assertEquals(10.5, values.getValue(0).doubleValue(), 0.0001);
        assertEquals(20.0, values.getValue(1).doubleValue(), 0.0001);

        values.update(0, 15.0);
        assertEquals(15.0, values.getValue(0).doubleValue(), 0.0001);

        TimePeriodValue item = values.getDataItem(1);
        assertEquals(20.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testEqualsAndClone() throws Exception {
        TimePeriodValues values1 = new TimePeriodValues("Series", "Domain", "Range");
        SimpleTimePeriod period = new SimpleTimePeriod(100L, 200L);
        values1.add(period, 5.0);

        TimePeriodValues values2 = new TimePeriodValues("Series", "Domain", "Range");
        values2.add(new SimpleTimePeriod(100L, 200L), 5.0);

        assertTrue(values1.equals(values2));
        assertEquals(values1.hashCode(), values2.hashCode());

        TimePeriodValues clone = (TimePeriodValues) values1.clone();
        assertTrue(values1.equals(clone));
        assertFalse(values1 == clone);
    }
}
