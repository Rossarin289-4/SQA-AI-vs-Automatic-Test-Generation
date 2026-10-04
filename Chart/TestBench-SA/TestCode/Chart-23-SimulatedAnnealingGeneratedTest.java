package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-4", "false", "false"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelGenerator", "int", "7"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupStroke", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelPaint", "int", "8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", "int", "317"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"false", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupStroke", "java.awt.Stroke", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "createState", "org.jfree.chart.plot.PlotRenderingInfo", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#2109938302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesShape", "int,java.awt.Shape", "2147483647", "<sample:3>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "8"}}), new String[][]{{"getIconHeight", "", "7"}, {"getIconWidth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMaxIcon", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getIconHeight", "", "6"}, {"getIconHeight", "", "7"}, {"getIconWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "addAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMaxIcon", "javax.swing.Icon", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<null>", "<sample:6>", "<null>", "<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupStroke", "java.awt.Stroke", "<null>"}}, 2), new String[][]{{"clone", "", "5"}, {"clone", "", "7"}, {"getX", "", "4"}, {"distance", "java.awt.geom.Point2D", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setDrawLines", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#-749972576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMaxIcon", "javax.swing.Icon", "<null>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setDrawLines", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-7", "<sample:0>", "false"}, false, 8, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", "javax.swing.Icon", "<null>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<sample:0>", "<null>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:6>", "<sample:7>", "-3", "2035", "5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"4", "-5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:2>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisible", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemLabelGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499388749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}}, 3), new String[][]{{"getLineWidth", "", "4"}, {"getMiterLimit", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}}, 3), new String[][]{{"getLineWidth", "", "4"}, {"getMiterLimit", "", "1"}, {"getDashPhase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "true"}}, 3), new String[][]{{"getLineWidth", "", "4"}, {"getMiterLimit", "", "1"}, {"getDashPhase", "", "4"}, {"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", "java.awt.Paint", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getIconHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getIconWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"180", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-7", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlineStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:3>", "<sample:2>", "<sample:0>", "<sample:6>", "<sample:0>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-401", "3"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"4", "-1"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", "javax.swing.Icon", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"-76", "28"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesFillPaint", "int", "7"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", "javax.swing.Icon", "<sample:4>"}}, 3), new String[][]{{"getStyle", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:7>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"3", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "<sample:1>", "<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", "int", "359"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>", "<sample:2>", "<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<null>", "<sample:1>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:5>", "4", "3", "8"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getPositiveItemLabelPosition", "int,int", "317", "350"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<null>", "<sample:1>", "<sample:3>", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:6>", "-1", "-3", "8"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getPositiveItemLabelPosition", "int,int", "-2147483648", "-2147483614"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#443#-1177136930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelsVisible", "int", "-5"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:2>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#2109938302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#1776093857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#-1509109146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisibleInLegend", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setLegendItemURLGenerator", "org.jfree.chart.labels.CategorySeriesLabelGenerator", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#-1969004702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#837888066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:3>", "7", "1018", "-4"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>", "<sample:6>", "<sample:5>", "<sample:12>", "<sample:0>", "-1073741824", "1018", "-4"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlinePaint", "boolean", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", "int,int", "10", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#845735486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesShape", "int,java.awt.Shape", "2147483647", "<sample:3>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "8"}}, 3), new String[][]{{"getIconHeight", "", "7"}, {"getIconWidth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", "java.awt.Paint,boolean", "<sample:3>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "8"}}, 2), new String[][]{{"getIconHeight", "", "7"}, {"getIconWidth", "", "2"}, {"getIconHeight", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesURLGenerator", "int,org.jfree.chart.urls.CategoryURLGenerator,boolean", "359", "<sample:7>", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", "java.awt.Paint,boolean", "<sample:3>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "16"}}, 3), new String[][]{{"getIconHeight", "", "7"}, {"getIconWidth", "", "2"}, {"getIconHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "2"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isItemLabelVisible", "int,int", "359", "7"}}, 1), new String[][]{{"getIconHeight", "", "5"}, {"getIconWidth", "", "2"}, {"getIconWidth", "", "1"}, {"getIconHeight", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getIconHeight", "", "5"}, {"getIconWidth", "", "2"}, {"getIconWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupPaint", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getColorSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupPaint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBasePositiveItemLabelPosition", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"16777159", "<sample:2>", "false"}, false, 15, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:3>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItems", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-16777212", "<sample:0>", "true"}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "-4102", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getRowCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getNegativeItemLabelPosition", "int,int", "1", "9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#443#-1177136930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#443#-1177136930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelFont", new String[]{"int"}, new String[]{"-25"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesPaint", "int", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "360", "<sample:1>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseCreateEntities", ""}}, 1), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<null>", "<sample:7>", "<sample:1>", "<sample:7>", "<sample:8>"}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", "javax.swing.Icon", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:4>", "<sample:4>", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", "java.awt.Font", "<null>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlinePaint", "java.awt.Paint,boolean", "<sample:4>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesShape", "int", "736"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:4>", "<sample:5>", "-3", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesShape", "int", "736"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,int,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "<sample:4>", "<sample:5>", "-3", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#999106366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getColumnCount", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseFillPaint", "java.awt.Paint", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#2109938302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1), new String[][]{{"getAlpha", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupStroke", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesOutlinePaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:5>", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "fireChangeEvent", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:6>", "true"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "<sample:1>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:2>", "true"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", "java.awt.Font,boolean", "<sample:7>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setDrawLines", "boolean", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:10>", "<null>", "3", "7", "361"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#-749972576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"56", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "361", "false", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlinePaint", ""}}, 1), new String[][]{{"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "<sample:2>", "true"}}, 1), new String[][]{{"getAlpha", "", "5"}, {"getColorSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"-4", "10"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "3", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"0", "-5"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMaxIcon", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:2>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelGenerator", new String[]{"int", "int"}, new String[]{"0", "-5"}, false, 14, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMaxIcon", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:1>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#223945636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "fireChangeEvent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"1", "<sample:2>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-4", "<sample:2>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisible", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseToolTipGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesCreateEntities", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-4", "false", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelGenerator", "int", "7"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelPaint", "int", "8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499388749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemOutlinePaint", new String[]{"int", "int"}, new String[]{"7", "-5"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemOutlinePaint", new String[]{"int", "int"}, new String[]{"90", "2147483647"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlineStroke", "java.awt.Stroke", "<sample:5>"}}), new String[][]{{"getRGBComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseCreateEntities", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "1", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}}), new String[][]{{"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "false"}}), new String[][]{{"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "false"}}), new String[][]{{"getLineWidth", "", "4"}, {"getMiterLimit", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean,boolean", "false", "false"}}), new String[][]{{"getLineWidth", "", "4"}, {"getMiterLimit", "", "1"}, {"getDashPhase", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMinIcon", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getIconHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator", "boolean"}, new String[]{"9", "<sample:4>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseToolTipGenerator", new String[]{"org.jfree.chart.labels.CategoryToolTipGenerator", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "-4", "true", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"361", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawOutline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesItemLabelsVisible", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", new String[]{"int", "int"}, new String[]{"360", "3"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "10", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>", "<sample:7>", "<sample:4>", "5", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlineStroke", "int", "-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setDrawLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isDrawLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#-749972576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setDrawLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isDrawLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "hasListener", "java.util.EventListener", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=255] {getAlpha=255, getBlue=255, getGreen=0, getRGB=-16776961, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBasePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "hasListener", "java.util.EventListener", "<empty>"}}), new String[][]{{"getComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition,boolean", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesFillPaint", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseNegativeItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", "int,java.awt.Paint", "359", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", new String[]{"int", "org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"3", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<null>", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:4>", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:3>", "<sample:1>", "<sample:2>", "<sample:7>", "<sample:6>", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.plot.CategoryMarker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<null>", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:4>", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", "java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor", "<sample:3>", "<sample:1>", "<sample:2>", "<sample:7>", "<sample:6>", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelsVisible", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesOutlineStroke", "int", "359"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#837888066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseURLGenerator", new String[]{"org.jfree.chart.urls.CategoryURLGenerator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemVisible", new String[]{"int", "int"}, new String[]{"4", "0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", "java.awt.Font", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelsVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelsVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#223945636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesNegativeItemLabelPosition", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "-1", "true", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateRangeMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:4>", "<null>", "<sample:1>", "<null>", "<sample:4>", "<sample:7>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setMinIcon", new String[]{"javax.swing.Icon"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeChangeListener", new String[]{"org.jfree.chart.event.RendererChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:2>", "<sample:4>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelPaint", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean,boolean", "317", "true", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#-1509109146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#1776093857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#2109938302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesCreateEntities", new String[]{"int"}, new String[]{"350"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"3", "<sample:4>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlineStroke", new String[]{"int", "java.awt.Stroke", "boolean"}, new String[]{"2147483647", "<sample:6>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlineStroke", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#-1969004702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", new String[]{"javax.swing.Icon"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"4", "5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseShape", "java.awt.Shape", "<sample:6>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "361", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setObjectIcon", new String[]{"javax.swing.Icon"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "equals", "java.lang.Object", "<i:-33562625>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelFont", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesCreateEntities", "int,java.lang.Boolean,boolean", "-3", "false", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"10", "false", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseStroke", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", "int,java.awt.Stroke,boolean", "5", "<sample:0>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", new String[]{"java.awt.Graphics2D", "org.jfree.chart.renderer.category.CategoryItemRendererState", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.data.category.CategoryDataset", "int", "int", "int"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>", "<sample:7>", "<sample:5>", "<sample:12>", "<sample:0>", "-1073741824", "1018", "-4"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelFont", "int,int", "-4", "1073741783"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"0", "<sample:4>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesURLGenerator", new String[]{"int", "org.jfree.chart.urls.CategoryURLGenerator", "boolean"}, new String[]{"-361", "<sample:4>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseNegativeItemLabelPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesStroke", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", "boolean", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", "java.awt.Font", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemToolTipGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#443#2056059688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemCreateEntity", new String[]{"int", "int"}, new String[]{"-4", "8"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemCreateEntity", new String[]{"int", "int"}, new String[]{"-4", "-16"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#443#-1177136930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPositiveItemLabelPosition", new String[]{"int"}, new String[]{"8"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPositiveItemLabelPosition", new String[]{"int"}, new String[]{"8"}, false), new String[][]{{"getTextAnchor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.BOTTOM_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPositiveItemLabelPosition", new String[]{"int"}, new String[]{"-53"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlineStroke", "boolean", "true"}}), new String[][]{{"getTextAnchor", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.BOTTOM_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=true, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#-1969004702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getPlot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "1", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.CategoryPlot", actual.getClass().getName());
  assertEquals("{getAnchorValue=0.0, getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDatasetCount=1, getDomainAxisCount=1, getDrawSharedDomainAxis=false, getForegroundAlpha=1.0...#392#1876898428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getObjectIcon", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getIconHeight", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseToolTipGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:0>", "<sample:4>", "<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseToolTipGenerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesOutlinePaint", new String[]{"int"}, new String[]{"361"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawRangeMarker", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D", "<sample:7>", "<sample:1>", "<sample:1>", "<sample:5>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"7", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawRangeGridline", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "java.awt.geom.Rectangle2D", "double"}, new String[]{"<null>", "<sample:2>", "<sample:3>", "<sample:5>", "4.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>", "<sample:7>", "<null>", "<null>", "<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "-5", "<sample:1>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisible", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[0.0, 0.0] {getX=0.0, getY=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getPlot", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupPaint", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getColorSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBasePositiveItemLabelPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"0", "<sample:3>", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:3>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBasePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-57", "<sample:3>", "true"}, false, 3, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "1018", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseToolTipGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=false, getAutoPopulateSeriesShape=true, getAutoPopu...#443#-1177136930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesPaint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseToolTipGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemFillPaint", new String[]{"int", "int"}, new String[]{"10", "1"}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:1>", "360"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", "int,java.awt.Font", "9", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "361"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#443#2056059688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesStroke", "int", "390"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesNegativeItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "360", "<sample:1>", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseCreateEntities", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=true, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#845735486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"5", "317"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean,boolean", "1", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawRangeMarker", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.plot.Marker", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseStroke", "java.awt.Stroke,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseShape", new String[]{"java.awt.Shape", "boolean"}, new String[]{"<sample:4>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getGroupPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelPaint", "int,int", "8", "360"}}), new String[][]{{"getComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", actual.getClass().getName());
  assertEquals("{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isDrawLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseNegativeItemLabelPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelGenerator", "org.jfree.chart.labels.CategoryItemLabelGenerator,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.ItemLabelPosition", actual.getClass().getName());
  assertEquals("{getAngle=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getMaxIcon", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setGroupStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setItemLabelAnchorOffset", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#447#80374307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseToolTipGenerator", "org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelGenerator", new String[]{"int"}, new String[]{"361"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisible", "int,java.lang.Boolean", "-2147483648", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesShape", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlineStroke", "java.awt.Stroke,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseFillPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesShape", "int", "2147483647"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelPaint", "int,java.awt.Paint,boolean", "10", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItemURLGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator", "5", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>", "<sample:5>", "<null>", "<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateDomainMarkerTextAnchorPoint", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PlotOrientation", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleInsets", "org.jfree.chart.util.LengthAdjustmentType", "org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:4>", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelGenerator", "int", "509"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategoryItemLabelGenerator"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"9", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-82", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesShape", "int", "359"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#-1727002212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePositiveItemLabelPosition", "org.jfree.chart.labels.ItemLabelPosition", "<sample:1>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesShape", "int", "359"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseURLGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", "int,java.awt.Stroke,boolean", "9", "<sample:6>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPositiveItemLabelPosition", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#999106366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", new String[]{"int", "java.lang.Boolean"}, new String[]{"359", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "-1", "<sample:2>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"1018", "<null>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPaint", "int", "8"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:0>", "<sample:0>", "<sample:4>", "-4.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseCreateEntities", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPaint", "int", "8"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawDomainGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double", "<sample:0>", "<sample:0>", "<sample:4>", "-4.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#443#2056059688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlinePaint", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"getAlpha", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"359"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseShape", "java.awt.Shape,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesPaint", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawBackground", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D", "<sample:3>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseNegativeItemLabelPosition", new String[]{"org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.category.CategoryItemRendererState", actual.getClass().getName());
  assertEquals("{getBarWidth=0.0, getSeriesRunningTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "createState", new String[]{"org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseURLGenerator", ""}}), new String[][]{{"getBarWidth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>", "0", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:4>", "3"}}), new String[][]{{"getEntityCollection", "", "4"}, {"add", "org.jfree.chart.entity.ChartEntity", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.entity.StandardEntityCollection", actual.getClass().getName());
  assertEquals("{getEntityCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.CategoryPlot", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "0", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawItem", "java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int", "<null>", "<sample:5>", "<sample:0>", "<sample:6>", "<sample:7>", "<sample:0>", "<sample:2>", "2147483647", "-4", "9"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDomainAxis", "org.jfree.chart.plot.CategoryPlot,int", "<sample:4>", "3"}}), new String[][]{{"getEntityCollection", "", "4"}, {"getSeriesRunningTotal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "notifyListeners", new String[]{"org.jfree.chart.event.RendererChangeEvent"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisibleInLegend", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawBackground", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.CategoryPlot", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"4", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", "int,java.lang.Boolean", "350", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "361", "false", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"-2147483648", "<sample:1>"}, false, 10, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"359", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"-359", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelFont", new String[]{"int", "java.awt.Font"}, new String[]{"-359", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"5", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-2147483647", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", new String[]{}, new String[]{}, false), new String[][]{{"getGreen", "", "6"}, {"getTransparency", "", "3"}, {"getComponents", "java.awt.color.ColorSpace,float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-2147483648", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"-2147483648", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlinePaint", "java.awt.Paint", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "boolean"}, new String[]{"-44", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"360", "0"}, false, 12, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "addItemEntity", "org.jfree.chart.entity.EntityCollection,org.jfree.data.category.CategoryDataset,int,int,java.awt.Shape", "<sample:6>", "<sample:7>", "4", "2147483647", "<sample:2>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean,boolean", "350", "true", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setLegendItemToolTipGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseURLGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getRowCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesPositiveItemLabelPosition", "int,org.jfree.chart.labels.ItemLabelPosition,boolean", "360", "<sample:3>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseURLGenerator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesURLGenerator", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesToolTipGenerator", "int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean", "-4", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesOutlinePaint", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisible", "int,java.lang.Boolean", "-5", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getAutoPopulateSeriesOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseItemLabelsVisible", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseCreateEntities", ""}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getToolTipGenerator", "int,int", "1", "18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesOutlinePaint", new String[]{"int", "java.awt.Paint", "boolean"}, new String[]{"-2147483648", "<sample:3>", "true"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesPaint", new String[]{"int", "java.awt.Paint"}, new String[]{"2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>", "360.0", "1.0", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Point2D$Double", actual.getClass().getName());
  assertEquals("Point2D.Double[360.0, -3.0] {getX=360.0, getY=-3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "calculateLabelAnchorPoint", new String[]{"org.jfree.chart.labels.ItemLabelAnchor", "double", "double", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:4>", "360.0", "1.0", "<sample:5>"}, false), new String[][]{{"distanceSq", "java.awt.geom.Point2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemLabelAnchorOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getLegendItem", new String[]{"int", "int"}, new String[]{"-1", "360"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisible", "boolean", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesCreateEntities", "int", "359"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#443#999106366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"10", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=false, getAutoPopu...#443#2056059688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", new String[]{"int", "java.awt.Stroke"}, new String[]{"10", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesShape", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isItemLabelVisible", new String[]{"int", "int"}, new String[]{"-1", "350"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelFont", "java.awt.Font", "<sample:1>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseOutlineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemStroke", new String[]{"int", "int"}, new String[]{"317", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseSeriesVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlinePaint", "java.awt.Paint,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesNegativeItemLabelPosition", new String[]{"int", "org.jfree.chart.labels.ItemLabelPosition"}, new String[]{"317", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisible", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"1018"}, false, 7, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:3>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisibleInLegend", "int", "4"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisible", "int", "360"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:5>", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#223945636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesVisibleInLegend", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesFillPaint", "boolean", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isSeriesVisible", "int", "360"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:0>", "<sample:5>", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=true, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopula...#441#223945636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelsVisible", new String[]{"int", "java.lang.Boolean", "boolean"}, new String[]{"-1", "true", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseSeriesVisibleInLegend", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawAnnotations", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.axis.CategoryAxis", "org.jfree.chart.axis.ValueAxis", "org.jfree.chart.util.Layer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:6>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelsVisible", new String[]{"int"}, new String[]{"1018"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeChangeListener", "org.jfree.chart.event.RendererChangeListener", "<sample:5>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "fireChangeEvent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBasePaint", "java.awt.Paint,boolean", "<sample:1>", "true"}}, 1), new String[][]{{"getNextShape", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getDrawingSupplier", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getNextShape", "", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setLegendItemLabelGenerator", new String[]{"org.jfree.chart.labels.CategorySeriesLabelGenerator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", "int,java.awt.Stroke,boolean", "1018", "<sample:7>", "false"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getBaseFillPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesItemLabelPaint", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesStroke", "int", "360"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "removeAnnotation", new String[]{"org.jfree.chart.annotations.CategoryAnnotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setAutoPopulateSeriesStroke", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlineStroke", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "lookupSeriesOutlineStroke", new String[]{"int"}, new String[]{"-7"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesItemLabelGenerator", "int,org.jfree.chart.labels.CategoryItemLabelGenerator", "-2147483648", "<sample:3>"}}), new String[][]{{"createStrokedShape", "java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelPaint", new String[]{"java.awt.Paint", "boolean"}, new String[]{"<null>", "false"}, false, 6, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getItemOutlineStroke", "int,int", "359", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"360", "3"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesFillPaint", "int,java.awt.Paint,boolean", "-5", "<sample:5>", "true"}}), new String[][]{{"getTextAnchor", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.TOP_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getNegativeItemLabelPosition", new String[]{"int", "int"}, new String[]{"1073741869", "-2147483647"}, false, 3, new String[][]{}, 1), new String[][]{{"getTextAnchor", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.TOP_CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPaint", new String[]{"int"}, new String[]{"359"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "getSeriesPaint", new String[]{"int"}, new String[]{"359"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesVisibleInLegend", "int,java.lang.Boolean", "350", "true"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", "int,java.awt.Stroke", "-3", "<sample:7>"}, {"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setSeriesStroke", "int,java.awt.Stroke", "361", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#442#2103890665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "isItemLabelVisible", new String[]{"int", "int"}, new String[]{"-2147483648", "8"}, false, 1, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseItemLabelsVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAutoPopulateSeriesFillPaint=false, getAutoPopulateSeriesOutlinePaint=false, getAutoPopulateSeriesOutlineStroke=false, getAutoPopulateSeriesPaint=true, getAutoPopulateSeriesShape=true, getAutoPopul...#441#837888066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "setBaseOutlineStroke", new String[]{"java.awt.Stroke", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"org.jfree.chart.renderer.category.MinMaxCategoryRenderer", "drawRangeGridline", "java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double", "<sample:1>", "<sample:0>", "<sample:7>", "<sample:6>", "-4.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
