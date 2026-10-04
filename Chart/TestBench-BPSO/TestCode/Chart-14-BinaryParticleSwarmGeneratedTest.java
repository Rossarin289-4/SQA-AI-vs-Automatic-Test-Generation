package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", ""}, {"org.jfree.chart.plot.XYPlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getInsets", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<null>", "<sample:4>", "-2147483648", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1042831234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "41", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.95", "1", "<sample:6>", "<sample:8>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRootPlot", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getForegroundAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-18", "<sample:3>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getParent", ""}}), new String[][]{{"getFixedLegendItems", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1220851602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "-9", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:9>", "<sample:10>", "-268435447", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"Infinity", "NaN", "<sample:4>", "<sample:3>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAxisOffset", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{"int"}, new String[]{"57"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:3>", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getCategories", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "setDomainTickBandPaint", "java.awt.Paint", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>", "0.375", "<sample:7>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:9>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetRenderingOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRendererForDataset", "org.jfree.data.xy.XYDataset", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "9.87", "0.2999999999999999", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", "org.jfree.chart.util.SortOrder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"1", "<null>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getQuadrantPaint", new String[]{"int"}, new String[]{"-2"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", "java.awt.Paint", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantOrigin", new String[]{"java.awt.geom.Point2D"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "render", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.plot.PlotRenderingInfo", "org.jfree.chart.plot.CrosshairState"}, new String[]{"<sample:10>", "<sample:8>", "-61", "<null>", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:8>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"11", "<null>", "<sample:3>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedRangeAxisSpace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"1.7976931348623157E308", "<sample:3>", "<sample:9>", "true"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "-1.0", "<sample:6>", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"10", "<sample:1>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "setRenderers", "org.jfree.chart.renderer.xy.XYItemRenderer[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=11, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#1513948938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double,boolean", "1.0280000000000002", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=1.0280000000000002, getForegroundAlpha=1.0, getNo...#418#-1671325577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getForegroundAlpha", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.9999999999999998", "<sample:6>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0.5000000000000002", "<sample:3>", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:10>", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "36"}}), new String[][]{{"addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"add", "org.jfree.chart.LegendItem", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<null>"}, {"org.jfree.chart.plot.XYPlot", "isRangeGridlinesVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "2", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-173510470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:10>", "<sample:0>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:3>"}}), new String[][]{{"getDomainAxisEdge", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:9>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.8999999999999999", "3.0", "<sample:6>", "<sample:8>"}, {"org.jfree.chart.plot.CategoryPlot", "getDrawSharedDomainAxis", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"8388599", "<sample:3>", "<sample:5>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureDomainAxes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "true"}}), new String[][]{{"addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "3"}, {"getDomainAxisEdge", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:9>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-67", "-2130706750", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isSubplot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAnchor", actual.getClass().getName());
  assertEquals("CategoryAnchor.MIDDLE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}, {"org.jfree.chart.plot.XYPlot", "getAxisOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0.8000000000000002", "<sample:4>", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "32"}}, 1), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"8208", "<sample:8>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "-2147483647"}, {"org.jfree.chart.plot.XYPlot", "setQuadrantPaint", "int,java.awt.Paint", "-2147483648", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=8209, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=...#406#228721659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"32832", "<null>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:7>", "<sample:7>", "0.10000000000000002", "<sample:8>", "<sample:7>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-524283"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", "java.awt.Stroke", "<sample:10>"}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:9>", "<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "67108872"}, {"org.jfree.chart.plot.XYPlot", "drawRangeTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:7>", "<sample:9>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", "int", "67108890"}}, 2), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", "int", "2096134"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeCrosshairStroke", ""}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", "double", "-0.8999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=-0.8999999999999999, getForegroundAlpha=1.0, getN...#419#919025389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"16252933", "<sample:3>", "<sample:4>", "false"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getQuadrantOrigin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:3>", "<sample:9>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:4>", "0.95", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", ""}, {"org.jfree.chart.plot.CategoryPlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeCrosshairLockedOnData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", ""}, {"org.jfree.chart.plot.XYPlot", "getAnnotations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:2>", "<sample:6>", "9.999999999999998", "<sample:3>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "16777231", "<sample:6>", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"21"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-1.0000000000000002", "-0.44999999999999996", "<null>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=21, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#951212097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "int,org.jfree.chart.util.Layer", "4194299", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isRangeZeroBaselineVisible", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "-1.7976931348623158E307", "0.9499999999999998", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "4194297", "<sample:8>", "false"}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#408#1096307827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"9.999999999999998", "<sample:3>", "<sample:11>", "false"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "268435395", "<sample:4>", "<sample:0>", "false"}, {"org.jfree.chart.plot.XYPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"10.0", "<sample:4>", "<sample:9>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"4104", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "isRangeZoomable", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#412346714", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "8388595", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMe...#412#-734291811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "mapDatasetToRangeAxis", "int,int", "4194265", "1"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "-4.1000000000000005"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#408#-1120994877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeZeroBaselinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "indexOf", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:11>", "<sample:8>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:5>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"522", "<sample:0>", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "drawHorizontalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:13>", "<sample:8>", "1.0000000000000002", "<sample:11>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#401#1413784112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer,boolean", "1", "<sample:7>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:13>", "<sample:5>", "2147483647", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:3>"}, {"org.jfree.chart.plot.XYPlot", "setForegroundAlpha", "float", "-0.95"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=-0.95, getNoDataMessage=n...#404#359515535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:1>", "<null>"}, {"org.jfree.chart.plot.XYPlot", "setRangeTickBandPaint", "java.awt.Paint", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"-177", "<sample:1>", "<sample:1>", "true"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "105", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "2147483647", "<null>", "<sample:14>", "false"}}), new String[][]{{"getTransparency", "", "2"}, {"getComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace", "boolean"}, new String[]{"<sample:2>", "false"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainZoomable", ""}, {"org.jfree.chart.plot.XYPlot", "drawVerticalLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<null>", "0.6712000000000001", "<sample:5>", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawVerticalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:7>", "<null>", "2.0160000000000005", "<sample:1>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:12>", "<sample:9>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineVisible", "boolean", "true"}, {"org.jfree.chart.plot.XYPlot", "getQuadrantPaint", "int", "67109010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", ""}}), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "16388"}, {"org.jfree.chart.plot.XYPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:7>", "<sample:5>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#404#1119559412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:8>", "<sample:7>", "<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", "org.jfree.chart.plot.SeriesRenderingOrder", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRenderer", "org.jfree.chart.renderer.xy.XYItemRenderer", "<sample:4>"}, {"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselineStroke", "java.awt.Stroke", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.29999999999999993", "-1.0000000000000002", "<sample:7>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"5", "<sample:2>", "true"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.XYPlot", "setRenderer", "int,org.jfree.chart.renderer.xy.XYItemRenderer", "-4104", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1137511476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"-1.0312000000000001", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-1.0312000000000001, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getFor...#408#249114655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<s:kdeyy>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:11>", "<sample:11>", "<sample:0>", "-1.0000000000000002", "<sample:3>", "<sample:11>", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "9.87", "0.8600000000000001", "<sample:12>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawHorizontalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:10>", "<sample:8>", "-1.76884585021736371E18", "<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "-2147483648", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "org.jfree.data.xy.XYDataset", "<sample:9>"}, {"org.jfree.chart.plot.XYPlot", "setDomainCrosshairVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#-1778930123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessage", "java.lang.String", "Hellco, Wnrld"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#401#-647126329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:13>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:13>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "21", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#404#1477508104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainCrosshairPaint", "java.awt.Paint", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:1>", "<sample:8>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"41"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1295789669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:12>", "<sample:3>", "<sample:9>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:3>", "false"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", "org.jfree.chart.axis.CategoryAxis", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"14.999999999999993", "<sample:10>", "<sample:2>", "true"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"4079", "<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "-98"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeGridlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawHorizontalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:11>", "<sample:1>", "0.07500000000000001", "<sample:9>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinesVisible", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "134217697"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:12>", "<sample:10>", "<sample:21>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-8", "-2147483647", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"-28", "<sample:9>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:8>", "<sample:9>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", "int", "-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"-248"}, false, 2, new String[][]{{"org.jfree.chart.plot.XYPlot", "getBackgroundPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", new String[]{"org.jfree.chart.plot.SeriesRenderingOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", ""}, {"org.jfree.chart.plot.XYPlot", "getRangeAxisLocation", "int", "-122"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"8388595", "<sample:0>", "<sample:10>", "true"}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}, {"org.jfree.chart.plot.XYPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1854717660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<null>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "fireChangeEvent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "addDomainMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean", "105", "<sample:4>", "<sample:7>", "false"}, {"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.0075000000000000015", "<sample:1>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:1>", "<sample:9>", "<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getAxisOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:10>", "<sample:5>", "<sample:8>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "addAnnotation", "org.jfree.chart.annotations.XYAnnotation,boolean", "<sample:3>", "false"}, {"org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"7.27", "0.6", "-14.999999999999998", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.375", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:13>", "<sample:10>", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.XYAnnotation"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainGridlinesVisible", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairValue", "double", "-3.5376917004347277E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#422#1200062403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeAxes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#1198344604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:6>", "<null>"}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.xy.XYItemRenderer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:4>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoom", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "0.5000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.5000000000000002, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getFore...#407#-163686405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"8208", "<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisForDataset", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=8209, getDrawSharedDomainAxis=false, getForegroundAlpha=...#395#-1417873786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:0>", "<sample:3>", "<empty>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}, {"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:2>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:1>"}, {"org.jfree.chart.plot.XYPlot", "setWeight", "int", "4079"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#406#-1021675486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "rendererChanged", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<sample:7>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"-18"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:10>", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.plot.XYPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.4749999999999999", "<sample:0>", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"21", "<sample:9>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:0>", "<sample:11>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "<sample:0>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "int,org.jfree.data.category.CategoryDataset", "3", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=4, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-425529511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxis", "int", "134217746"}, {"org.jfree.chart.plot.XYPlot", "setWeight", "int", "-16777190"}}), new String[][]{{"addDomainMarker", "org.jfree.chart.plot.Marker", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#411#-1036771975", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#411#-1036771975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawQuadrants", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:10>", "<sample:0>"}, {"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", "java.awt.Paint", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-1.9999999999999998", "<sample:11>", "<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#19347769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", new String[]{"org.jfree.chart.axis.CategoryAnchor"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "69"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=true, getForegroundAlpha=1.0,...#391#649509567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeMarkers", new String[]{"int"}, new String[]{"-41"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#1476989192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:3>", "<sample:5>", "9", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getFixedLegendItems", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#19347769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:15>", "<sample:8>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairLockedOnData", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getLegendItems", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearDomainAxes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:13>", "<sample:2>", "<sample:3>", "NaN", "<sample:10>", "<sample:0>", "<sample:7>"}, {"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#2113543814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"0.8600000000000002", "<sample:2>", "<sample:8>", "false"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:10>", "<sample:9>", "21", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDataset", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", "int", "-65"}, {"org.jfree.chart.plot.XYPlot", "getDomainCrosshairStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-65, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#403#-941626605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDataset", "int,org.jfree.data.xy.XYDataset", "36", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=37, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nu...#404#58503380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getFixedDomainAxisSpace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:13>", "<sample:18>", "0", "<sample:8>"}, {"org.jfree.chart.plot.XYPlot", "setRangeZeroBaselinePaint", "java.awt.Paint", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setQuadrantPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"1", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"-1014", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getParent", ""}, {"org.jfree.chart.plot.XYPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainCrosshairPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:5>", "<sample:1>", "<sample:0>", "0.2999999999999999", "<sample:8>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-75497481"}, {"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:15>", "<sample:1>", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#400#-1523322254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawDomainCrosshair", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation", "double", "org.jfree.chart.axis.ValueAxis", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:5>", "<sample:3>", "<sample:0>", "0.5869999999999999", "<sample:3>", "<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "drawDomainTickBands", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<null>", "<sample:9>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:12>", "<sample:19>", "0", "<null>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"4104"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double"}, new String[]{"0.75"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.75, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#1558013850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", ""}, {"org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "mapDatasetToDomainAxis", new String[]{"int", "int"}, new String[]{"-9", "1"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:8>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:10>", "<sample:4>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:8>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeRangeMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:4>", "<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainAxes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#2113543814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.CategoryAxis[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1176832058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"1.0"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:0>", "-122", "<sample:2>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:12>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>", "<null>", "<sample:4>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-0.055"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=-0.055, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=...#395#-702294760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-1220851602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:4>", "<sample:5>", "2147483647", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getDatasetCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getSeriesCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureDomainAxes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:5>", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawHorizontalLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:6>", "<sample:2>", "-0.29999999999999993", "<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDrawSharedDomainAxis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:7>"}}, 2), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataRange", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1042831234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:10>", "<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlignment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:11>", "<sample:8>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "<sample:4>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:10>", "<sample:7>", "<sample:2>"}}, 2), new String[][]{{"getDataset", "int", "3"}, {"clearDomainMarkers", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:10>", "<sample:10>", "<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean", "-1", "<sample:3>", "<sample:6>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:10>", "<sample:12>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer", "boolean"}, new String[]{"<sample:1>", "false"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setForegroundAlpha", "float", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainCrosshairVisible", ""}, {"org.jfree.chart.plot.XYPlot", "setSeriesRenderingOrder", "org.jfree.chart.plot.SeriesRenderingOrder", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"-0.9999999999999999", "-1.7976931348623158E307", "<sample:11>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:3>", "<sample:8>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace,boolean", "<sample:7>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOrientation", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "13", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"int", "org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"-2147483648", "<sample:1>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"-124", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isSubplot", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDataset", new String[]{"int"}, new String[]{"-27"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isSubplot", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getWeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainZeroBaselineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:8>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer", "boolean"}, new String[]{"13", "<sample:5>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "isSubplot", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"-65"}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainZeroBaselineStroke", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeDomainMarker", new String[]{"org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"1034"}, false, 0, null, 2), new String[][]{{"getOpposite", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeAxis", new String[]{"int"}, new String[]{"-122"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeLine", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "double", "java.awt.Stroke", "java.awt.Paint"}, new String[]{"<sample:0>", "<sample:10>", "1.0000000000000002", "<null>", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<sample:0>", "<sample:12>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroRangeBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<null>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"122"}, false, 3, new String[][]{{"org.jfree.chart.plot.XYPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "2", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<null>", "<sample:7>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{"int"}, new String[]{"-67108986"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1932513165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRootPlot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeTickBandPaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.XYPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "removeDomainMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer", "boolean"}, new String[]{"11", "<sample:5>", "<sample:4>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataset", "int", "-61"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "isDomainZeroBaselineVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDatasetCount", ""}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setDomainCrosshairValue", new String[]{"double"}, new String[]{"2.056"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=2.056, getForegroundAlpha=1.0, getNoDataMessage=n...#404#-1392782434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getSeriesRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisEdge", "int", "-9"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.SeriesRenderingOrder", actual.getClass().getName());
  assertEquals("SeriesRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "0.85"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.85, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#-352512805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:9>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation,boolean", "<sample:5>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainZeroBaselinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=3, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=null...#401#250452524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getRangeCrosshairStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDrawingSupplier", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "drawZeroDomainBaseline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.XYPlot", "getDomainGridlinePaint", ""}, {"org.jfree.chart.plot.XYPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:1>", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:1>", "<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "setDomainAxis", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.XYPlot", "clearDomainMarkers", "int", "-65"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#402#805345659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.XYPlot", "org.jfree.chart.plot.XYPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.plot.XYPlot", "getRangeAxisForDataset", "int", "-2096128"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDomainCrosshairValue=0.0, getForegroundAlpha=1.0, getNoDataMessage=nul...#403#-352217145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:10>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
}
