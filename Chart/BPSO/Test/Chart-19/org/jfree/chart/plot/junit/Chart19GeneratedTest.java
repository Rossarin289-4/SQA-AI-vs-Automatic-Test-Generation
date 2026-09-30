package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Chart19GeneratedTest extends TestCase {

    // T1: null domain axis ต้องถูกปฏิเสธ
    public void test01NullDomainAxisIsRejected() {
        CategoryPlot p = new CategoryPlot(
                null,
                new CategoryAxis("X"),
                new NumberAxis("Y"),
                null);

        try {
            p.getDomainAxisIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    // T2: null range axis ต้องถูกปฏิเสธ
    public void test02NullRangeAxisIsRejected() {
        CategoryPlot p = new CategoryPlot(
                null,
                new CategoryAxis("X"),
                new NumberAxis("Y"),
                null);

        try {
            p.getRangeAxisIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    // T3: domain axis ที่อยู่ใน plot ควรอยู่ index 0
    public void test03DomainAxisIndexIsZero() {
        CategoryAxis domainAxis = new CategoryAxis("Domain");

        CategoryPlot p = new CategoryPlot(
                null,
                domainAxis,
                new NumberAxis("Range"),
                null);

        assertEquals(0, p.getDomainAxisIndex(domainAxis));
    }

    // T4: range axis ที่อยู่ใน plot ควรอยู่ index 0
    public void test04RangeAxisIndexIsZero() {
        NumberAxis rangeAxis = new NumberAxis("Range");

        CategoryPlot p = new CategoryPlot(
                null,
                new CategoryAxis("Domain"),
                rangeAxis,
                null);

        assertEquals(0, p.getRangeAxisIndex(rangeAxis));
    }

    // T5: domain axis คนละ object กับที่อยู่ใน plot
    public void test05UnknownDomainAxisReturnsMinusOne() {
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        CategoryAxis otherAxis = new CategoryAxis("Other");

        CategoryPlot p = new CategoryPlot(
                null,
                domainAxis,
                new NumberAxis("Range"),
                null);

        assertEquals(-1, p.getDomainAxisIndex(otherAxis));
    }

    // T6: range axis คนละ object กับที่อยู่ใน plot
    public void test06UnknownRangeAxisReturnsMinusOne() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        NumberAxis otherAxis = new NumberAxis("Other");

        CategoryPlot p = new CategoryPlot(
                null,
                new CategoryAxis("Domain"),
                rangeAxis,
                null);

        assertEquals(-1, p.getRangeAxisIndex(otherAxis));
    }
}