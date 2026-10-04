package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"10.0", "<sample:5>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "61", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#-1054866400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"5", "<sample:5>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "0.1", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=6, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-2020751145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"9", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "0.1", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<empty>"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=10, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#164313834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-3.5376917004347274E18"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", "int", "10"}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}}), new String[][]{{"getTop", "", "3"}, {"reserved", "java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "7"}, {"shrink", "java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "<sample:0>", "-1.7976931348623157E308", "<sample:4>", "<null>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "2147483647", "<sample:3>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:12>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getWeight", ""}, {"org.jfree.chart.plot.CategoryPlot", "removeAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"int", "org.jfree.chart.plot.Marker", "org.jfree.chart.util.Layer"}, new String[]{"536870928", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearAnnotations", ""}, {"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"<null>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addAnnotation", "org.jfree.chart.annotations.CategoryAnnotation", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"24", "<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "0"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "1"}, {"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getIndexOf", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer", "-2147483648", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"24", "<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "-3537691700434728188"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#411#1502826404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "1.7976931348623157E308", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=1.7976931348623157E308, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-520385018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:5>", "2147483647", "<null>"}}), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "2"}, {"getBackgroundImageAlignment", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:1>", "2080374783", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.7976931348623157E308", "-1.76884585021736371E18", "1", "<sample:4>"}}), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "6"}, {"addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "7"}, {"addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:4>", "-2147483648", "<sample:0>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "6"}, {"clearRangeAxes", "", "6"}, {"clearDomainAxes", "", "7"}, {"getLegendItems", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:4>", "-2147483648", "<sample:0>"}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "6"}, {"clearRangeAxes", "", "6"}, {"clearDomainAxes", "", "7"}, {"getLegendItems", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:7>", "<sample:7>", "0.8", "<sample:6>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeCrosshair", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint", "<null>", "<null>", "<sample:4>", "0.95", "<sample:3>", "<sample:5>", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "11"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<null>", "12", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:0>"}}), new String[][]{{"addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "4"}, {"addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "7"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "4"}, {"getLegendItems", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:2>", "0", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "<sample:4>"}}, 2), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "5"}, {"clearDomainMarkers", "int", "6"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "4"}, {"getLegendItems", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getWeight", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "1.7976931348623157E308", "<sample:0>", "<sample:5>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setColumnRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawAxes", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<null>", "<sample:2>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderers", new String[]{"org.jfree.chart.renderer.category.CategoryItemRenderer[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getParent", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setNoDataMessage", "java.lang.String", "2020-01-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#398#391098407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDrawSharedDomainAxis", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<null>", "<sample:5>", "-9", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "0.85"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawAxes", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "10", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:4>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:1>"}}, 3), new String[][]{{"ensureAtLeast", "org.jfree.chart.axis.AxisSpace", "1"}, {"getLeft", "", "2"}, {"setBottom", "double", "1"}, {"add", "double,org.jfree.chart.util.RectangleEdge", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairLockedOnData", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:0>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRenderer", "org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "<sample:8>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getRenderer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAxisOffset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeCrosshairLockedOnData", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<s:`>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "org.jfree.chart.axis.AxisLocation", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.85", "<sample:7>", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getFixedDomainAxisSpace", ""}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "0.85", "<sample:3>", "<sample:4>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getBackgroundImageAlignment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"12", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"4.561000000000001", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOrientation", "org.jfree.chart.plot.PlotOrientation", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<null>", "<sample:6>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", "org.jfree.chart.axis.CategoryAxis", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:1>"}}, 2), new String[][]{{"getAnchorValue", "", "3"}, {"addRangeMarker", "org.jfree.chart.plot.Marker", "1"}, {"getDomainAxisForDataset", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.0", "1", "<sample:0>", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:12>"}}, 2), new String[][]{{"getDomainAxisForDataset", "int", "3"}, {"getAxisLineStroke", "", "5"}, {"getDashArray", "", "4"}, {"getLineJoin", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:8>"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<null>", "<sample:3>", "2147483647", "<sample:1>"}}, 2), new String[][]{{"clearDomainAxes", "", "7"}, {"clearDomainMarkers", "int", "0"}, {"addDomainMarker", "org.jfree.chart.plot.CategoryMarker", "2"}, {"clearDomainMarkers", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:3>", "4", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<sample:4>", "<sample:2>"}}, 1), new String[][]{{"clearRangeMarkers", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1042831234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"clearRangeMarkers", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisIndex", "org.jfree.chart.axis.CategoryAxis", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "2.0", "<sample:7>", "<sample:1>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", new String[]{"double"}, new String[]{"2.969375"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-12"}, {"org.jfree.chart.plot.CategoryPlot", "rendererChanged", "org.jfree.chart.event.RendererChangeEvent", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#397#837818823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePaint", "java.awt.Paint", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDatasetRenderingOrder", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "0.1", "1.2", "0", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePosition", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAnchorValue", ""}, {"org.jfree.chart.plot.CategoryPlot", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:5>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<null>", "<sample:8>", "2", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "12"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:2>", "<sample:5>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}), new String[][]{{"configureDomainAxes", "", "4"}, {"getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1573600065", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:5>", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}), new String[][]{{"configureDomainAxes", "", "4"}, {"getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "536870928", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxes", "org.jfree.chart.axis.CategoryAxis[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1176832058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<sample:7>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", "org.jfree.chart.axis.CategoryAnchor", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:5>", "<sample:0>", "5", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAxisOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "int,org.jfree.data.category.CategoryDataset", "10", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=11, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#250669649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"170.0", "22.815000000000005", "<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double", "-3537691700434728188"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-3.5376917004347279E18, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-893484702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "3", "2147483647", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxes", new String[]{"org.jfree.chart.axis.ValueAxis[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean", "-1.0000000000000002", "<sample:6>", "<sample:7>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1295789669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.85", "0.0", "<null>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateDomainAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "true"}}, 2), new String[][]{{"ensureAtLeast", "org.jfree.chart.axis.AxisSpace", "6"}, {"getLeft", "", "4"}, {"expand", "java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "12", "<sample:6>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", "java.awt.Paint", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#-1973560711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"2147483601", "<sample:4>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "clone", ""}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", new String[]{"org.jfree.chart.axis.CategoryAnchor"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "4", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-2147483648", "<sample:1>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-1073741824", "<sample:6>"}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-1073741824", "<sample:6>"}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"2147483647", "<sample:12>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-2147483648", "<sample:12>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<sample:12>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<null>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"4", "<sample:10>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#476765688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-2147483606", "<sample:14>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"3", "<sample:10>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "0.1", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:3>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=4, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1320684775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"3", "<sample:3>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "0.1", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getFixedDomainAxisSpace", ""}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=4, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1320684775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<sample:10>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "0", "<sample:4>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "0.1", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"5", "<sample:5>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "0.1", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=6, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-2020751145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-3.5376917004347279E18"}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-3.5376917004347279E18"}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"-1073741824", "<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:4>"}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"add", "double,org.jfree.chart.util.RectangleEdge", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "61"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "61"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "2147483647"}}, 2), new String[][]{{"getTop", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "3"}, {"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"61", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=62, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#783501109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=[2.0, 2.0], getDashPhase=0.0, getEndCap=0, getLineJoin=2, getLineWidth=0.5, getMiterLimit=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "5", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#695810294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<null>", "<sample:3>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:2>", "<null>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearAnnotations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "-131061"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:4>", "<null>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.6", "1.0", "<sample:4>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.util.List"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "0.6", "1.0", "<sample:4>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "getRenderer", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "-2147483648", "<sample:7>", "false"}}, 1), new String[][]{{"getOpposite", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"61", "<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "1"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "org.jfree.chart.axis.AxisLocation,boolean", "<sample:1>", "false"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer", "536870928", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-2147483606", "<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "-2147483648"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "536870928", "<sample:6>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"2147483647", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "-2147483648"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis,boolean", "536870928", "<sample:6>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"1", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "2147483647"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", "java.awt.Paint", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", "org.jfree.chart.util.Layer", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-8", "<sample:3>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeAxes", ""}, {"org.jfree.chart.plot.CategoryPlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:7>", "<sample:7>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"49", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-47"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "1"}, {"org.jfree.chart.plot.CategoryPlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#394#545324092", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"196", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-49"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer,boolean", "10", "<sample:4>", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#394#-512513986", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"182", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-2147483648"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "18"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#402#2112705254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"182", "<sample:8>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setWeight", "int", "-2147475456"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "18"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#402#1959177406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-2097334", "<sample:8>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "-9"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "org.jfree.chart.axis.ValueAxis", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getDatasetCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "5", "3", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "5", "3", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", "int", "2147483647"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-236563976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<null>", "<sample:2>", "11", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRootPlot", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=true, getForegroundAlpha=1.0,...#391#649509567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}, {"org.jfree.chart.plot.CategoryPlot", "setNoDataMessage", "java.lang.String", "1L"}, {"org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer", "<sample:0>", "<sample:6>", "3", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#390#787591432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedLegendItems", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.CategoryPlot", "addDomainMarker", "org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer", "<sample:6>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearRangeMarkers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "<sample:3>", "9", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:2>"}}, 1), new String[][]{{"getDomainAxisEdge", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-1", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<sample:3>", "2147483647", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeGridlineStroke", ""}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:4>"}}, 1), new String[][]{{"getDomainAxisEdge", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<sample:3>", "2147483647", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeGridlineStroke", ""}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "<null>", "<sample:4>"}}, 1), new String[][]{{"getFixedLegendItems", "", "6"}, {"getBackgroundImageAlignment", "", "4"}, {"getDatasetRenderingOrder", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DatasetRenderingOrder", actual.getClass().getName());
  assertEquals("DatasetRenderingOrder.REVERSE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:3>", "2147483647", "<sample:5>"}}, 3), new String[][]{{"getDomainAxisEdge", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:3>", "2147483647", "<sample:5>"}}, 3), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#754619229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:3>", "2147483647", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", ""}}, 3), new String[][]{{"getDataset", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:0>", "2147483647", "<sample:5>"}}, 3), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "2"}, {"getBackgroundPaint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:0>", "2147483647", "<null>"}}, 3), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "2"}, {"getBackgroundImageAlignment", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", ""}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:1>", "2147483647", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "getFixedDomainAxisSpace", ""}}, 2), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "2"}, {"getBackgroundImageAlignment", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", "int", "10"}, {"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:1>", "-2147483606", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", ""}}, 2), new String[][]{{"getDataset", "int", "6"}, {"clearRangeAxes", "", "6"}, {"clearDomainAxes", "", "7"}, {"getDataset", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:1>", "-2147483606", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", ""}}, 3), new String[][]{{"getDomainMarkers", "int,org.jfree.chart.util.Layer", "6"}, {"clearRangeAxes", "", "6"}, {"clearDomainAxes", "", "7"}, {"getLegendItems", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D", "boolean"}, new String[]{"10.0", "<sample:5>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getPlotType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Category Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getPlotType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Category Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxis", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"536870928"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"5"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"2"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRowRenderingOrder", "org.jfree.chart.util.SortOrder", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "-2147483648", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", "org.jfree.chart.axis.AxisSpace", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "-2147483648", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"2147483647", "<sample:3>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"2147483647", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"1", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=2, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-620618405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"11", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=12, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#-535752536", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-131061", "<sample:4>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-131061", "<sample:4>"}, false, 16, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "0", "<null>", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"-1073741824", "<sample:6>"}, false, 8, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxis", "int,org.jfree.chart.axis.ValueAxis", "0", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOrientation", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getCategoriesForAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PlotOrientation", actual.getClass().getName());
  assertEquals("PlotOrientation.VERTICAL", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "3"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainAxes", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=0, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#79447965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"0", "<sample:11>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"4", "<sample:10>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=5, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#476765688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"2", "<sample:13>"}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:0>", "1.0", "<sample:3>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=3, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1176832058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1932513165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis"}, new String[]{"9", "<sample:5>"}, false, 15, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeLine", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint", "<sample:3>", "<sample:4>", "0.1", "<sample:6>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", "org.jfree.chart.LegendItemCollection", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=10, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#164313834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"1", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=1.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-1514853029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-3537691700434728188"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "0.1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawDomainGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}, {"org.jfree.chart.plot.CategoryPlot", "zoom", "double", "-3.5376917004347279E18"}, {"org.jfree.chart.plot.CategoryPlot", "isOutlineVisible", ""}}), new String[][]{{"add", "double,org.jfree.chart.util.RectangleEdge", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeGridlinePaint", "java.awt.Paint", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedDomainAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", "int", "10"}, {"org.jfree.chart.plot.CategoryPlot", "getBackgroundAlpha", ""}, {"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "org.jfree.chart.plot.Marker", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", "org.jfree.chart.axis.ValueAxis", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRowRenderingOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getInsets", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawDomainMarkers", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "int", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:3>", "3", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", "org.jfree.chart.plot.DatasetRenderingOrder", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getDatasetGroup", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getAnnotations", ""}, {"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", "int", "2147483647"}, {"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlinePosition", new String[]{"org.jfree.chart.axis.CategoryAnchor"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxis", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace", "<null>", "<sample:4>", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setForegroundAlpha", "float", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=-3....#402#55644521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.CategoryAxis[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getForegroundAlpha", ""}, {"org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainGridlinePaint", new String[]{}, new String[]{}, false), new String[][]{{"getRGBColorComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainGridlinesVisible", "boolean", "true"}, {"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "1.0", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#391#1537701151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:3>"}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<sample:2>"}, {"org.jfree.chart.plot.CategoryPlot", "getLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation", "-131061", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"4.0", "<sample:5>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", new String[]{"int", "org.jfree.chart.axis.AxisLocation"}, new String[]{"9", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setOutlinePaint", "java.awt.Paint", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairPaint", ""}, {"org.jfree.chart.plot.CategoryPlot", "getRangeAxisEdge", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxes", "org.jfree.chart.axis.ValueAxis[]", "<empty>"}, {"org.jfree.chart.plot.CategoryPlot", "setForegroundAlpha", "float", "0.8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=0.8...#392#1137575619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"-2147483648", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxis", new String[]{"int", "org.jfree.chart.axis.ValueAxis", "boolean"}, new String[]{"11", "<sample:5>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#393#1199127386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedRangeAxisSpace", new String[]{"org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeCrosshairStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isDomainGridlinesVisible", ""}}), new String[][]{{"getDashArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[2.0, 2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "5", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDataset", new String[]{"int", "org.jfree.data.category.CategoryDataset"}, new String[]{"-2147483648", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "drawRangeGridlines", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List", "<sample:4>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "configureRangeAxes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRenderer", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", "java.awt.Stroke", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDatasetRenderingOrder", new String[]{"org.jfree.chart.plot.DatasetRenderingOrder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", "java.awt.Stroke", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairValue", "double,boolean", "0.5", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#2124428439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getBackgroundImage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisForDataset", new String[]{"int"}, new String[]{"11"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "mapDatasetToDomainAxis", new String[]{"int", "int"}, new String[]{"-1073741824", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "calculateRangeAxisSpace", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisSpace", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=2.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#-611637190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "boolean"}, new String[]{"<sample:3>", "true"}, false, 4, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRenderer", "int", "4"}, {"org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"int", "org.jfree.chart.axis.CategoryAxis", "boolean"}, new String[]{"11", "<null>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=12, getDrawSharedDomainAxis=false, getForegroundAlpha=1....#393#-535752536", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"1.0", "0.95", "1.0", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "render", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:3>", "1", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "getOrientation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxes", new String[]{"org.jfree.chart.axis.CategoryAxis[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isDomainZoomable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", "double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D", "10.0", "-1.0", "<null>", "<sample:0>"}, {"org.jfree.chart.plot.CategoryPlot", "configureDomainAxes", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.TOP_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setAnchorValue", new String[]{"double", "boolean"}, new String[]{"4.0", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=4.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1194794488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setWeight", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#402#2112705254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"org.jfree.chart.util.Layer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxis", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeGridlinesVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setBackgroundPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.CategoryPlot", "setRenderer", "int,org.jfree.chart.renderer.category.CategoryItemRenderer", "2", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addRangeMarker", new String[]{"org.jfree.chart.plot.Marker"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRendererForDataset", "org.jfree.data.category.CategoryDataset", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"-131061", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isSubplot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setRangeAxisLocation", "int,org.jfree.chart.axis.AxisLocation,boolean", "11", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setFixedLegendItems", new String[]{"org.jfree.chart.LegendItemCollection"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.BOTTOM", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "-3537691700434728188", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-3.5376917004347279E18, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#412#1949982055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-131061", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "-3537691700434728188", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-3.5376917004347279E18, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-893484702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "addRangeMarker", "int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer", "-131061", "<sample:4>", "<null>"}, {"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "-3.5376917004347277E19", "true"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-3.5376917004347277E19, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#412#-774599574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAnchorValue", "double,boolean", "-3.5376917004347277E19", "true"}, {"org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", "java.awt.Stroke", "<sample:7>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxis", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=-3.5376917004347277E19, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, get...#411#-2089753089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getFixedRangeAxisSpace", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainAxis", new String[]{"org.jfree.chart.axis.CategoryAxis"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "addDomainMarker", new String[]{"org.jfree.chart.plot.CategoryMarker", "org.jfree.chart.util.Layer"}, new String[]{"<sample:7>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisLocation", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getOpposite", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisLocation", actual.getClass().getName());
  assertEquals("AxisLocation.BOTTOM_OR_RIGHT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRangeAxisIndex", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", new String[]{"int", "org.jfree.chart.util.Layer"}, new String[]{"-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRangeAxisCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisForDataset", new String[]{"int"}, new String[]{"-2147483606"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDatasetCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-131061", "5", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getCategories", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"2147483647", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataset", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRenderer", new String[]{"int", "org.jfree.chart.renderer.category.CategoryItemRenderer"}, new String[]{"4", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"0.6", "<sample:4>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomDomainAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"1.7976931348623157E308", "-3.5376917004347274E18", "<null>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDataset", "int", "-2147483606"}, {"org.jfree.chart.plot.CategoryPlot", "getOrientation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDomainAxisEdge", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "10.0", "-3537691700434728188", "0.1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleEdge", actual.getClass().getName());
  assertEquals("RectangleEdge.TOP", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setAxisOffset", "org.jfree.chart.util.RectangleInsets", "<sample:5>"}, {"org.jfree.chart.plot.CategoryPlot", "getDomainAxisLocation", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.SortOrder", actual.getClass().getName());
  assertEquals("SortOrder.ASCENDING", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeCrosshairStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "calculateAxisSpace", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "setDomainAxis", "org.jfree.chart.axis.CategoryAxis", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDataRange", new String[]{"org.jfree.chart.axis.ValueAxis"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-3537691700434728188", "4.0", "0.5", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.5376917004347279E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setOrientation", new String[]{"org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:3>", "<sample:2>", "<sample:0>", "<sample:3>"}, {"org.jfree.chart.plot.CategoryPlot", "setNoDataMessageFont", "java.awt.Font", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDrawSharedDomainAxis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getColumnRenderingOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=true, getForegroundAlpha=1.0,...#391#649509567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "clearDomainMarkers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "getDatasetRenderingOrder", ""}, {"org.jfree.chart.plot.CategoryPlot", "getDomainMarkers", "org.jfree.chart.util.Layer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "zoomRangeAxes", new String[]{"double", "double", "org.jfree.chart.plot.PlotRenderingInfo", "java.awt.geom.Point2D"}, new String[]{"4.0", "1.0", "<sample:7>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setRangeGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.CategoryPlot", "isRangeZoomable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.plot.CategoryPlot", "setDomainGridlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.receiverState());
 }
}
