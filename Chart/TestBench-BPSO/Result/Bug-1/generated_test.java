package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<sample:8>", "-2139095040", "2147483647", "true", "-1.7976931348623155E308", "-1.0", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:8>", "<d:1.5>", "<s:bb>", "2.4951064368849946E18", "16", "1.24755321844249728E18", "1247553218442497391", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"<sample:0>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseURLGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemToolTipGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "-3", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:13>", "<sample:6>", "<sample:6>", "<sample:6>", "<sample:7>", "<sample:10>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:1>", "<null>", "<sample:7>", "2147483647", "-3", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:3>", "false"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesURLGenerator", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemURLGenerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseStroke", "java.awt.Stroke", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.CloneNotSupportedException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:8>", "-2139095039", "60", "false", "-1.7976931348623157E308", "2.4951064368849946E18", "false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:6>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"131196", "<sample:7>", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<null>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelFont", "int", "60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemStroke", "int,int,boolean", "3", "-6", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"2022", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseFillPaint", "java.awt.Paint", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:7>", "-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItem", "int,int", "2", "2097162"}}), new String[][]{{"isVerticalTickLabels", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "-1", "<sample:0>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:11>", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:6>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "updateCrosshairValues", new String[]{"org.jfree.chart.plot.CategoryCrosshairState", "java.lang.Comparable", "java.lang.Comparable", "double", "int", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "<i:1>", "<s:>", "1.7976931348623157E308", "-44", "-2.106", "-10.0", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlineStroke", "java.awt.Stroke", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "3", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#941897382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesURLGenerator", "int,org.jfree.chart.urls.CategoryURLGenerator", "35", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:6>", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<null>", "<s:b>", "<i:-14>", "-4.9E-324", "-12", "2.4951064368849946E18", "-0.0", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawRangeLine", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double", "java.awt.Paint", "java.awt.Stroke"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "<sample:6>", "1.24755321844249728E17", "<sample:1>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelGenerator", new String[]{"int"}, new String[]{"30"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"4", "1", "false"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:11>", "<sample:0>", "<sample:6>", "-0.5000000000000001", "<sample:2>", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendTextPaint", "int", "124"}}, 3), new String[][]{{"getWidth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:9>", "<sample:4>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendTextFont", new String[]{"int", "java.awt.Font"}, new String[]{"105", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "25", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>", "40", "65", "true", "-8.988465674311579E307", "-0.4"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator,boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:3>", "0"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.NumberAxis3D", actual.getClass().getName());
  assertEquals("{getAutoRangeIncludesZero=true, getAutoRangeMinimumSize=1.0E-8, getAutoRangeStickyZero=true, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLa...#401#1866187882", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:6>", "<sample:3>", "<sample:0>", "-1.0", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:10>", "<sample:4>", "<sample:3>", "2.4951064368849946E18", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:2>", "<null>", "<sample:7>", "<sample:6>", "<sample:8>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelPaint", ""}}, 2), new String[][]{{"distance", "java.awt.geom.Point2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:6>", "true"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:10>", "<sample:8>", "<null>", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:15>", "<sample:4>", "<sample:4>", "<sample:8>", "1.0", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-4.0,y=-4.0,w=8.0,h=8.0] {getCenterX=0.0, getCenterY=0.0, getHeight=8.0, getMaxX=4.0, getMaxY=4.0, getMinX=-4.0, getMinY=-4.0, getWidth=8.0, getX=-4.0, getY=-4.0, is...#212#92547860", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<null>", "<null>", "<sample:8>", "-2147483648", "-524228", "true", "2.0", "1.0"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "removeAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:3>", "<sample:7>", "<sample:2>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:10>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:4>"}}), new String[][]{{"getLegendShape", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "<sample:2>", "16781260", "60", "false"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemToolTipGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:1>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesOutlineStroke", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#-1391013118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendShape", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelGenerator", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotShape", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:14>", "<sample:2>", "<sample:7>", "<sample:3>", "<sample:2>", "<sample:7>", "1073741824", "2097150", "false", "<sample:9>"}}, 1), new String[][]{{"getCenterX", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>", "<null>", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "hitTest", "double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "-2.106", "-1.7976931348623157E308", "<sample:3>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:5>", "<sample:0>", "-2147483648", "-44", "true", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0, getVisibleSeriesArray=[], getVisibleSeriesCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#1010433885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "0", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesShape", "int", "-2146959360"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.CloneNotSupportedException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.CloneNotSupportedException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemURLGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesURLGenerator", "int,org.jfree.chart.urls.CategoryURLGenerator,boolean", "39", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#494#2039266684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"-38", "6"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<sample:7>", "<sample:7>", "<sample:5>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:5>", "<sample:8>", "<null>", "2", "10", "false", "-1.24755321844249728E17", "NaN"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:9>", "<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemPaint", "int,int,boolean", "-268435459", "-2", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:3>"}}, 1), new String[][]{{"getX", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"-2147483648", "<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseOutlinePaint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<null>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 1), new String[][]{{"getAngle", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"2147483647", "20"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<sample:9>", "-3", "6", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseFillPaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"65541", "4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "isSeriesVisibleInLegend", "int", "-3"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<sample:8>", "4", "1", "false", "NaN", "2.038", "false"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:4>", "<null>", "<sample:7>", "<sample:0>", "<sample:5>", "<sample:6>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesCreateEntities", new String[]{"int"}, new String[]{"2147483627"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "-2139095058", "true", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"16777218", "<sample:6>", "false"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemStroke", "int,int,boolean", "6", "-57", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotShape", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>", "<sample:6>", "<sample:0>", "<sample:1>", "68", "124", "false", "<sample:9>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDataBoundsIncludesVisibleSeriesOnly", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"-67106818", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesURLGenerator", "int,org.jfree.chart.urls.CategoryURLGenerator,boolean", "-2139095030", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1683109270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesShape", ""}}, 3), new String[][]{{"getLineMetrics", "java.lang.String,java.awt.font.FontRenderContext", "4"}});
  assertNotNull(actual);
  assertEquals("sun.font.FontLineMetrics", actual.getClass().getName());
  assertEquals("{getAscent=9.282227, getBaselineIndex=0, getBaselineOffsets=[0.0, -4.0515137, -9.282227], getDescent=2.3583984, getHeight=11.640625, getLeading=0.0, getNumChars=0, getStrikethroughOffset=-2.5878906, g...#300#66568188", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemPaint", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "124", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "fireChangeEvent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"0", "<sample:5>", "true"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-38", "false", "false"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendShape", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:5>", "<sample:6>", "<sample:7>", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "-2147483648", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlinePaint", "java.awt.Paint,boolean", "<sample:4>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:13>", "<sample:0>", "<null>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateLabelAnchorPoint", "org.jfree.chart.labels.ItemLabelAnchor,double,double,org.jfree.chart.plot.PlotOrientation", "<null>", "-Infinity", "0.0", "<null>"}}, 1), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int", "boolean"}, new String[]{"60", "2022", "false"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>", "<sample:7>", "<sample:5>", "<null>", "-2147483648", "2147483647", "false", "<sample:4>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:9>", "true"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlinePaint", "java.awt.Paint,boolean", "<sample:9>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"2147483647", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "2.4951064368849946E18", "-0.9999999999999999", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"2", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clearSeriesStrokes", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"-14", "0", "true"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#494#1659045894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:5>", "<i:22>", "<i:22>", "1.0", "-16375", "1.7976931348623157E308", "0.4", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-536870963", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "-10", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseToolTipGenerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.AreaRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:8>", "<sample:6>", "<sample:8>", "<sample:3>", "<null>", "<sample:5>", "4", "-2147483648", "true", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesOutlineStroke", "int", "-1069547544"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:6>", "<null>", "<sample:3>", "<sample:6>", "<sample:8>", "<sample:6>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"distanceSq", "java.awt.geom.Point2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemOutlineStroke", "int,int,boolean", "-16", "-2147483648", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesOutlineStroke", "int", "18"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendTextFont", new String[]{"int", "java.awt.Font"}, new String[]{"48", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesNegativeItemLabelPosition", "int", "-117"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double", "boolean"}, new String[]{"<null>", "<sample:1>", "<sample:3>", "1", "134217758", "false", "-1.956", "-0.5000000000000001", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesStroke", "int,java.awt.Stroke", "-1", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "-1.7976931348623153E308", "1247553218442497391", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getBaseLegendShape", "", "7"}, {"setRect", "java.awt.geom.Rectangle2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseLegendTextPaint", "java.awt.Paint", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelAnchorOffset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getPassCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateRangeMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:13>", "<sample:0>", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:2>", "<sample:8>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "<sample:2>", "-49", "5", "true"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:13>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "-2147483648", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>", "<sample:4>", "<sample:7>", "<sample:6>", "-4061", "2147483647", "true", "<sample:6>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"getY", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseURLGenerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendTextPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelsVisible", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#-1888961250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:9>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:8>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesToolTipGenerator", new String[]{"int"}, new String[]{"-2"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:13>", "<sample:4>", "<sample:9>", "-0.978", "<sample:7>", "<sample:1>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setDefaultEntityRadius", "int", "-30"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#-1997070606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getMiterLimit", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemToolTipGenerator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextPaint", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"70"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemFillPaint", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "0", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDefaultEntityRadius", new String[]{"int"}, new String[]{"2147483602"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#502#1447329987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clearSeriesPaints", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesStroke", "int", "-3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemFillPaint", new String[]{"int", "int", "boolean"}, new String[]{"3", "2", "true"}, false), new String[][]{{"getColorSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-607006503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendTextPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "4", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "<sample:8>", "5", "-6", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getURLGenerator", "int,int,boolean", "2147483647", "-4", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1683109270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateRangeMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:6>", "<sample:2>", "<sample:0>", "<sample:5>", "<null>", "<sample:9>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-43", "<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.AreaRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextPaint", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-2147483638", "false", "false"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseNegativeItemLabelPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelGenerator", new String[]{"int", "int", "boolean"}, new String[]{"-1", "5", "false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:8>", "<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:2>", "<sample:7>", "<sample:5>", "<sample:1>", "<null>", "-2139095039", "2147483647", "false", "<sample:4>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"32770", "true"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:5>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesPaint", ""}}), new String[][]{{"getItemLabelGenerator", "int,int,boolean", "0"}, {"getColumnCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDefaultEntityRadius", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemMiddle", new String[]{"java.lang.Comparable", "java.lang.Comparable", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.axis.CategoryAxis", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<s:cb>", "<s:b>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:9>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPlot", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"2147483647", "<sample:2>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendShape", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "isSeriesVisible", new String[]{"int"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getTreatLegendShapeAsLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPassCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemURLGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addEntity", "org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double", "<null>", "<sample:1>", "<sample:6>", "2147483647", "-5", "true", "4.0", "-1.956"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-6", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRowCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesStroke", "int", "-32"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-2147418112", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "2147483647", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesOutlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainLine", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "double", "java.awt.Paint", "java.awt.Stroke"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>", "-Infinity", "<sample:9>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clearSeriesStrokes", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "fireChangeEvent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesFillPaint", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelsVisible", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:1>", "<sample:0>", "<s:>", "1.0", "-1069547503", "NaN", "-Infinity", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendShape", new String[]{"int"}, new String[]{"47"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getURLGenerator", new String[]{"int", "int", "boolean"}, new String[]{"0", "-134217708", "false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"24", "<sample:7>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesShape", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemFillPaint", new String[]{"int", "int", "boolean"}, new String[]{"-5", "-12", "true"}, false), new String[][]{{"getBlue", "", "1"}, {"getComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint,boolean", "-2", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesShape", new String[]{"int"}, new String[]{"134217723"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesOutlinePaint", "int", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int", "boolean"}, new String[]{"-44", "2147483601", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:3>", "<sample:1>", "<s:ky>", "-1.736", "5", "NaN", "0.0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:10>", "<sample:2>", "<null>", "<sample:9>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendTextPaint", "int,java.awt.Paint", "-2147483648", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("894294124", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"16", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:2>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getToolTipGenerator", "int,int,boolean", "-2139095040", "-16", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#-1203086464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesShape", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#494#2039266684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:6>", "true"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemOutlineStroke", "int,int,boolean", "-2147483648", "16", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:13>", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:1>", "-2147483648", "-2", "true", "<null>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesToolTipGenerator", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseStroke", "java.awt.Stroke,boolean", "<sample:4>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupLegendShape", "int", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemOutlinePaint", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "8", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelAnchorOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawOutline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "-10", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<sample:2>", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesFillPaint", "int", "-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"2147483647", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "2147483622", "<sample:1>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=Dialog,name=Tahoma,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=Dialog, getFontName=Dialog.plain, getItal...#434#-437286162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:5>", "<sample:5>", "<sample:3>", "<sample:0>", "<sample:4>", "<sample:6>", "<sample:6>"}}), new String[][]{{"getPassCount", "", "4"}, {"getAutoPopulateSeriesShape", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1798375638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-20", "true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesStroke", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"5", "<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemPaint", new String[]{"int", "int", "boolean"}, new String[]{"-532676608", "2147483647", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPositiveItemLabelPosition", "int,int,boolean", "4", "124", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:3>", "false"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"1", "true", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotShape", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>", "<null>", "<sample:5>", "<sample:7>", "10", "-1", "true", "<sample:10>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseLegendShape", "java.awt.Shape", "<sample:5>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "isSeriesItemLabelsVisible", "int", "-41"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendTextFont", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-2139094986", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesToolTipGenerator", new String[]{"int"}, new String[]{"502"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"5", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,int[]", "2"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendTextPaint", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hitTest", new String[]{"double", "double", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"-0.0", "-1.7976931348623155E308", "<sample:0>", "<sample:4>", "<sample:5>", "<sample:7>", "<null>", "<sample:6>", "18", "-536870912", "true", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSelectedItemAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendTextPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"1", "<sample:10>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getURLGenerator", "int,int,boolean", "3", "-1073741824", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"124"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getURLGenerator", "int,int,boolean", "30", "2147483647", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemStroke", new String[]{"int", "int", "boolean"}, new String[]{"-6", "-2139095040", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelsVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesURLGenerator", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendShape", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-4.0,y=-4.0,w=8.0,h=8.0] {getCenterX=0.0, getCenterY=0.0, getHeight=8.0, getMaxX=4.0, getMaxY=4.0, getMinX=-4.0, getMinY=-4.0, getWidth=8.0, getX=-4.0, getY=-4.0, is...#212#92547860", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemPaint", new String[]{"int", "int", "boolean"}, new String[]{"62", "-2", "false"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#849505633", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDefaultEntityRadius", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#502#295052676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelFont", "int,int,boolean", "-5", "2147483647", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"10", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesOutlinePaint", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clearSeriesStrokes", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"4194261", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clearSeriesPaints", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendShape", new String[]{"int"}, new String[]{"54"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-4.0,y=-4.0,w=8.0,h=8.0] {getCenterX=0.0, getCenterY=0.0, getHeight=8.0, getMaxX=4.0, getMaxY=4.0, getMinX=-4.0, getMinY=-4.0, getWidth=8.0, getX=-4.0, getY=-4.0, is...#212#92547860", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelFont", "int", "2147483596"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:1>", "<sample:3>"}}), new String[][]{{"getRotationAnchor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateLabelAnchorPoint", "org.jfree.chart.labels.ItemLabelAnchor,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:6>", "-4.9E-324", "3.0", "<sample:0>"}}), new String[][]{{"add", "java.awt.geom.Point2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"-2139095039", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:4>", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:1>", "<sample:0>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelPaint", "int,java.awt.Paint,boolean", "16", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:7>", "true"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesCreateEntities", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"-10", "32", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseLegendShape", "java.awt.Shape", "<sample:5>"}}), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,char[]", "0"}, {"getGlyphLogicalBounds", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#-1888961250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"16777226", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "isItemLabelVisible", "int,int,boolean", "-536870954", "1", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextFont", new String[]{"int"}, new String[]{"157"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItem", "int,int", "-40", "54"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-2147483648", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:8>", "<sample:0>", "<s:`>", "NaN", "-1337982975", "1.9999999999999998", "-1.967", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:10>", "<sample:3>", "<sample:6>", "<sample:7>", "<sample:0>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean", "-33", "false"}}), new String[][]{{"distance", "double,double", "5"}, {"getX", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape", "boolean"}, new String[]{"2", "<sample:6>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "-1073741824", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"2147483647", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "2147483647", "true", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPositiveItemLabelPosition", "int,int,boolean", "16", "2147483647", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:13>", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:5>", "<null>", "<sample:3>"}, false), new String[][]{{"setLocation", "double,double", "6"}, {"setLocation", "java.awt.geom.Point2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemPaint", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "-2147483618", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean", "<sample:4>", "<sample:6>", "<sample:3>", "-4", "-2147483648", "true", "0.4", "NaN", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.NumberAxis3D", actual.getClass().getName());
  assertEquals("{getAutoRangeIncludesZero=true, getAutoRangeMinimumSize=1.0E-8, getAutoRangeStickyZero=true, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLa...#401#1866187882", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"124", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#492#84756826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesFillPaint", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean"}, new String[]{"1004", "true"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"2147483647", "<sample:7>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"-45", "<sample:0>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"<sample:2>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:5>", "false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#513#1320386820", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemFillPaint", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "131197", "false"}, false), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemLabelGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:8>", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:4>", "<sample:7>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#-1391013118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemOutlineStroke", new String[]{"int", "int", "boolean"}, new String[]{"-534773760", "-536870912", "false"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesShape", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "131196", "false", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendTextFont", new String[]{"int"}, new String[]{"1011"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesShape", "int,java.awt.Shape", "-2147483648", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getItemOutlinePaint", "int,int,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDataBoundsIncludesVisibleSeriesOnly", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"20", "5", "true"}, false), new String[][]{{"add", "double,double", "4"}, {"getWidth", "", "6"}, {"getCenterX", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"-536870912", "262392"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "124", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDataBoundsIncludesVisibleSeriesOnly", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setPlot", new String[]{"org.jfree.chart.plot.CategoryPlot"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getPositiveItemLabelPosition", "int,int,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDefaultEntityRadius", new String[]{"int"}, new String[]{"67108898"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setTreatLegendShapeAsLine", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#500#-90159401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getLegendItemURLGenerator", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<null>", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:6>", "<sample:1>", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelsVisible", "int,boolean", "-37", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint,boolean", "2147483647", "<sample:9>", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendShape", new String[]{"int", "java.awt.Shape"}, new String[]{"124", "<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPlot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "0", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesPaint", "int", "44"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesOutlineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
}
