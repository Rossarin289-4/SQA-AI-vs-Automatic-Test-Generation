```java
package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.PaintMap;
import org.jfree.chart.StrokeMap;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.PieSectionEntity;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.PieToolTipGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.text.G2TextMeasurer;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.text.TextUtilities;
import org.jfree.chart.urls.PieURLGenerator;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.chart.util.ShapeUtilities;
import org.jfree.chart.util.UnitType;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.PieDataset;

public class PiePlotTest {

    // Test constructor with no arguments
    @Test
    public void testConstructorNoArgs() throws Exception {
        PiePlot plot = new PiePlot();
        assertNotNull(plot);
        assertNull(plot.getDataset());
        assertEquals(0.08, plot.getInteriorGap(), 0.00001);
        assertTrue(plot.isCircular());
        assertEquals(90.0, plot.getStartAngle(), 0.00001);
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        assertEquals(PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW, plot.getMinimumArcAngleToDraw(), 0.00001);
        assertEquals(Color.gray, plot.getBaseSectionPaint());
        assertTrue(plot.getSectionOutlinesVisible());
        assertEquals(Plot.DEFAULT_OUTLINE_PAINT, plot.getBaseSectionOutlinePaint());
        assertEquals(Plot.DEFAULT_OUTLINE_STROKE, plot.getBaseSectionOutlineStroke());
        assertEquals(Color.gray, plot.getShadowPaint());
        assertEquals(4.0, plot.getShadowXOffset(), 0.00001);
        assertEquals(4.0, plot.getShadowYOffset(), 0.00001);
        assertEquals(new StandardPieSectionLabelGenerator(), plot.getLabelGenerator());
        assertEquals(PiePlot.DEFAULT_LABEL_FONT, plot.getLabelFont());
        assertEquals(PiePlot.DEFAULT_LABEL_PAINT, plot.getLabelPaint());
        assertEquals(PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT, plot.getLabelBackgroundPaint());
        assertEquals(PiePlot.DEFAULT_LABEL_OUTLINE_PAINT, plot.getLabelOutlinePaint());
        assertEquals(PiePlot.DEFAULT_LABEL_OUTLINE_STROKE, plot.getLabelOutlineStroke());
        assertEquals(PiePlot.DEFAULT_LABEL_SHADOW_PAINT, plot.getLabelShadowPaint());
        assertFalse(plot.getSimpleLabels()); // Default is false according to constructor
        assertEquals(new RectangleInsets(UnitType.RELATIVE, 0.18, 0.18, 0.18, 0.18), plot.getSimpleLabelOffset());
        assertEquals(new RectangleInsets(2, 2, 2, 2), plot.getLabelPadding());
        assertEquals(0.025, plot.getLabelGap(), 0.00001);
        assertEquals(0.14, plot.getMaximumLabelWidth(), 0.00001);
        assertFalse(plot.getLabelLinksVisible()); // Default is false according to constructor
        assertEquals(0.025, plot.getLabelLinkMargin(), 0.00001);
        assertEquals(Color.black, plot.getLabelLinkPaint());
        assertEquals(new BasicStroke(0.5f), plot.getLabelLinkStroke());
        assertNull(plot.getToolTipGenerator());
        assertNull(plot.getURLGenerator());
        assertEquals(new StandardPieSectionLabelGenerator(), plot.getLegendLabelGenerator());
        assertNull(plot.getLegendLabelToolTipGenerator());
        assertNull(plot.getLegendLabelURLGenerator());
        assertEquals(Plot.DEFAULT_LEGEND_ITEM_CIRCLE, plot.getLegendItemShape());
        assertFalse(plot.getIgnoreNullValues());
        assertFalse(plot.getIgnoreZeroValues());
    }

    // Test constructor with a dataset
    @Test
    public void testConstructorWithDataset() throws Exception {
        PieDataset dataset = new DefaultKeyedValues();
        ((DefaultKeyedValues) dataset).addValue("A", 10.0);
        PiePlot plot = new PiePlot(dataset);
        assertNotNull(plot);
        assertEquals(dataset, plot.getDataset());
    }

    // Test setDataset
    @Test
    public void testSetDataset() throws Exception {
        PiePlot plot = new PiePlot();
        PieDataset dataset1 = new DefaultKeyedValues();
        ((DefaultKeyedValues) dataset1).addValue("A", 10.0);
        plot.setDataset(dataset1);
        assertEquals(dataset1, plot.getDataset());

        PieDataset dataset2 = new DefaultKeyedValues();
        ((DefaultKeyedValues) dataset2).addValue("B", 20.0);
        plot.setDataset(dataset2);
        assertEquals(dataset2, plot.getDataset());

        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    // Test setPieIndex
    @Test
    public void testSetPieIndex() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setPieIndex(1);
        assertEquals(1, plot.getPieIndex());
        plot.setPieIndex(0);
        assertEquals(0, plot.getPieIndex());
    }

    // Test setStartAngle
    @Test
    public void testSetStartAngle() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setStartAngle(45.0);
        assertEquals(45.0, plot.getStartAngle(), 0.00001);
        plot.setStartAngle(180.0);
        assertEquals(180.0, plot.getStartAngle(), 0.00001);
    }

    // Test setDirection
    @Test
    public void testSetDirection() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
        plot.setDirection(Rotation.CLOCKWISE);
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        try {
            plot.setDirection(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setInteriorGap
    @Test
    public void testSetInteriorGap() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.1);
        assertEquals(0.1, plot.getInteriorGap(), 0.00001);
        plot.setInteriorGap(0.0);
        assertEquals(0.0, plot.getInteriorGap(), 0.00001);
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        assertEquals(PiePlot.MAX_INTERIOR_GAP, plot.getInteriorGap(), 0.00001);

        try {
            plot.setInteriorGap(-0.1);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            plot.setInteriorGap(0.5);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setCircular
    @Test
    public void testSetCircular() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setCircular(false);
        assertFalse(plot.isCircular());
        plot.setCircular(true);
        assertTrue(plot.isCircular());
    }

    // Test setIgnoreNullValues
    @Test
    public void testSetIgnoreNullValues() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setIgnoreNullValues(true);
        assertTrue(plot.getIgnoreNullValues());
        plot.setIgnoreNullValues(false);
        assertFalse(plot.getIgnoreNullValues());
    }

    // Test setIgnoreZeroValues
    @Test
    public void testSetIgnoreZeroValues() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setIgnoreZeroValues(true);
        assertTrue(plot.getIgnoreZeroValues());
        plot.setIgnoreZeroValues(false);
        assertFalse(plot.getIgnoreZeroValues());
    }

    // Test setSectionPaint and getSectionPaint
    @Test
    public void testSetAndGetSectionPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Color color1 = Color.RED;
        plot.setSectionPaint("Section1", color1);
        assertEquals(color1, plot.getSectionPaint("Section1"));

        Color color2 = Color.BLUE;
        plot.setSectionPaint("Section2", color2);
        assertEquals(color2, plot.getSectionPaint("Section2"));

        // Test with null paint
        plot.setSectionPaint("Section1", null);
        assertNull(plot.getSectionPaint("Section1"));
    }

    // Test setBaseSectionPaint
    @Test
    public void testSetBaseSectionPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.GREEN;
        plot.setBaseSectionPaint(paint1);
        assertEquals(paint1, plot.getBaseSectionPaint());

        try {
            plot.setBaseSectionPaint(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setSectionOutlinesVisible
    @Test
    public void testSetSectionOutlinesVisible() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setSectionOutlinesVisible(false);
        assertFalse(plot.getSectionOutlinesVisible());
        plot.setSectionOutlinesVisible(true);
        assertTrue(plot.getSectionOutlinesVisible());
    }

    // Test setSectionOutlinePaint and getSectionOutlinePaint
    @Test
    public void testSetAndGetSectionOutlinePaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.CYAN;
        plot.setSectionOutlinePaint("Section1", paint1);
        assertEquals(paint1, plot.getSectionOutlinePaint("Section1"));

        Paint paint2 = Color.MAGENTA;
        plot.setSectionOutlinePaint("Section2", paint2);
        assertEquals(paint2, plot.getSectionOutlinePaint("Section2"));

        // Test with null paint
        plot.setSectionOutlinePaint("Section1", null);
        assertNull(plot.getSectionOutlinePaint("Section1"));
    }

    // Test setBaseSectionOutlinePaint
    @Test
    public void testSetBaseSectionOutlinePaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.ORANGE;
        plot.setBaseSectionOutlinePaint(paint1);
        assertEquals(paint1, plot.getBaseSectionOutlinePaint());

        try {
            plot.setBaseSectionOutlinePaint(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setSectionOutlineStroke and getSectionOutlineStroke
    @Test
    public void testSetAndGetSectionOutlineStroke() throws Exception {
        PiePlot plot = new PiePlot();
        Stroke stroke1 = new BasicStroke(2.0f);
        plot.setSectionOutlineStroke("Section1", stroke1);
        assertEquals(stroke1, plot.getSectionOutlineStroke("Section1"));

        Stroke stroke2 = new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        plot.setSectionOutlineStroke("Section2", stroke2);
        assertEquals(stroke2, plot.getSectionOutlineStroke("Section2"));

        // Test with null stroke
        plot.setSectionOutlineStroke("Section1", null);
        assertNull(plot.getSectionOutlineStroke("Section1"));
    }

    // Test setBaseSectionOutlineStroke
    @Test
    public void testSetBaseSectionOutlineStroke() throws Exception {
        PiePlot plot = new PiePlot();
        Stroke stroke1 = new BasicStroke(1.5f);
        plot.setBaseSectionOutlineStroke(stroke1);
        assertEquals(stroke1, plot.getBaseSectionOutlineStroke());

        try {
            plot.setBaseSectionOutlineStroke(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setShadowPaint
    @Test
    public void testSetShadowPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.DARK_GRAY;
        plot.setShadowPaint(paint1);
        assertEquals(paint1, plot.getShadowPaint());

        plot.setShadowPaint(null);
        assertNull(plot.getShadowPaint());
    }

    // Test setShadowXOffset
    @Test
    public void testSetShadowXOffset() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setShadowXOffset(2.0);
        assertEquals(2.0, plot.getShadowXOffset(), 0.00001);
        plot.setShadowXOffset(0.0);
        assertEquals(0.0, plot.getShadowXOffset(), 0.00001);
    }

    // Test setShadowYOffset
    @Test
    public void testSetShadowYOffset() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setShadowYOffset(3.0);
        assertEquals(3.0, plot.getShadowYOffset(), 0.00001);
        plot.setShadowYOffset(0.0);
        assertEquals(0.0, plot.getShadowYOffset(), 0.00001);
    }

    // Test setExplodePercent and getExplodePercent
    @Test
    public void testSetAndGetExplodePercent() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setExplodePercent("SectionA", 0.1);
        assertEquals(0.1, plot.getExplodePercent("SectionA"), 0.00001);

        plot.setExplodePercent("SectionB", 0.2);
        assertEquals(0.2, plot.getExplodePercent("SectionB"), 0.00001);

        // Test for a section not set
        assertEquals(0.0, plot.getExplodePercent("SectionC"), 0.00001);

        // Test with null key
        try {
            plot.setExplodePercent(null, 0.1);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test getMaximumExplodePercent with no dataset
    @Test
    public void testGetMaximumExplodePercentNoDataset() throws Exception {
        PiePlot plot = new PiePlot();
        assertEquals(0.0, plot.getMaximumExplodePercent(), 0.00001);
    }

    // Test getMaximumExplodePercent with dataset
    @Test
    public void testGetMaximumExplodePercentWithDataset() throws Exception {
        PieDataset dataset = new DefaultKeyedValues();
        ((DefaultKeyedValues) dataset).addValue("A", 10.0);
        ((DefaultKeyedValues) dataset).addValue("B", 20.0);
        ((DefaultKeyedValues) dataset).addValue("C", 30.0);
        PiePlot plot = new PiePlot(dataset);

        plot.setExplodePercent("A", 0.1);
        plot.setExplodePercent("B", 0.3);
        plot.setExplodePercent("C", 0.2);

        assertEquals(0.3, plot.getMaximumExplodePercent(), 0.00001);
    }

    // Test setLabelGenerator
    @Test
    public void testSetLabelGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("Value: {1}");
        plot.setLabelGenerator(generator);
        assertEquals(generator, plot.getLabelGenerator());

        plot.setLabelGenerator(null);
        assertNull(plot.getLabelGenerator());
    }

    // Test setLabelGap
    @Test
    public void testSetLabelGap() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setLabelGap(0.05);
        assertEquals(0.05, plot.getLabelGap(), 0.00001);
        plot.setLabelGap(0.0);
        assertEquals(0.0, plot.getLabelGap(), 0.00001);
    }

    // Test setMaximumLabelWidth
    @Test
    public void testSetMaximumLabelWidth() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setMaximumLabelWidth(0.2);
        assertEquals(0.2, plot.getMaximumLabelWidth(), 0.00001);
        plot.setMaximumLabelWidth(0.0);
        assertEquals(0.0, plot.getMaximumLabelWidth(), 0.00001);
    }

    // Test setLabelLinksVisible
    @Test
    public void testSetLabelLinksVisible() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setLabelLinksVisible(true);
        assertTrue(plot.getLabelLinksVisible());
        plot.setLabelLinksVisible(false);
        assertFalse(plot.getLabelLinksVisible());
    }

    // Test setLabelLinkMargin
    @Test
    public void testSetLabelLinkMargin() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setLabelLinkMargin(0.05);
        assertEquals(0.05, plot.getLabelLinkMargin(), 0.00001);
        plot.setLabelLinkMargin(0.0);
        assertEquals(0.0, plot.getLabelLinkMargin(), 0.00001);
    }

    // Test setLabelLinkPaint
    @Test
    public void testSetLabelLinkPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.PINK;
        plot.setLabelLinkPaint(paint1);
        assertEquals(paint1, plot.getLabelLinkPaint());

        try {
            plot.setLabelLinkPaint(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelLinkStroke
    @Test
    public void testSetLabelLinkStroke() throws Exception {
        PiePlot plot = new PiePlot();
        Stroke stroke1 = new BasicStroke(1.0f);
        plot.setLabelLinkStroke(stroke1);
        assertEquals(stroke1, plot.getLabelLinkStroke());

        try {
            plot.setLabelLinkStroke(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelFont
    @Test
    public void testSetLabelFont() throws Exception {
        PiePlot plot = new PiePlot();
        Font font1 = new Font("Arial", Font.BOLD, 12);
        plot.setLabelFont(font1);
        assertEquals(font1, plot.getLabelFont());

        try {
            plot.setLabelFont(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelPaint
    @Test
    public void testSetLabelPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.YELLOW;
        plot.setLabelPaint(paint1);
        assertEquals(paint1, plot.getLabelPaint());

        try {
            plot.setLabelPaint(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelBackgroundPaint
    @Test
    public void testSetLabelBackgroundPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.LIGHT_GRAY;
        plot.setLabelBackgroundPaint(paint1);
        assertEquals(paint1, plot.getLabelBackgroundPaint());

        plot.setLabelBackgroundPaint(null);
        assertNull(plot.getLabelBackgroundPaint());
    }

    // Test setLabelOutlinePaint
    @Test
    public void testSetLabelOutlinePaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = Color.BLACK;
        plot.setLabelOutlinePaint(paint1);
        assertEquals(paint1, plot.getLabelOutlinePaint());

        plot.setLabelOutlinePaint(null);
        assertNull(plot.getLabelOutlinePaint());
    }

    // Test setLabelOutlineStroke
    @Test
    public void testSetLabelOutlineStroke() throws Exception {
        PiePlot plot = new PiePlot();
        Stroke stroke1 = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        plot.setLabelOutlineStroke(stroke1);
        assertEquals(stroke1, plot.getLabelOutlineStroke());

        plot.setLabelOutlineStroke(null);
        assertNull(plot.getLabelOutlineStroke());
    }

    // Test setLabelShadowPaint
    @Test
    public void testSetLabelShadowPaint() throws Exception {
        PiePlot plot = new PiePlot();
        Paint paint1 = new Color(100, 100, 100, 50);
        plot.setLabelShadowPaint(paint1);
        assertEquals(paint1, plot.getLabelShadowPaint());

        plot.setLabelShadowPaint(null);
        assertNull(plot.getLabelShadowPaint());
    }

    // Test setSimpleLabels
    @Test
    public void testSetSimpleLabels() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setSimpleLabels(true);
        assertTrue(plot.getSimpleLabels());
        plot.setSimpleLabels(false);
        assertFalse(plot.getSimpleLabels());
    }

    // Test setSimpleLabelOffset
    @Test
    public void testSetSimpleLabelOffset() throws Exception {
        PiePlot plot = new PiePlot();
        RectangleInsets offset1 = new RectangleInsets(0.1, 0.1, 0.1, 0.1);
        plot.setSimpleLabelOffset(offset1);
        assertEquals(offset1, plot.getSimpleLabelOffset());

        try {
            plot.setSimpleLabelOffset(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelPadding
    @Test
    public void testSetLabelPadding() throws Exception {
        PiePlot plot = new PiePlot();
        RectangleInsets padding1 = new RectangleInsets(5, 5, 5, 5);
        plot.setLabelPadding(padding1);
        assertEquals(padding1, plot.getLabelPadding());

        try {
            plot.setLabelPadding(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLabelDistributor
    @Test
    public void testSetLabelDistributor() throws Exception {
        PiePlot plot = new PiePlot();
        // Use a concrete implementation of AbstractPieLabelDistributor
        // PieLabelDistributor is not directly visible in the API Outline,
        // but it's used in the source code. Assume it's accessible.
        AbstractPieLabelDistributor distributor = new PieLabelDistributor(0);
        plot.setLabelDistributor(distributor);
        assertEquals(distributor, plot.getLabelDistributor());

        try {
            plot.setLabelDistributor(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setToolTipGenerator
    @Test
    public void testSetToolTipGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieToolTipGenerator generator = new PieToolTipGenerator() {
            @Override
            public String generateToolTip(PieDataset dataset, Comparable key) {
                return "Tooltip for " + key;
            }
        };
        plot.setToolTipGenerator(generator);
        assertEquals(generator, plot.getToolTipGenerator());

        plot.setToolTipGenerator(null);
        assertNull(plot.getToolTipGenerator());
    }

    // Test setURLGenerator
    @Test
    public void testSetURLGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieURLGenerator generator = new PieURLGenerator() {
            @Override
            public String generateURL(PieDataset dataset, Comparable key, int pieIndex) {
                return "URL for " + key;
            }
        };
        plot.setURLGenerator(generator);
        assertEquals(generator, plot.getURLGenerator());

        plot.setURLGenerator(null);
        assertNull(plot.getURLGenerator());
    }

    // Test setMinimumArcAngleToDraw
    @Test
    public void testSetMinimumArcAngleToDraw() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setMinimumArcAngleToDraw(0.01);
        assertEquals(0.01, plot.getMinimumArcAngleToDraw(), 0.00001);
        plot.setMinimumArcAngleToDraw(0.0);
        assertEquals(0.0, plot.getMinimumArcAngleToDraw(), 0.00001);
    }

    // Test setLegendItemShape
    @Test
    public void testSetLegendItemShape() throws Exception {
        PiePlot plot = new PiePlot();
        Shape shape1 = new Ellipse2D.Double();
        plot.setLegendItemShape(shape1);
        assertEquals(shape1, plot.getLegendItemShape());

        try {
            plot.setLegendItemShape(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLegendLabelGenerator
    @Test
    public void testSetLegendLabelGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("Legend: {1}");
        plot.setLegendLabelGenerator(generator);
        assertEquals(generator, plot.getLegendLabelGenerator());

        try {
            plot.setLegendLabelGenerator(null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test setLegendLabelToolTipGenerator
    @Test
    public void testSetLegendLabelToolTipGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("Legend Tip: {1}");
        plot.setLegendLabelToolTipGenerator(generator);
        assertEquals(generator, plot.getLegendLabelToolTipGenerator());

        plot.setLegendLabelToolTipGenerator(null);
        assertNull(plot.getLegendLabelToolTipGenerator());
    }

    // Test setLegendLabelURLGenerator
    @Test
    public void testSetLegendLabelURLGenerator() throws Exception {
        PiePlot plot = new PiePlot();
        PieURLGenerator generator = new PieURLGenerator() {
            @Override
            public String generateURL(PieDataset dataset, Comparable key, int pieIndex) {
                return "Legend URL for " + key;
            }
        };
        plot.setLegendLabelURLGenerator(generator);
        assertEquals(generator, plot.getLegendLabelURLGenerator());

        plot.setLegendLabelURLGenerator(null);
        assertNull(plot.getLegendLabelURLGenerator());
    }

    // Test clone method
    @Test
    public void testClone() throws Exception {
        PiePlot plot = new PiePlot();
        PieDataset dataset = new DefaultKeyedValues();
        ((DefaultKeyedValues) dataset).addValue("A", 10.0);
        plot.setDataset(dataset);

        PiePlot clone = (PiePlot) plot.clone();

        // Check if it's a different object
        assertNotSame(plot, clone);

        // Check if dataset is the same reference (it should be)
        assertEquals(plot.getDataset(), clone.getDataset());

        // Check if other properties are copied
        assertEquals(plot.getInteriorGap(), clone.getInteriorGap(), 0.00001);
        assertEquals(plot.isCircular(), clone.isCircular());
        assertEquals(plot.getStartAngle(), clone.getStartAngle(), 0.00001);
        assertEquals(plot.getDirection(), clone.getDirection());
        assertEquals(plot.getLabelFont(), clone.getLabelFont());
        assertEquals(plot.getLabelPaint(), clone.getLabelPaint());
    }

    // Test equals method with same object
    @Test
    public void testEqualsSameObject() throws Exception {
        PiePlot plot = new PiePlot();
        assertTrue(plot.equals(plot));
    }

    // Test equals method with different object of same class
    @Test
    public void testEqualsDifferentObject() throws Exception {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        assertTrue(plot1.equals(plot2));
    }

    // Test equals method with null
    @Test
    public void testEqualsNull() throws Exception {
        PiePlot plot = new PiePlot();
        assertFalse(plot.equals(null));
    }

    // Test equals method with different class
    @Test
    public void testEqualsDifferentClass() throws Exception {
        PiePlot plot = new PiePlot();
        assertFalse(plot.equals("NotAPiePlot"));
    }

    // Test equals method with changed properties
    @Test
    public void testEqualsChangedProperties() throws Exception {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();

        plot1.setInteriorGap(0.1);
        assertFalse(plot1.equals(plot2));

        plot2.setInteriorGap(0.1);
        assertTrue(plot1.equals(plot2));

        plot1.setCircular(false);
        assertFalse(plot1.equals(plot2));

        plot2.setCircular(false);
        assertTrue(plot1.equals(plot2));
    }

    // Test getPlotType
    @Test
    public void testGetPlotType() throws Exception {
        PiePlot plot = new PiePlot();
        assertEquals("Pie_Plot", plot.getPlotType());
    }

    // Test getArcBounds with no explode
    @Test
    public void testGetArcBoundsNoExplode() throws Exception {
        PiePlot plot = new PiePlot();
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(0, 0, 100, 100);
        double angle = 90.0;
        double extent = 90.0;
        double explodePercent = 0.0;

        Rectangle2D result = plot.getArcBounds(unexploded, exploded, angle, extent, explodePercent);
        assertEquals(unexploded, result);
    }

    // Test getArcBounds with explode
    @Test
    public void testGetArcBoundsWithExplode() throws Exception {
        PiePlot plot = new PiePlot();
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        // The exploded area should be larger than unexploded for explodePercent to matter.
        // The source code for getArcBounds uses unexploded.getX() - deltaX and unexploded.getY() - deltaY
        // So, if deltaX/Y are positive, the rectangle moves left/up.
        // The 'exploded' parameter seems to define the maximum possible area for explosion.
        // Let's create an 'exploded' area that's bigger than 'unexploded' to simulate it.
        Rectangle2D exploded = new Rectangle2D.Double(-10, -10, 120, 120); 
        double angle = 90.0;
        double extent = 90.0;
        double explodePercent = 0.1;

        Rectangle2D result = plot.getArcBounds(unexploded, exploded, angle, extent, explodePercent);

        // Calculation trace:
        // Center of unexploded: (50, 50)
        // Center of exploded: (50, 50)
        // Angle 90, extent 90/2 = 45 degrees. This is for the first half of the arc calculation.
        // On unexploded: angle 90 (up), radius 50. End point is (50, 0).
        // On exploded: angle 90 (up), radius 60. End point is (50, -10).
        // deltaX = 50 - 50 = 0.
        // deltaY = 0 - (-10) = 10.
        // New rect x = unexploded.getX() - deltaX * explodePercent = 0 - 0 * 0.1 = 0.
        // New rect y = unexploded.getY() - deltaY * explodePercent = 0 - 10 * 0.1 = -1.
        // Width and Height remain the same as unexploded.
        assertEquals(0.0, result.getX(), 0.00001);
        assertEquals(-1.0, result.getY(), 0.00001);
        assertEquals(100.0, result.getWidth(), 0.00001);
        assertEquals(100.0, result.getHeight(), 0.00001);
    }
}
```