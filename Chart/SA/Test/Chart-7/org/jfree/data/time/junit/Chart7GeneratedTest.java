package org.jfree.data.time.junit;

import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;

import junit.framework.TestCase;

public class Chart7GeneratedTest extends TestCase {

    // T1: มี 2 ช่วงเวลา และค่ามากสุดอยู่ตัวล่าสุด
    public void test01MaxMiddleIndexUsesLatestPeriod() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2000), 1.0));
        values.add(new TimePeriodValue(new Year(2002), 2.0));

        assertEquals(1, values.getMaxMiddleIndex());
    }

    // T2: มีข้อมูลเพียงตัวเดียว index ต้องเป็น 0
    public void test02SinglePeriodHasIndexZero() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2000), 1.0));

        assertEquals(0, values.getMaxMiddleIndex());
    }

    // T3: เพิ่มข้อมูลตามลำดับปี
    public void test03MultiplePeriodsIncreasingYears() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2000), 1.0));
        values.add(new TimePeriodValue(new Year(2001), 2.0));
        values.add(new TimePeriodValue(new Year(2002), 3.0));

        assertEquals(2, values.getMaxMiddleIndex());
    }

    // T4: เพิ่มข้อมูลโดยปีล่าสุดอยู่ตรงกลาง
    public void test04LatestPeriodIsInMiddle() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2000), 1.0));
        values.add(new TimePeriodValue(new Year(2005), 2.0));
        values.add(new TimePeriodValue(new Year(2002), 3.0));

        assertEquals(1, values.getMaxMiddleIndex());
    }

    // T5: ปีล่าสุดอยู่ตำแหน่งแรก
    public void test05LatestPeriodIsFirst() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2010), 1.0));
        values.add(new TimePeriodValue(new Year(2000), 2.0));
        values.add(new TimePeriodValue(new Year(2005), 3.0));

        assertEquals(0, values.getMaxMiddleIndex());
    }

    // T6: ค่า value ไม่ควรเป็นตัวกำหนดช่วงเวลาที่ล่าสุด
    public void test06MaximumValueDoesNotDetermineMiddleIndex() {
        TimePeriodValues values = new TimePeriodValues("S");

        values.add(new TimePeriodValue(new Year(2000), 999.0));
        values.add(new TimePeriodValue(new Year(2005), 1.0));

        assertEquals(1, values.getMaxMiddleIndex());
    }
}