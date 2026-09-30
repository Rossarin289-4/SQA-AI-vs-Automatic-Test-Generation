package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;

import junit.framework.TestCase;

import org.jfree.chart.plot.ValueMarker;

public class Chart20GeneratedTest extends TestCase {

    public void test01OutlinePaintBlue() {
        ValueMarker marker = new ValueMarker(
                10.0,
                Color.RED,
                new BasicStroke(1.0f),
                Color.BLUE,
                new BasicStroke(2.0f),
                1.0f);

        assertEquals(Color.BLUE, marker.getOutlinePaint());
    }

    public void test02OutlinePaintGreen() {
        ValueMarker marker = new ValueMarker(
                5.0,
                Color.BLACK,
                new BasicStroke(1.0f),
                Color.GREEN,
                new BasicStroke(2.0f),
                0.8f);

        assertEquals(Color.GREEN, marker.getOutlinePaint());
    }

    public void test03ValuePreserved() {
        ValueMarker marker = new ValueMarker(
                42.5,
                Color.RED,
                new BasicStroke(1.0f),
                Color.BLUE,
                new BasicStroke(2.0f),
                1.0f);

        assertEquals(42.5, marker.getValue(), 0.000001);
    }

    public void test04PrimaryPaintPreserved() {
        ValueMarker marker = new ValueMarker(
                1.0,
                Color.RED,
                new BasicStroke(1.0f),
                Color.BLUE,
                new BasicStroke(2.0f),
                1.0f);

        assertEquals(Color.RED, marker.getPaint());
    }

    public void test05DifferentPaintAndOutlinePaint() {
        ValueMarker marker = new ValueMarker(
                -1.0,
                Color.YELLOW,
                new BasicStroke(1.0f),
                Color.MAGENTA,
                new BasicStroke(3.0f),
                0.5f);

        assertEquals(Color.YELLOW, marker.getPaint());
        assertEquals(Color.MAGENTA, marker.getOutlinePaint());
    }

    public void test06AlphaPreserved() {
        ValueMarker marker = new ValueMarker(
                0.0,
                Color.RED,
                new BasicStroke(1.0f),
                Color.BLUE,
                new BasicStroke(2.0f),
                0.5f);

        assertEquals(0.5f, marker.getAlpha(), 0.000001f);
    }
}
