package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "11"}, {"org.jfree.chart.plot.CategoryPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "0.6", "0", "1.7976931348623157E308", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1671602303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getIndexOf", "org.jfree.chart.renderer.category.CategoryItemRenderer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.5", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "2147483647", "<sample:1>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:6>", "<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"9", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-1", "3", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAxisOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"11"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", new String[]{"org.jfree.chart.axis.CategoryAnchor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.5", "0.8", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double,boolean", "-1.7976931348623157E308", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#422#2112942384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4", "<sample:2>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderers", "org.jfree.chart.renderer.xy.XYItemRenderer[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-766650121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAxisOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}}), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "isDomainZoomable", ""}}), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"clearDomainAxes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#2113543814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<null>"}}, 2), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "1"}, {"clearDomainAxes", "", "3"}, {"getBackgroundPaint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:7>", "false"}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "1", "<sample:1>", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}, {"getDomainAxis", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-988771767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getOutlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:10>"}}, 1), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>", "1.0", "<sample:5>", "<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:1>"}}), new String[][]{{"getDomainCrosshairPaint", "", "5"}, {"getTransparency", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:10>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<null>"}}), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}, {"org.jfree.chart.plot.XYPlot", "getAnnotations", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}}, 1), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:7>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "mapDatasetToRangeAxis", "int,int", "-1", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", "java.awt.geom.Point2D", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<null>"}}, 2), new String[][]{{"clearRangeAxes", "", "4"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "5"}, {"addDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "configureRangeAxes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", "int", "11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.XYPlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "1"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"getDomainAxisForDataset", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"10", "<sample:7>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "5", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:9>", "<sample:4>"}}), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "1"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"getDomainMarkers", "org.jfree.chart.util.Layer", "0"}, {"clearDomainMarkers", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "4", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:9>", "<sample:2>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "1"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"getDomainAxisForDataset", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "4", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "1"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"clearRangeMarkers", "int", "0"}, {"clearDomainMarkers", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "10"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxis", "int,org.jfree.chart.axis.CategoryAxis,boolean", "2", "<sample:2>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1176832058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getCategories", ""}, {"org.jfree.chart.plot.CategoryPlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:1>", "<sample:0>", "0", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantOrigin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:11>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "524340", "<sample:12>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:12>", "<sample:7>"}}, 1), new String[][]{{"addDomainMarker", "org.jfree.chart.plot.Marker", "0"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"clearRangeMarkers", "int", "3"}, {"clearDomainMarkers", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<null>"}, {"org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:2>", "-3537691700434728188", "<sample:1>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"2.0", "<sample:6>", "<sample:7>", "true"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:1>", "<sample:7>", "<sample:0>", "0.95", "<sample:9>", "<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "2147483647", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "523805", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:3>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "6"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "2"}, {"clearRangeMarkers", "int", "2"}, {"clearDomainMarkers", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isSubplot", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"67108834", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0.95", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.95, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#-360364205", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", "java.awt.Stroke", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:8>", "<sample:0>", "<null>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getRenderer", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAnchor", actual.getClass().getName());
  assertEquals("CategoryAnchor.MIDDLE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<sample:12>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "mapDatasetToDomainAxis", "int,int", "524340", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"5"}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:8>"}, {"org.jfree.chart.plot.CategoryPlot", "mapDatasetToDomainAxis", "int,int", "-2147483648", "-2147483648"}, {"org.jfree.chart.plot.CategoryPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "0.6", "-3537691700434728188", "NaN", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:1>", "<sample:3>", "0", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:0>", "<sample:6>", "0", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-341194854", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#960801380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#960801380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", ""}, {"org.jfree.chart.plot.CategoryPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:8>", "2147483647", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:7>", "<sample:7>", "25", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-3537691700434728188", "-1.0", "1", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<null>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "32773"}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "-229371"}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"3", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetRenderingOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setWeight", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#1978339060", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"4", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#2071047928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"3", "<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"10", "<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-2147483621", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean", "524299", "<sample:4>", "<sample:0>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-2147483640", "<sample:7>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "-5.9"}, {"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean", "0", "<sample:3>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"0", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "-5.0"}, {"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean", "-43", "<sample:4>", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1331085006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"32723", "<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean", "0", "<sample:3>", "<sample:1>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<null>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"32723", "<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<sample:2>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainCrosshairLockedOnData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "0.85", "<sample:10>", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawQuadrants", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-43", "<sample:3>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-2097154", "<sample:6>", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:4>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setBackgroundAlpha", "float", "1"}, {"org.jfree.chart.plot.XYPlot", "getSeriesRenderingOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#349717448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "getSeriesRenderingOrder", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-518917009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<null>"}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "25", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1650699328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:5>", "<sample:4>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "523805", "<null>"}, {"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:1>", "<sample:4>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "2147483643", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:4>", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "32723"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "2147483643", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"116"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-3537691700434728188", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"57342"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getNoDataMessagePaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"-5.0", "<null>", "<sample:6>", "false"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getSeriesRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.SeriesRenderingOrder", actual.getClass().getName());
  assertEquals("SeriesRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "2.0", "0", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "clearAnnotations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"-1073741709", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "1.7976931348623157E308", "<sample:1>", "<sample:1>", "true"}, {"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "57342", "-72", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"524299", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "57324", "-8388680", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-229371", "<sample:1>", "<sample:5>", "false"}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "2147483643", "<sample:3>", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#408#-454479324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawHorizontalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:12>", "<sample:1>", "-8.988465674311579E307", "<sample:2>", "<sample:0>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawVerticalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:6>", "<null>", "-1.7976931348623157E308", "<sample:4>", "<sample:7>"}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawVerticalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:9>", "<sample:5>", "1", "<sample:0>", "<sample:10>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:3>", "<sample:7>", "<sample:2>", "<sample:5>", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeCrosshairLockedOnData", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRootPlot", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-Infinity", "<null>", "<sample:0>"}}), new String[][]{{"getDomainAxisEdge", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRootPlot", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:7>", "false"}}), new String[][]{{"getFixedDomainAxisSpace", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"-2147483648", "<sample:2>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", "org.jfree.chart.axis.CategoryAxis", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getInsets", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearAnnotations", ""}, {"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:9>", "<sample:1>", "<sample:1>", "<sample:5>"}}), new String[][]{{"getTop", "", "7"}, {"calculateBottomInset", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "1.02", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundImageAlignment", "int", "32773"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "<sample:0>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:5>", "<sample:3>", "<sample:0>", "7044148245716569264", "<sample:1>", "<sample:4>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=32773, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=...#395#1272196586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.8", "-1.0", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "-5.9", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-5.9, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#1374856163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-1073741709", "<sample:0>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-2097154", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "1"}, {"org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double", "boolean"}, new String[]{"1.7976931348623157E308", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "10", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=1.7976931348623157E308, getForegroundAlpha=1.0, g...#421#-296053719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "7.0441482457165683E17", "<sample:11>", "<sample:2>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "-2147483648", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-0.6", "20.030000000000005", "<sample:10>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-8.988465674311579E307"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:8>", "1", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-114.99500000000002", "40.914", "<sample:6>", "<sample:0>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:2>", "1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>", "-5.9", "<sample:10>", "<null>", "<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", "int", "32723"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:12>", "<sample:1>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-72", "<sample:1>", "<sample:1>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"7.199999999999999", "-1.7976931348623157E308", "<sample:2>", "<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:6>", "<sample:0>", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "0.6", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.6, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-16901578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "4"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-5.9", "0.5000000000000001", "<sample:6>", "<sample:3>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:2>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "NaN", "<sample:2>", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:4>", "false"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRenderer", ""}, {"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "-2097154"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"524299", "<sample:5>", "<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.8", "0.8", "<sample:0>", "<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRenderers", "org.jfree.chart.renderer.category.CategoryItemRenderer[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOutlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"523805", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"-2147483621", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-1.0", "<sample:8>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "57342", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "-114.99500000000002"}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:0>", "<sample:6>", "-2146957312", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#408#-412843094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "67108806", "<sample:4>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0.0", "<sample:6>", "<sample:4>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:4>", "false"}}), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:7>", "false"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxis", "int,int", "116", "-2147483621"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"523805", "<null>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=523806, getDrawSharedDomainAxis=false, getForegroundAlph...#397#2089386145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "clearRangeAxes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1054151738", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "0.85"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.85, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#-352512805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", ""}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "0.5000000000000001", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:12>", "<sample:8>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}, {"org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:8>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"2147483647", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "indexOf", "org.jfree.data.xy.XYDataset", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundImageAlignment", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#1476989192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-2147450650", "<sample:4>", "<null>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getWeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.0", "1.0", "<sample:4>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}), new String[][]{{"getDatasetCount", "", "3"}, {"getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "5"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "<sample:6>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", "int", "5"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}, 3), new String[][]{{"getDatasetCount", "", "2"}, {"getDataset", "", "3"}, {"getDomainAxis", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-3.8809999999999993", "<sample:4>", "<sample:5>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double", "0.2899999999999999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.2899999999999999, getForegroundAlpha=1.0, getNo...#417#1277110621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-1.0000000000000002", "<sample:6>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:14>"}, {"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "25", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlpha", "float", "-3.53769158E18"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=26, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#404#1235771572", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:1>", "true"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<sample:1>", "<sample:2>", "-2146957312", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1293.0", "6.390000000000001", "<sample:8>", "<sample:0>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:12>", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", "org.jfree.chart.plot.SeriesRenderingOrder", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "indexOf", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-Infinity", "-75.58", "<sample:4>", "<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "11", "<sample:2>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#404#1192372201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:3>"}}), new String[][]{{"getRGBColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:13>", "<sample:7>", "<sample:0>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairStroke", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-229371", "<sample:2>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantPaint", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:9>"}, false, 14, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<sample:2>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"78.628", "<sample:7>", "<sample:14>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double", "-23.4"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#405#-271735543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-8388680"}, {"org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#399#1891438438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:8>"}}, 1), new String[][]{{"clearRangeAxes", "", "3"}, {"getDomainAxisEdge", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", ""}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:4>"}}, 3), new String[][]{{"clearRangeAxes", "", "0"}, {"getDomainAxisEdge", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1295789669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:5>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}}, 1), new String[][]{{"clearDomainAxes", "", "2"}, {"clearRangeMarkers", "int", "5"}, {"getDataRange", "org.jfree.chart.axis.ValueAxis", "4"}, {"getAnchorValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.xy.XYItemRenderer", "boolean"}, new String[]{"11", "<sample:2>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:2>", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"-536870919"}, false, 10, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getOutlineStroke", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDataset", "int,org.jfree.data.category.CategoryDataset", "524299", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=524300, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlph...#397#1590415381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:5>", "<sample:0>", "<empty>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"16515097", "<null>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "setBackgroundAlpha", "float", "0.0"}, {"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=0.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1352092317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double,boolean", "1.0", "false"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:11>"}, {"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1348532827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-173510470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "9", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:7>", "<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:2>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0", "true"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0.64", "true"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.64, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#1729087733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>", "<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "NaN", "<sample:5>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getAnchorValue", ""}}, 1), new String[][]{{"getBottom", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:9>", "<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "getAnchorValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0.8", "<sample:5>", "<sample:5>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "false"}, {"org.jfree.chart.plot.XYPlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4", "<sample:1>", "false"}, {"org.jfree.chart.plot.XYPlot", "getOrientation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1839446069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4", "<sample:2>", "false"}, {"org.jfree.chart.plot.XYPlot", "getOrientation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-766650121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4", "<sample:2>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderers", "org.jfree.chart.renderer.xy.XYItemRenderer[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-766650121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "2", "<sample:1>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairValue", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"clearDomainAxes", "", "3"}, {"getBackgroundPaint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 2), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"clearDomainAxes", "", "3"}, {"getBackgroundPaint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 2), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"clearDomainAxes", "", "3"}, {"getBackgroundPaint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 2), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"clearDomainAxes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#2113543814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}}, 2), new String[][]{{"getDrawingSupplier", "", "2"}, {"getNextShape", "", "1"}, {"getCenterX", "", "3"}, {"setRect", "java.awt.geom.Rectangle2D", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:2>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "1"}, {"clearDomainAxes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1854717660", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<null>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "2"}, {"clearDomainAxes", "", "3"}, {"getDomainAxis", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<null>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}, {"getDomainAxis", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:5>"}}, 3), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "2"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}, {"getDomainAxis", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1854717660", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-1293398343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", "int", "2"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairVisible", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}, 3), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1854717660", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-1293398343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "2"}, {"clearDomainAxes", "", "3"}, {"getBackgroundAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-1293398343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "0"}, {"clearDomainAxes", "", "3"}, {"getBackgroundAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-988771767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "3", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "0"}, {"clearDomainAxes", "", "3"}, {"getBackgroundAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-1293398343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "3", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "4", "<sample:0>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "0"}, {"clearDomainAxes", "", "3"}, {"getBackgroundAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#902824951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "3", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "4", "<sample:2>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"clearDomainMarkers", "", "0"}, {"clearDomainAxes", "", "3"}, {"getBackgroundAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1625326389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double"}, new String[]{"-3537691700434728188"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:5>", "true"}, {"org.jfree.chart.plot.XYPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-3.5376917004347279E18, getForegroundAlpha=1.0, g...#421#1074713421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "getParent", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "4", "<sample:5>"}}, 1), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "3"}, {"getDomainAxisEdge", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#902824951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "25", "<sample:0>"}}, 1), new String[][]{{"clearRangeAxes", "", "3"}, {"getDomainAxisEdge", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=26, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#-1903704730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "25", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "25", "<sample:0>"}}, 1), new String[][]{{"clearRangeAxes", "", "3"}, {"getDomainAxisEdge", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=26, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#-1903704730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 1), new String[][]{{"clearRangeAxes", "", "3"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 1), new String[][]{{"clearRangeAxes", "", "3"}, {"getDomainCrosshairValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getOutlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}}, 2), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}}, 3), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:2>"}}, 3), new String[][]{{"clearRangeAxes", "", "5"}, {"getDomainAxisEdge", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "-1"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}}, 3), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"getDomainGridlinePaint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "-1"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"getDomainGridlinePaint", "", "1"}, {"getBlue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "-1"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"getDomainGridlinePaint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "9"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"getDomainGridlinePaint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#401#1413784112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "2"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:4>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"clearRangeMarkers", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1198344604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "2"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:4>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"clearRangeMarkers", "int", "5"}, {"getDrawingSupplier", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "2"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:4>"}}, 2), new String[][]{{"clearRangeAxes", "", "3"}, {"clearDomainMarkers", "", "7"}, {"clearRangeMarkers", "int", "5"}, {"getDomainAxis", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getWeight", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"clearRangeAxes", "", "7"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "5"}, {"clearRangeMarkers", "int", "3"}, {"getDatasetRenderingOrder", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", new String[]{"double", "boolean"}, new String[]{"-3537691700434728188", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#421#-237723165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<null>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "4"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "5"}, {"clearRangeMarkers", "int", "3"}, {"getDatasetRenderingOrder", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.0", "<null>", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "7"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"clearRangeMarkers", "int", "3"}, {"clearDomainMarkers", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "1"}, {"getDomainZeroBaselineStroke", "", "2"}, {"getDashPhase", "", "0"}, {"getMiterLimit", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.CloneNotSupportedException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "4", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:9>", "<sample:2>"}}, 2), new String[][]{{"getFixedLegendItems", "", "1"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "2"}, {"clearRangeMarkers", "int", "0"}, {"clearDomainMarkers", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "16", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "52", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "5"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "6"}, {"clearRangeMarkers", "int", "0"}, {"getForegroundAlpha", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "52", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "5"}, {"addDomainMarker", "org.jfree.chart.plot.Marker", "6"}, {"getDomainGridlinePaint", "", "0"}, {"getRed", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-173510470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1295789669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-173510470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "5", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "0", "<sample:4>", "<sample:3>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:3>", "<null>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<null>", "<empty>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:1>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<sample:7>", "<empty>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0", "true"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "mapDatasetToRangeAxis", new String[]{"int", "int"}, new String[]{"2", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"0", "<sample:5>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "11", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double,boolean", "-1.7976931348623157E308", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#412#-206554639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0", "true"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0", "true"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1854717660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeZoomable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setNoDataMessagePaint", "java.awt.Paint", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
}
