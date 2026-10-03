package org.jfree.chart.renderer.category.junit;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

import junit.framework.TestCase;

public class Chart25GeneratedTest extends TestCase {

    // T1: Mean และ Deviation ปกติ
    public void test01NormalMeanAndDeviation() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(1.0, 2.0, "S", "C1");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }

    // T2: Mean เป็น null แต่ Deviation มีค่า
    public void test02NullMeanWithDeviation() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(null, 4.0, "S", "C1");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }

    // T3: Mean มีค่า แต่ Deviation เป็น null
    public void test03MeanWithNullDeviation() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(5.0, null, "S", "C1");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }

    // T4: Mean และ Deviation เป็น null ทั้งคู่
    public void test04NullMeanAndNullDeviation() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(null, null, "S", "C1");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }

    // T5: Dataset มีหลาย category
    public void test05MultipleCategories() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(1.0, 2.0, "S", "C1");
        d.add(3.0, 4.0, "S", "C2");
        d.add(5.0, 1.0, "S", "C3");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }

    // T6: Dataset ผสมค่าปกติกับ null mean
    public void test06MixedNormalAndNullMean() {
        DefaultStatisticalCategoryDataset d =
                new DefaultStatisticalCategoryDataset();

        d.add(1.0, 2.0, "S", "C1");
        d.add(null, 4.0, "S", "C2");
        d.add(5.0, 1.0, "S", "C3");

        CategoryPlot p = new CategoryPlot(
                d,
                new CategoryAxis("C"),
                new NumberAxis("V"),
                new StatisticalBarRenderer());

        new JFreeChart(p).createBufferedImage(300, 200, null);
    }
}