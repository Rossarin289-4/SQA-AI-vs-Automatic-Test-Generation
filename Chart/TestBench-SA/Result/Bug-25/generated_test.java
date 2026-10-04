package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-1073741884", "2147483647"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", "int,int", "5", "2"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:a>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator", "<sample:1>"}}), new String[][]{{"getBaselineFor", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:1>", "5", "-1"}}, 1), new String[][]{{"getDomainAxis", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", "org.jfree.chart.entity.EntityCollection,org.jfree.data.category.CategoryDataset,int,int,java.awt.Shape", "<sample:7>", "<sample:2>", "6", "10", "<sample:7>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelPaint", "java.awt.Paint,boolean", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:5>", "<null>", "<sample:4>", "<sample:1>", "<null>", "<sample:6>", "<null>", "1", "0", "2"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawVerticalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:1>", "<sample:1>", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:3>", "<sample:0>", "2", "-1073741884"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setDrawBarOutline", "boolean", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", "java.awt.Paint", "<sample:9>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMinimumBarLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setDrawBarOutline", "boolean", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseFillPaint", "java.awt.Paint,boolean", "<sample:4>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"createStrokedShape", "java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2", "<null>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "1", "<null>", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getIncludeBaseInRange", ""}}, 2), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-2147483206", "2143272951"}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelPaint", "int", "-4"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", "int,int", "-2147483648", "0"}}, 2), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "3"}, {"isTransformed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"10", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"3", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#469#-19561751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"-2147483648", "false"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}}, 1), new String[][]{{"getDomainAxis", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:1>", "5", "-1"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", "int,int", "5", "0"}}, 2), new String[][]{{"getDomainAxisCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:1>", "5", "-1"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", "int,int", "5", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisible", new String[]{"int"}, new String[]{"0"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseFillPaint", "java.awt.Paint,boolean", "<sample:7>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlinePaint", "int,int", "1", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "org.jfree.data.category.CategoryDataset", "int", "int", "java.awt.Shape"}, new String[]{"<sample:0>", "<sample:7>", "2", "2", "<sample:3>"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"4", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemPaint", "int,int", "3", "1"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", "java.awt.Font,boolean", "<null>", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", "int,int", "3", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseSeriesVisible", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemShape", "int,int", "10", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"10", "<sample:8>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-10", "<sample:8>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarW0", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.renderer.category.CategoryItemRendererState", "int", "int"}, new String[]{"<sample:7>", "<sample:1>", "<sample:5>", "<sample:4>", "<sample:5>", "10", "5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", "org.jfree.data.category.CategoryDataset", "<sample:1>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", "java.awt.Stroke,boolean", "<sample:5>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItem", "int,int", "-268402711", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItem", "int,int", "-134201355", "-2"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "5.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-39055373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"2147483647", "<sample:8>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>", "<sample:0>", "Infinity"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:kecy>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:7>", "false"}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:aa>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:5>", "false"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "equals", "java.lang.Object", "<s:ab0C>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlinePaint", "int,int", "262145", "6"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator,boolean", "<null>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"-1073741884"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<null>", "<sample:7>", "<sample:3>", "-2147483648", "-10", "0.75", "5.0", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int"}, new String[]{"-2147483648", "-1073741884"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:3>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesFillPaint", "int", "4"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:4>", "<sample:7>", "<sample:6>", "<sample:11>", "<sample:7>", "<sample:6>", "<null>", "2147483647", "-2147483648", "-1074004005"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:4>", "<sample:7>", "<sample:6>", "<sample:11>", "<sample:5>", "<sample:6>", "<null>", "2147483647", "-2147483648", "-1074004005"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:4>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "1", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:6>", "<null>", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:6>", "<sample:4>", "-2147483648", "0", "2097154"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawVerticalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:1>", "<sample:1>", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:4>", "2", "-1073741884"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", new String[]{"org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.renderer.category.CategoryItemRendererState"}, new String[]{"<null>", "<sample:3>", "2", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getURLGenerator", new String[]{"int", "int"}, new String[]{"6", "3"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:4>", "<sample:4>"}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "true", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<sample:6>", "<null>", "<sample:7>", "<null>", "<sample:0>", "<sample:2>", "<sample:8>", "-3", "-1073741884", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:0>", "0", "<sample:6>"}}, 3), new String[][]{{"getDashPhase", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:2>", "-10", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:2>", "-10", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:2>", "-10", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesPositiveItemLabelPosition", "int", "52"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}}, 3), new String[][]{{"getDashArray", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:7>", "<sample:2>", "-10", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesPositiveItemLabelPosition", "int", "52"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setIncludeBaseInRange", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarL0L1", "double", "NaN"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#471#-677204883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", "java.awt.Paint", "<sample:2>"}}, 1), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "6"}, {"addAll", "org.jfree.chart.LegendItemCollection", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:2>", "10"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisible", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-3", "<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:3>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesURLGenerator", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"6", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-50", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:6>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:5>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", "double", "-1.0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", "int,java.awt.Paint", "10", "<sample:1>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer", "<sample:5>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#-325859254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", new String[]{"double"}, new String[]{"NaN"}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemStroke", "int,int", "-1", "-1073741824"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemLabelGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:4>", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"4.9860383954140385E18"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:6>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#488#-120238650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "<sample:0>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setNegativeItemLabelPositionFallback", "org.jfree.chart.labels.ItemLabelPosition", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"-2", "<null>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemShape", "int,int", "5", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:4>", "<null>", "<sample:2>", "2147483647", "2147483647", "1.7976931348623157E308", "1.0", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesVisible", "int", "2147483647"}}, 2), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseStroke", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarW0", new String[]{"org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.renderer.category.CategoryItemRendererState", "int", "int"}, new String[]{"<sample:1>", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:5>", "2", "4"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawOutline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>", "<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"-1.7976931348623157E308", "<sample:7>", "2147483647", "6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.498077612385263E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"5", "true", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-33", "true", "true"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2", "<sample:1>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlineStroke", new String[]{"int", "int"}, new String[]{"0", "3"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemOutlineStroke", new String[]{"int", "int"}, new String[]{"0", "68"}, false), new String[][]{{"getDashArray", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"0", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-2147483136", "2147483647"}, false), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-2147483206", "2143272951"}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", "int,int", "2147483647", "0"}}), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "3"}, {"isTransformed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-1073741824", "2147483647"}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", "int,int", "1073741823", "0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemStroke", "int,int", "0", "2147483647"}}), new String[][]{{"getBaselineFor", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "4", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint", "4", "<sample:5>"}}), new String[][]{{"getAlpha", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", "boolean,boolean", "false", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", "int,java.awt.Stroke,boolean", "2147483647", "<sample:3>", "false"}}), new String[][]{{"getAlpha", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "10", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPlot", new String[]{"org.jfree.chart.plot.CategoryPlot"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelGenerator", "int,int", "-1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:1>", "5", "-1"}}), new String[][]{{"getDomainAxis", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:7>", "<sample:1>", "5", "-1"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemFillPaint", "int,int", "5", "0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", "boolean,boolean", "true", "true"}}), new String[][]{{"getDomainAxisCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisible", new String[]{"int"}, new String[]{"-1073741884"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "org.jfree.data.category.CategoryDataset", "int", "int", "java.awt.Shape"}, new String[]{"<sample:0>", "<null>", "2", "2", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addItemEntity", new String[]{"org.jfree.chart.entity.EntityCollection", "org.jfree.data.category.CategoryDataset", "int", "int", "java.awt.Shape"}, new String[]{"<sample:0>", "<sample:7>", "2", "2", "<sample:3>"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseFillPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesStroke", new String[]{"int"}, new String[]{"3"}, false), new String[][]{{"getDashPhase", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"4", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesShape", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPassCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setIncludeBaseInRange", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:2>", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-1073741884", "<sample:4>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"3", "<sample:4>", "true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"3", "false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-3", "false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape,boolean", "<sample:6>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font", "boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2", "<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlineStroke", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", new String[]{"double"}, new String[]{"0.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"-2147483648", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator"}, new String[]{"2147483647", "<sample:8>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBase", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"5", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:2>", "<sample:4>", "1", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"10", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:0>", "6"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesNegativeItemLabelPosition", "int", "1"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", "double", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#1693942375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", "double", "6.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#115806510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePositiveItemLabelPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "4"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMaximumBarWidth", "double", "2.0"}}), new String[][]{{"getAngle", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-1073741884", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"5", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemCreateEntity", "int,int", "-1073741884", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "removeAnnotations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", "int,int", "1", "-1073741884"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", "int,int", "1", "-1073741884"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition", "-10", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>", "<sample:0>", "Infinity"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"2", "6"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMinimumBarLength", "double", "NaN"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemPaint", new String[]{"int", "int"}, new String[]{"-1", "-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-2147483648", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setMaximumBarWidth", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean,boolean", "true", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setGradientPaintTransformer", new String[]{"org.jfree.chart.util.GradientPaintTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesToolTipGenerator", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"-10", "-1"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarWidth", "org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,int,org.jfree.chart.renderer.category.CategoryItemRendererState", "<sample:0>", "<sample:4>", "5", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setGradientPaintTransformer", "org.jfree.chart.util.GradientPaintTransformer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:7>", "<sample:4>", "<sample:4>", "<sample:6>", "<sample:5>", "<sample:6>", "<sample:3>", "2", "-1073741884", "-1073741884"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getIncludeBaseInRange", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.data.category.CategoryDataset,int,int,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.labels.CategoryItemLabelGenerator,java.awt.geom.Rectangle2D,boolean", "<null>", "<sample:2>", "-10", "4", "<sample:0>", "<sample:2>", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<sample:2>", "<sample:6>", "<null>", "<sample:5>", "-1.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBasePaint", "java.awt.Paint,boolean", "<null>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesShape", "int,java.awt.Shape", "-1", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<sample:6>", "<null>", "<sample:6>", "<sample:0>", "<sample:7>", "<null>", "<sample:6>", "5", "10", "10"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "5", "-1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#469#-19561751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>", "<sample:7>", "<sample:0>", "<sample:0>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawHorizontalItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.statistics.StatisticalCategoryDataset", "int", "int"}, new String[]{"<sample:4>", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:5>", "<sample:0>", "<sample:3>", "-1", "5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesPaint", "int", "2"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelFont", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"-10", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesShape", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseToolTipGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesFillPaint", new String[]{"int"}, new String[]{"4"}, false), new String[][]{{"getComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelGenerator", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:6>", "false"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", "org.jfree.chart.urls.CategoryURLGenerator,boolean", "<sample:0>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", new String[]{"java.awt.Graphics2D", "org.jfree.data.category.CategoryDataset", "int", "int", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.labels.CategoryItemLabelGenerator", "java.awt.geom.Rectangle2D", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "1", "-10", "<sample:7>", "<sample:2>", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"2", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelPaint", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#490#-621539675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499388749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setNegativeItemLabelPositionFallback", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#471#-1525222109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.25"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "4", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#-126774529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.25"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "4", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#472#220982454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.125"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "4", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#473#918087075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.125"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "4", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#472#1142638706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelFont", "int,java.awt.Font,boolean", "5", "<sample:4>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelFont", "int,int", "1", "3"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#490#-1280751719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getURLGenerator", new String[]{"int", "int"}, new String[]{"-1", "3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"10", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesFillPaint", "int", "2147483647"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#489#1166968896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-119317845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "false", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "org.jfree.chart.util.Layer"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getGradientPaintTransformer", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isSeriesVisible", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", "int,java.awt.Paint,boolean", "-2147483648", "<sample:0>", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getIncludeBaseInRange", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"-1", "3"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:7>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlineStroke", "int", "5"}}), new String[][]{{"getColorComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"2147483647", "<null>", "true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPositiveItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"-2147483647", "<null>", "true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:6>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:6>", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPositiveItemLabelPosition", new String[]{"int", "int"}, new String[]{"6", "10"}, false), new String[][]{{"getItemLabelAnchor", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelAnchor", actual.getClass().getName());
  assertEquals("ItemLabelAnchor.OUTSIDE12", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setIncludeBaseInRange", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateBarL0L1", "double", "NaN"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBasePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#471#-677204883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorPaint", "java.awt.Paint", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-10", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double", "<sample:1>", "<sample:3>", "<sample:1>", "<sample:5>", "-1.0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "3", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"51", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double", "<sample:1>", "<sample:3>", "<sample:1>", "<sample:5>", "-1.0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "3", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"0.0", "<sample:5>", "-1073741884", "4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"0.0", "<sample:1>", "-1073741884", "2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"0.0", "<null>", "-1073741884", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateSeriesWidth", new String[]{"double", "org.jfree.chart.axis.CategoryAxis", "int", "int"}, new String[]{"2.1", "<sample:4>", "5", "157"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0013375796178343947", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<null>", "5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDomainAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:7>", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"0", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesFillPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemVisible", new String[]{"int", "int"}, new String[]{"-1073741884", "-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelFont", "java.awt.Font,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"4", "<null>", "true"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:3>", "<sample:4>", "<sample:0>", "<sample:2>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<null>", "<sample:3>", "<sample:0>", "<sample:3>", "<null>", "<sample:2>", "<sample:2>", "4", "10", "-1073741884"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-2147483648", "<sample:1>", "false"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getAutoPopulateSeriesOutlineStroke", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean"}, new String[]{"3", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "isItemLabelVisible", "int,int", "10", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"3", "<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"3", "<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-1974526669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"-1021", "<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBase", "double", "0.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"2147483647", "<sample:7>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setPositiveItemLabelPositionFallback", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"6", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-125", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseItemLabelsVisible", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "1", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelsVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#469#-260307199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:5>", "5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.SymbolAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeIncludesZero=true, getAutoRangeMinimumSize=1.0E-8, getAutoRangeStickyZero=false, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=a, getLabelAngle=0.0, getLabelToolTip=null, getLabe...#376#-1527351687", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1379200231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:5>", "5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", ""}}), new String[][]{{"isGridBandsVisible", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1379200231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<sample:0>", "5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItemLabelGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1379200231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getErrorIndicatorPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "1", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"-4986038395414039117"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:6>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#489#480082499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"4.9860383954140396E18"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#488#-444862042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"4.9860383954140385E18"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#488#-120238650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#475#1999051176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemMargin", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#476#-319978291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setNegativeItemLabelPositionFallback", "org.jfree.chart.labels.ItemLabelPosition", "<sample:5>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", "int,java.lang.Boolean", "1", "<null>"}}), new String[][]{{"clone", "", "2"}, {"add", "org.jfree.chart.LegendItem", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"10"}, false), new String[][]{{"getBlue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"27"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "3", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#471#-1525222109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "3", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}}), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:7>", "<sample:1>", "<sample:3>", "<sample:5>", "<sample:3>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape", "<null>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesNegativeItemLabelPosition", "int", "-10"}}), new String[][]{{"distance", "java.awt.geom.Point2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPositionFallback", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "3.0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#1438610351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "-29.0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getMaximumBarWidth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#472#1707555568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"-112"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean", "4", "true"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:4>", "<null>", "<sample:2>", "2147483647", "-1", "-Infinity", "1.0", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesCreateEntities", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"2", "<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getLowerClip", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesOutlineStroke", "int", "-1073741884"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1371913157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesOutlinePaint", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "addChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getToolTipGenerator", "int,int", "1", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setAutoPopulateSeriesFillPaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseShape", "java.awt.Shape", "<sample:4>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getNegativeItemLabelPositionFallback", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawDomainGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<null>", "<sample:1>", "<sample:5>", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesFillPaint", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getIncludeBaseInRange", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#176723717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "4", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "4", "<null>", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#490#453797847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"-6"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", "int,java.lang.Boolean,boolean", "8", "<null>", "false"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "-1.7976931348623157E308"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<null>", "<sample:2>", "<sample:0>", "<null>", "<sample:1>", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "-Infinity"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<null>", "<sample:2>", "<sample:0>", "<null>", "<sample:1>", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#476#-1121015889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#475#-615322772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setItemLabelAnchorOffset", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesVisible", new String[]{"int", "java.lang.Boolean"}, new String[]{"-2147483648", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlineStroke", "int", "0"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "-2147483648", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getRangeAxis", new String[]{"org.jfree.chart.plot.CategoryPlot", "int"}, new String[]{"<null>", "6"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "6", "<sample:0>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"-2147483648", "<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getAngle", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setErrorIndicatorStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getDrawingSupplier", ""}}), new String[][]{{"getAngle", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemPaint", "int,int", "-1073741884", "-1073741884"}}), new String[][]{{"getAngle", "", "4"}, {"getTextAnchor", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.TOP_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getUpperClip", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"-2147483648", "2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"1073741884", "2147483624"}, false, 2, new String[][]{}, 1), new String[][]{{"getRGBComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"-2", "2147483645"}, false), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getItemLabelPaint", new String[]{"int", "int"}, new String[]{"2", "1073741815"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "lookupSeriesOutlinePaint", "int", "-2147483648"}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "drawItemLabel", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,double,double,boolean", "<sample:6>", "<sample:0>", "<sample:3>", "0", "0", "NaN", "0.5", "false"}}, 1), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"3", "<sample:1>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"-10", "<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"-97", "<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "true", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setSeriesToolTipGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"0", "<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseSeriesVisibleInLegend", "boolean,boolean", "true", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesToolTipGenerator", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getPlot", ""}, {"org.jfree.chart.renderer.category.StatisticalBarRenderer", "getSeriesItemLabelsVisible", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#470#-920696658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "setIncludeBaseInRange", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseOutlineStroke", "java.awt.Stroke,boolean", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#995245533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.StatisticalBarRenderer", "org.jfree.chart.renderer.category.StatisticalBarRenderer", "isDrawBarOutline", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.StatisticalBarRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#471#1379200231", SearchInputFactory_scaffolding.receiverState());
 }
}
