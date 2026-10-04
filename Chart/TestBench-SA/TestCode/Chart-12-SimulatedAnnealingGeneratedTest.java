package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:1>"}}, 3), new String[][]{{"add", "org.jfree.chart.LegendItem", "7"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItem", actual.getClass().getName());
  assertEquals("{getDatasetIndex=0, getDescription=a, getLabel=, getSeriesIndex=0, getToolTipText=0, getURLText=sample, isLineVisible=true, isShapeFilled=false, isShapeOutlineVisible=false, isShapeVisible=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:0>"}}), new String[][]{{"getItemCount", "", "7"}, {"clone", "", "3"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:3>", "<sample:3>", "<sample:3>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "1.7976931348623157E308"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:2>"}}, 3), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<null>", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<s:->"}}, 1), new String[][]{{"getNextShape", "", "1"}, {"outcode", "double,double", "6"}, {"getY", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:keyF>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keyF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "-1", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "-1", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 3), new String[][]{{"getNextOutlineStroke", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2), new String[][]{{"getComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isSubplot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "-355377800470807389"}, {"org.jfree.chart.plot.MultiplePiePlot", "isSubplot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-3.55377792E17, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVi...#228#982521015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "isSubplot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}, {"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "3.4028235E38"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-1879802192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>", "<sample:5>", "<sample:6>", "<sample:2>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getParent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "zoom", new String[]{"double"}, new String[]{"-24.700000000000003"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "zoom", new String[]{"double"}, new String[]{"Infinity"}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}}, 3), new String[][]{{"setOutlineStroke", "java.awt.Stroke", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "SansSerif"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=SansSerif, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#1582188201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "1.12345678"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=1.12345678, getPlotType=Multiple Pie Plot, isOutlineVisible...#223#-1640339718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Other", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-1.0", "Infinity", "0.0", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:5>"}}, 1), new String[][]{{"deriveFont", "java.util.Map", "5"}, {"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "5"}, {"getLogicalBounds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=0.0,y=-11.138672,w=8.0,h=13.96875] {getCenterX=4.0, getCenterY=-4.154296875, getHeight=13.96875, getMaxX=8.0, getMaxY=2.830078125, getMinX=0.0, getMinY=-11.138671875,...#259#459251827", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<null>"}}, 1), new String[][]{{"deriveFont", "java.util.Map", "5"}, {"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=8.988465674311579E307, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOu...#235#-460682026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"8.988465674311578E307"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=8.988465674311578E307, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOu...#235#738053239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1629073395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-1.7014117E38"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-1.7014117E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-25905754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"1.7014117E38"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.7014117E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-276634551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"Infinity"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=Infinity, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#376067077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-Infinity"}, false, 12, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-Infinity, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible...#223#1074617314", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "2147483647", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"trimHeight", "double", "3"}, {"extendWidth", "double", "4"}, {"calculateBottomInset", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "0x123456789"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x123456789, getPlotType=Multiple Pie Plot, isOutlineVisibl...#224#-932284084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "0x1234567889"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x1234567889, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#-226564890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:2>"}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-1073741824", "-1", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#175557732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-1073741824", "-1", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "-3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "3.4028235E38"}, {"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-1879802192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "3.4028235E37"}, {"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=3.4028235E37, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1408242415", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-3.4028235E37"}, {"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E37, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#1658971212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", "java.awt.Paint", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getForegroundAlpha", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x1F, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#110241182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x1F, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#43903382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"0x1FF"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x1FF, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#877212168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"0x0GF"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x0GF, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#453771366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"0x0HF"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x0HF, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#897382789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", new String[]{"java.awt.Image"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"1.7976931348623157E308", "Infinity", "1.0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"Infinity", "1.0", "1.0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-1.0", "Infinity", "-1.0", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-58.0", "Infinity", "-2.0", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-58.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-29.0", "Infinity", "-2.0", "<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-29.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "-1", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"getComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isSubplot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "1.0"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-735222081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "-1"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-1624884704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-1, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-1624884704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=1, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1006327475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "2147483647"}, {"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:key>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}}), new String[][]{{"getNextStroke", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "[1,2]"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:key>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}}), new String[][]{{"getNextStroke", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=2, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=[1,2], getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#-782085824", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MultiplePiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "NaN"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=NaN, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#893243031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "3.4028235E38"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-1879802192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataExtractOrder", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.TableOrder", actual.getClass().getName());
  assertEquals("TableOrder.BY_COLUMN", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isSubplot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "isSubplot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=NaN, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#466784828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataset", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "1"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=1, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1006327475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "zoom", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "1073741825"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=1073741825, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#931693822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "1073741880"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=1073741880, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#-1193555853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "10"}, {"org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=10, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-1028412453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=NaN, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#466784828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"-355377800470807389"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.0", "1.0", "NaN", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#899200053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"-1.7014117E38"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.0", "1.0", "NaN", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-1.7014117E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#1084799002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"1.7014117E38"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.0", "1.0", "NaN", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.7014117E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-757196047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"1.7014117E38"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.0", "1.0", "NaN", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.7014117E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#225#-1119360360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "true"}, {"org.jfree.chart.plot.MultiplePiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=3.4028235E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1367029290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getLimit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"0", "0", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", new String[]{"org.jfree.chart.util.TableOrder"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getGreen", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#175557732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#-735222081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"0.5"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.5, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1871118843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.7976931348623157E308, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isO...#236#-1437066774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getPieChart", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=8.988465674311579E307, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOu...#235#-460682026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-3.4028235E38"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1629073395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRootPlot", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#-503926026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "2147483626", "<null>"}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setPieChart", new String[]{"org.jfree.chart.JFreeChart"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "2147483647", "2147483626", "<null>"}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.7976931348623157E308", "1.7976931348623157E308", "NaN", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawOutline", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLimit", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=1.7976931348623157E308, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isO...#236#-1437066774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=a b, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1930114110", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPlotType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "a b5."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Multiple Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=a b5., getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#495963099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false), new String[][]{{"trimHeight", "double", "3"}, {"extendWidth", "double", "4"}, {"calculateBottomInset", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "0x1234567889"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x1234567889, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#-226564890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessagePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:;>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "01234567889"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=01234567889, getPlotType=Multiple Pie Plot, isOutlineVisibl...#224#711250196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:;>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "01234567889010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=01234567889010, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-663423661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}}), new String[][]{{"isBorderVisible", "", "6"}, {"getPadding", "", "2"}, {"getLeft", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getDataset", ""}}), new String[][]{{"isBorderVisible", "", "6"}, {"getPadding", "", "2"}, {"getLeft", "", "0"}, {"createInsetRectangle", "java.awt.geom.Rectangle2D", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "Other"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=Other, getPlotType=Multiple Pie Plot, isOutlineVisible=fals...#219#-1131148310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "Other"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=Other, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#-921510769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"-2147483648", "-1", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#175557732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=NaN, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#1779868616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getDrawingSupplier", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<i:-1>"}}), new String[][]{{"getColorComponents", "float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "axisChanged", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:3>", "<sample:0>", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#284317352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:7>"}}), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "Infinity", "-355377800470807389", "1.0", "<sample:0>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", "java.awt.Paint", "<sample:7>"}}), new String[][]{{"getItemCount", "", "0"}, {"add", "org.jfree.chart.LegendItem", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlinePaint", "java.awt.Paint", "<sample:10>"}}), new String[][]{{"getItemCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=1.1234567890123456, getPlotType=Multiple Pie Plot, isOutlin...#231#1154092852", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:5>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "addChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:5>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", ""}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:7>"}, {"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "fireChangeEvent", ""}}, 1), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false), new String[][]{{"getLineWidth", "", "3"}, {"getDashPhase", "", "2"}, {"getMiterLimit", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#723704995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-2.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true...#218#2008767524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"-20.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "-1.27"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-20.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=tru...#219#-447541606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "isOutlineVisible", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}}), new String[][]{{"getGroup", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}}), new String[][]{{"getRowKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}}), new String[][]{{"getRowKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}), new String[][]{{"getRowKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 2), new String[][]{{"getRowKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 2), new String[][]{{"getRowKeys", "", "6"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImage", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:7>", "true"}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}}), new String[][]{{"getRowKeys", "", "6"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getDataset", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<sample:7>", "true"}, {"org.jfree.chart.plot.MultiplePiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}}), new String[][]{{"getRowKeys", "", "6"}, {"lastIndexOf", "java.lang.Object", "3"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"NaN", "-1.0", "1.7976931348623157E308", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "getInsets", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"NaN", "-1.7976931348623158E307", "1.0", "<sample:2>"}, false, 12, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=false...#218#-166686727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-355377800470807389"}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.55377792E17, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVi...#228#1720479491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:2>"}}), new String[][]{{"getBlue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:2>"}}, 1), new String[][]{{"getBlue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483626"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483626, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisib...#225#1759647273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false), new String[][]{{"deriveFont", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=2147483647] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=Sans...#472#579367769", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#899200053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<null>", "<sample:3>", "<null>", "<null>"}}, 2), new String[][]{{"getTransparency", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>", "<null>", "<sample:3>", "<null>", "<null>"}}, 2), new String[][]{{"getTransparency", "", "0"}, {"getRGBComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:2>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "Infinity"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessageFont", "java.awt.Font", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "handleClick", "int,int,org.jfree.chart.plot.PlotRenderingInfo", "-2147483648", "1", "<sample:2>"}}), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=Infinity, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=...#222#899200053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:6>"}}, 3), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:1>"}}, 3), new String[][]{{"getItemCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false), new String[][]{{"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "resolveRangeAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:3>"}}, 3), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"getItemCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<i:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:3>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "0x123456789"}}), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"getItemCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=0x123456789, getPlotType=Multiple Pie Plot, isOutlineVisibl...#224#-932284084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsKey", "java.lang.Comparable", "<s:b>"}, {"org.jfree.chart.plot.MultiplePiePlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:2>"}}), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"iterator", "", "6"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:2>", "<sample:1>"}}, 1), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"iterator", "", "6"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "7"}, {"iterator", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-3.4028235E38"}}), new String[][]{{"clone", "", "7"}, {"addAll", "org.jfree.chart.LegendItemCollection", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1629073395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-3.4028235E38"}}, 2), new String[][]{{"clone", "", "7"}, {"addAll", "org.jfree.chart.LegendItemCollection", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=-3.4028235E38, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1629073395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:8>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "-3.4028235E38"}, {"org.jfree.chart.plot.MultiplePiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:0>"}}, 2), new String[][]{{"clone", "", "7"}, {"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:7>"}}, 1), new String[][]{{"add", "org.jfree.chart.LegendItem", "7"}, {"get", "int", "2"}, {"getLine", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:1>"}}), new String[][]{{"add", "org.jfree.chart.LegendItem", "7"}, {"get", "int", "2"}, {"getLine", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", "java.awt.Stroke", "<sample:1>"}}, 3), new String[][]{{"add", "org.jfree.chart.LegendItem", "7"}, {"get", "int", "2"}, {"getLine", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDrawingSupplier", "org.jfree.chart.plot.DrawingSupplier", "<sample:2>"}}, 1), new String[][]{{"createInsetRectangle", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getNoDataMessage", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:7>"}}), new String[][]{{"getColorSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getOutlinePaint", ""}, {"org.jfree.chart.plot.MultiplePiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:1>"}}), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "<sample:3>", "<sample:4>", "<sample:1>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#216#-1503545079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setPieChart", "org.jfree.chart.JFreeChart", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.0", "1.7976931348623157E308", "0.0", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:6>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setDataExtractOrder", "org.jfree.chart.util.TableOrder", "<sample:5>"}, {"org.jfree.chart.plot.MultiplePiePlot", "getDatasetGroup", ""}}, 3), new String[][]{{"addAll", "org.jfree.chart.LegendItemCollection", "4"}, {"add", "org.jfree.chart.LegendItem", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", ""}}, 3), new String[][]{{"add", "org.jfree.chart.LegendItem", "3"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundAlpha", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=NaN, getBackgroundImageAlignment=-2147483648, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#954332878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setAggregatedItemsPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setDataset", "org.jfree.data.category.CategoryDataset", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getPlotType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Other", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=3.4028235E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisi...#226#1367029290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getAggregatedItemsPaint", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<s:ley>"}, {"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "0"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1255605876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<s:mey>"}, {"org.jfree.chart.plot.MultiplePiePlot", "notifyListeners", "org.jfree.chart.event.PlotChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlignment", "int", "0"}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=0, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true, ...#216#-1255605876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "equals", "java.lang.Object", "<i:15>"}, {"org.jfree.chart.plot.MultiplePiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:4>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setForegroundAlpha", "float", "-3.4028235E38"}}, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-3.4028235E38, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVis...#227#-1085942957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getPieChart", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.JFreeChart", actual.getClass().getName());
  assertEquals("{getAntiAlias=true, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getSubtitleCount=0, isBorderVisible=false, isNotify=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"-1.7976931348623157E308", "-355377800470807389", "-1.0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#217979552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setLimit", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-1.7976931348623157E308, getNoDataMessage=null, getPlotType=Multiple Pie Plot, is...#237#286242389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "zoom", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImageAlpha", "float", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0, getForegroundAlpha=1.0, getLimit=0.0, getNoDataMessage=null, getPlotType=Multiple Pie Plot, isOutlineVisible=true,...#217#175557732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.7976931348623157E308", "-1.7976931348623157E308", "1.0", "<sample:1>"}, {"org.jfree.chart.plot.MultiplePiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:4>", "<sample:2>"}, {"org.jfree.chart.plot.MultiplePiePlot", "setBackgroundImage", "java.awt.Image", "<sample:7>"}}, 1), new String[][]{{"iterator", "", "0"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.MultiplePiePlot", "org.jfree.chart.plot.MultiplePiePlot", "setLimit", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.jfree.chart.plot.MultiplePiePlot", "setNoDataMessage", "java.lang.String", "Null 'paint' argument."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getLimit=-1.7976931348623157E308, getNoDataMessage=Null 'paint' argument., getPlotType=Mul...#255#850065526", SearchInputFactory_scaffolding.receiverState());
 }
}
