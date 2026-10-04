package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623155E308", "-1.7976931348623157E308", "0.5", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantOrigin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:10>"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "5", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainZoomable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "5", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:0>", "<sample:4>", "-1.0", "<sample:5>", "<null>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "panDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.5", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:7>", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMinorGridlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlpha", "float", "1.0"}, {"org.jfree.chart.plot.XYPlot", "setRangePannable", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#809078448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.7976931348623157E308", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "7044148245716569264", "<sample:0>", "<sample:5>", "true"}, {"org.jfree.chart.plot.XYPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<null>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", "java.awt.Paint", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "4", "<sample:0>", "true"}, {"org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "getRangeGridlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-2147483648", "<sample:4>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getIndexOf", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "9", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#371#-1305030752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainMinorGridlinesVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getNoDataMessagePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-458763"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "57", "<sample:0>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-458763, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairVa...#377#1299017962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "9", "<sample:4>", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", "java.awt.Paint", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"0", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeGridlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-1073741746", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", "org.jfree.chart.plot.SeriesRenderingOrder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "select", "java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "<sample:5>", "<sample:4>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<null>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.7976931348623157E308", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "panRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.5", "<sample:5>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "11", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "1845494035", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "getRangeCrosshairStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:14>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1062215150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double,boolean", "7044148245716569264", "true"}, {"org.jfree.chart.plot.XYPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:7>", "<sample:6>", "1845494035", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getNoDataMessagePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#389#-2087660920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "-5", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "1845494035"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundImage", "java.awt.Image", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "4", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawQuadrants", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-1073741746", "<sample:3>", "<sample:7>", "false"}, {"org.jfree.chart.plot.XYPlot", "getDomainMinorGridlinePaint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxis", "int", "23"}, {"org.jfree.chart.plot.XYPlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:5>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawVerticalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:4>", "<sample:2>", "-0.0", "<sample:7>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinePaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setBackgroundImage", "java.awt.Image", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:1>", "<sample:6>", "<sample:1>", "0.0", "<sample:6>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double,boolean", "0", "false"}, {"org.jfree.chart.plot.XYPlot", "clearAnnotations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantPaint", new String[]{"int"}, new String[]{"-1073741746"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "-5", "<null>"}, {"org.jfree.chart.plot.XYPlot", "canSelectByPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxis", new String[]{"int", "int"}, new String[]{"0", "-4128766"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", "int", "2147483647"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "0"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "1845494035", "<sample:1>", "<sample:2>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"-2147483648", "<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-5", "<sample:4>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", new String[]{"java.awt.geom.Point2D"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangePannable", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "-458763", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:0>", "<sample:4>", "5", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}}), new String[][]{{"deriveFont", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=Dialog,name=Tahoma,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=Dialog, getFontName=Dialog.plain, getItal...#434#1711662504", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "indexOf", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getFixedLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxes", new String[]{"int", "java.util.List"}, new String[]{"2", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", new String[]{"int"}, new String[]{"5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:4>", "true"}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:5>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:1>", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<sample:0>", "<null>", "-2147483648", "<null>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", "int", "23"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:1>", "<sample:6>", "57", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-100.0", "NaN", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0.25", "true"}, {"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:3>", "<sample:7>", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#986424207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", new String[]{"org.jfree.chart.plot.SeriesRenderingOrder"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"-2147483591"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "isRangeCrosshairLockedOnData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", ""}, {"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "isDomainCrosshairLockedOnData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", ""}}), new String[][]{{"getRGB", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double", "NaN"}, {"org.jfree.chart.plot.XYPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:0>"}}, 3), new String[][]{{"clearRangeMarkers", "int", "1"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "5"}, {"getDataRange", "org.jfree.chart.axis.ValueAxis", "2"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#379221589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#379221589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setWeight", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double", "7044148245716569264"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#390#-292981342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "23", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.XYPlot", "clearSelection", ""}}, 3), new String[][]{{"clearRangeMarkers", "int", "1"}, {"canSelectByPoint", "", "2"}, {"getDataRange", "org.jfree.chart.axis.ValueAxis", "2"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "11", "<sample:6>", "true"}, {"org.jfree.chart.plot.XYPlot", "getBackgroundPaint", ""}}, 2), new String[][]{{"clearRangeMarkers", "", "1"}, {"getDomainMarkers", "org.jfree.chart.util.Layer", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=12, getDomainCrosshairValue=...#372#1030508352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:2>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "46", "<sample:5>", "false"}, {"org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:7>", "<sample:6>", "<sample:5>", "1.7976931348623153E308", "<sample:4>", "<sample:0>", "<sample:0>"}}), new String[][]{{"clearDomainAxes", "", "0"}, {"getDomainMarkers", "org.jfree.chart.util.Layer", "1"}, {"getDomainAxisEdge", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=47, getDomainCrosshairValue=...#372#2060897826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlineStroke", "java.awt.Stroke", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-5", "-1073741746", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "0", "<sample:5>", "true"}}, 3), new String[][]{{"clearRangeMarkers", "", "0"}, {"getDomainMarkers", "org.jfree.chart.util.Layer", "1"}, {"drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "7"}, {"getDomainGridlinePaint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getDomainCrosshairStroke", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxes", "int,java.util.List", "-1073741746", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "isRangeMinorGridlinesVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangePannable", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlpha", "float", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.0, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#558977169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainPannable", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", "java.awt.Paint", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "1", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:3>", "<sample:7>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:2>", "<null>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRenderer", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "1.7976931348623153E308", "<sample:1>", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-2004455450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", "org.jfree.chart.plot.SeriesRenderingOrder", "<sample:0>"}}), new String[][]{{"darker", "", "1"}, {"getColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.69803923]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.5", "1.0", "<sample:0>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:1>", "-0.02", "<null>", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "indexOf", "org.jfree.data.xy.XYDataset", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}}), new String[][]{{"getDashPhase", "", "2"}, {"createStrokedShape", "java.awt.Shape", "5"}, {"closePath", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.awt.geom.IllegalPathStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererCount", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:5>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "63", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:9>", "<sample:2>", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=64, getDomainCrosshairValue=...#372#-298947043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOrientation", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0", "<sample:0>", "<sample:7>", "true"}, {"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "11", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=12, getDomainAxisCount=1, getDomainCrosshairValue=...#372#1061311224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:7>", "<sample:5>", "<sample:6>", "0.0", "<sample:4>", "<sample:3>", "<sample:0>"}, false, 10, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", "java.awt.Stroke", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:3>", "<sample:0>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", "int", "-458763"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}, {"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<s:keyy>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double", "-1.0"}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-...#372#603202442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<null>", "true"}, {"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", "java.awt.Paint", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"-2147483492", "<null>", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedLegendItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<sample:3>", "<sample:1>", "-4128766", "<sample:1>", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "-2147483648", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:1>", "<null>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"2147483647", "<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "select", "double,double,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "-0.0", "10.0", "<sample:6>", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:5>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAxisOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", "java.awt.Stroke", "<sample:1>"}}), new String[][]{{"getUnitType", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.UnitType", actual.getClass().getName());
  assertEquals("UnitType.ABSOLUTE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "-1073741746", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:14>"}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double,boolean", "-0.02", "false"}, {"org.jfree.chart.plot.XYPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "-2147483648", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#373#81250601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", "int", "11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:2>", "<sample:7>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623157E308", "-1.7976931348623157E308", "0.5", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623155E308", "-1.7976931348623157E308", "0.5", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:2>", "<sample:4>", "<sample:7>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1062215150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:10>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOutlineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:10>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:10>"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "5", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "5", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "0", "3", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "NaN", "-1.0", "NaN", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1062215150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainZoomable", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:0>", "<sample:4>", "-1.0", "<sample:5>", "<null>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:7>", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "panDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.25", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainZoomable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0", "<sample:3>", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<null>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<sample:0>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<sample:0>", "<sample:7>", "-5", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", ""}, {"org.jfree.chart.plot.XYPlot", "select", "java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "<sample:0>", "<null>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2147483647", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2147483647", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-2147483648", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:14>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:0>", "Infinity", "<sample:2>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:14>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:0>", "Infinity", "<sample:2>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:6>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:5>", "<sample:4>", "Infinity", "<sample:5>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-2147483648"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:6>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "4", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#-1514649208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1073741824"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "10"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:6>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "4", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1073741824, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#1917628252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"9"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-2147483648"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:6>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "4", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=9, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#370#247152743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"18"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-2147483648"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:6>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "4", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=18, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1901008243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"55"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-2147483648"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:6>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "4", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=55, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1768687724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1094713344"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1094713344, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#-948257907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1094696960"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxis", "int,int", "5", "4"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1094696960, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#-731080237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxis", "int,int", "5", "4"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#379#1466437878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxis", "int,int", "5", "4"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1495474834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741823"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxis", "int,int", "5", "4"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#1867253126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-458763"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "9"}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-2147483648", "<sample:1>", "<sample:4>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2", "<sample:5>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-458763, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairVa...#376#507603030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"301988880"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-2147483648"}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-458782", "<sample:1>", "<sample:5>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "9", "<sample:5>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=301988880, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshair...#379#-190222171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "1073741806"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "9", "<sample:0>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#371#-1305030752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-5"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "57", "<sample:0>", "true"}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-5, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-873446066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-32"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "57", "<sample:0>", "true"}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-32, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=...#373#2142788296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-10"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "57", "<sample:0>", "true"}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-10, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=...#373#1153299208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1073741746"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "1", "<sample:1>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1073741746, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#-2029032616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainTickBandPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundAlpha", "float", "-3.4028235E38"}, {"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "9", "<sample:2>", "<sample:1>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossh...#381#1947230297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "render", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.plot.PlotRenderingInfo", "org.jfree.chart.plot.CrosshairState"}, new String[]{"<sample:7>", "<sample:4>", "-458763", "<sample:7>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"9", "<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeGridlinePaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=10, getDomainCrosshairValue=...#372#746522814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getAnnotations", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "11", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getAnnotations", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "11", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setWeight", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getWeight", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "panDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.7976931348623157E308", "<sample:5>", "<sample:0>"}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:14>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1062215150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:13>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:15>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:7>", "<sample:6>", "1845494035", "<null>"}, {"org.jfree.chart.plot.XYPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeCrosshairVisible", ""}, {"org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<i:2>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "-1845494034"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:10>"}, false, 9, new String[][]{{"org.jfree.chart.plot.XYPlot", "fireChangeEvent", ""}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"int", "org.jfree.data.xy.XYDataset"}, new String[]{"-268435456", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainPannable", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainPannable", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", "int", "-1073741746"}, {"org.jfree.chart.plot.XYPlot", "getDataset", "int", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1073741746, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrossha...#380#-1500113577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"9", "<sample:4>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-1885006386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isNotify", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isSubplot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:2>", "<sample:7>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "-1.7976931348623157E308", "false"}, {"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623155E308", "-1.7976931348623157E308", "0.5", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-...#391#1797112801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", "java.awt.Stroke", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623155E308", "-1.7976931348623157E308", "0.5", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:2>", "<sample:4>", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "isRangePannable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "7044148245716569264", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"3", "<sample:2>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<null>", "<sample:3>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setForegroundAlpha", "float", "3.4028235E38"}, {"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#380#1013274522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setForegroundAlpha", "float", "Infinity"}, {"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#376#1929344293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1062215150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"0.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=3, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#370#540469597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "-5", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"4.0", "-1.7976931348623157E308", "1.7976931348623157E308", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"5", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "1.0", "0.0", "<sample:1>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-1", "<sample:2>", "<sample:4>", "true"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDataset", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"11"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:7>", "<sample:6>", "<null>", "0", "<sample:3>", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=11, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-644229144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", new String[]{"java.awt.geom.Point2D"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=1, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#370#-841671589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "10", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRootPlot", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", ""}, {"org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "5", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundAlpha", "float", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=-1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=...#372#-1153461263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetGroup", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0", "<sample:3>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isNotify", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0...#371#-169423189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "panRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.0", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "1", "<sample:3>", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDomainCrosshairValue=0...#371#-1890928530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "10.0", "4.0", "1.0", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:2>", "<null>", "<sample:3>", "7044148245716569264", "<sample:1>", "<sample:4>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRootPlot", ""}, {"org.jfree.chart.plot.XYPlot", "setRangePannable", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "10.0", "4.0", "-1.0", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<null>", "<sample:7>", "4", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<null>", "true"}, {"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.25", "<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getSeriesRenderingOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"2147483647", "<sample:7>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getInsets", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo,org.jfree.chart.plot.CrosshairState", "<sample:0>", "<sample:7>", "-5", "<sample:2>", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", ""}, {"org.jfree.chart.plot.XYPlot", "select", "java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "<sample:0>", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getParent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getSeriesCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"9", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-1885006386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "select", "java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "<sample:0>", "<null>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.XYPlot", "select", "java.awt.geom.GeneralPath,java.awt.geom.Rectangle2D,org.jfree.chart.RenderingSource", "<sample:0>", "<null>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getAxisOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"3", "9", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double"}, new String[]{"0.25"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "indexOf", "org.jfree.data.xy.XYDataset", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#986424207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAxisOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getPlotType", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"1.7976931348623157E308", "<null>", "<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererForDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRenderer", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getNoDataMessageFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis", "11", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=12, getDomainCrosshairValue=...#372#1030508352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDrawingSupplier", ""}, {"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererForDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", ""}, {"org.jfree.chart.plot.XYPlot", "getPlotType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "10", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=9, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0....#371#-617817250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "10", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#380#1060526317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#379#-1770691340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "20", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#380#2086018316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-5"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "10", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#380#1060526317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"1845494035"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "2147483647"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "9", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=1845494035, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshai...#380#830326663", SearchInputFactory_scaffolding.receiverState());
 }
}
