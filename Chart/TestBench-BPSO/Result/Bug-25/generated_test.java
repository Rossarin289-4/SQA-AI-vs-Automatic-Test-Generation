package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean", "2147352575", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawVerticalItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.statistics.StatisticalCategoryDataset", "int", "int"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:6>", "0", "16386"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:1>", "<sample:6>", "<sample:5>", "<sample:6>", "<sample:7>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "double", "double", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "<sample:5>", "1", "2147352575", "-1.7976931348623157E308", "Infinity", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<sample:3>", "<sample:3>", "<sample:1>", "<sample:7>", "<sample:4>", "<sample:6>", "<sample:6>", "-1", "55", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<null>", "<sample:7>", "<sample:2>", "<sample:3>", "<sample:2>", "<sample:7>", "<sample:3>", "2", "1"}}, 3), new String[][]{{"getLineJoin", "", "5"}, {"getDashArray", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<null>", "false"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"64", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"<sample:3>", "true"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:3>", "<sample:2>", "<sample:5>", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:5>", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"5", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMinimumBarLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlineStroke", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"0", "<sample:7>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlinePaint", "int,int", "0", "-8"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-10", "<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "2147352575", "<sample:7>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"16422"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:9>", "<sample:1>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelGenerator", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:0>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", "double,org.jfree.chart.axis.CategoryAxis,int,int", "38.0", "<sample:2>", "20", "2145386495"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", "boolean,boolean", "false", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "-2147483648", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", "org.jfree.chart.entity.EntityCollection,org.jfree.data.category.CategoryDataset,int,int,java.awt.Shape", "<sample:6>", "<sample:4>", "1048576", "33554442", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getBase", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawVerticalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:1>", "<sample:2>", "<null>", "<sample:7>", "<sample:2>", "<sample:4>", "<null>", "4", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:5>", "<sample:3>", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:4>", "27"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"contains", "java.awt.geom.Rectangle2D", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMinimumBarLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<sample:0>"}}, 3), new String[][]{{"createStrokedShape", "java.awt.Shape", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:1>", "false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemToolTipGenerator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-2147483648", "<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesCreateEntities", "int", "2147483644"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-32772", "-2"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:4>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int"}, new String[]{"2", "2147352583"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesShape", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemURLGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<null>", "<sample:7>", "<sample:3>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:1>", "2147483647", "2147352634", "42"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseShape", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:7>", "-5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.DateAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeMinimumSize=2.0, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerBound=0.0, getLowerMargin=0.05, getTickMarkIn...#357#-2091899535", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "org.jfree.data.category.CategoryDataset", "int", "int", "java.awt.Shape"}, new String[]{"<sample:3>", "<null>", "12", "3", "<sample:2>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlineStroke", "int,int", "6", "-2147483648"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"2147483647", "<sample:8>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesShape", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:9>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape", "<sample:3>"}}, 1), new String[][]{{"getLegendItems", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"5", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPositionFallback", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setDrawBarOutline", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseURLGenerator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", "double", "5.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesURLGenerator", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesPaint", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.statistics.StatisticalCategoryDataset", "int", "int"}, new String[]{"<sample:5>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:10>", "<sample:2>", "<sample:3>", "20", "-96"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlineStroke", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "16514", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:9>", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:6>", "<sample:0>", "<sample:6>", "2", "-1073741824"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarW0", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.renderer.category.CategoryItemRendererState", "int", "int"}, new String[]{"<sample:7>", "<sample:9>", "<sample:0>", "<sample:0>", "<sample:4>", "1", "4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesPaint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition", "10", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseStroke", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:8>", "<sample:5>", "<sample:2>", "<null>", "<sample:1>", "<sample:2>", "<null>", "-4", "-5", "-2147352575"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:2>", "2147352575"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "<sample:0>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "double", "double", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>", "65546", "16326", "1.9999999999999998", "Infinity", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<d:1.5>"}}, 1), new String[][]{{"getBaseToolTipGenerator", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:1>", "<sample:7>", "<sample:5>", "10.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemToolTipGenerator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"1", "6"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemStroke", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlinePaint", "int,int", "12", "-522230"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:8>", "<sample:0>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isDrawBarOutline", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:13>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelGenerator", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesStroke", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItem", "int,int", "2", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#469#1822276227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int"}, new String[]{"-2147483648", "4"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLowerClip", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", "double", "-34.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"-1073741809", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesOutlineStroke", new String[]{"int"}, new String[]{"-16385"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesVisibleInLegend", "int", "-28"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<sample:4>", "<sample:1>", "<sample:8>", "1.7976931348623157E308"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>", "6", "<sample:11>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"-63", "<sample:2>", "false"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:4>", "-4092"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMaximumBarWidth", "double", "10.47"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator,boolean", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2147483647", "<sample:10>", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getIncludeBaseInRange", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<sample:4>", "<sample:4>", "<sample:7>", "<sample:1>", "0.5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemShape", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", "java.awt.Paint", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "2147352575", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesPositiveItemLabelPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"37", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"28", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:5>", "-0.5", "-1.7976931348623157E308", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", new String[]{"int", "int"}, new String[]{"-3", "40"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "fireChangeEvent", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.statistics.StatisticalCategoryDataset", "int", "int"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:1>", "2", "-47"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "-2147483648", "true", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlineStroke", "int,int", "42", "2147483587"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlineStroke", new String[]{"int", "int"}, new String[]{"2147483612", "4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"12", "4"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:1>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "false", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499388749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"2147483647", "true", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:4>", "<sample:5>", "<sample:0>", "2.9999999999999996"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"-256"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:c>"}}), new String[][]{{"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:3>", "<sample:7>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:1>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"33554440", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemURLGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesFillPaint", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesCreateEntities", new String[]{"int"}, new String[]{"6"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:3>", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getURLGenerator", new String[]{"int", "int"}, new String[]{"4", "0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:2>", "<sample:5>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-2147483648", "<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "2147434495", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:13>", "false"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#163339523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"-0.25", "<sample:1>", "-2147483565", "1048580"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", "org.jfree.chart.entity.EntityCollection,org.jfree.data.category.CategoryDataset,int,int,java.awt.Shape", "<null>", "<sample:1>", "5", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0107514304485675E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "<sample:3>", "<sample:5>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemCreateEntity", new String[]{"int", "int"}, new String[]{"2", "-6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:6>", "<sample:4>", "<sample:6>", "3.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:0>", "2146959359"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawOutline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMaximumBarWidth", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesVisible", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:3>", "<sample:3>", "<sample:0>", "<sample:6>", "<sample:7>", "<sample:1>", "<sample:0>", "32876", "-40"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setGradientPaintTransformer", new String[]{"org.jfree.chart.util.GradientPaintTransformer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"2147483647", "<null>", "false"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:10>", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "5", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"0", "37"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.data.category.CategoryDataset", "int", "int", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.labels.CategoryItemLabelGenerator", "java.awt.geom.Rectangle2D", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "-3", "-2", "<sample:0>", "<sample:0>", "<sample:8>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean,boolean", "-2147483648", "true", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", "double,org.jfree.chart.axis.CategoryAxis,int,int", "0.9999999999999999", "<sample:7>", "2147483647", "-2605054"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "1073741823", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"2147483647", "<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font", "boolean"}, new String[]{"10", "<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"55"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:0>", "false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "-1", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>", "0.75", "Infinity", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "0", "<sample:0>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.75, Infinity] {getX=0.75, getY=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:4>", "<sample:4>", "<sample:1>", "-1073741824", "-1", "NaN", "-4.9860383954140385E18", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlineStroke", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double", "<sample:1>", "<sample:9>", "<sample:2>", "<sample:1>", "-4986038395414039117"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarW0", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.renderer.category.CategoryItemRendererState", "int", "int"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>", "<sample:1>", "<sample:2>", "-2147483648", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>", "<sample:4>", "<sample:2>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.StatisticalBarRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", new String[]{"org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<null>", "<sample:3>", "2147483647", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "org.jfree.data.category.CategoryDataset", "int", "int", "double", "double", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<sample:6>", "-2097146", "-2147483648", "-10.0", "Infinity", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "2147483647", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.StandardGradientPaintTransformer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelFont", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "-2", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#471#-1525222109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"-2147483648", "<sample:3>", "false"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:2>", "<sample:4>", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"2147483647", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelGenerator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false), new String[][]{{"generateLabel", "org.jfree.data.category.CategoryDataset,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"251", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "fireChangeEvent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getColumnCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "org.jfree.data.category.CategoryDataset", "int", "int", "java.awt.Shape"}, new String[]{"<sample:3>", "<sample:3>", "16428", "-5", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#490#453797847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:6>", "<sample:4>", "8193", "16383", "2147483647"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"10", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:5>"}}), new String[][]{{"getDashPhase", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemToolTipGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"28", "true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:1>", "<sample:5>", "<sample:6>", "<null>", "<sample:0>", "<sample:5>", "<sample:3>"}}), new String[][]{{"getBlue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:6>", "<sample:3>", "<sample:0>", "56", "518", "-1.7976931348623157E308", "-8.988465674311579E307", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelAnchorOffset", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<null>", "<sample:6>", "<sample:0>", "<sample:2>", "<sample:1>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", ""}}), new String[][]{{"getBaseFillPaint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean"}, new String[]{"2147483647", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", "java.awt.Paint", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemURLGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#471#-677204883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", "boolean,boolean", "false", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesNegativeItemLabelPosition", "int", "2"}}), new String[][]{{"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.GradientPaintTransformType", actual.getClass().getName());
  assertEquals("GradientPaintTransformType.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#486#-208237267", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"2147483644", "43"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarL0L1", "double", "Infinity"}}), new String[][]{{"brighter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=3,g=3,b=3] {getAlpha=255, getBlue=3, getGreen=3, getRGB=-16579837, getRed=3, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1379200231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"-Infinity", "<sample:7>", "50", "0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#469#471127463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlinePaint", new String[]{"int", "int"}, new String[]{"2147483647", "17"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setGradientPaintTransformer", "org.jfree.chart.util.GradientPaintTransformer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-74", "<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemCreateEntity", new String[]{"int", "int"}, new String[]{"2", "2147352591"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:3>", "<sample:2>", "<sample:4>", "1073676287", "-2147483648", "0.25", "1.7976931348623157E308", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "16.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#438096869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", "int,boolean", "24", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemMargin", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorStroke", "java.awt.Stroke", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:3>", "-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", "java.awt.Font", "<sample:3>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:0>", "-2130706432", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:8>", "<sample:5>", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"8231", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPositionFallback", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemVisible", new String[]{"int", "int"}, new String[]{"2", "2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", "int,boolean", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke", "4", "<sample:9>"}}), new String[][]{{"contains", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", new String[]{"double"}, new String[]{"1.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-744368401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesPaint", new String[]{"int"}, new String[]{"2147352591"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:3>", "<sample:7>", "<sample:4>", "-0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesStroke", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:5>", "<sample:6>", "<null>", "<sample:3>", "<sample:3>", "<sample:2>", "<sample:8>", "-4194302", "2147483647"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesURLGenerator", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", ""}}), new String[][]{{"getBarWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", new String[]{"int", "int"}, new String[]{"10", "67125250"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesShape", "int,java.awt.Shape,boolean", "1", "<sample:6>", "true"}}), new String[][]{{"getRGB", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseShape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", ""}}), new String[][]{{"getFrame", "", "6"}, {"getMaxY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false), new String[][]{{"getNextFillPaint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"-4.98603839541404E19"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#487#427973216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRowCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-16402", "<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "6", "true", "true"}}), new String[][]{{"getNextStroke", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"getTransparency", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesVisible", new String[]{"int"}, new String[]{"20"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesToolTipGenerator", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:7>", "<sample:6>", "<sample:0>", "<sample:4>", "<sample:7>", "<null>", "<sample:3>", "33", "-1048572"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", "java.awt.Font", "<sample:4>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#468#-1557297524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"-4.9E-324", "<sample:7>", "2147483647", "2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false), new String[][]{{"createStrokedShape", "java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:5>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"-1", "-2"}, false, 4, new String[][]{}), new String[][]{{"getAngle", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"4", "<null>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"42", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemMargin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlineStroke", new String[]{"int"}, new String[]{"8"}, false, 5, new String[][]{}), new String[][]{{"getLineWidth", "", "3"}, {"getLineJoin", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:6>", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"3", "-4"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisible", "int", "55"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPlot", "org.jfree.chart.plot.CategoryPlot", "<sample:4>"}}), new String[][]{{"getItemLabelAnchor", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelAnchor", actual.getClass().getName());
  assertEquals("ItemLabelAnchor.OUTSIDE6", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "-2147483648", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"2147483647", "true", "true"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "16345"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setNegativeItemLabelPositionFallback", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:6>", "<sample:1>", "<null>", "<sample:4>", "<sample:1>", "<null>", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:0>", "<sample:0>", "<sample:9>", "2", "20", "0.2485", "0.375", "true"}}), new String[][]{{"setLocation", "double,double", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[-Infinity, -1.0] {getX=-Infinity, getY=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"0", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateLabelAnchorPoint", "org.jfree.chart.labels.ItemLabelAnchor,double,double,org.jfree.chart.plot.PlotOrientation", "<sample:6>", "5.0", "3.0", "<sample:9>"}}), new String[][]{{"getMiterLimit", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseURLGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", "org.jfree.chart.entity.EntityCollection,org.jfree.data.category.CategoryDataset,int,int,java.awt.Shape", "<sample:8>", "<sample:2>", "110", "2147483647", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getRGB", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8355712", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"4", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:2>", "true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesShape", "int,java.awt.Shape", "38", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>", "-1.7976931348623157E308", "NaN", "<sample:8>"}, false), new String[][]{{"setLocation", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[-1.0, 0.0] {getX=-1.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", ""}}), new String[][]{{"getBlue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:0>", "-2147483601"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPaint", "int,java.awt.Paint", "-2147483648", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
}
