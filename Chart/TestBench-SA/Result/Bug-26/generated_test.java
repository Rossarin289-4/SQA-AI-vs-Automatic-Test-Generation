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
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a xb"}, {"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"Ec"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Ec, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLin...#400#-305269747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".5", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:1>", "-1.7976931348623157E308", "<sample:4>", "<sample:7>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "PT1H"}, {"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=PT1H, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1988364328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelInsets", ""}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=1.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#547596419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "i", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:7>", "<null>", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "7.7192896E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#409#-712032601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"a\0377619"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "getTickMarkPaint", ""}, {"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=a\0377619, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#1815124866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarksVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelAngle", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:0>", "-1.7976931348623157E308", "<sample:7>", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "hasListener", "java.util.EventListener", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"brighter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=3,g=3,b=3] {getAlpha=255, getBlue=3, getGreen=3, getRGB=-16579837, getRed=3, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "1.1234567", "<sample:5>", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:2>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "1.25"}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "setAxisLineStroke", "java.awt.Stroke", "<null>"}}, 3), new String[][]{{"canDisplay", "int", "6"}, {"getBaselineFor", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1.25, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1540499115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:5>", "5.94", "<null>", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<null>"}, {"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "", "<sample:7>", "<sample:7>", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelPaint", "java.awt.Paint", "<sample:0>"}}), new String[][]{{"getCategoryLabelPositionOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}, {"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<null>", "1.7976931348623157E308", "<sample:5>", "<sample:5>", "<sample:5>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "1"}, {"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "<null>", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:7>", "Infinity", "<sample:6>", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 9, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "-8.988465674311586E307", "<sample:10>", "<sample:1>", "<sample:4>", "<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}, {"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:2>", "<sample:3>", "<sample:4>", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.axis.Axis", "setTickMarksVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "2.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=2.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#401#1452384775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#408#-2102082551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#412#-1457544496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#409#1447711207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}}, 2), new String[][]{{"getRGBComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "getLabel", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}, {"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}, {"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<null>", "1", "<sample:5>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=2020-01-01, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategory...#408#1176855705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"20"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=20, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLin...#400#-558850661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"2\n"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=2\n, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLin...#400#1651180661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=2, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1838234883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}, {"org.jfree.chart.axis.Axis", "isAxisLineVisible", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"+1", "<sample:5>", "<sample:3>", "<sample:4>", "<sample:6>", "<sample:6>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"calculateTopOutset", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"calculateTopOutset", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"calculateTopOutset", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "-1.0", "<sample:7>", "<sample:6>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:2>", "-1.0", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:2>", "-1.0", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:2>", "-1.0", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.0, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#1959905947", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.00"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.00, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#451597647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.000"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.000, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#938680603", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.000i"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.000i, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#2137997558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2000i"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2000i, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#1016113092", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#113819403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:2>", "NaN", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLinePaint", "java.awt.Paint", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"4.042000000000001"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=4.042000000000001, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximum...#416#2127689089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"4.042000000000001"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=4.042000000000001, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCat...#413#709968152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"40.420000000000016"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=40.420000000000016, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCa...#414#975451106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=1.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-44894118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}, {"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}, {"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"getComponents", "float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:2>", "<null>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "43.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=43.2, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#473879603", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "86.4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=86.4, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#666426322", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelURL", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1e10, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-3264625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "1.7976931348623157E308", "<sample:6>", "<sample:3>", "<null>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1e10, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#589225912", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1Xe"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getPlot", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "1.7976931348623157E308", "<sample:6>", "<sample:3>", "<null>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1Xe, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1573688840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1Xe"}, false, 12, new String[][]{{"org.jfree.chart.axis.Axis", "getPlot", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "1.7976931348623157E308", "<sample:6>", "<sample:3>", "<null>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1Xe, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1593787201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1Xeabc"}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getPlot", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "1.7976931348623157E308", "<sample:6>", "<sample:3>", "<null>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1Xeabc, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1432087554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLineVisible", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#942460142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>", "3.0", "<sample:4>", "<sample:4>", "<sample:3>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:5>", "3.0", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:2>"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-1.7976931348623157E308, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getM...#422#1101292377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategory...#408#255849921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=1.7976931348623157E308, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMa...#421#407078694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1225921614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:0>", "<null>", "<sample:3>", "<sample:0>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=Infinity, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryL...#407#1225921614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawAxisLine", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:3>", "0.0", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "a,b,c"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "Infinity", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:3>"}, {"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a b"}, {"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=a b, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1199988660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a b"}, {"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=a b, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#-1199988660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a xb"}, {"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=a xb, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1802899810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a xb"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "11.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=11.25, getLabelAngle=0.0, getLabelToolTip=a xb, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#-331649062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a xb"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "11.251.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=11.251.12345678, getLabelAngle=0.0, getLabelToolTip=a xb, getLabelURL=null, getLowerMargin=0.05, getMaximumCat...#413#-1900710661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "a x}b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=a x}b, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#1711031185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#412#-1457544496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#409#1447711207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#408#-2102082551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLinePaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.chart.axis.Axis", "isTickLabelsVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2129797605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkInsideLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isVisible", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<null>", "3.0", "<sample:1>", "<sample:6>", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=2020-01-01, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategory...#408#1176855705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#177715490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#-465536045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelFont", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getFamily", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SansSerif", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "getPlot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2129797605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "getPlot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#942460142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "+1", "<sample:2>", "<sample:3>", "<sample:4>", "<sample:0>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:3>", "<sample:7>", "<sample:6>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "drawLabel", new String[]{"java.lang.String", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"+1", "<sample:2>", "<sample:3>", "<sample:4>", "<sample:6>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "3.0", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelAngle", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickLabelsVisible", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"calculateTopOutset", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "configure", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "getFixedDimension", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.0, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#1959905947", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"2.00"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}, {"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=2.00, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#451597647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{".200"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=.200, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1940565305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{".200"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=.200, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#1761911454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{".201"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:3>", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=.201, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1194563587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0] {getCenterX=0.0, getCenterY=0.0, getHeight=0.0, getMaxX=0.0, getMaxY=0.0, getMinX=0.0, getMinY=0.0, getWidth=0.0, getX=0.0, getY=0.0, isEmpty=...#205#-1521548141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"4.0"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=4.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#1283699104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"-4.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=-4.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#1163316629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "removeChangeListener", new String[]{"org.jfree.chart.event.AxisChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=-1.5, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1525460216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<null>"}, {"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"1.5707963267948966"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=1.5707963267948966, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#-1594004257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"-3.9292036732051034"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=-3.9292036732051034, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaxim...#418#1924826228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelAngle", new String[]{"double"}, new String[]{"-3.9292036732051034"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "setPlot", "org.jfree.chart.plot.Plot", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=-3.9292036732051034, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCa...#414#2104891117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "notifyListeners", new String[]{"org.jfree.chart.event.AxisChangeEvent"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".5", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".5", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelToolTip", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".5", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}), new String[][]{{"getComponents", "float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", ".T5", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:1>"}, {"org.jfree.chart.axis.Axis", "getLabel", ""}, {"org.jfree.chart.axis.Axis", "getLabelEnclosure", "java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "<sample:1>"}}), new String[][]{{"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "refreshTicks", new String[]{"java.awt.Graphics2D", "org.jfree.chart.axis.AxisState", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:2>", "<sample:1>", "<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=1.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1883451197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "5.800000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=5.800000000000001, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximum...#416#-1223621930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "48.8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=48.8, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#1096810888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "488.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=488.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabe...#404#1942081696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "notifyListeners", "org.jfree.chart.event.AxisChangeEvent", "<null>"}, {"org.jfree.chart.axis.Axis", "getLabel", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0] {getBottom=2.0, getLeft=4.0, getRight=4.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelURL", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "hasListener", "java.util.EventListener", "<sample:2>"}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=1e10, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-3264625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkOutsideLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkOutsideLength", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickMarkOutsideLength", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.axis.CategoryAxis", actual.getClass().getName());
  assertEquals("{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "removeChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabel", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setAxisLinePaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.axis.Axis", "setTickLabelPaint", "java.awt.Paint", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getRed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getRed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "1.5707963267948966"}, {"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#405#886367352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "1.5707963267948966"}, {"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#406#194910225", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLineVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:3>"}, {"org.jfree.chart.axis.Axis", "setTickMarkInsideLength", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-456751388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "reserveSpace", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.Plot", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.axis.AxisSpace"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}, {"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:9>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setAxisLinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelInsets", ""}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=1.0000000000000002, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#1519204063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getFixedDimension", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabel", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getFixedDimension", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=[1,2], getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#-450479508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelURL", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=12:30:45, getLowerMargin=0.05, getMaximumCategoryLa...#406#2078013894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "draw", new String[]{"java.awt.Graphics2D", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.util.RectangleEdge", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "<sample:3>", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getPlot", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "addChangeListener", "org.jfree.chart.event.AxisChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#403#1447774813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getPlot", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "Infinity"}, {"org.jfree.chart.axis.Axis", "getLabelURL", ""}, {"org.jfree.chart.axis.Axis", "getTickMarkStroke", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#407#-610006218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelFont", "java.awt.Font", "<sample:1>"}}, 1), new String[][]{{"getTransform", "", "6"}, {"preConcatenate", "java.awt.geom.AffineTransform", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.AffineTransform", actual.getClass().getName());
  assertEquals("AffineTransform[[1.0, 0.0, 0.0], [0.0, 1.0, 0.0]] {getDeterminant=1.0, getScaleX=1.0, getScaleY=1.0, getShearX=0.0, getShearY=0.0, getTranslateX=0.0, getTranslateY=0.0, getType=0, isIdentity=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:7>"}}), new String[][]{{"getDashPhase", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:7>"}}), new String[][]{{"getDashPhase", "", "1"}, {"getMiterLimit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:7>"}}), new String[][]{{"getDashPhase", "", "1"}, {"getMiterLimit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Hello, World, getLabelURL=null, getLowerMargin=0.05, getMaximumCatego...#410#914897151", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"Hello' World"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:0>"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Hello' World, getLabelURL=null, getLowerMargin=0.05, getMaximumCatego...#410#-1665651100", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelToolTip", new String[]{"java.lang.String"}, new String[]{"Hello' Worl"}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelInsets", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Hello' Worl, getLabelURL=null, getLowerMargin=0.05, getMaximumCategor...#409#200584114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelURL", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLinePaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "isTickMarksVisible", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelFont", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelToolTip", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "getLabel", ""}}, 3), new String[][]{{"getRGBColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.5019608, 0.5019608, 0.5019608]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=1.0, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "2.0", "<sample:4>", "<sample:2>", "<sample:3>", "<sample:3>"}, {"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}}), new String[][]{{"getDashArray", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "2.0", "<sample:4>", "<sample:2>", "<sample:3>", "<sample:3>"}, {"org.jfree.chart.axis.Axis", "getAxisLineStroke", ""}}), new String[][]{{"getLineWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3), new String[][]{{"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3), new String[][]{{"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getAxisLineStroke", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3), new String[][]{{"getLineWidth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setFixedDimension", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-1.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#932090736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "draw", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "3.0", "<sample:6>", "<null>", "<null>", "<sample:4>"}}, 2), new String[][]{{"darker", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelFont", "java.awt.Font", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "[1,2]", "<sample:4>", "<sample:2>", "<sample:6>", "<sample:7>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:T21 l?>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "0.0"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#177715490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:T21 l?>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-0.0"}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#-465536045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:T11 l?>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setTickMarkOutsideLength", "float", "-0.0"}, {"org.jfree.chart.axis.Axis", "getPlot", ""}, {"org.jfree.chart.axis.Axis", "getTickLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#-1652873508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setPlot", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "reserveSpace", "java.awt.Graphics2D,org.jfree.chart.plot.Plot,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisSpace", "<sample:7>", "<sample:4>", "<sample:6>", "<sample:6>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickLabelsVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.axis.Axis", "drawLabel", "java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo", "i", "<sample:6>", "<sample:6>", "<sample:7>", "<sample:2>", "<sample:2>", "<sample:5>"}, {"org.jfree.chart.axis.Axis", "setLabel", "java.lang.String", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=123456789012345678901234567890, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05...#429#-106418847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "1.5707963267948966"}}), new String[][]{{"getUnitType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.UnitType", actual.getClass().getName());
  assertEquals("UnitType.ABSOLUTE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=1.5707963267948966, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#-1594004257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelInsets", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.axis.Axis", "getTickLabelInsets", ""}, {"org.jfree.chart.axis.Axis", "setLabelAngle", "double", "1.5707963267948966"}}), new String[][]{{"getUnitType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.UnitType", actual.getClass().getName());
  assertEquals("UnitType.ABSOLUTE", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=1.5707963267948966, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCat...#413#767108934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelInsets", new String[]{}, new String[]{}, false), new String[][]{{"calculateLeftOutset", "double", "6"}, {"createAdjustedRectangle", "java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines...#398#1726477469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "isTickMarksVisible", ""}}), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "010"}}, 1), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=010, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLi...#401#1988930272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=010, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLines=...#397#1388319559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "Null 'insets' argument."}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argument., getLabelURL=null, getLowerMargin=0.05, getMa...#421#1300110747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "Null 'insets' argument."}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argument., getLabelURL=null, getLowerMargin=0.05, getMaximu...#417#1199066242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "Null 'insets' argument."}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argument., getLabelURL=null, getLowerMargin=0.05, getMaxim...#418#-159287196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "Null 'insets' argument."}}, 1), new String[][]{{"getBlue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argument., getLabelURL=null, getLowerMargin=0.05, getMaxim...#418#-159287196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getTickLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.axis.Axis", "setVisible", "boolean", "true"}, {"org.jfree.chart.axis.Axis", "setLabelToolTip", "java.lang.String", "Null 'insets' argument."}}, 1), new String[][]{{"getBlue", "", "1"}, {"getTransparency", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=Null 'insets' argument., getLabelURL=null, getLowerMargin=0.05, getMa...#421#1300110747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-1.0"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#1028376404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-0.5"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#2112066200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setTickMarkOutsideLength", new String[]{"float"}, new String[]{"-0.1"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "getTickMarkInsideLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#49984404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "configure", ""}}), new String[][]{{"getCenterY", "", "6"}, {"getBounds", "", "3"}, {"getY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelEnclosure", new String[]{"java.awt.Graphics2D", "org.jfree.chart.util.RectangleEdge"}, new String[]{"<sample:9>", "<sample:7>"}, false, 4, new String[][]{{"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}, {"org.jfree.chart.axis.Axis", "configure", ""}}), new String[][]{{"getCenterY", "", "6"}, {"getBounds", "", "3"}, {"getY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#399#-1721917445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setFixedDimension", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=-1.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabel...#403#932090736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "setLabelInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jfree.chart.axis.Axis", "drawAxisLine", "java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge", "<sample:1>", "NaN", "<sample:3>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#402#-1129426908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=0, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelLine...#400#-1170254348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.axis.Axis", "org.jfree.chart.axis.CategoryAxis", "getLabelAngle", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.axis.Axis", "getAxisLinePaint", ""}, {"org.jfree.chart.axis.Axis", "getLabelPaint", ""}, {"org.jfree.chart.axis.Axis", "setTickLabelsVisible", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryLabelPositionOffset=4, getCategoryMargin=0.2, getFixedDimension=0.0, getLabel=null, getLabelAngle=0.0, getLabelToolTip=null, getLabelURL=null, getLowerMargin=0.05, getMaximumCategoryLabelL...#403#17083115", SearchInputFactory_scaffolding.receiverState());
 }
}
