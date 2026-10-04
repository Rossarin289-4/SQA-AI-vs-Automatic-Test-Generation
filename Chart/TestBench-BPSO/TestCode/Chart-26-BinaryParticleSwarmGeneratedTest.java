package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "3.974"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=3.974, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#-1472522021", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-0.0"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#399#-2126813574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:3>", "<sample:6>", "<null>", "<sample:10>", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "false"}}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "hasListener", "java.util.EventListener", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<null>"}, {"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#942460142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "a3.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=a3.0, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-622956265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "2.0I"}, {"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=2.0I, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#2071533711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "3.8596448E18"}, {"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#407#-1759679960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<null>", "<sample:4>", "<sample:6>", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}}, 3), new String[][]{{"getCursor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "3.4028235E38"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "Null 'str+oke' argument.8"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=Null 'str+oke' argument.8, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, get...#432#-92263975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}, {"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<null>"}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "12:30:452.0", "<sample:6>", "<sample:6>", "<sample:10>", "<sample:4>", "<sample:4>", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:0>", "15.99", "<sample:1>", "<sample:9>"}}, 2), new String[][]{{"clone", "", "5"}, {"getPathIterator", "java.awt.geom.AffineTransform", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.RectIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"", "<sample:9>", "<sample:7>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:4>"}}), new String[][]{{"getMax", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<null>", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "a,b,c", "<sample:2>", "<sample:3>", "<sample:9>", "<sample:10>", "<null>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "1.033"}, {"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:0>", "<sample:3>", "<sample:10>", "<sample:8>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=1.033, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#-2067972125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:1>", "<sample:3>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:4>", "NaN", "<sample:7>", "<sample:1>", "<sample:6>", "<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:7>", "1.5707963267948966", "<sample:0>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:7>", "-7.7192895045732987E18", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2129797605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:3>", "<sample:0>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:4>", "3.9739999999999998", "<sample:3>", "<sample:0>", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "notifyListeners", "org.jfree.chart.event.AxisChangeEvent", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-1.0"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#-158961059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>", "<sample:5>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:8>", "<sample:4>", "<sample:0>", "<sample:1>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isAxisLineVisible", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1671627939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"3.0", "<sample:6>", "<sample:5>", "<sample:6>", "<sample:7>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"brighter", "", "5"}, {"getRGBComponents", "float[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelURL", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:3>", "<null>", "<sample:7>", "<sample:4>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "1.987", "<sample:8>", "<sample:4>", "<sample:4>", "<null>"}, {"org.jfree.chart.axis.Axis", "hasListener", "java.util.EventListener", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"-1.19"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#400#-853542947", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "01234"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=01234, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#-852777027", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=01234, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#-852777027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#-719918147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"5."}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=5., getLowerMargin=0.05, getMaximumCategoryLabelLines=1...#396#-1345855541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"1.25", "<sample:5>", "<sample:1>", "<sample:6>", "<sample:2>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"nnull", "<sample:7>", "<sample:5>", "<sample:9>", "<sample:7>", "<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"--,1"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=--,1, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1758135614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"srue", "<sample:10>", "<sample:0>", "<sample:8>", "<sample:4>", "<sample:3>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>", "<sample:1>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<null>"}}, 3), new String[][]{{"createOutsetRectangle", "java.awt.geom.Rectangle2D,boolean,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "http://example.com/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=http://example.com/a?b=c, getLowerMargin=0.05, getM...#422#-1383957627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:4>", "<sample:8>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"1.1\t2345678"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=1.1\t2345678, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategor...#409#-2068174229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getRed", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:5>", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"L"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=L, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-2119432893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"canDisplay", "char", "3"}, {"getFamily", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SansSerif", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "51.5d"}}, 1), new String[][]{{"getTickLabelInsets", "", "6"}, {"createInsetRectangle", "java.awt.geom.Rectangle2D,boolean,boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"3.1005926"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:4>", "<null>"}, {"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#408#2024352270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelFont", ""}, {"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=\u00e9, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines=1...#396#-1299994609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "1.1234567"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=1.1234567, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#-803015743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}}, 3), new String[][]{{"getFontName", "java.util.Locale", "1"}, {"getSize2D", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("12.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "clone", ""}, {"org.jfree.chart.axis.Axis", "getLabelPaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "1e10123456789012345678901234567890"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1e10123456789012345678901234567890, getLowerMargin=...#432#853706567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1E-5, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1150546833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"Hello, WorldNull 'font' argument."}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=Hello, WorldNull 'font' argument., getLowerMargin=0.05,...#427#-1906087851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkOutsideLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelToolTip", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"n1L"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "notifyListeners", "org.jfree.chart.event.AxisChangeEvent", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=n1L, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#1904793030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:4>", "-0.5", "<null>", "<null>", "<sample:6>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRGBColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.5019608, 0.5019608, 0.5019608]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"eello, World"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=eello, World, getLowerMargin=0.05, getMaximumCatego...#410#940517980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "3.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=3.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-393324223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:0>", "-1.0", "<sample:5>", "<sample:1>", "<sample:8>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "refreshTicks", "java.awt.Graphics2D,org.jfree.chart.axis.AxisState,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:5>", "<null>", "<sample:7>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=Title, getLabelAngle=0.0, getLabelToolTip= , getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLin...#400#98577136", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#401#-992820475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getPlot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isAxisLineVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"Null 'insets' argun"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argun, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#-1430393859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false), new String[][]{{"createOutsetRectangle", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2129797605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=a b, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1199988660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:1>", "<sample:2>", "<sample:8>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"s--1", "<sample:5>", "<sample:3>", "<sample:0>", "<sample:8>", "<sample:3>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>", "<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}}), new String[][]{{"calculateLeftInset", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"0.5000000000000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.5000000000000001, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#-1916553468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-1.19"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#404#-314293854", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=I, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1839942362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"1.38"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#445769306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"1.0"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#1079137402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=Infinity, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1284954838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"2r0", "<null>", "<sample:3>", "<sample:7>", "<sample:8>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDashArray", "", "4"}, {"getLineWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<null>", "<sample:6>", "<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=-1.7976931348623157E308, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getM...#423#1124644368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=-1.7976931348623157E308, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getM...#422#2024737433", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"0.1234567890123456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=0.1234567890123456, getLabelURL=null, getLowerMargin=0.05, getMaximum...#416#1543868239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"s--1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=s--1, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#924309517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#-465536045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"0x1234567891.5e300"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "6.0"}, {"org.jfree.chart.axis.Axis", "getTickMarkPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=6.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=0x1234567891.5e300, getLabelURL=null, getLowerMargin=0.05, getMaximumCat...#413#-468469649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"-3.6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-3.6, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#-477872408", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines=1,...#396#1032564845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "notifyListeners", "org.jfree.chart.event.AxisChangeEvent", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=1.9999999999999998, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#1548023034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "1.1234567890123456010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=1.1234567890123456010, getLabelURL=null, getLowerMargin=0.05, getMaxi...#419#-1368185861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelURL", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "eello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=eello, World, getLowerMargin=0.05, getMaximumCategoryL...#407#-1720143053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}}), new String[][]{{"getStyle", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getLabelFont", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getLabelPaint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "Null 'stIate' argument.\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=Null 'stIate' argument.\t, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getM...#422#-418002234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#401#-992820475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:6>", "7719289504573298271", "<sample:0>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#399#1913771620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", ">"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=>, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines=1,...#395#-72380360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"4.0"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#636732321", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"", "<sample:2>", "<sample:7>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.AxisState", actual.getClass().getName());
  assertEquals("{getCursor=Infinity, getMax=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2129797605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"2.0"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1674299482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkInsideLength", new String[]{"float"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#135739149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#1028376404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=4.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1283699104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "0.9999999999999999"}, {"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.9999999999999999, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#-1461491744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:3>", "0.0", "<sample:4>", "<sample:4>", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#397#-1593431188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelToolTip", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkOutsideLength", ""}}), new String[][]{{"getRGB", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"-Infinity"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:10>", "1.5", "<sample:8>", "<sample:0>", "<sample:8>", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-Infinity, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLab...#405#1734748030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"tue"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:6>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=tue, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1880509937", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines=1,...#395#1951371874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1.5, getLowerMargin=0.05, getMaximumCategoryLabelLines=...#397#-2123978836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"3.974"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=3.974, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#-1472522021", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "0x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0x123456789, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategor...#409#342794616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelAngle", ""}, {"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#399#-632901125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLinePaint", ""}}), new String[][]{{"getDashArray", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "getTickMarkPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"3.8596448E18"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#411#1644521879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkOutsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#398#-2120311730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelFont", ""}, {"org.jfree.chart.axis.Axis", "getLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "1.7976931348623157E308", "<sample:7>", "<sample:3>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#514594775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1225921614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#-992354434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:2>", "NaN", "<sample:4>", "<sample:8>", "<sample:4>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}, {"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-1.7976931348623157E308, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaxim...#418#-840308142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}), new String[][]{{"getTickLabelPaint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1225921614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkOutsideLength", ""}}), new String[][]{{"getColorSpace", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}, {"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:4>", "<sample:2>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "Null 'fo t' argument.", "<sample:1>", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:1>"}}), new String[][]{{"getRGBColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<null>", "-3.974", "<sample:6>", "<null>"}}), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "1.12345671.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=1.12345671.12345678, getLabelURL=null, getLowerMargin=0.05, getMaximumCa...#414#-2136378752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#404#-770700865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "refreshTicks", "java.awt.Graphics2D,org.jfree.chart.axis.AxisState,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:2>", "<sample:5>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#401#-992820475", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#401#-992820475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-2.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#68380168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "isVisible", ""}}), new String[][]{{"extendHeight", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=-0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLin...#400#1857820450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1.12345678, getLowerMargin=0.05, getMaximumCategory...#408#58363914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "refreshTicks", "java.awt.Graphics2D,org.jfree.chart.axis.AxisState,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:6>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getLowerMargin", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "equals", "java.lang.Object", "<s:aPx>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL={\"a\":1}, getLowerMargin=0.05, getMaximumCategoryLab...#405#-1717114561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}}), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "3.0"}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "-3.4000000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=3.0, getLabel=null, getLabelAngle=-3.4000000000000004, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaxim...#418#662955499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}}), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.RectIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"5.I"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=5.I, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#508459821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "2020-/2-30T25:61:61", "<null>", "<sample:6>", "<sample:6>", "<sample:5>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=0, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-702731763", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:8>"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "PT1,"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=PT1,, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-359920196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:9>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkOutsideLength", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "T,TLE123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=T,TLE123456789012345678901234567890, getLowerMargin...#433#1463834999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<null>", "<sample:3>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "getPlot", ""}}), new String[][]{{"intersectsLine", "java.awt.geom.Line2D", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"--10x123456789"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "1.5707963267948966SansSerif", "<sample:5>", "<sample:6>", "<sample:0>", "<sample:1>", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=--10x123456789, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCate...#412#-412959079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "refreshTicks", "java.awt.Graphics2D,org.jfree.chart.axis.AxisState,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:0>", "<sample:5>", "<sample:5>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "2146483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2146483648, getLabelURL=null, getLowerMargin=0.05, getMaximumCategory...#408#1606098207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#412#1987247698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "1.5c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1.5c, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1619147904", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{" "}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel= , getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-791377941", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "0F0.0"}}), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isAxisLineVisible", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"SansSeri"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=SansSeri, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLa...#406#-1672962823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "\n12345\u00e9789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=\n12345\u00e9789012345678901234567890, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.0...#429#723262297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "0x1235567891.5e3001E-5"}, {"org.jfree.chart.axis.Axis", "setAxisLinePaint", "java.awt.Paint", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=0x1235567891.5e3001E-5, getLabelURL=null, getLowerMargin=0.05, getMax...#420#1721697621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}, {"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "12:30:45Titlenull"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=12:30:45Titlenull, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumC...#416#1171963690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "-49.4292036732051"}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-49.4292036732051, getLabel=null, getLabelAngle=Infinity, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMa...#421#1125749178", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1225921614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-674796085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "I,:"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=I,:, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-651946974", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelToolTip", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:7>", "<sample:6>", "<null>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "addChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "0.65"}, {"org.jfree.chart.axis.Axis", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#399#-1072583428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", " "}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel= , getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-791377941", SearchInputFactory_scaffolding.receiverState());
 }
}
