package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:2>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:2>", "<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:5>", "true"}, {"org.jfree.chart.plot.XYPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainMinorGridlinesVisible", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:2>"}}), new String[][]{{"getDashArray", "", "0"}, {"getDashArray", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"2147483647", "<sample:2>", "<null>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", new String[]{"int"}, new String[]{"2"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", new String[]{"int", "java.util.List"}, new String[]{"0", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"75", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", "java.awt.Paint", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearSelection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:5>", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "getNoDataMessageFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxes", new String[]{"int", "java.util.List"}, new String[]{"3", "<empty>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "-60", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearSelection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:4>", "<null>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"11", "<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", ""}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "-60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=12, getDomainCrosshairValue=...#372#1030508352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "138412032", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=138412033, getDomainAxisCount=1, getDomainCrosshai...#379#-1717290324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxis", new String[]{"int", "int"}, new String[]{"-60", "1"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawHorizontalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:1>", "<sample:4>", "7044148245716569264", "<sample:6>", "<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainZoomable", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:2>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinesVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "select", new String[]{"java.awt.geom.GeneralPath", "java.awt.geom.Rectangle2D", "org.jfree.chart.RenderingSource"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "-15", "<sample:0>", "<sample:10>", "false"}, {"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<sample:5>", "false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", new String[]{"org.jfree.chart.plot.SeriesRenderingOrder"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:11>", "<sample:0>", "-34", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<sample:1>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "2147467263", "<sample:4>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-2147483648", "<sample:0>", "<sample:2>", "false"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeGridlineStroke", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:10>", "<null>", "<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "indexOf", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRenderer", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#370#1124864726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantPaint", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeGridlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "panDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "10.000000000000002", "<sample:5>", "<sample:5>"}}), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "select", new String[]{"double", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.RenderingSource"}, new String[]{"-1.7976931348623157E308", "6.000000000000001", "<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "getQuadrantOrigin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<null>", "<sample:6>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2147483647", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "2147483647", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"1.2"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.2, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-906316050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.49999999999999994", "-3.0", "<sample:6>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"1073741823", "<null>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", "java.awt.Stroke", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:6>", "<sample:5>", "<sample:2>", "0.0", "<sample:0>", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setWeight", new String[]{"int"}, new String[]{"16777261"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#378#644036674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAnnotations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairStroke", ""}, {"org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", ""}}), new String[][]{{"ensureCapacity", "int", "1"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double", "-1.7976931348623157E308"}, {"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-...#392#869293201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:6>", "true"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setNoDataMessage", "java.lang.String", "5Y"}, {"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "11", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#369#-1003848919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeCrosshairLockedOnData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlineStroke", "java.awt.Stroke", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainCrosshairLockedOnData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "-122"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawVerticalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:7>", "4.9E-324", "<sample:1>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "0.5", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1710079095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:4>", "<sample:7>", "<null>", "0.5000000000000001", "<sample:9>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:5>", "false"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0...#371#-169423189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantPaint", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:6>"}}, 3), new String[][]{{"getDomainMarkers", "org.jfree.chart.util.Layer", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"33554432", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetRenderingOrder", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", "java.awt.Stroke", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:1>", "<sample:2>", "262144", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"int", "org.jfree.data.xy.XYDataset"}, new String[]{"10", "<null>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=11, getDomainAxisCount=1, getDomainCrosshairValue=...#372#-1474296201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainPannable", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", new String[]{"java.awt.geom.Point2D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", "java.awt.Paint", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:9>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", "int,java.util.List", "-137887743", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlineStroke", "java.awt.Stroke", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "render", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.plot.PlotRenderingInfo", "org.jfree.chart.plot.CrosshairState"}, new String[]{"<sample:0>", "<sample:3>", "-244", "<sample:0>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double", "0.2500000000000001"}, {"org.jfree.chart.plot.XYPlot", "drawQuadrants", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#386#404692596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinePaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "-2147483609", "<sample:6>"}}), new String[][]{{"getEndCap", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:11>", "<sample:3>", "<empty>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:8>", "<sample:5>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-2004455450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:8>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawQuadrants", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "1", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", new String[]{"org.jfree.chart.plot.SeriesRenderingOrder"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "5", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:8>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangePannable", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}}, 1), new String[][]{{"getDomainMinorGridlinePaint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:4>"}}, 2), new String[][]{{"drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "4"}, {"clearRangeAxes", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:9>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", "java.awt.Stroke", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "4", "<sample:2>", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:8>"}}, 3), new String[][]{{"addChangeListener", "org.jfree.chart.event.PlotChangeListener", "4"}, {"getAxisOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:4>"}}, 2), new String[][]{{"getBackgroundImage", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", new String[]{"int"}, new String[]{"-247"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "12", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=13, getDomainCrosshairValue=...#372#-974982527", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=13, getDomainCrosshairValue=...#372#-974982527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"8.988465674311579E307", "<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMinorGridlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:5>", "<sample:4>", "<sample:4>", "-0.09000000000000002", "<sample:4>", "<sample:8>", "<sample:3>"}}), new String[][]{{"getEndCap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:7>", "<sample:4>", "<sample:5>", "-0.5000000000000001", "<sample:5>", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:5>"}}), new String[][]{{"getBackgroundPaint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#840189550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"10.0", "<sample:3>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", "boolean", "true"}}), new String[][]{{"getTop", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#80516561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-5.0", "88.0", "<null>", "<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:6>", "<sample:4>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "5", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-524541967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}, {"org.jfree.chart.plot.XYPlot", "isSubplot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:10>", "<sample:5>", "<sample:10>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "276824080", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}}), new String[][]{{"setTop", "double", "7"}, {"reserved", "java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-7.0441482457165691E18", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-1645995029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.LogAxis", actual.getClass().getName());
  assertEquals("{getAutoRangeMinimumSize=1.0E-8, getBase=10.0, getFixedAutoRange=0.0, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerBound=0.00794328234724282...#398#373510041", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#1591134189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double", "7044148245716569264"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=7...#389#245057040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:5>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "isRangeMinorGridlinesVisible", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMinorGridlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "canSelectByPoint", ""}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "262144"}}, 2), new String[][]{{"getMiterLimit", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainAxes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0...#371#-169423189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<null>", "true"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:6>", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:3>"}}), new String[][]{{"getDatasetRenderingOrder", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-439674128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:5>", "<sample:1>", "-2147483648", "<sample:11>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainMinorGridlinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "panRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-134217776", "-2147483648", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0...#371#114562349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:8>", "<sample:1>", "<sample:4>", "0.479", "<sample:3>", "<sample:3>", "<sample:4>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", "int", "68"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "2"}}), new String[][]{{"getTransparency", "", "0"}, {"getColorSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "indexOf", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:5>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:2>", "<sample:0>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"1073741797"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "16777216", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=16777217, getDomainAxisCount=1, getDomainCrosshair...#378#-372428707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4", "<sample:5>", "false"}, {"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "262144", "2147483581", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#4377072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawVerticalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:11>", "<sample:3>", "-44.0", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:6>"}, {"org.jfree.chart.plot.XYPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"-247"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getForegroundAlpha", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOutlineStroke", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:0>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:5>", "<sample:3>", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainPannable", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"134217728"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToRangeAxis", new String[]{"int", "int"}, new String[]{"5", "-15"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeZoomable", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:6>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOrientation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"-1.0"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-1054950329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:6>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "configureRangeAxes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMinorGridlinePaint", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}, {"org.jfree.chart.plot.XYPlot", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:1>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMinorGridlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", ""}, {"org.jfree.chart.plot.XYPlot", "isDomainCrosshairLockedOnData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOrientation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"7044148245716569264", "-10.000000000000002", "0.2000000000000002", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier,boolean", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0441482457165691E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getSeriesCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOutlineStroke", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:7>", "<sample:2>", "-30", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", ""}, {"org.jfree.chart.plot.XYPlot", "setRangePannable", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeGridlinePaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"2147483647", "<sample:3>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setOutlinePaint", "java.awt.Paint", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getPlotType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("XY Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "getPlotType", ""}}, 2), new String[][]{{"getEndCap", "", "3"}, {"getMiterLimit", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"1.0"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#809078448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearSelection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", new String[]{"int", "java.util.List"}, new String[]{"-247", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:8>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:5>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setNoDataMessage", "java.lang.String", "1."}}, 1), new String[][]{{"setLeft", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#369#47489346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetRenderingOrder", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-2", "<sample:7>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-...#377#-600348925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:1>", "true"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainPannable", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "-247", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2147483647", "<null>", "true"}}, 3), new String[][]{{"darker", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=178] {getAlpha=255, getBlue=178, getGreen=0, getRGB=-16777038, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "select", new String[]{"double", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.RenderingSource"}, new String[]{"6.000000000000001", "1.7976931348623157E308", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearRangeMarkers", "int", "-2053"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundImage", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "5", "<sample:5>", "<sample:6>"}}, 1), new String[][]{{"getRGBColorComponents", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=Dialog,name=Tahoma,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=Dialog, getFontName=Dialog.plain, getItal...#434#1711662504", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawQuadrants", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:11>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", "java.awt.geom.Point2D", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getForegroundAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainMinorGridlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainTickBandPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:5>", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getAxisOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=4.0,b=4.0,r=4.0] {getBottom=4.0, getLeft=4.0, getRight=4.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainZoomable", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:3>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getInsets", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearAnnotations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "NaN", "0.5000000000000001", "10.0", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"0", "<sample:2>", "<sample:1>", "true"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"0.5000000000000001", "<sample:5>", "<sample:4>", "true"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:5>", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainPannable", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "mapDatasetToDomainAxes", new String[]{"int", "java.util.List"}, new String[]{"-2147483648", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"9", "<sample:6>", "<sample:1>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"9", "<sample:4>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundImageAlignment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"5", "<sample:4>", "false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#-524541967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2051", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"int", "org.jfree.data.xy.XYDataset"}, new String[]{"2147483647", "<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "1073741823", "<sample:8>", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangePannable", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"1.76103706E18"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#381#-505119080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainMinorGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:9>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRendererForDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false), new String[][]{{"getColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "int,org.jfree.chart.util.Layer", "2147483647", "<sample:0>"}}), new String[][]{{"getRGBColorComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getLegendItems", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"9", "<sample:2>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOrientation", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"2147483647", "<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:8>", "<sample:4>", "<sample:7>", "NaN", "<sample:5>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"5", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetGroup", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getQuadrantOrigin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRenderer", "int", "138412032"}, {"org.jfree.chart.plot.XYPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"-1", "<sample:2>", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:10>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMinorGridlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Akey>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "canSelectByPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "75", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#372#-358246770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearSelection", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "NaN", "4.0", "2.0", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setForegroundAlpha", "float", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#376#1929344293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:9>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainZeroBaselineVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{"int"}, new String[]{"5"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetCount", ""}, {"org.jfree.chart.plot.XYPlot", "getFixedLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainPannable", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainAxes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeMinorGridlinePaint", "java.awt.Paint", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0...#371#-169423189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", "java.awt.Paint", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-30", "<sample:4>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getOrientation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "panDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.0", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double,boolean", "8.988465674311579E307", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#389#-1550307978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:8>", "true"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "150", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#373#1900173000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:5>"}}), new String[][]{{"getOpposite", "", "1"}, {"getOpposite", "", "5"}, {"getOpposite", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", "java.awt.geom.Point2D", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", "java.awt.Stroke", "<sample:13>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:4>", "<sample:6>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainTickBands", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "12.5", "Infinity", "6.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:6>", "true"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:7>", "<sample:1>", "<sample:6>", "-3.0", "<sample:6>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeMinorGridlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataset", new String[]{"int"}, new String[]{"525282"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canSelectByPoint=false, canSelectByRegion=true, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0...#371#2120053228", SearchInputFactory_scaffolding.receiverState());
 }
}
