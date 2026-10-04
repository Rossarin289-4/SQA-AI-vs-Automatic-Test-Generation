package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"3", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:5>", "<sample:7>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=4, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-425529511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", "org.jfree.chart.axis.CategoryAxis", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAnchor", actual.getClass().getName());
  assertEquals("CategoryAnchor.MIDDLE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.8", "0.6", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.0", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:6>", "<sample:9>", "0", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"-2147483616"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:8>", "<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:3>"}}), new String[][]{{"addChangeListener", "org.jfree.chart.event.AxisChangeListener", "3"}, {"getRightArrow", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Polygon", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:7>", "<sample:8>", "<sample:9>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:1>", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-4", "<sample:1>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", "java.awt.Paint", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "2.0000000000000004", "<sample:2>", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:8>", "<sample:1>", "-1073741824", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:1>", "<sample:8>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderers", "org.jfree.chart.renderer.category.CategoryItemRenderer[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxis", "org.jfree.chart.axis.CategoryAxis", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "getAnchorValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoom", new String[]{"double"}, new String[]{"-0.5255000000000001"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "40", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "8.5", "<sample:4>", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=Infinity, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlph...#397#617595893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<null>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.6", "0.7999999999999999", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAnnotations", ""}, {"org.jfree.chart.plot.CategoryPlot", "getCategories", ""}}, 3), new String[][]{{"getDomainAxisEdge", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}}), new String[][]{{"ensureAtLeast", "org.jfree.chart.axis.AxisSpace", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-3.9000000000000004>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:9>", "<sample:4>", "<sample:4>", "0.9499999999999998", "<sample:4>", "<sample:7>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:2>", "<sample:6>", "<sample:1>"}}, 3), new String[][]{{"getFixedDomainAxisSpace", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<sample:7>", "<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeGridlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "Infinity", "<sample:9>", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}), new String[][]{{"getRGB", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer", "-4", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "-1073741824", "<sample:5>"}}, 2), new String[][]{{"clearRangeMarkers", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1042831234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer", "boolean"}, new String[]{"<null>", "true"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer", "6", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", new String[]{"int"}, new String[]{"17"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1176832058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"41", "<null>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=42, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#-309284173", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "0.16", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"-4", "<sample:1>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "33554436", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", "java.awt.Paint", "<null>"}}), new String[][]{{"drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setBackgroundImageAlpha", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=NaN, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1140418208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:11>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "524287", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "33550340", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-33550340", "-1073741824", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:0>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "2.004"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#394#-1327181578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:0>", "<sample:12>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", new String[]{"org.jfree.chart.axis.CategoryAnchor"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-61.0", "<sample:1>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlignment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"10.044999999999996", "-0.05255", "<sample:6>", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "NaN"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "0", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=NaN, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-623074509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:1>"}}), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:9>", "<sample:6>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:5>", "<sample:17>", "<sample:5>", "NaN", "<sample:1>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:7>", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "20"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:5>", "0.0", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"getLineWidth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-1073741828", "<sample:3>", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}}, 2), new String[][]{{"getRGB", "", "1"}, {"getColorComponents", "java.awt.color.ColorSpace,float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:0>", "<sample:16>", "<sample:10>"}}, 2), new String[][]{{"getDatasetRenderingOrder", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getCategories", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1042831234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAnchorValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", ""}, {"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-5"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:10>", "10", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1148294344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", "int", "-4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAxisOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}}, 1), new String[][]{{"extendWidth", "double", "1"}, {"calculateRightInset", "double", "6"}, {"trim", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:10>", "<sample:7>", "-9", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getDatasetGroup", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:8>", "<sample:7>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"-2147483648", "<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<null>", "<sample:2>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "17.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#-818471280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:18>", "<sample:2>"}}, 1), new String[][]{{"ensureAtLeast", "double,org.jfree.chart.util.RectangleEdge", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:6>", "<sample:6>", "0", "<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", "org.jfree.chart.util.SortOrder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<empty>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1295789669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:8>", "<null>", "2147483647", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:10>", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<null>"}}), new String[][]{{"add", "double,org.jfree.chart.util.RectangleEdge", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{"int"}, new String[]{"82"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"getLeft", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:6>"}}), new String[][]{{"clearDomainAxes", "", "6"}, {"datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "3"}, {"clearRangeMarkers", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1932513165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "5", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#-853806050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "0.09", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "<sample:0>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.09, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#1093641776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoom", new String[]{"double"}, new String[]{"1.0000000000000004"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:3>", "<sample:7>", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "configureRangeAxes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"-2147483648", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:8>", "<sample:3>", "0.16", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAnnotations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:0>", "<null>", "2147483647", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "configureDomainAxes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureRangeAxes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAnchorValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "-2147483648", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"0.0", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double"}, new String[]{"0.95"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.95, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#2031927836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"2147483647", "<sample:6>", "false"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDrawSharedDomainAxis", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", "java.awt.Paint", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}, {"org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"ab,c"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "16389", "<sample:6>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1753153931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:2>", "2147483647", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairVisible", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=true, getForegroundAlpha=1.0,...#391#649509567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"2147483647", "<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:4>", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>"}, false, 0, null, 1), new String[][]{{"reserved", "java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getInsets", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getTop", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetRenderingOrder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"2147483647", "<sample:7>", "<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "1073741825", "<sample:0>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairVisible", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:9>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:3>", "<sample:2>", "-2147483648", "<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:0>", "<sample:2>", "-16401", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer", "boolean"}, new String[]{"<sample:4>", "true"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", ""}}, 1), new String[][]{{"getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAxisOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getOutlineStroke", ""}}, 1), new String[][]{{"trim", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", ""}, {"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getOrientation", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"-2147483616", "<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "0.09449999999999992"}}, 3), new String[][]{{"datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#408#339457925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#408#-996440701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureDomainAxes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isDomainGridlinesVisible", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "-2147483636", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getPlotType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getOrientation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Category Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-767696767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:6>", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderers", "org.jfree.chart.renderer.category.CategoryItemRenderer[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearAnnotations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:1>", "<sample:9>", "524287", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoom", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"17", "<null>", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:2>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.0000000000000002", "0.4775", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "34"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getForegroundAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-173510470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"-524287", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoom", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isDomainGridlinesVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getInsets", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "-2147483616", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:8>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.DateAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeMinimumSize=2.0, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerBound=0.0, getLowerMargin=0.05, getTickMarkIn...#357#-2091899535", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAxisOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"4", "<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#476765688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAnchorValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"2147483647", "<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:6>", "<sample:11>", "40", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:3>"}}), new String[][]{{"getRightArrow", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Polygon", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"11"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"4.0", "false"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=4.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1194794488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "2147483641", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false), new String[][]{{"brighter", "", "3"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isDomainGridlinesVisible", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:1>", "<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", "int", "-4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetRenderingOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"50"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundImage", "java.awt.Image", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=50, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1932916069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"10", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "int,org.jfree.data.category.CategoryDataset", "262161", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=262162, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlph...#397#-788845486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"-1", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getParent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:8>"}}), new String[][]{{"getColorComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:3>", "<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxis", "int,org.jfree.chart.axis.CategoryAxis", "262143", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"0", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getBackgroundPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"1.7976931348623157E308", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=1.7976931348623157E308, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-520385018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureRangeAxes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeGridlinePaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:6>", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{"int"}, new String[]{"34"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"34", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundImage", "java.awt.Image", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=35, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#1136862543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-0.5255", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false), new String[][]{{"brighter", "", "2"}, {"getBlue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:2>", "9", "<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"40", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAxisLinePaint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "10.045", "<sample:0>", "<sample:10>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAxisOffset", new String[]{}, new String[]{}, false), new String[][]{{"getUnitType", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.UnitType", actual.getClass().getName());
  assertEquals("UnitType.ABSOLUTE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.DateAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeMinimumSize=2.0, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerBound=0.0, getLowerMargin=0.05, getTickMarkIn...#357#-2091899535", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOrientation", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getFixedDomainAxisSpace", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "NaN", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=NaN, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-623074509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"10", "<sample:6>", "false"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double,boolean", "NaN", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#496597043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<null>", "<sample:5>", "50.4745", "<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"-2147483648", "<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}}), new String[][]{{"axisChanged", "org.jfree.chart.event.AxisChangeEvent", "1"}, {"getBackgroundImageAlignment", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.NumberAxis3D", actual.getClass().getName());
  assertEquals("{getAutoRangeIncludesZero=true, getAutoRangeMinimumSize=1.0E-8, getAutoRangeStickyZero=true, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLa...#374#447948649", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getPlotType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:9>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Category Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setForegroundAlpha", "float", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=Inf...#397#-1037054581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"17", "<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=18, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#2036616618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundImageAlpha", "float", "0.085"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.085, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1...#394#-733709260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "-7.0753834008694559E18"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=-7.0753834008694559E18, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-626051622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<null>"}}), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"-1.7976931348623157E308", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-1.7976931348623157E308, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, ge...#412#-994641807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getBackgroundPaint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"2147483647", "<sample:5>", "true"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
}
