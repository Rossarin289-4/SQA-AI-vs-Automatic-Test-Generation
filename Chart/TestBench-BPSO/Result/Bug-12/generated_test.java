package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getPlotType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=4.9E-324, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#1964073228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "2020-02-30T25:61:611.5e300[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=2020-02-30T25:61:611.5e300[1,2], getPlotType=Multiple Pie P...#244#-1439156038", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:10>"}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=1, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<null>"}}, 3), new String[][]{{"getBlue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isSubplot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<i:32>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<null>", "<sample:2>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-0.0"}}, 2), new String[][]{{"setTextAntiAlias", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-0.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#-561357534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "Hello, WorldTitle"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=Hello, WorldTitle, getPlotType=Multiple Pie Plot, i...#238#1596657219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}}, 1), new String[][]{{"getComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-2147483638", "2147483647", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:9>", "<sample:0>", "<sample:2>", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"1.7976931348623157E308", "-3.5537780047080742E17", "-3.5537780047080742E17", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"calculateRightOutset", "double", "3"}, {"calculateTopInset", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Other", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:10>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "-2147483588"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483588, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1303449841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-3.4028235E37"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E37, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#1658971212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isSubplot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:4>", "<sample:0>", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:6>", "<sample:6>", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isSubplot", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"18.0", "1.0000000000000002", "-49.061", "<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("18.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"2147483647", "2147483647", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getTransparency", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation", "<sample:7>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,int[]", "3"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getRGBColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:3>", "<sample:4>", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"20"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=20, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-1890716614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:0>", "<sample:6>", "<sample:2>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-1.7976931348623158E307", "-1.0", "NaN", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-0.5", "NaN", "NaN", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"2147483594", "2147483593", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.7976931348623155E308", "Infinity", "-1.7976931348623157E308", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"1.7976931348623157E308", "Infinity", "-4.9E-324", "<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "-0.061"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-0.061, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=tr...#220#-1210294726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Other", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:8>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isSubplot", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:116>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-1.7976931348623157E308", "4.9E-324", "-4.9E-324", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false), new String[][]{{"getNextStroke", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "zoom", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:3>", "<null>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-0.122", "-2.0", "0.9999999999999999", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.122", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}), new String[][]{{"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"-1.77688896E17"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-735222081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:7>", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=1, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1006327475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}}), new String[][]{{"getGreen", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<s:\ta>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "5", "2147483616", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"-0.29"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-0.29, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=tru...#219#952282912", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:W>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "Multiple Pie Pmot+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=Multiple Pie Pmot+1, getPlotType=Multiple Pie Plot, isOutli...#232#1418789675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "-6.4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-6.4, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#-1477099445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"calculateLeftInset", "double", "7"}, {"getUnitType", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.UnitType", actual.getClass().getName());
  assertEquals("UnitType.ABSOLUTE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=Infinity, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#1346468370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getNoDataMessagePaint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMaxCharBounds", "java.awt.font.FontRenderContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=0.0,y=-11.138672,w=22.0,h=13.96875] {getCenterX=11.0, getCenterY=-4.154296875, getHeight=13.96875, getMaxX=22.0, getMaxY=2.830078125, getMinX=0.0, getMinY=-11.1386718...#263#-1140126771", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false), new String[][]{{"getNextOutlinePaint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:3>", "<sample:3>", "<sample:6>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false), new String[][]{{"getDashArray", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}}), new String[][]{{"getID", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false), new String[][]{{"getAvailableAttributes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.text.AttributedCharacterIterator$Attribute;", actual.getClass().getName());
  assertEquals("[java.awt.font.TextAttribute(family), java.awt.font.TextAttribute(weight), java.awt.font.TextAttribute(width), java.awt.font.TextAttribute(posture), java.awt.font.TextAttribute(size), java.awt.font.Te...#922#1164699394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"0.0"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "0.9", "-0.1", "-0.061", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#2114097029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-Infinity", "1.0", "Infinity", "<sample:9>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getRGBComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:1>"}}), new String[][]{{"getForegroundAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=Infinity, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#376067077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getPSName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SansSerif.plain", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483602"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483602, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#-1807825305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-2145386496"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2145386496, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1922237769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-0.061", "NaN", "-7.1075560094161459E17", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.061", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=0.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-1067082977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"createStrokedShape", "java.awt.Shape", "3"}, {"contains", "java.awt.geom.Rectangle2D", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "zoom", "double", "Infinity"}}), new String[][]{{"getLineMetrics", "java.lang.String,java.awt.font.FontRenderContext", "5"}});
  assertNotNull(actual);
  assertEquals("sun.font.FontLineMetrics", actual.getClass().getName());
  assertEquals("{getAscent=11.138672, getBaselineIndex=0, getBaselineOffsets=[0.0, -4.8618164, -11.138672], getDescent=2.8300781, getHeight=13.96875, getLeading=0.0, getNumChars=1, getStrikethroughOffset=-3.1054688, ...#300#-1628306371", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=1.12345678, getPlotType=Multiple Pie Plot, isOutlineVisible...#223#-1640339718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "NaN"}}), new String[][]{{"getRed", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=NaN, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1794107512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:5>"}}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"2.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=2.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1503042081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"3.4000000000000004", "0.061", "-0.031", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.4000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}}), new String[][]{{"createInsetRectangle", "java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"NaN", "Infinity", "-0.060999999999999985", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-3.4028235E38"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1629073395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=NaN, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#893243031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<sample:5>"}}), new String[][]{{"setForegroundAlpha", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible...#223#243944926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible...#223#243944926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}}), new String[][]{{"drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=0.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-1348919462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}}), new String[][]{{"calculateRightOutset", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getBackgroundImageAlignment", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1255605876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.7976931348623157E308, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isO...#236#-1437066774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-1879802192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setInsets", "org.jfree.chart.util.RectangleInsets", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", ""}}), new String[][]{{"getDashPhase", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getColorSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}}, 1), new String[][]{{"createInsetRectangle", "java.awt.geom.Rectangle2D", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-7.1075560094161472E17", "-0.061", "0.05", "<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.1075560094161472E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#175557732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"=a>b</a"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage==a>b</a, getPlotType=Multiple Pie Plot, isOutlineVisible=tr...#220#-1471560059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-0.1", "4.9E-324", "-24.061", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}), new String[][]{{"brighter", "", "1"}, {"getComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"getEndCap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}}), new String[][]{{"isBorderVisible", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}}), new String[][]{{"getColorSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-503926026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}}, 2), new String[][]{{"getTransparency", "", "2"}, {"getColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.7529412, 0.7529412, 0.7529412]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"1.0"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "NaN", "Infinity", "-Infinity", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-0.0305", "1.7976931348623157E308", "-34.0", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0305", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#899200053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", ""}}), new String[][]{{"isOutlineVisible", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}}, 1), new String[][]{{"getLegend", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getRenderingHints", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.RenderingHints", actual.getClass().getName());
  assertEquals("{Global antialiasing enable key=Antialiased rendering mode}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.7976931348623157E308, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isO...#236#-1437066774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:7a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"8.5070587E37"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=8.5070587E37, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1480527388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=NaN, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1779868616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483554"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483554, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#-364196797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", ""}}), new String[][]{{"getDashArray", "", "3"}, {"getMiterLimit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"0.39", "4.9E-324", "4.9E-324", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "4"}, {"getValue", "java.lang.Comparable,java.lang.Comparable", "2"}, {"getColumnIndex", "java.lang.Comparable", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"1.0", "-4.9E-324", "Infinity", "<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}}), new String[][]{{"add", "org.jfree.chart.LegendItem", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"setBackgroundImage", "java.awt.Image", "0"}, {"setAggregatedItemsKey", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getSubtitle", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false), new String[][]{{"getXYPlot", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1255605876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<i:1>"}}), new String[][]{{"getNextPaint", "", "3"}, {"getGreen", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("85", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-1073741797"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1073741797, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-386807771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"42"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=42, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1178199162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:5>"}}), new String[][]{{"getColorSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"0.005"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.0E-323", "-1.0", "61.0", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=0.005, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=tru...#219#-1186640740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "-2147483594"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483594, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-555967924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:kdy>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "6"}, {"getNoDataMessage", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:10>", "<sample:8>"}}), new String[][]{{"getAlpha", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-2147483648", "-2147483648", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "-7.1075560094161472E17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-7.1075560094161472E17, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isO...#236#1923132271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"Infinity", "-8.988465674311579E307", "-4.800000000000001", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "-3.4028235E38"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-3.4028235E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1085942957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-4.9E-324", "4.9E-324", "0.5", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "1.1234b68"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Other", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=1.1234b68, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#1155046788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:3>"}}), new String[][]{{"getSubtitles", "", "7"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
}
