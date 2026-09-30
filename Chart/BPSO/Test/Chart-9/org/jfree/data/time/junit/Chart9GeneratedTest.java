package org.jfree.data.time.junit;

import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;

import junit.framework.TestCase;

public class Chart9GeneratedTest extends TestCase {

    // T1: ช่วงที่ขอ copy ไม่ทับกับข้อมูลเดิมเลย
    public void test01DisjointPeriodRangeIsEmpty()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);

        TimeSeries copy = series.createCopy(
                new Day(10, 1, 2007),
                new Day(11, 1, 2007));

        assertEquals(0, copy.getItemCount());
    }

    // T2: Copy ช่วงที่ตรงกับข้อมูลทั้งหมด
    public void test02ExactRangeCopiesAllItems()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);

        TimeSeries copy = series.createCopy(
                new Day(1, 1, 2007),
                new Day(2, 1, 2007));

        assertEquals(2, copy.getItemCount());
    }

    // T3: Copy เฉพาะข้อมูลวันแรก
    public void test03CopyOnlyFirstPeriod()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);

        TimeSeries copy = series.createCopy(
                new Day(1, 1, 2007),
                new Day(1, 1, 2007));

        assertEquals(1, copy.getItemCount());
    }

    // T4: Copy เฉพาะข้อมูลวันสุดท้าย
    public void test04CopyOnlyLastPeriod()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);

        TimeSeries copy = series.createCopy(
                new Day(2, 1, 2007),
                new Day(2, 1, 2007));

        assertEquals(1, copy.getItemCount());
    }

    // T5: ช่วงที่ขอเริ่มก่อนข้อมูลจริง แต่ทับกับข้อมูลบางส่วน
    public void test05PartiallyOverlappingRange()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);
        series.add(new Day(3, 1, 2007), 3.0);

        TimeSeries copy = series.createCopy(
                new Day(31, 12, 2006),
                new Day(2, 1, 2007));

        assertEquals(2, copy.getItemCount());
    }

    // T6: ช่วงที่ขอครอบคลุมข้อมูลจริงทั้งหมด
    public void test06RangeLargerThanSeries()
            throws CloneNotSupportedException {

        TimeSeries series = new TimeSeries("S");
        series.add(new Day(1, 1, 2007), 1.0);
        series.add(new Day(2, 1, 2007), 2.0);

        TimeSeries copy = series.createCopy(
                new Day(31, 12, 2006),
                new Day(10, 1, 2007));

        assertEquals(2, copy.getItemCount());
    }
}