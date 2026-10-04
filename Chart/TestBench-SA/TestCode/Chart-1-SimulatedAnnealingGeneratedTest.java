package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:11>", "false"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clearSeriesPaints", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"5", "<sample:5>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesStroke", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"-1", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseOutlinePaint", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemVisible", new String[]{"int", "int"}, new String[]{"-1073741824", "62"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:8>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelsVisible", "int", "4"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemLabelGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:7>", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendTextFont", "int,java.awt.Font", "3", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<null>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getTreatLegendShapeAsLine", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemFillPaint", "int,int,boolean", "4", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getTreatLegendShapeAsLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:4>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemURLGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemFillPaint", "int,int,boolean", "5", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-2147483638", "<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotShape", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<null>", "<sample:4>", "<sample:1>", "<sample:4>", "<null>", "1", "-1073741824", "true", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemFillPaint", "int,int,boolean", "0", "-2147483615", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesURLGenerator", "int", "-2147483638"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlineStroke", "java.awt.Stroke", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-1", "<sample:1>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendShape", "int,java.awt.Shape", "4097", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getNegativeItemLabelPosition", "int,int,boolean", "29", "62", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:1>", "<sample:6>", "<sample:6>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseURLGenerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<null>", "<null>", "<sample:6>", "4", "-2147483648", "false", "1247553218442497391", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<null>", "<sample:2>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelGenerator", "int", "4097"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesOutlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>", "2147483568", "2147483647", "false", "3.1188830461062432E16", "-51.0"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:9>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "4", "<sample:5>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "5", "<sample:2>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>", "9", "-2147483551", "true", "7.797207615265648E15", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<null>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset", "<sample:2>", "<sample:9>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesShape", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawRangeLine", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double", "java.awt.Paint", "java.awt.Stroke"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>", "<sample:7>", "3.1188830461062432E16", "<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "1073741823", "2147483647", "true", "NaN", "1.24755321844249728E18"}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:9>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:9>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "32768", "<sample:2>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "3", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>", "<null>", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "3", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0, getVisibleSeriesArray=[], getVisibleSeriesCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#1010433885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"0", "<sample:5>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeAnnotations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>", "<sample:2>", "<null>", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendShape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesCreateEntities", "int", "-1073741824"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-607006503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"-2147483615", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "4097", "<sample:3>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:7>", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"2147483568"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesURLGenerator", "int,org.jfree.chart.urls.CategoryURLGenerator", "5", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendTextFont", "int,java.awt.Font", "-1", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("894294124", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hitTest", new String[]{"double", "double", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"Infinity", "0.0", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:0>", "<sample:0>", "-1", "2147483519", "true", "<sample:7>"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseToolTipGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "-2147483647", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addEntity", "org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double", "<sample:7>", "<null>", "<sample:3>", "-2147483551", "1073741784", "false", "4.9E-324", "Infinity"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseOutlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "7.797207615265648E14", "1.24755321844249712E17", "<sample:7>"}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<null>", "<i:1>", "<d:1.5>", "7.797207615265648E15", "4097", "4.9E-324", "7.797207615265648E15", "<sample:0>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "updateCrosshairValues", "org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:4>", "<i:0>", "<i:-2>", "2.0", "1073741784", "-1.7976931348623157E308", "NaN", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "updateCrosshairValues", new String[]{"org.jfree.chart.plot.CategoryCrosshairState", "java.lang.Comparable", "java.lang.Comparable", "double", "int", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>", "<i:1>", "<s:b>", "1.2475532184424968E16", "-2147483648", "-51.099999999999994", "24.0", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseShape", "java.awt.Shape,boolean", "<sample:5>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean", "<sample:1>", "<sample:2>", "<sample:3>", "10", "2147483568", "false", "-4.0", "NaN", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:2>", "<null>", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>", "10", "124", "true", "1.7976931348623157E308", "NaN"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemToolTipGenerator", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:5>", "<sample:1>", "<sample:9>", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemToolTipGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#453080017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemURLGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:6>", "<null>", "<sample:9>", "-2147483643", "2147483647", "true", "NaN", "2.012"}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelGenerator", "int,int,boolean", "4062", "2147483647", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:2>", "-1073741824"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#494#2039266684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainLine", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "double", "java.awt.Paint", "java.awt.Stroke"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>", "7.797207615265648E14", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseCreateEntities", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:3>", "<sample:2>", "<sample:4>", "7.797207615265648E15", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addEntity", "org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean", "<sample:8>", "<sample:5>", "<sample:12>", "0", "-2147483551", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:7>", "<sample:1>", "<sample:3>", "<sample:0>", "0.0", "<sample:8>", "<sample:5>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDrawingSupplier", ""}}), new String[][]{{"getLegendItems", "", "4"}, {"clone", "", "5"}, {"add", "org.jfree.chart.LegendItem", "3"}, {"getItemCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"4097", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "hitTest", "double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "1.7976931348623157E308", "-51.0", "<sample:0>", "<sample:5>", "<null>", "<sample:7>", "<sample:0>", "<sample:1>", "2", "-2147483647", "false", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateRangeMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:6>", "<sample:4>", "<null>", "<sample:0>", "<null>", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemMiddle", new String[]{"java.lang.Comparable", "java.lang.Comparable", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.axis.CategoryAxis", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<i:1>", "<s:a>", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:6>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "hitTest", "double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "2.0", "7.797207615265648E15", "<sample:0>", "<sample:1>", "<sample:0>", "<null>", "<null>", "<sample:5>", "1073741784", "1", "true", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int", "boolean"}, new String[]{"-1073741730", "1610612732", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getURLGenerator", "int,int,boolean", "-1", "1073741784", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clone", ""}}, 2), new String[][]{{"getTextAnchor", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.TOP_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "2147483647", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clone", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseItemLabelGenerator", ""}}, 3), new String[][]{{"getAngle", "", "2"}, {"getAngle", "", "7"}, {"getItemLabelAnchor", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelAnchor", actual.getClass().getName());
  assertEquals("ItemLabelAnchor.OUTSIDE6", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"-1073741824"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisible", "boolean", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:2>", "<sample:4>", "<sample:4>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:7>", "<null>", "<sample:4>", "2147483568", "2147483647", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:2>", "<sample:6>", "<sample:1>", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:12>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<null>", "<sample:8>", "<sample:5>", "-2147483648", "-1", "true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:6>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator", "<sample:10>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:5>", "<sample:2>", "<sample:5>", "<sample:4>", "<sample:1>", "<sample:6>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:1>", "0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.ModuloAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeIncludesZero=true, getAutoRangeMinimumSize=1.0E-8, getAutoRangeStickyZero=true, getDisplayEnd=90.0, getDisplayStart=270.0, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=a, getLab...#382#1917300931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemPaint", "int,int,boolean", "2147483623", "-1073741821", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:7>", "<sample:7>", "<null>", "1.0", "<sample:0>", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<null>", "<sample:4>", "<sample:3>", "<sample:5>", "<sample:0>"}}), new String[][]{{"getLineJoin", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:10>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemCreateEntity", "int,int,boolean", "5", "2", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "isSeriesVisible", "int", "2"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "2147483647", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:6>", "true"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:2>", "true"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke,boolean", "2", "<sample:1>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"5", "<sample:5>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesStroke", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"3", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelPaint", "int", "-13"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getTreatLegendShapeAsLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemURLGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:2>", "false"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:3>", "false"}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:8>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotBounds", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:7>", "<sample:3>", "<null>", "<sample:2>", "<sample:0>", "3", "2", "false", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:8>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotBounds", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:7>", "<sample:3>", "<null>", "<sample:2>", "<sample:0>", "3", "2", "false", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1683109270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"10", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-1073741819", "<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"-11"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean"}, new String[]{"-2147483648", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setItemLabelAnchorOffset", "double", "1.24755321844249728E18"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "2147483647", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendShape", "int,java.awt.Shape", "4097", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getNegativeItemLabelPosition", "int,int,boolean", "29", "62", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "1", "false", "true"}}, 2), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelPaint", new String[]{"int", "int", "boolean"}, new String[]{"-1", "2147483647", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendTextPaint", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "isSeriesVisibleInLegend", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:8>", "<sample:9>", "<sample:1>", "2147483591", "-2147483647", "false", "6.2377660922124864E17", "0.0"}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDrawingSupplier", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:8>", "<null>", "<sample:9>", "2147483568", "2147483647", "false", "3.1188830461062432E16", "51.0"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:9>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "2147483647", "<sample:2>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke", "0", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:12>", "<null>", "<sample:5>", "-2147483585", "2147483613", "false", "-7.797207615265648E15", "Infinity"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:9>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelGenerator", "int", "-2147483638"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setDataBoundsIncludesVisibleSeriesOnly", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseSeriesVisibleInLegend", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesStroke", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#623716442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendShape", "int,java.awt.Shape", "-1", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemCreateEntity", "int,int,boolean", "-1", "5", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "<sample:1>", "9", "2147483571", "true", "7.797207615265648E16", "NaN"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:5>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset", "<sample:2>", "<sample:9>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:10>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendTextFont", new String[]{"int", "java.awt.Font"}, new String[]{"-2147483648", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>", "-2147483593", "9", "false", "7.7972076152656486E17", "NaN"}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:5>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:9>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#941897382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<null>", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesStroke", "int,java.awt.Stroke,boolean", "-2147483638", "<sample:3>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendTextFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRowCount", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean", "10", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"-2147483551", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesToolTipGenerator", "int", "5"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setTreatLegendShapeAsLine", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendTextPaint", new String[]{"int"}, new String[]{"-2147483551"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelPaint", "int,java.awt.Paint", "-2147483615", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.AreaRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemURLGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.AreaRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotShape", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:1>", "9", "5", "false", "<sample:3>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupLegendTextFont", "int", "3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesShape", "int", "2147483647"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemCreateEntity", "int,int,boolean", "4097", "2", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesVisible", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseOutlinePaint", "java.awt.Paint,boolean", "<sample:7>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPositiveItemLabelPosition", "int,int,boolean", "9", "-1073741824", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:4>", "true"}}, 3), new String[][]{{"getDashPhase", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:4>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:6>", "<sample:0>", "<sample:4>", "<sample:2>"}}, 3), new String[][]{{"getDashPhase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#725507389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:3>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:6>", "<sample:0>", "<sample:6>", "<sample:2>"}}, 1), new String[][]{{"getDashPhase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#725507389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesPositiveItemLabelPosition", new String[]{"int"}, new String[]{"9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"-1073743872"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "3", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseStroke", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"1073741792"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "2", "<sample:0>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"5", "<sample:7>", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesFillPaint", "int", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "-4", "<null>"}}, 1), new String[][]{{"getLineJoin", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemCreateEntity", new String[]{"int", "int", "boolean"}, new String[]{"0", "2147483647", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemCreateEntity", new String[]{"int", "int", "boolean"}, new String[]{"0", "2147483647", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemCreateEntity", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "2147483647", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#494#2039266684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "124", "<sample:0>"}}, 2), new String[][]{{"getGreen", "", "5"}, {"getColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "124", "<sample:0>"}}, 2), new String[][]{{"getGreen", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "124", "<sample:0>"}}, 2), new String[][]{{"getRGBColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-2147483648", "<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseURLGenerator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2147483647", "<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemVisible", "int,int", "3", "4097"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseURLGenerator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendTextFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesStroke", "int", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#941897382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "5"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesShape", "int", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:0>", "5"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesShape", "int", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#492#84756826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "true", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelFont", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemStroke", "int,int,boolean", "-2147483648", "2", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1683109270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:6>", "true"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clearSeriesPaints", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean"}, new String[]{"3", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "4", "<sample:6>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendTextFont", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:2>", "true"}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:5>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#941897382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupLegendTextPaint", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotBounds", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:7>", "<sample:4>", "<sample:0>", "2147483647", "4", "true", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"3", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseOutlinePaint", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#-1391013118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDefaultEntityRadius", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemVisible", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelsVisible", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelGenerator", "int,int,boolean", "-2147483648", "-1073741824", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:7>", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendTextFont", "int,java.awt.Font", "3", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "isItemLabelVisible", new String[]{"int", "int", "boolean"}, new String[]{"3", "3", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:2>", "<null>", "<sample:3>", "1", "62", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getTreatLegendShapeAsLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:2>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotBounds", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:7>", "<sample:3>", "<null>", "<sample:2>", "<sample:0>", "3", "2", "false", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"3", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setItemLabelAnchorOffset", "double", "1247553218442497391"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelsVisible", "int,boolean", "-1073741798", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<null>", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#494#2039266684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-2147483648", "<sample:3>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-2147483648", "<sample:4>", "false"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "2", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2147483647", "<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:9>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "2", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:6>", "<sample:1>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemFillPaint", "int,int,boolean", "0", "5", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#725507389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemFillPaint", "int,int,boolean", "0", "2", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean"}, new String[]{"-2147483648", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setItemLabelAnchorOffset", "double", "1247553218442497391"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:1>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"1", "<sample:1>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>", "NaN", "2.0", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseCreateEntities", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "NaN", "2.0", "<sample:3>"}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseCreateEntities", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendItemToolTipGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextPaint", new String[]{"int"}, new String[]{"62"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "1", "false", "true"}}), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setDataBoundsIncludesVisibleSeriesOnly", "boolean", "false"}}), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"4", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:1>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "-2147483615", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"-2097150", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:1>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "-2147483615", "<sample:7>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"2147483647", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:1>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "-2147483615", "<sample:7>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:1>", "false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesShape", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"-2147483615"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<null>", "<sample:6>", "<sample:6>", "4", "-2147483648", "false", "4.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<null>", "<sample:7>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<null>", "<null>", "<sample:6>", "4", "-2147483648", "false", "4.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<null>", "<sample:2>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSelectedItemAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getAutoPopulateSeriesShape", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke,boolean", "4097", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.RenderAttributes", actual.getClass().getName());
  assertEquals("{getAllowNull=false, getDefaultCreateEntity=null, getDefaultLabelVisible=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getToolTipGenerator", "int,int,boolean", "-1073741824", "5", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:3>", "<null>", "<sample:1>", "2147483591", "2147483647", "false", "1247553218442497391", "0.0"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDataBoundsIncludesVisibleSeriesOnly", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemShape", "int,int,boolean", "10", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextFont", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setDataBoundsIncludesVisibleSeriesOnly", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseFillPaint", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseNegativeItemLabelPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1798375638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-2147483615"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"5", "<null>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:12>", "<null>", "<sample:7>", "-2147483585", "2147483613", "false", "-7.797207615265648E15", "Infinity"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:9>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelGenerator", "int", "-2147483638"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setDataBoundsIncludesVisibleSeriesOnly", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"4097", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseShape", "java.awt.Shape", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>", "4097", "5", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>", "62", "-2147483551", "true", "7.797207615265648E15", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:5>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesStroke", "int", "2147483591"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "java.awt.Shape", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>", "9", "-2147483551", "true", "7.797207615265648E15", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:5>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset", "<sample:2>", "<sample:9>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelAnchorOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getURLGenerator", new String[]{"int", "int", "boolean"}, new String[]{"3", "-1", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"2147483647", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesItemLabelFont", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<null>", "<sample:0>", "<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesShape", "int,java.awt.Shape,boolean", "29", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotBounds", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<null>", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:2>", "-2147483648", "2147483568", "false", "<sample:2>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setTreatLegendShapeAsLine", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendTextPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisible", "int,java.lang.Boolean", "29", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesItemLabelGenerator", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainLine", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke", "<sample:6>", "<sample:2>", "<sample:3>", "7.797207615265648E15", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelFont", new String[]{"int", "int", "boolean"}, new String[]{"5", "4097", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke", "-2147483638", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=Dialog,name=Tahoma,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=Dialog, getFontName=Dialog.plain, getItal...#434#-437286162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItemToolTipGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"-2147483551", "-2147483615"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemCreateEntity", "int,int,boolean", "4", "-1073741824", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"4.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#1505191837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"2147483647", "<sample:1>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:0>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseShape", "java.awt.Shape", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesStroke", new String[]{"int"}, new String[]{"9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"-51.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#10841202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDataBoundsIncludesVisibleSeriesOnly", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"0", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendTextPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"0", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendShape", new String[]{"int"}, new String[]{"2147483568"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int", "boolean"}, new String[]{"29", "-2147483648", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"9", "-2147483638", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawOutline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.AreaRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelPaint", "int,java.awt.Paint", "-2147483615", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#-1203086464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-2147483638", "true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:2>", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesVisible", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false), new String[][]{{"getDashPhase", "", "1"}, {"getDashArray", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getPositiveItemLabelPosition", "int,int,boolean", "9", "-1073741824", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:4>", "true"}}), new String[][]{{"getDashPhase", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:4>", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:6>", "<sample:0>", "<sample:4>", "<sample:2>"}}), new String[][]{{"getDashPhase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#495#725507389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"-2147483638", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"-2147483551"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelFont", "int,int,boolean", "-2147483551", "-1", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"-2147483551"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelFont", "int,int,boolean", "-2147483551", "-1", "true"}}), new String[][]{{"getItemLabelAnchor", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelAnchor", actual.getClass().getName());
  assertEquals("ItemLabelAnchor.OUTSIDE6", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesShape", "int,java.awt.Shape", "5", "<sample:1>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendTextFont", "int", "-2147483638"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"5", "<sample:7>", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesFillPaint", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "2", "<null>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseCreateEntities", ""}}), new String[][]{{"getLineJoin", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1"}, false), new String[][]{{"getGreen", "", "5"}, {"getRGBComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "124", "<sample:0>"}}), new String[][]{{"getRGBColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "clearSeriesPaints", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:7>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendShape", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean"}, new String[]{"9", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>", "<sample:7>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendShape", new String[]{"int", "java.awt.Shape"}, new String[]{"4097", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "5", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getTreatLegendShapeAsLine", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesOutlinePaint", new String[]{"int"}, new String[]{"62"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseNegativeItemLabelPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemShape", new String[]{"int", "int", "boolean"}, new String[]{"3", "4097", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:2>", "<sample:0>"}}), new String[][]{{"intersectsLine", "java.awt.geom.Line2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseLegendTextFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesStroke", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"29", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesOutlinePaint", "int", "2147483591"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-4194275", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesOutlinePaint", "int", "2147483591"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "createHotSpotShape", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:6>", "<sample:2>", "<sample:5>", "<sample:7>", "<null>", "<sample:4>", "-1", "-2147483551", "true", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#492#941897382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"-2147483648", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>", "<null>", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "3", "<sample:2>", "true"}}), new String[][]{{"setSelectionState", "org.jfree.data.category.CategoryDatasetSelectionState", "2"}, {"getEntityCollection", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.entity.StandardEntityCollection", actual.getClass().getName());
  assertEquals("{getEntityCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#1010433885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.data.category.CategoryDataset", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>", "<sample:1>", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "3", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemURLGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#492#84756826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "5"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupSeriesShape", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#286606580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#849505633", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "createHotSpotShape", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "boolean", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>", "<null>", "<sample:2>", "<sample:9>", "-2147483648", "-2147483638", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"3", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemLabelAnchorOffset", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesVisibleInLegend", "int", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-2147483648", "<sample:4>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"29", "<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"27", "<sample:5>", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "false", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getSeriesCreateEntities", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1798375638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "false", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1798375638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "5", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "5", "<sample:7>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "0", "<sample:0>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#492#84756826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "5", "<sample:0>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "0", "<sample:0>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#492#84756826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesPaint", "int,java.awt.Paint,boolean", "5", "<sample:0>", "true"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "0", "<sample:0>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBasePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font", "boolean"}, new String[]{"-2147483615", "<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendTextFont", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setLegendItemURLGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendTextFont", new String[]{"int"}, new String[]{"14"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clone", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getLegendItems", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDrawingSupplier", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupLegendTextFont", new String[]{"int"}, new String[]{"62"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseURLGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-2147483615", "true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "lookupLegendTextPaint", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:7>", "<sample:5>", "<null>", "<null>", "<sample:5>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getBaseLegendTextFont", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getLegendTextFont", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "clone", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getItemOutlineStroke", "int,int,boolean", "-1073741824", "5", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getRowCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setDataBoundsIncludesVisibleSeriesOnly", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<sample:2>"}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#494#1071903626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"62"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setTreatLegendShapeAsLine", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemOutlineStroke", new String[]{"int", "int", "boolean"}, new String[]{"2147483568", "-2147483551", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getDefaultEntityRadius", ""}, {"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setLegendTextPaint", "int,java.awt.Paint", "2", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelGenerator", new String[]{"int", "int", "boolean"}, new String[]{"2", "2147483591", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean", "<sample:6>", "<sample:2>", "<sample:9>", "-1", "5", "false", "2.0", "Infinity", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelPaint", new String[]{"int", "int", "boolean"}, new String[]{"0", "10", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemCreateEntity", new String[]{"int", "int", "boolean"}, new String[]{"2147483568", "2147483568", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "getBaseLegendTextPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getDataBoundsIncludesVisibleSeriesOnly", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:6>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "getItemLabelGenerator", new String[]{"int", "int", "boolean"}, new String[]{"3", "5", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#493#-1945769957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "org.jfree.chart.renderer.category.AreaRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "1", "true", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
